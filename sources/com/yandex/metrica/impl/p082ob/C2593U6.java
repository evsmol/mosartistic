package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;

/* renamed from: com.yandex.metrica.impl.ob.U6 */
public class C2593U6 implements ProtobufConverter<C1947D6, C3099jf> {
    /* renamed from: a */
    public C3099jf fromModel(C1947D6 d6) {
        C3099jf jfVar = new C3099jf();
        String a = d6.mo15619a();
        String str = jfVar.f8169a;
        if (a == null) {
            a = str;
        }
        jfVar.f8169a = a;
        String c = d6.mo15621c();
        String str2 = jfVar.f8170b;
        if (c == null) {
            c = str2;
        }
        jfVar.f8170b = c;
        Integer d = d6.mo15622d();
        Integer valueOf = Integer.valueOf(jfVar.f8171c);
        if (d == null) {
            d = valueOf;
        }
        jfVar.f8171c = d.intValue();
        Integer b = d6.mo15620b();
        Integer valueOf2 = Integer.valueOf(jfVar.f8174f);
        if (b == null) {
            b = valueOf2;
        }
        jfVar.f8174f = b.intValue();
        String e = d6.mo15623e();
        String str3 = jfVar.f8172d;
        if (e == null) {
            e = str3;
        }
        jfVar.f8172d = e;
        Boolean f = d6.mo15624f();
        Boolean valueOf3 = Boolean.valueOf(jfVar.f8173e);
        if (f == null) {
            f = valueOf3;
        }
        jfVar.f8173e = f.booleanValue();
        return jfVar;
    }

    public Object toModel(Object obj) {
        C3099jf jfVar = (C3099jf) obj;
        throw new UnsupportedOperationException();
    }
}
