package com.yandex.metrica.impl.p082ob;

import android.util.Base64;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p082ob.C2168J;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Z6 */
public class C2762Z6 {

    /* renamed from: a */
    private final byte[] f7255a;

    /* renamed from: b */
    private final String f7256b;

    /* renamed from: c */
    private final int f7257c;

    /* renamed from: d */
    private final HashMap<C2168J.C2169a, Integer> f7258d;

    /* renamed from: e */
    private final String f7259e;

    /* renamed from: f */
    private final Integer f7260f;

    /* renamed from: g */
    private final String f7261g;

    /* renamed from: h */
    private final String f7262h;

    /* renamed from: i */
    private final CounterConfiguration.C10685b f7263i;

    /* renamed from: j */
    private final String f7264j;

    public C2762Z6(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f7255a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f7256b = jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f7257c = jSONObject2.getInt("bytes_truncated");
        this.f7264j = C2572Tl.m8530b(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f7258d = new HashMap<>();
        if (optString != null) {
            try {
                HashMap<String, String> d = C2572Tl.m8540d(optString);
                if (d != null) {
                    for (Map.Entry next : d.entrySet()) {
                        this.f7258d.put(C2168J.C2169a.valueOf((String) next.getKey()), Integer.valueOf(Integer.parseInt((String) next.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f7259e = jSONObject3.getString("package_name");
        this.f7260f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f7261g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f7262h = jSONObject4.getString("api_key");
        this.f7263i = m8940a(jSONObject4);
    }

    /* renamed from: a */
    public String mo17093a() {
        return this.f7262h;
    }

    /* renamed from: b */
    public int mo17094b() {
        return this.f7257c;
    }

    /* renamed from: c */
    public byte[] mo17095c() {
        return this.f7255a;
    }

    /* renamed from: d */
    public String mo17096d() {
        return this.f7264j;
    }

    /* renamed from: e */
    public String mo17097e() {
        return this.f7256b;
    }

    /* renamed from: f */
    public String mo17098f() {
        return this.f7259e;
    }

    /* renamed from: g */
    public Integer mo17099g() {
        return this.f7260f;
    }

    /* renamed from: h */
    public String mo17100h() {
        return this.f7261g;
    }

    /* renamed from: i */
    public CounterConfiguration.C10685b mo17101i() {
        return this.f7263i;
    }

    /* renamed from: j */
    public HashMap<C2168J.C2169a, Integer> mo17102j() {
        return this.f7258d;
    }

    /* renamed from: k */
    public String mo17103k() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f7258d.entrySet()) {
            hashMap.put(((C2168J.C2169a) next.getKey()).name(), next.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f7260f).put("psid", this.f7261g).put("package_name", this.f7259e)).put("reporter_configuration", new JSONObject().put("api_key", this.f7262h).put("reporter_type", this.f7263i.mo64636a())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f7255a, 0)).put(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f7256b).put("bytes_truncated", this.f7257c).put("trimmed_fields", C2572Tl.m8546g(hashMap)).putOpt("environment", this.f7264j)).toString();
    }

    @Deprecated
    /* renamed from: a */
    private CounterConfiguration.C10685b m8940a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("reporter_type")) {
            return CounterConfiguration.C10685b.m31470a(jSONObject.getString("reporter_type"));
        }
        if (jSONObject.getBoolean("is_commutation")) {
            return CounterConfiguration.C10685b.COMMUTATION;
        }
        return CounterConfiguration.C10685b.MAIN;
    }

    public C2762Z6(C2851c0 c0Var, C3719z3 z3Var, HashMap<C2168J.C2169a, Integer> hashMap) {
        this.f7255a = c0Var.mo17349r();
        this.f7256b = c0Var.mo17338g();
        this.f7257c = c0Var.mo17334d();
        if (hashMap != null) {
            this.f7258d = hashMap;
        } else {
            this.f7258d = new HashMap<>();
        }
        C1850A3 a = z3Var.mo18443a();
        this.f7259e = a.mo15430f();
        this.f7260f = a.mo15431g();
        this.f7261g = a.mo15432h();
        CounterConfiguration b = z3Var.mo18444b();
        this.f7262h = b.mo64607a();
        this.f7263i = b.mo64625k();
        this.f7264j = c0Var.mo17339h();
    }
}
