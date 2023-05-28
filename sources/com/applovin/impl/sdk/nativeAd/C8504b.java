package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8347c;
import com.applovin.impl.sdk.p252ad.C8349d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.nativeAd.b */
public class C8504b extends C8505c {

    /* renamed from: e */
    private final C8347c f21406e;

    public C8504b(C8347c cVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C8490n nVar) {
        super(C8349d.m25017a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, nVar);
        this.f21406e = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo57205a() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("adtoken", this.f21406e.mo56928a());
        map.put("adtoken_prefix", this.f21406e.mo56930c());
        return map;
    }
}
