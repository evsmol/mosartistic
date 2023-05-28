package com.yandex.metrica.impl.p082ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.Mc */
class C2306Mc {

    /* renamed from: a */
    private final C1891Bc f6161a;

    /* renamed from: b */
    private final C3026hc f6162b;

    /* renamed from: c */
    private final C2518Sc f6163c;

    /* renamed from: d */
    private final C2482Rb f6164d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2306Mc(com.yandex.metrica.impl.p082ob.C2338Nc r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.Oc r0 = new com.yandex.metrica.impl.ob.Oc
            com.yandex.metrica.impl.ob.Sb r1 = r10.f6261a
            android.content.Context r1 = r1.f6631a
            r0.<init>(r1)
            com.yandex.metrica.impl.ob.Sc r1 = new com.yandex.metrica.impl.ob.Sc
            com.yandex.metrica.impl.ob.Sb r2 = r10.f6261a
            android.content.Context r3 = r2.f6631a
            com.yandex.metrica.impl.ob.pi r4 = r10.f6262b
            com.yandex.metrica.impl.ob.mc r5 = r10.f6263c
            com.yandex.metrica.impl.ob.U7 r6 = r10.f6264d
            com.yandex.metrica.impl.ob.T7 r7 = r10.f6265e
            com.yandex.metrica.core.api.executors.IHandlerExecutor r8 = r2.f6632b
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.yandex.metrica.impl.ob.Rb r2 = new com.yandex.metrica.impl.ob.Rb
            com.yandex.metrica.impl.ob.mc r3 = r10.f6263c
            com.yandex.metrica.impl.ob.U7 r4 = r10.f6264d
            com.yandex.metrica.impl.ob.T7 r5 = r10.f6265e
            r2.<init>(r3, r4, r5)
            r9.<init>(r10, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2306Mc.<init>(com.yandex.metrica.impl.ob.Nc):void");
    }

    /* renamed from: a */
    public void mo16274a() {
        this.f6163c.mo15784a();
    }

    /* renamed from: b */
    public Location mo16277b() {
        return this.f6161a.mo15557b();
    }

    /* renamed from: c */
    public void mo16278c() {
        this.f6161a.mo15554a();
        this.f6162b.mo17658b();
    }

    /* renamed from: d */
    public void mo16279d() {
        this.f6161a.mo15558c();
        this.f6162b.mo17659d();
    }

    /* renamed from: e */
    public void mo16280e() {
        this.f6161a.mo15559d();
        this.f6162b.mo17660e();
    }

    private C2306Mc(C2338Nc nc, C2373Oc oc, C2518Sc sc, C2482Rb rb) {
        this(nc, oc, C1921Cc.m6968a(nc, sc, rb, oc.mo16391a()), sc, rb);
    }

    /* renamed from: a */
    public void mo16276a(C3356pi piVar) {
        this.f6163c.mo16608a(piVar);
        this.f6161a.mo15556a(piVar);
    }

    /* renamed from: a */
    public void mo16275a(C3208mc mcVar) {
        this.f6163c.mo16607a(mcVar);
        this.f6164d.mo16556a(mcVar);
        this.f6161a.mo15555a(mcVar);
        this.f6162b.mo17657a(mcVar);
    }

    private C2306Mc(C2338Nc nc, C2373Oc oc, C1921Cc cc, C2518Sc sc, C2482Rb rb) {
        this(nc, oc, cc, new C2425Pc(nc.f6261a.f6631a, nc.f6263c, sc, rb, nc.f6262b.mo17972d()), sc, rb);
    }

    private C2306Mc(C2338Nc nc, C2373Oc oc, C1921Cc cc, C2425Pc pc, C2518Sc sc, C2482Rb rb) {
        this(nc, new C1891Bc(cc, pc), new C3026hc(C3058ic.m9749a(nc, sc, rb, oc.mo16393c(), oc.mo16392b())), sc, rb);
    }

    C2306Mc(C2338Nc nc, C1891Bc bc, C3026hc hcVar, C2518Sc sc, C2482Rb rb) {
        this.f6161a = bc;
        this.f6162b = hcVar;
        this.f6163c = sc;
        this.f6164d = rb;
    }
}
