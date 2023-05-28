package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appnext.core.p267a.C8894b;
import com.ironsource.environment.C4386c;
import com.ironsource.environment.C4407h;
import com.ironsource.environment.C4415l;
import com.ironsource.environment.p120a.C4382b;
import com.ironsource.environment.p122c.C4390b;
import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4537h;
import com.ironsource.mediationsdk.server.C4707b;
import com.ironsource.mediationsdk.utils.C4714c;
import com.ironsource.mediationsdk.utils.C4719g;
import com.ironsource.mediationsdk.utils.C4723k;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.f */
public final class C4619f {

    /* renamed from: b */
    private static C4619f f11414b = new C4619f();

    /* renamed from: a */
    private final AtomicBoolean f11415a = new AtomicBoolean(false);

    /* renamed from: com.ironsource.mediationsdk.f$a */
    public static class C4620a {

        /* renamed from: a */
        String f11416a;

        /* renamed from: b */
        List<C4707b> f11417b;

        /* renamed from: c */
        C4707b f11418c;

        /* renamed from: d */
        JSONObject f11419d;

        /* renamed from: e */
        JSONObject f11420e;

        /* renamed from: f */
        int f11421f;

        /* renamed from: g */
        String f11422g;
    }

    /* renamed from: com.ironsource.mediationsdk.f$b */
    static class C4621b implements Runnable {

        /* renamed from: a */
        private String f11423a;

        /* renamed from: b */
        private String f11424b;

        /* renamed from: c */
        private String f11425c;

        public C4621b(String str, String str2, String str3) {
            this.f11423a = str;
            this.f11424b = str2;
            this.f11425c = str3;
        }

