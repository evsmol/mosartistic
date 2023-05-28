package com.appodeal.ads;

import com.appodeal.ads.api.Stats;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.d0 */
public final class C9162d0 implements C9191f5 {

    /* renamed from: a */
    public JSONObject f22986a;

    /* renamed from: b */
    public String f22987b;

    /* renamed from: c */
    public String f22988c;

    /* renamed from: d */
    public boolean f22989d;

    /* renamed from: e */
    public double f22990e;

    /* renamed from: f */
    public long f22991f;

    /* renamed from: g */
    public int f22992g;

    /* renamed from: h */
    public boolean f22993h;

    /* renamed from: i */
    public String f22994i;

    /* renamed from: j */
    public String f22995j;

    /* renamed from: k */
    public int f22996k;

    /* renamed from: l */
    public Boolean f22997l = null;

    /* renamed from: m */
    public long f22998m;

    /* renamed from: n */
    public long f22999n;

    /* renamed from: o */
    public boolean f23000o = false;

    /* renamed from: p */
    public boolean f23001p = false;

    /* renamed from: q */
    public C9173e0 f23002q;

    /* renamed from: a */
    public static C9162d0 m27250a(JSONObject jSONObject, boolean z) {
        C9162d0 d0Var = new C9162d0();
        d0Var.f22986a = jSONObject;
        d0Var.f22987b = jSONObject.optString("id");
        d0Var.f22989d = z;
        d0Var.f22988c = jSONObject.optString("status");
        d0Var.f22990e = jSONObject.optDouble("ecpm", 0.0d);
        d0Var.f22991f = jSONObject.optLong("exptime", 0);
        d0Var.f22992g = jSONObject.optInt("tmax", 0);
        d0Var.f22993h = jSONObject.optBoolean("async");
        d0Var.f22994i = C9326n5.m27532a(jSONObject, "mediator", (String) null);
        d0Var.f22995j = C9326n5.m27532a(jSONObject, "unit_name", (String) null);
        d0Var.f22996k = jSONObject.optInt("impression_interval", -1);
        if (jSONObject.has("mute")) {
            d0Var.f22997l = Boolean.valueOf(jSONObject.optBoolean("mute", false));
        }
        return d0Var;
    }

    /* renamed from: a */
    public final void mo59873a(double d) {
        this.f22990e = d;
    }

    /* renamed from: a */
    public final void mo59898a(long j) {
        if (!this.f23001p) {
            this.f23001p = true;
            this.f22999n = j;
        }
    }

    /* renamed from: a */
    public final void mo59874a(C9173e0 e0Var) {
        this.f23002q = e0Var;
    }

    /* renamed from: a */
    public final void mo59875a(String str) {
        this.f22987b = str;
    }

    /* renamed from: b */
    public final void mo59876b() {
        this.f22989d = false;
    }

    /* renamed from: b */
    public final void mo59899b(long j) {
        if (!this.f23000o) {
            this.f23000o = true;
            this.f22998m = j;
        }
    }

    /* renamed from: c */
    public final long mo59900c() {
        return this.f22999n;
    }

    public final String getAdUnitName() {
        return this.f22995j;
    }

    public final double getEcpm() {
        return this.f22990e;
    }

    public final long getExpTime() {
        return this.f22991f;
    }

    public final String getId() {
        return this.f22987b;
    }

    public final int getImpressionInterval() {
        return this.f22996k;
    }

    public final JSONObject getJsonData() {
        return this.f22986a;
    }

    public final int getLoadingTimeout() {
        return this.f22992g;
    }

    public final String getMediatorName() {
        return this.f22994i;
    }

    public final C9173e0 getRequestResult() {
        return this.f23002q;
    }

    public final String getStatus() {
        return this.f22988c;
    }

    public final boolean isAsync() {
        return this.f22993h;
    }

    public final Boolean isMuted() {
        return this.f22997l;
    }

    public final boolean isPrecache() {
        return this.f22989d;
    }

    /* renamed from: a */
    public final Stats.AdUnit mo59897a() {
        return Stats.AdUnit.newBuilder().setId(this.f22987b).setEcpm(this.f22990e).setPrecache(this.f22989d).setStart(this.f22998m).setFinish(this.f22999n).setResult(this.f23002q.mo59904a()).build();
    }
}
