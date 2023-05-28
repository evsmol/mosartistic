package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.i */
/* compiled from: LoadVideoCancelModel */
public class C0124i implements C0118c {

    /* renamed from: a */
    private String f484a;

    /* renamed from: b */
    private long f485b;

    public C0124i(String str, long j) {
        this.f484a = str;
        this.f485b = j;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f484a);
                jSONObject.put("preload_size", this.f485b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
