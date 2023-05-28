package com.yandex.metrica.impl.p082ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ee */
public class C2923ee implements C3563v0 {

    /* renamed from: a */
    public final String f7751a;

    /* renamed from: b */
    public final JSONObject f7752b;

    /* renamed from: c */
    public final boolean f7753c;

    /* renamed from: d */
    public final boolean f7754d;

    /* renamed from: e */
    public final C3522u0 f7755e;

    public C2923ee(String str, JSONObject jSONObject, boolean z, boolean z2, C3522u0 u0Var) {
        this.f7751a = str;
        this.f7752b = jSONObject;
        this.f7753c = z;
        this.f7754d = z2;
        this.f7755e = u0Var;
    }

    /* renamed from: a */
    public C3522u0 mo17550a() {
        return this.f7755e;
    }

    public String toString() {
        return "PreloadInfoState{trackingId='" + this.f7751a + '\'' + ", additionalParameters=" + this.f7752b + ", wasSet=" + this.f7753c + ", autoTrackingEnabled=" + this.f7754d + ", source=" + this.f7755e + '}';
    }
}
