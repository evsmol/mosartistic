package com.iab.omid.library.applovin.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C4197a;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.C4211f;
import com.iab.omid.library.applovin.internal.C4212g;
import com.iab.omid.library.applovin.utils.C4226c;
import com.iab.omid.library.applovin.utils.C4232f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.publisher.b */
public class C4222b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f10095f;

    /* renamed from: g */
    private Long f10096g = null;

    /* renamed from: h */
    private final Map<String, VerificationScriptResource> f10097h;

    /* renamed from: i */
    private final String f10098i;

    /* renamed from: com.iab.omid.library.applovin.publisher.b$a */
    class C4223a implements Runnable {

        /* renamed from: a */
        private final WebView f10099a;

        C4223a() {
            this.f10099a = C4222b.this.f10095f;
        }

        public void run() {
            this.f10099a.destroy();
        }
    }

    public C4222b(Map<String, VerificationScriptResource> map, String str) {
        this.f10097h = map;
        this.f10098i = str;
    }

    /* renamed from: a */
    public void mo32603a(C4197a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4226c.m11860a(jSONObject, next, injectedResourcesMap.get(next).toJsonObject());
        }
        mo32604a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo32612b() {
        super.mo32612b();
        new Handler().postDelayed(new C4223a(), Math.max(4000 - (this.f10096g == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4232f.m11878b() - this.f10096g.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f10095f = null;
    }

    /* renamed from: i */
    public void mo32621i() {
        super.mo32621i();
        mo32622j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo32622j() {
        WebView webView = new WebView(C4211f.m11776b().mo32567a());
        this.f10095f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f10095f.getSettings().setAllowContentAccess(false);
        mo32599a(this.f10095f);
        C4212g.m11779a().mo32585c(this.f10095f, this.f10098i);
        for (String next : this.f10097h.keySet()) {
            C4212g.m11779a().mo32573a(this.f10095f, this.f10097h.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f10096g = Long.valueOf(C4232f.m11878b());
    }
}
