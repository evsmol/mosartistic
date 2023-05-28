package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.ironsrc.publisher.a */
public class C4335a extends AdSessionStatePublisher {
    public C4335a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo32983a(webView);
    }
}
