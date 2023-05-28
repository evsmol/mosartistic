package com.apm.insight.runtime;

import com.apm.insight.p178l.C6678l;
import com.apm.insight.p178l.C6688q;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.e */
public class C6741e {

    /* renamed from: a */
    private static HashMap<String, C6741e> f14483a = new HashMap<>();

    /* renamed from: b */
    private JSONObject f14484b = null;

    /* renamed from: c */
    private JSONObject f14485c = null;

    /* renamed from: d */
    private boolean f14486d = false;

    /* renamed from: e */
    private String f14487e;

    public C6741e(JSONObject jSONObject, String str) {
        this.f14487e = str;
        m16932a(jSONObject);
        f14483a.put(this.f14487e, this);
        C6688q.m16625a((Object) "after update aid " + str);
    }

    /* renamed from: a */
    public static void m16931a(String str, JSONObject jSONObject) {
        C6741e eVar = f14483a.get(str);
        if (eVar != null) {
            eVar.m16932a(jSONObject);
        } else {
            new C6741e(jSONObject, str);
        }
    }

    /* renamed from: a */
    private void m16932a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f14484b = jSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("error_module")) != null) {
            boolean z = true;
            if (optJSONObject.optInt("switcher") != 1) {
                z = false;
            }
            this.f14486d = z;
        }
    }

    /* renamed from: b */
    public static boolean m16933b(String str) {
        return f14483a.get(str) != null;
    }

    /* renamed from: c */
    public static JSONObject m16934c(String str) {
        C6741e eVar = f14483a.get(str);
        if (eVar != null) {
            return eVar.mo52296a();
        }
        return null;
    }

    /* renamed from: d */
    public static C6741e m16935d(String str) {
        return f14483a.get(str);
    }

    /* renamed from: e */
    public static long m16936e(String str) {
        C6741e eVar = f14483a.get(str);
        if (eVar == null) {
            return 3600000;
        }
        try {
            return Long.decode(C6678l.m16561b(eVar.mo52296a(), "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000;
        }
    }

    /* renamed from: f */
    public static boolean m16937f(String str) {
        C6741e eVar = f14483a.get(str);
        return eVar != null && eVar.mo52298b();
    }

    /* renamed from: g */
    public static boolean m16938g(String str) {
        C6741e eVar = f14483a.get(str);
        return eVar != null && eVar.mo52299c();
    }

    /* renamed from: h */
    public static boolean m16939h(String str) {
        C6741e eVar = f14483a.get(str);
        return eVar != null && eVar.mo52300d();
    }

    /* renamed from: a */
    public JSONObject mo52296a() {
        return this.f14484b;
    }

    /* renamed from: a */
    public boolean mo52297a(String str) {
        if (this.f14484b == null) {
            return false;
        }
        return this.f14486d;
    }

    /* renamed from: b */
    public boolean mo52298b() {
        JSONObject jSONObject = this.f14484b;
        return jSONObject != null && 1 == C6678l.m16553a(jSONObject, 0, "crash_module", "switcher");
    }

    /* renamed from: c */
    public boolean mo52299c() {
        JSONObject jSONObject = this.f14484b;
        return jSONObject != null && 1 == C6678l.m16553a(jSONObject, 0, "crash_module", "switcher");
    }

    /* renamed from: d */
    public boolean mo52300d() {
        JSONObject jSONObject = this.f14484b;
        return jSONObject != null && 1 == C6678l.m16553a(jSONObject, 0, "crash_module", "switcher");
    }
}
