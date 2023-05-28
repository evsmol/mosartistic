package com.appodeal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.appodeal.ads.C9313n;
import com.appodeal.ads.C9420r;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.utils.ExchangeAd;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.campaign_frequency.C9615a;
import com.appodeal.ads.utils.campaign_frequency.C9616b;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.l */
public abstract class C9258l<AdRequestType extends C9420r, UnifiedAdType extends UnifiedAd, UnifiedAdParamsType extends UnifiedAdParams, UnifiedAdCallbackType extends UnifiedAdCallback> implements C9138c0 {

    /* renamed from: a */
    public final AdRequestType f23267a;

    /* renamed from: b */
    public final AdNetwork f23268b;

    /* renamed from: c */
    public C9191f5 f23269c;

    /* renamed from: d */
    public String f23270d;

    /* renamed from: e */
    public final ArrayList f23271e = new ArrayList();

    /* renamed from: f */
    public UnifiedAdType f23272f;

    /* renamed from: g */
    public UnifiedAdParamsType f23273g;

    /* renamed from: h */
    public UnifiedAdCallbackType f23274h;

    /* renamed from: i */
    public ExchangeAd f23275i;

    /* renamed from: j */
    public C9616b f23276j;

    /* renamed from: k */
    public JSONObject f23277k;

    /* renamed from: l */
    public int f23278l = 1;

    /* renamed from: m */
    public final int f23279m;

    /* renamed from: n */
    public long f23280n;

    /* renamed from: o */
    public long f23281o;

    /* renamed from: p */
    public long f23282p;

    /* renamed from: q */
    public long f23283q;

    /* renamed from: r */
    public boolean f23284r = false;

    /* renamed from: com.appodeal.ads.l$a */
    public interface C9259a<AdRequestType extends C9420r> {
    }

    public C9258l(C9420r rVar, AdNetwork adNetwork, @Deprecated C9162d0 d0Var, int i) {
        this.f23267a = rVar;
        this.f23268b = adNetwork;
        this.f23269c = d0Var;
        this.f23270d = adNetwork.getName();
        this.f23279m = i;
    }

    /* renamed from: a */
    public abstract UnifiedAdType mo60071a(AdNetwork adNetwork);

    /* renamed from: a */
    public abstract UnifiedAdParamsType mo60072a(int i);

