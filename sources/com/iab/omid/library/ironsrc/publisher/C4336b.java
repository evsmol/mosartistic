package com.iab.omid.library.ironsrc.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C4309a;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.p111b.C4315d;
import com.iab.omid.library.ironsrc.p111b.C4316e;
import com.iab.omid.library.ironsrc.p113d.C4326b;
import com.iab.omid.library.ironsrc.p113d.C4329d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.publisher.b */
public class C4336b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f10333a;

    /* renamed from: b */
    private Long f10334b = null;

    /* renamed from: c */
    private Map<String, VerificationScriptResource> f10335c;

    /* renamed from: d */
    private final String f10336d;

    public C4336b(Map<String, VerificationScriptResource> map, String str) {
        this.f10335c = map;
        this.f10336d = str;
    }

    /* renamed from: a */
    public void mo32981a() {
        super.mo32981a();
        mo33005j();
    }

    /* renamed from: a */
    public void mo32987a(C4309a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4326b.m12286a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo32988a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo32995b() {
        super.mo32995b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f10338b = C4336b.this.f10333a;

            public void run() {
                this.f10338b.destroy();
            }
        }, Math.max(4000 - (this.f10334b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4329d.m12298a() - this.f10334b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f10333a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo33005j() {
        WebView webView = new WebView(C4315d.m12231a().mo32953b());
        this.f10333a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo32983a(this.f10333a);
        C4316e.m12234a().mo32964a(this.f10333a, this.f10336d);
        for (String next : this.f10335c.keySet()) {
            C4316e.m12234a().mo32957a(this.f10333a, this.f10335c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f10334b = Long.valueOf(C4329d.m12298a());
    }
}
