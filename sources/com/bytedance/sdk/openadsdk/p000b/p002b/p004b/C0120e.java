package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.e */
/* compiled from: FeedContinueModel */
public class C0120e implements C0118c {

    /* renamed from: a */
    private long f474a;

    /* renamed from: b */
    private long f475b;

    /* renamed from: a */
    public void mo338a(long j) {
        this.f474a = j;
    }

    /* renamed from: b */
    public void mo339b(long j) {
        this.f475b = j;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f474a);
                jSONObject.put("total_duration", this.f475b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
