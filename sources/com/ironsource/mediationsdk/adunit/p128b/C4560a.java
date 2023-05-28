package com.ironsource.mediationsdk.adunit.p128b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.adunit.b.a */
public final class C4560a extends C4567f {
    public C4560a(C4563d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo33739a() {
        mo33763a(C4561b.SESSION_CAPPED);
    }

    /* renamed from: a */
    public final void mo33740a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo33764a(C4561b.SHOW_AD, hashMap);
    }

    /* renamed from: a */
    public final void mo33741a(String str, int i, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        mo33764a(C4561b.SHOW_AD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo33742a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        mo33764a(C4561b.AD_CLOSED, hashMap);
    }

    /* renamed from: a */
    public final void mo33743a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j2));
        }
        hashMap.putAll(map);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        mo33765a(C4561b.AD_REWARDED, hashMap, j);
    }

    /* renamed from: a */
    public final void mo33744a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z ? "true" : "false");
        mo33764a(C4561b.SHOW_AD_CHANCE, hashMap);
    }

    /* renamed from: b */
    public final void mo33745b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo33764a(C4561b.SHOW_AD_SUCCESS, hashMap);
    }

    /* renamed from: c */
    public final void mo33746c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo33764a(C4561b.AD_OPENED, hashMap);
    }

    /* renamed from: d */
    public final void mo33747d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo33764a(C4561b.AD_CLICKED, hashMap);
    }

    /* renamed from: e */
    public final void mo33748e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo33764a(C4561b.AD_STARTED, hashMap);
    }

    /* renamed from: f */
    public final void mo33749f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo33764a(C4561b.AD_ENDED, hashMap);
    }

    /* renamed from: g */
    public final void mo33750g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo33764a(C4561b.AD_VISIBLE, hashMap);
    }

    /* renamed from: h */
    public final void mo33751h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
        mo33764a(C4561b.PLACEMENT_CAPPED, hashMap);
    }
}
