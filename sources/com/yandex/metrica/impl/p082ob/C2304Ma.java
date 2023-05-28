package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C3211mf;

/* renamed from: com.yandex.metrica.impl.ob.Ma */
public class C2304Ma implements Converter<C2800ab, C2336Na<C3211mf.C3225m, C2671Vm>> {

    /* renamed from: a */
    private final C2371Oa f6157a;

    /* renamed from: b */
    private final C3136kn f6158b;

    /* renamed from: c */
    private final C3136kn f6159c;

    public C2304Ma() {
        this(new C2371Oa(), new C3136kn(100), new C3136kn(2048));
    }

    /* renamed from: a */
    public C2336Na<C3211mf.C3225m, C2671Vm> fromModel(C2800ab abVar) {
        C2336Na<C3211mf.C3226n, C2671Vm> na;
        C3211mf.C3225m mVar = new C3211mf.C3225m();
        C3011gn<String, C2671Vm> a = this.f6158b.mo17691a(abVar.f7386a);
        mVar.f8367a = C2814b.m9072b((String) a.f7938a);
        C3011gn<String, C2671Vm> a2 = this.f6159c.mo17691a(abVar.f7387b);
        mVar.f8368b = C2814b.m9072b((String) a2.f7938a);
        C2832bb bbVar = abVar.f7388c;
        if (bbVar != null) {
            na = this.f6157a.fromModel(bbVar);
            mVar.f8369c = (C3211mf.C3226n) na.f6259a;
        } else {
            na = null;
        }
        return new C2336Na<>(mVar, C2643Um.m8747a(a, a2, na));
    }

    public Object toModel(Object obj) {
        C2336Na na = (C2336Na) obj;
        throw new UnsupportedOperationException();
    }

    C2304Ma(C2371Oa oa, C3136kn knVar, C3136kn knVar2) {
        this.f6157a = oa;
        this.f6158b = knVar;
        this.f6159c = knVar2;
    }
}
