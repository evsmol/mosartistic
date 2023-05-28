package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.w9 */
public class C3612w9 implements ProtobufConverter<C2435Ph, C2121If.C2126c> {
    /* renamed from: a */
    public C2121If.C2126c fromModel(C2435Ph ph) {
        C2121If.C2126c cVar = new C2121If.C2126c();
        cVar.f5614a = ph.f6483a;
        cVar.f5615b = ph.f6484b;
        cVar.f5616c = ph.f6485c;
        cVar.f5617d = ph.f6486d;
        return cVar;
    }

    /* renamed from: a */
    public C2435Ph toModel(C2121If.C2126c cVar) {
        return new C2435Ph(cVar.f5614a, cVar.f5615b, cVar.f5616c, cVar.f5617d);
    }
}
