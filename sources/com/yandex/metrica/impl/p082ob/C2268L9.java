package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.L9 */
public class C2268L9 implements ProtobufConverter<C3316oc, C2121If.C2134k> {

    /* renamed from: a */
    private final C2237K9 f6055a;

    /* renamed from: b */
    private final C2303M9 f6056b;

    public C2268L9() {
        this(new C2237K9(), new C2303M9());
    }

    /* renamed from: a */
    public C2121If.C2134k fromModel(C3316oc ocVar) {
        C2121If.C2134k kVar = new C2121If.C2134k();
        kVar.f5658a = this.f6055a.fromModel(ocVar.f8509a);
        kVar.f5659b = this.f6056b.fromModel(ocVar.f8510b);
        return kVar;
    }

    C2268L9(C2237K9 k9, C2303M9 m9) {
        this.f6055a = k9;
        this.f6056b = m9;
    }

    /* renamed from: a */
    public C3316oc toModel(C2121If.C2134k kVar) {
        C2237K9 k9 = this.f6055a;
        C2121If.C2134k.C2135a aVar = kVar.f5658a;
        C2121If.C2134k.C2135a aVar2 = new C2121If.C2134k.C2135a();
        if (aVar == null) {
            aVar = aVar2;
        }
        C3208mc a = k9.toModel(aVar);
        C2303M9 m9 = this.f6056b;
        C2121If.C2134k.C2140b bVar = kVar.f5659b;
        C2121If.C2134k.C2140b bVar2 = new C2121If.C2134k.C2140b();
        if (bVar == null) {
            bVar = bVar2;
        }
        return new C3316oc(a, m9.toModel(bVar));
    }
}
