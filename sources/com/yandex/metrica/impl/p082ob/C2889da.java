package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;

/* renamed from: com.yandex.metrica.impl.ob.da */
public class C2889da implements ProtobufConverter<C3634wl, C2121If.C2153w> {

    /* renamed from: a */
    private final C2831ba f7634a;

    public C2889da() {
        this(new C2831ba());
    }

    /* renamed from: a */
    public C2121If.C2153w fromModel(C3634wl wlVar) {
        C2121If.C2153w wVar = new C2121If.C2153w();
        wVar.f5744a = wlVar.f9414a;
        wVar.f5745b = wlVar.f9415b;
        wVar.f5746c = wlVar.f9416c;
        wVar.f5747d = wlVar.f9417d;
        wVar.f5748e = wlVar.f9418e;
        wVar.f5749f = wlVar.f9419f;
        wVar.f5750g = wlVar.f9420g;
        wVar.f5751h = this.f7634a.fromModel(wlVar.f9421h);
        return wVar;
    }

    C2889da(C2831ba baVar) {
        this.f7634a = baVar;
    }

    /* renamed from: a */
    public C3634wl toModel(C2121If.C2153w wVar) {
        return new C3634wl(wVar.f5744a, wVar.f5745b, wVar.f5746c, wVar.f5747d, wVar.f5748e, wVar.f5749f, wVar.f5750g, this.f7634a.toModel(wVar.f5751h));
    }
}
