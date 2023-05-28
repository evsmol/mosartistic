package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ba */
public class C1888Ba implements C2020Fa<C2558Ta> {

    /* renamed from: a */
    private final C1919Ca f5098a;

    public C1888Ba() {
        this(new C1919Ca());
    }

    public Object fromModel(Object obj) {
        C2558Ta ta = (C2558Ta) obj;
        C3211mf mfVar = new C3211mf();
        mfVar.f8329e = new C3211mf.C3213b();
        C2336Na<C3211mf.C3214c, C2671Vm> a = this.f5098a.fromModel(ta.f6779c);
        mfVar.f8329e.f8334a = (C3211mf.C3214c) a.f6259a;
        mfVar.f8325a = ta.f6778b;
        return Collections.singletonList(new C2336Na(mfVar, C2643Um.m8747a(a)));
    }

    public Object toModel(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    C1888Ba(C1919Ca ca) {
        this.f5098a = ca;
    }
}
