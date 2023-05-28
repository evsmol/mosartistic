package com.criteo.publisher.p064f0;

/* renamed from: com.criteo.publisher.f0.x */
/* compiled from: MetricSendingQueueProducer */
public class C1128x {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1124u f3613a;

    public C1128x(C1124u uVar) {
        this.f3613a = uVar;
    }

    /* renamed from: a */
    public void mo3222a(C1118r rVar) {
        for (C1112n e : rVar.mo3205a()) {
            mo3223a(rVar, e.mo3134e());
        }
    }

    /* renamed from: com.criteo.publisher.f0.x$a */
    /* compiled from: MetricSendingQueueProducer */
    class C1129a implements C1116p {
        C1129a() {
        }

        /* renamed from: a */
        public boolean mo3216a(C1112n nVar) {
            return C1128x.this.f3613a.mo3195a(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3223a(C1118r rVar, String str) {
        rVar.mo3206a(str, (C1116p) new C1129a());
    }
}
