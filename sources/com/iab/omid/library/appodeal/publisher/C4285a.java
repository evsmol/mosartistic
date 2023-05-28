package com.iab.omid.library.appodeal.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.appodeal.publisher.a */
public class C4285a extends AdSessionStatePublisher {
    public C4285a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo32797a(webView);
    }
}
