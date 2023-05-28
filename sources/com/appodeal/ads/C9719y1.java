package com.appodeal.ads;

import org.json.JSONObject;

/* renamed from: com.appodeal.ads.y1 */
public final class C9719y1 {
    /* renamed from: a */
    public static void m28548a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.optBoolean("refresh")) {
                C9422r0.m27936d();
            }
            if (jSONObject.optBoolean("session_drop_store")) {
                C9409q4.m27877m().mo61183b();
            }
        }
    }
}
