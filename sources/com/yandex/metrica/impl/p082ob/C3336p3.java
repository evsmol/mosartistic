package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3246n3;

/* renamed from: com.yandex.metrica.impl.ob.p3 */
public class C3336p3<T extends C3246n3> {

    /* renamed from: a */
    private final C3307o3<T> f8548a;

    /* renamed from: b */
    private final C3199m3<T> f8549b;

    /* renamed from: com.yandex.metrica.impl.ob.p3$b */
    public static final class C3338b<T extends C3246n3> {

        /* renamed from: a */
        final C3307o3<T> f8550a;

        /* renamed from: b */
        C3199m3<T> f8551b;

        C3338b(C3307o3<T> o3Var) {
            this.f8550a = o3Var;
        }

        /* renamed from: a */
        public C3338b<T> mo17935a(C3199m3<T> m3Var) {
            this.f8551b = m3Var;
            return this;
        }

        /* renamed from: a */
        public C3336p3<T> mo17936a() {
            return new C3336p3<>(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo17933a(C3246n3 n3Var) {
        C3199m3<T> m3Var = this.f8549b;
        if (m3Var == null) {
            return false;
        }
        return m3Var.mo17836a(n3Var);
    }

    /* renamed from: b */
    public void mo17934b(C3246n3 n3Var) {
        this.f8548a.mo17908a(n3Var);
    }

    private C3336p3(C3338b bVar) {
        this.f8548a = bVar.f8550a;
        this.f8549b = bVar.f8551b;
    }

    /* renamed from: a */
    public static <T extends C3246n3> C3338b<T> m10282a(C3307o3<T> o3Var) {
        return new C3338b<>(o3Var);
    }
}
