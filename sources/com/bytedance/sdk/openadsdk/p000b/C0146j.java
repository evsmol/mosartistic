package com.bytedance.sdk.openadsdk.p000b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.j */
/* compiled from: AdShowTime */
public class C0146j {

    /* renamed from: a */
    private long f561a;

    /* renamed from: b */
    private long f562b;

    /* renamed from: c */
    private long f563c;

    /* renamed from: d */
    private long f564d;

    /* renamed from: e */
    private long f565e;

    /* renamed from: a */
    public JSONObject mo419a(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        if (this.f561a > 0) {
            jSONObject.put("show_start", this.f561a);
            if (this.f562b > 0) {
                jSONObject.put("show_firstQuartile", this.f562b);
                if (this.f563c > 0) {
                    jSONObject.put("show_mid", this.f563c);
                    if (this.f564d > 0) {
                        jSONObject.put("show_thirdQuartile", this.f564d);
                        if (this.f565e > 0) {
                            jSONObject.put("show_full", this.f565e);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo420a(long j) {
        if (this.f561a <= 0) {
            this.f561a = j;
        }
    }

    /* renamed from: a */
    public void mo421a(long j, float f) {
        if (f > 0.0f) {
            mo420a(j);
        }
        double d = (double) f;
        if (d >= 0.25d) {
            mo420a(j);
            mo424b(j);
        }
        if (d >= 0.5d) {
            mo420a(j);
            mo424b(j);
            mo425c(j);
        }
        if (d >= 0.75d) {
            mo420a(j);
            mo424b(j);
            mo425c(j);
            mo426d(j);
        }
        if (f >= 1.0f) {
            mo420a(j);
            mo424b(j);
            mo425c(j);
            mo426d(j);
            mo427e(j);
        }
    }

    /* renamed from: a */
    public boolean mo422a() {
        return this.f561a > 0;
    }

    /* renamed from: b */
    public JSONObject mo423b() {
        return mo419a((JSONObject) null);
    }

    /* renamed from: b */
    public void mo424b(long j) {
        if (this.f562b <= 0) {
            this.f562b = j;
        }
    }

    /* renamed from: c */
    public void mo425c(long j) {
        if (this.f563c <= 0) {
            this.f563c = j;
        }
    }

    /* renamed from: d */
    public void mo426d(long j) {
        if (this.f564d <= 0) {
            this.f564d = j;
        }
    }

    /* renamed from: e */
    public void mo427e(long j) {
        if (this.f565e <= 0) {
            this.f565e = j;
        }
    }
}
