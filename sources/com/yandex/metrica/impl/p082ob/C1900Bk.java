package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Bk */
class C1900Bk {

    /* renamed from: a */
    private final C1870Ak f5124a;

    /* renamed from: b */
    private final C1870Ak f5125b;

    /* renamed from: c */
    private final C1870Ak f5126c;

    /* renamed from: d */
    private final C1870Ak f5127d;

    /* renamed from: com.yandex.metrica.impl.ob.Bk$a */
    static class C1901a {
        C1901a() {
        }
    }

    C1900Bk(C3739zk zkVar, C2972fl flVar) {
        this(new C1870Ak(zkVar.mo18468c(), m6935a(flVar.f7871e)), new C1870Ak(zkVar.mo18467b(), m6935a(flVar.f7872f)), new C1870Ak(zkVar.mo18469d(), m6935a(flVar.f7874h)), new C1870Ak(zkVar.mo18465a(), m6935a(flVar.f7873g)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1870Ak mo15568a() {
        return this.f5127d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1870Ak mo15569b() {
        return this.f5125b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1870Ak mo15570c() {
        return this.f5124a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1870Ak mo15571d() {
        return this.f5126c;
    }

    /* renamed from: a */
    private static int m6935a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    C1900Bk(C1870Ak ak, C1870Ak ak2, C1870Ak ak3, C1870Ak ak4) {
        this.f5124a = ak;
        this.f5125b = ak2;
        this.f5126c = ak3;
        this.f5127d = ak4;
    }
}
