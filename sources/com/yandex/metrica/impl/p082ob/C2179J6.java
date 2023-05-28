package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;

/* renamed from: com.yandex.metrica.impl.ob.J6 */
public class C2179J6 implements ProtobufConverter<C3607w6, C2894df> {

    /* renamed from: a */
    private C2654V6 f5834a;

    public C2179J6(C2654V6 v6) {
        this.f5834a = v6;
    }

    /* renamed from: a */
    public C2894df fromModel(C3607w6 w6Var) {
        C2894df dfVar = new C2894df();
        C1979E6 e6 = w6Var.f9369a;
        if (e6 != null) {
            dfVar.f7642a = this.f5834a.fromModel(e6);
        }
        dfVar.f7643b = new C3128kf[w6Var.f9370b.size()];
        int i = 0;
        for (C1979E6 a : w6Var.f9370b) {
            dfVar.f7643b[i] = this.f5834a.fromModel(a);
            i++;
        }
        String str = w6Var.f9371c;
        if (str != null) {
            dfVar.f7644c = str;
        }
        return dfVar;
    }

    public Object toModel(Object obj) {
        C2894df dfVar = (C2894df) obj;
        throw new UnsupportedOperationException();
    }
}
