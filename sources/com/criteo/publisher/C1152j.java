package com.criteo.publisher;

import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.p063e0.C1076c;

/* renamed from: com.criteo.publisher.j */
/* compiled from: ConsumableBidLoader */
public class C1152j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1195g f3659a = C1197h.m5407b(getClass());

    /* renamed from: b */
    private final C1071e f3660b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1146i f3661c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1076c f3662d;

    public C1152j(C1071e eVar, C1146i iVar, C1076c cVar) {
        this.f3660b = eVar;
        this.f3661c = iVar;
        this.f3662d = cVar;
    }

    /* renamed from: com.criteo.publisher.j$a */
    /* compiled from: ConsumableBidLoader */
    class C1153a implements C1069d {

        /* renamed from: a */
        final /* synthetic */ AdUnit f3663a;

        /* renamed from: b */
        final /* synthetic */ BidResponseListener f3664b;

        C1153a(AdUnit adUnit, BidResponseListener bidResponseListener) {
            this.f3663a = adUnit;
            this.f3664b = bidResponseListener;
        }

        /* renamed from: a */
        public void mo3034a(C1272s sVar) {
            m5281a(new Bid(this.f3663a.getAdUnitType(), C1152j.this.f3661c, sVar));
        }

        /* renamed from: a */
        public void mo3033a() {
            m5281a((Bid) null);
        }

        /* renamed from: a */
        private void m5281a(Bid bid) {
            C1152j.this.f3659a.mo3337a(C1080f.m5022a(this.f3663a, bid));
            C1152j.this.f3662d.mo3126a(new Runnable(bid) {
                public final /* synthetic */ Bid f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    BidResponseListener.this.onResponse(this.f$1);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo3249a(AdUnit adUnit, ContextData contextData, BidResponseListener bidResponseListener) {
        this.f3660b.mo3113a(adUnit, contextData, new C1153a(adUnit, bidResponseListener));
    }
}
