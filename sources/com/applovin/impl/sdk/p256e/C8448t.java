package com.applovin.impl.sdk.p256e;

import com.applovin.impl.p233b.C8029a;
import com.applovin.impl.p233b.C8035c;
import com.applovin.impl.p233b.C8036d;
import com.applovin.impl.p233b.C8037e;
import com.applovin.impl.p233b.C8038f;
import com.applovin.impl.p233b.C8043j;
import com.applovin.impl.p233b.C8044k;
import com.applovin.impl.p233b.C8046m;
import com.applovin.impl.p233b.C8047n;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.e.t */
class C8448t extends C8401a {

    /* renamed from: a */
    private final C8037e f21220a;

    /* renamed from: e */
    private final AppLovinAdLoadListener f21221e;

    C8448t(C8037e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        super("TaskRenderVastAd", nVar);
        this.f21221e = appLovinAdLoadListener;
        this.f21220a = eVar;
    }

    public void run() {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57818b(this.f21119c, "Rendering VAST ad...");
        }
        int size = this.f21220a.mo55895b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        C8043j jVar = null;
        C8047n nVar = null;
        C8036d dVar = null;
        C8035c cVar = null;
        String str2 = str;
        for (C8622s next : this.f21220a.mo55895b()) {
            C8622s c = next.mo57798c(C8046m.m23961a(next) ? "Wrapper" : "InLine");
            if (c != null) {
                C8622s c2 = c.mo57798c("AdSystem");
                if (c2 != null) {
                    jVar = C8043j.m23941a(c2, jVar, this.f21118b);
                }
                str = C8046m.m23952a(c, "AdTitle", str);
                str2 = C8046m.m23952a(c, "Description", str2);
                C8046m.m23957a(c.mo57795a("Impression"), (Set<C8044k>) hashSet, this.f21220a, this.f21118b);
                C8622s b = c.mo57796b("ViewableImpression");
                if (b != null) {
                    C8046m.m23957a(b.mo57795a("Viewable"), (Set<C8044k>) hashSet, this.f21220a, this.f21118b);
                }
                C8622s c3 = c.mo57798c("AdVerifications");
                if (c3 != null) {
                    cVar = C8035c.m23908a(c3, cVar, this.f21220a, this.f21118b);
                }
                C8046m.m23957a(c.mo57795a(LogConstants.EVENT_ERROR), (Set<C8044k>) hashSet2, this.f21220a, this.f21118b);
                C8622s b2 = c.mo57796b("Creatives");
                if (b2 != null) {
                    for (C8622s next2 : b2.mo57800d()) {
                        C8622s b3 = next2.mo57796b("Linear");
                        if (b3 != null) {
                            nVar = C8047n.m23967a(b3, nVar, this.f21220a, this.f21118b);
                        } else {
                            C8622s c4 = next2.mo57798c("CompanionAds");
                            if (c4 != null) {
                                C8622s c5 = c4.mo57798c("Companion");
                                if (c5 != null) {
                                    dVar = C8036d.m23910a(c5, dVar, this.f21220a, this.f21118b);
                                }
                            } else {
                                C8626v vVar2 = this.f21120d;
                                if (C8626v.m26252a()) {
                                    this.f21120d.mo57822e(this.f21119c, "Received and will skip rendering for an unidentified creative: " + next2);
                                }
                            }
                        }
                    }
                }
            } else {
                C8626v vVar3 = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57822e(this.f21119c, "Did not find wrapper or inline response for node: " + next);
                }
            }
        }
        C8029a a = new C8029a.C8031a().mo55868a(this.f21118b).mo55871a(this.f21220a.mo55896c()).mo55875b(this.f21220a.mo55897d()).mo55867a(this.f21220a.mo55898e()).mo55862a(this.f21220a.mo55899f()).mo55869a(str).mo55873b(str2).mo55865a(jVar).mo55866a(nVar).mo55864a(dVar).mo55863a(cVar).mo55870a((Set<C8044k>) hashSet).mo55863a(cVar).mo55874b((Set<C8044k>) hashSet2).mo55872a();
        C8038f a2 = C8046m.m23948a(a);
        if (a2 == null) {
            C8626v vVar4 = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57818b(this.f21119c, "Finished rendering VAST ad: " + a);
            }
            a.mo55860o().mo56852b();
            C8411e eVar = new C8411e(a, this.f21118b, this.f21221e);
            C8432o.C8434a aVar = C8432o.C8434a.CACHING_OTHER;
            if (((Boolean) this.f21118b.mo57342a(C8380b.f20795br)).booleanValue()) {
                if (a.getType() == AppLovinAdType.REGULAR) {
                    aVar = C8432o.C8434a.CACHING_INTERSTITIAL;
                } else if (a.getType() == AppLovinAdType.INCENTIVIZED) {
                    aVar = C8432o.C8434a.CACHING_INCENTIVIZED;
                }
            }
            this.f21118b.mo57337V().mo57228a((C8401a) eVar, aVar);
            return;
        }
        C8046m.m23955a(this.f21220a, this.f21221e, a2, -6, this.f21118b);
    }
}
