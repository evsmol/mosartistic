package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.Q9 */
public class C2453Q9 implements ProtobufConverter<C2808ai, C2121If.C2143n> {
    public Object fromModel(Object obj) {
        C2808ai aiVar = (C2808ai) obj;
        C2121If.C2143n nVar = new C2121If.C2143n();
        nVar.f5696a = aiVar.f7401a;
        nVar.f5697b = aiVar.f7402b;
        return nVar;
    }

    public Object toModel(Object obj) {
        C2121If.C2143n nVar = (C2121If.C2143n) obj;
        return new C2808ai(nVar.f5696a, nVar.f5697b);
    }
}
