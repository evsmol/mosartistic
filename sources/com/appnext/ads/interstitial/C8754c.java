package com.appnext.ads.interstitial;

import com.appnext.core.C8917f;
import com.appnext.core.C8936p;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.HashMap;

/* renamed from: com.appnext.ads.interstitial.c */
public final class C8754c extends C8936p {

    /* renamed from: cn */
    private static C8754c f22213cn;

    /* renamed from: aQ */
    private String f22214aQ = ("https://cdn.appnext.com/tools/sdk/confign/interstitial/" + C8917f.m26942bi() + "/interstitial_config.txt");

    /* renamed from: aR */
    private HashMap<String, String> f22215aR = null;

    /* renamed from: K */
    public static synchronized C8754c m26528K() {
        C8754c cVar;
        synchronized (C8754c.class) {
            if (f22213cn == null) {
                f22213cn = new C8754c();
            }
            cVar = f22213cn;
        }
        return cVar;
    }

    private C8754c() {
    }

    /* access modifiers changed from: protected */
    public final String getUrl() {
        return this.f22214aQ;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final HashMap<String, String> mo58372n() {
        return this.f22215aR;
    }

    public final void setUrl(String str) {
        this.f22214aQ = str;
    }

    /* renamed from: a */
    public final void mo58370a(HashMap<String, String> hashMap) {
        this.f22215aR = hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final HashMap<String, String> mo58373o() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("creative", Interstitial.TYPE_MANAGED);
        hashMap.put("auto_play", "true");
        hashMap.put("mute", "false");
        hashMap.put("pview", "true");
        hashMap.put("min_internet_connection", "2g");
        hashMap.put("min_internet_connection_video", "3g");
        hashMap.put("urlApp_protection", "false");
        hashMap.put("can_close", "true");
        hashMap.put("video_length", "15");
        hashMap.put("button_text", "");
        hashMap.put("button_color", "");
        hashMap.put("skip_title", "");
        hashMap.put("remove_poster_on_auto_play", "true");
        hashMap.put("banner_expiration_time", BuildConfig.ADAPTER_VERSION);
        hashMap.put("show_rating", "true");
        hashMap.put("show_desc", "true");
        hashMap.put("new_button_text", "Install");
        hashMap.put("existing_button_text", "Open");
        hashMap.put("postpone_vta_sec", BuildConfig.ADAPTER_VERSION);
        hashMap.put("postpone_impression_sec", BuildConfig.ADAPTER_VERSION);
        hashMap.put("resolve_timeout", "8");
        hashMap.put("ads_caching_time_minutes", BuildConfig.ADAPTER_VERSION);
        hashMap.put("gdpr", "false");
        hashMap.put("clickType_A", BuildConfig.ADAPTER_VERSION);
        hashMap.put("didPrivacy", "false");
        hashMap.put("S1", "[{\"id\":\"multi\",\"p\":50},{\"id\":\"single\",\"p\":50}]");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }
}
