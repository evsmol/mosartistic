package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.k */
/* compiled from: LoadVideoStartModel */
public class C0126k implements C0118c {

    /* renamed from: a */
    private String f492a;

    /* renamed from: b */
    private long f493b;

    public C0126k(String str, long j) {
        this.f492a = str;
        this.f493b = j;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f492a);
                jSONObject.put("preload_size", this.f493b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
