package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.G9 */
public class C2055G9 implements ProtobufConverter<C2713Xb, C2121If.C2134k.C2135a.C2136a> {

    /* renamed from: a */
    private final C2019F9 f5449a;

    public C2055G9() {
        this(new C2019F9());
    }

    /* renamed from: a */
    public C2121If.C2134k.C2135a.C2136a fromModel(C2713Xb xb) {
        C2121If.C2134k.C2135a.C2136a aVar = new C2121If.C2134k.C2135a.C2136a();
        C2456Qc qc = xb.f7171a;
        aVar.f5677a = qc.f6525a;
        aVar.f5678b = qc.f6526b;
        C2685Wb wb = xb.f7172b;
        if (wb != null) {
            this.f5449a.getClass();
            C2121If.C2134k.C2135a.C2136a.C2137a aVar2 = new C2121If.C2134k.C2135a.C2136a.C2137a();
            aVar2.f5680a = wb.f7085a;
            aVar2.f5681b = wb.f7086b;
            aVar.f5679c = aVar2;
        }
        return aVar;
    }

    C2055G9(C2019F9 f9) {
        this.f5449a = f9;
    }

    /* renamed from: a */
    public C2713Xb toModel(C2121If.C2134k.C2135a.C2136a aVar) {
        C2685Wb wb;
        C2121If.C2134k.C2135a.C2136a.C2137a aVar2 = aVar.f5679c;
        if (aVar2 != null) {
            this.f5449a.getClass();
            wb = new C2685Wb(aVar2.f5680a, aVar2.f5681b);
        } else {
            wb = null;
        }
        return new C2713Xb(new C2456Qc(aVar.f5677a, aVar.f5678b), wb);
    }
}
