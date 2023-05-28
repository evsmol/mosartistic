package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p082ob.C3351pf;

/* renamed from: com.yandex.metrica.impl.ob.bd */
public class C2834bd {

    /* renamed from: a */
    private final C2659Vb f7470a;

    /* renamed from: b */
    private final C2802ad f7471b;

    public C2834bd(C2659Vb vb, C2802ad adVar) {
        this.f7470a = vb;
        this.f7471b = adVar;
    }

    /* renamed from: a */
    public C3351pf.C3353b mo17302a(long j, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C2091Hc b = this.f7470a.mo16973b(j, str);
                if (b != null) {
                    return this.f7471b.mo17185a(b);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
