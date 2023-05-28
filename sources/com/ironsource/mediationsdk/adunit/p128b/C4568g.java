package com.ironsource.mediationsdk.adunit.p128b;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.g */
public final class C4568g extends C4567f {
    public C4568g(C4563d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo33766a() {
        mo33763a(C4561b.INIT_STARTED);
    }

    /* renamed from: a */
    public final void mo33767a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        mo33764a(C4561b.INIT_ENDED, hashMap);
    }
}
