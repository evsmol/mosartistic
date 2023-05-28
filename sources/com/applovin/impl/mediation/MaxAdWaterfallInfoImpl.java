package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a */
    private final C8070a f19525a;

    /* renamed from: b */
    private final String f19526b;

    /* renamed from: c */
    private final String f19527c;

    /* renamed from: d */
    private final List<MaxNetworkResponseInfo> f19528d;

    /* renamed from: e */
    private final long f19529e;

    public MaxAdWaterfallInfoImpl(C8070a aVar, long j, List<MaxNetworkResponseInfo> list) {
        this(aVar, aVar.mo56097q(), aVar.mo56098r(), j, list);
    }

    public MaxAdWaterfallInfoImpl(C8070a aVar, String str, String str2, long j, List<MaxNetworkResponseInfo> list) {
        this.f19525a = aVar;
        this.f19526b = str;
        this.f19527c = str2;
        this.f19528d = list;
        this.f19529e = j;
    }

    public long getLatencyMillis() {
        return this.f19529e;
    }

    public MaxAd getLoadedAd() {
        return this.f19525a;
    }

    public String getName() {
        return this.f19526b;
    }

    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f19528d;
    }

    public String getTestName() {
        return this.f19527c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f19526b + ", testName=" + this.f19527c + ", networkResponses=" + this.f19528d + ", latencyMillis=" + this.f19529e + '}';
    }
}
