package com.appnext.banners;

import com.appnext.core.C8917f;
import com.appnext.core.C8936p;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.HashMap;

/* renamed from: com.appnext.banners.d */
public final class C8809d extends C8936p {

    /* renamed from: df */
    private static C8809d f22308df;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final HashMap<String, String> mo58372n() {
        return null;
    }

    /* renamed from: S */
    public static synchronized C8809d m26560S() {
        C8809d dVar;
        synchronized (C8809d.class) {
            if (f22308df == null) {
                f22308df = new C8809d();
            }
            dVar = f22308df;
        }
        return dVar;
    }

    private C8809d() {
    }

    /* access modifiers changed from: protected */
    public final String getUrl() {
        return "https://cdn.appnext.com/tools/sdk/confign/banner/" + C8917f.m26942bi() + "/banner_config.txt";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final HashMap<String, String> mo58373o() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("urlApp_protection", "true");
        hashMap.put("resolve_timeout", "8");
        hashMap.put("postpone_impression_sec", BuildConfig.ADAPTER_VERSION);
        hashMap.put("postpone_vta_sec", BuildConfig.ADAPTER_VERSION);
        hashMap.put("pview", "true");
        hashMap.put("banner_expiration_time", BuildConfig.ADAPTER_VERSION);
        hashMap.put("ads_caching_time_minutes", BuildConfig.ADAPTER_VERSION);
        hashMap.put("new_button_text", "Install");
        hashMap.put("existing_button_text", "Open");
        hashMap.put("gdpr", "false");
        hashMap.put("BANNER_cpiActiveFlow", "d");
        hashMap.put("BANNER_cpcActiveFlow", "b");
        hashMap.put("LARGE_BANNER_cpiActiveFlow", "d");
        hashMap.put("LARGE_BANNER_cpcActiveFlow", "b");
        hashMap.put("MEDIUM_RECTANGLE_cpiActiveFlow", "d");
        hashMap.put("MEDIUM_RECTANGLE_cpcActiveFlow", "b");
        hashMap.put("didPrivacy", "false");
        hashMap.put("impOne", "true");
        hashMap.put("_arFlag", "true");
        hashMap.put("banner_ar", "10");
        hashMap.put("large_banner_ar", "10");
        hashMap.put("medium_rectangle_ar", "10");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }
}
