package com.iab.omid.library.adcolony.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.adcolony.publisher.a */
public class C4128a extends AdSessionStatePublisher {
    public C4128a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo32191a(webView);
    }
}
