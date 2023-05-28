package com.appodeal.ads;

/* renamed from: com.appodeal.ads.h */
public final class C9202h implements AdNetworkMediationParams {

    /* renamed from: a */
    public C9420r f23134a;

    /* renamed from: b */
    public final RestrictedData f23135b;

    public C9202h(C9420r rVar, C9234j4 j4Var) {
        this.f23134a = rVar;
        this.f23135b = j4Var;
    }

    public final String getAppName() {
        return C9217i0.f23171a;
    }

    public final String getImpressionId() {
        return this.f23134a.f23903r;
    }

    public final RestrictedData getRestrictedData() {
        return this.f23135b;
    }

    public final String getStoreUrl() {
        return C9217i0.f23172b;
    }

    public final boolean isCoronaApp() {
        return C9217i0.f23173c;
    }

    public final boolean isTestMode() {
        return C9422r0.f23913b;
    }
}
