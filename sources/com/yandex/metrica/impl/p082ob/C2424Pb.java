package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Looper;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.Pb */
public abstract class C2424Pb {

    /* renamed from: a */
    protected final C2917e9 f6432a;

    /* renamed from: b */
    protected final C1921Cc f6433b;

    /* renamed from: c */
    protected final C2038G1 f6434c;

    /* renamed from: d */
    private final C2994gc f6435d;

    /* renamed from: e */
    private final C2305Mb f6436e;

    /* renamed from: f */
    private final C2337Nb f6437f;

    public C2424Pb(C1921Cc cc, C2917e9 e9Var, C2038G1 g1) {
        this.f6433b = cc;
        this.f6432a = e9Var;
        this.f6434c = g1;
        C2994gc a = mo16449a();
        this.f6435d = a;
        this.f6436e = new C2305Mb(a, mo16452c());
        this.f6437f = new C2337Nb(cc.f5169a.f6632b);
    }

    /* renamed from: a */
    public C1985Ec<C2713Xb> mo16448a(C2425Pc pc, C2713Xb xb) {
        C2517Sb sb = this.f6433b.f5169a;
        Context context = sb.f6631a;
        Looper looper = sb.f6632b.getLooper();
        C1921Cc cc = this.f6433b;
        return new C1985Ec(new C2560Tc(context, looper, cc.f5170b, mo16450a(cc.f5169a.f6633c), mo16451b(), new C3730zc(pc)), this.f6436e, new C2372Ob(this.f6435d, new SystemTimeProvider()), this.f6437f, xb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2994gc mo16449a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C3731zd mo16450a(C3697yd ydVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo16451b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo16452c();
}
