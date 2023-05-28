package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.appnext.base.p264b.C8850d;
import com.yandex.metrica.C10705b;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C3740zl;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.yandex.metrica.impl.ob.Tl */
public class C2572Tl {

    /* renamed from: com.yandex.metrica.impl.ob.Tl$a */
    public static class C2573a extends JSONObject {
        public C2573a() {
        }

        /* renamed from: a */
        public Long mo16725a(String str) {
            try {
                return Long.valueOf(getLong(str));
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: b */
        public String mo16726b(String str) {
            if (!has(str) || !has(str)) {
                return "";
            }
            try {
                return getString(str);
            } catch (Throwable unused) {
                return "";
            }
        }

        /* renamed from: c */
        public String mo16727c(String str) {
            if (has(str)) {
                try {
                    return getString(str);
                } catch (Throwable unused) {
                }
            }
            return "";
        }

        /* renamed from: d */
        public boolean mo16728d(String str) {
            try {
                return JSONObject.NULL != get(str);
            } catch (Throwable unused) {
                return false;
            }
        }

        public C2573a(String str) throws JSONException {
            super(str);
        }
    }

    /* renamed from: a */
    public static <T> T m8512a(T t, T t2) {
        return t == null ? t2 : t;
    }

    /* renamed from: a */
    public static String m8513a(Context context, String str) throws UnsupportedEncodingException {
        byte[] a = m8527a(context, Base64.decode(str.getBytes("UTF-8"), 0));
        if (a == null) {
            return null;
        }
        try {
            return new String(C2254L0.m7692a(new String(a, "UTF-8")), "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m8535b(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.reset();
        instance.update(str.getBytes("UTF-8"));
        return instance.digest();
    }

    /* renamed from: c */
    public static String m8538c(Map<String, String> map) {
        if (C1848A2.m6815b((Map) map)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            sb.append((String) next.getKey());
            sb.append(":");
            sb.append((String) next.getValue());
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m8541d(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (Map.Entry value : map.entrySet()) {
            try {
                Integer.parseInt((String) value.getValue());
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static JSONObject m8543e(Map map) {
        if (C1848A2.m6815b(map)) {
            return null;
        }
        if (C1848A2.m6808a(19)) {
            return new JSONObject(map);
        }
        return m8547h(map);
    }

    /* renamed from: f */
    public static JSONObject m8545f(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return new JSONObject();
        }
        return m8543e(map);
    }

    /* renamed from: g */
    public static String m8546g(Map map) {
        if (C1848A2.m6815b(map)) {
            return null;
        }
        if (C1848A2.m6808a(19)) {
            return new JSONObject(map).toString();
        }
        return m8511a((Object) map).toString();
    }

    /* renamed from: h */
    private static JSONObject m8547h(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String obj = entry.getKey().toString();
            if (obj != null) {
                linkedHashMap.put(obj, m8511a(entry.getValue()));
            }
        }
        return new JSONObject(linkedHashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r2 != -1) goto L_0x0060;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m8548i(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r9 == 0) goto L_0x006e
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x000f:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x006e
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = ":"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = ","
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = "&"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0043
            r2 = 1
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            if (r2 == 0) goto L_0x000f
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x005f
            r6 = -1
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r2 = r6
        L_0x005a:
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r4 = 0
        L_0x0060:
            if (r4 == 0) goto L_0x000f
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L_0x000f
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2572Tl.m8548i(java.util.Map):java.util.Map");
    }

    /* renamed from: b */
    public static String m8528b(Context context, String str) throws UnsupportedEncodingException {
        String str2;
        try {
            str2 = C2254L0.m7687a(str.getBytes("UTF-8"));
        } catch (Throwable unused) {
            str2 = null;
        }
        return Base64.encodeToString(m8527a(context, str2.getBytes("UTF-8")), 0);
    }

    /* renamed from: f */
    public static C2854c2 m8544f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C2854c2(jSONObject.optInt(IabUtils.KEY_WIDTH), jSONObject.optInt(IabUtils.KEY_HEIGHT), jSONObject.optInt("dpi"), (float) jSONObject.optDouble("scaleFactor", 0.0d), C10705b.m31526a(jSONObject.optString("deviceType")));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m8518a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                int indexOf = str2.indexOf(":");
                if (indexOf != -1) {
                    hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public static HashMap<String, String> m8540d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m8531b(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m8537c(List<String> list) {
        if (C1848A2.m6814b((Collection) list)) {
            return null;
        }
        if (C1848A2.m6808a(19)) {
            return new JSONArray(list).toString();
        }
        return m8511a((Object) list).toString();
    }

    /* renamed from: b */
    private static JSONArray m8533b(Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            for (Object a : collection) {
                arrayList.add(m8511a((Object) a));
            }
            return new JSONArray(arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static HashMap<String, String> m8542e(String str) throws JSONException {
        return m8531b(new JSONObject(str));
    }

    /* renamed from: b */
    public static JSONArray m8534b(List<?> list) {
        if (C1848A2.m6814b((Collection) list)) {
            return null;
        }
        if (C1848A2.m6808a(19)) {
            return new JSONArray(list);
        }
        return m8533b((Collection<?>) list);
    }

    /* renamed from: a */
    public static long m8504a(Long l, TimeUnit timeUnit, long j) {
        return l == null ? j : timeUnit.toMillis(l.longValue());
    }

    /* renamed from: a */
    private static byte[] m8527a(Context context, byte[] bArr) {
        try {
            byte[] b = m8535b(context.getPackageName());
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = (byte) (bArr[i] ^ b[i % b.length]);
            }
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static List<String> m8539c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int i = 0;
                while (i < jSONArray.length()) {
                    try {
                        arrayList.add(jSONArray.getString(i));
                        i++;
                    } catch (Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Object m8511a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(m8511a(Array.get(obj, i)));
                }
                return new JSONArray(arrayList);
            } else if (obj instanceof Collection) {
                return m8533b((Collection<?>) (Collection) obj);
            } else {
                return obj instanceof Map ? m8547h((Map) obj) : obj;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static HashMap<String, String> m8531b(JSONObject jSONObject) {
        if (JSONObject.NULL.equals(jSONObject)) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public static C2972fl m8536c(JSONObject jSONObject) throws JSONException {
        C3634wl wlVar;
        C3040hl hlVar;
        C3040hl hlVar2;
        JSONObject jSONObject2 = jSONObject;
        C2121If.C2132i iVar = new C2121If.C2132i();
        JSONObject optJSONObject = jSONObject2.optJSONObject("upc");
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("uecc");
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("ucfbc");
        JSONObject optJSONObject4 = jSONObject2.optJSONObject("ruecc");
        boolean optBoolean = jSONObject2.optBoolean("upe", iVar.f5646o);
        boolean optBoolean2 = jSONObject2.optBoolean("uece", iVar.f5647p);
        boolean optBoolean3 = jSONObject2.optBoolean("ucfbe", iVar.f5648q);
        boolean optBoolean4 = jSONObject2.optBoolean("ruece", iVar.f5652u);
        C3040hl hlVar3 = null;
        if (optJSONObject == null) {
            wlVar = null;
        } else {
            C2121If.C2153w wVar = new C2121If.C2153w();
            wlVar = new C3634wl(optJSONObject.optInt("tltb", wVar.f5744a), optJSONObject.optInt("ttb", wVar.f5745b), optJSONObject.optInt("mvcl", wVar.f5746c), optJSONObject.optLong("act", wVar.f5747d), optJSONObject.optBoolean("rtsc", wVar.f5748e), optJSONObject.optBoolean("er", wVar.f5749f), optJSONObject.optBoolean("pabd", wVar.f5750g), m8517a(optJSONObject.optJSONArray("f")));
        }
        if (optJSONObject2 == null) {
            hlVar = null;
        } else {
            hlVar = m8505a(optJSONObject2, C3171m0.m10002b());
        }
        if (optJSONObject3 == null) {
            hlVar2 = null;
        } else {
            hlVar2 = m8505a(optJSONObject3, C3171m0.m10001a());
        }
        if (optJSONObject4 != null) {
            hlVar3 = m8505a(optJSONObject4, C3171m0.m10002b());
        }
        return new C2972fl(optBoolean, optBoolean2, optBoolean3, optBoolean4, wlVar, hlVar, hlVar2, hlVar3);
    }

    /* renamed from: b */
    public static String m8530b(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m8515a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return "";
        }
        return m8546g(map);
    }

    /* renamed from: b */
    public static List<String> m8532b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Long m8510a(JSONObject jSONObject, String str, Long l) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return l;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (Throwable unused) {
            return l;
        }
    }

    /* renamed from: b */
    public static String m8529b(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : map.entrySet()) {
                JSONArray b = m8534b((List<?>) (List) next.getValue());
                if (b != null) {
                    jSONObject.put((String) next.getKey(), b.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static String m8516a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        String b = m8530b(jSONObject, str);
        if (jSONObject2 == null || !jSONObject2.has(str)) {
            return b;
        }
        try {
            return jSONObject2.getString(str);
        } catch (Throwable unused) {
            return b;
        }
    }

    /* renamed from: a */
    public static Integer m8509a(JSONObject jSONObject, String str, Integer num) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return num;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return num;
        }
    }

    /* renamed from: a */
    public static boolean m8526a(JSONObject jSONObject, String str, boolean z) {
        Boolean a = m8508a(jSONObject, str, (Boolean) null);
        return a == null ? z : a.booleanValue();
    }

    /* renamed from: a */
    public static Boolean m8508a(JSONObject jSONObject, String str, Boolean bool) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return bool;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (Throwable unused) {
            return bool;
        }
    }

    /* renamed from: a */
    public static JSONArray m8519a(Collection<C3555uj> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (C3555uj a : collection) {
                try {
                    jSONArray.put(m8525a(a));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m8525a(C3555uj ujVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cell_id", ujVar.mo18276b());
        jSONObject.put("signal_strength", ujVar.mo18290p());
        jSONObject.put("lac", ujVar.mo18279e());
        jSONObject.put("country_code", ujVar.mo18285k());
        jSONObject.put("operator_id", ujVar.mo18286l());
        jSONObject.put("operator_name", ujVar.mo18288n());
        jSONObject.put("is_connected", ujVar.mo18291q());
        jSONObject.put("cell_type", ujVar.mo18277c());
        jSONObject.put("pci", ujVar.mo18289o());
        jSONObject.put("last_visible_time_offset", ujVar.mo18278d());
        jSONObject.put("lte_rsrq", ujVar.mo18282h());
        jSONObject.put("lte_rssnr", ujVar.mo18284j());
        jSONObject.put("arfcn", ujVar.mo18274a());
        jSONObject.put("lte_rssi", ujVar.mo18283i());
        jSONObject.put("lte_bandwidth", ujVar.mo18280f());
        jSONObject.put("lte_cqi", ujVar.mo18281g());
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m8521a(C2972fl flVar) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject put = new JSONObject().put("upe", flVar.f7867a).put("uece", flVar.f7868b).put("ruece", flVar.f7870d).put("ucfbe", flVar.f7869c);
        C3634wl wlVar = flVar.f7871e;
        JSONObject jSONObject4 = null;
        if (wlVar == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject().put("tltb", wlVar.f9414a).put("ttb", wlVar.f9415b).put("mvcl", wlVar.f9416c).put("act", wlVar.f9417d).put("rtsc", wlVar.f9418e).put("er", wlVar.f9419f).put("pabd", wlVar.f9420g).put("f", m8520a(wlVar.f9421h));
        }
        JSONObject putOpt = put.putOpt("upc", jSONObject);
        C3040hl hlVar = flVar.f7872f;
        if (hlVar == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = m8522a(hlVar);
        }
        JSONObject putOpt2 = putOpt.putOpt("uecc", jSONObject2);
        C3040hl hlVar2 = flVar.f7874h;
        if (hlVar2 == null) {
            jSONObject3 = null;
        } else {
            jSONObject3 = m8522a(hlVar2);
        }
        JSONObject putOpt3 = putOpt2.putOpt("ruecc", jSONObject3);
        C3040hl hlVar3 = flVar.f7873g;
        if (hlVar3 != null) {
            jSONObject4 = m8522a(hlVar3);
        }
        return putOpt3.putOpt("ucfbc", jSONObject4);
    }

    /* renamed from: a */
    private static JSONObject m8522a(C3040hl hlVar) throws JSONException {
        return new JSONObject().put("tsc", hlVar.f8003a).put("rtsc1", hlVar.f8004b).put("tvc", hlVar.f8005c).put("tsc1", hlVar.f8006d).put("ic", hlVar.f8007e).put("ncvc", hlVar.f8008f).put("tlc", hlVar.f8009g).put("vh", hlVar.f8010h).put("if", hlVar.f8011i).put("wvuc", hlVar.f8012j).put("tltb", hlVar.f8013k).put("ttb", hlVar.f8014l).put("mec", hlVar.f8015m).put("mfcl", hlVar.f8016n).put("wvul", hlVar.f8017o).put("f", m8520a(hlVar.f8018p));
    }

    /* renamed from: a */
    private static C3040hl m8505a(JSONObject jSONObject, C2121If.C2152v vVar) {
        JSONObject jSONObject2 = jSONObject;
        C2121If.C2152v vVar2 = vVar;
        return new C3040hl(jSONObject2.optBoolean("tsc", vVar2.f5728a), jSONObject2.optBoolean("rtsc1", vVar2.f5729b), jSONObject2.optBoolean("tvc", vVar2.f5730c), jSONObject2.optBoolean("tsc1", vVar2.f5731d), jSONObject2.optBoolean("ic", vVar2.f5736i), jSONObject2.optBoolean("ncvc", vVar2.f5737j), jSONObject2.optBoolean("tlc", vVar2.f5738k), jSONObject2.optBoolean("vh", vVar2.f5739l), jSONObject2.optBoolean("if", vVar2.f5741n), jSONObject2.optBoolean("wvuc", vVar2.f5742o), jSONObject2.optInt("tltb", vVar2.f5732e), jSONObject2.optInt("ttb", vVar2.f5733f), jSONObject2.optInt("mec", vVar2.f5734g), jSONObject2.optInt("mfcl", vVar2.f5735h), jSONObject2.optInt("wvul", vVar2.f5743p), m8517a(jSONObject2.optJSONArray("f")));
    }

    /* renamed from: a */
    private static JSONArray m8520a(List<C3740zl> list) {
        JSONArray jSONArray = new JSONArray();
        for (C3740zl next : list) {
            try {
                jSONArray.put(new JSONObject().put("ft", next.f9597a.f9604a).put("fv", next.f9598b));
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static List<C3740zl> m8517a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C3740zl(C3740zl.C3742b.m11152a(jSONObject.getInt("ft")), jSONObject.optString("fv")));
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C3437ra m8507a(JSONObject jSONObject) {
        return new C3437ra(m8506a(jSONObject, "activation"), m8506a(jSONObject, "satellite_clids"), m8506a(jSONObject, "preload_info"));
    }

    /* renamed from: a */
    public static JSONObject m8524a(C3437ra raVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("activation", m8523a(raVar.f9003a));
            jSONObject.putOpt("preload_info", m8523a(raVar.f9005c));
            jSONObject.putOpt("satellite_clids", m8523a(raVar.f9004b));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static C3392qa m8506a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return new C3392qa(optJSONObject.optLong("exp_t"), optJSONObject.optInt(C8850d.f22434fn));
        }
        return null;
    }

    /* renamed from: a */
    private static JSONObject m8523a(C3392qa qaVar) {
        if (qaVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exp_t", qaVar.f8722a).put(C8850d.f22434fn, qaVar.f8723b);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m8514a(C2854c2 c2Var) {
        JSONObject jSONObject;
        if (c2Var == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(IabUtils.KEY_WIDTH, c2Var.mo17359e()).put(IabUtils.KEY_HEIGHT, c2Var.mo17357c()).put("dpi", c2Var.mo17356b()).put("scaleFactor", (double) c2Var.mo17358d()).putOpt("deviceType", c2Var.mo17355a() == null ? null : c2Var.mo17355a().mo64728a());
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
