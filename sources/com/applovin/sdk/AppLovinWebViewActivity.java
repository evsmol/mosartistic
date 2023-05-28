package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.appodeal.ads.AppodealNetworks;
import java.util.Set;

public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";

    /* renamed from: a */
    private String f21943a;

    /* renamed from: b */
    private WebView f21944b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public EventListener f21945c;

    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f21945c = eventListener;
        WebView webView = this.f21944b;
        if (webView == null) {
            this.f21943a = str;
        } else {
            webView.loadUrl(str);
        }
    }

    public void onBackPressed() {
        EventListener eventListener = this.f21945c;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            C8626v.m26258i("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        final C8490n nVar = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).coreSdk;
        WebView tryToCreateWebView = Utils.tryToCreateWebView(this, "WebView Activity");
        this.f21944b = tryToCreateWebView;
        if (tryToCreateWebView == null) {
            finish();
            return;
        }
        setContentView(tryToCreateWebView);
        WebSettings settings = this.f21944b.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f21944b.setVerticalScrollBarEnabled(true);
        this.f21944b.setHorizontalScrollBarEnabled(true);
        this.f21944b.setScrollBarStyle(33554432);
        this.f21944b.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                String path = parse.getPath();
                nVar.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = nVar.mo57320D();
                    D.mo57818b("AppLovinWebViewActivity", "Handling url load: " + str);
                }
                if (!AppodealNetworks.APPLOVIN.equalsIgnoreCase(scheme) || !"com.applovin.sdk".equalsIgnoreCase(host) || AppLovinWebViewActivity.this.f21945c == null) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                if (!path.endsWith("webview_event")) {
                    return true;
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
                if (StringUtils.isValidString(str2)) {
                    String queryParameter = parse.getQueryParameter(str2);
                    nVar.mo57320D();
                    if (C8626v.m26252a()) {
                        C8626v D2 = nVar.mo57320D();
                        D2.mo57818b("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
                    }
                    AppLovinWebViewActivity.this.f21945c.onReceivedEvent(queryParameter);
                    return true;
                }
                nVar.mo57320D();
                if (!C8626v.m26252a()) {
                    return true;
                }
                nVar.mo57320D().mo57822e("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                return true;
            }
        });
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        if (StringUtils.isValidString(this.f21943a)) {
            this.f21944b.loadUrl(this.f21943a);
        }
    }
}
