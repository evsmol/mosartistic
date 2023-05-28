package com.ironsource.mediationsdk.adunit.p128b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.h */
public final class C4569h extends C4567f {
    public C4569h(C4563d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo33768a(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        mo33764a(C4561b.LOAD_AD_NO_FILL, hashMap);
    }

    /* renamed from: a */
    public final void mo33769a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        mo33764a(C4561b.LOAD_AD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo33770a(long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.valueOf(z));
        }
        mo33764a(C4561b.LOAD_AD_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public final void mo33771a(boolean z) {
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.valueOf(z));
        }
        mo33764a(C4561b.LOAD_AD, hashMap);
    }

    /* renamed from: a */
    public final void mo33772a(boolean z, long j, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (z2) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired");
        }
        mo33764a(z ? C4561b.AD_AVAILABILITY_CHANGED_TRUE : C4561b.AD_AVAILABILITY_CHANGED_FALSE, hashMap);
    }

    /* renamed from: b */
    public final void mo33773b(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        mo33764a(C4561b.LOAD_AD_FAILED_WITH_REASON, hashMap);
    }
}
