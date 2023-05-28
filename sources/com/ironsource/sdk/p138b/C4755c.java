package com.ironsource.sdk.p138b;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.sdk.p139c.C4768e;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.sdk.b.c */
public class C4755c extends WebViewClient {

    /* renamed from: b */
    private static final String f12078b = C4755c.class.getSimpleName();

    /* renamed from: a */
    private final C4768e.C4769a f12079a;

    public C4755c(C4768e.C4769a aVar) {
        this.f12079a = aVar;
    }

    /* renamed from: a */
    private static String m13944a(String str, String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        try {
            this.f12079a.mo34273a(m13944a("onReceivedError", String.valueOf(i)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f12079a.mo34273a(m13944a("onReceivedErrorM", String.valueOf(webResourceError.getErrorCode())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str = "";
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                str = String.valueOf(webResourceResponse.getStatusCode());
            }
            this.f12079a.mo34273a(m13944a("onReceivedHttpError", str));
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            String str = f12078b;
            Logger.m14505e(str, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            this.f12079a.mo34274b(renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
