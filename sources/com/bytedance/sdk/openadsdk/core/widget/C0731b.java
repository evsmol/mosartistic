package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0620q;
import com.bytedance.sdk.openadsdk.utils.C1002v;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.b */
/* compiled from: PrivacyProtectDialog */
public class C0731b extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f2825a;

    /* renamed from: b */
    private String f2826b;

    /* renamed from: c */
    private String f2827c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0736c f2828d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C0735b f2829e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public RelativeLayout f2830f;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.b$b */
    /* compiled from: PrivacyProtectDialog */
    public interface C0735b {
        /* renamed from: a */
        void mo150a();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.b$c */
    /* compiled from: PrivacyProtectDialog */
    public interface C0736c {
        /* renamed from: a */
        void mo149a();
    }

    public C0731b(Context context) {
        super(context, C10647t.m31285g(context, "tt_privacy_dialogTheme"));
        this.f2825a = context;
    }

    /* renamed from: a */
    public C0731b mo2480a(String str, C0736c cVar) {
        this.f2826b = str;
        this.f2828d = cVar;
        return this;
    }

    /* renamed from: a */
    public C0731b mo2479a(String str, C0735b bVar) {
        this.f2827c = str;
        this.f2829e = bVar;
        return this;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m3743a();
        m3746b();
    }

    /* renamed from: a */
    private void m3743a() {
        View inflate = LayoutInflater.from(this.f2825a).inflate(C10647t.m31284f(this.f2825a, "tt_privacy_dialog"), (ViewGroup) null);
        setContentView(inflate);
        final TTCornersWebView tTCornersWebView = (TTCornersWebView) inflate.findViewById(C10647t.m31283e(this.f2825a, "tt_privacy_webview"));
        Button button = (Button) inflate.findViewById(C10647t.m31283e(this.f2825a, "tt_privacy_accept_btn"));
        TextView textView = (TextView) inflate.findViewById(C10647t.m31283e(this.f2825a, "tt_privacy_reject_btn"));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C10647t.m31283e(this.f2825a, "tt_privacy_back_layout"));
        this.f2830f = relativeLayout;
        C1002v.m4716a((View) relativeLayout, 8);
        textView.getPaint().setFlags(8);
        m3744a(tTCornersWebView);
        if (!TextUtils.isEmpty(this.f2826b) && !TextUtils.isEmpty(this.f2827c)) {
            button.setText(this.f2826b);
            textView.setText(this.f2827c);
        }
        button.setOnClickListener(new C0734a());
        textView.setOnClickListener(new C0734a());
        this.f2830f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTCornersWebView tTCornersWebView = tTCornersWebView;
                if (tTCornersWebView != null && tTCornersWebView.canGoBack()) {
                    tTCornersWebView.goBack();
                    if (!tTCornersWebView.canGoBack()) {
                        C1002v.m4716a((View) C0731b.this.f2830f, 8);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m3744a(final TTCornersWebView tTCornersWebView) {
        String t = C0558m.m2673h().mo1719t();
        if (t != null) {
            try {
                tTCornersWebView.getSettings().setJavaScriptEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                tTCornersWebView.getSettings().setMixedContentMode(0);
            }
            try {
                WebSettings settings = tTCornersWebView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(true);
                settings.setDomStorageEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setBlockNetworkImage(false);
                settings.setSavePassword(false);
                tTCornersWebView.setLayerType(1, (Paint) null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            C0620q.m3008a(tTCornersWebView);
            tTCornersWebView.setWebViewClient(new SSWebView.C10655a() {
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    if (webView == null || webResourceRequest == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        webView.loadUrl(webResourceRequest.getUrl().toString());
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.toString());
                    return true;
                }

                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    TTCornersWebView tTCornersWebView = tTCornersWebView;
                    if (tTCornersWebView != null && tTCornersWebView.canGoBack()) {
                        C1002v.m4716a((View) C0731b.this.f2830f, 0);
                    }
                }
            });
            tTCornersWebView.loadUrl(t);
        }
    }

    /* renamed from: b */
    private void m3746b() {
        WindowManager.LayoutParams attributes;
        setCancelable(false);
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.dimAmount = 0.5f;
            attributes.width = (int) (((double) this.f2825a.getResources().getDisplayMetrics().widthPixels) * 0.8d);
            window.setAttributes(attributes);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.b$a */
    /* compiled from: PrivacyProtectDialog */
    private class C0734a implements View.OnClickListener {
        private C0734a() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == C10647t.m31283e(C0731b.this.f2825a, "tt_privacy_accept_btn")) {
                if (C0731b.this.f2828d != null) {
                    C0731b.this.f2828d.mo149a();
                }
                C0731b.this.dismiss();
            } else if (id == C10647t.m31283e(C0731b.this.f2825a, "tt_privacy_reject_btn")) {
                if (C0731b.this.f2829e != null) {
                    C0731b.this.f2829e.mo150a();
                }
                C0731b.this.dismiss();
            }
        }
    }
}
