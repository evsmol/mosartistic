package com.yandex.metrica.impl.p082ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ud */
public class C3541ud implements C3618wd {

    /* renamed from: a */
    private final C3618wd f9202a;

    /* renamed from: b */
    private final C3618wd f9203b;

    /* renamed from: com.yandex.metrica.impl.ob.ud$a */
    public static class C3542a {

        /* renamed from: a */
        private C3618wd f9204a;

        /* renamed from: b */
        private C3618wd f9205b;

        public C3542a(C3618wd wdVar, C3618wd wdVar2) {
            this.f9204a = wdVar;
            this.f9205b = wdVar2;
        }

        /* renamed from: a */
        public C3542a mo18261a(C3356pi piVar) {
            this.f9205b = new C2023Fd(piVar.mo17951E());
            return this;
        }

        /* renamed from: a */
        public C3542a mo18262a(boolean z) {
            this.f9204a = new C3662xd(z);
            return this;
        }

        /* renamed from: a */
        public C3541ud mo18263a() {
            return new C3541ud(this.f9204a, this.f9205b);
        }
    }

    C3541ud(C3618wd wdVar, C3618wd wdVar2) {
        this.f9202a = wdVar;
        this.f9203b = wdVar2;
    }

    /* renamed from: b */
    public static C3542a m10775b() {
        return new C3542a(new C3662xd(false), new C2023Fd((List<C1892Bd>) null));
    }

    /* renamed from: a */
    public boolean mo15785a(String str) {
        return this.f9203b.mo15785a(str) && this.f9202a.mo15785a(str);
    }

    public String toString() {
        return "AskForPermissionsStrategy{mLocationFlagStrategy=" + this.f9202a + ", mStartupStateStrategy=" + this.f9203b + '}';
    }

    /* renamed from: a */
    public C3542a mo18259a() {
        return new C3542a(this.f9202a, this.f9203b);
    }
}
