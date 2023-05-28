package com.appnext.ads.fullscreen;

import com.appnext.core.C8917f;
import com.appnext.core.C8936p;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.HashMap;

/* renamed from: com.appnext.ads.fullscreen.f */
public final class C8704f extends C8936p {

    /* renamed from: bt */
    private static C8704f f22125bt;

    /* renamed from: aQ */
    private String f22126aQ = ("https://cdn.appnext.com/tools/sdk/confign/rewarded/" + C8917f.m26942bi() + "/rewarded_config.txt");

    /* renamed from: aR */
    private HashMap<String, String> f22127aR = null;

    /* renamed from: q */
    public static synchronized C8704f m26418q() {
        C8704f fVar;
        synchronized (C8704f.class) {
            if (f22125bt == null) {
                f22125bt = new C8704f();
            }
            fVar = f22125bt;
        }
        return fVar;
    }

    private C8704f() {
    }

    /* access modifiers changed from: protected */
    public final String getUrl() {
        return this.f22126aQ;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final HashMap<String, String> mo58372n() {
        return this.f22127aR;
    }

    public final void setUrl(String str) {
        this.f22126aQ = str;
    }

    /* renamed from: a */
    public final void mo58370a(HashMap<String, String> hashMap) {
        this.f22127aR = hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final HashMap<String, String> mo58373o() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("can_close", "true");
        hashMap.put("show_close", "false");
        hashMap.put("video_length", "15");
        hashMap.put("mute", "false");
        hashMap.put("urlApp_protection", "false");
        hashMap.put("pview", "true");
        hashMap.put("min_internet_connection_video", "3g");
        hashMap.put("banner_expiration_time", BuildConfig.ADAPTER_VERSION);
        hashMap.put("default_mode", "normal");
        hashMap.put("postpone_vta_sec", BuildConfig.ADAPTER_VERSION);
        hashMap.put("postpone_impression_sec", BuildConfig.ADAPTER_VERSION);
        hashMap.put("resolve_timeout", "8");
        hashMap.put("num_saved_videos", "5");
        hashMap.put("caption_text_time", "3");
        hashMap.put("pre_title_string1", "Which Ad");
        hashMap.put("pre_title_string2", "Would you like to watch?");
        hashMap.put("pre_cta_string", "Play this ad");
        hashMap.put("ads_caching_time_minutes", BuildConfig.ADAPTER_VERSION);
        hashMap.put("gdpr", "false");
        hashMap.put("clickType_a", BuildConfig.ADAPTER_VERSION);
        hashMap.put("clickType_b", BuildConfig.ADAPTER_VERSION);
        hashMap.put("didPrivacy", "false");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }
}
