package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.g */
/* compiled from: FeedPauseModel */
public class C0122g implements C0118c {

    /* renamed from: a */
    private long f479a;

    /* renamed from: b */
    private long f480b;

    /* renamed from: a */
    public void mo343a(long j) {
        this.f479a = j;
    }

    /* renamed from: b */
    public void mo344b(long j) {
        this.f480b = j;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f479a);
                jSONObject.put("total_duration", this.f480b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
