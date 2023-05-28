package com.appodeal.ads.adapters.bidmachine.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import p150io.bidmachine.rewarded.RewardedAd;
import p150io.bidmachine.rewarded.RewardedListener;
import p150io.bidmachine.rewarded.RewardedRequest;
import p150io.bidmachine.utils.BMError;

/* renamed from: com.appodeal.ads.adapters.bidmachine.rewarded_video.a */
/* compiled from: BidMachineRewarded */
public final class C9052a extends UnifiedRewarded<BidMachineNetwork.RequestParams> {

    /* renamed from: a */
    public RewardedRequest f22865a;

    /* renamed from: b */
    public RewardedAd f22866b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.rewarded_video.a$a */
    /* compiled from: BidMachineRewarded */
    public static class C9053a implements RewardedListener {

        /* renamed from: a */
        public final UnifiedRewardedCallback f22867a;

        public C9053a(UnifiedRewardedCallback unifiedRewardedCallback) {
            this.f22867a = unifiedRewardedCallback;
        }

        public final void onAdClicked(IAd iAd) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            this.f22867a.onAdClicked();
        }

        public final void onAdClosed(IAd iAd, boolean z) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            this.f22867a.onAdClosed();
        }

        public final void onAdExpired(IAd iAd) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            this.f22867a.onAdExpired();
        }

        public final void onAdImpression(IAd iAd) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            this.f22867a.onAdShown();
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            BidMachineNetwork.printError(this.f22867a, bMError);
            this.f22867a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            this.f22867a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(((RewardedAd) iAd).getAuctionResult()));
            this.f22867a.onAdLoaded();
        }

        public final void onAdRewarded(IAd iAd) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            this.f22867a.onAdFinished();
        }

        public final void onAdShowFailed(IAd iAd, BMError bMError) {
            RewardedAd rewardedAd = (RewardedAd) iAd;
            BidMachineNetwork.printError(this.f22867a, bMError);
            this.f22867a.onAdShowFailed();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedRewardedParams unifiedRewardedParams = (UnifiedRewardedParams) unifiedAdParams;
        this.f22865a = (RewardedRequest) ((RewardedRequest.Builder) ((BidMachineNetwork.RequestParams) obj).prepareRequest(new RewardedRequest.Builder())).build();
        this.f22866b = (RewardedAd) ((RewardedAd) new RewardedAd(contextProvider.getApplicationContext()).setListener(new C9053a((UnifiedRewardedCallback) unifiedAdCallback))).load(this.f22865a);
    }

    public final void onDestroy() {
        RewardedRequest rewardedRequest = this.f22865a;
        if (rewardedRequest != null) {
            rewardedRequest.destroy();
            this.f22865a = null;
        }
        RewardedAd rewardedAd = this.f22866b;
        if (rewardedAd != null) {
            rewardedAd.destroy();
            this.f22866b = null;
        }
    }

    public final void onMediationLoss(String str, double d) {
        super.onMediationLoss(str, d);
        RewardedRequest rewardedRequest = this.f22865a;
        if (rewardedRequest != null) {
            rewardedRequest.notifyMediationLoss(str, Double.valueOf(d));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        RewardedRequest rewardedRequest = this.f22865a;
        if (rewardedRequest != null) {
            rewardedRequest.notifyMediationWin();
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        RewardedAd rewardedAd = this.f22866b;
        if (rewardedAd == null || !rewardedAd.canShow()) {
            unifiedRewardedCallback.onAdShowFailed();
        } else {
            this.f22866b.show();
        }
    }
}
