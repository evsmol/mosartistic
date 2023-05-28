package com.applovin.impl.mediation.debugger.p238b.p239a;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.e */
public class C8156e {

    /* renamed from: a */
    private final String f19901a;

    /* renamed from: b */
    private final String f19902b;

    public C8156e(JSONObject jSONObject, C8490n nVar) {
        this.f19901a = JsonUtils.getString(jSONObject, "id", "");
        this.f19902b = JsonUtils.getString(jSONObject, "price", (String) null);
    }

    /* renamed from: a */
    public String mo56346a() {
        return this.f19901a;
    }

    /* renamed from: b */
    public String mo56347b() {
        return this.f19902b;
    }
}
