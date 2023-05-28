package com.ironsource.mediationsdk.adunit.p128b;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.b.i */
public final class C4570i extends C4567f {
    public C4570i(C4563d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public final void mo33774a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    /* renamed from: a */
    public final void mo33775a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        mo33764a(C4561b.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    /* renamed from: a */
    public final void mo33776a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, hashMap);
    }

    /* renamed from: b */
    public final void mo33777b(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    /* renamed from: b */
    public final void mo33778b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, hashMap);
    }

    /* renamed from: c */
    public final void mo33779c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, hashMap);
    }

    /* renamed from: d */
    public final void mo33780d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_BIDDING_DATA_MISSING, hashMap);
    }

    /* renamed from: e */
    public final void mo33781e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, hashMap);
    }

    /* renamed from: f */
    public final void mo33782f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, hashMap);
    }

    /* renamed from: g */
    public final void mo33783g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: h */
    public final void mo33784h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, hashMap);
    }

    /* renamed from: i */
    public final void mo33785i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, hashMap);
    }

    /* renamed from: j */
    public final void mo33786j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, hashMap);
    }

    /* renamed from: k */
    public final void mo33787k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, hashMap);
    }

    /* renamed from: l */
    public final void mo33788l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_INTERNAL_ERROR, hashMap);
    }

    /* renamed from: m */
    public final void mo33789m(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, hashMap);
    }

    /* renamed from: n */
    public final void mo33790n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        mo33764a(C4561b.TROUBLESHOOTING_WATERFALL_OVERHEAD, hashMap);
    }
}
