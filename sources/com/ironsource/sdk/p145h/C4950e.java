package com.ironsource.sdk.p145h;

import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.e */
public final class C4950e {

    /* renamed from: a */
    public JSONObject f12693a;

    public C4950e(JSONObject jSONObject) {
        this.f12693a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    public final boolean mo34696a() {
        return this.f12693a.optBoolean("useCacheDir", false);
    }
}
