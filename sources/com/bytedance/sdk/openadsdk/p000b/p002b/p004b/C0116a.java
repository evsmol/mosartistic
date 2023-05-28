package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0118c;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.a */
/* compiled from: BaseEventModel */
public class C0116a<T extends C0118c> {

    /* renamed from: a */
    private C0477n f461a;

    /* renamed from: b */
    private String f462b;

    /* renamed from: c */
    private JSONObject f463c;

    /* renamed from: d */
    private T f464d = null;

    /* renamed from: e */
    private boolean f465e = false;

    public C0116a(C0477n nVar, String str, JSONObject jSONObject, T t) {
        this.f461a = nVar;
        this.f462b = str;
        this.f463c = jSONObject;
        this.f464d = t;
    }

    /* renamed from: a */
    public C0477n mo323a() {
        return this.f461a;
    }

    /* renamed from: b */
    public String mo325b() {
        return this.f462b;
    }

    /* renamed from: c */
    public JSONObject mo326c() {
        if (this.f463c == null) {
            this.f463c = new JSONObject();
        }
        return this.f463c;
    }

    /* renamed from: d */
    public T mo327d() {
        return this.f464d;
    }

    /* renamed from: e */
    public boolean mo328e() {
        return this.f465e;
    }

    /* renamed from: a */
    public void mo324a(boolean z) {
        this.f465e = z;
    }
}
