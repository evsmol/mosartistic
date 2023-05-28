package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.m */
/* compiled from: PlayBufferModel */
public class C0128m implements C0118c {

    /* renamed from: a */
    public long f498a;

    /* renamed from: b */
    public int f499b;

    /* renamed from: c */
    public long f500c;

    /* renamed from: a */
    public void mo359a(long j) {
        this.f498a = j;
    }

    /* renamed from: a */
    public void mo358a(int i) {
        this.f499b = i;
    }

    /* renamed from: b */
    public void mo360b(long j) {
        this.f500c = j;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f498a);
                jSONObject.put("buffers_count", this.f499b);
                jSONObject.put("total_duration", this.f500c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
