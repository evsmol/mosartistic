package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3460s;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.B3 */
class C1880B3 {

    /* renamed from: a */
    private final HashMap<String, C3460s> f5077a = new HashMap<>();

    C1880B3() {
    }

    /* renamed from: a */
    public synchronized C3460s mo15531a(C2108I3 i3, C2875cm cmVar, C2861c9 c9Var) {
        C3460s sVar;
        sVar = this.f5077a.get(i3.toString());
        if (sVar == null) {
            C3460s.C3461a f = c9Var.mo17391f();
            sVar = new C3460s(f.f9083a, f.f9084b, cmVar);
            this.f5077a.put(i3.toString(), sVar);
        }
        return sVar;
    }
}
