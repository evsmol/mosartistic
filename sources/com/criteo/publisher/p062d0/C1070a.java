package com.criteo.publisher.p062d0;

import com.criteo.publisher.model.AdSize;
import com.criteo.publisher.model.C1267n;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.p074n0.C1288a;
import com.criteo.publisher.p074n0.C1307k;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.criteo.publisher.d0.a */
/* compiled from: SdkCache */
public class C1070a {

    /* renamed from: a */
    private final Map<C1267n, C1272s> f3484a = new HashMap();

    /* renamed from: b */
    private final C1307k f3485b;

    public C1070a(C1307k kVar) {
        this.f3485b = kVar;
    }

    /* renamed from: a */
    public void mo3107a(C1272s sVar) {
        C1267n b = mo3108b(sVar);
        if (b != null) {
            this.f3484a.put(b, sVar);
        }
    }

    /* renamed from: b */
    public C1267n mo3108b(C1272s sVar) {
        String h = sVar.mo3577h();
        if (h == null) {
            return null;
        }
        return new C1267n(new AdSize(sVar.mo3581k(), sVar.mo3573e()), h, m4985c(sVar));
    }

    /* renamed from: c */
    private C1288a m4985c(C1272s sVar) {
        if (sVar.mo3583m()) {
            return C1288a.CRITEO_CUSTOM_NATIVE;
        }
        if (sVar.mo3584n()) {
            return C1288a.CRITEO_REWARDED;
        }
        AdSize a = this.f3485b.mo3656a();
        AdSize a2 = m4984a(a);
        AdSize adSize = new AdSize(sVar.mo3581k(), sVar.mo3573e());
        if (adSize.equals(a) || adSize.equals(a2)) {
            return C1288a.CRITEO_INTERSTITIAL;
        }
        return C1288a.CRITEO_BANNER;
    }

    /* renamed from: a */
    private AdSize m4984a(AdSize adSize) {
        return new AdSize(adSize.getHeight(), adSize.getWidth());
    }

    /* renamed from: a */
    public C1272s mo3106a(C1267n nVar) {
        return this.f3484a.get(nVar);
    }

    /* renamed from: b */
    public void mo3109b(C1267n nVar) {
        this.f3484a.remove(nVar);
    }
}
