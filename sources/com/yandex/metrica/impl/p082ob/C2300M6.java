package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C3031hf;

/* renamed from: com.yandex.metrica.impl.ob.M6 */
public class C2300M6 implements ProtobufConverter<C3724z6, C3031hf> {

    /* renamed from: a */
    private final C2510S6 f6153a;

    public C2300M6() {
        this(new C2510S6());
    }

    /* renamed from: a */
    public C3031hf fromModel(C3724z6 z6Var) {
        C3031hf a = this.f6153a.fromModel(z6Var.f9575a);
        a.f7982g = 1;
        C3031hf.C3032a aVar = new C3031hf.C3032a();
        a.f7983h = aVar;
        aVar.f7987a = z6Var.f9576b;
        return a;
    }

    public Object toModel(Object obj) {
        C3031hf hfVar = (C3031hf) obj;
        throw new UnsupportedOperationException();
    }

    C2300M6(C2510S6 s6) {
        this.f6153a = s6;
    }
}
