package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C3211mf;

/* renamed from: com.yandex.metrica.impl.ob.Ca */
public class C1919Ca implements Converter<C2597Ua, C2336Na<C3211mf.C3214c, C2671Vm>> {

    /* renamed from: a */
    private final C2183Ja f5165a;

    /* renamed from: b */
    private final C1983Ea f5166b;

    /* renamed from: c */
    private final C2115Ia f5167c;

    /* renamed from: d */
    private final C2304Ma f5168d;

    public C1919Ca() {
        this(new C2183Ja(), new C1983Ea(), new C2115Ia(), new C2304Ma());
    }

    /* renamed from: a */
    public C2336Na<C3211mf.C3214c, C2671Vm> fromModel(C2597Ua ua) {
        C2336Na<C3211mf.C3225m, C2671Vm> na;
        C3211mf.C3214c cVar = new C3211mf.C3214c();
        C2336Na<C3211mf.C3223k, C2671Vm> a = this.f5165a.fromModel(ua.f6873a);
        cVar.f8335a = (C3211mf.C3223k) a.f6259a;
        cVar.f8337c = this.f5166b.fromModel(ua.f6874b);
        C2336Na<C3211mf.C3222j, C2671Vm> a2 = this.f5167c.fromModel(ua.f6875c);
        cVar.f8338d = (C3211mf.C3222j) a2.f6259a;
        C2800ab abVar = ua.f6876d;
        if (abVar != null) {
            na = this.f5168d.fromModel(abVar);
            cVar.f8336b = (C3211mf.C3225m) na.f6259a;
        } else {
            na = null;
        }
        return new C2336Na<>(cVar, C2643Um.m8747a(a, a2, na));
    }

    public Object toModel(Object obj) {
        C2336Na na = (C2336Na) obj;
        throw new UnsupportedOperationException();
    }

    C1919Ca(C2183Ja ja, C1983Ea ea, C2115Ia ia, C2304Ma ma) {
        this.f5165a = ja;
        this.f5166b = ea;
        this.f5167c = ia;
        this.f5168d = ma;
    }
}
