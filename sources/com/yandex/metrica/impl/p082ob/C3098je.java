package com.yandex.metrica.impl.p082ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.je */
public class C3098je implements C2060Ge {

    /* renamed from: a */
    private final C1965Dm f8167a;

    public C3098je() {
        this(new C1965Dm());
    }

    C3098je(C1965Dm dm) {
        this.f8167a = dm;
    }

    /* renamed from: a */
    public byte[] mo15563a(C3397qe qeVar, C2275Lg lg) {
        byte[] bArr = new byte[0];
        String str = qeVar.f8740b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        return this.f8167a.mo15638a(qeVar.f8756r).mo15474a(bArr);
    }
}
