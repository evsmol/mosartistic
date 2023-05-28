package com.applovin.impl.mediation;

import com.applovin.impl.mediation.C8068a;
import com.applovin.impl.mediation.C8129c;
import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.mediation.b */
public class C8108b implements C8068a.C8069a, C8129c.C8131a {

    /* renamed from: a */
    private final C8068a f19739a;

    /* renamed from: b */
    private final C8129c f19740b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MaxAdListener f19741c;

    public C8108b(C8490n nVar, MaxAdListener maxAdListener) {
        this.f19741c = maxAdListener;
        this.f19739a = new C8068a(nVar);
        this.f19740b = new C8129c(nVar, this);
    }

    /* renamed from: a */
    public void mo56058a(final C8072c cVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
            public void run() {
                C8108b.this.f19741c.onAdHidden(cVar);
            }
        }, cVar.mo56116C());
    }

    /* renamed from: a */
    public void mo56261a(MaxAd maxAd) {
        this.f19740b.mo56292a();
        this.f19739a.mo56056a();
    }

    /* renamed from: b */
    public void mo56262b(C8072c cVar) {
        long A = cVar.mo56114A();
        if (A >= 0) {
            this.f19740b.mo56293a(cVar, A);
        }
        if (cVar.mo56115B()) {
            this.f19739a.mo56057a(cVar, this);
        }
    }

    /* renamed from: c */
    public void mo56263c(C8072c cVar) {
        this.f19741c.onAdHidden(cVar);
    }
}
