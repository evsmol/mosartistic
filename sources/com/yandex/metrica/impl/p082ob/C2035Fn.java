package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.Fn */
public class C2035Fn implements C2252Kn<String> {

    /* renamed from: a */
    private final String f5423a;

    public C2035Fn(String str) {
        this.f5423a = str;
    }

    /* renamed from: a */
    public C2167In mo15517a(Object obj) {
        if (!TextUtils.isEmpty((String) obj)) {
            return C2167In.m7452a(this);
        }
        return C2167In.m7453a(this, this.f5423a + " is empty.");
    }
}
