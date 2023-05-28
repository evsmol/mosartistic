package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;

/* renamed from: com.yandex.metrica.impl.ob.K6 */
public class C2232K6 implements ProtobufConverter<C3645x6, C2924ef> {

    /* renamed from: a */
    private final C2179J6 f5957a;

    /* renamed from: b */
    private final C2264L6 f5958b;

    public C2232K6() {
        this(new C2179J6(new C2654V6()), new C2264L6());
    }

    /* renamed from: a */
    public C2924ef fromModel(C3645x6 x6Var) {
        C2924ef efVar = new C2924ef();
        efVar.f7756a = this.f5957a.fromModel(x6Var.f9432a);
        String str = x6Var.f9433b;
        if (str != null) {
            efVar.f7757b = str;
        }
        efVar.f7758c = this.f5958b.mo15762a(x6Var.f9434c);
        return efVar;
    }

    public Object toModel(Object obj) {
        C2924ef efVar = (C2924ef) obj;
        throw new UnsupportedOperationException();
    }

    C2232K6(C2179J6 j6, C2264L6 l6) {
        this.f5957a = j6;
        this.f5958b = l6;
    }
}