        public final void run() {
            boolean z = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f11425c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode == 200 || responseCode == 204) {
                    z = true;
                }
            } catch (Exception unused) {
                IronLog.INTERNAL.error("exception - e");
            }
            if (!z) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
                    jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, this.f11423a + ";" + this.f11424b + ";" + this.f11425c);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C4537h.m13193e().mo33649b(new C4532c(IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, jSONObject));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.f$c */
    enum C4622c {
        ;
        

        /* renamed from: a */
        public static final int f11426a = 1;

        /* renamed from: b */
        public static final int f11427b = 2;

        static {
            f11428c = new int[]{1, 2};
        }
    }

    /* renamed from: a */
    static C4620a m13525a(JSONObject jSONObject) {
        String optString = jSONObject.optString(IronSourceConstants.EVENTS_AUCTION_ID);
        if (!TextUtils.isEmpty(optString)) {
            C4620a aVar = new C4620a();
            aVar.f11416a = optString;
            JSONObject jSONObject2 = null;
            if (jSONObject.has(C8894b.f22527hW)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(C8894b.f22527hW);
                aVar.f11418c = new C4707b(jSONObject3);
                if (jSONObject3.has("armData")) {
                    jSONObject2 = jSONObject3.optJSONObject("armData");
                }
                if (jSONObject3.has(IronSourceConstants.EVENTS_GENERIC_PARAMS)) {
                    aVar.f11419d = jSONObject3.optJSONObject(IronSourceConstants.EVENTS_GENERIC_PARAMS);
                }
                if (jSONObject3.has("configurations")) {
                    aVar.f11420e = jSONObject3.optJSONObject("configurations");
                }
            }
            aVar.f11417b = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("waterfall");
            int i = 0;
            while (i < jSONArray.length()) {
                C4707b bVar = new C4707b(jSONArray.getJSONObject(i), jSONObject2);
                if (bVar.mo34163g()) {
                    aVar.f11417b.add(bVar);
                    i++;
                } else {
                    aVar.f11421f = 1002;
                    aVar.f11422g = "waterfall " + i;
                    throw new JSONException("invalid response");
                }
            }
            return aVar;
        }
        throw new JSONException("Invalid auction response - auction id is missing");
    }

    /* renamed from: a */
    public static C4619f m13526a() {
        return f11414b;
    }

    /* renamed from: a */
    public static C4707b m13527a(String str, List<C4707b> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mo34157a().equals(str)) {
                return list.get(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m13528a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace("${INSTANCE}", str2).replace("${INSTANCE_TYPE}", Integer.toString(i)).replace("${DYNAMIC_DEMAND_SOURCE}", str3).replace("${PLACEMENT_NAME}", str7);
    }

    /* renamed from: a */
    static JSONObject m13529a(String str) {
        try {
            return new JSONObject(IronSourceAES.decode(C4719g.m13802a().mo34183b(), str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m13530a(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (list.contains(next)) {
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    static void m13531a(String str, String str2, String str3) {
        C4401c.f10496a.mo33211c(new C4621b(str, str2, str3));
    }

    /* renamed from: a */
    private void m13532a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.has(next)) {
                    int i = 0;
                    str = next;
                    while (jSONObject.has(str)) {
                        i++;
                        str = next + "_" + i;
                    }
                } else {
                    str = next;
                }
                try {
                    jSONObject.put(str, jSONObject2.opt(next));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (((com.ironsource.environment.ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() != false) goto L_0x0034;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m13533b() {
        /*
            int r0 = com.ironsource.mediationsdk.C4619f.C4622c.f11427b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0016
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r0 = r0.isCleartextTrafficPermitted()
            if (r0 == 0) goto L_0x0013
            goto L_0x0034
        L_0x0013:
            int r0 = com.ironsource.mediationsdk.C4619f.C4622c.f11427b
            goto L_0x0036
        L_0x0016:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0034
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.flags
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0013
        L_0x0034:
            int r0 = com.ironsource.mediationsdk.C4619f.C4622c.f11426a
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4619f.m13533b():int");
    }

    /* renamed from: b */
    public static Map<String, String> m13534b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return hashMap;
    }

    /* renamed from: b */
    private JSONObject m13535b(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    HashMap<String, String> hashMap = C4415l.f10515b;
                    String str = hashMap.containsKey(next) ? hashMap.get(next) : next;
                    if ((list.isEmpty() && !C4415l.f10514a.contains(str) && !str.startsWith("metadata_")) || list.contains(str)) {
                        jSONObject2.put(str, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: c */
    public static String m13536c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m13537d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            return jSONObject2.has(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID) ? jSONObject2.getString(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID) : "";
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final String mo33901a(String str, int i, C4707b bVar, String str2, String str3, String str4) {
        String str5;
        String c = bVar.mo34159c();
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(str2)) {
            double parseDouble = Double.parseDouble(c);
            double parseDouble2 = Double.parseDouble(str2);
            if (parseDouble2 != 0.0d) {
                str5 = String.valueOf(((double) Math.round((parseDouble / parseDouble2) * 1000.0d)) / 1000.0d);
                return m13528a(str, bVar.mo34157a(), i, m13537d(bVar.mo34158b()), c, str5, str3, str4);
            }
        }
        str5 = "";
        return m13528a(str, bVar.mo34157a(), i, m13537d(bVar.mo34158b()), c, str5, str3, str4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo33902a(Context context, Map<String, Object> map, List<String> list, C4626i iVar, int i, String str, C4714c cVar, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        String str2;
        String str3;
        C4626i iVar2 = iVar;
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("instanceType", 2);
            Map<String, Object> map2 = map;
            jSONObject4.put("biddingAdditionalData", new JSONObject((Map) map.get(next)));
            if (iVar2 != null) {
                str2 = iVar2.mo33910a(next);
            }
            jSONObject4.put("performance", str2);
            jSONObject3.put(next, jSONObject4);
        }
        if (list != null) {
            for (String next2 : list) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("instanceType", 1);
                jSONObject5.put("performance", iVar2 != null ? iVar2.mo33910a(next2) : str2);
                jSONObject3.put(next2, jSONObject5);
            }
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = C4616d.m13502a().f11403c;
        concurrentHashMap.putAll(C4723k.m13824a().mo34195d());
        JSONObject jSONObject6 = new JSONObject();
        for (Map.Entry next3 : concurrentHashMap.entrySet()) {
            jSONObject6.put((String) next3.getKey(), TextUtils.join(",", (Iterable) next3.getValue()));
        }
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("applicationUserId", C4455H.m12683a().f10653k);
        Boolean bool = C4455H.m12683a().f10667y;
        if (bool != null) {
            jSONObject7.put("consent", bool.booleanValue() ? 1 : 0);
        }
        jSONObject7.put("mobileCarrier", C4407h.m12562i(context));
        jSONObject7.put("connectionType", IronSourceUtils.getConnectionType(context));
        jSONObject7.put("deviceOS", "android");
        jSONObject7.put("deviceWidth", context.getResources().getConfiguration().screenWidthDp);
        jSONObject7.put("deviceHeight", context.getResources().getConfiguration().screenHeightDp);
        jSONObject7.put("deviceOSVersion", Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")");
        jSONObject7.put("deviceModel", Build.MODEL);
        jSONObject7.put("deviceMake", Build.MANUFACTURER);
        jSONObject7.put("bundleId", context.getPackageName());
        Context context2 = context;
        jSONObject7.put("appVersion", C4386c.m12480c(context, context.getPackageName()));
        jSONObject7.put("clientTimestamp", new Date().getTime());
        jSONObject7.put("fs", IronSourceUtils.getFirstSession(context) ? 1 : 0);
        jSONObject7.put("browserUserAgent", C4407h.m12580r());
        jSONObject7.put("deviceType", IronSourceUtils.getDeviceType(context));
        jSONObject7.put("deviceLang", Locale.getDefault().getLanguage());
        jSONObject7.put("secure", m13533b() - 1);
        if (iSBannerSize != null) {
            jSONObject7.put("bannerSize", iSBannerSize.getDescription());
            jSONObject7.put("bannerWidth", iSBannerSize.getWidth());
            jSONObject7.put("bannerHeight", iSBannerSize.getHeight());
        }
        String[] C = C4407h.m12535C(context);
        boolean z = false;
        if (C == null || C.length != 2) {
            str3 = str2;
        } else {
            str3 = !TextUtils.isEmpty(C[0]) ? C[0] : str2;
            z = Boolean.valueOf(C[1]).booleanValue();
        }
        if (!TextUtils.isEmpty(str3)) {
            str2 = IronSourceConstants.TYPE_GAID;
        } else {
            str3 = C4407h.m12587x(context);
            if (!TextUtils.isEmpty(str3)) {
                str2 = IronSourceConstants.TYPE_UUID;
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            jSONObject7.put("advId", str3);
            jSONObject7.put("advIdType", str2);
            jSONObject7.put("isLimitAdTrackingEnabled", z ? "true" : "false");
        }
        String B = C4407h.m12534B(context);
        if (!TextUtils.isEmpty(B)) {
            jSONObject7.put("asid", B);
        }
        String y = C4407h.m12588y(context);
        if (!TextUtils.isEmpty(y)) {
            jSONObject7.put("auid", y);
        }
        JSONObject jSONObject8 = new JSONObject();
        jSONObject8.put("applicationKey", C4455H.m12683a().f10652j);
        jSONObject8.put("SDKVersion", IronSourceUtils.getSDKVersion());
        jSONObject8.put("clientParams", jSONObject7);
        jSONObject8.put(IronSourceConstants.KEY_SESSION_DEPTH, i);
        jSONObject8.put("sessionId", str);
        jSONObject8.put("instances", jSONObject3);
        jSONObject8.put("auctionData", cVar.f11775c);
        jSONObject8.put("metaData", jSONObject6);
        if (jSONObject2 != null) {
            jSONObject8.put("sg", jSONObject2);
        }
        return jSONObject8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo33903a(String str, boolean z, Map<String, Object> map, List<String> list, C4626i iVar, int i, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        String str2;
        C4626i iVar2 = iVar;
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("instp", 2);
            Map<String, Object> map2 = map;
            jSONObject5.put("badt", new JSONObject((Map) map.get(next)));
            if (iVar2 != null) {
                str2 = iVar2.mo33910a(next);
            }
            jSONObject5.put("prfm", str2);
            jSONObject4.put(next, jSONObject5);
        }
        if (list != null) {
            for (String next2 : list) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("instp", 1);
                jSONObject6.put("prfm", iVar2 != null ? iVar2.mo33910a(next2) : str2);
                jSONObject4.put(next2, jSONObject6);
            }
        }
        jSONObject3.put("inst", jSONObject4);
        C4382b bVar = new C4382b();
        JSONObject a = bVar.f10458b.mo33970a(bVar.f10457a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        JSONObject a2 = C4390b.m12496a(a.optJSONObject("md"));
        if (a2 != null) {
            a.put("md", a2);
        }
        mo33905a(a, false);
        a.put("sd", i);
        a.put("scr", m13533b() - 1);
        if (jSONObject2 != null) {
            a.put("sg", jSONObject2);
        }
        jSONObject3.put("ctdt", a);
        if (iSBannerSize != null) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("bns", iSBannerSize.getDescription());
            jSONObject7.put("bnw", iSBannerSize.getWidth());
            jSONObject7.put("bnh", iSBannerSize.getHeight());
            jSONObject3.put("bndt", jSONObject7);
        }
        String str3 = str;
        jSONObject3.put("adu", str);
        jSONObject3.put("dner", z ^ true ? 1 : 0);
        return jSONObject3;
    }

    /* renamed from: a */
    public final JSONObject mo33904a(JSONObject jSONObject, JSONObject jSONObject2, List<String> list) {
        C4602ah a = C4602ah.m13449a();
        a.mo33857a(C4602ah.m13454c());
        a.mo33857a(C4602ah.m13453b());
        JSONObject a2 = m13530a(a.f11355a, list.isEmpty() ? C4415l.f10514a : list);
        m13532a(a2, m13535b(jSONObject, list));
        if (!list.isEmpty()) {
            jSONObject2 = m13530a(jSONObject2, list);
        }
        m13532a(a2, jSONObject2);
        return a2;
    }

    /* renamed from: a */
    public final void mo33905a(JSONObject jSONObject, boolean z) {
        if (!TextUtils.isEmpty(jSONObject.optString("tcs")) && this.f11415a.compareAndSet(false, true)) {
            C4537h.m13193e().mo33649b(new C4532c(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z, true, -1)));
        }
    }
}
