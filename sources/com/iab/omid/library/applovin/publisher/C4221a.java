package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.applovin.publisher.a */
public class C4221a extends AdSessionStatePublisher {
    public C4221a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo32599a(webView);
    }
}
