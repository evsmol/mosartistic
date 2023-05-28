package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10201b;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a;
import com.bytedance.sdk.component.p307b.p308a.C10469e;
import com.bytedance.sdk.component.p313d.C10561j;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.component.p313d.p316c.p320b.C10522a;
import com.bytedance.sdk.component.p313d.p322d.C10545d;
import com.bytedance.sdk.component.p313d.p322d.C10548g;
import com.bytedance.sdk.component.p323e.C10576b;
import com.bytedance.sdk.component.p323e.p324a.C10575a;
import com.bytedance.sdk.component.p323e.p325b.C10579b;
import com.bytedance.sdk.component.p323e.p325b.C10581c;
import com.bytedance.sdk.component.p323e.p325b.C10582d;
import com.bytedance.sdk.component.p323e.p326c.C10584a;
import com.bytedance.sdk.component.p323e.p326c.C10590d;
import com.bytedance.sdk.component.p323e.p326c.C10591e;
import com.bytedance.sdk.component.p323e.p326c.C10594g;
import com.bytedance.sdk.component.p323e.p327d.C10601c;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10621a;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.p015a.C0380a;
import com.bytedance.sdk.openadsdk.core.p020d.C0444b;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.p021e.C0483s;
import com.bytedance.sdk.openadsdk.core.p025i.C0510b;
import com.bytedance.sdk.openadsdk.core.p025i.C0512d;
import com.bytedance.sdk.openadsdk.core.p025i.C0515e;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.bytedance.sdk.openadsdk.p000b.C0106a;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0145i;
import com.bytedance.sdk.openadsdk.p005c.C0196d;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0967e;
import com.bytedance.sdk.openadsdk.utils.C0985m;
import com.bytedance.sdk.openadsdk.utils.C0988n;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p057b.C1010a;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.o */
/* compiled from: NetApiImpl */
public class C0607o implements C0561n<C0106a> {

    /* renamed from: g */
    private static volatile boolean f2270g = false;

    /* renamed from: i */
    private static boolean f2271i = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f2272a;

    /* renamed from: b */
    private final boolean f2273b;

    /* renamed from: c */
    private final ExecutorService f2274c = Executors.newFixedThreadPool(1);

    /* renamed from: d */
    private final String f2275d;

    /* renamed from: e */
    private long f2276e;

    /* renamed from: f */
    private int f2277f;

