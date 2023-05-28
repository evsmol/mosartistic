package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.b5 */
public class C2822b5 extends C2702X4 {

    /* renamed from: b */
    private final C2299M5 f7419b;

    public C2822b5(C2259L3 l3) {
        this(l3, l3.mo16132j());
    }

    /* renamed from: a */
    public boolean mo16069a(C2851c0 c0Var) {
        if (TextUtils.isEmpty(c0Var.mo17338g())) {
            return false;
        }
        c0Var.mo17322a(this.f7419b.mo16262a(c0Var.mo17338g()));
        return false;
    }

    C2822b5(C2259L3 l3, C2299M5 m5) {
        super(l3);
        this.f7419b = m5;
    }
}
