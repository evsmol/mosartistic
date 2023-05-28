package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.l */
/* compiled from: LoadVideoSuccessModel */
public class C0127l implements C0118c {

    /* renamed from: a */
    private String f494a;

    /* renamed from: b */
    private long f495b;

    /* renamed from: c */
    private long f496c;

    /* renamed from: d */
    private long f497d;

    /* renamed from: a */
    public void mo355a(String str) {
        this.f494a = str;
    }

    /* renamed from: a */
    public void mo354a(long j) {
        this.f495b = j;
    }

    /* renamed from: b */
    public void mo356b(long j) {
        this.f496c = j;
    }

    /* renamed from: c */
    public void mo357c(long j) {
        this.f497d = j;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f494a);
                jSONObject.put("preload_size", this.f495b);
                jSONObject.put("load_time", this.f496c);
                jSONObject.put("local_cache", this.f497d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
