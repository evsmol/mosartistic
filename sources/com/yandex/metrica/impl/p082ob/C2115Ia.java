package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ia */
public class C2115Ia implements Converter<C2712Xa, C2336Na<C3211mf.C3222j, C2671Vm>> {

    /* renamed from: a */
    private final C1860Aa f5553a;

    /* renamed from: b */
    private final C2961fb f5554b;

    public C2115Ia() {
        this(new C1860Aa(), new C2961fb(30));
    }

    /* renamed from: a */
    public C2336Na<C3211mf.C3222j, C2671Vm> fromModel(C2712Xa xa) {
        int i;
        C3211mf.C3222j jVar = new C3211mf.C3222j();
        C2336Na<C3211mf.C3212a, C2671Vm> a = this.f5553a.fromModel(xa.f7169a);
        jVar.f8356a = (C3211mf.C3212a) a.f6259a;
        C3011gn<List<T>, C2727Xm> a2 = this.f5554b.mo17691a(xa.f7170b);
        if (!C1848A2.m6814b((Collection) a2.f7938a)) {
            jVar.f8357b = new C3211mf.C3212a[((List) a2.f7938a).size()];
            i = 0;
            for (int i2 = 0; i2 < ((List) a2.f7938a).size(); i2++) {
                C2336Na<C3211mf.C3212a, C2671Vm> a3 = this.f5553a.fromModel((C2516Sa) ((List) a2.f7938a).get(i2));
                jVar.f8357b[i2] = (C3211mf.C3212a) a3.f6259a;
                i += a3.f6260b.mo16355a();
            }
        } else {
            i = 0;
        }
        return new C2336Na<>(jVar, C2643Um.m8747a(a, a2, new C2643Um(i)));
    }

    public Object toModel(Object obj) {
        C2336Na na = (C2336Na) obj;
        throw new UnsupportedOperationException();
    }

    C2115Ia(C1860Aa aa, C2961fb fbVar) {
        this.f5553a = aa;
        this.f5554b = fbVar;
    }
}
