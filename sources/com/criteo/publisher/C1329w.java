package com.criteo.publisher;

import com.criteo.publisher.model.C1267n;
import com.criteo.publisher.model.C1268o;
import com.criteo.publisher.model.C1271r;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.p061c0.C1058a;
import com.criteo.publisher.p070l0.C1170a;
import com.criteo.publisher.p074n0.C1311o;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.criteo.publisher.w */
/* compiled from: LiveCdbCallListener */
public class C1329w extends C1135h {

    /* renamed from: d */
    private C1069d f4046d;

    /* renamed from: e */
    private final C1071e f4047e;

    /* renamed from: f */
    private final C1267n f4048f;

    /* renamed from: g */
    private final C1058a f4049g;

    /* renamed from: h */
    private final AtomicBoolean f4050h = new AtomicBoolean(false);

    public C1329w(C1069d dVar, C1058a aVar, C1071e eVar, C1267n nVar, C1170a aVar2) {
        super(aVar, eVar, aVar2);
        this.f4046d = dVar;
        this.f4049g = aVar;
        this.f4047e = eVar;
        this.f4048f = nVar;
    }

    /* renamed from: a */
    public void mo3121a(C1268o oVar, C1271r rVar) {
        super.mo3121a(oVar, rVar);
        if (rVar.mo3563b().size() > 1) {
            C1311o.m5779a((Throwable) new IllegalStateException("During a live request, only one bid will be fetched at a time."));
        }
        if (this.f4050h.compareAndSet(false, true)) {
            if (rVar.mo3563b().size() == 1) {
                m5925a(rVar.mo3563b().get(0));
            } else {
                this.f4046d.mo3033a();
            }
            this.f4046d = null;
            return;
        }
        this.f4047e.mo3118b(rVar.mo3563b());
    }

    /* renamed from: a */
    private void m5925a(C1272s sVar) {
        if (this.f4047e.mo3120c(sVar)) {
            this.f4047e.mo3118b((List<C1272s>) Collections.singletonList(sVar));
            this.f4046d.mo3033a();
        } else if (sVar.mo3585o()) {
            this.f4046d.mo3034a(sVar);
            this.f4049g.mo3072a(this.f4048f, sVar);
        } else {
            this.f4046d.mo3033a();
        }
    }

    /* renamed from: a */
    public void mo3231a(C1268o oVar, Exception exc) {
        super.mo3231a(oVar, exc);
        mo3731a();
    }

    /* renamed from: a */
    public void mo3731a() {
        if (this.f4050h.compareAndSet(false, true)) {
            this.f4047e.mo3114a(this.f4048f, this.f4046d);
            this.f4046d = null;
        }
    }
}
