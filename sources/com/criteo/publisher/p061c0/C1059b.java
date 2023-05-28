package com.criteo.publisher.p061c0;

import com.criteo.publisher.model.C1267n;
import com.criteo.publisher.model.C1268o;
import com.criteo.publisher.model.C1271r;
import com.criteo.publisher.model.C1272s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.criteo.publisher.c0.b */
/* compiled from: CompositeBidLifecycleListener */
public class C1059b implements C1058a {

    /* renamed from: a */
    private final List<C1058a> f3462a = new ArrayList();

    /* renamed from: a */
    public void mo3077a(C1058a aVar) {
        this.f3462a.add(aVar);
    }

    /* renamed from: a */
    public void mo3071a() {
        for (C1058a a : this.f3462a) {
            a.mo3071a();
        }
    }

    /* renamed from: a */
    public void mo3073a(C1268o oVar) {
        for (C1058a a : this.f3462a) {
            a.mo3073a(oVar);
        }
    }

    /* renamed from: a */
    public void mo3074a(C1268o oVar, C1271r rVar) {
        for (C1058a a : this.f3462a) {
            a.mo3074a(oVar, rVar);
        }
    }

    /* renamed from: a */
    public void mo3075a(C1268o oVar, Exception exc) {
        for (C1058a a : this.f3462a) {
            a.mo3075a(oVar, exc);
        }
    }

    /* renamed from: a */
    public void mo3072a(C1267n nVar, C1272s sVar) {
        for (C1058a a : this.f3462a) {
            a.mo3072a(nVar, sVar);
        }
    }

    /* renamed from: a */
    public void mo3076a(C1272s sVar) {
        for (C1058a a : this.f3462a) {
            a.mo3076a(sVar);
        }
    }
}
