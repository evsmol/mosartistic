package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.W9 */
public class C2683W9 implements ProtobufConverter<C2900di, C2121If.C2147q> {
    /* renamed from: a */
    public C2121If.C2147q fromModel(C2900di diVar) {
        C2121If.C2147q qVar = new C2121If.C2147q();
        qVar.f5712a = diVar.f7673a;
        qVar.f5713b = diVar.f7674b;
        qVar.f5715d = C2814b.m9070a(diVar.f7675c);
        qVar.f5714c = C2814b.m9070a(diVar.f7676d);
        qVar.f5716e = diVar.f7677e;
        qVar.f5717f = diVar.f7678f;
        qVar.f5718g = diVar.f7679g;
        qVar.f5719h = diVar.f7680h;
        qVar.f5720i = diVar.f7681i;
        qVar.f5721j = diVar.f7682j;
        return qVar;
    }

    /* renamed from: a */
    public C2900di toModel(C2121If.C2147q qVar) {
        C2121If.C2147q qVar2 = qVar;
        return new C2900di(qVar2.f5712a, qVar2.f5713b, C2814b.m9064a(qVar2.f5715d), C2814b.m9064a(qVar2.f5714c), qVar2.f5716e, qVar2.f5717f, qVar2.f5718g, qVar2.f5719h, qVar2.f5720i, qVar2.f5721j);
    }
}
