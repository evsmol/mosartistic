package com.iab.omid.library.adcolony.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.C4102a;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.p093b.C4108d;
import com.iab.omid.library.adcolony.p093b.C4109e;
import com.iab.omid.library.adcolony.p095d.C4119b;
import com.iab.omid.library.adcolony.p095d.C4122d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.publisher.b */
public class C4129b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f9861a;

    /* renamed from: b */
    private Long f9862b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f9863c;

    /* renamed from: d */
    private final String f9864d;

    public C4129b(Map<String, VerificationScriptResource> map, String str) {
        this.f9863c = map;
        this.f9864d = str;
    }

    /* renamed from: a */
    public void mo32189a() {
        super.mo32189a();
        mo32213j();
    }

    /* renamed from: a */
    public void mo32195a(C4102a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4119b.m11355a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo32196a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo32203b() {
        super.mo32203b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f9866b;

            {
                this.f9866b = C4129b.this.f9861a;
            }

            public void run() {
                this.f9866b.destroy();
            }
        }, Math.max(4000 - (this.f9862b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4122d.m11368a() - this.f9862b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f9861a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo32213j() {
        WebView webView = new WebView(C4108d.m11298a().mo32161b());
        this.f9861a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo32191a(this.f9861a);
        C4109e.m11301a().mo32172a(this.f9861a, this.f9864d);
        for (String next : this.f9863c.keySet()) {
            C4109e.m11301a().mo32165a(this.f9861a, this.f9863c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f9862b = Long.valueOf(C4122d.m11368a());
    }
}
