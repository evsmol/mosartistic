package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.hj */
public class C3038hj implements C2843bj {

    /* renamed from: a */
    private final C2830b9 f8000a;

    public C3038hj(C2830b9 b9Var) {
        this.f8000a = b9Var;
    }

    /* renamed from: a */
    public String mo17312a() {
        C2673W0 u = this.f8000a.mo17293u();
        String str = !TextUtils.isEmpty(u.f7065a) ? u.f7065a : null;
        if (str != null) {
            return str;
        }
        String n = this.f8000a.mo17280n((String) null);
        return !TextUtils.isEmpty(n) ? n : str;
    }
}
