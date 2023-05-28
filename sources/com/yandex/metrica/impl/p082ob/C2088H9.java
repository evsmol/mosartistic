package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.gpllibrary.C1811a;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.H9 */
public class C2088H9 implements ProtobufConverter<C2801ac, C2121If.C2134k.C2135a.C2138b.C2139a> {
    /* renamed from: a */
    public C2121If.C2134k.C2135a.C2138b.C2139a fromModel(C2801ac acVar) {
        C2121If.C2134k.C2135a.C2138b.C2139a aVar = new C2121If.C2134k.C2135a.C2138b.C2139a();
        aVar.f5685a = acVar.f7390b;
        aVar.f5686b = acVar.f7391c;
        int ordinal = acVar.f7389a.ordinal();
        int i = 3;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal == 2) {
            i = 2;
        } else if (ordinal != 3) {
            i = 0;
        }
        aVar.f5687c = i;
        return aVar;
    }

    /* renamed from: a */
    public C2801ac toModel(C2121If.C2134k.C2135a.C2138b.C2139a aVar) {
        C1811a.C1813b bVar;
        int i = aVar.f5687c;
        if (i == 1) {
            bVar = C1811a.C1813b.PRIORITY_LOW_POWER;
        } else if (i == 2) {
            bVar = C1811a.C1813b.PRIORITY_BALANCED_POWER_ACCURACY;
        } else if (i != 3) {
            bVar = C1811a.C1813b.PRIORITY_NO_POWER;
        } else {
            bVar = C1811a.C1813b.PRIORITY_HIGH_ACCURACY;
        }
        return new C2801ac(bVar, aVar.f5685a, aVar.f5686b);
    }
}
