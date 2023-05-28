package com.apm.insight.runtime;

import com.apm.insight.C6617h;
import com.apm.insight.entity.C6595b;
import com.apm.insight.p177k.C6633a;
import com.apm.insight.p177k.C6658k;
import com.apm.insight.p178l.C6678l;
import com.apm.insight.p178l.C6688q;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a */
public class C6718a {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<Object> f14424a = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public static int m16789a(int i, String... strArr) {
        return C6678l.m16553a(m16792a(), i, strArr);
    }

    /* renamed from: a */
    public static int m16790a(String... strArr) {
        return C6678l.m16553a(m16792a(), -1, strArr);
    }

    /* renamed from: a */
    public static String m16791a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("exception_modules")) == null) {
            return null;
        }
        return optJSONObject.optString("npth");
    }

    /* renamed from: a */
    public static JSONObject m16792a() {
        return C6741e.m16934c(C6617h.m16297a().mo52294e());
    }

    /* renamed from: a */
    public static JSONObject m16793a(JSONArray jSONArray, String str) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i).optJSONObject(str);
                if (optJSONObject != null) {
                    return optJSONObject;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m16794a(JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            C6688q.m16627a("apmconfig", (Object) "fromnet " + z + " : " + jSONArray);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String next = optJSONObject.keys().next();
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                    C6688q.m16625a((Object) "update config " + next + " : " + optJSONObject2);
                    C6741e.m16931a(next, optJSONObject2);
                    if (z) {
                        C6658k.m16457a(next);
                    }
                } catch (Throwable unused) {
                }
            }
            C6755n.m16970a(m16793a(jSONArray, String.valueOf(C6617h.m16297a().mo52294e())));
            if (z) {
                C6658k.m16458a(false, jSONArray);
            }
        }
    }

    /* renamed from: a */
    public static boolean m16795a(Object obj) {
        String b = C6595b.m16207b(obj);
        if (b != null) {
            return C6741e.m16933b(b);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m16796a(Object obj, String str) {
        C6741e d;
        String b = C6595b.m16207b(obj);
        if (b == null || (d = C6741e.m16935d(b)) == null) {
            return false;
        }
        return d.mo52297a(str);
    }

    /* renamed from: a */
    public static boolean m16797a(String str) {
        if (!C6741e.m16933b(str)) {
            C6633a.m16363b();
        }
        return C6741e.m16937f(str);
    }

    /* renamed from: b */
    public static boolean m16798b() {
        return C6756o.m17005e();
    }

    /* renamed from: b */
    public static boolean m16799b(String str) {
        if (!C6741e.m16933b(str)) {
            C6633a.m16363b();
        }
        return C6741e.m16939h(str);
    }

    /* renamed from: c */
    public static JSONArray m16800c() {
        return C6678l.m16555a(m16792a(), "custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore");
    }

    /* renamed from: c */
    public static boolean m16801c(String str) {
        if (!C6741e.m16933b(str)) {
            C6633a.m16363b();
        }
        return C6741e.m16938g(str);
    }

    /* renamed from: d */
    public static boolean m16802d() {
        return m16790a("custom_event_settings", "npth_simple_setting", "disable_looper_monitor") == 1;
    }

    /* renamed from: e */
    public static boolean m16803e() {
        return m16790a("custom_event_settings", "npth_simple_setting", "enable_all_thread_stack_native") == 1;
    }

    /* renamed from: f */
    public static boolean m16804f() {
        return m16790a("custom_event_settings", "npth_simple_setting", "anr_with_traces_txt") == 1;
    }

    /* renamed from: g */
    public static boolean m16805g() {
        return m16790a("custom_event_settings", "npth_simple_setting", "upload_crash_crash") == 1;
    }

    /* renamed from: h */
    public static boolean m16806h() {
        return m16790a("custom_event_settings", "npth_simple_setting", "force_apm_crash") == 1;
    }

    /* renamed from: i */
    public static boolean m16807i() {
        return m16790a("custom_event_settings", "npth_simple_setting", "enable_killed_anr") == 1;
    }

    /* renamed from: j */
    public static boolean m16808j() {
        return m16790a("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1;
    }
}
