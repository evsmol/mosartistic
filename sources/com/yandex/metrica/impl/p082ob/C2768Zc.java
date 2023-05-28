package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p082ob.C3351pf;

/* renamed from: com.yandex.metrica.impl.ob.Zc */
public class C2768Zc {

    /* renamed from: a */
    private final C2659Vb f7268a;

    /* renamed from: b */
    private final C2741Yc f7269b;

    public C2768Zc(C2659Vb vb, C2741Yc yc) {
        this.f7268a = vb;
        this.f7269b = yc;
    }

    /* renamed from: a */
    public C3351pf.C3352a mo17110a(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C3155lc a = this.f7268a.mo16970a(j, str);
                if (a != null) {
                    return this.f7269b.mo17082a(a);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
