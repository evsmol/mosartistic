package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.appodeal.ads.AppodealNetworks;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.adview.u */
public class C8025u extends WebViewClient {

    /* renamed from: a */
    private final C8626v f19383a;

    /* renamed from: b */
    private WeakReference<C8026a> f19384b;

    /* renamed from: com.applovin.impl.adview.u$a */
    public interface C8026a {
        /* renamed from: a */
        void mo55621a(C8024t tVar);

        /* renamed from: b */
        void mo55622b(C8024t tVar);

        /* renamed from: c */
        void mo55623c(C8024t tVar);
    }

    public C8025u(C8490n nVar) {
        this.f19383a = nVar.mo57320D();
    }

    /* renamed from: a */
    private void m23821a(WebView webView, String str) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f19383a;
            vVar.mo57820c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof C8024t)) {
            C8024t tVar = (C8024t) webView;
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            C8026a aVar = (C8026a) this.f19384b.get();
            if (AppodealNetworks.APPLOVIN.equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
                if ("/track_click".equals(path)) {
                    aVar.mo55621a(tVar);
                } else if ("/close_ad".equals(path)) {
                    aVar.mo55622b(tVar);
                } else if ("/skip_ad".equals(path)) {
                    aVar.mo55623c(tVar);
                } else {
                    if (C8626v.m26252a()) {
                        C8626v vVar2 = this.f19383a;
                        vVar2.mo57821d("WebViewButtonClient", "Unknown URL: " + str);
                    }
                    if (C8626v.m26252a()) {
                        C8626v vVar3 = this.f19383a;
                        vVar3.mo57821d("WebViewButtonClient", "Path: " + path);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo55801a(WeakReference<C8026a> weakReference) {
        this.f19384b = weakReference;
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        m23821a(webView, str);
        return true;
    }
}
