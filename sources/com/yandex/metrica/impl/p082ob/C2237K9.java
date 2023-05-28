package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.K9 */
public class C2237K9 implements ProtobufConverter<C3208mc, C2121If.C2134k.C2135a> {

    /* renamed from: a */
    private final C2055G9 f5967a;

    /* renamed from: b */
    private final C2114I9 f5968b;

    public C2237K9() {
        this(new C2055G9(), new C2114I9());
    }

    /* renamed from: a */
    public C2121If.C2134k.C2135a fromModel(C3208mc mcVar) {
        C2121If.C2134k.C2135a aVar = new C2121If.C2134k.C2135a();
        aVar.f5660a = mcVar.f8307a;
        aVar.f5661b = mcVar.f8308b;
        aVar.f5662c = mcVar.f8309c;
        aVar.f5663d = mcVar.f8310d;
        aVar.f5664e = mcVar.f8311e;
        aVar.f5665f = mcVar.f8312f;
        aVar.f5666g = mcVar.f8313g;
        aVar.f5669j = mcVar.f8314h;
        aVar.f5667h = mcVar.f8315i;
        aVar.f5668i = mcVar.f8316j;
        aVar.f5675p = mcVar.f8317k;
        aVar.f5676q = mcVar.f8318l;
        C2713Xb xb = mcVar.f8319m;
        if (xb != null) {
            aVar.f5670k = this.f5967a.fromModel(xb);
        }
        C2713Xb xb2 = mcVar.f8320n;
        if (xb2 != null) {
            aVar.f5671l = this.f5967a.fromModel(xb2);
        }
        C2713Xb xb3 = mcVar.f8321o;
        if (xb3 != null) {
            aVar.f5672m = this.f5967a.fromModel(xb3);
        }
        C2713Xb xb4 = mcVar.f8322p;
        if (xb4 != null) {
            aVar.f5673n = this.f5967a.fromModel(xb4);
        }
        C2864cc ccVar = mcVar.f8323q;
        if (ccVar != null) {
            aVar.f5674o = this.f5968b.fromModel(ccVar);
        }
        return aVar;
    }

    C2237K9(C2055G9 g9, C2114I9 i9) {
        this.f5967a = g9;
        this.f5968b = i9;
    }

    /* renamed from: a */
    public C3208mc toModel(C2121If.C2134k.C2135a aVar) {
        C2121If.C2134k.C2135a aVar2 = aVar;
        C2121If.C2134k.C2135a.C2136a aVar3 = aVar2.f5670k;
        C2864cc ccVar = null;
        C2713Xb a = aVar3 != null ? this.f5967a.toModel(aVar3) : null;
        C2121If.C2134k.C2135a.C2136a aVar4 = aVar2.f5671l;
        C2713Xb a2 = aVar4 != null ? this.f5967a.toModel(aVar4) : null;
        C2121If.C2134k.C2135a.C2136a aVar5 = aVar2.f5672m;
        C2713Xb a3 = aVar5 != null ? this.f5967a.toModel(aVar5) : null;
        C2121If.C2134k.C2135a.C2136a aVar6 = aVar2.f5673n;
        C2713Xb a4 = aVar6 != null ? this.f5967a.toModel(aVar6) : null;
        C2121If.C2134k.C2135a.C2138b bVar = aVar2.f5674o;
        if (bVar != null) {
            ccVar = this.f5968b.toModel(bVar);
        }
        return new C3208mc(aVar2.f5660a, aVar2.f5661b, aVar2.f5662c, aVar2.f5663d, aVar2.f5664e, aVar2.f5665f, aVar2.f5666g, aVar2.f5669j, aVar2.f5667h, aVar2.f5668i, aVar2.f5675p, aVar2.f5676q, a, a2, a3, a4, ccVar);
    }
}
