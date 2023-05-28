package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.J9 */
public class C2182J9 implements ProtobufConverter<C2776Zh, C2121If.C2133j> {
    /* renamed from: a */
    public C2776Zh toModel(C2121If.C2133j jVar) {
        return new C2776Zh(jVar.f5656a);
    }

    public Object fromModel(Object obj) {
        C2121If.C2133j jVar = new C2121If.C2133j();
        jVar.f5656a = ((C2776Zh) obj).f7283a;
        return jVar;
    }
}
