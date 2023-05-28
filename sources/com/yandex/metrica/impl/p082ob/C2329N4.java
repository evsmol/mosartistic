package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2011F3;
import com.yandex.metrica.impl.p082ob.C2013F4;
import com.yandex.metrica.impl.p082ob.C2298M4;

/* renamed from: com.yandex.metrica.impl.ob.N4 */
public class C2329N4<T extends C2298M4, C extends C2011F3> extends C2013F4<T, C> {

    /* renamed from: com.yandex.metrica.impl.ob.N4$a */
    class C2330a implements C2013F4.C2014a<T> {

        /* renamed from: a */
        final /* synthetic */ C3247n4 f6240a;

        C2330a(C2329N4 n4, C3247n4 n4Var) {
            this.f6240a = n4Var;
        }

        /* renamed from: a */
        public boolean mo15777a(Object obj, C2851c0 c0Var) {
            return ((C2298M4) obj).mo16261a(c0Var, this.f6240a);
        }
    }

    public C2329N4(C2230K4<T> k4, C c) {
        super(k4, c);
    }

    /* renamed from: a */
    public boolean mo16331a(C2851c0 c0Var, C3247n4 n4Var) {
        return mo15776a(c0Var, new C2330a(this, n4Var));
    }
}
