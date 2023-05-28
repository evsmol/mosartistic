package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ra */
public class C2481Ra implements C2020Fa<C2919eb> {

    /* renamed from: a */
    private final C2371Oa f6561a;

    public C2481Ra() {
        this(new C2371Oa());
    }

    public Object fromModel(Object obj) {
        C3211mf mfVar = new C3211mf();
        mfVar.f8325a = 1;
        mfVar.f8326b = new C3211mf.C3229q();
        C2336Na<C3211mf.C3226n, C2671Vm> a = this.f6561a.fromModel(((C2919eb) obj).f7738b);
        mfVar.f8326b.f8378a = (C3211mf.C3226n) a.f6259a;
        return Collections.singletonList(new C2336Na(mfVar, C2643Um.m8747a(a)));
    }

    public Object toModel(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    C2481Ra(C2371Oa oa) {
        this.f6561a = oa;
    }
}
