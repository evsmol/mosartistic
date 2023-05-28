package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10622b;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C0213e;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0620q;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import java.util.HashMap;

public class TTWebsiteActivity extends Activity {

    /* renamed from: a */
    private String f369a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0213e f370b;

    /* renamed from: a */
    public static void m414a(Context context, C0477n nVar, String str) {
        if (context != null) {
            C0136e.m619b(context, nVar, str, "open_policy");
            if (!TextUtils.isEmpty(C0558m.m2673h().mo1718s())) {
                String jSONObject = nVar != null ? nVar.mo1397ar().toString() : "";
                Intent intent = new Intent(context, TTWebsiteActivity.class);
                intent.putExtra("metaString", jSONObject);
                C10622b.m31190a(context, intent, (C10622b.C10623a) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        final String stringExtra = getIntent().getStringExtra("metaString");
        setContentView(C10647t.m31284f(this, "tt_activity_website"));
        final WebView webView = (WebView) findViewById(C10647t.m31283e(this, "tt_ad_website"));
        final ImageView imageView = (ImageView) findViewById(C10647t.m31283e(this, "tt_titlebar_close"));
        final ProgressBar progressBar = (ProgressBar) findViewById(C10647t.m31283e(this, "tt_titlebar_browser_progress"));
        ((ImageView) findViewById(C10647t.m31283e(this, "tt_titlebar_back"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (webView.canGoBack()) {
                    webView.goBack();
                } else {
                    TTWebsiteActivity.this.finish();
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.this.finish();
            }
        });
        imageView.setVisibility(4);
        imageView.setClickable(false);
        ((TextView) findViewById(C10647t.m31283e(this, "tt_titlebar_title"))).setText(C10647t.m31276a(this, "tt_privacy_title"));
        ((ImageView) findViewById(C10647t.m31283e(this, "tt_titlebar_go_to_webview"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                String url = webView.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    intent.setData(Uri.parse(url));
                    C10622b.m31190a(TTWebsiteActivity.this, intent, (C10622b.C10623a) null);
                }
            }
        });
        ((ImageView) findViewById(C10647t.m31283e(this, "tt_titlebar_debug_info"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TTWebsiteActivity.this.f370b == null) {
                    C0213e unused = TTWebsiteActivity.this.f370b = new C0213e(TTWebsiteActivity.this);
                    TTWebsiteActivity.this.f370b.mo547a(stringExtra);
                    TTWebsiteActivity.this.f370b.setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.this.f370b.show();
            }
        });
        if (C0558m.m2673h() != null) {
            this.f369a = C0558m.m2673h().mo1718s();
        }
        C10638l.m31242e("TTWebsiteActivity", "mWebsiteUrl=" + this.f369a);
        if (this.f369a != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                webView.getSettings().setMixedContentMode(0);
            }
            try {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setSavePassword(false);
                webView.getSettings().setAllowFileAccess(false);
            } catch (Throwable unused) {
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
            try {
                webView.loadUrl(this.f369a, hashMap);
            } catch (Throwable unused2) {
                webView.loadUrl(this.f369a);
            }
            webView.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (progressBar != null && !TTWebsiteActivity.this.isFinishing()) {
                        if (i == 100) {
                            progressBar.setVisibility(8);
                            if (webView.canGoBack()) {
                                imageView.setVisibility(0);
                                imageView.setClickable(true);
                                return;
                            }
                            imageView.setVisibility(4);
                            imageView.setClickable(false);
                            return;
                        }
                        progressBar.setVisibility(0);
                        progressBar.setProgress(i);
                    }
                }
            });
            webView.setWebViewClient(new SSWebView.C10655a() {
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    C10638l.m31242e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....view=" + webView + ",request=" + webResourceRequest);
                    if (webView == null || webResourceRequest == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        webView.loadUrl(webResourceRequest.getUrl().toString());
                        C10638l.m31242e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....url1=" + webResourceRequest.getUrl().toString());
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.toString());
                    C10638l.m31242e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....url2=" + webResourceRequest.toString());
                    return true;
                }

                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    C10638l.m31242e("TTWebsiteActivity", "onPageFinished invoke....url=" + str);
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    C10638l.m31242e("TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=" + webResourceResponse);
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    C10638l.m31242e("TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    C10638l.m31242e("TTWebsiteActivity", "onReceivedError invoke....description=" + str + ",failingUrl=" + str2);
                }
            });
            C0620q.m3008a(webView);
            return;
        }
        finish();
    }
}
