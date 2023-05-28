package com.criteo.publisher.p072m0;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.criteo.publisher.C1330x;
import com.criteo.publisher.model.C1276t;
import java.lang.ref.Reference;

/* renamed from: com.criteo.publisher.m0.b */
/* compiled from: CriteoBannerLoadTask */
public class C1215b extends C1330x {

    /* renamed from: c */
    private final Reference<? extends WebView> f3805c;

    /* renamed from: d */
    private final C1276t f3806d;

    /* renamed from: e */
    private final WebViewClient f3807e;

    /* renamed from: f */
    private final String f3808f;

    public C1215b(Reference<? extends WebView> reference, WebViewClient webViewClient, C1276t tVar, String str) {
        this.f3805c = reference;
        this.f3807e = webViewClient;
        this.f3806d = tVar;
        this.f3808f = str;
    }

    /* renamed from: a */
    public void mo3040a() {
        m5447c();
    }

    /* renamed from: c */
    private void m5447c() {
        WebView webView = (WebView) this.f3805c.get();
        if (webView != null) {
            String b = m5446b();
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(this.f3807e);
            webView.loadDataWithBaseURL("", b, "text/html", "UTF-8", "");
        }
    }

    /* renamed from: b */
    private String m5446b() {
        return this.f3806d.mo3594c().replace(this.f3806d.mo3595d(), this.f3808f);
    }
}
