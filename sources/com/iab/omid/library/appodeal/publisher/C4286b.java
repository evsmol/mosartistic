package com.iab.omid.library.appodeal.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.C4259a;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import com.iab.omid.library.appodeal.p105b.C4265d;
import com.iab.omid.library.appodeal.p105b.C4266e;
import com.iab.omid.library.appodeal.p107d.C4276b;
import com.iab.omid.library.appodeal.p107d.C4279d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.publisher.b */
public class C4286b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f10219a;

    /* renamed from: b */
    private Long f10220b = null;

    /* renamed from: c */
    private final Map<String, VerificationScriptResource> f10221c;

    /* renamed from: d */
    private final String f10222d;

    public C4286b(Map<String, VerificationScriptResource> map, String str) {
        this.f10221c = map;
        this.f10222d = str;
    }

    /* renamed from: a */
    public void mo32795a() {
        super.mo32795a();
        mo32819j();
    }

    /* renamed from: a */
    public void mo32801a(C4259a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            C4276b.m12065a(jSONObject, next, injectedResourcesMap.get(next));
        }
        mo32802a(aVar, adSessionContext, jSONObject);
    }

    /* renamed from: b */
    public void mo32809b() {
        super.mo32809b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private final WebView f10224b = C4286b.this.f10219a;

            public void run() {
                this.f10224b.destroy();
            }
        }, Math.max(4000 - (this.f10220b == null ? 4000 : TimeUnit.MILLISECONDS.convert(C4279d.m12077a() - this.f10220b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f10219a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo32819j() {
        WebView webView = new WebView(C4265d.m12009a().mo32767b());
        this.f10219a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo32797a(this.f10219a);
        C4266e.m12012a().mo32778a(this.f10219a, this.f10222d);
        for (String next : this.f10221c.keySet()) {
            C4266e.m12012a().mo32771a(this.f10219a, this.f10221c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f10220b = Long.valueOf(C4279d.m12077a());
    }
}
