package com.appodeal.ads.segments;

import com.appodeal.ads.C9203h0;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;

/* renamed from: com.appodeal.ads.segments.q */
public final class C9509q {
    /* renamed from: a */
    public static final void m28139a(C9499k kVar) {
        StringBuilder a = C9203h0.m27334a("matched segment #");
        a.append(kVar.f24113a);
        a.append(" (default - ");
        a.append(kVar.f24113a == -1);
        a.append("): ");
        a.append(kVar.f24114b.f24118a);
        Log.log("Segment", LogConstants.EVENT_SET, a.toString());
    }
}
