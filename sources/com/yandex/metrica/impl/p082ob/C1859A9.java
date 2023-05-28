package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.A9 */
public class C1859A9 implements ProtobufConverter<C3437ra, C2121If.C2129f> {

    /* renamed from: a */
    private final C3727z9 f5034a;

    public C1859A9() {
        this(new C3727z9());
    }

    /* renamed from: a */
    public C2121If.C2129f fromModel(C3437ra raVar) {
        C2121If.C2129f fVar = new C2121If.C2129f();
        fVar.f5623a = m6848a(raVar.f9003a);
        fVar.f5624b = m6848a(raVar.f9004b);
        fVar.f5625c = m6848a(raVar.f9005c);
        return fVar;
    }

    public Object toModel(Object obj) {
        C2121If.C2129f fVar = (C2121If.C2129f) obj;
        return new C3437ra(m6849a(fVar.f5623a), m6849a(fVar.f5624b), m6849a(fVar.f5625c));
    }

    C1859A9(C3727z9 z9Var) {
        this.f5034a = z9Var;
    }

    /* renamed from: a */
    public C3437ra mo15451a(C2121If.C2129f fVar) {
        return new C3437ra(m6849a(fVar.f5623a), m6849a(fVar.f5624b), m6849a(fVar.f5625c));
    }

    /* renamed from: a */
    private C2121If.C2128e m6848a(C3392qa qaVar) {
        if (qaVar == null) {
            return null;
        }
        this.f5034a.getClass();
        C2121If.C2128e eVar = new C2121If.C2128e();
        eVar.f5621a = qaVar.f8722a;
        eVar.f5622b = qaVar.f8723b;
        return eVar;
    }

    /* renamed from: a */
    private C3392qa m6849a(C2121If.C2128e eVar) {
        if (eVar == null) {
            return null;
        }
        return this.f5034a.toModel(eVar);
    }
}
