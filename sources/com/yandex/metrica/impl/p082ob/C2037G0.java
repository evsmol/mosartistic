package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2071H0;

/* renamed from: com.yandex.metrica.impl.ob.G0 */
public abstract class C2037G0<T> implements C2071H0.C2075d {

    /* renamed from: a */
    protected final C2036G<T> f5429a;

    /* renamed from: b */
    private C2071H0 f5430b;

    public C2037G0(long j, long j2) {
        this.f5429a = new C2036G<>(j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo15799a(C2435Ph ph);

    /* renamed from: a */
    public T mo15800a() {
        C2071H0 h0;
        if (mo15805b() && (h0 = this.f5430b) != null) {
            h0.mo15838b();
        }
        if (this.f5429a.mo15796c()) {
            this.f5429a.mo15794a(null);
        }
        return this.f5429a.mo15792a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo15802a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract long mo15803b(C2435Ph ph);

    /* renamed from: b */
    public void mo15804b(T t) {
        if (mo15802a(t)) {
            this.f5429a.mo15794a(t);
            C2071H0 h0 = this.f5430b;
            if (h0 != null) {
                h0.mo15837a();
            }
        }
    }

    /* renamed from: b */
    public abstract boolean mo15805b();

    /* renamed from: c */
    public void mo15806c(C2435Ph ph) {
        this.f5429a.mo15793a(mo15803b(ph), mo15799a(ph));
    }

    /* renamed from: a */
    public void mo15801a(C2071H0 h0) {
        this.f5430b = h0;
    }
}
