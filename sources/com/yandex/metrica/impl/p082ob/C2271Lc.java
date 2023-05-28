package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.Lc */
public class C2271Lc {

    /* renamed from: a */
    protected final C1921Cc f6057a;

    /* renamed from: b */
    private final C2038G1 f6058b;

    /* renamed from: c */
    private final C2117Ic f6059c;

    public C2271Lc(C1921Cc cc) {
        this(cc, new C2038G1());
    }

    /* renamed from: a */
    private C2117Ic m7791a() {
        return new C2117Ic();
    }

    C2271Lc(C1921Cc cc, C2038G1 g1) {
        this.f6057a = cc;
        this.f6058b = g1;
        this.f6059c = m7791a();
    }

    /* renamed from: a */
    public C1985Ec<C2713Xb> mo16167a(C2425Pc pc, C2713Xb xb) {
        C2517Sb sb = this.f6057a.f5169a;
        Context context = sb.f6631a;
        Looper looper = sb.f6632b.getLooper();
        C1921Cc cc = this.f6057a;
        return new C1985Ec(new C2560Tc(context, looper, cc.f5170b, this.f6058b.mo15809c(cc.f5169a.f6633c), "passive", new C3730zc(pc)), this.f6059c, new C2240Kc(), new C2185Jc(), xb);
    }
}
