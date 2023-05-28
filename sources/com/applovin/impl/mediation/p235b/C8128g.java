package com.applovin.impl.mediation.p235b;

import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p253b.C8377c;
import com.applovin.impl.sdk.p256e.C8403ab;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.g */
public class C8128g extends C8403ab {

    /* renamed from: a */
    private final C8072c f19803a;

    public C8128g(C8072c cVar, C8490n nVar) {
        super("TaskValidateMaxReward", nVar);
        this.f19803a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo56284a() {
        return "2.0/mvr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56285a(int i) {
        super.mo56285a(i);
        this.f19803a.mo56128a(C8377c.m25184a((i < 400 || i >= 500) ? "network_timeout" : "rejected"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56290a(C8377c cVar) {
        this.f19803a.mo56128a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56286a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f19803a.getAdUnitId());
        JsonUtils.putString(jSONObject, IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f19803a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f19803a.mo56174ag());
        JsonUtils.putString(jSONObject, "ad_format", this.f19803a.getFormat().getLabel());
        String I = this.f19803a.mo56122I();
        if (!StringUtils.isValidString(I)) {
            I = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", I);
        String H = this.f19803a.mo56121H();
        if (!StringUtils.isValidString(H)) {
            H = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", H);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo56291b() {
        return this.f19803a.mo56123J();
    }
}
