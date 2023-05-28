package com.ironsource.mediationsdk.adunit.p128b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.e */
public final class C4566e extends C4567f {
    public C4566e(C4563d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo33757a() {
        mo33763a(C4561b.AUCTION_REQUEST);
    }

    /* renamed from: a */
    public final void mo33758a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        mo33764a(C4561b.AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public final void mo33759a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        mo33764a(C4561b.AUCTION_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo33760a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        mo33764a(C4561b.AUCTION_REQUEST_WATERFALL, hashMap);
    }

    /* renamed from: b */
    public final void mo33761b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        mo33764a(C4561b.AUCTION_RESULT_WATERFALL, hashMap);
    }

    /* renamed from: c */
    public final void mo33762c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, str);
        mo33764a(C4561b.AD_UNIT_CAPPED, hashMap);
    }
}
