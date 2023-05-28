package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.tn */
public abstract class C3519tn<T> {

    /* renamed from: a */
    public final T f9176a;

    public C3519tn(T t) {
        this.f9176a = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo15475a(C3519tn<T> tnVar);

    public boolean equals(Object obj) {
        if (obj instanceof C3519tn) {
            try {
                return mo15475a((C3519tn) obj);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
