package com.ironsource.sdk.controller;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.n */
public final class C4818n {

    /* renamed from: a */
    String f12280a;

    /* renamed from: b */
    JSONObject f12281b;

    /* renamed from: c */
    String f12282c;

    /* renamed from: d */
    String f12283d;

    public C4818n(JSONObject jSONObject) {
        this.f12280a = jSONObject.optString("functionName");
        this.f12281b = jSONObject.optJSONObject("functionParams");
        this.f12282c = jSONObject.optString("success");
        this.f12283d = jSONObject.optString("fail");
    }

    /* renamed from: a */
    public final JSONObject mo34397a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", this.f12280a);
            jSONObject.put("functionParams", this.f12281b);
            jSONObject.put("success", this.f12282c);
            jSONObject.put("fail", this.f12283d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
