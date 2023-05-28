package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C2531Sh;

/* renamed from: com.yandex.metrica.impl.ob.E9 */
public class C1982E9 implements ProtobufConverter<C2531Sh, C2121If.C2132i> {

    /* renamed from: a */
    private final C2009F1 f5309a;

    public C1982E9() {
        this(new C3163li());
    }

    /* renamed from: a */
    public C2121If.C2132i fromModel(C2531Sh sh) {
        C2121If.C2132i iVar = new C2121If.C2132i();
        iVar.f5635d = sh.f6665d;
        iVar.f5634c = sh.f6664c;
        iVar.f5633b = sh.f6663b;
        iVar.f5632a = sh.f6662a;
        iVar.f5641j = sh.f6666e;
        iVar.f5642k = sh.f6667f;
        iVar.f5636e = sh.f6675n;
        iVar.f5639h = sh.f6679r;
        iVar.f5640i = sh.f6680s;
        iVar.f5649r = sh.f6676o;
        iVar.f5637f = sh.f6677p;
        iVar.f5638g = sh.f6678q;
        iVar.f5644m = sh.f6669h;
        iVar.f5643l = sh.f6668g;
        iVar.f5645n = sh.f6670i;
        iVar.f5646o = sh.f6671j;
        iVar.f5647p = sh.f6673l;
        iVar.f5652u = sh.f6674m;
        iVar.f5648q = sh.f6672k;
        iVar.f5650s = sh.f6681t;
        iVar.f5651t = sh.f6682u;
        iVar.f5653v = sh.f6683v;
        iVar.f5654w = sh.f6684w;
        iVar.f5655x = this.f5309a.mo15762a(sh.f6685x);
        return iVar;
    }

    C1982E9(C2009F1 f1) {
        this.f5309a = f1;
    }

    /* renamed from: a */
    public C2531Sh toModel(C2121If.C2132i iVar) {
        return new C2531Sh(new C2531Sh.C2532a().mo16626d(iVar.f5632a).mo16638p(iVar.f5640i).mo16625c(iVar.f5639h).mo16639q(iVar.f5649r).mo16645w(iVar.f5638g).mo16644v(iVar.f5637f).mo16629g(iVar.f5636e).mo16628f(iVar.f5635d).mo16637o(iVar.f5641j).mo16632j(iVar.f5642k).mo16636n(iVar.f5634c).mo16635m(iVar.f5633b).mo16633k(iVar.f5644m).mo16634l(iVar.f5643l).mo16630h(iVar.f5645n).mo16642t(iVar.f5646o).mo16641s(iVar.f5647p).mo16643u(iVar.f5652u).mo16640r(iVar.f5648q).mo16622a(iVar.f5650s).mo16624b(iVar.f5651t).mo16631i(iVar.f5653v).mo16627e(iVar.f5654w).mo16621a(this.f5309a.mo15763a(iVar.f5655x)));
    }
}
