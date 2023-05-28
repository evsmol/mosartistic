package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.p082ob.C2947fa;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.e5 */
public class C2913e5 extends C2702X4 {

    /* renamed from: b */
    private final C1922Cd f7702b;

    /* renamed from: c */
    private final ProtobufStateStorage<C3507td> f7703c;

    /* renamed from: d */
    private final C1840A f7704d;

    /* renamed from: e */
    private final C3562v f7705e;

    /* renamed from: f */
    private final C3638x f7706f;

    public C2913e5(C2259L3 l3, C1922Cd cd) {
        this(l3, cd, C2947fa.C2949b.m9536a(C3507td.class).mo17592a(l3.mo16129g()), new C1840A(l3.mo16129g()), new C3562v(), new C3638x(l3.mo16129g()));
    }

    /* renamed from: a */
    public boolean mo16069a(C2851c0 c0Var) {
        C3507td tdVar;
        C2259L3 a = mo17012a();
        a.mo16127e().toString();
        if (!a.mo16145x().mo17236k() || !a.mo16112A()) {
            return false;
        }
        C3507td tdVar2 = (C3507td) this.f7703c.read();
        List<C1892Bd> list = tdVar2.f9149a;
        C3714z zVar = tdVar2.f9150b;
        C3714z a2 = this.f7704d.mo15407a();
        List<String> list2 = tdVar2.f9151c;
        List<String> a3 = this.f7706f.mo18386a();
        List<C1892Bd> a4 = this.f7702b.mo15587a(mo17012a().mo16129g(), list);
        if (a4 != null || !C1848A2.m6810a((Object) zVar, (Object) a2) || !C2814b.m9069a((Collection<?>) list2, (Collection<?>) a3)) {
            if (a4 != null) {
                list = a4;
            }
            tdVar = new C3507td(list, a2, a3);
        } else {
            tdVar = null;
        }
        if (tdVar != null) {
            a.mo16140r().mo17151e(C2851c0.m9222a(c0Var, tdVar.f9149a, tdVar.f9150b, this.f7705e, tdVar.f9151c));
            this.f7703c.save(tdVar);
            return false;
        } else if (!a.mo16116E()) {
            return false;
        } else {
            a.mo16140r().mo17151e(C2851c0.m9222a(c0Var, tdVar2.f9149a, tdVar2.f9150b, this.f7705e, tdVar2.f9151c));
            return false;
        }
    }

    C2913e5(C2259L3 l3, C1922Cd cd, ProtobufStateStorage<C3507td> protobufStateStorage, C1840A a, C3562v vVar, C3638x xVar) {
        super(l3);
        this.f7702b = cd;
        this.f7703c = protobufStateStorage;
        this.f7704d = a;
        this.f7705e = vVar;
        this.f7706f = xVar;
    }
}
