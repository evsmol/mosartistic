package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.t9 */
public class C3502t9 implements ProtobufConverter<C3044i, C2121If.C2125b> {
    /* renamed from: a */
    public C3044i toModel(C2121If.C2125b bVar) {
        return new C3044i(bVar.f5612a, bVar.f5613b);
    }

    public Object fromModel(Object obj) {
        C3044i iVar = (C3044i) obj;
        C2121If.C2125b bVar = new C2121If.C2125b();
        bVar.f5612a = iVar.f8020a;
        bVar.f5613b = iVar.f8021b;
        return bVar;
    }
}
