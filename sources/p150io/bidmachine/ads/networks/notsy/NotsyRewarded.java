package p150io.bidmachine.ads.networks.notsy;

import android.app.Activity;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.unified.UnifiedFullscreenAd;
import p150io.bidmachine.unified.UnifiedFullscreenAdCallback;
import p150io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.notsy.NotsyRewarded */
class NotsyRewarded extends UnifiedFullscreenAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Listener listener;
    /* access modifiers changed from: private */
    public InternalNotsyRewardedAd notsyRewardedAd;

    NotsyRewarded() {
    }

    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        if (new NotsyParams(unifiedMediationParams).isValid(unifiedFullscreenAdCallback)) {
            Listener listener2 = new Listener(unifiedFullscreenAdCallback, this);
            this.listener = listener2;
            NotsyNetwork.loadRewarded(networkAdUnit, listener2);
        }
    }

    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        Listener listener2;
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Activity is null"));
            return;
        }
        InternalNotsyRewardedAd internalNotsyRewardedAd = this.notsyRewardedAd;
        if (internalNotsyRewardedAd == null || (listener2 = this.listener) == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Rewarded object is null or not loaded"));
        } else {
            internalNotsyRewardedAd.show(activity, listener2);
        }
    }

    public void onDestroy() {
        this.listener = null;
        InternalNotsyRewardedAd internalNotsyRewardedAd = this.notsyRewardedAd;
        if (internalNotsyRewardedAd != null) {
            internalNotsyRewardedAd.destroy();
            this.notsyRewardedAd = null;
        }
    }

    /* renamed from: io.bidmachine.ads.networks.notsy.NotsyRewarded$Listener */
    private static final class Listener extends NotsyFullscreenAdListener<InternalNotsyRewardedAd> implements InternalNotsyRewardedAdListener {
        private final NotsyRewarded notsyRewarded;

        private Listener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, NotsyRewarded notsyRewarded2) {
            super(unifiedFullscreenAdCallback);
            this.notsyRewarded = notsyRewarded2;
        }

        public void onAdLoaded(InternalNotsyRewardedAd internalNotsyRewardedAd) {
            InternalNotsyRewardedAd unused = this.notsyRewarded.notsyRewardedAd = internalNotsyRewardedAd;
            super.onAdLoaded(internalNotsyRewardedAd);
        }
    }
}
