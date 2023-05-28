package com.bytedance.sdk.openadsdk.p039f.p040a;

import com.bytedance.sdk.component.p293a.C10224e;
import com.bytedance.sdk.component.p293a.C10225f;
import com.bytedance.sdk.component.p293a.C10245r;
import com.bytedance.sdk.openadsdk.core.C0709w;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.e */
/* compiled from: OldBridgeSyncMethod */
public class C0783e extends C10224e<JSONObject, JSONObject> {

    /* renamed from: a */
    private String f2952a;

    /* renamed from: b */
    private C0709w f2953b;

    public C0783e(String str, C0709w wVar) {
        this.f2953b = wVar;
        this.f2952a = str;
    }

    /* renamed from: a */
    public static void m3926a(C10245r rVar, C0709w wVar) {
        rVar.mo63072a("appInfo", (C10224e<?, ?>) new C0783e("appInfo", wVar));
        rVar.mo63072a("adInfo", (C10224e<?, ?>) new C0783e("adInfo", wVar));
        rVar.mo63072a("sendLog", (C10224e<?, ?>) new C0783e("sendLog", wVar));
        rVar.mo63072a("playable_style", (C10224e<?, ?>) new C0783e("playable_style", wVar));
        rVar.mo63072a("getTemplateInfo", (C10224e<?, ?>) new C0783e("getTemplateInfo", wVar));
        rVar.mo63072a("getTeMaiAds", (C10224e<?, ?>) new C0783e("getTeMaiAds", wVar));
        rVar.mo63072a("isViewable", (C10224e<?, ?>) new C0783e("isViewable", wVar));
        rVar.mo63072a("getScreenSize", (C10224e<?, ?>) new C0783e("getScreenSize", wVar));
        rVar.mo63072a("getCloseButtonInfo", (C10224e<?, ?>) new C0783e("getCloseButtonInfo", wVar));
        rVar.mo63072a("getVolume", (C10224e<?, ?>) new C0783e("getVolume", wVar));
        rVar.mo63072a("removeLoading", (C10224e<?, ?>) new C0783e("removeLoading", wVar));
        rVar.mo63072a("sendReward", (C10224e<?, ?>) new C0783e("sendReward", wVar));
        rVar.mo63072a("subscribe_app_ad", (C10224e<?, ?>) new C0783e("subscribe_app_ad", wVar));
        rVar.mo63072a("download_app_ad", (C10224e<?, ?>) new C0783e("download_app_ad", wVar));
        rVar.mo63072a("cancel_download_app_ad", (C10224e<?, ?>) new C0783e("cancel_download_app_ad", wVar));
        rVar.mo63072a("unsubscribe_app_ad", (C10224e<?, ?>) new C0783e("unsubscribe_app_ad", wVar));
        rVar.mo63072a("landscape_click", (C10224e<?, ?>) new C0783e("landscape_click", wVar));
        rVar.mo63072a("clickEvent", (C10224e<?, ?>) new C0783e("clickEvent", wVar));
        rVar.mo63072a("renderDidFinish", (C10224e<?, ?>) new C0783e("renderDidFinish", wVar));
        rVar.mo63072a("dynamicTrack", (C10224e<?, ?>) new C0783e("dynamicTrack", wVar));
        rVar.mo63072a("skipVideo", (C10224e<?, ?>) new C0783e("skipVideo", wVar));
        rVar.mo63072a("muteVideo", (C10224e<?, ?>) new C0783e("muteVideo", wVar));
        rVar.mo63072a("changeVideoState", (C10224e<?, ?>) new C0783e("changeVideoState", wVar));
        rVar.mo63072a("getCurrentVideoState", (C10224e<?, ?>) new C0783e("getCurrentVideoState", wVar));
        rVar.mo63072a("send_temai_product_ids", (C10224e<?, ?>) new C0783e("send_temai_product_ids", wVar));
        rVar.mo63072a("getMaterialMeta", (C10224e<?, ?>) new C0783e("getMaterialMeta", wVar));
        rVar.mo63072a("endcard_load", (C10224e<?, ?>) new C0783e("endcard_load", wVar));
        rVar.mo63072a("pauseWebView", (C10224e<?, ?>) new C0783e("pauseWebView", wVar));
        rVar.mo63072a("pauseWebViewTimers", (C10224e<?, ?>) new C0783e("pauseWebViewTimers", wVar));
        rVar.mo63072a("webview_time_track", (C10224e<?, ?>) new C0783e("webview_time_track", wVar));
        rVar.mo63072a("openPrivacy", (C10224e<?, ?>) new C0783e("openPrivacy", wVar));
        rVar.mo63072a("openAdLandPageLinks", (C10224e<?, ?>) new C0783e("openAdLandPageLinks", wVar));
        rVar.mo63072a("getNativeSiteCustomData", (C10224e<?, ?>) new C0783e("getNativeSiteCustomData", wVar));
        rVar.mo63072a("close", (C10224e<?, ?>) new C0783e("close", wVar));
    }

    /* renamed from: a */
    public JSONObject mo216a(JSONObject jSONObject, C10225f fVar) throws Exception {
        while (true) {
            char c = '^';
            char c2 = '}';
            while (true) {
                switch (c) {
                    case '^':
                        break;
                    case '_':
                        switch (c2) {
                            case '^':
                            case '`':
                                break;
                            case '_':
                                C0709w.C0719a aVar = new C0709w.C0719a();
                                aVar.f2714a = "call";
                                aVar.f2716c = this.f2952a;
                                aVar.f2717d = jSONObject;
                                return this.f2953b.mo2357a(aVar, 3);
                        }
                    case '`':
                        switch (c2) {
                            case '7':
                            case '8':
                            case '9':
                                continue;
                        }
                }
                c = '_';
                c2 = '_';
            }
        }
    }
}
