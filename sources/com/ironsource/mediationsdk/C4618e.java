package com.ironsource.mediationsdk;

import com.applovin.sdk.AppLovinMediationProvider;
import com.appodeal.ads.AppodealNetworks;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.e */
public final class C4618e {

    /* renamed from: c */
    private static final C4618e f11411c = new C4618e();

    /* renamed from: a */
    final ConcurrentHashMap<String, String> f11412a;

    /* renamed from: b */
    final ConcurrentHashMap<String, String> f11413b;

    private C4618e() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        this.f11412a = concurrentHashMap;
        concurrentHashMap.put("adcolony", "4.1.6");
        this.f11412a.put(AppodealNetworks.VUNGLE, "4.1.5");
        this.f11412a.put(AppodealNetworks.APPLOVIN, "4.3.3");
        this.f11412a.put("admob", "4.3.2");
        ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.f11413b = concurrentHashMap2;
        concurrentHashMap2.put("adcolony", "4.1.6");
        this.f11413b.put("admob", "4.3.2");
        this.f11413b.put(AppodealNetworks.APPLOVIN, "4.3.3");
        this.f11413b.put("chartboost", "4.1.9");
        this.f11413b.put(AppLovinMediationProvider.FYBER, "4.1.0");
        this.f11413b.put("hyprmx", "4.1.2");
        this.f11413b.put("inmobi", "4.3.1");
        this.f11413b.put("maio", "4.1.3");
        this.f11413b.put("tapjoy", "4.0.0");
        this.f11413b.put("unityads", "4.1.4");
        this.f11413b.put(AppodealNetworks.VUNGLE, "4.1.5");
    }

    /* renamed from: a */
    public static C4618e m13521a() {
        return f11411c;
    }

    /* renamed from: a */
    private static boolean m13522a(String str, String str2) {
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i = 0; i < 3; i++) {
            int parseInt = Integer.parseInt(split[i]);
            int parseInt2 = Integer.parseInt(split2[i]);
            if (parseInt2 < parseInt) {
                return false;
            }
            if (parseInt2 > parseInt) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo33899a(AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return false;
        }
        String version = abstractAdapter.getVersion();
        boolean a = m13522a("4.3.0", version);
        if (!a) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + ", please update your adapter to the latest version", 3);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo33900a(AbstractAdapter abstractAdapter, Map<String, String> map, String str) {
        if (abstractAdapter == null) {
            return false;
        }
        String lowerCase = abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH);
        if (!map.containsKey(lowerCase)) {
            return true;
        }
        String version = abstractAdapter.getVersion();
        boolean a = m13522a(map.get(lowerCase), version);
        if (!a) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + " for " + str + " ad unit, please update your adapter to the latest version", 3);
        }
        return a;
    }
}
