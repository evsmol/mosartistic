package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2013F4;
import com.yandex.metrica.impl.p082ob.C2259L3;
import com.yandex.metrica.impl.p082ob.C2508S4;

/* renamed from: com.yandex.metrica.impl.ob.L4 */
public class C2261L4<T extends C2508S4, C extends C2259L3> extends C2013F4<T, C> {

    /* renamed from: com.yandex.metrica.impl.ob.L4$a */
    class C2262a implements C2013F4.C2014a<T> {
        C2262a(C2261L4 l4) {
        }

        /* renamed from: a */
        public boolean mo15777a(Object obj, C2851c0 c0Var) {
            return ((C2508S4) obj).mo16069a(c0Var);
        }
    }

    public C2261L4(C2230K4<T> k4, C c) {
        super(k4, c);
    }

    /* renamed from: a */
    public boolean mo16148a(C2851c0 c0Var) {
        return mo15776a(c0Var, new C2262a(this));
    }
}
