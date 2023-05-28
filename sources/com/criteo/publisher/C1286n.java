package com.criteo.publisher;

import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.C1221a0;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.model.C1278u;
import com.criteo.publisher.p068j0.C1154a;
import com.criteo.publisher.p072m0.C1217d;
import com.criteo.publisher.p074n0.C1288a;

/* renamed from: com.criteo.publisher.n */
/* compiled from: CriteoInterstitialEventController */
public class C1286n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1221a0 f3989a;

    /* renamed from: b */
    private final C1278u f3990b;

    /* renamed from: c */
    private final Criteo f3991c;

    /* renamed from: d */
    private final C1154a f3992d;

    /* renamed from: e */
    private final C1217d f3993e;

    public C1286n(C1221a0 a0Var, C1154a aVar, Criteo criteo, C1217d dVar) {
        this.f3989a = a0Var;
        this.f3992d = aVar;
        this.f3991c = criteo;
        this.f3990b = criteo.getDeviceInfo();
        this.f3993e = dVar;
    }

    /* renamed from: a */
    public boolean mo3610a() {
        return this.f3989a.mo3409e();
    }

    /* renamed from: a */
    public void mo3608a(AdUnit adUnit, ContextData contextData) {
        if (!this.f3992d.mo3252b()) {
            mo3611b();
        } else if (!this.f3989a.mo3410f()) {
            this.f3989a.mo3406b();
            this.f3991c.getBidForAdUnit(adUnit, contextData, new C1287a());
        }
    }

    /* renamed from: com.criteo.publisher.n$a */
    /* compiled from: CriteoInterstitialEventController */
    class C1287a implements C1069d {
        C1287a() {
        }

        /* renamed from: a */
        public void mo3034a(C1272s sVar) {
            C1286n.this.mo3609a(sVar.mo3572d());
        }

        /* renamed from: a */
        public void mo3033a() {
            C1286n.this.mo3611b();
            C1286n.this.f3989a.mo3403a();
        }
    }

    /* renamed from: a */
    public void mo3607a(Bid bid) {
        String str;
        if (!this.f3992d.mo3252b()) {
            mo3611b();
            return;
        }
        if (bid == null) {
            str = null;
        } else {
            str = bid.mo2939a(C1288a.CRITEO_INTERSTITIAL);
        }
        if (str == null) {
            mo3611b();
        } else {
            mo3609a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3611b() {
        this.f3993e.mo3356a(C1319p.INVALID);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3609a(String str) {
        this.f3989a.mo3405a(str, this.f3990b, this.f3993e);
    }

    /* renamed from: c */
    public void mo3612c() {
        if (mo3610a()) {
            this.f3992d.mo3251a(this.f3989a.mo3408d(), this.f3993e);
            this.f3993e.mo3356a(C1319p.OPEN);
            this.f3989a.mo3411g();
        }
    }
}
