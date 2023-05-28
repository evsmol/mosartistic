package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8349d;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8417h;
import com.applovin.impl.sdk.utils.C8572i;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.c */
public class C8505c extends C8417h {

    /* renamed from: e */
    private final AppLovinNativeAdLoadListener f21407e;

    public C8505c(C8349d dVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C8490n nVar) {
        super(dVar, str, nVar);
        this.f21407e = appLovinNativeAdLoadListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8401a mo57204a(JSONObject jSONObject) {
        return new C8506d(jSONObject, this.f21407e, this.f21118b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo57206a(int i) {
        super.mo57206a(i);
        this.f21407e.onNativeAdLoadFailed(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo57207b() {
        return C8572i.m26114i(this.f21118b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo57209c() {
        return C8572i.m26115j(this.f21118b);
    }
}
