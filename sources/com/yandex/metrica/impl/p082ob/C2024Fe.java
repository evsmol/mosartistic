package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Fe */
public class C2024Fe implements C2060Ge {

    /* renamed from: a */
    private final C1965Dm f5411a;

    public C2024Fe() {
        this(new C1965Dm());
    }

    C2024Fe(C1965Dm dm) {
        this.f5411a = dm;
    }

    /* renamed from: a */
    public byte[] mo15563a(C3397qe qeVar, C2275Lg lg) {
        byte[] bArr = new byte[0];
        try {
            bArr = C2254L0.m7692a(qeVar.f8740b);
        } catch (Throwable unused) {
        }
        byte[] a = this.f5411a.mo15638a(qeVar.f8756r).mo15474a(bArr);
        return a == null ? new byte[0] : a;
    }
}
