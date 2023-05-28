package com.criteo.publisher.p060b0;

import android.content.ComponentName;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.criteo.publisher.C1321s;

/* renamed from: com.criteo.publisher.b0.a */
/* compiled from: AdWebViewClient */
public class C1053a extends WebViewClient {

    /* renamed from: a */
    private final C1056c f3455a;

    /* renamed from: b */
    private final ComponentName f3456b;

    /* renamed from: c */
    private final C1054b f3457c = C1321s.m5824c().mo3683U0();

    public C1053a(C1056c cVar, ComponentName componentName) {
        this.f3455a = cVar;
        this.f3456b = componentName;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f3457c.mo3069a(str, this.f3456b, this.f3455a);
        return true;
    }
}
