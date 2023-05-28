package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.I9 */
public class C2114I9 implements ProtobufConverter<C2864cc, C2121If.C2134k.C2135a.C2138b> {

    /* renamed from: a */
    private final C2088H9 f5552a;

    public C2114I9() {
        this(new C2088H9());
    }

    /* renamed from: a */
    public C2121If.C2134k.C2135a.C2138b fromModel(C2864cc ccVar) {
        C2121If.C2134k.C2135a.C2138b bVar = new C2121If.C2134k.C2135a.C2138b();
        C2456Qc qc = ccVar.f7581a;
        bVar.f5682a = qc.f6525a;
        bVar.f5683b = qc.f6526b;
        C2801ac acVar = ccVar.f7582b;
        if (acVar != null) {
            bVar.f5684c = this.f5552a.fromModel(acVar);
        }
        return bVar;
    }

    C2114I9(C2088H9 h9) {
        this.f5552a = h9;
    }

    /* renamed from: a */
    public C2864cc toModel(C2121If.C2134k.C2135a.C2138b bVar) {
        C2121If.C2134k.C2135a.C2138b.C2139a aVar = bVar.f5684c;
        return new C2864cc(new C2456Qc(bVar.f5682a, bVar.f5683b), aVar != null ? this.f5552a.toModel(aVar) : null);
    }
}
