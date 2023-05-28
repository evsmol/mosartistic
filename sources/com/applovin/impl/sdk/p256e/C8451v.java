package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p253b.C8377c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.v */
public class C8451v extends C8452w {

    /* renamed from: a */
    private final C8350e f21230a;

    public C8451v(C8350e eVar, C8490n nVar) {
        super("TaskReportAppLovinReward", nVar);
        this.f21230a = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo56284a() {
        return "2.0/cr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56285a(int i) {
        super.mo56285a(i);
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57822e(str, "Failed to report reward for ad: " + this.f21230a + " - error code: " + i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56286a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f21230a.getAdZone().mo56936a());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f21230a.mo56990ae());
        String clCode = this.f21230a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C8377c mo56287b() {
        return this.f21230a.mo56980aG();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo56288b(JSONObject jSONObject) {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57818b(str, "Reported reward successfully for ad: " + this.f21230a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo56289c() {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57822e(str, "No reward result was found for ad: " + this.f21230a);
        }
    }
}
