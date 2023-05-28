package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ja */
public class C2183Ja implements Converter<C2739Ya, C2336Na<C3211mf.C3223k, C2671Vm>> {

    /* renamed from: a */
    private final C2089Ha f5841a;

    /* renamed from: b */
    private final C2115Ia f5842b;

    /* renamed from: c */
    private final C1951Da f5843c;

    /* renamed from: d */
    private final C2238Ka f5844d;

    /* renamed from: e */
    private final C3136kn f5845e;

    /* renamed from: f */
    private final C3136kn f5846f;

    public C2183Ja() {
        this(new C2089Ha(), new C2115Ia(), new C1951Da(), new C2238Ka(), new C3136kn(100), new C3136kn(1000));
    }

    /* renamed from: a */
    public C2336Na<C3211mf.C3223k, C2671Vm> fromModel(C2739Ya ya) {
        C2336Na<C3211mf.C3215d, C2671Vm> na;
        C2336Na<C3211mf.C3220i, C2671Vm> na2;
        C2336Na<C3211mf.C3222j, C2671Vm> na3;
        C2336Na<C3211mf.C3222j, C2671Vm> na4;
        C3211mf.C3223k kVar = new C3211mf.C3223k();
        C3011gn<String, C2671Vm> a = this.f5845e.mo17691a(ya.f7227a);
        kVar.f8358a = C2814b.m9072b((String) a.f7938a);
        C3011gn<String, C2671Vm> a2 = this.f5846f.mo17691a(ya.f7228b);
        kVar.f8359b = C2814b.m9072b((String) a2.f7938a);
        List<String> list = ya.f7229c;
        C2336Na<C3211mf.C3224l[], C2671Vm> na5 = null;
        if (list != null) {
            na = this.f5843c.fromModel(list);
            kVar.f8360c = (C3211mf.C3215d) na.f6259a;
        } else {
            na = null;
        }
        Map<String, String> map = ya.f7230d;
        if (map != null) {
            na2 = this.f5841a.fromModel(map);
            kVar.f8361d = (C3211mf.C3220i) na2.f6259a;
        } else {
            na2 = null;
        }
        C2712Xa xa = ya.f7231e;
        if (xa != null) {
            na3 = this.f5842b.fromModel(xa);
            kVar.f8362e = (C3211mf.C3222j) na3.f6259a;
        } else {
            na3 = null;
        }
        C2712Xa xa2 = ya.f7232f;
        if (xa2 != null) {
            na4 = this.f5842b.fromModel(xa2);
            kVar.f8363f = (C3211mf.C3222j) na4.f6259a;
        } else {
            na4 = null;
        }
        List<String> list2 = ya.f7233g;
        if (list2 != null) {
            na5 = this.f5844d.fromModel(list2);
            kVar.f8364g = (C3211mf.C3224l[]) na5.f6259a;
        }
        return new C2336Na<>(kVar, C2643Um.m8747a(a, a2, na, na2, na3, na4, na5));
    }

    public Object toModel(Object obj) {
        C2336Na na = (C2336Na) obj;
        throw new UnsupportedOperationException();
    }

    C2183Ja(C2089Ha ha, C2115Ia ia, C1951Da da, C2238Ka ka, C3136kn knVar, C3136kn knVar2) {
        this.f5841a = ha;
        this.f5842b = ia;
        this.f5843c = da;
        this.f5844d = ka;
        this.f5845e = knVar;
        this.f5846f = knVar2;
    }
}
