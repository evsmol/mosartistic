package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.b */
/* compiled from: EndcardSkipModel */
public class C0117b implements C0118c {

    /* renamed from: a */
    private long f466a;

    /* renamed from: b */
    private long f467b;

    /* renamed from: c */
    private int f468c;

    /* renamed from: d */
    private int f469d;

    /* renamed from: a */
    public void mo330a(long j) {
        this.f466a = j;
    }

    /* renamed from: b */
    public void mo333b(long j) {
        this.f467b = j;
    }

    /* renamed from: a */
    public void mo329a(int i) {
        this.f468c = i;
    }

    /* renamed from: b */
    public void mo332b(int i) {
        this.f469d = i;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f466a);
                jSONObject.put("total_duration", this.f467b);
                jSONObject.put("vbtt_skip_type", this.f468c);
                jSONObject.put("skip_reason", this.f469d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
