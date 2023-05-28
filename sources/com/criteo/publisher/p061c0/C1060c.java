package com.criteo.publisher.p061c0;

import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.logging.C1209n;
import com.criteo.publisher.model.C1267n;
import com.criteo.publisher.model.C1268o;
import com.criteo.publisher.model.C1271r;
import com.criteo.publisher.model.C1272s;

/* renamed from: com.criteo.publisher.c0.c */
/* compiled from: LoggingBidLifecycleListener */
public class C1060c implements C1058a {

    /* renamed from: a */
    private final C1195g f3463a = C1197h.m5407b(C1060c.class);

    /* renamed from: b */
    private final C1209n f3464b;

    public C1060c(C1209n nVar) {
        this.f3464b = nVar;
    }

    /* renamed from: a */
    public void mo3071a() {
        this.f3463a.mo3339a("onSdkInitialized", new Object[0]);
        this.f3464b.mo3354a();
    }

    /* renamed from: a */
    public void mo3073a(C1268o oVar) {
        this.f3463a.mo3339a("onCdbCallStarted: %s", oVar);
    }

    /* renamed from: a */
    public void mo3074a(C1268o oVar, C1271r rVar) {
        this.f3463a.mo3339a("onCdbCallFinished: %s", rVar);
    }

    /* renamed from: a */
    public void mo3075a(C1268o oVar, Exception exc) {
        this.f3463a.mo3338a("onCdbCallFailed", (Throwable) exc);
    }

    /* renamed from: a */
    public void mo3072a(C1267n nVar, C1272s sVar) {
        this.f3463a.mo3339a("onBidConsumed: %s", sVar);
    }

    /* renamed from: a */
    public void mo3076a(C1272s sVar) {
        this.f3463a.mo3339a("onBidCached: %s", sVar);
    }
}
