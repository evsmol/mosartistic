package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.graphics.Paint;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.c */
/* compiled from: BrandBannerWebViewPool */
public class C0585c {

    /* renamed from: b */
    private static int f2207b;

    /* renamed from: c */
    private static volatile C0585c f2208c;

    /* renamed from: a */
    private final List<SSWebView> f2209a = new ArrayList();

    /* renamed from: a */
    public static C0585c m2815a() {
        if (f2208c == null) {
            synchronized (C0585c.class) {
                if (f2208c == null) {
                    f2208c = new C0585c();
                }
            }
        }
        return f2208c;
    }

    /* renamed from: b */
    public SSWebView mo1952b() {
        SSWebView remove;
        if (mo1954c() > 0 && (remove = this.f2209a.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    /* renamed from: a */
    public void mo1951a(SSWebView sSWebView) {
        if (sSWebView != null) {
            mo1953b(sSWebView);
        }
    }

    /* renamed from: b */
    public void mo1953b(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.f2209a.size() >= f2207b) {
            sSWebView.mo64324l();
        } else if (!this.f2209a.contains(sSWebView)) {
            mo1955c(sSWebView);
            this.f2209a.add(sSWebView);
        }
    }

    /* renamed from: c */
    public int mo1954c() {
        return this.f2209a.size();
    }

    /* renamed from: c */
    public void mo1955c(SSWebView sSWebView) {
        if (sSWebView != null && sSWebView.getWebView() != null) {
            if (sSWebView.getParent() != null) {
                ((ViewGroup) sSWebView.getParent()).removeView(sSWebView);
            }
            try {
                sSWebView.removeAllViews();
                sSWebView.mo64304c();
                sSWebView.setWebChromeClient((WebChromeClient) null);
                sSWebView.setWebViewClient((WebViewClient) null);
                sSWebView.setDownloadListener((DownloadListener) null);
                sSWebView.setDefaultTextEncodingName("UTF-8");
                sSWebView.setJavaScriptEnabled(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setAppCacheEnabled(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setDatabaseEnabled(true);
                sSWebView.setSupportZoom(false);
                sSWebView.getWebView().setLayerType(0, (Paint) null);
                sSWebView.setBackgroundColor(0);
                sSWebView.getWebView().setHorizontalScrollBarEnabled(false);
                sSWebView.getWebView().setHorizontalScrollbarOverlay(false);
                sSWebView.getWebView().setVerticalScrollBarEnabled(false);
                sSWebView.getWebView().setVerticalScrollbarOverlay(false);
                sSWebView.mo64301a(true);
                sSWebView.mo64322j();
                if (Build.VERSION.SDK_INT >= 21) {
                    sSWebView.setMixedContentMode(0);
                }
            } catch (Exception unused) {
            }
        }
    }
}
