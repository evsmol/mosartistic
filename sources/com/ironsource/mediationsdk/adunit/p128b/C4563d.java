package com.ironsource.mediationsdk.adunit.p128b;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.p126a.C4525b;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4533d;
import com.ironsource.mediationsdk.p126a.C4537h;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.b.d */
public final class C4563d {

    /* renamed from: a */
    public C4568g f11233a;

    /* renamed from: b */
    public C4569h f11234b;

    /* renamed from: c */
    public C4566e f11235c;

    /* renamed from: d */
    public C4560a f11236d;

    /* renamed from: e */
    public C4570i f11237e;

    /* renamed from: f */
    private final int f11238f = -1;

    /* renamed from: g */
    private IronSource.AD_UNIT f11239g;

    /* renamed from: h */
    private C4565b f11240h;

    /* renamed from: i */
    private C4562c f11241i;

    /* renamed from: j */
    private C4525b f11242j;

    /* renamed from: k */
    private Map<C4561b, C4564a> f11243k;

    /* renamed from: l */
    private Map<C4561b, C4564a> f11244l;

    /* renamed from: com.ironsource.mediationsdk.adunit.b.d$a */
    class C4564a {

        /* renamed from: a */
        private int f11245a;

        /* renamed from: b */
        private int f11246b;

