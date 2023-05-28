package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p253b.C8377c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.aa */
public class C8402aa extends C8403ab {

    /* renamed from: a */
    private final C8350e f21122a;

    /* renamed from: e */
    private final AppLovinAdRewardListener f21123e;

    public C8402aa(C8350e eVar, AppLovinAdRewardListener appLovinAdRewardListener, C8490n nVar) {
        super("TaskValidateAppLovinReward", nVar);
        this.f21122a = eVar;
        this.f21123e = appLovinAdRewardListener;
    }

    /* renamed from: a */
    public String mo56284a() {
        return "2.0/vr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56285a(int i) {
        String str;
        super.mo56285a(i);
        if (i < 400 || i >= 500) {
            this.f21123e.validationRequestFailed(this.f21122a, i);
            str = "network_timeout";
        } else {
            this.f21123e.userRewardRejected(this.f21122a, Collections.emptyMap());
            str = "rejected";
        }
        this.f21122a.mo56972a(C8377c.m25184a(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56290a(C8377c cVar) {
        this.f21122a.mo56972a(cVar);
        String b = cVar.mo57078b();
        Map<String, String> a = cVar.mo57077a();
        if (b.equals("accepted")) {
            this.f21123e.userRewardVerified(this.f21122a, a);
        } else if (b.equals("quota_exceeded")) {
            this.f21123e.userOverQuota(this.f21122a, a);
        } else if (b.equals("rejected")) {
            this.f21123e.userRewardRejected(this.f21122a, a);
        } else {
            this.f21123e.validationRequestFailed(this.f21122a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56286a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f21122a.getAdZone().mo56936a());
        String clCode = this.f21122a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo56291b() {
        return this.f21122a.mo56978aE();
    }
}
