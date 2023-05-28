package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8346b;
import com.applovin.impl.sdk.p252ad.C8349d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.e.j */
public class C8423j extends C8424k {

    /* renamed from: e */
    private final List<String> f21156e;

    public C8423j(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, C8490n nVar) {
        super(C8349d.m25017a(m25395a(list)), appLovinAdLoadListener, "TaskFetchMultizoneAd", nVar);
        this.f21156e = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    private static String m25395a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        throw new IllegalArgumentException("No zone identifiers specified");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo57205a() {
        Map<String, String> map = CollectionUtils.map(1);
        List<String> list = this.f21156e;
        map.put("zone_ids", CollectionUtils.implode(list, list.size()));
        return map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C8346b mo57210h() {
        return C8346b.APPLOVIN_MULTIZONE;
    }
}
