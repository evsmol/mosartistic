package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.Y9 */
public final class C2738Y9 implements ProtobufConverter<C3483si, C2121If.C2148r> {
    /* renamed from: a */
    public C3483si toModel(C2121If.C2148r rVar) {
        return new C3483si(rVar.f5722a);
    }

    public Object fromModel(Object obj) {
        C2121If.C2148r rVar = new C2121If.C2148r();
        rVar.f5722a = ((C3483si) obj).mo18215a();
        return rVar;
    }
}
