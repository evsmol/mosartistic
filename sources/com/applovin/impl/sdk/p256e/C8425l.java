package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8346b;
import com.applovin.impl.sdk.p252ad.C8347c;
import com.applovin.impl.sdk.p252ad.C8349d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.e.l */
public class C8425l extends C8424k {

    /* renamed from: e */
    private final C8347c f21158e;

    public C8425l(C8347c cVar, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        super(C8349d.m25017a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", nVar);
        this.f21158e = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo57205a() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("adtoken", this.f21158e.mo56928a());
        map.put("adtoken_prefix", this.f21158e.mo56930c());
        return map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C8346b mo57210h() {
        return C8346b.REGULAR_AD_TOKEN;
    }
}
