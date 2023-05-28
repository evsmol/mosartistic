package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C3211mf;

/* renamed from: com.yandex.metrica.impl.ob.Aa */
public class C1860Aa implements Converter<C2516Sa, C2336Na<C3211mf.C3212a, C2671Vm>> {

    /* renamed from: a */
    private final C1983Ea f5035a;

    /* renamed from: b */
    private final C3136kn f5036b;

    public C1860Aa() {
        this(new C1983Ea(), new C3136kn(20));
    }

    /* renamed from: a */
    public C2336Na<C3211mf.C3212a, C2671Vm> fromModel(C2516Sa sa) {
        C3211mf.C3212a aVar = new C3211mf.C3212a();
        aVar.f8333b = this.f5035a.fromModel(sa.f6629a);
        C3011gn<String, C2671Vm> a = this.f5036b.mo17691a(sa.f6630b);
        aVar.f8332a = C2814b.m9072b((String) a.f7938a);
        return new C2336Na<>(aVar, C2643Um.m8747a(a));
    }

    public Object toModel(Object obj) {
        C2336Na na = (C2336Na) obj;
        throw new UnsupportedOperationException();
    }

    C1860Aa(C1983Ea ea, C3136kn knVar) {
        this.f5035a = ea;
        this.f5036b = knVar;
    }
}
