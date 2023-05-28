package com.bytedance.sdk.openadsdk.p000b.p002b.p004b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.j */
/* compiled from: LoadVideoErrorModel */
public class C0125j implements C0118c {

    /* renamed from: a */
    private String f486a;

    /* renamed from: b */
    private long f487b;

    /* renamed from: c */
    private long f488c;

    /* renamed from: d */
    private int f489d;

    /* renamed from: e */
    private String f490e;

    /* renamed from: f */
    private String f491f;

    /* renamed from: a */
    public void mo350a(String str) {
        this.f486a = str;
    }

    /* renamed from: a */
    public void mo349a(long j) {
        this.f487b = j;
    }

    /* renamed from: b */
    public void mo351b(long j) {
        this.f488c = j;
    }

    /* renamed from: a */
    public void mo348a(int i) {
        this.f489d = i;
    }

    /* renamed from: b */
    public void mo352b(String str) {
        this.f490e = str;
    }

    /* renamed from: c */
    public void mo353c(String str) {
        this.f491f = str;
    }

    /* renamed from: a */
    public void mo331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f486a);
                jSONObject.put("preload_size", this.f487b);
                jSONObject.put("load_time", this.f488c);
                jSONObject.put("error_code", this.f489d);
                jSONObject.put("error_message", this.f490e);
                jSONObject.put("error_message_server", this.f491f);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