    /* renamed from: a */
    public final void mo60095a(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("exchange_ad")) {
                this.f23275i = (ExchangeAd) bundle.getParcelable("exchange_ad");
            }
            String string = bundle.getString("id");
            if (!TextUtils.isEmpty(string)) {
                this.f23269c.mo59875a(string);
            }
            if (bundle.containsKey("demand_source")) {
                this.f23270d = bundle.getString("demand_source");
            }
            if (bundle.containsKey("ecpm")) {
                this.f23269c.mo59873a(bundle.getDouble("ecpm"));
            }
            if (bundle.containsKey("additional_stats")) {
                try {
                    this.f23277k = new JSONObject(bundle.getString("additional_stats"));
                } catch (Throwable th) {
                    Log.log(th);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo60097a(ContextProvider contextProvider, UnifiedAdParamsType unifiedadparamstype, Object obj, UnifiedAdCallbackType unifiedadcallbacktype, UnifiedAdType unifiedadtype) {
        unifiedadtype.load(contextProvider, unifiedadparamstype, obj, unifiedadcallbacktype);
    }

    /* renamed from: a */
    public final void mo60098a(String str, double d) {
        if (this.f23272f != null && !mo60103f() && !this.f23284r) {
            this.f23284r = true;
            this.f23272f.onMediationLoss(str, d);
        }
    }

    /* renamed from: a */
    public final void mo60099a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("target_placements");
        this.f23271e.clear();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f23271e.add(optJSONArray.optString(i));
            }
        }
    }

    /* renamed from: b */
    public final void mo59876b() {
        this.f23269c.mo59876b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[Catch:{ Exception -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050 A[Catch:{ Exception -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094 A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9 A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b6 A[Catch:{ Exception -> 0x00c3 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60100b(int r7) {
        /*
            r6 = this;
            com.appodeal.ads.utils.ExchangeAd r0 = r6.f23275i
            if (r0 == 0) goto L_0x0007
            r0.trackImpression(r7)
        L_0x0007:
            com.appodeal.ads.utils.campaign_frequency.b r7 = r6.f23276j
            if (r7 == 0) goto L_0x00c7
            com.appodeal.ads.context.b r0 = com.appodeal.ads.context.C9148b.f22956b
            com.appodeal.ads.context.f r0 = r0.f22957a
            r0.getApplicationContext()
            com.appodeal.ads.utils.campaign_frequency.a r0 = r7.f24366a     // Catch:{ Exception -> 0x00c3 }
            com.appodeal.ads.storage.o r1 = com.appodeal.ads.utils.campaign_frequency.C9615a.f24362b     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r0 = r0.f24364a     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r0 = r1.mo60821e(r0)     // Catch:{ Exception -> 0x00c3 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00c3 }
            if (r1 != 0) goto L_0x0039
            boolean r1 = com.appodeal.ads.utils.campaign_frequency.C9615a.f24363c     // Catch:{ Exception -> 0x0035 }
            if (r1 != 0) goto L_0x002f
            if (r0 == 0) goto L_0x0029
            goto L_0x002f
        L_0x0029:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ Exception -> 0x0035 }
            r0.<init>()     // Catch:{ Exception -> 0x0035 }
            throw r0     // Catch:{ Exception -> 0x0035 }
        L_0x002f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0035 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0035 }
            goto L_0x003a
        L_0x0035:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ Exception -> 0x00c3 }
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r1 != 0) goto L_0x0041
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c3 }
            r1.<init>()     // Catch:{ Exception -> 0x00c3 }
        L_0x0041:
            java.lang.String r0 = r7.f24369d     // Catch:{ Exception -> 0x0068 }
            boolean r0 = r1.has(r0)     // Catch:{ Exception -> 0x0068 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = r7.f24369d     // Catch:{ Exception -> 0x0068 }
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0055
        L_0x0050:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0068 }
            r0.<init>()     // Catch:{ Exception -> 0x0068 }
        L_0x0055:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0068 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r4 = 60
            long r2 = r2 / r4
            r0.put(r2)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = r7.f24369d     // Catch:{ Exception -> 0x0068 }
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ Exception -> 0x00c3 }
        L_0x006c:
            com.appodeal.ads.utils.campaign_frequency.a r0 = r7.f24366a     // Catch:{ Exception -> 0x00c3 }
            r0.getClass()     // Catch:{ Exception -> 0x00c3 }
            com.appodeal.ads.storage.o r2 = com.appodeal.ads.utils.campaign_frequency.C9615a.f24362b     // Catch:{ Exception -> 0x007d }
            java.lang.String r0 = r0.f24364a     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x007d }
            r2.mo60813a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ Exception -> 0x00c3 }
        L_0x0081:
            java.util.HashMap r0 = com.appodeal.ads.utils.campaign_frequency.C9616b.f24365l     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r1 = r7.f24368c     // Catch:{ Exception -> 0x00c3 }
            boolean r1 = r0.containsKey(r1)     // Catch:{ Exception -> 0x00c3 }
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = r7.f24368c     // Catch:{ Exception -> 0x00c3 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x00c3 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x00c3 }
            goto L_0x009f
        L_0x0094:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x00c3 }
            r1.<init>()     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r2 = r7.f24368c     // Catch:{ Exception -> 0x00c3 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x00c3 }
            r0 = r1
        L_0x009f:
            if (r0 == 0) goto L_0x00b6
            java.lang.String r1 = r7.f24369d     // Catch:{ Exception -> 0x00c3 }
            boolean r1 = r0.containsKey(r1)     // Catch:{ Exception -> 0x00c3 }
            if (r1 == 0) goto L_0x00b6
            java.lang.String r1 = r7.f24369d     // Catch:{ Exception -> 0x00c3 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x00c3 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x00c3 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00b7
        L_0x00b6:
            r1 = 0
        L_0x00b7:
            int r1 = r1 + 1
            java.lang.String r7 = r7.f24369d     // Catch:{ Exception -> 0x00c3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00c3 }
            r0.put(r7, r1)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00c7
        L_0x00c3:
            r7 = move-exception
            com.appodeal.ads.utils.Log.log(r7)
        L_0x00c7:
            UnifiedAdType r7 = r6.f23272f
            if (r7 == 0) goto L_0x00ce
            r7.onImpression()
        L_0x00ce:
            long r0 = r6.f23282p
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x00dc
            long r0 = java.lang.System.currentTimeMillis()
            r6.f23282p = r0
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9258l.mo60100b(int):void");
    }

    /* renamed from: c */
    public abstract UnifiedAdCallbackType mo60074c();

    /* renamed from: d */
    public final AdRequestType mo60101d() {
        return this.f23267a;
    }

    /* renamed from: e */
    public final JSONObject mo60102e() {
        return this.f23277k;
    }

    /* renamed from: f */
    public final boolean mo60103f() {
        return !this.f23271e.isEmpty();
    }

    public final String getAdUnitName() {
        return this.f23269c.getAdUnitName();
    }

    public final double getEcpm() {
        return this.f23269c.getEcpm();
    }

    public final long getExpTime() {
        return this.f23269c.getExpTime();
    }

    public final String getId() {
        return this.f23269c.getId();
    }

    public final int getImpressionInterval() {
        return this.f23269c.getImpressionInterval();
    }

    public final JSONObject getJsonData() {
        return this.f23269c.getJsonData();
    }

    public final int getLoadingTimeout() {
        int loadingTimeout = this.f23269c.getLoadingTimeout();
        return loadingTimeout > 0 ? loadingTimeout : this.f23279m;
    }

    public final String getMediatorName() {
        return this.f23269c.getMediatorName();
    }

    public final C9173e0 getRequestResult() {
        return this.f23269c.getRequestResult();
    }

    public final String getStatus() {
        return this.f23269c.getStatus();
    }

    /* renamed from: h */
    public final void mo60104h() {
        ExchangeAd exchangeAd = this.f23275i;
        if (exchangeAd != null) {
            exchangeAd.trackClick();
        }
        C9616b bVar = this.f23276j;
        if (bVar != null) {
            try {
                C9615a.f24362b.mo60811a(bVar.f24366a.f24364a, System.currentTimeMillis());
            } catch (Exception e) {
                Log.log(e);
            }
        }
        UnifiedAdType unifiedadtype = this.f23272f;
        if (unifiedadtype != null) {
            unifiedadtype.onClicked();
        }
        if (this.f23281o == 0) {
            this.f23281o = System.currentTimeMillis();
        }
    }

    /* renamed from: i */
    public void m27416g() {
        UnifiedAdType unifiedadtype = this.f23272f;
        if (unifiedadtype != null) {
            unifiedadtype.onDestroy();
        }
    }

    public final boolean isAsync() {
        return this.f23269c.isAsync();
    }

    public final Boolean isMuted() {
        return this.f23269c.isMuted();
    }

    public final boolean isPrecache() {
        return this.f23269c.isPrecache();
    }

    /* renamed from: j */
    public final void mo60106j() {
        if (this.f23272f != null && !mo60103f() && !this.f23284r) {
            this.f23284r = true;
            String id = this.f23269c.getId();
            if (!TextUtils.isEmpty(id) && TextUtils.getTrimmedLength(id) > 5) {
                id = id.substring(0, 5) + APSSharedUtil.TRUNCATE_SEPARATOR;
            }
            Log.log(this.f23267a.mo60093n().getDisplayName(), LogConstants.EVENT_NOTIFY_MEDIATION_RESULT, String.format(Locale.ENGLISH, "(winner): %s - eCPM: %.2f, id: %s", new Object[]{C9326n5.m27531a(this.f23269c.getStatus()), Double.valueOf(this.f23269c.getEcpm()), id}));
            this.f23272f.onMediationWin();
        }
    }

    /* renamed from: k */
    public final void mo60107k() {
        C9212h5.f23153a.post(new Runnable() {
            public final void run() {
                C9258l.this.m27416g();
            }
        });
    }

    /* renamed from: l */
    public LoadingError mo60108l() {
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "[@" + Integer.toHexString(hashCode()) + "]: " + this.f23269c.getId();
    }

    /* renamed from: a */
    public final void mo60096a(C9148b bVar, C9420r rVar, int i, C9313n.C9314a aVar) {
        JSONObject optJSONObject = this.f23269c.getJsonData().optJSONObject(Constants.CAMPAIGN_FREQUENCY);
        if (optJSONObject != null) {
            C9616b a = C9616b.m28367a(optJSONObject, this.f23269c.getJsonData().optString("package"));
            this.f23276j = a;
            if (a != null && !a.mo61075a(bVar.getApplicationContext())) {
                rVar.mo60614d(this);
                aVar.mo60322a(LoadingError.Canceled);
                return;
            }
        }
        LoadingError l = mo60108l();
        if (l == null) {
            l = this.f23268b.verifyLoadAvailability(rVar.mo60093n());
        }
        if (l != null) {
            aVar.mo60322a(l);
            return;
        }
        C9236k kVar = new C9236k(this, aVar, rVar, i, bVar);
        this.f23268b.initialize(bVar, this, new C9202h(rVar, new C9588u2(this.f23268b.getName())), kVar);
    }
}
