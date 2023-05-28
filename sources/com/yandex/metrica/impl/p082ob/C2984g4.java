package com.yandex.metrica.impl.p082ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.g4 */
public abstract class C2984g4 implements C3116k4 {

    /* renamed from: a */
    private final C2701X3 f7886a;

    /* renamed from: b */
    private final C2660Vc f7887b;

    public C2984g4(Context context, C2701X3 x3) {
        this(context, x3, new C2660Vc(C3580vc.m10884a(context), C2081H2.m7295a(context), C2007F0.m7154g().mo15756s()));
    }

    /* renamed from: a */
    public void mo17622a(C2851c0 c0Var, C1941D3 d3) {
        mo17624b(c0Var, d3);
    }

    /* renamed from: b */
    public C2701X3 mo17623b() {
        return this.f7886a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo17624b(C2851c0 c0Var, C1941D3 d3);

    /* renamed from: c */
    public C2660Vc mo17625c() {
        return this.f7887b;
    }

    /* renamed from: a */
    public void mo17621a() {
        this.f7886a.mo17011b(this);
        this.f7887b.mo16977b(this);
    }

    C2984g4(Context context, C2701X3 x3, C2660Vc vc) {
        context.getApplicationContext();
        this.f7886a = x3;
        this.f7887b = vc;
        x3.mo17010a((C3116k4) this);
        vc.mo16975a((Object) this);
    }
}
