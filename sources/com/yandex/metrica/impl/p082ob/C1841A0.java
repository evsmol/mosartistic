package com.yandex.metrica.impl.p082ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.A0 */
public class C1841A0 {

    /* renamed from: a */
    private final C3525u2 f5015a;

    /* renamed from: b */
    private final C2006F f5016b;

    public C1841A0(Context context) {
        this(new C3525u2(context, "com.yandex.android.appmetrica.build_id"), new C2006F(context, "com.yandex.android.appmetrica.is_offline"));
    }

    /* renamed from: a */
    public String mo15408a() {
        return (String) this.f5015a.mo16943a();
    }

    /* renamed from: b */
    public Boolean mo15409b() {
        return (Boolean) this.f5016b.mo16943a();
    }

    C1841A0(C3525u2 u2Var, C2006F f) {
        this.f5015a = u2Var;
        this.f5016b = f;
    }
}
