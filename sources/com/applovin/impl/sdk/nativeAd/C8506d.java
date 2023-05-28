package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.d */
public class C8506d extends C8401a {

    /* renamed from: a */
    private final JSONObject f21408a;

    /* renamed from: e */
    private final AppLovinNativeAdLoadListener f21409e;

    public C8506d(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C8490n nVar) {
        super("TaskProcessNativeAdResponse", nVar);
        this.f21408a = jSONObject;
        this.f21409e = appLovinNativeAdLoadListener;
    }

    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f21408a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57818b(this.f21119c, "Processing ad...");
            }
            this.f21118b.mo57337V().mo57227a((C8401a) new C8507e(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f21408a, this.f21409e, this.f21118b));
            return;
        }
        C8626v vVar2 = this.f21120d;
        if (C8626v.m26252a()) {
            this.f21120d.mo57821d(this.f21119c, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher("native_native", MaxAdFormat.NATIVE, this.f21408a, this.f21118b);
        this.f21409e.onNativeAdLoadFailed(204);
    }
}
