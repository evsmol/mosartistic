package com.yandex.metrica.impl.p082ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.Fm */
public class C2034Fm implements C1933Cm {
    /* renamed from: a */
    public C1904Bm mo15473a(C2851c0 c0Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public byte[] mo15474a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}
