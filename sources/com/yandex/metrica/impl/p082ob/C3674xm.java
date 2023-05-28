package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.xm */
public class C3674xm implements C1933Cm {

    /* renamed from: a */
    private final C3636wm f9478a;

    C3674xm() {
        this(new C3596vm(C2007F0.m7154g().mo15743e()));
    }

    /* renamed from: a */
    public C1904Bm mo15473a(C2851c0 c0Var) {
        String str;
        String q = c0Var.mo17348q();
        if (!TextUtils.isEmpty(q)) {
            try {
                byte[] a = this.f9478a.mo18384a(q.getBytes("UTF-8"));
                if (a != null) {
                    str = Base64.encodeToString(a, 0);
                    return new C1904Bm(c0Var.mo15971f(str), C2004Em.AES_VALUE_ENCRYPTION);
                }
            } catch (Throwable unused) {
            }
        }
        str = null;
        return new C1904Bm(c0Var.mo15971f(str), C2004Em.AES_VALUE_ENCRYPTION);
    }

    C3674xm(C3596vm vmVar) {
        this(new C3636wm("AES/CBC/PKCS5Padding", vmVar.mo18344b(), vmVar.mo18343a()));
    }

    C3674xm(C3636wm wmVar) {
        this.f9478a = wmVar;
    }

    /* renamed from: a */
    public byte[] mo15474a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            byte[] decode = Base64.decode(bArr, 0);
            C3636wm wmVar = this.f9478a;
            wmVar.getClass();
            return wmVar.mo18385a(decode, 0, decode.length);
        } catch (Throwable unused) {
            return bArr2;
        }
    }
}
