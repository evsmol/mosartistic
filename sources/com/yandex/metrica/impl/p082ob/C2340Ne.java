package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3586vf;

/* renamed from: com.yandex.metrica.impl.ob.Ne */
public abstract class C2340Ne<T> extends C2521Se {

    /* renamed from: f */
    private final T f6270f;

    C2340Ne(int i, String str, T t, C2252Kn<String> kn, C2242Ke ke) {
        super(i, str, kn, ke);
        this.f6270f = t;
    }

    /* renamed from: a */
    public void mo16360a(C2804af afVar) {
        C3586vf.C3587a a;
        if (mo16616e() && (a = mo16613b().mo16083a(afVar, afVar.mo17188a(mo16615d(), mo16614c()), this)) != null) {
            mo16176a(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16176a(C3586vf.C3587a aVar);

    /* renamed from: f */
    public T mo16361f() {
        return this.f6270f;
    }
}
