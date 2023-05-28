package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Oa */
public class C2371Oa implements Converter<C2832bb, C2336Na<C3211mf.C3226n, C2671Vm>> {

    /* renamed from: a */
    private final C2089Ha f6304a;

    /* renamed from: b */
    private final C1951Da f6305b;

    /* renamed from: c */
    private final C3136kn f6306c;

    /* renamed from: d */
    private final C3136kn f6307d;

    public C2371Oa() {
        this(new C2089Ha(), new C1951Da(), new C3136kn(100), new C3136kn(1000));
    }

    /* renamed from: a */
    public C2336Na<C3211mf.C3226n, C2671Vm> fromModel(C2832bb bbVar) {
        C2336Na<C3211mf.C3215d, C2671Vm> na;
        C3211mf.C3226n nVar = new C3211mf.C3226n();
        C3011gn<String, C2671Vm> a = this.f6306c.mo17691a(bbVar.f7466a);
        nVar.f8370a = C2814b.m9072b((String) a.f7938a);
        List<String> list = bbVar.f7467b;
        C2336Na<C3211mf.C3220i, C2671Vm> na2 = null;
        if (list != null) {
            na = this.f6305b.fromModel(list);
            nVar.f8371b = (C3211mf.C3215d) na.f6259a;
        } else {
            na = null;
        }
        C3011gn<String, C2671Vm> a2 = this.f6307d.mo17691a(bbVar.f7468c);
        nVar.f8372c = C2814b.m9072b((String) a2.f7938a);
        Map<String, String> map = bbVar.f7469d;
        if (map != null) {
            na2 = this.f6304a.fromModel(map);
            nVar.f8373d = (C3211mf.C3220i) na2.f6259a;
        }
        return new C2336Na<>(nVar, C2643Um.m8747a(a, na, a2, na2));
    }

    public Object toModel(Object obj) {
        C2336Na na = (C2336Na) obj;
        throw new UnsupportedOperationException();
    }

    C2371Oa(C2089Ha ha, C1951Da da, C3136kn knVar, C3136kn knVar2) {
        this.f6304a = ha;
        this.f6305b = da;
        this.f6306c = knVar;
        this.f6307d = knVar2;
    }
}
