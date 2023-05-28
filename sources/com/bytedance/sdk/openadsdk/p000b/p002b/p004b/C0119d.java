package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.d */
/* compiled from: FeedBreakModel */
public class C0119d implements C0118c {

    /* renamed from: a */
    public long f470a;

    /* renamed from: b */
    public long f471b;

    /* renamed from: c */
    public int f472c;

    /* renamed from: d */
    public int f473d = 0;

    /* renamed from: a */
    public void mo335a(long j) {
        this.f470a = j;
    }

    /* renamed from: b */
    public void mo337b(long j) {
        this.f471b = j;
    }

    /* renamed from: a */
    public void mo334a(int i) {
        this.f472c = i;
    }

    /* renamed from: b */
    public void mo336b(int i) {
        this.f473d = i;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("total_duration", this.f470a);
                jSONObject.put("buffers_time", this.f471b);
                jSONObject.put("break_reason", this.f472c);
                jSONObject.put("video_backup", this.f473d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
