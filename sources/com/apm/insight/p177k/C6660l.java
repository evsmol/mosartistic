package com.apm.insight.p177k;

import org.json.JSONObject;

/* renamed from: com.apm.insight.k.l */
public class C6660l {

    /* renamed from: a */
    private final int f14338a;

    /* renamed from: b */
    private String f14339b;

    /* renamed from: c */
    private JSONObject f14340c;

    /* renamed from: d */
    private byte[] f14341d;

    public C6660l(int i) {
        this.f14338a = i;
    }

    public C6660l(int i, String str) {
        this.f14338a = i;
        this.f14339b = str;
    }

    public C6660l(int i, Throwable th) {
        this.f14338a = i;
        if (th != null) {
            this.f14339b = th.getMessage();
        }
    }

    public C6660l(int i, JSONObject jSONObject) {
        this.f14338a = i;
        this.f14340c = jSONObject;
    }

    public C6660l(int i, byte[] bArr) {
        this.f14338a = i;
        this.f14341d = bArr;
    }

    /* renamed from: a */
    public boolean mo52152a() {
        return this.f14338a != 207;
    }

    /* renamed from: b */
    public byte[] mo52153b() {
        return this.f14341d;
    }
}
