package com.iab.omid.library.amazon.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.C4152a;
import com.iab.omid.library.amazon.adsession.VerificationScriptResource;
import com.iab.omid.library.amazon.p099b.C4158d;
import com.iab.omid.library.amazon.p099b.C4159e;
import com.iab.omid.library.amazon.p101d.C4169b;
import com.iab.omid.library.amazon.p101d.C4172d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.publisher.b */
public class C4179b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f9978a;

    /* renamed from: b */
    private Long f9979b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f9980c;

    /* renamed from: d */
    private final String f9981d;

    public C4179b(Map<String, VerificationScriptResource> map, String str) {
        this.f9980c = map;
        this.f9981d = str;
    }

    /* renamed from: a */
    public void mo32388a() {
        super.mo32388a();
        mo32412j();
    }

    /* renamed from: a */
    public void mo32394a(C4152a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4169b.m11585a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo32395a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo32402b() {
        super.mo32402b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f9983b = C4179b.this.f9978a;

            public void run() {
                this.f9983b.destroy();
            }
        }, Math.max(4000 - (this.f9979b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4172d.m11598a() - this.f9979b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f9978a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo32412j() {
        WebView webView = new WebView(C4158d.m11528a().mo32360b());
        this.f9978a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo32390a(this.f9978a);
        C4159e.m11531a().mo32371a(this.f9978a, this.f9981d);
        for (String next : this.f9980c.keySet()) {
            C4159e.m11531a().mo32364a(this.f9978a, this.f9980c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f9979b = Long.valueOf(C4172d.m11598a());
    }
}
