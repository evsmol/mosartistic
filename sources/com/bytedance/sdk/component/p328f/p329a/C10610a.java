package com.bytedance.sdk.component.p328f.p329a;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.f.a.a */
/* compiled from: ThreadLogModel */
public class C10610a {

    /* renamed from: a */
    public int f26474a;

    /* renamed from: b */
    public int f26475b;

    /* renamed from: c */
    public int f26476c;

    /* renamed from: d */
    public int f26477d;

    public C10610a(int i, int i2, int i3, int i4) {
        this.f26474a = i;
        this.f26475b = i2;
        this.f26476c = i3;
        this.f26477d = i4;
    }

    /* renamed from: a */
    public JSONObject mo64240a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.f26474a);
            jSONObject.put("sdk_max_thread_num", this.f26475b);
            jSONObject.put("app_thread_num", this.f26476c);
            jSONObject.put("app_max_thread_num", this.f26477d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }
}
