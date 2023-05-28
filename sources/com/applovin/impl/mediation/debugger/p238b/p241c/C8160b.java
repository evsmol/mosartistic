package com.applovin.impl.mediation.debugger.p238b.p241c;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.p237a.C8145b;
import com.applovin.impl.mediation.p236c.C8134c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.c.b */
public class C8160b implements AppLovinCommunicatorSubscriber, Comparable<C8160b> {

    /* renamed from: A */
    private final Map<MaxAdFormat, String> f19915A;

    /* renamed from: B */
    private final boolean f19916B;

    /* renamed from: C */
    private final String f19917C;

    /* renamed from: D */
    private final Map<MaxAdFormat, C8145b> f19918D;

    /* renamed from: a */
    private final C8490n f19919a;

    /* renamed from: b */
    private final C8161a f19920b;

    /* renamed from: c */
    private int f19921c;

    /* renamed from: d */
    private final boolean f19922d;

    /* renamed from: e */
    private final boolean f19923e;

    /* renamed from: f */
    private final boolean f19924f;

    /* renamed from: g */
    private final boolean f19925g;

    /* renamed from: h */
    private final boolean f19926h;

    /* renamed from: i */
    private final boolean f19927i;

    /* renamed from: j */
    private final boolean f19928j;

    /* renamed from: k */
    private final boolean f19929k;

    /* renamed from: l */
    private final boolean f19930l;

    /* renamed from: m */
    private final boolean f19931m;

    /* renamed from: n */
    private final String f19932n;

    /* renamed from: o */
    private final String f19933o;

    /* renamed from: p */
    private final String f19934p;

    /* renamed from: q */
    private String f19935q;

    /* renamed from: r */
    private final String f19936r;

    /* renamed from: s */
    private final String f19937s;

    /* renamed from: t */
    private final String f19938t;

    /* renamed from: u */
    private final int f19939u;

    /* renamed from: v */
    private final List<MaxAdFormat> f19940v;

    /* renamed from: w */
    private final List<C8164d> f19941w;

    /* renamed from: x */
    private final List<C8159a> f19942x;

    /* renamed from: y */
    private final List<String> f19943y;

    /* renamed from: z */
    private final C8163c f19944z;

    /* renamed from: com.applovin.impl.mediation.debugger.b.c.b$a */
    public enum C8161a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");
        

        /* renamed from: e */
        private final String f19950e;

