package com.apm.insight.entity;

import android.os.Environment;
import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6675i;
import com.apm.insight.p178l.C6678l;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.entity.d */
public class C6598d {

    /* renamed from: a */
    private static String f14154a;

    /* renamed from: b */
    private static JSONObject f14155b;

    /* renamed from: a */
    private static void m16212a() {
        JSONObject jSONObject;
        if (f14154a == null) {
            f14154a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + C6617h.m16313g().getPackageName() + "/AutomationTestInfo.json";
        }
        if (f14155b == null) {
            try {
                f14155b = new JSONObject(C6675i.m16540c(f14154a));
                return;
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            } catch (IOException unused2) {
                jSONObject = new JSONObject();
            }
        } else {
            return;
        }
        f14155b = jSONObject;
    }

    /* renamed from: a */
    public static void m16213a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                m16215c(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m16214b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                m16216d(jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m16215c(JSONObject jSONObject) {
        Object opt;
        m16212a();
        JSONObject jSONObject2 = f14155b;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"slardar_filter".equals(next) && (opt = f14155b.opt(next)) != null) {
                    try {
                        jSONObject.put(next, opt);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private static void m16216d(JSONObject jSONObject) {
        m16212a();
        JSONObject jSONObject2 = f14155b;
        if (jSONObject2 != null) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("slardar_filter");
            if (!C6678l.m16559a(optJSONObject)) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("filters", optJSONObject2);
                    } catch (JSONException unused) {
                    }
                }
                C6594a.m16169b(optJSONObject2, optJSONObject);
            }
        }
    }
}
