package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.F9 */
public class C2019F9 implements ProtobufConverter<C2685Wb, C2121If.C2134k.C2135a.C2136a.C2137a> {
    public Object fromModel(Object obj) {
        C2685Wb wb = (C2685Wb) obj;
        C2121If.C2134k.C2135a.C2136a.C2137a aVar = new C2121If.C2134k.C2135a.C2136a.C2137a();
        aVar.f5680a = wb.f7085a;
        aVar.f5681b = wb.f7086b;
        return aVar;
    }

    public Object toModel(Object obj) {
        C2121If.C2134k.C2135a.C2136a.C2137a aVar = (C2121If.C2134k.C2135a.C2136a.C2137a) obj;
        return new C2685Wb(aVar.f5680a, aVar.f5681b);
    }
}
