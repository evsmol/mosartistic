package com.applovin.impl.adview;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.applovin.impl.adview.s */
public class C8023s {

    /* renamed from: a */
    private final int f19373a;

    /* renamed from: b */
    private final int f19374b;

    /* renamed from: c */
    private final int f19375c;

    /* renamed from: d */
    private final int f19376d;

    /* renamed from: e */
    private final boolean f19377e;

    /* renamed from: f */
    private final int f19378f;

    /* renamed from: g */
    private final int f19379g;

    /* renamed from: h */
    private final int f19380h;

    /* renamed from: i */
    private final float f19381i;

    /* renamed from: j */
    private final float f19382j;

    public C8023s(JSONObject jSONObject, C8490n nVar) {
        nVar.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = nVar.mo57320D();
            D.mo57820c("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f19373a = JsonUtils.getInt(jSONObject, IabUtils.KEY_WIDTH, 64);
        this.f19374b = JsonUtils.getInt(jSONObject, IabUtils.KEY_HEIGHT, 7);
        this.f19375c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f19376d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f19377e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", false).booleanValue();
        this.f19378f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f19379g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f19380h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f19381i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f19382j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    /* renamed from: a */
    public int mo55787a() {
        return this.f19373a;
    }

    /* renamed from: b */
    public int mo55788b() {
        return this.f19374b;
    }

    /* renamed from: c */
    public int mo55789c() {
        return this.f19375c;
    }

    /* renamed from: d */
    public int mo55790d() {
        return this.f19376d;
    }

    /* renamed from: e */
    public boolean mo55791e() {
        return this.f19377e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8023s sVar = (C8023s) obj;
        return this.f19373a == sVar.f19373a && this.f19374b == sVar.f19374b && this.f19375c == sVar.f19375c && this.f19376d == sVar.f19376d && this.f19377e == sVar.f19377e && this.f19378f == sVar.f19378f && this.f19379g == sVar.f19379g && this.f19380h == sVar.f19380h && Float.compare(sVar.f19381i, this.f19381i) == 0 && Float.compare(sVar.f19382j, this.f19382j) == 0;
    }

    /* renamed from: f */
    public long mo55793f() {
        return (long) this.f19378f;
    }

    /* renamed from: g */
    public long mo55794g() {
        return (long) this.f19379g;
    }

    /* renamed from: h */
    public long mo55795h() {
        return (long) this.f19380h;
    }

    public int hashCode() {
        int i = ((((((((((((((this.f19373a * 31) + this.f19374b) * 31) + this.f19375c) * 31) + this.f19376d) * 31) + (this.f19377e ? 1 : 0)) * 31) + this.f19378f) * 31) + this.f19379g) * 31) + this.f19380h) * 31;
        float f = this.f19381i;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f19382j;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i2;
    }

    /* renamed from: i */
    public float mo55797i() {
        return this.f19381i;
    }

    /* renamed from: j */
    public float mo55798j() {
        return this.f19382j;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f19373a + ", heightPercentOfScreen=" + this.f19374b + ", margin=" + this.f19375c + ", gravity=" + this.f19376d + ", tapToFade=" + this.f19377e + ", tapToFadeDurationMillis=" + this.f19378f + ", fadeInDurationMillis=" + this.f19379g + ", fadeOutDurationMillis=" + this.f19380h + ", fadeInDelay=" + this.f19381i + ", fadeOutDelay=" + this.f19382j + '}';
    }
}
