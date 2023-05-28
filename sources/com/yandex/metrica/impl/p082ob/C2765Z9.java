package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.Z9 */
public class C2765Z9 implements ProtobufConverter<C3512ti, C2121If.C2149s> {
    /* renamed from: a */
    public C3512ti toModel(C2121If.C2149s sVar) {
        return new C3512ti(sVar.f5723a);
    }

    public Object fromModel(Object obj) {
        C2121If.C2149s sVar = new C2121If.C2149s();
        sVar.f5723a = ((C3512ti) obj).f9164a;
        return sVar;
    }
}
