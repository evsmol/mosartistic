package com.bytedance.sdk.openadsdk.p000b.p001a;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.a.c */
/* compiled from: EventStartListenerWrapper */
public class C0111c implements C0110b {

    /* renamed from: a */
    C0110b f452a;

    /* renamed from: a */
    public void mo321a(JSONObject jSONObject) throws JSONException {
        C0110b bVar = this.f452a;
        if (bVar != null) {
            bVar.mo321a(jSONObject);
        }
        jSONObject.put("event_ts", System.currentTimeMillis());
    }
}
