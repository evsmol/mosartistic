package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3566v3;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.pa */
public class C3346pa implements C3474sa<C3566v3> {
    /* renamed from: a */
    public JSONObject mo17884a(Object obj) {
        C3566v3 v3Var = (C3566v3) obj;
        JSONObject jSONObject = new JSONObject();
        if (v3Var != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (C3566v3.C3567a a : v3Var.mo16767a()) {
                    jSONArray.put(m10299a(a));
                }
                jSONObject.putOpt("chosen", m10299a(v3Var.mo18314c())).putOpt("candidates", jSONArray);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m10299a(C3566v3.C3567a aVar) throws JSONException {
        if (aVar == null) {
            return null;
        }
        return new JSONObject().putOpt("clids", C2572Tl.m8543e((Map) aVar.mo18318b())).putOpt("source", aVar.mo17550a().mo18246a());
    }
}
