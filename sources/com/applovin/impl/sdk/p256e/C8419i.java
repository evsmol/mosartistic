package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8475k;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.network.C8516c;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.i */
public class C8419i extends C8401a {

    /* renamed from: a */
    private static final AtomicBoolean f21150a = new AtomicBoolean();

    /* renamed from: e */
    private final int f21151e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Object f21152f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8421a f21153g;

    /* renamed from: com.applovin.impl.sdk.e.i$a */
    public interface C8421a {
        /* renamed from: a */
        void mo57219a(JSONObject jSONObject);
    }

    /* renamed from: com.applovin.impl.sdk.e.i$b */
    private class C8422b extends C8401a {
        public C8422b(C8490n nVar) {
            super("TaskTimeoutFetchBasicSettings", nVar, true);
        }

        public void run() {
            synchronized (C8419i.this.f21152f) {
                if (C8419i.this.f21153g != null) {
                    C8626v vVar = this.f21120d;
                    if (C8626v.m26252a()) {
                        this.f21120d.mo57822e(this.f21119c, "Timing out fetch basic settings...");
                    }
                    C8419i.this.m25384a(new JSONObject());
                }
            }
        }
    }

    public C8419i(int i, C8490n nVar, C8421a aVar) {
        super("TaskFetchBasicSettings", nVar, true);
        this.f21151e = i;
        this.f21153g = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25384a(JSONObject jSONObject) {
        synchronized (this.f21152f) {
            if (this.f21153g != null) {
                this.f21153g.mo57219a(jSONObject);
                this.f21153g = null;
            }
        }
    }

    /* renamed from: c */
    private String m25386c() {
        return C8572i.m26096a((String) this.f21118b.mo57342a(C8380b.f20723aY), "5.0/i", mo57167d());
    }

    /* renamed from: h */
    private String m25387h() {
        return C8572i.m26096a((String) this.f21118b.mo57342a(C8380b.f20724aZ), "5.0/i", mo57167d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo57214a() {
        Map<String, String> map = CollectionUtils.map();
        map.put("rid", UUID.randomUUID().toString());
        if (!((Boolean) this.f21118b.mo57342a(C8380b.f20908eA)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21118b.mo57319C());
        }
        Boolean a = C8475k.m25556b().mo57299a(mo57169f());
        if (a != null) {
            map.put(AppLovinSdkExtraParameterKey.HAS_USER_CONSENT, a.toString());
        }
        Boolean a2 = C8475k.m25551a().mo57299a(mo57169f());
        if (a2 != null) {
            map.put(AppLovinSdkExtraParameterKey.AGE_RESTRICTED_USER, a2.toString());
        }
        Boolean a3 = C8475k.m25558c().mo57299a(mo57169f());
        if (a3 != null) {
            map.put(AppLovinSdkExtraParameterKey.DO_NOT_SELL, a3.toString());
        }
        return map;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|(1:4)|5|(1:7)|8|(1:10)|11|(1:13)|14|(1:18)|19|(1:21)|22|23|(1:25)|26|27|(1:29)|30|(1:36)|37|(1:42)|43|(1:45)|46|(1:48)|49|(1:51)|52|(1:54)|55|(1:57)|58|63) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x01c1 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01d1 A[Catch:{ JSONException -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x026c A[Catch:{ JSONException -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0287 A[Catch:{ JSONException -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x02a2 A[Catch:{ JSONException -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02b9 A[Catch:{ JSONException -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02ce A[Catch:{ JSONException -> 0x02e8 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo57215b() {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r0 = "screen_size_in"
            java.lang.String r2 = "is_tablet"
            java.lang.String r3 = "revision"
            java.lang.String r4 = "model"
            java.lang.String r5 = "hardware"
            java.lang.String r6 = "brand_name"
            java.lang.String r7 = "brand"
            java.lang.String r8 = "locale"
            java.lang.String r9 = "os"
            java.lang.String r10 = "platform"
            java.lang.String r11 = "IABTCF_gdprApplies"
            java.lang.String r12 = "IABTCF_TCString"
            java.lang.String r13 = "target_sdk"
            java.lang.String r14 = "tg"
            java.lang.String r15 = "debug"
            r16 = r0
            java.lang.String r0 = "test_ads"
            r17 = r2
            java.lang.String r2 = "app_version"
            r18 = r3
            java.lang.String r3 = "package_name"
            r19 = r4
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r20 = r5
            java.lang.String r5 = "sdk_version"
            r21 = r6
            java.lang.String r6 = com.applovin.sdk.AppLovinSdk.VERSION     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r5 = "is_cross_promo"
            com.applovin.impl.sdk.n r6 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            boolean r6 = r6.mo57388e()     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r5 = "init_count"
            int r6 = r1.f21151e     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r5 = "server_installed_at"
            com.applovin.impl.sdk.n r6 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            r22 = r7
            com.applovin.impl.sdk.c.b<java.lang.String> r7 = com.applovin.impl.sdk.p254c.C8380b.f20733ai     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r6 = r6.mo57342a(r7)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r5 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            boolean r5 = r5.mo57334S()     // Catch:{ JSONException -> 0x02e8 }
            r6 = 1
            if (r5 == 0) goto L_0x006d
            java.lang.String r5 = "first_install"
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
        L_0x006d:
            com.applovin.impl.sdk.n r5 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            boolean r5 = r5.mo57335T()     // Catch:{ JSONException -> 0x02e8 }
            if (r5 != 0) goto L_0x007a
            java.lang.String r5 = "first_install_v2"
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x02e8 }
        L_0x007a:
            com.applovin.impl.sdk.n r5 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.String> r7 = com.applovin.impl.sdk.p254c.C8380b.f20864dI     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r5 = r5.mo57342a(r7)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x02e8 }
            boolean r7 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)     // Catch:{ JSONException -> 0x02e8 }
            if (r7 == 0) goto L_0x008f
            java.lang.String r7 = "plugin_version"
            r4.put(r7, r5)     // Catch:{ JSONException -> 0x02e8 }
        L_0x008f:
            com.applovin.impl.sdk.n r5 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r5 = r5.mo57405u()     // Catch:{ JSONException -> 0x02e8 }
            boolean r7 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)     // Catch:{ JSONException -> 0x02e8 }
            if (r7 == 0) goto L_0x00a0
            java.lang.String r7 = "mediation_provider"
            r4.put(r7, r5)     // Catch:{ JSONException -> 0x02e8 }
        L_0x00a0:
            java.lang.String r5 = "installed_mediation_adapters"
            com.applovin.impl.sdk.n r7 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            org.json.JSONArray r7 = com.applovin.impl.mediation.p236c.C8134c.m24356a((com.applovin.impl.sdk.C8490n) r7)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r5, r7)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r5 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o r5 = r5.mo57340Y()     // Catch:{ JSONException -> 0x02e8 }
            java.util.Map r5 = r5.mo57633h()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r7 = r5.get(r3)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r3, r7)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r3 = r5.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r2 = r5.get(r0)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r5.get(r15)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r15, r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r5.get(r14)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r14, r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r5.get(r13)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r13, r0)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.sdk.AppLovinSdkSettings r0 = r0.mo57400q()     // Catch:{ JSONException -> 0x02e8 }
            java.util.List r0 = r0.getInitializationAdUnitIds()     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x0102
            int r2 = r0.size()     // Catch:{ JSONException -> 0x02e8 }
            if (r2 <= 0) goto L_0x0102
            java.util.List r0 = com.applovin.impl.sdk.utils.CollectionUtils.removeTrimmedEmptyStrings(r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "ad_unit_ids"
            int r3 = r0.size()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r0 = com.applovin.impl.sdk.utils.CollectionUtils.implode(r0, r3)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x0102:
            java.lang.Object r0 = r5.get(r12)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r12, r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r5.get(r11)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r11, r0)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o r0 = r0.mo57340Y()     // Catch:{ JSONException -> 0x02e8 }
            java.util.Map r0 = r0.mo57627b()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r2 = r0.get(r10)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r10, r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r2 = r0.get(r9)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r9, r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r2 = r0.get(r8)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r8, r2)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r22
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r21
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r20
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r19
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r18
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r17
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            r2 = r16
            java.lang.Object r0 = r0.get(r2)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p254c.C8380b.f20873dR     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r0.mo57342a(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02e8 }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = "mtl"
            com.applovin.impl.sdk.n r2 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.SessionTracker r2 = r2.mo57366ag()     // Catch:{ JSONException -> 0x02e8 }
            int r2 = r2.getLastTrimMemoryLevel()     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x02e8 }
        L_0x018d:
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ all -> 0x01c1 }
            android.content.Context r0 = r0.mo57332P()     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = "activity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x01c1 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x01c1 }
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x01c1 }
            r2.<init>()     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x01c1
            r0.getMemoryInfo(r2)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "fm"
            long r7 = r2.availMem     // Catch:{ all -> 0x01c1 }
            r4.put(r0, r7)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "tm"
            long r7 = r2.totalMem     // Catch:{ all -> 0x01c1 }
            r4.put(r0, r7)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "lmt"
            long r7 = r2.threshold     // Catch:{ all -> 0x01c1 }
            r4.put(r0, r7)     // Catch:{ all -> 0x01c1 }
            java.lang.String r0 = "lm"
            boolean r2 = r2.lowMemory     // Catch:{ all -> 0x01c1 }
            r4.put(r0, r2)     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.AppLovinTargetingDataImpl r0 = r0.mo57402s()     // Catch:{ JSONException -> 0x02e8 }
            java.util.Map r0 = r0.getAllData()     // Catch:{ JSONException -> 0x02e8 }
            boolean r2 = r0.isEmpty()     // Catch:{ JSONException -> 0x02e8 }
            if (r2 != 0) goto L_0x01db
            java.lang.String r2 = "targeting_data"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02e8 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
        L_0x01db:
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o r0 = r0.mo57340Y()     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o$a r0 = r0.mo57636k()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "dnt"
            boolean r3 = r0.f21574a     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "dnt_code"
            com.applovin.impl.sdk.o$d r3 = r0.f21576c     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r3 = r3.mo57643a()     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.k$a r2 = com.applovin.impl.sdk.C8475k.m25551a()     // Catch:{ JSONException -> 0x02e8 }
            android.content.Context r3 = r23.mo57169f()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r2 = r2.mo57299a((android.content.Context) r3)     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r3 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r5 = com.applovin.impl.sdk.p254c.C8380b.f20860dE     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r3 = r3.mo57342a(r5)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x02e8 }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x02e8 }
            if (r3 == 0) goto L_0x022a
            java.lang.String r3 = r0.f21575b     // Catch:{ JSONException -> 0x02e8 }
            boolean r3 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r3)     // Catch:{ JSONException -> 0x02e8 }
            if (r3 == 0) goto L_0x022a
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x02e8 }
            boolean r3 = r3.equals(r2)     // Catch:{ JSONException -> 0x02e8 }
            if (r3 != 0) goto L_0x022a
            java.lang.String r3 = "idfa"
            java.lang.String r0 = r0.f21575b     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r3, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x022a:
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o r0 = r0.mo57340Y()     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.o$b r0 = r0.mo57637l()     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r3 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r5 = com.applovin.impl.sdk.p254c.C8380b.f20905dx     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r3 = r3.mo57342a(r5)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x02e8 }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x02e8 }
            if (r3 == 0) goto L_0x025c
            if (r0 == 0) goto L_0x025c
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x02e8 }
            boolean r2 = r3.equals(r2)     // Catch:{ JSONException -> 0x02e8 }
            if (r2 != 0) goto L_0x025c
            java.lang.String r2 = "idfv"
            java.lang.String r3 = r0.f21577a     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "idfv_scope"
            int r0 = r0.f21578b     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x025c:
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.sdk.AppLovinUserSegment r0 = r0.mo57401r()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r0 = r0.getName()     // Catch:{ JSONException -> 0x02e8 }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)     // Catch:{ JSONException -> 0x02e8 }
            if (r2 == 0) goto L_0x0277
            java.lang.String r2 = "user_segment_name"
            com.applovin.impl.sdk.n r3 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.encodeUriString(r0, r3)     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x0277:
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p254c.C8380b.f20856dA     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r0.mo57342a(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02e8 }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x0292
            java.lang.String r0 = "compass_random_token"
            com.applovin.impl.sdk.n r2 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = r2.mo57398o()     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x02e8 }
        L_0x0292:
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p254c.C8380b.f20858dC     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Object r0 = r0.mo57342a(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x02e8 }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x02ad
            java.lang.String r0 = "applovin_random_token"
            com.applovin.impl.sdk.n r2 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = r2.mo57399p()     // Catch:{ JSONException -> 0x02e8 }
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x02e8 }
        L_0x02ad:
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.mediation.debugger.ui.testmode.c r0 = r0.mo57330N()     // Catch:{ JSONException -> 0x02e8 }
            boolean r0 = r0.mo56529a()     // Catch:{ JSONException -> 0x02e8 }
            if (r0 == 0) goto L_0x02be
            java.lang.String r0 = "test_mode"
            r4.put(r0, r6)     // Catch:{ JSONException -> 0x02e8 }
        L_0x02be:
            com.applovin.impl.sdk.n r0 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.mediation.debugger.ui.testmode.c r0 = r0.mo57330N()     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r0 = r0.mo56531c()     // Catch:{ JSONException -> 0x02e8 }
            boolean r2 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)     // Catch:{ JSONException -> 0x02e8 }
            if (r2 == 0) goto L_0x02d3
            java.lang.String r2 = "test_mode_network"
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x02d3:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.impl.sdk.n r2 = r1.f21118b     // Catch:{ JSONException -> 0x02e8 }
            com.applovin.sdk.AppLovinSdkSettings r2 = r2.mo57400q()     // Catch:{ JSONException -> 0x02e8 }
            java.util.Map r2 = r2.getExtraParameters()     // Catch:{ JSONException -> 0x02e8 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r2 = "sdk_extra_parameters"
            r4.put(r2, r0)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x02fa
        L_0x02e8:
            r0 = move-exception
            com.applovin.impl.sdk.v r2 = r1.f21120d
            boolean r2 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r2 == 0) goto L_0x02fa
            com.applovin.impl.sdk.v r2 = r1.f21120d
            java.lang.String r3 = r1.f21119c
            java.lang.String r5 = "Failed to construct JSON body"
            r2.mo57819b(r3, r5, r0)
        L_0x02fa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p256e.C8419i.mo57215b():org.json.JSONObject");
    }

    public void run() {
        if (!C8571h.m26091i() && f21150a.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(this.f21118b.mo57332P());
            } catch (Throwable th) {
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    this.f21120d.mo57819b(this.f21119c, "Cannot update security provider", th);
                }
            }
        }
        Map<String, String> a = mo57214a();
        C8516c<T> a2 = C8516c.m25763a(this.f21118b).mo57528a(m25386c()).mo57538c(m25387h()).mo57529a(a).mo57530a(mo57215b()).mo57540d(((Boolean) this.f21118b.mo57342a(C8380b.f20914eG)).booleanValue()).mo57534b("POST").mo57527a(new JSONObject()).mo57526a(((Integer) this.f21118b.mo57342a(C8380b.f20887df)).intValue()).mo57537c(((Integer) this.f21118b.mo57342a(C8380b.f20890di)).intValue()).mo57533b(((Integer) this.f21118b.mo57342a(C8380b.f20886de)).intValue()).mo57532a();
        this.f21118b.mo57337V().mo57229a((C8401a) new C8422b(this.f21118b), C8432o.C8434a.TIMEOUT, ((long) ((Integer) this.f21118b.mo57342a(C8380b.f20886de)).intValue()) + 250);
        C84201 r1 = new C8449u<JSONObject>(a2, this.f21118b, mo57170g()) {
            /* renamed from: a */
            public void mo56275a(int i, String str, JSONObject jSONObject) {
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f21120d;
                    String str2 = this.f21119c;
                    vVar2.mo57822e(str2, "Unable to fetch basic SDK settings: server returned " + i);
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                C8419i.this.m25384a(jSONObject);
            }

            /* renamed from: a */
            public void mo56277a(JSONObject jSONObject, int i) {
                C8419i.this.m25384a(jSONObject);
            }
        };
        r1.mo57253a(C8380b.f20723aY);
        r1.mo57255b(C8380b.f20724aZ);
        this.f21118b.mo57337V().mo57227a((C8401a) r1);
    }
}
