package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Dm */
public class C1965Dm {

    /* renamed from: a */
    private final C2780Zl<C2004Em, C1933Cm> f5254a;

    /* renamed from: b */
    private final C2780Zl<C2788a1, C1933Cm> f5255b;

    public C1965Dm() {
        this(new C1872Am(), new C2034Fm(), new C3674xm());
    }

    /* renamed from: a */
    public C1933Cm mo15638a(C2004Em em) {
        return this.f5254a.mo17126a(em);
    }

    public C1965Dm(C1933Cm cm, C1933Cm cm2, C1933Cm cm3) {
        C2780Zl<C2004Em, C1933Cm> zl = new C2780Zl<>(cm);
        this.f5254a = zl;
        zl.mo17128a(C2004Em.NONE, cm);
        zl.mo17128a(C2004Em.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, cm2);
        zl.mo17128a(C2004Em.AES_VALUE_ENCRYPTION, cm3);
        C2780Zl<C2788a1, C1933Cm> zl2 = new C2780Zl<>(cm);
        this.f5255b = zl2;
        zl2.mo17128a(C2788a1.EVENT_TYPE_IDENTITY, cm3);
    }

    /* renamed from: a */
    public C1933Cm mo15639a(C2851c0 c0Var) {
        return this.f5255b.mo17126a(C2788a1.m8989a(c0Var.mo17346o()));
    }
}
