package com.criteo.publisher;

import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.logging.C1209n;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.C1253g;
import com.criteo.publisher.model.C1267n;
import com.criteo.publisher.model.C1268o;
import com.criteo.publisher.model.C1271r;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.model.C1276t;
import com.criteo.publisher.p061c0.C1058a;
import com.criteo.publisher.p062d0.C1070a;
import com.criteo.publisher.p064f0.C1127w;
import com.criteo.publisher.p069k0.C1158b;
import com.criteo.publisher.p069k0.C1163e;
import com.criteo.publisher.p070l0.C1170a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.criteo.publisher.e */
/* compiled from: BidManager */
public class C1071e {

    /* renamed from: a */
    private final C1195g f3486a = C1197h.m5407b(getClass());

    /* renamed from: b */
    private final C1070a f3487b;

    /* renamed from: c */
    private final Object f3488c = new Object();

    /* renamed from: d */
    private final AtomicLong f3489d = new AtomicLong(0);

    /* renamed from: e */
    private final C1276t f3490e;

    /* renamed from: f */
    private final C1146i f3491f;

    /* renamed from: g */
    private final C1253g f3492g;

    /* renamed from: h */
    private final C1158b f3493h;

    /* renamed from: i */
    private final C1163e f3494i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1058a f3495j;

    /* renamed from: k */
    private final C1127w f3496k;

    /* renamed from: l */
    private final C1209n f3497l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1170a f3498m;

    C1071e(C1070a aVar, C1276t tVar, C1146i iVar, C1253g gVar, C1158b bVar, C1163e eVar, C1058a aVar2, C1127w wVar, C1209n nVar, C1170a aVar3) {
        this.f3487b = aVar;
        this.f3490e = tVar;
        this.f3491f = iVar;
        this.f3492g = gVar;
        this.f3493h = bVar;
        this.f3494i = eVar;
        this.f3495j = aVar2;
        this.f3496k = wVar;
        this.f3497l = nVar;
        this.f3498m = aVar3;
    }

    /* renamed from: a */
    public void mo3113a(AdUnit adUnit, ContextData contextData, C1069d dVar) {
        if (adUnit == null) {
            dVar.mo3033a();
        } else if (this.f3490e.mo3600i()) {
            mo3117b(adUnit, contextData, dVar);
        } else {
            C1272s a = mo3111a(adUnit, contextData);
            if (a != null) {
                dVar.mo3034a(a);
            } else {
                dVar.mo3033a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1272s mo3111a(AdUnit adUnit, ContextData contextData) {
        C1267n a;
        C1272s a2;
        if (m4997b() || (a = mo3110a(adUnit)) == null) {
            return null;
        }
        synchronized (this.f3488c) {
            if (!m4999c(a)) {
                m4993a(a, contextData);
            }
            a2 = m4992a(a);
        }
        return a2;
    }

    /* renamed from: c */
    private boolean m4999c(C1267n nVar) {
        boolean c;
        if (mo3116a()) {
            return true;
        }
        synchronized (this.f3488c) {
            c = mo3120c(this.f3487b.mo3106a(nVar));
        }
        return c;
    }

    /* renamed from: b */
    private void m4996b(C1267n nVar) {
        synchronized (this.f3488c) {
            C1272s a = this.f3487b.mo3106a(nVar);
            if (a != null && m4998b(a)) {
                this.f3487b.mo3109b(nVar);
                this.f3495j.mo3072a(nVar, a);
            }
        }
    }

    /* renamed from: a */
    private C1272s m4992a(C1267n nVar) {
        synchronized (this.f3488c) {
            C1272s a = this.f3487b.mo3106a(nVar);
            if (a != null) {
                boolean c = mo3120c(a);
                boolean b = m4998b(a);
                if (!c) {
                    this.f3487b.mo3109b(nVar);
                    this.f3495j.mo3072a(nVar, a);
                }
                if (!c && !b) {
                    return a;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3114a(C1267n nVar, C1069d dVar) {
        C1272s a = m4992a(nVar);
        if (a != null) {
            dVar.mo3034a(a);
        } else {
            dVar.mo3033a();
        }
    }

    /* renamed from: a */
    private void m4993a(C1267n nVar, ContextData contextData) {
        m4994a((List<C1267n>) Collections.singletonList(nVar), contextData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3117b(AdUnit adUnit, ContextData contextData, C1069d dVar) {
        if (m4997b()) {
            dVar.mo3033a();
            return;
        }
        C1267n a = mo3110a(adUnit);
        if (a == null) {
            dVar.mo3033a();
            return;
        }
        synchronized (this.f3488c) {
            m4996b(a);
            if (m4999c(a)) {
                mo3114a(a, dVar);
            } else {
                this.f3494i.mo3260a(a, contextData, new C1329w(dVar, this.f3495j, this, a, this.f3498m));
            }
            this.f3496k.mo3221a();
            this.f3497l.mo3354a();
        }
    }

    /* renamed from: a */
    private void m4994a(List<C1267n> list, ContextData contextData) {
        if (!m4997b()) {
            this.f3493h.mo3258b(list, contextData, new C1072a());
            this.f3496k.mo3221a();
            this.f3497l.mo3354a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3118b(List<C1272s> list) {
        synchronized (this.f3488c) {
            for (C1272s next : list) {
                if (!mo3120c(this.f3487b.mo3106a(this.f3487b.mo3108b(next)))) {
                    if (next.mo3585o()) {
                        if (m4990a(next) > 0.0d && next.mo3580j() == 0) {
                            next.mo3567a(900);
                        }
                        this.f3487b.mo3107a(next);
                        this.f3495j.mo3076a(next);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1267n mo3110a(AdUnit adUnit) {
        return this.f3492g.mo3533b(adUnit);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3112a(int i) {
        if (i > 0) {
            this.f3486a.mo3337a(C1080f.m5021a(i));
            this.f3489d.set(this.f3491f.mo3242a() + ((long) (i * 1000)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3120c(C1272s sVar) {
        if (sVar == null) {
            return false;
        }
        if (!(sVar.mo3580j() > 0 && m4990a(sVar) == 0.0d) || m4998b(sVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m4998b(C1272s sVar) {
        return sVar.mo3569a(this.f3491f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3116a() {
        return this.f3489d.get() > this.f3491f.mo3242a();
    }

    /* renamed from: c */
    public void mo3119c() {
        this.f3493h.mo3256a();
    }

    /* renamed from: a */
    public void mo3115a(List<AdUnit> list) {
        this.f3493h.mo3257a(this.f3490e);
        if (this.f3490e.mo3601j()) {
            for (List<C1267n> a : this.f3492g.mo3532a(list)) {
                m4994a(a, new ContextData());
            }
        }
    }

    /* renamed from: b */
    private boolean m4997b() {
        return this.f3490e.mo3599h();
    }

    /* renamed from: a */
    private double m4990a(C1272s sVar) {
        if (sVar.mo3570b() == null) {
            return 0.0d;
        }
        return sVar.mo3570b().doubleValue();
    }

    /* renamed from: com.criteo.publisher.e$a */
    /* compiled from: BidManager */
    private class C1072a extends C1135h {
        public C1072a() {
            super(C1071e.this.f3495j, C1071e.this, C1071e.this.f3498m);
        }

        /* renamed from: a */
        public void mo3121a(C1268o oVar, C1271r rVar) {
            C1071e.this.mo3118b(rVar.mo3563b());
            super.mo3121a(oVar, rVar);
        }
    }
}
