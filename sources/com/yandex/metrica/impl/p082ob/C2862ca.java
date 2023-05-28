package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.ca */
public class C2862ca implements ProtobufConverter<C3040hl, C2121If.C2152v> {

    /* renamed from: a */
    private final C2831ba f7577a;

    public C2862ca() {
        this(new C2831ba());
    }

    /* renamed from: a */
    public C2121If.C2152v fromModel(C3040hl hlVar) {
        C2121If.C2152v vVar = new C2121If.C2152v();
        vVar.f5728a = hlVar.f8003a;
        vVar.f5729b = hlVar.f8004b;
        vVar.f5730c = hlVar.f8005c;
        vVar.f5731d = hlVar.f8006d;
        vVar.f5736i = hlVar.f8007e;
        vVar.f5737j = hlVar.f8008f;
        vVar.f5738k = hlVar.f8009g;
        vVar.f5739l = hlVar.f8010h;
        vVar.f5741n = hlVar.f8011i;
        vVar.f5742o = hlVar.f8012j;
        vVar.f5732e = hlVar.f8013k;
        vVar.f5733f = hlVar.f8014l;
        vVar.f5734g = hlVar.f8015m;
        vVar.f5735h = hlVar.f8016n;
        vVar.f5743p = hlVar.f8017o;
        vVar.f5740m = this.f7577a.fromModel(hlVar.f8018p);
        return vVar;
    }

    C2862ca(C2831ba baVar) {
        this.f7577a = baVar;
    }

    /* renamed from: a */
    public C3040hl toModel(C2121If.C2152v vVar) {
        C2121If.C2152v vVar2 = vVar;
        boolean z = vVar2.f5728a;
        return new C3040hl(z, vVar2.f5729b, vVar2.f5730c, vVar2.f5731d, vVar2.f5736i, vVar2.f5737j, vVar2.f5738k, vVar2.f5739l, vVar2.f5741n, vVar2.f5742o, vVar2.f5732e, vVar2.f5733f, vVar2.f5734g, vVar2.f5735h, vVar2.f5743p, this.f7577a.toModel(vVar2.f5740m));
    }
}
