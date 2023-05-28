package com.bytedance.sdk.openadsdk.core.widget.p036a;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C10638l;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.a.b */
/* compiled from: SSWebSettings */
public class C0728b {

    /* renamed from: a */
    private WeakReference<Context> f2805a;

    /* renamed from: b */
    private boolean f2806b = true;

    /* renamed from: c */
    private boolean f2807c = true;

    /* renamed from: d */
    private boolean f2808d = true;

    /* renamed from: e */
    private boolean f2809e = true;

    /* renamed from: f */
    private boolean f2810f = false;

    /* renamed from: g */
    private boolean f2811g = true;

    /* renamed from: h */
    private boolean f2812h = true;

    /* renamed from: a */
    public static C0728b m3733a(Context context) {
        return new C0728b(context);
    }

    private C0728b(Context context) {
        this.f2805a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public C0728b mo2470a(boolean z) {
        this.f2812h = z;
        return this;
    }

    /* renamed from: b */
    public C0728b mo2472b(boolean z) {
        this.f2807c = z;
        return this;
    }

    /* renamed from: a */
    public void mo2471a(WebView webView) {
        if (webView != null && this.f2805a.get() != null) {
            m3735b(webView);
            WebSettings settings = webView.getSettings();
            m3734a(settings);
            if (settings != null) {
                try {
                    settings.setJavaScriptEnabled(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    if (this.f2807c) {
                        settings.setSupportZoom(true);
                        settings.setBuiltInZoomControls(true);
                    } else {
                        settings.setSupportZoom(false);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(this.f2808d);
                settings.setDomStorageEnabled(this.f2809e);
                settings.setAllowFileAccess(this.f2810f);
                settings.setBlockNetworkImage(true ^ this.f2811g);
                settings.setSavePassword(false);
                try {
                    if (Build.VERSION.SDK_INT >= 11 && !this.f2812h) {
                        webView.setLayerType(0, (Paint) null);
                    } else if (Build.VERSION.SDK_INT >= 16 && this.f2812h) {
                        webView.setLayerType(2, (Paint) null);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    private void m3735b(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            C10638l.m31234b(th.toString());
        }
    }

    /* renamed from: a */
    private void m3734a(WebSettings webSettings) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                webSettings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            C10638l.m31234b(th.toString());
        }
    }
}
