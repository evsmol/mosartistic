package com.appodeal.ads;

import kotlin.Metadata;

@Metadata(mo38198d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&¨\u0006\u0012"}, mo38199d2 = {"Lcom/appodeal/ads/RewardedVideoCallbacks;", "", "onRewardedVideoClicked", "", "onRewardedVideoClosed", "finished", "", "onRewardedVideoExpired", "onRewardedVideoFailedToLoad", "onRewardedVideoFinished", "amount", "", "currency", "", "onRewardedVideoLoaded", "isPrecache", "onRewardedVideoShowFailed", "onRewardedVideoShown", "apd_public"}, mo38200k = 1, mo38201mv = {1, 6, 0}, mo38203xi = 48)
public interface RewardedVideoCallbacks {
    void onRewardedVideoClicked();

    void onRewardedVideoClosed(boolean z);

    void onRewardedVideoExpired();

    void onRewardedVideoFailedToLoad();

    void onRewardedVideoFinished(double d, String str);

    void onRewardedVideoLoaded(boolean z);

    void onRewardedVideoShowFailed();

    void onRewardedVideoShown();
}
