package com.yandex.metrica.impl.p082ob;

import com.appodeal.ads.adapters.admob.BuildConfig;
import com.yandex.metrica.impl.p082ob.C2572Tl;

/* renamed from: com.yandex.metrica.impl.ob.Ig */
public class C2156Ig {

    /* renamed from: a */
    public final String f5757a;

    /* renamed from: b */
    public final String f5758b;
    @Deprecated

    /* renamed from: c */
    public final String f5759c;

    /* renamed from: d */
    public final String f5760d;

    /* renamed from: e */
    public final String f5761e;

    /* renamed from: f */
    public final String f5762f;

    /* renamed from: g */
    public final String f5763g;

    /* renamed from: h */
    public final String f5764h;

    /* renamed from: i */
    public final String f5765i;

    /* renamed from: j */
    public final String f5766j;

    /* renamed from: k */
    public final String f5767k;

    /* renamed from: l */
    public final String f5768l;

    /* renamed from: m */
    public final String f5769m;

    /* renamed from: n */
    public final String f5770n;

    /* renamed from: o */
    public final String f5771o;

    /* renamed from: p */
    public final String f5772p;

    public C2156Ig(C2572Tl.C2573a aVar) {
        String str;
        this.f5757a = aVar.mo16727c("dId");
        this.f5758b = aVar.mo16727c("uId");
        this.f5759c = aVar.mo16726b("kitVer");
        this.f5760d = aVar.mo16727c("analyticsSdkVersionName");
        this.f5761e = aVar.mo16727c("kitBuildNumber");
        this.f5762f = aVar.mo16727c("kitBuildType");
        this.f5763g = aVar.mo16727c("appVer");
        this.f5764h = aVar.optString("app_debuggable", BuildConfig.ADAPTER_VERSION);
        this.f5765i = aVar.mo16727c("appBuild");
        this.f5766j = aVar.mo16727c("osVer");
        this.f5768l = aVar.mo16727c("lang");
        this.f5769m = aVar.mo16727c("root");
        this.f5772p = aVar.mo16727c("commit_hash");
        this.f5770n = aVar.optString("app_framework", C3015h2.m9657a());
        int optInt = aVar.optInt("osApiLev", -1);
        String str2 = null;
        if (optInt == -1) {
            str = null;
        } else {
            str = String.valueOf(optInt);
        }
        this.f5767k = str;
        int optInt2 = aVar.optInt("attribution_id", 0);
        this.f5771o = optInt2 > 0 ? String.valueOf(optInt2) : str2;
    }

    public String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.f5757a + '\'' + ", uuid='" + this.f5758b + '\'' + ", kitVersion='" + this.f5759c + '\'' + ", analyticsSdkVersionName='" + this.f5760d + '\'' + ", kitBuildNumber='" + this.f5761e + '\'' + ", kitBuildType='" + this.f5762f + '\'' + ", appVersion='" + this.f5763g + '\'' + ", appDebuggable='" + this.f5764h + '\'' + ", appBuildNumber='" + this.f5765i + '\'' + ", osVersion='" + this.f5766j + '\'' + ", osApiLevel='" + this.f5767k + '\'' + ", locale='" + this.f5768l + '\'' + ", deviceRootStatus='" + this.f5769m + '\'' + ", appFramework='" + this.f5770n + '\'' + ", attributionId='" + this.f5771o + '\'' + ", commitHash='" + this.f5772p + '\'' + '}';
    }

    public C2156Ig() {
        this.f5757a = null;
        this.f5758b = null;
        this.f5759c = null;
        this.f5760d = null;
        this.f5761e = null;
        this.f5762f = null;
        this.f5763g = null;
        this.f5764h = null;
        this.f5765i = null;
        this.f5766j = null;
        this.f5767k = null;
        this.f5768l = null;
        this.f5769m = null;
        this.f5770n = null;
        this.f5771o = null;
        this.f5772p = null;
    }
}
