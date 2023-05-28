package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;

/* renamed from: com.yandex.metrica.impl.ob.N6 */
public class C2332N6 implements Converter<C2085H6, byte[]> {

    /* renamed from: a */
    private final C2367O6<C2085H6> f6245a;

    public C2332N6() {
        this(new C2367O6(new C2706X6()));
    }

    /* renamed from: a */
    public byte[] mo16340a(C2085H6 h6) {
        return this.f6245a.mo16381a(h6);
    }

    public Object fromModel(Object obj) {
        return this.f6245a.mo16381a((C2085H6) obj);
    }

    public Object toModel(Object obj) {
        byte[] bArr = (byte[]) obj;
        throw new UnsupportedOperationException();
    }

    C2332N6(C2367O6<C2085H6> o6) {
        this.f6245a = o6;
    }
}
