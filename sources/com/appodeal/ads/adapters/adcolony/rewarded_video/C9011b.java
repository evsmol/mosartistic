package com.appodeal.ads.adapters.adcolony.rewarded_video;

import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;

/* renamed from: com.appodeal.ads.adapters.adcolony.rewarded_video.b */
public final class C9011b extends AdColonyInterstitialListener implements AdColonyRewardListener {

    /* renamed from: a */
    public final UnifiedRewardedCallback f22793a;

    /* renamed from: b */
    public final C9010a f22794b;

    public C9011b(UnifiedRewardedCallback unifiedRewardedCallback, C9010a aVar) {
        this.f22793a = unifiedRewardedCallback;
        this.f22794b = aVar;
    }

    public final void onClicked(AdColonyInterstitial adColonyInterstitial) {
        this.f22793a.onAdClicked();
    }

    public final void onClosed(AdColonyInterstitial adColonyInterstitial) {
        this.f22793a.onAdClosed();
    }

    public final void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        this.f22793a.onAdExpired();
    }

    public final void onOpened(AdColonyInterstitial adColonyInterstitial) {
        this.f22793a.onAdShown();
    }

    public final void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
        this.f22794b.f22791a = adColonyInterstitial;
        this.f22793a.onAdLoaded();
    }

    public final void onRequestNotFilled(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            UnifiedRewardedCallback unifiedRewardedCallback = this.f22793a;
            unifiedRewardedCallback.printError("request not filled for zoneId: " + adColonyZone.getZoneID() + ", isValid zone: " + adColonyZone.isValid(), (Object) null);
        }
        this.f22793a.onAdLoadFailed(LoadingError.NoFill);
    }

    public final void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward == null || adColonyReward.success()) {
            this.f22793a.onAdFinished();
        }
    }
}
