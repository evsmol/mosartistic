package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2600Ud;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xa */
public class C3649xa implements C3474sa<C2600Ud> {
    /* renamed from: a */
    public JSONObject mo17884a(Object obj) {
        JSONObject jSONObject;
        C2600Ud ud = (C2600Ud) obj;
        JSONObject jSONObject2 = new JSONObject();
        if (ud != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (C2600Ud.C2601a next : ud.f6882b) {
                    if (next == null) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject().putOpt("tracking_id", next.f6883a).put("additional_parameters", next.f6884b).put("source", next.f6885c.mo18246a());
                    }
                    jSONArray.put(jSONObject);
                }
                JSONObject put = jSONObject2.put("candidates", jSONArray);
                C2923ee eeVar = ud.f6881a;
                put.put("chosen", new JSONObject().putOpt("tracking_id", eeVar.f7751a).put("additional_parameters", eeVar.f7752b).put("source", eeVar.f7755e.mo18246a()).put("auto_tracking_enabled", eeVar.f7754d));
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }
}
