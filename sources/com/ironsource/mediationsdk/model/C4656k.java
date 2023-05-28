package com.ironsource.mediationsdk.model;

/* renamed from: com.ironsource.mediationsdk.model.k */
public final class C4656k {

    /* renamed from: a */
    public boolean f11632a;

    /* renamed from: b */
    public boolean f11633b;

    /* renamed from: c */
    public boolean f11634c;

    /* renamed from: d */
    public C4658l f11635d;

    /* renamed from: e */
    public int f11636e;

    /* renamed from: f */
    public int f11637f;

    /* renamed from: com.ironsource.mediationsdk.model.k$a */
    public static class C4657a {

        /* renamed from: a */
        public boolean f11638a = true;

        /* renamed from: b */
        private boolean f11639b = false;

        /* renamed from: c */
        private boolean f11640c = false;

        /* renamed from: d */
        private C4658l f11641d = null;

        /* renamed from: e */
        private int f11642e = 0;

        /* renamed from: f */
        private int f11643f = 0;

        /* renamed from: a */
        public final C4657a mo34035a(boolean z, int i) {
            this.f11640c = z;
            this.f11643f = i;
            return this;
        }

        /* renamed from: a */
        public final C4657a mo34036a(boolean z, C4658l lVar, int i) {
            this.f11639b = z;
            if (lVar == null) {
                lVar = C4658l.PER_DAY;
            }
            this.f11641d = lVar;
            this.f11642e = i;
            return this;
        }

        /* renamed from: a */
        public final C4656k mo34037a() {
            return new C4656k(this.f11638a, this.f11639b, this.f11640c, this.f11641d, this.f11642e, this.f11643f, (byte) 0);
        }
    }

    private C4656k(boolean z, boolean z2, boolean z3, C4658l lVar, int i, int i2) {
        this.f11632a = z;
        this.f11633b = z2;
        this.f11634c = z3;
        this.f11635d = lVar;
        this.f11636e = i;
        this.f11637f = i2;
    }

    /* synthetic */ C4656k(boolean z, boolean z2, boolean z3, C4658l lVar, int i, int i2, byte b) {
        this(z, z2, z3, lVar, i, i2);
    }
}
