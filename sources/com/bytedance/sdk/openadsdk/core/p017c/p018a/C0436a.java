package com.bytedance.sdk.openadsdk.core.p017c.p018a;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.a.a */
/* compiled from: DynamicAdInfo */
public class C0436a {

    /* renamed from: a */
    private String f1458a;

    /* renamed from: b */
    private String f1459b;

    /* renamed from: c */
    private String f1460c;

    public C0436a(String str, String str2, String str3) {
        this.f1458a = str;
        this.f1459b = str2;
        this.f1460c = str3;
    }

    /* renamed from: a */
    public JSONObject mo1182a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f1458a)) {
                jSONObject.put("cid", this.f1458a);
            }
            if (!TextUtils.isEmpty(this.f1459b)) {
                jSONObject.put("log_extra", this.f1459b);
            }
            if (!TextUtils.isEmpty(this.f1460c)) {
                jSONObject.put("download_url", this.f1460c);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
