package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.B9 */
public final class C1887B9 implements ProtobufConverter<C3601w0, C2121If.C2130g> {
    /* renamed from: a */
    public C3601w0 toModel(C2121If.C2130g gVar) {
        return new C3601w0(gVar.f5626a);
    }

    public Object fromModel(Object obj) {
        C2121If.C2130g gVar = new C2121If.C2130g();
        gVar.f5626a = ((C3601w0) obj).mo18350a();
        return gVar;
    }
}
