package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;

/* renamed from: com.applovin.impl.adview.t */
public class C8024t extends C7992h {
    public C8024t(C8025u uVar, Context context) {
        super(context);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(uVar);
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }

    /* renamed from: a */
    public void mo55800a(String str) {
        loadDataWithBaseURL("/", str, "text/html", (String) null, "");
    }
}
