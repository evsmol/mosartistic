package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.t0 */
public abstract class C3490t0<T> {

    /* renamed from: a */
    private final C2780Zl<C3522u0, Integer> f9121a;

    public C3490t0() {
        C2780Zl<C3522u0, Integer> zl = new C2780Zl<>(0);
        zl.mo17128a(C3522u0.UNDEFINED, 0);
        zl.mo17128a(C3522u0.APP, 1);
        zl.mo17128a(C3522u0.SATELLITE, 2);
        zl.mo17128a(C3522u0.RETAIL, 3);
        this.f9121a = zl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C2780Zl<C3522u0, Integer> mo18225a() {
        return this.f9121a;
    }

    /* renamed from: a */
    public abstract boolean mo17303a(T t, T t2);
}
