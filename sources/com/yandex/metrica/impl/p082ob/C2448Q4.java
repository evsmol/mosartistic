package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C1941D3;

/* renamed from: com.yandex.metrica.impl.ob.Q4 */
public class C2448Q4 extends C2298M4 {

    /* renamed from: b */
    private final C3464s2 f6515b;

    /* renamed from: c */
    private final C2660Vc f6516c;

    public C2448Q4(C2011F3 f3, C3464s2 s2Var, C2660Vc vc) {
        super(f3);
        this.f6515b = s2Var;
        this.f6516c = vc;
    }

    /* renamed from: a */
    public boolean mo16261a(C2851c0 c0Var, C3247n4 n4Var) {
        C1941D3.C1942a a = n4Var.mo17882b().mo15764a();
        this.f6515b.mo18194a(a.f5213l);
        Boolean bool = a.f5206e;
        Boolean bool2 = a.f5217p;
        Boolean bool3 = Boolean.TRUE;
        if (bool3.equals(bool) || (bool == null && bool3.equals(bool2))) {
            this.f6516c.mo16976a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            this.f6516c.mo16976a(false);
        }
        return false;
    }
}