        public C4564a(int i, int i2) {
            this.f11245a = i;
            this.f11246b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo33756a(C4565b bVar) {
            return C4565b.MEDIATION.equals(bVar) ? this.f11245a : this.f11246b;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.adunit.b.d$b */
    public enum C4565b {
        MEDIATION,
        PROVIDER
    }

    public C4563d(IronSource.AD_UNIT ad_unit, C4565b bVar, C4562c cVar) {
        this.f11239g = ad_unit;
        this.f11240h = bVar;
        this.f11241i = cVar;
        this.f11242j = (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) || ad_unit.equals(IronSource.AD_UNIT.OFFERWALL)) ? C4537h.m13193e() : C4533d.m13173e();
        HashMap hashMap = new HashMap();
        this.f11243k = hashMap;
        hashMap.put(C4561b.INIT_STARTED, new C4564a(IronSourceConstants.IS_MANAGER_INIT_STARTED, -1));
        this.f11243k.put(C4561b.INIT_ENDED, new C4564a(IronSourceConstants.IS_MANAGER_INIT_ENDED, -1));
        this.f11243k.put(C4561b.SESSION_CAPPED, new C4564a(-1, IronSourceConstants.IS_CAP_SESSION));
        this.f11243k.put(C4561b.PLACEMENT_CAPPED, new C4564a(IronSourceConstants.IS_CAP_PLACEMENT, -1));
        this.f11243k.put(C4561b.AUCTION_REQUEST, new C4564a(2000, -1));
        this.f11243k.put(C4561b.AUCTION_SUCCESS, new C4564a(IronSourceConstants.IS_AUCTION_SUCCESS, -1));
        this.f11243k.put(C4561b.AUCTION_FAILED, new C4564a(IronSourceConstants.IS_AUCTION_FAILED, -1));
        this.f11243k.put(C4561b.AUCTION_REQUEST_WATERFALL, new C4564a(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1));
        this.f11243k.put(C4561b.AUCTION_RESULT_WATERFALL, new C4564a(IronSourceConstants.IS_RESULT_WATERFALL, -1));
        this.f11243k.put(C4561b.INIT_SUCCESS, new C4564a(-1, -1));
        this.f11243k.put(C4561b.INIT_FAILED, new C4564a(-1, -1));
        this.f11243k.put(C4561b.SHOW_AD_SUCCESS, new C4564a(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
        this.f11243k.put(C4561b.AD_OPENED, new C4564a(-1, IronSourceConstants.IS_INSTANCE_OPENED));
        this.f11243k.put(C4561b.AD_CLOSED, new C4564a(-1, IronSourceConstants.IS_INSTANCE_CLOSED));
        this.f11243k.put(C4561b.AD_CLICKED, new C4564a(-1, 2006));
        this.f11243k.put(C4561b.LOAD_AD, new C4564a(2001, 2002));
        this.f11243k.put(C4561b.LOAD_AD_SUCCESS, new C4564a(2004, 2003));
        this.f11243k.put(C4561b.LOAD_AD_FAILED, new C4564a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.f11243k.put(C4561b.LOAD_AD_NO_FILL, new C4564a(-1, IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.f11243k.put(C4561b.SHOW_AD, new C4564a(2100, IronSourceConstants.IS_INSTANCE_SHOW));
        this.f11243k.put(C4561b.SHOW_AD_SUCCESS, new C4564a(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
        this.f11243k.put(C4561b.SHOW_AD_FAILED, new C4564a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, IronSourceConstants.IS_INSTANCE_SHOW_FAILED));
        this.f11243k.put(C4561b.AD_UNIT_CAPPED, new C4564a(IronSourceConstants.IS_AD_UNIT_CAPPED, -1));
        this.f11243k.put(C4561b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE));
        this.f11243k.put(C4561b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE));
        this.f11243k.put(C4561b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING));
        this.f11243k.put(C4561b.TROUBLESHOOT_BIDDING_DATA_MISSING, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING));
        this.f11243k.put(C4561b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS));
        this.f11243k.put(C4561b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED));
        this.f11243k.put(C4561b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS));
        this.f11243k.put(C4561b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED));
        this.f11243k.put(C4561b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS));
        this.f11243k.put(C4561b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED));
        this.f11243k.put(C4561b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT));
        this.f11243k.put(C4561b.TROUBLESHOOT_INTERNAL_ERROR, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR));
        this.f11243k.put(C4561b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, new C4564a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        this.f11243k.put(C4561b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new C4564a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f11243k.put(C4561b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new C4564a(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR));
        this.f11243k.put(C4561b.TROUBLESHOOT_NOTIFICATION_ERROR, new C4564a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, -1));
        HashMap hashMap2 = new HashMap();
        this.f11244l = hashMap2;
        hashMap2.put(C4561b.INIT_STARTED, new C4564a(IronSourceConstants.RV_MANAGER_INIT_STARTED, -1));
        this.f11244l.put(C4561b.INIT_ENDED, new C4564a(IronSourceConstants.RV_MANAGER_INIT_ENDED, -1));
        this.f11244l.put(C4561b.SESSION_CAPPED, new C4564a(-1, IronSourceConstants.RV_CAP_SESSION));
        this.f11244l.put(C4561b.PLACEMENT_CAPPED, new C4564a(IronSourceConstants.RV_CAP_PLACEMENT, -1));
        this.f11244l.put(C4561b.AUCTION_REQUEST, new C4564a(IronSourceConstants.RV_AUCTION_REQUEST, -1));
        this.f11244l.put(C4561b.AUCTION_SUCCESS, new C4564a(IronSourceConstants.RV_AUCTION_SUCCESS, -1));
        this.f11244l.put(C4561b.AUCTION_FAILED, new C4564a(IronSourceConstants.RV_AUCTION_FAILED, -1));
        this.f11244l.put(C4561b.AUCTION_REQUEST_WATERFALL, new C4564a(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, -1));
        this.f11244l.put(C4561b.AUCTION_RESULT_WATERFALL, new C4564a(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, -1));
        this.f11244l.put(C4561b.INIT_SUCCESS, new C4564a(-1, -1));
        this.f11244l.put(C4561b.INIT_FAILED, new C4564a(-1, -1));
        this.f11244l.put(C4561b.AD_VISIBLE, new C4564a(-1, IronSourceConstants.RV_INSTANCE_VISIBLE));
        this.f11244l.put(C4561b.AD_OPENED, new C4564a(-1, 1005));
        this.f11244l.put(C4561b.AD_CLOSED, new C4564a(-1, IronSourceConstants.RV_INSTANCE_CLOSED));
        this.f11244l.put(C4561b.AD_STARTED, new C4564a(-1, IronSourceConstants.RV_INSTANCE_STARTED));
        this.f11244l.put(C4561b.AD_ENDED, new C4564a(-1, IronSourceConstants.RV_INSTANCE_ENDED));
        this.f11244l.put(C4561b.AD_CLICKED, new C4564a(-1, 1006));
        this.f11244l.put(C4561b.AD_REWARDED, new C4564a(-1, 1010));
        this.f11244l.put(C4561b.AD_AVAILABILITY_CHANGED_TRUE, new C4564a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f11244l.put(C4561b.AD_AVAILABILITY_CHANGED_FALSE, new C4564a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f11244l.put(C4561b.LOAD_AD, new C4564a(1000, 1001));
        this.f11244l.put(C4561b.LOAD_AD_SUCCESS, new C4564a(1003, 1002));
        this.f11244l.put(C4561b.LOAD_AD_FAILED, new C4564a(IronSourceConstants.RV_MEDIATION_LOAD_ERROR, IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.f11244l.put(C4561b.LOAD_AD_FAILED_WITH_REASON, new C4564a(-1, IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f11244l.put(C4561b.LOAD_AD_NO_FILL, new C4564a(-1, IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.f11244l.put(C4561b.SHOW_AD, new C4564a(IronSourceConstants.RV_API_SHOW_CALLED, IronSourceConstants.RV_INSTANCE_SHOW));
        this.f11244l.put(C4561b.SHOW_AD_CHANCE, new C4564a(-1, IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f11244l.put(C4561b.SHOW_AD_FAILED, new C4564a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, IronSourceConstants.RV_INSTANCE_SHOW_FAILED));
        this.f11244l.put(C4561b.AD_UNIT_CAPPED, new C4564a(IronSourceConstants.RV_AD_UNIT_CAPPED, -1));
        this.f11244l.put(C4561b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE));
        this.f11244l.put(C4561b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE));
        this.f11244l.put(C4561b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING));
        this.f11244l.put(C4561b.TROUBLESHOOT_BIDDING_DATA_MISSING, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING));
        this.f11244l.put(C4561b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS));
        this.f11244l.put(C4561b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED));
        this.f11244l.put(C4561b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS));
        this.f11244l.put(C4561b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED));
        this.f11244l.put(C4561b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS));
        this.f11244l.put(C4561b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED));
        this.f11244l.put(C4561b.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f11244l.put(C4561b.TROUBLESHOOT_LOAD_FAILED, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED));
        this.f11244l.put(C4561b.TROUBLESHOOT_INTERNAL_ERROR, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR));
        this.f11244l.put(C4561b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, new C4564a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        this.f11244l.put(C4561b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new C4564a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f11244l.put(C4561b.TROUBLESHOOTING_WATERFALL_OVERHEAD, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD));
        this.f11244l.put(C4561b.TROUBLESHOOT_NOTIFICATION_ERROR, new C4564a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, -1));
        this.f11233a = new C4568g(this);
        this.f11234b = new C4569h(this);
        this.f11235c = new C4566e(this);
        this.f11236d = new C4560a(this);
        this.f11237e = new C4570i(this);
    }

    /* renamed from: a */
    private int m13288a(C4561b bVar) {
        try {
            if (IronSource.AD_UNIT.INTERSTITIAL.equals(this.f11239g) && this.f11243k.containsKey(bVar)) {
                return this.f11243k.get(bVar).mo33756a(this.f11240h);
            }
            if (!IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.f11239g) || !this.f11244l.containsKey(bVar)) {
                return -1;
            }
            return this.f11244l.get(bVar).mo33756a(this.f11240h);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo33753a() {
        this.f11241i = null;
        this.f11235c = null;
        this.f11233a = null;
        this.f11234b = null;
        this.f11236d = null;
        this.f11237e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33754a(C4561b bVar, Map<String, Object> map) {
        mo33755a(bVar, map, System.currentTimeMillis());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33755a(C4561b bVar, Map<String, Object> map, long j) {
        int a = m13288a(bVar);
        if (-1 != a) {
            if (map == null) {
                map = new HashMap<>();
            }
            C4562c cVar = this.f11241i;
            if (cVar != null) {
                map.putAll(cVar.mo33752a(bVar));
            }
            this.f11242j.mo33649b(new C4532c(a, j, new JSONObject(map)));
        }
    }
}
