package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3454rl;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ik */
class C3066ik {

    /* renamed from: a */
    private final List<Object> f8063a;

    C3066ik(List<Object> list) {
        this.f8063a = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3454rl.C3456b mo17716a(String str) {
        Iterator<Object> it = this.f8063a.iterator();
        while (it.hasNext()) {
            C1932Cl cl = (C1932Cl) it.next();
            if (cl.mo15595a(str)) {
                return cl.mo15594a();
            }
        }
        return null;
    }
}
