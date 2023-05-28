package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.jc */
public class C3096jc {

    /* renamed from: a */
    private final C2555T7 f8164a;

    /* renamed from: b */
    private final C2659Vb f8165b;

    public C3096jc(Context context) {
        this(C3093ja.m9805a(context).mo17743e(), new C2659Vb(context));
    }

    /* renamed from: a */
    public void mo17762a(C3155lc lcVar) {
        String a = this.f8165b.mo16972a(lcVar);
        if (!TextUtils.isEmpty(a)) {
            this.f8164a.mo15983a(lcVar.mo17816d(), a);
        }
    }

    C3096jc(C2555T7 t7, C2659Vb vb) {
        this.f8164a = t7;
        this.f8165b = vb;
    }
}
