package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.In */
public final class C2167In {

    /* renamed from: a */
    private final boolean f5806a;

    /* renamed from: b */
    private final String f5807b;

    private C2167In(C2252Kn<?> kn, boolean z, String str) {
        kn.getClass();
        this.f5806a = z;
        this.f5807b = str;
    }

    /* renamed from: a */
    public final String mo15964a() {
        return this.f5807b;
    }

    /* renamed from: b */
    public final boolean mo15965b() {
        return this.f5806a;
    }

    /* renamed from: a */
    public static final C2167In m7452a(C2252Kn<?> kn) {
        return new C2167In(kn, true, "");
    }

    /* renamed from: a */
    public static final C2167In m7453a(C2252Kn<?> kn, String str) {
        return new C2167In(kn, false, str);
    }
}
