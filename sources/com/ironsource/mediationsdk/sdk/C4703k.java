package com.ironsource.mediationsdk.sdk;

import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.k */
public interface C4703k {
    void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);

    boolean isRewardedVideoAvailable(JSONObject jSONObject);

    void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);
}
