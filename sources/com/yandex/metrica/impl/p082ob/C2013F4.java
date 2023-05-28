package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2416P3;

/* renamed from: com.yandex.metrica.impl.ob.F4 */
public class C2013F4<T, C extends C2416P3> {

    /* renamed from: a */
    private final C2230K4<T> f5404a;

    /* renamed from: com.yandex.metrica.impl.ob.F4$a */
    protected interface C2014a<T> {
        /* renamed from: a */
        boolean mo15777a(T t, C2851c0 c0Var);
    }

    protected C2013F4(C2230K4<T> k4, C c) {
        this.f5404a = k4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15776a(C2851c0 c0Var, C2014a<T> aVar) {
        for (Object a : this.f5404a.mo15815a(c0Var.mo17346o()).mo15851a()) {
            if (aVar.mo15777a(a, c0Var)) {
                return true;
            }
        }
        return false;
    }
}
