package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;

/* renamed from: com.yandex.metrica.impl.ob.O5 */
class C2366O5 implements ProtobufConverter<C2331N5, C1865Af> {
    C2366O5() {
    }

    /* renamed from: a */
    public C1865Af fromModel(C2331N5 n5) {
        C1865Af af = new C1865Af();
        af.f5044d = new int[n5.mo16335b().size()];
        int i = 0;
        for (Integer intValue : n5.mo16335b()) {
            af.f5044d[i] = intValue.intValue();
            i++;
        }
        af.f5043c = n5.mo16337c();
        af.f5042b = n5.mo16338d();
        af.f5041a = n5.mo16339e();
        return af;
    }

    /* renamed from: a */
    public C2331N5 toModel(C1865Af af) {
        return new C2331N5(af.f5041a, af.f5042b, af.f5043c, C1848A2.m6804a(af.f5044d));
    }
}
