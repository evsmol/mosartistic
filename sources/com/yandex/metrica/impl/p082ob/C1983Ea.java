package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C3211mf;
import java.math.BigDecimal;
import kotlin.Pair;

/* renamed from: com.yandex.metrica.impl.ob.Ea */
public class C1983Ea implements ProtobufConverter<BigDecimal, C3211mf.C3216e> {
    /* renamed from: a */
    public C3211mf.C3216e fromModel(BigDecimal bigDecimal) {
        Pair a = C2407Ol.m8087a(bigDecimal);
        C2350Nl nl = new C2350Nl(((Number) a.getFirst()).longValue(), ((Number) a.getSecond()).intValue());
        C3211mf.C3216e eVar = new C3211mf.C3216e();
        eVar.f8340a = nl.mo16370b();
        eVar.f8341b = nl.mo16369a();
        return eVar;
    }

    public Object toModel(Object obj) {
        C3211mf.C3216e eVar = (C3211mf.C3216e) obj;
        throw new UnsupportedOperationException();
    }
}
