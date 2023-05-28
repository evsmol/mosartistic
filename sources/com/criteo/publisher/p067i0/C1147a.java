package com.criteo.publisher.p067i0;

import p152ms.p153bd.p154o.Pgl.C5643c;

/* renamed from: com.criteo.publisher.i0.a */
/* compiled from: Integration.kt */
public enum C1147a {
    FALLBACK(235),
    STANDALONE(295),
    IN_HOUSE(296),
    MOPUB_MEDIATION(297),
    ADMOB_MEDIATION(298),
    MOPUB_APP_BIDDING(299),
    GAM_APP_BIDDING(C5643c.COLLECT_MODE_FINANCE),
    CUSTOM_APP_BIDDING(301);
    

    /* renamed from: a */
    private final int f3655a;

    private C1147a(int i) {
        this.f3655a = i;
    }

    /* renamed from: a */
    public final int mo3243a() {
        return this.f3655a;
    }
}
