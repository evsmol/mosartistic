package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.n */
/* compiled from: PlayErrorModel */
public class C0129n implements C0118c {

    /* renamed from: a */
    private long f501a;

    /* renamed from: b */
    private long f502b;

    /* renamed from: c */
    private int f503c;

    /* renamed from: d */
    private int f504d;

    /* renamed from: e */
    private String f505e;

    /* renamed from: a */
    public void mo362a(long j) {
        this.f501a = j;
    }

    /* renamed from: b */
    public void mo364b(long j) {
        this.f502b = j;
    }

    /* renamed from: a */
    public void mo361a(int i) {
        this.f503c = i;
    }

    /* renamed from: b */
    public void mo363b(int i) {
        this.f504d = i;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f501a);
                jSONObject.put("total_duration", this.f502b);
                jSONObject.put("error_code", this.f503c);
                jSONObject.put("extra_error_code", this.f504d);
                jSONObject.put("error_message", this.f505e);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
