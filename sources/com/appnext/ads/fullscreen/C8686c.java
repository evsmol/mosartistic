package com.appnext.ads.fullscreen;

import com.appnext.core.C8917f;
import com.appnext.core.C8936p;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.HashMap;

/* renamed from: com.appnext.ads.fullscreen.c */
public final class C8686c extends C8936p {

    /* renamed from: aP */
    private static C8686c f22082aP;

    /* renamed from: aQ */
    private String f22083aQ = ("https://cdn.appnext.com/tools/sdk/confign/fullscreen/" + C8917f.m26942bi() + "/fullscreen_config.txt");

    /* renamed from: aR */
    private HashMap<String, String> f22084aR = null;

    /* renamed from: m */
    public static synchronized C8686c m26400m() {
        C8686c cVar;
        synchronized (C8686c.class) {
            if (f22082aP == null) {
                f22082aP = new C8686c();
            }
            cVar = f22082aP;
        }
        return cVar;
    }

    private C8686c() {
    }

    /* access modifiers changed from: protected */
    public final String getUrl() {
        return this.f22083aQ;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final HashMap<String, String> mo58372n() {
        return this.f22084aR;
    }

    public final void setUrl(String str) {
        this.f22083aQ = str;
    }

    /* renamed from: a */
    public final void mo58370a(HashMap<String, String> hashMap) {
        this.f22084aR = hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final HashMap<String, String> mo58373o() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("can_close", "true");
        hashMap.put("show_close", "true");
        hashMap.put("show_close_time", "2000");
        hashMap.put("video_length", "15");
        hashMap.put("mute", "false");
        hashMap.put("urlApp_protection", "false");
        hashMap.put("pview", "true");
        hashMap.put("min_internet_connection_video", "3g");
        hashMap.put("banner_expiration_time", BuildConfig.ADAPTER_VERSION);
        hashMap.put("postpone_vta_sec", BuildConfig.ADAPTER_VERSION);
        hashMap.put("postpone_impression_sec", BuildConfig.ADAPTER_VERSION);
        hashMap.put("resolve_timeout", "8");
        hashMap.put("num_saved_videos", "5");
        hashMap.put("caption_text_time", "3");
        hashMap.put("ads_caching_time_minutes", BuildConfig.ADAPTER_VERSION);
        hashMap.put("gdpr", "false");
        hashMap.put("clickType_a", BuildConfig.ADAPTER_VERSION);
        hashMap.put("clickType_b", BuildConfig.ADAPTER_VERSION);
        hashMap.put("didPrivacy", "false");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }
}
