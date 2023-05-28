package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.Be */
public class C1893Be implements C2060Ge, C3319oe {
    /* renamed from: a */
    public int mo15460a(C2004Em em) {
        return 2;
    }

    /* renamed from: a */
    public byte[] mo15563a(C3397qe qeVar, C2275Lg lg) {
        if (TextUtils.isEmpty(qeVar.f8740b)) {
            return new byte[0];
        }
        return Base64.decode(qeVar.f8740b, 0);
    }
}
