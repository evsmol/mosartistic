package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.C6553b;
import com.apm.insight.C6582c;
import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6678l;
import com.apm.insight.p178l.C6685o;
import com.apm.insight.p178l.C6688q;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.n */
public class C6755n {

    /* renamed from: a */
    protected static JSONObject f14511a = new JSONObject();

    /* renamed from: a */
    public static void m16970a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                String a = C6718a.m16791a(jSONObject);
                File file = new File(C6685o.m16615j(C6617h.m16313g()), "apminsight/configCrash/configNative");
                if (a != null) {
                    JSONObject jSONObject2 = new JSONObject(a);
                    f14511a = jSONObject2;
                    C6675i.m16527a(file, m16976b(jSONObject2), false);
                    return;
                }
                f14511a = new JSONObject();
            } catch (JSONException unused) {
            } catch (Throwable th) {
                C6553b.m16004a().mo52019a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    public static boolean m16971a(String str, C6742f fVar) {
        if (f14511a == null) {
            return false;
        }
        if (fVar == null) {
            fVar = new C6742f();
        }
        JSONObject optJSONObject = f14511a.optJSONObject(str);
        if (optJSONObject != null && !m16972a(optJSONObject.optJSONArray("disable"), fVar)) {
            return m16972a(optJSONObject.optJSONArray("enable"), fVar);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m16972a(JSONArray jSONArray, C6742f fVar) {
        if (C6678l.m16558a(jSONArray)) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                C6582c a = C6553b.m16004a();
                a.mo52019a("NPTH_CATCH", (Throwable) new IllegalArgumentException("err config: " + jSONArray));
            } else if (m16973a(optJSONObject, fVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m16973a(JSONObject jSONObject, C6742f fVar) {
        StringBuilder sb;
        Iterator<String> keys = jSONObject.keys();
        boolean z = false;
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                z = true;
                if (next.startsWith("header_")) {
                    if (!m16974a(jSONObject.optJSONObject(next), fVar.mo52301b(next.substring(7)))) {
                        sb = new StringBuilder();
                    }
                } else if (!next.startsWith("java_")) {
                    C6688q.m16625a((Object) "no rules match " + next);
                } else if (!m16974a(jSONObject.optJSONObject(next), fVar.mo52247a(next.substring(5)))) {
                    sb = new StringBuilder();
                }
                sb.append("not match ");
                sb.append(next);
                C6688q.m16625a((Object) sb.toString());
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m16974a(JSONObject jSONObject, Object obj) {
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray.length() == 0) {
            return false;
        }
        String optString = jSONObject.optString("op");
        String valueOf = String.valueOf(obj);
        if (optString.equals("=")) {
            return valueOf.equals(String.valueOf(optJSONArray.opt(0)));
        }
        if (optString.equals("in")) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (String.valueOf(optJSONArray.opt(i)).equals(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static JSONArray m16975b(JSONArray jSONArray, C6742f fVar) {
        JSONArray jSONArray2 = new JSONArray();
        if (C6678l.m16558a(jSONArray)) {
            return jSONArray2;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                C6582c a = C6553b.m16004a();
                a.mo52019a("NPTH_CATCH", (Throwable) new IllegalArgumentException("err config: " + jSONArray));
            } else if (m16973a(optJSONObject, fVar)) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    /* renamed from: b */
    public static JSONObject m16976b(JSONObject jSONObject) {
        StringBuilder sb;
        String str;
        Iterator<String> keys = jSONObject.keys();
        C6742f fVar = new C6742f();
        JSONObject jSONObject2 = new JSONObject();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!"configType".equals(next)) {
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject == null) {
                    C6582c a = C6553b.m16004a();
                    a.mo52019a("NPTH_CATCH", (Throwable) new IllegalArgumentException("err config with key: " + next));
                } else {
                    if (m16972a(optJSONObject.optJSONArray("disable"), fVar)) {
                        sb = new StringBuilder();
                        str = "match diable ";
                    } else {
                        JSONArray b = m16975b(optJSONObject.optJSONArray("enable"), fVar);
                        if (C6678l.m16558a(b)) {
                            sb = new StringBuilder();
                            str = "not match ";
                        } else {
                            try {
                                jSONObject2.put(next, new JSONObject().put("enable", b));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    sb.append(str);
                    sb.append(next);
                    C6688q.m16625a((Object) sb.toString());
                }
            }
        }
        return jSONObject2;
    }
}
