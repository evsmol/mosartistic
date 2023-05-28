package com.criteo.publisher.p064f0;

import java.util.List;

/* renamed from: com.criteo.publisher.f0.j */
/* compiled from: BoundedSendingQueue */
class C1101j<T> implements C1102k<T> {

    /* renamed from: a */
    private final C1102k<T> f3571a;

    /* renamed from: b */
    private final Object f3572b = new Object();

    /* renamed from: c */
    private final C1084a0<T> f3573c;

    C1101j(C1102k<T> kVar, C1084a0<T> a0Var) {
        this.f3571a = kVar;
        this.f3573c = a0Var;
    }

    /* renamed from: a */
    public boolean mo3195a(T t) {
        boolean a;
        synchronized (this.f3572b) {
            if (mo3192a() >= this.f3573c.mo3158c()) {
                this.f3571a.mo3194a(1);
            }
            a = this.f3571a.mo3195a(t);
        }
        return a;
    }

    /* renamed from: a */
    public List<T> mo3194a(int i) {
        List<T> a;
        synchronized (this.f3572b) {
            a = this.f3571a.mo3194a(i);
        }
        return a;
    }

    /* renamed from: a */
    public int mo3192a() {
        return this.f3571a.mo3192a();
    }
}
