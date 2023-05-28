package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8345a;
import com.applovin.impl.sdk.p252ad.C8346b;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.s */
class C8447s extends C8401a {

    /* renamed from: a */
    private final JSONObject f21216a;

    /* renamed from: e */
    private final JSONObject f21217e;

    /* renamed from: f */
    private final AppLovinAdLoadListener f21218f;

    /* renamed from: g */
    private final C8346b f21219g;

    C8447s(JSONObject jSONObject, JSONObject jSONObject2, C8346b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        super("TaskRenderAppLovinAd", nVar);
        this.f21216a = jSONObject;
        this.f21217e = jSONObject2;
        this.f21219g = bVar;
        this.f21218f = appLovinAdLoadListener;
    }

    public void run() {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57818b(this.f21119c, "Rendering ad...");
        }
        C8345a aVar = new C8345a(this.f21216a, this.f21217e, this.f21219g, this.f21118b);
        boolean booleanValue = JsonUtils.getBoolean(this.f21216a, "gs_load_immediately", false).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f21216a, "vs_load_immediately", true).booleanValue();
        C8410d dVar = new C8410d(aVar, this.f21118b, this.f21218f);
        dVar.mo57197a(booleanValue2);
        dVar.mo57198b(booleanValue);
        C8432o.C8434a aVar2 = C8432o.C8434a.CACHING_OTHER;
        if (((Boolean) this.f21118b.mo57342a(C8380b.f20795br)).booleanValue()) {
            if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.REGULAR) {
                aVar2 = C8432o.C8434a.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar2 = C8432o.C8434a.CACHING_INCENTIVIZED;
            }
        }
        this.f21118b.mo57337V().mo57228a((C8401a) dVar, aVar2);
    }
}
