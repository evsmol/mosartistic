package com.iab.omid.library.amazon.publisher;

import android.webkit.WebView;

/* renamed from: com.iab.omid.library.amazon.publisher.a */
public class C4178a extends AdSessionStatePublisher {
    public C4178a(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo32390a(webView);
    }
}
