package com.appodeal.ads;

import org.json.JSONObject;

@Deprecated
/* renamed from: com.appodeal.ads.g0 */
public final class C9193g0 implements ApdServiceInitParams {

    /* renamed from: a */
    public final JSONObject f23055a;

    public C9193g0(JSONObject jSONObject) {
        this.f23055a = jSONObject;
    }

    public final JSONObject getJsonData() {
        return this.f23055a;
    }

    public final RestrictedData getRestrictedData() {
        return C9234j4.f23194a;
    }

    public final boolean isTestMode() {
        return C9227j0.f23188c.isTestMode();
    }
}
