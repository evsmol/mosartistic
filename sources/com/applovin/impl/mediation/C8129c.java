package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8568f;

/* renamed from: com.applovin.impl.mediation.c */
public class C8129c {

    /* renamed from: a */
    private final C8490n f19804a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8626v f19805b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8131a f19806c;

    /* renamed from: d */
    private C8568f f19807d;

    /* renamed from: com.applovin.impl.mediation.c$a */
    public interface C8131a {
        /* renamed from: c */
        void mo56263c(C8072c cVar);
    }

    C8129c(C8490n nVar, C8131a aVar) {
        this.f19804a = nVar;
        this.f19805b = nVar.mo57320D();
        this.f19806c = aVar;
    }

    /* renamed from: a */
    public void mo56292a() {
        if (C8626v.m26252a()) {
            this.f19805b.mo57818b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        C8568f fVar = this.f19807d;
        if (fVar != null) {
            fVar.mo57699a();
            this.f19807d = null;
        }
    }

    /* renamed from: a */
    public void mo56293a(final C8072c cVar, long j) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f19805b;
            vVar.mo57818b("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.f19807d = C8568f.m26077a(j, this.f19804a, new Runnable() {
            public void run() {
                C8626v unused = C8129c.this.f19805b;
                if (C8626v.m26252a()) {
                    C8129c.this.f19805b.mo57818b("AdHiddenCallbackTimeoutManager", "Timing out...");
                }
                C8129c.this.f19806c.mo56263c(cVar);
            }
        });
    }
}
