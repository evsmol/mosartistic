package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.h */
/* compiled from: FeedPlayModel */
public class C0123h implements C0118c {

    /* renamed from: a */
    private long f481a;

    /* renamed from: b */
    private long f482b;

    /* renamed from: c */
    private int f483c;

    /* renamed from: a */
    public void mo346a(long j) {
        this.f481a = j;
    }

    /* renamed from: b */
    public void mo347b(long j) {
        this.f482b = j;
    }

    /* renamed from: a */
    public void mo345a(int i) {
        this.f483c = i;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("video_start_duration", this.f481a);
                jSONObject.put("video_cache_size", this.f482b);
                jSONObject.put("is_auto_play", this.f483c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
