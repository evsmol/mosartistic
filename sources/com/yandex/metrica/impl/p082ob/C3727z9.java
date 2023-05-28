package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.z9 */
public class C3727z9 implements ProtobufConverter<C3392qa, C2121If.C2128e> {
    /* renamed from: a */
    public C3392qa toModel(C2121If.C2128e eVar) {
        return new C3392qa(eVar.f5621a, eVar.f5622b);
    }

    public Object fromModel(Object obj) {
        C3392qa qaVar = (C3392qa) obj;
        C2121If.C2128e eVar = new C2121If.C2128e();
        eVar.f5621a = qaVar.f8722a;
        eVar.f5622b = qaVar.f8723b;
        return eVar;
    }
}
