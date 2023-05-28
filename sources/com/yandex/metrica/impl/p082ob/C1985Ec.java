package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Ec */
public class C1985Ec<T> implements C3348pc<T> {

    /* renamed from: a */
    private final C1953Dc<T> f5310a;

    /* renamed from: b */
    private final C2270Lb<T> f5311b;

    /* renamed from: c */
    private final C2058Gc f5312c;

    /* renamed from: d */
    private final C2455Qb<T> f5313d;

    /* renamed from: e */
    private final Runnable f5314e = new C1986a();

    /* renamed from: f */
    private T f5315f;

    /* renamed from: com.yandex.metrica.impl.ob.Ec$a */
    class C1986a implements Runnable {
        C1986a() {
        }

        public void run() {
            C1985Ec.this.mo15680b();
        }
    }

    public C1985Ec(C1953Dc<T> dc, C2270Lb<T> lb, C2058Gc gc, C2455Qb<T> qb, T t) {
        this.f5310a = dc;
        this.f5311b = lb;
        this.f5312c = gc;
        this.f5313d = qb;
        this.f5315f = t;
    }

    /* renamed from: a */
    public void mo15678a() {
        T t = this.f5315f;
        if (t != null && this.f5311b.mo15892a(t) && this.f5310a.mo15630a(this.f5315f)) {
            this.f5312c.mo15822a();
            this.f5313d.mo15994a(this.f5314e, this.f5315f);
        }
    }

    /* renamed from: b */
    public void mo15680b() {
        this.f5313d.mo15993a();
        this.f5310a.mo15629a();
    }

    /* renamed from: c */
    public void mo15681c() {
        T t = this.f5315f;
        if (t != null && this.f5311b.mo15893b(t)) {
            this.f5310a.mo15631b();
        }
        mo15678a();
    }

    /* renamed from: a */
    public void mo15679a(T t) {
        if (!C1848A2.m6810a((Object) this.f5315f, (Object) t)) {
            this.f5315f = t;
            mo15680b();
            mo15678a();
        }
    }
}
