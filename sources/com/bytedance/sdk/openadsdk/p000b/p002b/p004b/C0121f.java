package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.f */
/* compiled from: FeedOverModel */
public class C0121f implements C0118c {

    /* renamed from: a */
    private long f476a;

    /* renamed from: b */
    private long f477b;

    /* renamed from: c */
    private int f478c = 0;

    /* renamed from: a */
    public void mo341a(long j) {
        this.f476a = j;
    }

    /* renamed from: b */
    public void mo342b(long j) {
        this.f477b = j;
    }

    /* renamed from: a */
    public void mo340a(int i) {
        this.f478c = i;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("total_duration", this.f476a);
                jSONObject.put("buffers_time", this.f477b);
                jSONObject.put("video_backup", this.f478c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
