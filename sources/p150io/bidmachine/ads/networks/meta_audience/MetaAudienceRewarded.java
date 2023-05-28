package p150io.bidmachine.ads.networks.meta_audience;

import com.facebook.ads.C1715Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.unified.UnifiedFullscreenAd;
import p150io.bidmachine.unified.UnifiedFullscreenAdCallback;
import p150io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.meta_audience.MetaAudienceRewarded */
class MetaAudienceRewarded extends UnifiedFullscreenAd {
    private Listener listener;
    private RewardedVideoAd rewardedVideoAd;

    MetaAudienceRewarded() {
    }

    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        MetaAudienceParams metaAudienceParams = new MetaAudienceParams(unifiedMediationParams);
        if (metaAudienceParams.isValid(unifiedFullscreenAdCallback)) {
            this.listener = new Listener(unifiedFullscreenAdCallback);
            RewardedVideoAd rewardedVideoAd2 = new RewardedVideoAd(contextProvider.getContext(), metaAudienceParams.placementId);
            this.rewardedVideoAd = rewardedVideoAd2;
            rewardedVideoAd2.loadAd(rewardedVideoAd2.buildLoadAdConfig().withAdListener(this.listener).withBid(metaAudienceParams.bidPayload).withFailOnCacheFailureEnabled(false).build());
        }
    }

    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        RewardedVideoAd rewardedVideoAd2 = this.rewardedVideoAd;
        if (rewardedVideoAd2 == null || !rewardedVideoAd2.isAdLoaded() || this.rewardedVideoAd.isAdInvalidated()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Rewarded object is null or not loaded or invalidated"));
        } else {
            this.rewardedVideoAd.show();
        }
    }

    public void onDestroy() {
        this.listener = null;
        RewardedVideoAd rewardedVideoAd2 = this.rewardedVideoAd;
        if (rewardedVideoAd2 != null) {
            rewardedVideoAd2.destroy();
            this.rewardedVideoAd = null;
        }
    }

    /* renamed from: io.bidmachine.ads.networks.meta_audience.MetaAudienceRewarded$Listener */
    private static final class Listener extends BaseMetaAudienceListener<UnifiedFullscreenAdCallback> implements RewardedVideoAdListener {
        Listener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
            super(unifiedFullscreenAdCallback);
        }

        public void onAdLoaded(C1715Ad ad) {
            ((UnifiedFullscreenAdCallback) getCallback()).onAdLoaded();
        }

        public void onLoggingImpression(C1715Ad ad) {
            ((UnifiedFullscreenAdCallback) getCallback()).onAdShown();
        }

        public void onRewardedVideoCompleted() {
            ((UnifiedFullscreenAdCallback) getCallback()).onAdFinished();
        }

        public void onRewardedVideoClosed() {
            ((UnifiedFullscreenAdCallback) getCallback()).onAdClosed();
        }
    }
}
