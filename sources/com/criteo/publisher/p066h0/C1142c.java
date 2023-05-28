package com.criteo.publisher.p066h0;

import com.criteo.publisher.Bid;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.p067i0.C1150c;
import java.util.List;

/* renamed from: com.criteo.publisher.h0.c */
/* compiled from: HeaderBidding */
public class C1142c {

    /* renamed from: a */
    private final C1195g f3640a = C1197h.m5407b(C1142c.class);

    /* renamed from: b */
    private final List<C1143d> f3641b;

    /* renamed from: c */
    private final C1150c f3642c;

    public C1142c(List<C1143d> list, C1150c cVar) {
        this.f3641b = list;
        this.f3642c = cVar;
    }

    /* renamed from: a */
    public void mo3240a(Object obj, Bid bid) {
        C1272s sVar;
        this.f3640a.mo3337a(C1136a.m5227a(bid));
        if (obj != null) {
            for (C1143d next : this.f3641b) {
                if (next.mo3237b(obj)) {
                    this.f3642c.mo3246a(next.mo3232a());
                    if (bid == null) {
                        sVar = null;
                    } else {
                        sVar = bid.mo2940b();
                    }
                    next.mo3234a(obj);
                    if (sVar == null) {
                        this.f3640a.mo3337a(C1136a.m5228a(next.mo3232a()));
                        return;
                    } else {
                        next.mo3235a(obj, bid.mo2941c(), sVar);
                        return;
                    }
                }
            }
        }
        this.f3640a.mo3337a(C1136a.m5230a(obj));
    }
}
