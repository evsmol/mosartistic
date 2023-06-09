package com.ironsource.mediationsdk.sdk;

import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.g */
public interface C4677g {
    void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener);

    boolean isInterstitialReady(JSONObject jSONObject);

    void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener);

    void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener);
}
