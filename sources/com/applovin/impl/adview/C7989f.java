package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p255d.C8389b;

/* renamed from: com.applovin.impl.adview.f */
class C7989f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f19304a;

    /* renamed from: b */
    private final WebViewRenderProcessClient f19305b = new WebViewRenderProcessClient() {
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof C7981d) {
                C8350e currentAd = ((C7981d) webView).getCurrentAd();
                C7989f.this.f19304a.mo57365af().mo57125a(currentAd).mo57126a(C8389b.f21039C).mo57128a();
                C7989f.this.f19304a.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D = C7989f.this.f19304a.mo57320D();
                    D.mo57822e("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    };

    C7989f(C8490n nVar) {
        this.f19304a = nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public WebViewRenderProcessClient mo55732a() {
        return this.f19305b;
    }
}
