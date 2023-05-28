package com.applovin.impl.p225a.p226a.p227a;

import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.appodeal.ads.modules.common.internal.LogConstants;

/* renamed from: com.applovin.impl.a.a.a.a */
public class C7878a {

    /* renamed from: a */
    private final long f18998a;

    /* renamed from: b */
    private final Object f18999b;

    /* renamed from: c */
    private String f19000c;

    /* renamed from: d */
    private String f19001d;

    public C7878a(Object obj, long j) {
        String networkName;
        this.f18999b = obj;
        this.f18998a = j;
        String str = null;
        if (obj instanceof C8350e) {
            C8350e eVar = (C8350e) obj;
            this.f19000c = eVar.getAdZone().mo56937b() != null ? eVar.getAdZone().mo56937b().getLabel() : str;
            networkName = "AppLovin";
        } else if (obj instanceof C8070a) {
            C8070a aVar = (C8070a) obj;
            this.f19000c = aVar.getFormat() != null ? aVar.getFormat().getLabel() : str;
            networkName = aVar.getNetworkName();
        } else {
            return;
        }
        this.f19001d = networkName;
    }

    /* renamed from: a */
    public String mo55466a() {
        String str = this.f19000c;
        return str != null ? str : LogConstants.KEY_UNKNOWN;
    }

    /* renamed from: b */
    public String mo55467b() {
        String str = this.f19001d;
        return str != null ? str : LogConstants.KEY_UNKNOWN;
    }

    /* renamed from: c */
    public Object mo55468c() {
        return this.f18999b;
    }

    /* renamed from: d */
    public long mo55469d() {
        return this.f18998a;
    }
}
