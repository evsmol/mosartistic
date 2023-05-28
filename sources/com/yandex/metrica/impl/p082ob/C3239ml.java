package com.yandex.metrica.impl.p082ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ml */
public class C3239ml implements C2209Jk {
    /* renamed from: a */
    public void mo16049a(JSONObject jSONObject, Object obj, String str) {
        try {
            jSONObject.getJSONArray("ssh").getJSONObject(0).put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
