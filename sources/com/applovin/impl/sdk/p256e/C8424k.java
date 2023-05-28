package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8349d;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.k */
public class C8424k extends C8417h {

    /* renamed from: e */
    private final AppLovinAdLoadListener f21157e;

    public C8424k(C8349d dVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        this(dVar, appLovinAdLoadListener, "TaskFetchNextAd", nVar);
    }

    public C8424k(C8349d dVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, C8490n nVar) {
        super(dVar, str, nVar);
        this.f21157e = appLovinAdLoadListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8401a mo57204a(JSONObject jSONObject) {
        return new C8438p(jSONObject, this.f21148a, mo57210h(), this.f21157e, this.f21118b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo57206a(int i) {
        super.mo57206a(i);
        this.f21157e.failedToReceiveAd(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo57207b() {
        return C8572i.m26112g(this.f21118b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo57209c() {
        return C8572i.m26113h(this.f21118b);
    }
}
