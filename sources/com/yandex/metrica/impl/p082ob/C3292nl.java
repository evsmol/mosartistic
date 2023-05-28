package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.nl */
public class C3292nl implements C2248Kk {
    /* renamed from: a */
    public JSONObject mo16085a(Activity activity, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ssh", new JSONArray().put(new JSONObject().put("si", new JSONObject().put("cn", activity.getClass().getName())).put("cid", j)));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
