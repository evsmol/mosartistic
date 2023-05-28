package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.yl */
public class C3710yl {

    /* renamed from: a */
    private final C2291M0 f9538a;

    /* renamed from: b */
    private final C3634wl f9539b;

    /* renamed from: com.yandex.metrica.impl.ob.yl$a */
    static class C3711a {
        C3711a() {
        }
    }

    C3710yl(C3634wl wlVar, C2291M0 m0) {
        this.f9539b = wlVar;
        this.f9538a = m0;
    }

    /* renamed from: a */
    public void mo18437a(String str, Throwable th) {
        if (this.f9539b.f9419f) {
            this.f9538a.reportError(str, th);
        }
    }
}
