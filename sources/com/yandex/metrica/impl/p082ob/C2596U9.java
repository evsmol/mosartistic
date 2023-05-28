package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.U9 */
public class C2596U9 implements ProtobufConverter<C2871ci, C2121If.C2146p> {
    /* renamed from: a */
    public C2121If.C2146p fromModel(C2871ci ciVar) {
        C2121If.C2146p pVar = new C2121If.C2146p();
        pVar.f5708a = ciVar.f7615a;
        pVar.f5709b = ciVar.f7616b;
        pVar.f5710c = ciVar.f7617c;
        pVar.f5711d = ciVar.f7618d;
        return pVar;
    }

    /* renamed from: a */
    public C2871ci toModel(C2121If.C2146p pVar) {
        return new C2871ci(pVar.f5708a, pVar.f5709b, pVar.f5710c, pVar.f5711d);
    }
}