    /* renamed from: h */
    private C10565n f2278h = new C10565n() {
        /* renamed from: a */
        public void mo256a(int i, String str, Throwable th) {
        }

        /* renamed from: a */
        public void mo257a(C10561j jVar) {
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.o$a */
    /* compiled from: NetApiImpl */
    public static class C0617a {

        /* renamed from: a */
        final int f2304a;

        /* renamed from: b */
        final long f2305b;

        /* renamed from: c */
        final long f2306c;

        /* renamed from: d */
        final int f2307d;

        /* renamed from: e */
        final String f2308e;

        /* renamed from: f */
        final int f2309f;

        /* renamed from: g */
        final String f2310g;

        /* renamed from: h */
        public final C0448a f2311h;

        /* renamed from: i */
        final String f2312i;

        /* renamed from: j */
        final ArrayList<Integer> f2313j;

        private C0617a(String str, int i, int i2, String str2, int i3, String str3, C0448a aVar, long j, long j2, ArrayList<Integer> arrayList) {
            this.f2304a = i;
            this.f2307d = i2;
            this.f2308e = str2;
            this.f2310g = str3;
            this.f2311h = aVar;
            this.f2312i = str;
            this.f2309f = i3;
            this.f2305b = j;
            this.f2306c = j2;
            this.f2313j = arrayList;
        }

        /* renamed from: a */
        public static C0617a m2994a(JSONObject jSONObject, AdSlot adSlot, C0479o oVar) {
            C0617a aVar;
            JSONObject jSONObject2 = jSONObject;
            String optString = jSONObject2.optString(C10545d.d1657027613261dc("dhf"));
            int optInt = jSONObject2.optInt(C10545d.d1657027613261dc("psm`avunfnUe`kP}b"));
            long optLong = jSONObject2.optLong(C10545d.d1657027613261dc("s^pfg`oqmV~x"));
            long optLong2 = jSONObject2.optLong(C10545d.d1657027613261dc("s^qfjaYs{"));
            int optInt2 = jSONObject2.optInt(C0145i.i1657027613257dc("sucwqvYdgmo"));
            String optString2 = jSONObject2.optString(C0145i.i1657027613257dc("ddq`"));
            String optString3 = jSONObject2.optString(C0145i.i1657027613257dc("rdsvavrXam"));
            int optInt3 = jSONObject2.optInt(C0145i.i1657027613257dc("rdcpkk"));
            Pair<C0448a, ArrayList<Integer>> a = C0402b.m1635a(jSONObject, adSlot, oVar);
            if (!(a == null || a.first == null)) {
                ((C0448a) a.first).mo1196a(jSONObject2.optLong(C0145i.i1657027613257dc("rdsvavrXio~n~")));
            }
            if (a == null) {
                return aVar;
            }
            new C0617a(optString, optInt, optInt2, optString2, optInt3, optString3, (C0448a) a.first, optLong, optLong2, (ArrayList) a.second);
            return aVar;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.o$b */
    /* compiled from: NetApiImpl */
    public static class C0618b {

        /* renamed from: a */
        public final int f2314a;

        /* renamed from: b */
        public final boolean f2315b;

        /* renamed from: c */
        public final C0483s f2316c;

        private C0618b(int i, boolean z, C0483s sVar) {
            this.f2314a = i;
            this.f2315b = z;
            this.f2316c = sVar;
        }

        /* renamed from: a */
        public static C0618b m2995a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt(C10469e.e1657027613270dc("cnff"));
            boolean optBoolean = jSONObject.optBoolean(C10469e.e1657027613270dc("vdpjb|"));
            JSONObject optJSONObject = jSONObject.optJSONObject(C10469e.e1657027613270dc("d`vb"));
            C0483s sVar = new C0483s();
            if (optJSONObject != null) {
                try {
                    sVar.mo1520a(optJSONObject.optInt(C10469e.e1657027613270dc("rdcpkk")));
                    sVar.mo1523b(optJSONObject.optInt(C10469e.e1657027613270dc("cnps[qwm")));
                    sVar.mo1524c(optJSONObject.optInt(C10469e.e1657027613270dc("rdubvaYfefex")));
                    sVar.mo1521a(optJSONObject.optString(C10469e.e1657027613270dc("rdubvaYiido")));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return new C0618b(optInt, optBoolean, sVar);
        }
    }

    C0607o(Context context) {
        this.f2272a = context;
        this.f2273b = m2964d();
        this.f2275d = m2969g();
    }

    /* renamed from: a */
    private static String m2929a(int i) {
        String str;
        if (i != 120) {
            if (i != 160) {
                if (i == 240) {
                    str = "herj";
                } else if (i == 320) {
                    str = "xifsm";
                } else if (i == 480) {
                    str = "xyjgtl";
                } else if (i == 640) {
                    str = "xyzk`uo";
                }
            }
            return C10601c.c1657027613239dc("merj");
        }
        str = "lerj";
        return C10601c.c1657027613239dc(str);
    }

    /* renamed from: a */
    private static String m2930a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(C10548g.g1657027613257dc("pimma"));
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static JSONObject m2931a(AdSlot adSlot) {
        C0619p pVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C10590d.d1657027613220dc("pdppkkgkasooSlj"), C0558m.m2673h().mo1663A());
            jSONObject.put(C10590d.d1657027613220dc("llv"), C0967e.m4489b());
            jSONObject.put(C10590d.d1657027613220dc("cnrse"), C0503h.m2281d().mo1610k());
            jSONObject.put(C10590d.d1657027613220dc("gerq"), C0503h.m2281d().mo1609j());
            jSONObject.put(C10590d.d1657027613220dc("ir]d`utX}zoy"), C0558m.m2673h().mo1723x());
            jSONObject.put(C10590d.d1657027613220dc("cbrb"), C0503h.m2281d().mo1621v());
            if (!(adSlot == null || !C0619p.f2317a.containsKey(Integer.valueOf(adSlot.getCodeId())) || (pVar = C0619p.f2317a.get(Integer.valueOf(adSlot.getCodeId()))) == null)) {
                jSONObject.put(C10590d.d1657027613220dc("l`qweaiji`d"), pVar.mo2013b());
                jSONObject.put(C10590d.d1657027613220dc("l`qwfphcdl"), pVar.mo2015c());
                jSONObject.put(C10590d.d1657027613220dc("l`qwgiodc"), pVar.mo2016d());
                jSONObject.put(C10590d.d1657027613220dc("l`qwwnow"), pVar.mo2017e());
            }
            m2952a(jSONObject, C10590d.d1657027613220dc("kd{tkwbt"), C0503h.m2281d().mo1612m());
            m2952a(jSONObject, C10590d.d1657027613220dc("d`vb"), m2953b(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0126 A[Catch:{ Exception -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012a A[Catch:{ Exception -> 0x017d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0148 A[Catch:{ Exception -> 0x017d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m2932a(com.bytedance.sdk.openadsdk.AdSlot r6, int r7, com.bytedance.sdk.openadsdk.core.p021e.C0479o r8) {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ie"
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = r6.getCodeId()     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "aevzt`"
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r7)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x017d }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x017d }
            if (r1 != 0) goto L_0x0092
        L_0x003f:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x017d }
            r1.<init>()     // Catch:{ Exception -> 0x017d }
            java.lang.String r2 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x017d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x017d }
            if (r2 != 0) goto L_0x005d
            java.lang.String r2 = "ae]j`"
            java.lang.String r2 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getAdId()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x005d:
            java.lang.String r2 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x017d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x017d }
            if (r2 != 0) goto L_0x0076
            java.lang.String r2 = "csgbplpbW`n"
            java.lang.String r2 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getCreativeId()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0076:
            java.lang.String r2 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = "eyv"
            java.lang.String r2 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r3 = r6.getExt()     // Catch:{ Exception -> 0x017d }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0089:
            java.lang.String r2 = "psgum`qXimy"
            java.lang.String r2 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x017d }
        L_0x0092:
            java.lang.String r1 = "rdlgawYjm}bdh"
            java.lang.String r2 = "abaftqccWzcqi"
            r3 = 1
            if (r8 == 0) goto L_0x00cb
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            int r4 = r8.f1731f     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r4)     // Catch:{ Exception -> 0x017d }
            int r1 = r8.f1731f     // Catch:{ Exception -> 0x017d }
            if (r1 != r3) goto L_0x00b6
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            int r2 = r6.getImgAcceptedWidth()     // Catch:{ Exception -> 0x017d }
        L_0x00ae:
            int r4 = r6.getImgAcceptedHeight()     // Catch:{ Exception -> 0x017d }
            r5.m2951a((org.json.JSONObject) r0, (java.lang.String) r1, (int) r2, (int) r4)     // Catch:{ Exception -> 0x017d }
            goto L_0x00db
        L_0x00b6:
            int r1 = r8.f1731f     // Catch:{ Exception -> 0x017d }
            r4 = 2
            if (r1 != r4) goto L_0x00db
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            float r2 = r6.getExpressViewAcceptedWidth()     // Catch:{ Exception -> 0x017d }
            float r4 = r6.getExpressViewAcceptedHeight()     // Catch:{ Exception -> 0x017d }
            r5.m2950a((org.json.JSONObject) r0, (java.lang.String) r1, (float) r2, (float) r4)     // Catch:{ Exception -> 0x017d }
            goto L_0x00db
        L_0x00cb:
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r2)     // Catch:{ Exception -> 0x017d }
            int r2 = r6.getImgAcceptedWidth()     // Catch:{ Exception -> 0x017d }
            goto L_0x00ae
        L_0x00db:
            java.lang.String r1 = "puro[lbt"
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ Exception -> 0x017d }
            java.lang.String r4 = r6.getCodeId()     // Catch:{ Exception -> 0x017d }
            org.json.JSONArray r2 = r2.mo1692g((java.lang.String) r4)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "pnq"
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            int r2 = com.bytedance.sdk.openadsdk.AdSlot.getPosition(r7)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            java.lang.String r1 = "ir]pquvhz}Uo|a"
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            boolean r2 = r6.isSupportDeepLink()     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getNativeAdType()     // Catch:{ Exception -> 0x017d }
            if (r1 > 0) goto L_0x0117
            r1 = 9
            if (r7 == r1) goto L_0x0117
            r1 = 5
            if (r7 != r1) goto L_0x0120
        L_0x0117:
            java.lang.String r1 = "ir]lvlanfVko"
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r1)     // Catch:{ Exception -> 0x017d }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x017d }
        L_0x0120:
            int r1 = r6.getAdCount()     // Catch:{ Exception -> 0x017d }
            if (r1 >= r3) goto L_0x0127
            r1 = 1
        L_0x0127:
            r2 = 3
            if (r1 <= r2) goto L_0x012b
            r1 = 3
        L_0x012b:
            r2 = 7
            if (r7 == r2) goto L_0x0132
            r2 = 8
            if (r7 != r2) goto L_0x0133
        L_0x0132:
            r1 = 1
        L_0x0133:
            if (r8 == 0) goto L_0x013d
            org.json.JSONArray r8 = r8.f1730e     // Catch:{ Exception -> 0x017d }
            if (r8 == 0) goto L_0x013d
            int r1 = r6.getAdCount()     // Catch:{ Exception -> 0x017d }
        L_0x013d:
            java.lang.String r8 = "ae]`kphs"
            java.lang.String r8 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r8)     // Catch:{ Exception -> 0x017d }
            r0.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            if (r7 != r3) goto L_0x017d
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x017d }
            r7.<init>()     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "ir]qkqgsmVhjbck}"
            java.lang.String r8 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r8)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getIsRotateBanner()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "rnvbp`Ysado"
            java.lang.String r8 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r8)     // Catch:{ Exception -> 0x017d }
            int r1 = r6.getRotateTime()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r1)     // Catch:{ Exception -> 0x017d }
            java.lang.String r8 = "rnvbp`Yhzmoy"
            java.lang.String r8 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r8)     // Catch:{ Exception -> 0x017d }
            int r6 = r6.getRotateOrder()     // Catch:{ Exception -> 0x017d }
            r7.put(r8, r6)     // Catch:{ Exception -> 0x017d }
            java.lang.String r6 = "b`lmaw"
            java.lang.String r6 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r6)     // Catch:{ Exception -> 0x017d }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x017d }
        L_0x017d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0607o.m2932a(com.bytedance.sdk.openadsdk.AdSlot, int, com.bytedance.sdk.openadsdk.core.e.o):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[Catch:{ all -> 0x015a }] */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m2933a(com.bytedance.sdk.openadsdk.AdSlot r11, com.bytedance.sdk.openadsdk.core.p021e.C0479o r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "aqr"
            java.lang.String r1 = "4/7-4+0"
            java.lang.String r2 = "ae]p`nYqm{ybcc"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x015a }
            r4.<init>()     // Catch:{ all -> 0x015a }
            if (r12 == 0) goto L_0x0020
            java.lang.String r5 = r12.f1726a     // Catch:{ all -> 0x015a }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x015a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x015a }
            if (r5 == 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            java.lang.String r5 = r12.f1726a     // Catch:{ all -> 0x015a }
            goto L_0x0024
        L_0x0020:
            java.lang.String r5 = com.bytedance.sdk.openadsdk.utils.C0996u.m4642c()     // Catch:{ all -> 0x015a }
        L_0x0024:
            r6 = 7
            java.lang.String r7 = "rds\\p|vb"
            if (r13 != r6) goto L_0x0039
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f1727b     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f1727b     // Catch:{ all -> 0x015a }
        L_0x0035:
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            goto L_0x005a
        L_0x0039:
            r6 = 8
            if (r13 != r6) goto L_0x004a
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f1728c     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f1728c     // Catch:{ all -> 0x015a }
            goto L_0x0035
        L_0x004a:
            r6 = 3
            if (r13 != r6) goto L_0x005a
            if (r12 == 0) goto L_0x005a
            int r6 = r12.f1729d     // Catch:{ all -> 0x015a }
            if (r6 <= 0) goto L_0x005a
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r7)     // Catch:{ all -> 0x015a }
            int r7 = r12.f1729d     // Catch:{ all -> 0x015a }
            goto L_0x0035
        L_0x005a:
            com.bytedance.sdk.openadsdk.core.i.f r6 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ all -> 0x008e }
            java.lang.String r6 = r6.mo1688e()     // Catch:{ all -> 0x008e }
            com.bytedance.sdk.openadsdk.core.i.f r7 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ all -> 0x008e }
            java.lang.String r7 = r7.mo1691f()     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x008e
            if (r7 == 0) goto L_0x008e
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x008e }
            r8.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r9 = "vdppmjh"
            java.lang.String r9 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r9)     // Catch:{ all -> 0x008e }
            r8.put(r9, r6)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "p`pbi"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r6)     // Catch:{ all -> 0x008e }
            r8.put(r6, r7)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "acvfwq"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r6)     // Catch:{ all -> 0x008e }
            r4.put(r6, r8)     // Catch:{ all -> 0x008e }
        L_0x008e:
            java.lang.String r6 = "rdsvavrXam"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r6)     // Catch:{ all -> 0x015a }
            r4.put(r6, r5)     // Catch:{ all -> 0x015a }
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r2)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r1)     // Catch:{ all -> 0x015a }
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r6 = "snwqg`Ysqyo"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r6)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            r4.put(r6, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r6 = r10.m2955b()     // Catch:{ all -> 0x015a }
            r4.put(r0, r6)     // Catch:{ all -> 0x015a }
            android.content.Context r0 = r10.f2272a     // Catch:{ all -> 0x015a }
            r6 = 1
            org.json.JSONObject r0 = com.bytedance.sdk.openadsdk.utils.C0967e.m4484a(r0, r6)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = "ddtjg`"
            java.lang.String r7 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r7)     // Catch:{ all -> 0x015a }
            r4.put(r7, r0)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "urgq"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r7 = m2931a((com.bytedance.sdk.openadsdk.AdSlot) r11)     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "u`"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = com.bytedance.sdk.openadsdk.utils.C0996u.m4631b()     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = "cicmj`j"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r7 = "m`km"
            java.lang.String r7 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r7)     // Catch:{ all -> 0x015a }
            r4.put(r0, r7)     // Catch:{ all -> 0x015a }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x015a }
            r0.<init>()     // Catch:{ all -> 0x015a }
            org.json.JSONObject r13 = r10.m2932a((com.bytedance.sdk.openadsdk.AdSlot) r11, (int) r13, (com.bytedance.sdk.openadsdk.core.p021e.C0479o) r12)     // Catch:{ all -> 0x015a }
            r0.put(r13)     // Catch:{ all -> 0x015a }
            java.lang.String r13 = "aeqokqu"
            java.lang.String r13 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r13)     // Catch:{ all -> 0x015a }
            r4.put(r13, r0)     // Catch:{ all -> 0x015a }
            r10.m2949a((org.json.JSONObject) r4, (com.bytedance.sdk.openadsdk.core.p021e.C0479o) r12)     // Catch:{ all -> 0x015a }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x015a }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r7
            java.lang.String r0 = "tr"
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r0)     // Catch:{ all -> 0x015a }
            r4.put(r0, r12)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = ""
            java.lang.String r7 = r11.getCodeId()     // Catch:{ all -> 0x015a }
            if (r7 == 0) goto L_0x0135
            if (r5 == 0) goto L_0x0135
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = r11.getCodeId()     // Catch:{ all -> 0x015a }
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r11.concat(r5)     // Catch:{ all -> 0x015a }
        L_0x0135:
            java.lang.String r11 = "rds\\wlai"
            java.lang.String r11 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r11)     // Catch:{ all -> 0x015a }
            java.lang.String r12 = com.bytedance.sdk.component.utils.C10626e.m31201a((java.lang.String) r0)     // Catch:{ all -> 0x015a }
            r4.put(r11, r12)     // Catch:{ all -> 0x015a }
            org.json.JSONObject r3 = com.bytedance.sdk.component.utils.C10621a.m31186a((org.json.JSONObject) r4)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r2)     // Catch:{ all -> 0x015a }
            java.lang.String r12 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r1)     // Catch:{ all -> 0x015a }
            r3.put(r11, r12)     // Catch:{ all -> 0x015a }
            java.lang.String r11 = "owgqw`gX~lxxeb`Pdhbv"
            java.lang.String r11 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r11)     // Catch:{ all -> 0x015a }
            r3.put(r11, r6)     // Catch:{ all -> 0x015a }
        L_0x015a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0607o.m2933a(com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.e.o, int):org.json.JSONObject");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2934a(long j, String str, int i, C0617a aVar, int i2, String str2) {
    }

    /* renamed from: a */
    private void m2935a(C0106a aVar) {
        if (aVar != null) {
            String optString = aVar.mo306b().optString(C0145i.i1657027613257dc("lne\\a}rui"), "");
            long c = C0996u.m4641c(optString);
            int d = C0996u.m4647d(optString);
            if (c == 0) {
                c = this.f2276e;
            }
            this.f2276e = c;
            if (d == 0) {
                d = this.f2277f;
            }
            this.f2277f = d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2936a(C0448a aVar) {
        List<C0477n> b = aVar.mo1199b();
        if (b != null && b.size() != 0) {
            for (int i = 0; i < b.size(); i++) {
                C0477n nVar = b.get(i);
                if (nVar != null && nVar.mo1406b() == null) {
                    m2948a("", nVar.mo1333M());
                    m2948a("", nVar.mo1334N());
                    List<C0463k> P = nVar.mo1336P();
                    if (P != null && P.size() > 0) {
                        for (int i2 = 0; i2 < P.size(); i2++) {
                            m2937a(nVar, P.get(i2));
                        }
                    }
                    if (nVar.mo1330J() != null) {
                        m2948a(nVar.mo1330J().mo62921h(), (C0463k) null);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2937a(final C0477n nVar, C0463k kVar) {
        C10638l.m31238c(C10522a.a1657027613264dc("ile@efnb"), C10522a.a1657027613264dc("lncgMhaFfmXn|b|{*1"));
        if (kVar != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            C0750a.m3820a(kVar).mo64102a((C10565n) new C10565n() {
                /* renamed from: a */
                public void mo256a(int i, String str, Throwable th) {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C10601c.c1657027613239dc("esplvZehll"), i);
                        jSONObject.put(C10601c.c1657027613239dc("esplvZkb{zkli"), str);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C10638l.m31238c(C10601c.c1657027613239dc("ile@efnb"), C10601c.c1657027613239dc("lncgMhaFfmXn|b|{*1夣贶"));
                    Context a = C0607o.this.f2272a;
                    C0477n nVar = nVar;
                    C0136e.m620b(a, nVar, C0996u.m4617a(nVar), C10601c.c1657027613239dc("lncg[lkfolUn~a}"), currentTimeMillis, jSONObject);
                }

                /* renamed from: a */
                public void mo257a(C10561j jVar) {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C10594g.g1657027613239dc("psgokdbX{`pn"), jVar.mo64120f() / 1024);
                        jSONObject.put(C10594g.g1657027613239dc("lnabhZefkao"), jVar.mo64118d() ? 1 : 0);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C10638l.m31238c(C10594g.g1657027613239dc("ile@efnb"), C10594g.g1657027613239dc("lncgMhaFfmXn|b|{*1戂劌"));
                    Context a = C0607o.this.f2272a;
                    C0477n nVar = nVar;
                    C0136e.m620b(a, nVar, C0996u.m4617a(nVar), C10594g.g1657027613239dc("lncg[lkfolUxynmjcb"), currentTimeMillis, jSONObject);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2938a(C0479o oVar, long j, long j2, int i, long j3, C0477n nVar, String str) {
        C0479o oVar2 = oVar;
        if (C0558m.m2673h().mo1668F()) {
            JSONObject jSONObject = new JSONObject();
            long j4 = 0;
            if (oVar2 != null) {
                try {
                    if (oVar2.f1732g > 0) {
                        jSONObject.put(C10590d.d1657027613220dc("cmkfjqYt|hxSygbu"), j - oVar2.f1732g);
                        j4 = j3 - oVar2.f1732g;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            jSONObject.put(C10590d.d1657027613220dc("ndvtkwmX|`gn"), j2 - j);
            int i2 = i;
            jSONObject.put(C10590d.d1657027613220dc("sdtfvZrnel"), i);
            jSONObject.put(C10590d.d1657027613220dc("cmkfjqYbfmUe`k"), j3 - j2);
            try {
                C0136e.m598a(this.f2272a, nVar, str, C10590d.d1657027613220dc("lncg[dbX|`gn"), j4, jSONObject);
                while (true) {
                    char c = 19;
                    while (true) {
                        switch (c) {
                            case 18:
                                return;
                            case 20:
                            default:
                                c = 18;
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2939a(C0561n.C0562a aVar, C0449b bVar) {
        aVar.mo186a(-1, C0492g.m2254a(-1));
        bVar.mo1204a(-1);
        C0449b.m1835a(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2940a(C0561n.C0563b bVar) {
        bVar.mo228a(-1, C0492g.m2254a(-1));
    }

    /* renamed from: a */
    private void m2948a(String str, C0463k kVar) {
        if (!TextUtils.isEmpty(str)) {
            C0750a.m3821a(str).mo64102a(this.f2278h);
        } else if (kVar != null) {
            C0750a.m3820a(kVar).mo64102a(this.f2278h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r2 = 'J';
        r3 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        switch(r3) {
            case 55: goto L_0x0029;
            case 56: goto L_0x0029;
            case 57: goto L_0x0021;
            default: goto L_0x0020;
        };
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2949a(org.json.JSONObject r2, com.bytedance.sdk.openadsdk.core.p021e.C0479o r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0029
            org.json.JSONArray r0 = r3.f1730e
            if (r0 != 0) goto L_0x0007
            goto L_0x0029
        L_0x0007:
            java.lang.String r0 = "snwqg`YsmdkbS}|`tdqgK|rd"
            java.lang.String r0 = com.bytedance.sdk.component.p323e.p326c.C10594g.g1657027613239dc(r0)     // Catch:{ Exception -> 0x0029 }
            org.json.JSONArray r3 = r3.f1730e     // Catch:{ Exception -> 0x0029 }
            r2.put(r0, r3)     // Catch:{ Exception -> 0x0029 }
        L_0x0012:
            r2 = 73
            r3 = 96
        L_0x0016:
            switch(r2) {
                case 72: goto L_0x0021;
                case 73: goto L_0x001a;
                case 74: goto L_0x001d;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0026
        L_0x001a:
            switch(r3) {
                case 94: goto L_0x0012;
                case 95: goto L_0x0021;
                case 96: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            switch(r3) {
                case 55: goto L_0x0029;
                case 56: goto L_0x0029;
                case 57: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0012
        L_0x0021:
            r2 = 74
            r3 = 55
            goto L_0x0016
        L_0x0026:
            r2 = 72
            goto L_0x0016
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0607o.m2949a(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.e.o):void");
    }

    /* renamed from: a */
    private void m2950a(JSONObject jSONObject, String str, float f, float f2) {
        if (f >= 0.0f && f2 >= 0.0f) {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                jSONObject2.put(C0145i.i1657027613257dc("whfwl"), (int) f);
                jSONObject2.put(C0145i.i1657027613257dc("hdkdlq"), (int) f2);
                jSONArray.put(jSONObject2);
                jSONObject.put(str, jSONArray);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r4 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        switch(r5) {
            case 52: goto L_0x0029;
            case 53: goto L_0x0033;
            case 54: goto L_0x003e;
            default: goto L_0x0032;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        switch(r4) {
            case 29: goto L_0x0029;
            case 30: goto L_0x0029;
            case 31: goto L_0x002f;
            default: goto L_0x0036;
        };
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2951a(org.json.JSONObject r4, java.lang.String r5, int r6, int r7) {
        /*
            r3 = this;
            if (r6 <= 0) goto L_0x0043
            if (r7 <= 0) goto L_0x0043
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.String r2 = "whfwl"
            java.lang.String r2 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r2)     // Catch:{ Exception -> 0x0043 }
            r0.put(r2, r6)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r6 = "hdkdlq"
            java.lang.String r6 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r6)     // Catch:{ Exception -> 0x0043 }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x0043 }
            r1.put(r0)     // Catch:{ Exception -> 0x0043 }
            r4.put(r5, r1)     // Catch:{ Exception -> 0x0043 }
            r4 = 55
            r5 = 0
        L_0x0029:
            r6 = 72
        L_0x002b:
            switch(r6) {
                case 72: goto L_0x003e;
                case 73: goto L_0x0039;
                case 74: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0029
        L_0x002f:
            switch(r5) {
                case 52: goto L_0x0029;
                case 53: goto L_0x0033;
                case 54: goto L_0x003e;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x003e
        L_0x0033:
            switch(r4) {
                case 29: goto L_0x0029;
                case 30: goto L_0x0029;
                case 31: goto L_0x002f;
                default: goto L_0x0036;
            }
        L_0x0036:
            r4 = 30
            goto L_0x0033
        L_0x0039:
            r6 = 57
            if (r5 > r6) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            r6 = 73
            r5 = 16
            goto L_0x002b
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0607o.m2951a(org.json.JSONObject, java.lang.String, int, int):void");
    }

    /* renamed from: a */
    private static void m2952a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(str, str2);
        }
    }

    /* renamed from: b */
    private static String m2953b(AdSlot adSlot) {
        if (adSlot == null) {
            return "";
        }
        String n = C0503h.m2281d().mo1613n();
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(n)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return n;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString(C10584a.a1657027613243dc("n`of"), (String) null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(n);
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString(C10584a.a1657027613243dc("n`of"), (String) null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return n;
        }
    }

    /* renamed from: b */
    private JSONArray m2954b(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (FilterWord id : list) {
            jSONArray.put(id.getId());
        }
        return jSONArray;
    }

    @JProtect
    /* renamed from: b */
    private JSONObject m2955b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C10594g.g1657027613239dc("aqrj`"), C0503h.m2281d().mo1603f());
            jSONObject.put(C10594g.g1657027613239dc("n`of"), C0503h.m2281d().mo1606g());
            m2970g(jSONObject);
            Context a = C0558m.m2663a();
            String str = "";
            if (a != null) {
                try {
                    str = a.getPackageResourcePath();
                } catch (Throwable th) {
                    String g1657027613239dc = C10594g.g1657027613239dc("NdvBtlOjxe");
                    C10638l.m31242e(g1657027613239dc, C10594g.g1657027613239dc("f`koaa&sg)mnx-zgu1scdytymstr=wqSUCOHDRNGG\n[MNENWT\u0012CUA^\u0019\u0018\\HISO\u0004\u001f") + th.getMessage());
                }
            }
            jSONObject.put(C10594g.g1657027613239dc("p`ahebcXagymabP`pf{"), str);
            int i = 0;
            C0996u.m4626a(jSONObject, false);
            jSONObject.put(C10594g.g1657027613239dc("ir]selbXiyz"), C0503h.m2281d().mo1611l());
            if (C0624s.m3017a() != null) {
                jSONObject.put(C10594g.g1657027613239dc("aqi\\wlai"), C0624s.m3017a());
            }
            jSONObject.put(C10594g.g1657027613239dc("aqr\\vphiagmTxdcj"), (System.currentTimeMillis() - TTAdSdk.INIT_TIME) / 1000);
            jSONObject.put(C10594g.g1657027613239dc("flumehc"), C0967e.m4508i(this.f2272a));
            String g1657027613239dc2 = C10594g.g1657027613239dc("ir]jjlr");
            if (TTAdSdk.isInitSuccess()) {
                i = 1;
            }
            jSONObject.put(g1657027613239dc2, i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @JProtect
    /* renamed from: b */
    private JSONObject m2956b(C0477n nVar, List<FilterWord> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C10545d.d1657027613261dc("abvjkk"), C10545d.d1657027613261dc("dhqomnc"));
            jSONObject2.put(C10545d.d1657027613261dc("thofwqgjx"), System.currentTimeMillis());
            jSONObject2.put(C10545d.d1657027613261dc("ae]p`nYqm{ybcc"), C10601c.c1657027613239dc("4/7-4+0"));
            jSONObject2.put(C10601c.c1657027613239dc("eyvqe"), nVar.mo1382ac());
            jSONObject2.put(C10601c.c1657027613239dc("fhnwawYpg{nx"), m2954b(list));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put(C10601c.c1657027613239dc("abvjkku"), jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    @JProtect
    /* renamed from: b */
    public void m2957b(AdSlot adSlot, C0479o oVar, int i, C0561n.C0562a aVar) {
        AdSlot adSlot2 = adSlot;
        C0561n.C0562a aVar2 = aVar;
        final C0449b bVar = new C0449b();
        bVar.mo1205a(adSlot2);
        if (!C0515e.m2397a()) {
            if (aVar2 != null) {
                aVar2.mo186a(1000, C10591e.e1657027613237dc("Ae\"qatsb{}*b-zj}a}aug{a9jzin{{\f\u0001rOADUB\bJEEXLM[\u0010H]FF\u0015fVV^V^\u001c|s"));
                bVar.mo1204a(1000);
                C0449b.m1835a(bVar);
            }
        } else if (C0558m.m2673h().mo1725z()) {
            C0512d.m2378a((C0510b) null).mo1659a(false);
            if (aVar2 != null) {
                if (m2959b(adSlot.getCodeId())) {
                    aVar2.mo186a(-8, C0492g.m2254a(-8));
                    bVar.mo1204a(-8);
                    C0449b.m1835a(bVar);
                } else if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    C0796b.m3985a().mo2612c();
                    bVar.mo1209b(2);
                    bVar.mo1206a(adSlot.getBidAdm());
                    String e1657027613237dc = C10591e.e1657027613237dc("bhfgmka");
                    C10638l.m31235b(e1657027613237dc, C10591e.e1657027613237dc("gdvB`%dnlHnf,d}/fp~zp９c8nswp=zvRDAWH\\\u0006WI[YN\fYFJ\u0010CWGAGXR\\\u0019[_JXLK)2'.!+2}h\u000b#/\r)#bn\u001c\u0016fyk") + C10201b.m29279a(adSlot.getBidAdm()));
                    if (C0558m.m2673h().mo1666D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                        C0996u.m4623a(C10591e.e1657027613237dc("P`ldh`YCmklS@aku"), adSlot.getBidAdm(), this.f2272a);
                    }
                    try {
                        JSONObject a = mo1839a(new JSONObject(adSlot.getBidAdm()));
                        if (a == null) {
                            m2939a(aVar2, bVar);
                            return;
                        }
                        C0617a a2 = C0617a.m2994a(a, adSlot2, oVar);
                        bVar.mo1207a(a2.f2313j);
                        C0517j.m2475a(this.f2272a, a2.f2312i);
                        if (a2.f2307d != 20000) {
                            aVar2.mo186a(a2.f2307d, a2.f2308e);
                            bVar.mo1204a(a2.f2307d);
                            C0449b.m1835a(bVar);
                        } else if (a2.f2311h == null) {
                            m2939a(aVar2, bVar);
                        } else {
                            if (a2.f2311h.mo1199b() != null && a2.f2311h.mo1199b().size() > 0) {
                                C0136e.m607a(a2.f2311h.mo1199b().get(0), C0996u.m4632b(i));
                            }
                            a2.f2311h.mo1202c(a.toString());
                            aVar2.mo187a(a2.f2311h, bVar);
                            m2936a(a2.f2311h);
                        }
                    } catch (Throwable th) {
                        C10638l.m31239c(C10591e.e1657027613237dc("NdvBtlOjxe"), C10591e.e1657027613237dc("gdv#ea&bz{ey6-"), th);
                        m2939a(aVar2, bVar);
                    }
                } else {
                    C0479o oVar2 = oVar;
                    JSONObject a3 = m2933a(adSlot, oVar, i);
                    if (a3 == null) {
                        aVar2.mo186a(-9, C0492g.m2254a(-9));
                        bVar.mo1204a(-9);
                        C0449b.m1835a(bVar);
                        return;
                    }
                    if (C0558m.m2673h().mo1666D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                        C0996u.m4623a(C10591e.e1657027613237dc("P`ldh`YCmklS@aku"), a3.toString(), this.f2272a);
                    }
                    String a4 = C0996u.m4619a(C10591e.e1657027613237dc("/`rj+db(}gcdb\"}k{>uv`Jwsk6"), true);
                    C10582d b = C0835d.m4093a().mo2660b().mo64150b();
                    try {
                        b.mo64176a(C0196d.m815a(b, a4));
                    } catch (Exception unused) {
                    }
                    b.mo64185a(a3);
                    HashMap hashMap = new HashMap();
                    hashMap.put(C10591e.e1657027613237dc("eyvqeZrnelUxxl|{"), Long.valueOf(System.currentTimeMillis()));
                    b.mo64182e(hashMap);
                    Map<String, String> a5 = C0624s.m3018a(a4, a3.toString());
                    if (a5 != null && a5.size() > 0) {
                        C10638l.m31238c(C10591e.e1657027613237dc("mrqgo%kt{maCiljjbb("), a5.toString());
                        for (String next : a5.keySet()) {
                            try {
                                b.mo64179b(next, a5.get(next));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    try {
                        b.mo64179b(C10591e.e1657027613237dc("Urgq)Dabf}"), C0996u.m4631b());
                    } catch (Exception unused3) {
                    }
                    final long currentTimeMillis = System.currentTimeMillis();
                    final AtomicLong atomicLong = new AtomicLong(currentTimeMillis);
                    final AtomicLong atomicLong2 = new AtomicLong(currentTimeMillis);
                    final C0561n.C0562a aVar3 = aVar;
                    final AdSlot adSlot3 = adSlot;
                    final int i2 = i;
                    final C0479o oVar3 = oVar;
                    b.mo64184a((C10575a) new C10575a() {
                        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                            */
                        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
                        /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
                        /* renamed from: a */
                        public void mo444a(com.bytedance.sdk.component.p323e.p325b.C10581c r23, com.bytedance.sdk.component.p323e.C10576b r24) {
                            /*
                                r22 = this;
                                r1 = r22
                                java.lang.String r2 = "p`ppaZ`fae"
                                if (r24 == 0) goto L_0x030c
                                boolean r0 = r24.mo64166f()
                                if (r0 == 0) goto L_0x02dc
                                java.util.concurrent.atomic.AtomicLong r0 = r3     // Catch:{ all -> 0x02ab }
                                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02ab }
                                r0.set(r3)     // Catch:{ all -> 0x02ab }
                                java.lang.String r0 = r24.mo64164d()     // Catch:{ all -> 0x02ab }
                                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x02ab }
                                r3.<init>(r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.i.f r4 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ all -> 0x02ab }
                                boolean r4 = r4.mo1666D()     // Catch:{ all -> 0x02ab }
                                if (r4 == 0) goto L_0x0046
                                com.bytedance.sdk.openadsdk.TTAdManager r4 = com.bytedance.sdk.openadsdk.TTAdSdk.getAdManager()     // Catch:{ all -> 0x02ab }
                                int r4 = r4.getDebugLog()     // Catch:{ all -> 0x02ab }
                                r5 = 1
                                if (r4 != r5) goto L_0x0046
                                java.lang.String r4 = r3.toString()     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "P`ldh`YCmklS@aku"
                                java.lang.String r5 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r5)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r6 = com.bytedance.sdk.openadsdk.core.C0607o.this     // Catch:{ all -> 0x02ab }
                                android.content.Context r6 = r6.f2272a     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.utils.C0996u.m4623a((java.lang.String) r5, (java.lang.String) r4, (android.content.Context) r6)     // Catch:{ all -> 0x02ab }
                            L_0x0046:
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r4.mo1206a((java.lang.String) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C0607o.this     // Catch:{ all -> 0x02ab }
                                org.json.JSONObject r0 = r0.mo1839a((org.json.JSONObject) r3)     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x0076
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C0607o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.m2939a((com.bytedance.sdk.openadsdk.core.C0561n.C0562a) r3, (com.bytedance.sdk.openadsdk.core.p021e.C0449b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C0607o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo64167g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                r10 = 0
                                r11 = -1
                                java.lang.String r0 = "m`vf$ugu{lUmmdb"
                                java.lang.String r12 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r0)     // Catch:{ all -> 0x02ab }
                                r5.m2934a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                return
                            L_0x0076:
                                com.bytedance.sdk.openadsdk.AdSlot r3 = r6     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r4 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o$a r10 = com.bytedance.sdk.openadsdk.core.C0607o.C0617a.m2994a(r0, r3, r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4     // Catch:{ all -> 0x02ab }
                                java.util.ArrayList<java.lang.Integer> r4 = r10.f2313j     // Catch:{ all -> 0x02ab }
                                r3.mo1207a((java.util.ArrayList<java.lang.Integer>) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f2311h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.C0402b.C0403a.m1654a((com.bytedance.sdk.openadsdk.core.p021e.C0448a) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r3 = com.bytedance.sdk.openadsdk.core.C0607o.this     // Catch:{ all -> 0x02ab }
                                android.content.Context r3 = r3.f2272a     // Catch:{ all -> 0x02ab }
                                java.lang.String r4 = r10.f2312i     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.C0517j.m2475a(r3, r4)     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f2307d     // Catch:{ all -> 0x02ab }
                                r4 = 20000(0x4e20, float:2.8026E-41)
                                if (r3 == r4) goto L_0x00e6
                                com.bytedance.sdk.openadsdk.core.e.b r0 = r4     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f2307d     // Catch:{ all -> 0x02ab }
                                r0.mo1204a((int) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.i.f r0 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ all -> 0x02ab }
                                boolean r0 = r0.mo1713o()     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x00bf
                                int r0 = r10.f2307d     // Catch:{ all -> 0x02ab }
                                r3 = 40029(0x9c5d, float:5.6093E-41)
                                if (r0 != r3) goto L_0x00bf
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                r3 = -100
                                java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C0492g.m2254a(r3)     // Catch:{ all -> 0x02ab }
                            L_0x00bb:
                                r0.mo186a((int) r3, (java.lang.String) r4)     // Catch:{ all -> 0x02ab }
                                goto L_0x00c6
                            L_0x00bf:
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                int r3 = r10.f2307d     // Catch:{ all -> 0x02ab }
                                java.lang.String r4 = r10.f2308e     // Catch:{ all -> 0x02ab }
                                goto L_0x00bb
                            L_0x00c6:
                                com.bytedance.sdk.openadsdk.core.e.b r0 = r4     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.p021e.C0449b.m1835a((com.bytedance.sdk.openadsdk.core.p021e.C0449b) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C0607o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo64167g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                int r11 = r10.f2307d     // Catch:{ all -> 0x02ab }
                                int r0 = r10.f2309f     // Catch:{ all -> 0x02ab }
                                java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02ab }
                                r5.m2934a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                goto L_0x02aa
                            L_0x00e6:
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f2311h     // Catch:{ all -> 0x02ab }
                                if (r3 != 0) goto L_0x010a
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C0607o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.m2939a((com.bytedance.sdk.openadsdk.core.C0561n.C0562a) r3, (com.bytedance.sdk.openadsdk.core.p021e.C0449b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C0607o.this     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo64167g()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6     // Catch:{ all -> 0x02ab }
                                java.lang.String r8 = r0.getCodeId()     // Catch:{ all -> 0x02ab }
                                int r9 = r7     // Catch:{ all -> 0x02ab }
                                r11 = -1
                                java.lang.String r12 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r2)     // Catch:{ all -> 0x02ab }
                                r5.m2934a(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ab }
                                return
                            L_0x010a:
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f2311h     // Catch:{ all -> 0x02ab }
                                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02ab }
                                r3.mo1202c(r0)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r0 = r9     // Catch:{ all -> 0x02ab }
                                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02ab }
                                r0.set(r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x013f
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.r r0 = r0.f1734i     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x013f
                                com.bytedance.sdk.openadsdk.core.e.o r0 = r8     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.r r11 = r0.f1734i     // Catch:{ all -> 0x02ab }
                                long r12 = r10     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r0 = r3     // Catch:{ all -> 0x02ab }
                                long r14 = r0.get()     // Catch:{ all -> 0x02ab }
                                int r0 = r10.f2304a     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r3 = r9     // Catch:{ all -> 0x02ab }
                                long r17 = r3.get()     // Catch:{ all -> 0x02ab }
                                r16 = r0
                                r11.mo1509a(r12, r14, r16, r17)     // Catch:{ all -> 0x02ab }
                            L_0x013f:
                                com.bytedance.sdk.openadsdk.core.n$a r0 = r5     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f2311h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4     // Catch:{ all -> 0x02ab }
                                r0.mo187a((com.bytedance.sdk.openadsdk.core.p021e.C0448a) r3, (com.bytedance.sdk.openadsdk.core.p021e.C0449b) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C0607o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r3 = r10.f2311h     // Catch:{ all -> 0x02ab }
                                r0.m2936a((com.bytedance.sdk.openadsdk.core.p021e.C0448a) r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f2311h     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.p021e.C0448a.m1825a((com.bytedance.sdk.openadsdk.core.p021e.C0448a) r0)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f2311h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.mo1199b()     // Catch:{ all -> 0x02ab }
                                if (r0 == 0) goto L_0x02a4
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f2311h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.mo1199b()     // Catch:{ all -> 0x02ab }
                                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x02ab }
                                if (r0 != 0) goto L_0x02a1
                                com.bytedance.sdk.openadsdk.core.e.a r0 = r10.f2311h     // Catch:{ all -> 0x02ab }
                                java.util.List r0 = r0.mo1199b()     // Catch:{ all -> 0x02ab }
                                r3 = 0
                                java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.n r0 = (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r0     // Catch:{ all -> 0x02ab }
                                int r3 = r7     // Catch:{ all -> 0x02ab }
                                java.lang.String r3 = com.bytedance.sdk.openadsdk.utils.C0996u.m4632b((int) r3)     // Catch:{ all -> 0x02ab }
                                java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x02ab }
                                r4.<init>()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r5 = r8     // Catch:{ all -> 0x02ab }
                                if (r5 == 0) goto L_0x01cb
                                com.bytedance.sdk.openadsdk.core.e.o r5 = r8     // Catch:{ all -> 0x02ab }
                                long r5 = r5.f1732g     // Catch:{ all -> 0x02ab }
                                r7 = 0
                                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                                if (r9 <= 0) goto L_0x01cb
                                java.lang.String r5 = "cmkfjqYt|hxSygbu"
                                java.lang.String r5 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r8 = r8     // Catch:{ all -> 0x02ab }
                                long r8 = r8.f1732g     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "lncg[qu"
                                java.lang.String r5 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r5)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r6 = r8     // Catch:{ all -> 0x02ab }
                                long r6 = r6.f1732g     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "tnvbhZrnel"
                                java.lang.String r5 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r8 = r8     // Catch:{ all -> 0x02ab }
                                long r8 = r8.f1732g     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                            L_0x01cb:
                                java.lang.String r5 = "rdsvavrX|z"
                                java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "s^pfrlebW}y"
                                java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f2305b     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "s^qfjaYs{"
                                java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f2306c     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "c^pfrlebW}y"
                                java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r3     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "c^gm`Zrt"
                                java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "ndvtkwmX|`gn"
                                java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r24.mo64167g()     // Catch:{ all -> 0x02ab }
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "gn]wmhc"
                                java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                long r6 = r10.f2305b     // Catch:{ all -> 0x02ab }
                                long r8 = r10     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "sdtfvZrnel"
                                java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                int r6 = r10.f2304a     // Catch:{ all -> 0x02ab }
                                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "b`ah[qojm"
                                java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r3     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                long r8 = r10.f2306c     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                java.lang.String r5 = "cmkfjqYbfmUe`k"
                                java.lang.String r5 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r5)     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r6 = r9     // Catch:{ all -> 0x02ab }
                                long r6 = r6.get()     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r8 = r3     // Catch:{ all -> 0x02ab }
                                long r8 = r8.get()     // Catch:{ all -> 0x02ab }
                                long r6 = r6 - r8
                                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ab }
                                r4.put(r5, r6)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.p000b.C0136e.m613a((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r0, (java.lang.String) r3, (java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.o r11 = com.bytedance.sdk.openadsdk.core.C0607o.this     // Catch:{ all -> 0x02ab }
                                com.bytedance.sdk.openadsdk.core.e.o r12 = r8     // Catch:{ all -> 0x02ab }
                                long r13 = r10     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r4 = r3     // Catch:{ all -> 0x02ab }
                                long r15 = r4.get()     // Catch:{ all -> 0x02ab }
                                int r4 = r10.f2304a     // Catch:{ all -> 0x02ab }
                                java.util.concurrent.atomic.AtomicLong r5 = r9     // Catch:{ all -> 0x02ab }
                                long r18 = r5.get()     // Catch:{ all -> 0x02ab }
                                r17 = r4
                                r20 = r0
                                r21 = r3
                                r11.m2938a((com.bytedance.sdk.openadsdk.core.p021e.C0479o) r12, (long) r13, (long) r15, (int) r17, (long) r18, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r20, (java.lang.String) r21)     // Catch:{ all -> 0x02ab }
                                goto L_0x030c
                            L_0x02a1:
                                r0 = 53
                                goto L_0x02a6
                            L_0x02a4:
                                r0 = 51
                            L_0x02a6:
                                switch(r0) {
                                    case 51: goto L_0x030c;
                                    case 52: goto L_0x02aa;
                                    case 53: goto L_0x030c;
                                    default: goto L_0x02a9;
                                }
                            L_0x02a9:
                                goto L_0x02a4
                            L_0x02aa:
                                return
                            L_0x02ab:
                                r0 = move-exception
                                java.lang.String r3 = "NdvBtlOjxe"
                                java.lang.String r3 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r3)
                                java.lang.String r4 = "gdv#ea&bz{ey6-"
                                java.lang.String r4 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r4)
                                com.bytedance.sdk.component.utils.C10638l.m31239c(r3, r4, r0)
                                com.bytedance.sdk.openadsdk.core.o r0 = com.bytedance.sdk.openadsdk.core.C0607o.this
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5
                                com.bytedance.sdk.openadsdk.core.e.b r4 = r4
                                r0.m2939a((com.bytedance.sdk.openadsdk.core.C0561n.C0562a) r3, (com.bytedance.sdk.openadsdk.core.p021e.C0449b) r4)
                                com.bytedance.sdk.openadsdk.core.o r5 = com.bytedance.sdk.openadsdk.core.C0607o.this
                                long r6 = r24.mo64167g()
                                com.bytedance.sdk.openadsdk.AdSlot r0 = r6
                                java.lang.String r8 = r0.getCodeId()
                                int r9 = r7
                                r10 = 0
                                r11 = -1
                                java.lang.String r12 = com.bytedance.sdk.openadsdk.p000b.C0145i.i1657027613257dc(r2)
                                r5.m2934a(r6, r8, r9, r10, r11, r12)
                                goto L_0x030c
                            L_0x02dc:
                                int r0 = r24.mo64160a()
                                java.lang.String r2 = r24.mo64162b()
                                com.bytedance.sdk.openadsdk.core.n$a r3 = r5
                                r3.mo186a((int) r0, (java.lang.String) r2)
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4
                                r3.mo1204a((int) r0)
                                com.bytedance.sdk.openadsdk.core.e.b r3 = r4
                                com.bytedance.sdk.openadsdk.core.p021e.C0449b.m1835a((com.bytedance.sdk.openadsdk.core.p021e.C0449b) r3)
                                com.bytedance.sdk.openadsdk.core.o r13 = com.bytedance.sdk.openadsdk.core.C0607o.this
                                long r14 = r24.mo64167g()
                                com.bytedance.sdk.openadsdk.AdSlot r3 = r6
                                java.lang.String r16 = r3.getCodeId()
                                int r3 = r7
                                r18 = 0
                                r17 = r3
                                r19 = r0
                                r20 = r2
                                r13.m2934a(r14, r16, r17, r18, r19, r20)
                            L_0x030c:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0607o.C06103.mo444a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                        }

                        /* renamed from: a */
                        public void mo445a(C10581c cVar, IOException iOException) {
                            if (C0558m.m2673h().mo1666D() && TTAdSdk.getAdManager().getDebugLog() == 1) {
                                C0996u.m4623a(C10469e.e1657027613270dc("P`ldh`YCmklS@aku"), iOException != null ? iOException.getMessage() : null, C0607o.this.f2272a);
                            }
                            long longValue = ((Long) cVar.mo64180c().get(C10469e.e1657027613270dc("eyvqeZrnelUxxl|{"))).longValue();
                            long currentTimeMillis = System.currentTimeMillis();
                            String message = iOException != null ? iOException.getMessage() : "";
                            if (iOException != null && SocketTimeoutException.class.equals(iOException.getCause())) {
                                aVar3.mo186a(602, message);
                            }
                            aVar3.mo186a(602, message);
                            C10638l.m31231a(C10469e.e1657027613270dc("NdvBtlOjxe"), C10469e.e1657027613270dc("ooDbmisum3*"), 601);
                            bVar.mo1204a(601);
                            C0449b.m1835a(bVar);
                            C0607o.this.m2934a(currentTimeMillis - longValue, adSlot3.getCodeId(), i2, (C0617a) null, 601, message);
                        }
                    });
                    C0439d.m1800a().mo1187b();
                }
            }
        } else if (aVar2 != null) {
            aVar2.mo186a(-16, C0492g.m2254a(-16));
            bVar.mo1204a(1001);
            C0449b.m1835a(bVar);
        }
    }

    /* renamed from: b */
    private void m2958b(JSONObject jSONObject, String str) {
        C10582d b = C0835d.m4093a().mo2660b().mo64150b();
        b.mo64176a(str);
        b.mo64185a(jSONObject);
        b.mo64183a();
    }

    /* renamed from: b */
    private boolean m2959b(String str) {
        if (C0444b.m1816a()) {
            return true;
        }
        if (!C0444b.m1817a(str)) {
            return false;
        }
        String b = C0444b.m1818b();
        if (!TextUtils.isEmpty(b)) {
            C0136e.m603a(this.f2272a, b, System.currentTimeMillis());
        }
        return true;
    }

    @JProtect
    /* renamed from: c */
    private JSONObject m2960c() {
        char c = ' ';
        while (true) {
            switch (c) {
                case 31:
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C0145i.i1657027613257dc("u`"), C0996u.m4631b());
                        jSONObject.put(C0145i.i1657027613257dc("ae]p`nYqm{ybcc"), C0145i.i1657027613257dc("4/7-4+0"));
                        jSONObject.put(C0145i.i1657027613257dc("sho\\ku"), m2930a(this.f2272a));
                        int i = 1;
                        jSONObject.put(C0145i.i1657027613257dc("rnmw"), this.f2273b ? 1 : 0);
                        jSONObject.put(C0145i.i1657027613257dc("thof~jhb"), m2967f());
                        jSONObject.put(C0145i.i1657027613257dc("abafwv"), C10642o.m31264g(this.f2272a));
                        jSONObject.put(C0145i.i1657027613257dc("or"), C0145i.i1657027613257dc("Aofqklb"));
                        jSONObject.put(C0145i.i1657027613257dc("or]uawungg"), Build.VERSION.RELEASE);
                        jSONObject.put(C0145i.i1657027613257dc("or]btl"), Build.VERSION.SDK_INT);
                        jSONObject.put(C0145i.i1657027613257dc("ddtjg`Ysqyo"), this.f2275d);
                        jSONObject.put(C0145i.i1657027613257dc("ddtjg`Yjgmog"), Build.MODEL);
                        jSONObject.put(C0145i.i1657027613257dc("ddtjg`Yezhdo"), Build.BRAND);
                        jSONObject.put(C10584a.a1657027613243dc("ddtjg`Yjigmmnzzbt`"), Build.MANUFACTURER);
                        jSONObject.put(C10584a.a1657027613243dc("l`ldqdab"), Locale.getDefault().getLanguage());
                        String a1657027613243dc = C10584a.a1657027613243dc("rdqlhprngg");
                        jSONObject.put(a1657027613243dc, C1002v.m4744d(this.f2272a) + C10584a.a1657027613243dc("x") + C1002v.m4740c(this.f2272a));
                        jSONObject.put(C10584a.a1657027613243dc("dhqshdXlldxeyw"), m2929a(C1002v.m4753g(this.f2272a)));
                        jSONObject.put(C10584a.a1657027613243dc("ddlpmqXlyc"), C1002v.m4753g(this.f2272a));
                        jSONObject.put(C10584a.a1657027613243dc("ddtjg`Ynl"), C0517j.m2474a(this.f2272a));
                        jSONObject.put(C10584a.a1657027613243dc("ahf"), C10584a.a1657027613243dc("1252"));
                        jSONObject.put(C10584a.a1657027613243dc("rno"), m2965e());
                        jSONObject.put(C10584a.a1657027613243dc("cqw\\ego"), Build.CPU_ABI);
                        jSONObject.put(C10584a.a1657027613243dc("uu"), this.f2277f);
                        jSONObject.put(C10584a.a1657027613243dc("uhf"), this.f2276e);
                        jSONObject.put(C10584a.a1657027613243dc("gnmdh`Yfam"), C1010a.m4777a().mo2932b());
                        jSONObject.put(C10584a.a1657027613243dc("lnabh`Ykigm~mjk"), C0967e.m4495c());
                        jSONObject.put(C10584a.a1657027613243dc("sbpfakYez`mcx"), Math.ceil((double) (C0967e.m4497d() * 10.0f)) / 10.0d);
                        String a1657027613243dc2 = C10584a.a1657027613243dc("ir]pgwcbfVemj");
                        if (C0967e.m4487a()) {
                            i = 0;
                        }
                        jSONObject.put(a1657027613243dc2, i);
                        C0516f h = C0558m.m2673h();
                        jSONObject.put(C10584a.a1657027613243dc("fnp`aZjffnjkh"), C10647t.m31276a(this.f2272a, C10584a.a1657027613243dc("tu]`ljitmVfjbj{nwt")));
                        if (h.mo1715p(C10584a.a1657027613243dc("moa"))) {
                            jSONObject.put(C10584a.a1657027613243dc("moa"), C0988n.m4583c());
                        }
                        if (h.mo1715p(C10584a.a1657027613243dc("mba"))) {
                            jSONObject.put(C10584a.a1657027613243dc("mba"), C0988n.m4582b());
                        }
                    } catch (Exception unused) {
                    }
                    return jSONObject;
                case ' ':
                case '!':
                    break;
                default:
                    if (c <= 'N') {
                        break;
                    }
            }
            c = 31;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m2961c(String str) {
        C10579b c = C0835d.m4093a().mo2660b().mo64151c();
        c.mo64176a(str);
        c.mo64173a(new C10575a() {
            /* renamed from: a */
            public void mo444a(C10581c cVar, C10576b bVar) {
                C10638l.m31235b(C10591e.e1657027613237dc("cmkfjq&eamnbbj.|erqvgf"), bVar.mo64164d());
            }

            /* renamed from: a */
            public void mo445a(C10581c cVar, IOException iOException) {
                C10638l.m31235b(C10591e.e1657027613237dc("cmkfjq&eamnbbj.iqx~"), iOException.toString());
            }
        });
    }

    /* renamed from: c */
    private boolean m2962c(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @JProtect
    /* renamed from: d */
    private void m2963d(JSONObject jSONObject) {
        if (C0503h.m2281d().mo1618s()) {
            try {
                jSONObject.getJSONObject(C10522a.a1657027613264dc("hdcgaw")).put(C10522a.a1657027613264dc("ahf"), C10522a.a1657027613264dc("4441"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            JSONObject a = C10621a.m31186a(jSONObject);
            if (m2962c(a)) {
                jSONObject = a;
            }
            Map<String, String> e2 = m2966e(jSONObject);
            C10582d b = C0835d.m4093a().mo2660b().mo64150b();
            b.mo64176a(C0996u.m4682l());
            if (e2 != null) {
                for (Map.Entry next : e2.entrySet()) {
                    try {
                        b.mo64179b((String) next.getKey(), (String) next.getValue());
                    } catch (Exception unused) {
                    }
                }
            }
            b.mo64186c(jSONObject.toString());
            try {
                b.mo64179b(C10522a.a1657027613264dc("Urgq)Dabf}"), C0996u.m4631b());
            } catch (Exception unused2) {
            }
            b.mo64184a((C10575a) new C10575a() {
                /* renamed from: a */
                public void mo444a(C10581c cVar, C10576b bVar) {
                    if (bVar == null || !bVar.mo64166f()) {
                        C10638l.m31238c(C10594g.g1657027613239dc("NdvBtlOjxe"), C10594g.g1657027613239dc("ooPfwuii{l0+Bhz]ubb|zfs7qj:uiqr"));
                        return;
                    }
                    C10638l.m31231a(C10594g.g1657027613239dc("NdvBtlOjxe"), C10594g.g1657027613239dc("ooPfwuii{l0+"), bVar.mo64164d());
                }

                /* renamed from: a */
                public void mo445a(C10581c cVar, IOException iOException) {
                    C10638l.m31231a(C10584a.a1657027613243dc("NdvBtlOjxe"), C10584a.a1657027613243dc("ooDbmisum3*"), iOException.getMessage());
                }
            });
        }
    }

    /* renamed from: d */
    private static boolean m2964d() {
        try {
            return new File(C10548g.g1657027613257dc("/r{pp`k(j`d$x")).exists() || new File(C10548g.g1657027613257dc("/r{pp`k(pkce#~{")).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    @JProtect
    /* renamed from: e */
    private static String m2965e() {
        String str;
        StringBuilder sb = new StringBuilder();
        try {
            if (C0985m.m4562e()) {
                str = "MHWJ)";
            } else if (C0985m.m4557b()) {
                str = "FM[NA(";
            } else {
                String n = C0985m.m4571n();
                if (C0985m.m4555a(n)) {
                    sb.append(C10601c.c1657027613239dc("ELWJ)"));
                }
                if (!TextUtils.isEmpty(n)) {
                    sb.append(n);
                    str = "-";
                }
                sb.append(Build.VERSION.INCREMENTAL);
                return sb.toString();
            }
            sb.append(C10601c.c1657027613239dc(str));
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* renamed from: e */
    private Map<String, String> m2966e(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(C10594g.g1657027613239dc("Cnlwakr*\\pzn"), C10594g.g1657027613239dc("aqromfgsafd$f~aa+1q{ugerl$ooz0&"));
        if (m2962c(jSONObject)) {
            hashMap.put(C10594g.g1657027613239dc("Cnlwakr*Mgidhd`h"), C10594g.g1657027613239dc("uokljZuccVoeobjj"));
        }
        return hashMap;
    }

    /* renamed from: f */
    private static int m2967f() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    /* renamed from: f */
    private boolean m2968f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            boolean equalsIgnoreCase = jSONObject.optString(C10594g.g1657027613239dc("mdqpebc")).equalsIgnoreCase(C10594g.g1657027613239dc("sta`avu"));
            while (true) {
                char c = '_';
                char c2 = '_';
                while (true) {
                    switch (c) {
                        case '^':
                            if (c2 != '\'') {
                                break;
                            } else {
                                continue;
                            }
                        case '_':
                            switch (c2) {
                                case '^':
                                case '`':
                                    continue;
                                case '_':
                                    break;
                            }
                        case '`':
                            break;
                    }
                    switch (c2) {
                        case '8':
                            break;
                    }
                    c = '^';
                    c2 = '}';
                }
            }
            return equalsIgnoreCase;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    private String m2969g() {
        String str;
        if (C0967e.m4496c(this.f2272a)) {
            str = "tw";
        } else if (C0967e.m4492b(this.f2272a)) {
            return C10591e.e1657027613237dc("aofqklbXxhn");
        } else {
            str = "aofqklb";
        }
        return C10591e.e1657027613237dc(str);
    }

    @JProtect
    /* renamed from: g */
    private void m2970g(JSONObject jSONObject) {
        try {
            jSONObject.put(C10522a.a1657027613264dc("p`ahebcXfhgn"), C0996u.m4648d());
            jSONObject.put(C10522a.a1657027613264dc("vdppmjhXkfnn"), C0996u.m4654e());
            jSONObject.put(C10522a.a1657027613264dc("vdppmjh"), C0996u.m4660f());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public C10277a mo1837a() {
        if (!C0515e.m2397a()) {
            return null;
        }
        C10579b c = C0835d.m4093a().mo2660b().mo64151c();
        try {
            c.mo64176a(C0196d.m815a(c, C0558m.m2673h().mo1721v()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        C10576b a = c.mo64172a();
        if (a == null) {
            return null;
        }
        try {
            if (a.mo64166f()) {
                return C10277a.m29547e(a.mo64164d());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(26:5|(1:11)|12|13|14|(2:17|15)|64|18|19|20|(1:22)|23|(2:25|(6:29|30|31|66|65|26))|32|33|34|35|36|37|38|(1:45)(1:44)|46|(1:48)(1:49)|(2:(1:57)|58)(1:53)|59|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0147, code lost:
        com.bytedance.sdk.component.utils.C10638l.m31239c(com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc("NdvBtlOjxe"), com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc("uqnleaCqmg~+i|`b"), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        return new com.bytedance.sdk.openadsdk.p000b.C0145i(false, 509, com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc("sdpumfcXj|yr"), false);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0091 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011c A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0128 A[Catch:{ all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0130 A[ADDED_TO_REGION, Catch:{ all -> 0x0146 }] */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.p000b.C0145i mo1838a(java.util.List<com.bytedance.sdk.openadsdk.p000b.C0106a> r8) {
        /*
            r7 = this;
            r0 = 0
            boolean r1 = com.bytedance.sdk.openadsdk.core.p025i.C0515e.m2397a()     // Catch:{ all -> 0x0146 }
            if (r1 != 0) goto L_0x0009
            r8 = 0
            return r8
        L_0x0009:
            java.lang.String r1 = ""
            int r2 = r8.size()     // Catch:{ all -> 0x0146 }
            if (r2 <= 0) goto L_0x0037
            java.lang.Object r2 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.a r2 = (com.bytedance.sdk.openadsdk.p000b.C0106a) r2     // Catch:{ all -> 0x0146 }
            org.json.JSONObject r2 = r2.mo306b()     // Catch:{ all -> 0x0146 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r1 = r8.get(r0)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.a r1 = (com.bytedance.sdk.openadsdk.p000b.C0106a) r1     // Catch:{ all -> 0x0146 }
            org.json.JSONObject r1 = r1.mo306b()     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = "aqr\\hjaX}{f"
            java.lang.String r2 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r2)     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = r1.optString(r2)     // Catch:{ all -> 0x0146 }
        L_0x0037:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0146 }
            r2.<init>()     // Catch:{ all -> 0x0146 }
            java.lang.Object r3 = r8.get(r0)     // Catch:{ JSONException -> 0x0091 }
            com.bytedance.sdk.openadsdk.b.a r3 = (com.bytedance.sdk.openadsdk.p000b.C0106a) r3     // Catch:{ JSONException -> 0x0091 }
            r7.m2935a((com.bytedance.sdk.openadsdk.p000b.C0106a) r3)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r3 = "hdcgaw"
            java.lang.String r3 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r3)     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r4 = r7.m2960c()     // Catch:{ JSONException -> 0x0091 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0091 }
            r3.<init>()     // Catch:{ JSONException -> 0x0091 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ JSONException -> 0x0091 }
        L_0x005b:
            boolean r4 = r8.hasNext()     // Catch:{ JSONException -> 0x0091 }
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r8.next()     // Catch:{ JSONException -> 0x0091 }
            com.bytedance.sdk.openadsdk.b.a r4 = (com.bytedance.sdk.openadsdk.p000b.C0106a) r4     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r4 = r4.mo307c()     // Catch:{ JSONException -> 0x0091 }
            r3.put(r4)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x005b
        L_0x006f:
            java.lang.String r8 = "ewgmp"
            java.lang.String r8 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r8 = "_fgm[qojm"
            java.lang.String r8 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r8 = "lnabhZrnel"
            java.lang.String r8 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r8)     // Catch:{ JSONException -> 0x0091 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            r2.put(r8, r3)     // Catch:{ JSONException -> 0x0091 }
        L_0x0091:
            org.json.JSONObject r8 = com.bytedance.sdk.component.utils.C10621a.m31186a((org.json.JSONObject) r2)     // Catch:{ all -> 0x0146 }
            boolean r3 = r7.m2962c((org.json.JSONObject) r8)     // Catch:{ all -> 0x0146 }
            if (r3 != 0) goto L_0x009c
            r8 = r2
        L_0x009c:
            java.util.Map r3 = r7.m2966e(r8)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.i.d r4 = com.bytedance.sdk.openadsdk.p046i.C0835d.m4093a()     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.component.e.a r4 = r4.mo2660b()     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.component.e.b.d r4 = r4.mo64150b()     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.C0996u.m4670h((java.lang.String) r1)     // Catch:{ all -> 0x0146 }
            r4.mo64176a((java.lang.String) r1)     // Catch:{ all -> 0x0146 }
            if (r3 == 0) goto L_0x00d9
            java.util.Set r1 = r3.entrySet()     // Catch:{ all -> 0x0146 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0146 }
        L_0x00bd:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0146 }
            if (r3 == 0) goto L_0x00d9
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0146 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0146 }
            java.lang.Object r5 = r3.getKey()     // Catch:{ Exception -> 0x00bd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00bd }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x00bd }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00bd }
            r4.mo64179b(r5, r3)     // Catch:{ Exception -> 0x00bd }
            goto L_0x00bd
        L_0x00d9:
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0146 }
            r4.mo64186c(r8)     // Catch:{ all -> 0x0146 }
            java.lang.String r8 = "Urgq)Dabf}"
            java.lang.String r8 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r8)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.C0996u.m4631b()     // Catch:{ Exception -> 0x00ed }
            r4.mo64179b(r8, r1)     // Catch:{ Exception -> 0x00ed }
        L_0x00ed:
            com.bytedance.sdk.component.e.b r8 = r4.mo64183a()     // Catch:{ all -> 0x0146 }
            if (r8 == 0) goto L_0x0113
            boolean r1 = r8.mo64166f()     // Catch:{ all -> 0x0146 }
            if (r1 == 0) goto L_0x0113
            java.lang.String r1 = r8.mo64164d()     // Catch:{ all -> 0x0146 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0146 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0146 }
            if (r1 != 0) goto L_0x0113
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0146 }
            java.lang.String r3 = r8.mo64164d()     // Catch:{ all -> 0x0146 }
            r1.<init>(r3)     // Catch:{ all -> 0x0146 }
            boolean r1 = r7.m2968f(r1)     // Catch:{ all -> 0x0146 }
            goto L_0x0114
        L_0x0113:
            r1 = 0
        L_0x0114:
            java.lang.String r3 = "esplv%sicge|b"
            java.lang.String r3 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r3)     // Catch:{ all -> 0x0146 }
            if (r8 == 0) goto L_0x0121
            int r4 = r8.mo64160a()     // Catch:{ all -> 0x0146 }
            goto L_0x0122
        L_0x0121:
            r4 = 0
        L_0x0122:
            if (r1 != 0) goto L_0x0130
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x0130
            java.lang.String r8 = "sdpuaw&tip*ecy.|erqvgf"
            java.lang.String r3 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r8)     // Catch:{ all -> 0x0146 }
            r8 = 1
            goto L_0x013d
        L_0x0130:
            if (r8 == 0) goto L_0x013c
            java.lang.String r5 = r8.mo64162b()     // Catch:{ all -> 0x0146 }
            if (r5 == 0) goto L_0x013c
            java.lang.String r3 = r8.mo64162b()     // Catch:{ all -> 0x0146 }
        L_0x013c:
            r8 = 0
        L_0x013d:
            r7.m2963d(r2)     // Catch:{ all -> 0x0146 }
            com.bytedance.sdk.openadsdk.b.i r2 = new com.bytedance.sdk.openadsdk.b.i     // Catch:{ all -> 0x0146 }
            r2.<init>(r1, r4, r3, r8)     // Catch:{ all -> 0x0146 }
            return r2
        L_0x0146:
            r8 = move-exception
            java.lang.String r1 = "NdvBtlOjxe"
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r1)
            java.lang.String r2 = "uqnleaCqmg~+i|`b"
            java.lang.String r2 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r2)
            com.bytedance.sdk.component.utils.C10638l.m31239c(r1, r2, r8)
            com.bytedance.sdk.openadsdk.b.i r8 = new com.bytedance.sdk.openadsdk.b.i
            r1 = 509(0x1fd, float:7.13E-43)
            java.lang.String r2 = "sdpumfcXj|yr"
            java.lang.String r2 = com.bytedance.sdk.component.p313d.p322d.C10548g.g1657027613257dc(r2)
            r8.<init>(r0, r1, r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0607o.mo1838a(java.util.List):com.bytedance.sdk.openadsdk.b.i");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo1839a(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "atawmjhXx{chi"
            if (r6 != 0) goto L_0x0005
            return r6
        L_0x0005:
            boolean r1 = f2271i     // Catch:{ Exception -> 0x0047 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = "cxrkaw"
            java.lang.String r1 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r1)     // Catch:{ Exception -> 0x0047 }
            r2 = -1
            int r1 = r6.optInt(r1, r2)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r2 = "mdqpebc"
            java.lang.String r2 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r2)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r2 = r6.optString(r2)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r3 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r0)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r4 = ""
            java.lang.String r3 = r6.optString(r3, r4)     // Catch:{ Exception -> 0x0047 }
            r4 = 3
            if (r1 != r4) goto L_0x002f
            java.lang.String r2 = com.bytedance.sdk.component.utils.C10621a.m31188b(r2)     // Catch:{ Exception -> 0x0047 }
        L_0x002f:
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0047 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0047 }
            if (r1 != 0) goto L_0x0047
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{  }
            r1.<init>(r2)     // Catch:{  }
            java.lang.String r0 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r0)     // Catch:{ all -> 0x0045 }
            r1.put(r0, r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0048
        L_0x0045:
            goto L_0x0048
        L_0x0047:
            r1 = r6
        L_0x0048:
            boolean r0 = f2271i
            if (r0 == 0) goto L_0x004d
            r6 = r1
        L_0x004d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0607o.mo1839a(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: a */
    public void mo1840a(AdSlot adSlot, C0479o oVar, int i, C0561n.C0562a aVar) {
        final C0380a aVar2 = new C0380a(aVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            final AdSlot adSlot2 = adSlot;
            final C0479o oVar2 = oVar;
            final int i2 = i;
            C0547k.m2621c().post(new C10618g(C10601c.c1657027613239dc("gdvB`")) {
                public void run() {
                    C0607o.this.m2957b(adSlot2, oVar2, i2, aVar2);
                }
            });
            return;
        }
        m2957b(adSlot, oVar, i, aVar2);
    }

    /* renamed from: a */
    public void mo1841a(C0477n nVar, List<FilterWord> list) {
        JSONObject b;
        if (C0515e.m2397a() && (b = m2956b(nVar, list)) != null) {
            C10582d b2 = C0835d.m4093a().mo2660b().mo64150b();
            b2.mo64176a(C0996u.m4665g(C10545d.d1657027613261dc("/`rj+db(}gcdb\"jfc}{xqJsa}wn4")));
            b2.mo64186c(C10621a.m31186a(b).toString());
            b2.mo64184a((C10575a) new C10575a() {
                /* renamed from: a */
                public void mo444a(C10581c cVar, C10576b bVar) {
                }

                /* renamed from: a */
                public void mo445a(C10581c cVar, IOException iOException) {
                }
            });
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031 A[LOOP:0: B:5:0x0020->B:9:0x0031, LOOP_END] */
    /* renamed from: a */
    public void mo1842a(final java.lang.String r3) {
        /*
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L_0x0019
            com.bytedance.sdk.openadsdk.core.o$9 r0 = new com.bytedance.sdk.openadsdk.core.o$9
            java.lang.String r1 = "uqnleaEkaldNdjkyu"
            java.lang.String r1 = com.bytedance.sdk.component.p313d.p316c.p320b.C10522a.a1657027613264dc(r1)
            r0.<init>(r1, r3)
            com.bytedance.sdk.component.p328f.C10615e.m31159a((com.bytedance.sdk.component.p328f.C10618g) r0)
            goto L_0x002c
        L_0x0019:
            r2.m2961c((java.lang.String) r3)
        L_0x001c:
            r3 = 73
            r0 = 96
        L_0x0020:
            switch(r3) {
                case 72: goto L_0x002c;
                case 73: goto L_0x0024;
                case 74: goto L_0x0027;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0031
        L_0x0024:
            switch(r0) {
                case 94: goto L_0x001c;
                case 95: goto L_0x002b;
                case 96: goto L_0x002b;
                default: goto L_0x0027;
            }
        L_0x0027:
            switch(r0) {
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x001c
        L_0x002b:
            return
        L_0x002c:
            r3 = 74
            r0 = 55
            goto L_0x0020
        L_0x0031:
            r3 = 72
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0607o.mo1842a(java.lang.String):void");
    }

    /* renamed from: a */
    public void mo1843a(JSONObject jSONObject, final C0561n.C0563b bVar) {
        while (true) {
            char c = '_';
            char c2 = '_';
            while (true) {
                switch (c) {
                    case '^':
                        if (c2 != '\'') {
                            break;
                        } else {
                            continue;
                        }
                    case '_':
                        switch (c2) {
                            case '^':
                            case '`':
                                continue;
                            case '_':
                                break;
                        }
                    case '`':
                        break;
                }
                switch (c2) {
                    case '7':
                    case '9':
                        break;
                    case '8':
                        break;
                }
                c = '^';
                c2 = '}';
            }
        }
        if (!C0515e.m2397a()) {
            if (bVar != null) {
                bVar.mo228a(1000, C10591e.e1657027613237dc("Ae\"qatsb{}*b-zj}a}aug{a9jzin{{\f\u0001rOADUB\bJEEXLM[\u0010H]FF\u0015fVV^V^\u001c|s"));
            }
        } else if (jSONObject != null && bVar != null) {
            JSONObject a = C10621a.m31186a(jSONObject);
            C10582d b = C0835d.m4093a().mo2660b().mo64150b();
            try {
                b.mo64176a(C0196d.m815a(b, C0996u.m4665g(C10591e.e1657027613237dc("/`rj+db(}gcdb\"}k{>`vctdsGosyr1mEVCQ@\n"))));
            } catch (Exception e) {
                e.printStackTrace();
            }
            b.mo64186c(a.toString());
            b.mo64184a((C10575a) new C10575a() {
                /* JADX WARNING: Can't wrap try/catch for region: R(8:5|6|(1:8)|9|(3:11|12|13)|14|15|(2:17|18)(2:19|(2:21|22)(2:23|35))) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0049 */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0053 A[Catch:{ JSONException -> 0x0073 }] */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0061 A[Catch:{ JSONException -> 0x0073 }] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void mo444a(com.bytedance.sdk.component.p323e.p325b.C10581c r4, com.bytedance.sdk.component.p323e.C10576b r5) {
                    /*
                        r3 = this;
                        if (r5 == 0) goto L_0x009f
                        boolean r4 = r5.mo64166f()
                        if (r4 == 0) goto L_0x007a
                        java.lang.String r4 = r5.mo64164d()
                        java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                        boolean r4 = android.text.TextUtils.isEmpty(r4)
                        if (r4 != 0) goto L_0x007a
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r5 = r5.mo64164d()     // Catch:{ JSONException -> 0x0073 }
                        r4.<init>(r5)     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r5 = "cxrkaw"
                        java.lang.String r5 = com.bytedance.sdk.component.p307b.p308a.C10469e.e1657027613270dc(r5)     // Catch:{ JSONException -> 0x0073 }
                        r0 = -1
                        int r5 = r4.optInt(r5, r0)     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r0 = "mdqpebc"
                        java.lang.String r0 = com.bytedance.sdk.component.p307b.p308a.C10469e.e1657027613270dc(r0)     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r0 = r4.optString(r0)     // Catch:{ JSONException -> 0x0073 }
                        r1 = 0
                        r2 = 3
                        if (r5 != r2) goto L_0x003a
                        java.lang.String r1 = com.bytedance.sdk.component.utils.C10621a.m31188b(r0)     // Catch:{ JSONException -> 0x0073 }
                    L_0x003a:
                        r5 = r1
                        java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ JSONException -> 0x0073 }
                        boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0073 }
                        if (r5 != 0) goto L_0x0049
                        org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0049 }
                        r5.<init>(r1)     // Catch:{ all -> 0x0049 }
                        r4 = r5
                    L_0x0049:
                        com.bytedance.sdk.openadsdk.core.o$b r4 = com.bytedance.sdk.openadsdk.core.C0607o.C0618b.m2995a(r4)     // Catch:{ JSONException -> 0x0073 }
                        int r5 = r4.f2314a     // Catch:{ JSONException -> 0x0073 }
                        r0 = 20000(0x4e20, float:2.8026E-41)
                        if (r5 == r0) goto L_0x0061
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4     // Catch:{ JSONException -> 0x0073 }
                        int r0 = r4.f2314a     // Catch:{ JSONException -> 0x0073 }
                        int r4 = r4.f2314a     // Catch:{ JSONException -> 0x0073 }
                        java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C0492g.m2254a(r4)     // Catch:{ JSONException -> 0x0073 }
                        r5.mo228a(r0, r4)     // Catch:{ JSONException -> 0x0073 }
                        return
                    L_0x0061:
                        com.bytedance.sdk.openadsdk.core.e.s r5 = r4.f2316c     // Catch:{ JSONException -> 0x0073 }
                        if (r5 != 0) goto L_0x006d
                        com.bytedance.sdk.openadsdk.core.o r4 = com.bytedance.sdk.openadsdk.core.C0607o.this     // Catch:{ JSONException -> 0x0073 }
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4     // Catch:{ JSONException -> 0x0073 }
                        r4.m2940a((com.bytedance.sdk.openadsdk.core.C0561n.C0563b) r5)     // Catch:{ JSONException -> 0x0073 }
                        return
                    L_0x006d:
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4     // Catch:{ JSONException -> 0x0073 }
                        r5.mo229a(r4)     // Catch:{ JSONException -> 0x0073 }
                        goto L_0x00a6
                    L_0x0073:
                        r4 = move-exception
                        org.json.JSONException r4 = (org.json.JSONException) r4
                        r4.printStackTrace()
                        goto L_0x009f
                    L_0x007a:
                        r4 = -2
                        java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C0492g.m2254a(r4)
                        int r0 = r5.mo64160a()
                        boolean r1 = r5.mo64166f()
                        if (r1 != 0) goto L_0x0099
                        java.lang.String r1 = r5.mo64162b()
                        java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                        boolean r1 = android.text.TextUtils.isEmpty(r1)
                        if (r1 != 0) goto L_0x0099
                        java.lang.String r4 = r5.mo64162b()
                    L_0x0099:
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4
                        r5.mo228a(r0, r4)
                        goto L_0x00a6
                    L_0x009f:
                        com.bytedance.sdk.openadsdk.core.o r4 = com.bytedance.sdk.openadsdk.core.C0607o.this
                        com.bytedance.sdk.openadsdk.core.n$b r5 = r4
                        r4.m2940a((com.bytedance.sdk.openadsdk.core.C0561n.C0563b) r5)
                    L_0x00a6:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0607o.C06158.mo444a(com.bytedance.sdk.component.e.b.c, com.bytedance.sdk.component.e.b):void");
                }

                /* renamed from: a */
                public void mo445a(C10581c cVar, IOException iOException) {
                    bVar.mo228a(-2, iOException.getMessage());
                }
            });
        }
    }

    /* renamed from: a */
    public void mo1844a(JSONObject jSONObject, String str) {
        m2958b(jSONObject, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r4 == 60005) goto L_0x0098;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.p000b.C0145i mo1845b(org.json.JSONObject r8) {
        /*
            r7 = this;
            boolean r0 = com.bytedance.sdk.openadsdk.core.p025i.C0515e.m2397a()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x00b7
            int r0 = r8.length()
            if (r0 > 0) goto L_0x0012
            goto L_0x00b7
        L_0x0012:
            org.json.JSONObject r8 = com.bytedance.sdk.component.utils.C10621a.m31186a((org.json.JSONObject) r8)
            com.bytedance.sdk.openadsdk.i.d r0 = com.bytedance.sdk.openadsdk.p046i.C0835d.m4093a()
            com.bytedance.sdk.component.e.a r0 = r0.mo2660b()
            com.bytedance.sdk.component.e.b.d r0 = r0.mo64150b()
            java.lang.String r1 = "/`rj+db(}gcdb\"}k{>aguae8zxnxt2"
            java.lang.String r1 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r1)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.C0996u.m4665g((java.lang.String) r1)     // Catch:{ Exception -> 0x0043 }
            r0.mo64176a((java.lang.String) r1)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0043 }
            r0.mo64186c(r8)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r8 = "Urgq)Dabf}"
            java.lang.String r8 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r8)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r1 = com.bytedance.sdk.openadsdk.utils.C0996u.m4631b()     // Catch:{ Exception -> 0x0043 }
            r0.mo64179b(r8, r1)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            com.bytedance.sdk.component.e.b r8 = r0.mo64183a()
            java.lang.String r0 = "esplv%sicge|b"
            java.lang.String r0 = com.bytedance.sdk.component.p323e.p326c.C10590d.d1657027613220dc(r0)
            r1 = 0
            if (r8 != 0) goto L_0x0056
            com.bytedance.sdk.openadsdk.b.i r8 = new com.bytedance.sdk.openadsdk.b.i     // Catch:{ all -> 0x00ad }
            r8.<init>(r1, r1, r0, r1)     // Catch:{ all -> 0x00ad }
            return r8
        L_0x0056:
            boolean r2 = r8.mo64166f()     // Catch:{ all -> 0x00ad }
            r3 = 1
            if (r2 == 0) goto L_0x0096
            java.lang.String r2 = r8.mo64164d()     // Catch:{ all -> 0x00ad }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ all -> 0x00ad }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00ad }
            if (r2 != 0) goto L_0x0096
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = r8.mo64164d()     // Catch:{ all -> 0x00ad }
            r2.<init>(r4)     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = "cnff"
            java.lang.String r4 = com.bytedance.sdk.component.p307b.p308a.C10469e.e1657027613270dc(r4)     // Catch:{ all -> 0x00ad }
            r5 = -1
            int r4 = r2.optInt(r4, r5)     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = "d`vb"
            java.lang.String r5 = com.bytedance.sdk.component.p307b.p308a.C10469e.e1657027613270dc(r5)     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = ""
            java.lang.String r0 = r2.optString(r5, r6)     // Catch:{ all -> 0x00ad }
            r2 = 20000(0x4e20, float:2.8026E-41)
            if (r4 != r2) goto L_0x008f
            r2 = 1
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            r5 = 60005(0xea65, float:8.4085E-41)
            if (r4 != r5) goto L_0x0097
            goto L_0x0098
        L_0x0096:
            r2 = 0
        L_0x0097:
            r3 = 0
        L_0x0098:
            int r1 = r8.mo64160a()     // Catch:{ all -> 0x00aa }
            boolean r4 = r8.mo64166f()     // Catch:{ all -> 0x00a7 }
            if (r4 != 0) goto L_0x00b1
            java.lang.String r0 = r8.mo64162b()     // Catch:{ all -> 0x00a7 }
            goto L_0x00b1
        L_0x00a7:
            r8 = r1
            r1 = r3
            goto L_0x00af
        L_0x00aa:
            r1 = r3
            r8 = 0
            goto L_0x00af
        L_0x00ad:
            r8 = 0
            r2 = 0
        L_0x00af:
            r3 = r1
            r1 = r8
        L_0x00b1:
            com.bytedance.sdk.openadsdk.b.i r8 = new com.bytedance.sdk.openadsdk.b.i
            r8.<init>(r2, r1, r0, r3)
            return r8
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0607o.mo1845b(org.json.JSONObject):com.bytedance.sdk.openadsdk.b.i");
    }
}
