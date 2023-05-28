package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Z5 */
public final class C2759Z5 {

    /* renamed from: a */
    private final C2943f6 f7251a;

    /* renamed from: b */
    private final Integer f7252b;

    /* renamed from: com.yandex.metrica.impl.ob.Z5$b */
    static final class C2761b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C2943f6 f7253a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Integer f7254b;

        private C2761b(C2943f6 f6Var) {
            this.f7253a = f6Var;
        }

        /* renamed from: a */
        public C2761b mo17091a(int i) {
            this.f7254b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C2759Z5 mo17092a() {
            return new C2759Z5(this);
        }
    }

    /* renamed from: a */
    public static final C2761b m8933a(C2943f6 f6Var) {
        return new C2761b(f6Var);
    }

    /* renamed from: b */
    public C2943f6 mo17090b() {
        return this.f7251a;
    }

    private C2759Z5(C2761b bVar) {
        this.f7251a = bVar.f7253a;
        this.f7252b = bVar.f7254b;
    }

    /* renamed from: a */
    public Integer mo17089a() {
        return this.f7252b;
    }
}
