package com.yandex.metrica.impl.p082ob;

import android.util.Base64;
import com.yandex.metrica.CounterConfiguration;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.E7 */
class C1980E7 {

    /* renamed from: a */
    private static String[] f5308a = {"arg_ak", "arg_pn", "arg_pd", "arg_ps", "arg_rt"};

    C1980E7() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3049i4 mo15672a(String str) {
        try {
            return m7082a(new JSONObject(new String(Base64.decode(str, 0))).getJSONObject("arg_cd"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C3049i4 m7082a(JSONObject jSONObject) {
        try {
            for (String has : f5308a) {
                if (!jSONObject.has(has)) {
                    return null;
                }
            }
            int i = jSONObject.getInt("arg_pd");
            if (i == 0) {
                i = Integer.parseInt(jSONObject.getString("arg_pd"));
            }
            return new C3049i4(jSONObject.getString("arg_ak"), jSONObject.getString("arg_pn"), Integer.valueOf(i), jSONObject.getString("arg_ps"), CounterConfiguration.C10685b.m31470a(jSONObject.getString("arg_rt")));
        } catch (Exception unused) {
            return null;
        }
    }
}
