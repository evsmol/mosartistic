package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.p082ob.C2071H0;
import com.yandex.metrica.impl.p082ob.C3316oc;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.hc */
public class C3026hc {

    /* renamed from: a */
    private final C3058ic f7960a;

    /* renamed from: b */
    private final C3096jc f7961b;

    /* renamed from: c */
    private final SystemTimeProvider f7962c;

    /* renamed from: d */
    private C3208mc f7963d;

    /* renamed from: e */
    private final C1967E f7964e;

    /* renamed from: f */
    private final C2081H2 f7965f;

    /* renamed from: g */
    private final C2714Xc f7966g;

    /* renamed from: h */
    private final C3598w f7967h;

    /* renamed from: i */
    private boolean f7968i;

    /* renamed from: j */
    private final Runnable f7969j;

    /* renamed from: com.yandex.metrica.impl.ob.hc$a */
    class C3027a implements Runnable {
        C3027a() {
        }

        public void run() {
            C3026hc.this.mo17658b();
            C3026hc.this.m9685c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.hc$b */
    class C3028b implements C3593vj {

        /* renamed from: a */
        final /* synthetic */ C3155lc f7971a;

        C3028b(C3026hc hcVar, C3155lc lcVar) {
            this.f7971a = lcVar;
        }

        /* renamed from: a */
        public void mo17646a(Collection<C3555uj> collection) {
            this.f7971a.mo17811a(C2572Tl.m8519a(collection));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3026hc(com.yandex.metrica.impl.p082ob.C3058ic r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.Xc r0 = new com.yandex.metrica.impl.ob.Xc
            com.yandex.metrica.impl.ob.Sb r1 = r4.f8049a
            android.content.Context r1 = r1.f6631a
            com.yandex.metrica.impl.ob.mc r2 = r4.f8053e
            if (r2 != 0) goto L_0x000c
            r2 = 0
            goto L_0x000e
        L_0x000c:
            com.yandex.metrica.impl.ob.Xb r2 = r2.f8319m
        L_0x000e:
            r0.<init>((android.content.Context) r1, (com.yandex.metrica.impl.p082ob.C2713Xb) r2)
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3026hc.<init>(com.yandex.metrica.impl.ob.ic):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m9685c() {
        C3208mc mcVar = this.f7963d;
        if (mcVar != null) {
            long j = mcVar.f8314h;
            if (j > 0) {
                this.f7960a.f8049a.f6632b.executeDelayed(this.f7969j, j);
            }
        }
    }

    /* renamed from: b */
    public void mo17658b() {
        C3155lc lcVar = new C3155lc();
        lcVar.mo17813b(this.f7962c.currentTimeMillis());
        lcVar.mo17807a(this.f7962c.elapsedRealtime());
        this.f7966g.mo17037b();
        lcVar.mo17814b(C2010F2.m7185a((Collection) this.f7965f.mo15844a().mo15800a()));
        this.f7960a.f8050b.mo15944a((C3593vj) new C3028b(this, lcVar));
        lcVar.mo17808a(this.f7964e.mo15642b());
        lcVar.mo17809a(C3316oc.C3317a.m10241a(this.f7967h.mo18348c()));
        this.f7961b.mo17762a(lcVar);
        this.f7960a.f8051c.mo15784a();
        this.f7960a.f8052d.mo16555a();
    }

    /* renamed from: d */
    public void mo17659d() {
        m9683a();
    }

    /* renamed from: e */
    public void mo17660e() {
        this.f7960a.f8049a.f6632b.remove(this.f7969j);
    }

    /* renamed from: a */
    private void m9683a() {
        C3208mc mcVar = this.f7963d;
        boolean z = mcVar != null && mcVar.f8315i;
        if (this.f7968i != z) {
            this.f7968i = z;
            if (z) {
                m9685c();
            } else {
                this.f7960a.f8049a.f6632b.remove(this.f7969j);
            }
        }
    }

    private C3026hc(C3058ic icVar, C2714Xc xc) {
        this(icVar, new C3096jc(icVar.f8049a.f6631a), new SystemTimeProvider(), C2007F0.m7154g().mo15741c(), C2007F0.m7154g().mo15740b(), C2081H2.m7295a(icVar.f8049a.f6631a), xc, new C2071H0.C2074c());
    }

    C3026hc(C3058ic icVar, C3096jc jcVar, SystemTimeProvider systemTimeProvider, C1967E e, C3598w wVar, C2081H2 h2, C2714Xc xc, C2071H0.C2074c cVar) {
        this.f7969j = new C3027a();
        this.f7960a = icVar;
        this.f7961b = jcVar;
        this.f7962c = systemTimeProvider;
        this.f7963d = icVar.f8053e;
        this.f7964e = e;
        this.f7967h = wVar;
        this.f7965f = h2;
        this.f7966g = xc;
        h2.mo15844a().mo15801a(cVar.mo15843a(icVar.f8049a.f6632b, xc, h2.mo15844a()));
    }

    /* renamed from: a */
    public void mo17657a(C3208mc mcVar) {
        C2713Xb xb;
        this.f7963d = mcVar;
        C2714Xc xc = this.f7966g;
        if (mcVar == null) {
            xb = null;
        } else {
            xb = mcVar.f8319m;
        }
        xc.mo17036a(xb);
        m9683a();
    }
}
