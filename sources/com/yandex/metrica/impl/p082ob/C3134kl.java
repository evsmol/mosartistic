package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.kl */
public class C3134kl implements C2248Kk {
    /* renamed from: a */
    public JSONObject mo16085a(Activity activity, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sid", activity.getClass().getName()).put("cid", j);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
