package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.billing_interface.C1798a;
import com.yandex.metrica.billing_interface.C1803e;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C3664xf;

/* renamed from: com.yandex.metrica.impl.ob.a3 */
class C2790a3 implements ProtobufConverter<C1798a, C3664xf.C3665a> {
    C2790a3() {
    }

    /* renamed from: a */
    public C3664xf.C3665a fromModel(C1798a aVar) {
        C3664xf.C3665a aVar2 = new C3664xf.C3665a();
        int ordinal = aVar.f4909a.ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = 2;
        } else if (ordinal == 1) {
            i = 3;
        }
        aVar2.f9462a = i;
        aVar2.f9463b = aVar.f4910b;
        aVar2.f9464c = aVar.f4911c;
        aVar2.f9465d = aVar.f4912d;
        aVar2.f9466e = aVar.f4913e;
        return aVar2;
    }

    /* renamed from: a */
    public C1798a toModel(C3664xf.C3665a aVar) {
        C1803e eVar;
        int i = aVar.f9462a;
        if (i == 2) {
            eVar = C1803e.INAPP;
        } else if (i != 3) {
            eVar = C1803e.UNKNOWN;
        } else {
            eVar = C1803e.SUBS;
        }
        return new C1798a(eVar, aVar.f9463b, aVar.f9464c, aVar.f9465d, aVar.f9466e);
    }
}
