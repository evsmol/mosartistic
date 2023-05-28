package com.applovin.impl.mediation.p235b;

import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p253b.C8377c;
import com.applovin.impl.sdk.p256e.C8452w;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.f */
public class C8127f extends C8452w {

    /* renamed from: a */
    private final C8072c f19802a;

    public C8127f(C8072c cVar, C8490n nVar) {
        super("TaskReportMaxReward", nVar);
        this.f19802a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo56284a() {
        return "2.0/mcr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56285a(int i) {
        super.mo56285a(i);
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57818b(str, "Failed to report reward for mediated ad: " + this.f19802a + " - error code: " + i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56286a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f19802a.getAdUnitId());
        JsonUtils.putString(jSONObject, IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f19802a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f19802a.mo56174ag());
        String I = this.f19802a.mo56122I();
        if (!StringUtils.isValidString(I)) {
            I = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", I);
        String H = this.f19802a.mo56121H();
        if (!StringUtils.isValidString(H)) {
            H = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", H);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C8377c mo56287b() {
        return this.f19802a.mo56125L();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo56288b(JSONObject jSONObject) {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57818b(str, "Reported reward successfully for mediated ad: " + this.f19802a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo56289c() {
        C8626v vVar = this.f21120d;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21120d;
            String str = this.f21119c;
            vVar2.mo57822e(str, "No reward result was found for mediated ad: " + this.f19802a);
        }
    }
}