        private C8161a(String str) {
            this.f19950e = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m24494a() {
            return this.f19950e;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.b.c.b$b */
    public enum C8162b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");
        

        /* renamed from: f */
        private final String f19957f;

        /* renamed from: g */
        private final int f19958g;

        /* renamed from: h */
        private final String f19959h;

        private C8162b(String str, int i, String str2) {
            this.f19957f = str;
            this.f19958g = i;
            this.f19959h = str2;
        }

        /* renamed from: a */
        public String mo56392a() {
            return this.f19957f;
        }

        /* renamed from: b */
        public int mo56393b() {
            return this.f19958g;
        }

        /* renamed from: c */
        public String mo56394c() {
            return this.f19959h;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8160b(org.json.JSONObject r20, com.applovin.impl.sdk.C8490n r21) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "MediatedNetwork"
            r19.<init>()
            r1.f19919a = r3
            java.lang.String r0 = "name"
            java.lang.String r5 = ""
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f19932n = r0
            java.lang.String r0 = "display_name"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f19933o = r0
            java.lang.String r6 = "adapter_class"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r6, r5)
            r1.f19934p = r0
            java.lang.String r0 = "latest_adapter_version"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            r1.f19937s = r0
            java.util.List r0 = r19.m24461a((org.json.JSONObject) r20)
            r1.f19943y = r0
            r7 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            java.lang.String r8 = "hide_if_missing"
            java.lang.Boolean r8 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r2, r8, r0)
            boolean r8 = r8.booleanValue()
            r1.f19928j = r8
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "configuration"
            org.json.JSONObject r8 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r9, (org.json.JSONObject) r8)
            java.util.List r9 = r1.m24462a(r8, r3)
            r1.f19941w = r9
            com.applovin.impl.mediation.debugger.b.c.c r9 = new com.applovin.impl.mediation.debugger.b.c.c
            r9.<init>(r8, r3)
            r1.f19944z = r9
            java.lang.String r9 = "java_8_required"
            java.lang.Boolean r9 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r8, r9, r0)
            boolean r9 = r9.booleanValue()
            r1.f19931m = r9
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = "test_mode"
            org.json.JSONObject r9 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r8, (java.lang.String) r10, (org.json.JSONObject) r9)
            java.lang.String r11 = "false_coppa_required"
            java.lang.Boolean r11 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r9, r11, r0)
            boolean r11 = r11.booleanValue()
            r1.f19930l = r11
            java.lang.String r11 = "network_names"
            r12 = 0
            org.json.JSONObject r9 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r9, (java.lang.String) r11, (org.json.JSONObject) r12)
            if (r9 == 0) goto L_0x00c0
            int r11 = r9.length()
            if (r11 <= 0) goto L_0x00c0
            int r11 = r9.length()
            java.util.Map r11 = com.applovin.impl.sdk.utils.CollectionUtils.map((int) r11)
            java.util.Iterator r13 = r9.keys()
        L_0x009c:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00bd
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            com.applovin.mediation.MaxAdFormat r15 = com.applovin.mediation.MaxAdFormat.formatFromString(r14)
            java.lang.String r14 = com.applovin.impl.sdk.utils.JsonUtils.getString(r9, r14, r12)
            if (r15 == 0) goto L_0x009c
            boolean r16 = android.text.TextUtils.isEmpty(r14)
            if (r16 == 0) goto L_0x00b9
            goto L_0x009c
        L_0x00b9:
            r11.put(r15, r14)
            goto L_0x009c
        L_0x00bd:
            r1.f19915A = r11
            goto L_0x00c2
        L_0x00c0:
            r1.f19915A = r12
        L_0x00c2:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            org.json.JSONObject r9 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r10, (org.json.JSONObject) r9)
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)
            java.lang.String r13 = "supported"
            java.lang.Boolean r11 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r9, r13, r11)
            boolean r11 = r11.booleanValue()
            r1.f19926h = r11
            java.lang.String r11 = "test_mode_requires_init"
            java.lang.Boolean r0 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(r2, r11, r0)
            boolean r0 = r0.booleanValue()
            r1.f19927i = r0
            java.lang.String r0 = "message"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r9, r0, r12)
            r1.f19938t = r0
            java.lang.String r0 = "existence_classes"
            java.util.List r0 = com.applovin.impl.sdk.utils.JsonUtils.getList(r2, r0, r12)
            if (r0 == 0) goto L_0x00fd
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassesExistence(r0)
            goto L_0x0107
        L_0x00fd:
            java.lang.String r0 = "existence_class"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r2, r0, r5)
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassExistence(r0)
        L_0x0107:
            r1.f19922d = r0
            java.util.List r9 = java.util.Collections.emptyList()
            java.lang.String r0 = r1.f19934p
            com.applovin.mediation.adapter.MaxAdapter r0 = com.applovin.impl.mediation.p236c.C8134c.m24359b(r0, r3)
            if (r0 == 0) goto L_0x019d
            r1.f19923e = r10
            java.lang.String r11 = r0.getAdapterVersion()     // Catch:{ all -> 0x0139 }
            java.lang.String r13 = r0.getSdkVersion()     // Catch:{ all -> 0x0136 }
            if (r13 == 0) goto L_0x0126
            java.lang.String r13 = r0.getSdkVersion()     // Catch:{ all -> 0x0136 }
            goto L_0x0127
        L_0x0126:
            r13 = r5
        L_0x0127:
            java.util.List r9 = r1.m24460a((com.applovin.mediation.adapter.MaxAdapter) r0)     // Catch:{ all -> 0x0134 }
            boolean r0 = r0.isBeta()     // Catch:{ all -> 0x0134 }
            r14 = r13
            r13 = r11
            r11 = r9
            r9 = r0
            goto L_0x015e
        L_0x0134:
            r0 = move-exception
            goto L_0x013c
        L_0x0136:
            r0 = move-exception
            r13 = r5
            goto L_0x013c
        L_0x0139:
            r0 = move-exception
            r11 = r5
            r13 = r11
        L_0x013c:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Failed to load adapter for network "
            r14.append(r15)
            java.lang.String r15 = r1.f19932n
            r14.append(r15)
            java.lang.String r15 = ". Please check that you have a compatible network SDK integrated. Error: "
            r14.append(r15)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.applovin.impl.sdk.C8626v.m26258i(r4, r0)
            r14 = r13
            r13 = r11
            r11 = r9
            r9 = 0
        L_0x015e:
            java.lang.String r0 = r1.f19934p     // Catch:{ all -> 0x0186 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0186 }
            java.lang.String r15 = "loadNativeAd"
            r12 = 3
            java.lang.Class[] r12 = new java.lang.Class[r12]     // Catch:{ all -> 0x0186 }
            java.lang.Class<com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters> r17 = com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters.class
            r12[r7] = r17     // Catch:{ all -> 0x0186 }
            java.lang.Class<android.app.Activity> r17 = android.app.Activity.class
            r12[r10] = r17     // Catch:{ all -> 0x0186 }
            r17 = 2
            java.lang.Class<com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener> r18 = com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener.class
            r12[r17] = r18     // Catch:{ all -> 0x0186 }
            java.lang.reflect.Method r12 = r0.getMethod(r15, r12)     // Catch:{ all -> 0x0186 }
            java.lang.Class r12 = r12.getDeclaringClass()     // Catch:{ all -> 0x0186 }
            boolean r0 = r12.equals(r0)     // Catch:{ all -> 0x0186 }
            r4 = r9
            r9 = r11
            goto L_0x01a3
        L_0x0186:
            r0 = move-exception
            r21.mo57320D()
            boolean r12 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r12 == 0) goto L_0x0199
            com.applovin.impl.sdk.v r12 = r21.mo57320D()
            java.lang.String r15 = "Failed to check if adapter overrides MaxNativeAdAdapter"
            r12.mo57819b(r4, r15, r0)
        L_0x0199:
            r4 = r9
            r9 = r11
            r0 = 0
            goto L_0x01a3
        L_0x019d:
            r1.f19923e = r7
            r13 = r5
            r14 = r13
            r0 = 0
            r4 = 0
        L_0x01a3:
            r1.f19936r = r13
            r1.f19935q = r14
            r1.f19940v = r9
            r1.f19929k = r0
            java.util.List r0 = r1.m24463a(r8, r13, r3)
            r1.f19942x = r0
            java.lang.String r0 = "alternative_network"
            r9 = 0
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r2, (java.lang.String) r0, (org.json.JSONObject) r9)
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r6, r5)
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkClassExistence(r0)
            r1.f19925g = r0
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = r19.m24459D()
            r1.f19920b = r0
            java.lang.String r0 = r1.f19937s
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x01d4
            if (r4 != 0) goto L_0x01d4
            r0 = 1
            goto L_0x01d5
        L_0x01d4:
            r0 = 0
        L_0x01d5:
            r1.f19924f = r0
            android.content.Context r0 = r21.mo57332P()
            java.lang.String r2 = r1.f19932n
            java.lang.String r4 = "_"
            int r2 = r2.lastIndexOf(r4)
            r4 = -1
            if (r2 == r4) goto L_0x01f1
            java.lang.String r4 = r1.f19932n
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r2 = r4.substring(r7, r2)
            goto L_0x01f7
        L_0x01f1:
            java.lang.String r2 = r1.f19932n
            java.lang.String r2 = r2.toLowerCase()
        L_0x01f7:
            android.content.res.Resources r4 = r0.getResources()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "applovin_ic_mediation_"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = r0.getPackageName()
            java.lang.String r6 = "drawable"
            int r2 = r4.getIdentifier(r2, r6, r5)
            r1.f19939u = r2
            com.applovin.mediation.adapter.MaxAdapter$InitializationStatus r2 = com.applovin.mediation.adapter.MaxAdapter.InitializationStatus.NOT_INITIALIZED
            int r2 = r2.getCode()
            r1.f19921c = r2
            com.applovin.communicator.AppLovinCommunicator r0 = com.applovin.communicator.AppLovinCommunicator.getInstance(r0)
            java.lang.String r2 = "adapter_initialization_status"
            r0.subscribe((com.applovin.communicator.AppLovinCommunicatorSubscriber) r1, (java.lang.String) r2)
            com.applovin.impl.mediation.e r0 = r21.mo57323G()
            java.util.LinkedHashMap r0 = r0.mo56540b()
            java.lang.String r2 = r1.f19934p
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0247
            java.lang.String r2 = r1.f19934p
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.f19921c = r0
        L_0x0247:
            java.lang.String r0 = "amazon_marketplace"
            r2 = 0
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r8, (java.lang.String) r0, (org.json.JSONObject) r2)
            if (r0 == 0) goto L_0x02a1
            boolean r3 = r1.f19922d
            if (r3 == 0) goto L_0x02a1
            r1.f19916B = r10
            java.lang.String r3 = "test_mode_app_id"
            java.lang.String r3 = com.applovin.impl.sdk.utils.JsonUtils.getString(r0, r3, r2)
            r1.f19917C = r3
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "test_mode_slot_ids"
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r0, (java.lang.String) r3, (org.json.JSONObject) r2)
            int r2 = r0.length()
            java.util.Map r2 = com.applovin.impl.sdk.utils.CollectionUtils.map((int) r2)
            java.util.Iterator r3 = r0.keys()
        L_0x0275:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02a6
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.applovin.mediation.MaxAdFormat r5 = com.applovin.mediation.MaxAdFormat.formatFromString(r4)
            r6 = 0
            org.json.JSONObject r4 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONObject) r0, (java.lang.String) r4, (org.json.JSONObject) r6)
            if (r5 == 0) goto L_0x0275
            if (r4 != 0) goto L_0x028f
            goto L_0x0275
        L_0x028f:
            java.lang.String r7 = "uuid"
            java.lang.String r7 = com.applovin.impl.sdk.utils.JsonUtils.getString(r4, r7, r6)
            if (r7 != 0) goto L_0x0298
            goto L_0x0275
        L_0x0298:
            com.applovin.impl.mediation.debugger.a.b r6 = new com.applovin.impl.mediation.debugger.a.b
            r6.<init>(r7, r4, r5)
            r2.put(r5, r6)
            goto L_0x0275
        L_0x02a1:
            r1.f19916B = r7
            r2 = 0
            r1.f19917C = r2
        L_0x02a6:
            r1.f19918D = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.<init>(org.json.JSONObject, com.applovin.impl.sdk.n):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.C8161a.f19945a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r3.f19925g != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r3.f19923e != false) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.C8161a m24459D() {
        /*
            r3 = this;
            boolean r0 = r3.f19922d
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.f19923e
            if (r0 == 0) goto L_0x000b
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.C8161a.COMPLETE
            goto L_0x0019
        L_0x000b:
            boolean r0 = r3.f19925g
            if (r0 == 0) goto L_0x0014
            goto L_0x0017
        L_0x0010:
            boolean r0 = r3.f19923e
            if (r0 == 0) goto L_0x0017
        L_0x0014:
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.C8161a.INCOMPLETE_INTEGRATION
            goto L_0x0019
        L_0x0017:
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.C8161a.MISSING
        L_0x0019:
            com.applovin.impl.mediation.debugger.b.c.b$a r1 = com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.C8161a.MISSING
            if (r0 != r1) goto L_0x001e
            return r0
        L_0x001e:
            java.util.List<com.applovin.impl.mediation.debugger.b.c.d> r1 = r3.f19941w
            java.util.Iterator r1 = r1.iterator()
        L_0x0024:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.c.d r2 = (com.applovin.impl.mediation.debugger.p238b.p241c.C8164d) r2
            boolean r2 = r2.mo56400c()
            if (r2 != 0) goto L_0x0024
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.C8161a.INVALID_INTEGRATION
            return r0
        L_0x0039:
            java.util.List<com.applovin.impl.mediation.debugger.b.c.a> r1 = r3.f19942x
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r1.next()
            com.applovin.impl.mediation.debugger.b.c.a r2 = (com.applovin.impl.mediation.debugger.p238b.p241c.C8159a) r2
            boolean r2 = r2.mo56359c()
            if (r2 != 0) goto L_0x003f
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.C8161a.INVALID_INTEGRATION
            return r0
        L_0x0054:
            boolean r1 = r3.f19931m
            if (r1 == 0) goto L_0x0061
            boolean r1 = com.applovin.impl.sdk.C8490n.m25592B()
            if (r1 != 0) goto L_0x0061
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.C8161a.INVALID_INTEGRATION
            return r0
        L_0x0061:
            com.applovin.impl.mediation.debugger.b.c.c r1 = r3.f19944z
            boolean r1 = r1.mo56395a()
            if (r1 == 0) goto L_0x0073
            com.applovin.impl.mediation.debugger.b.c.c r1 = r3.f19944z
            boolean r1 = r1.mo56396b()
            if (r1 != 0) goto L_0x0073
            com.applovin.impl.mediation.debugger.b.c.b$a r0 = com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.C8161a.INCOMPLETE_INTEGRATION
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.debugger.p238b.p241c.C8160b.m24459D():com.applovin.impl.mediation.debugger.b.c.b$a");
    }

    /* renamed from: a */
    private List<MaxAdFormat> m24460a(MaxAdapter maxAdapter) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            arrayList.add(MaxAdFormat.MREC);
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<String> m24461a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", (JSONArray) null), (List) null);
    }

    /* renamed from: a */
    private List<C8164d> m24462a(JSONObject jSONObject, C8490n nVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f19934p.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            C8164d dVar = new C8164d("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", nVar.mo57332P());
            if (dVar.mo56400c()) {
                arrayList.add(dVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new C8164d(next, jSONObject2.getString(next), nVar.mo57332P()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C8159a> m24463a(JSONObject jSONObject, String str, C8490n nVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C8159a(jSONObject2, nVar));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && C8159a.m24455a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", (String) null), JsonUtils.getString(jSONObject3, "max_adapter_version", (String) null))) {
                arrayList.add(new C8159a(jSONObject3, nVar));
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public boolean mo56360A() {
        return this.f19916B;
    }

    /* renamed from: B */
    public String mo56361B() {
        return this.f19917C;
    }

    /* renamed from: C */
    public Map<MaxAdFormat, C8145b> mo56362C() {
        return this.f19918D;
    }

    /* renamed from: a */
    public int compareTo(C8160b bVar) {
        return this.f19933o.compareToIgnoreCase(bVar.f19933o);
    }

    /* renamed from: a */
    public C8161a mo56364a() {
        return this.f19920b;
    }

    /* renamed from: b */
    public int mo56365b() {
        return this.f19921c;
    }

    /* renamed from: c */
    public C8162b mo56366c() {
        return !this.f19926h ? C8162b.NOT_SUPPORTED : (this.f19920b == C8161a.COMPLETE || (this.f19920b == C8161a.INCOMPLETE_INTEGRATION && mo56368d() && mo56369e())) ? !this.f19919a.mo57330N().mo56529a() ? C8162b.DISABLED : (!this.f19927i || !(this.f19921c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f19921c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? C8162b.READY : C8162b.NOT_INITIALIZED : C8162b.INVALID_INTEGRATION;
    }

    /* renamed from: d */
    public boolean mo56368d() {
        return this.f19922d;
    }

    /* renamed from: e */
    public boolean mo56369e() {
        return this.f19923e;
    }

    /* renamed from: f */
    public boolean mo56370f() {
        return this.f19924f;
    }

    /* renamed from: g */
    public boolean mo56371g() {
        return this.f19920b == C8161a.MISSING && this.f19928j;
    }

    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    /* renamed from: h */
    public String mo56372h() {
        return this.f19932n;
    }

    /* renamed from: i */
    public String mo56373i() {
        return this.f19933o;
    }

    /* renamed from: j */
    public String mo56374j() {
        return this.f19935q;
    }

    /* renamed from: k */
    public String mo56375k() {
        return this.f19936r;
    }

    /* renamed from: l */
    public String mo56376l() {
        return this.f19937s;
    }

    /* renamed from: m */
    public String mo56377m() {
        return this.f19934p;
    }

    /* renamed from: n */
    public List<String> mo56378n() {
        return this.f19943y;
    }

    /* renamed from: o */
    public int mo56379o() {
        return this.f19939u;
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f19934p.equals(string)) {
            this.f19921c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter b = C8134c.m24359b(string, this.f19919a);
            if (b != null && !this.f19935q.equals(b.getSdkVersion())) {
                this.f19935q = b.getSdkVersion();
                this.f19919a.mo57369aj().mo57292a(this.f19935q, string);
            }
        }
    }

    /* renamed from: p */
    public List<MaxAdFormat> mo56380p() {
        return this.f19940v;
    }

    /* renamed from: q */
    public boolean mo56381q() {
        return this.f19929k;
    }

    /* renamed from: r */
    public List<C8164d> mo56382r() {
        return this.f19941w;
    }

    /* renamed from: s */
    public List<C8159a> mo56383s() {
        return this.f19942x;
    }

    /* renamed from: t */
    public boolean mo56384t() {
        return this.f19931m;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f19932n + ", displayName=" + this.f19933o + ", sdkAvailable=" + this.f19922d + ", sdkVersion=" + this.f19935q + ", adapterAvailable=" + this.f19923e + ", adapterVersion=" + this.f19936r + "}";
    }

    /* renamed from: u */
    public final C8163c mo56386u() {
        return this.f19944z;
    }

    /* renamed from: v */
    public Map<MaxAdFormat, String> mo56387v() {
        return this.f19915A;
    }

    /* renamed from: w */
    public String mo56388w() {
        return this.f19938t;
    }

    /* renamed from: x */
    public boolean mo56389x() {
        return this.f19930l;
    }

    /* renamed from: y */
    public final C8490n mo56390y() {
        return this.f19919a;
    }

    /* renamed from: z */
    public final String mo56391z() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ");
        sb.append(this.f19932n);
        sb.append(" ----------");
        sb.append("\nStatus  - ");
        sb.append(this.f19920b.m24494a());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.f19922d || TextUtils.isEmpty(this.f19935q)) ? str : this.f19935q);
        sb.append("\nAdapter - ");
        if (this.f19923e && !TextUtils.isEmpty(this.f19936r)) {
            str = this.f19936r;
        }
        sb.append(str);
        if (this.f19944z.mo56395a() && !this.f19944z.mo56396b()) {
            sb.append("\n* ");
            sb.append(this.f19944z.mo56397c());
        }
        for (C8164d next : mo56382r()) {
            if (!next.mo56400c()) {
                sb.append("\n* MISSING ");
                sb.append(next.mo56398a());
                sb.append(": ");
                sb.append(next.mo56399b());
            }
        }
        for (C8159a next2 : mo56383s()) {
            if (!next2.mo56359c()) {
                sb.append("\n* MISSING ");
                sb.append(next2.mo56357a());
                sb.append(": ");
                sb.append(next2.mo56358b());
            }
        }
        return sb.toString();
    }
}
