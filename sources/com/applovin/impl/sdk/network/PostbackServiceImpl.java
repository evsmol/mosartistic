package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8414g;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;

public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a */
    private final C8490n f21432a;

    public PostbackServiceImpl(C8490n nVar) {
        this.f21432a = nVar;
    }

    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(C8536i.m25907b(this.f21432a).mo57528a(str).mo57539c(false).mo57532a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(C8536i iVar, C8432o.C8434a aVar, AppLovinPostbackListener appLovinPostbackListener) {
        this.f21432a.mo57337V().mo57228a((C8401a) new C8414g(iVar, aVar, this.f21432a, appLovinPostbackListener), aVar);
    }

    public void dispatchPostbackRequest(C8536i iVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(iVar, C8432o.C8434a.POSTBACKS, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }
}
