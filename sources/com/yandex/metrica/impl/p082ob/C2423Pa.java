package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Pa */
public class C2423Pa implements C2020Fa<C2863cb> {

    /* renamed from: a */
    private final C2371Oa f6430a;

    /* renamed from: b */
    private final C2183Ja f6431b;

    public C2423Pa() {
        this(new C2371Oa(), new C2183Ja());
    }

    public Object fromModel(Object obj) {
        C2863cb cbVar = (C2863cb) obj;
        C3211mf mfVar = new C3211mf();
        mfVar.f8325a = 2;
        mfVar.f8327c = new C3211mf.C3227o();
        C2336Na<C3211mf.C3226n, C2671Vm> a = this.f6430a.fromModel(cbVar.f7579c);
        mfVar.f8327c.f8375b = (C3211mf.C3226n) a.f6259a;
        C2336Na<C3211mf.C3223k, C2671Vm> a2 = this.f6431b.fromModel(cbVar.f7578b);
        mfVar.f8327c.f8374a = (C3211mf.C3223k) a2.f6259a;
        return Collections.singletonList(new C2336Na(mfVar, C2643Um.m8747a(a, a2)));
    }

    public Object toModel(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    C2423Pa(C2371Oa oa, C2183Ja ja) {
        this.f6430a = oa;
        this.f6431b = ja;
    }
}
