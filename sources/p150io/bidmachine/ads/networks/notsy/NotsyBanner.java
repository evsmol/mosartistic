package p150io.bidmachine.ads.networks.notsy;

import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.unified.UnifiedBannerAd;
import p150io.bidmachine.unified.UnifiedBannerAdCallback;
import p150io.bidmachine.unified.UnifiedBannerAdRequestParams;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.notsy.NotsyBanner */
class NotsyBanner extends UnifiedBannerAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private InternalNotsyBannerAdListener listener;
    /* access modifiers changed from: private */
    public InternalNotsyBannerAd notsyBannerAd;

    NotsyBanner() {
    }

    public void load(ContextProvider contextProvider, UnifiedBannerAdCallback unifiedBannerAdCallback, UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        if (new NotsyParams(unifiedMediationParams).isValid(unifiedBannerAdCallback)) {
            Listener listener2 = new Listener(unifiedBannerAdCallback);
            this.listener = listener2;
            NotsyNetwork.loadBanner(networkAdUnit, listener2);
        }
    }

    public void onDestroy() {
        this.listener = null;
        InternalNotsyBannerAd internalNotsyBannerAd = this.notsyBannerAd;
        if (internalNotsyBannerAd != null) {
            internalNotsyBannerAd.destroy();
            this.notsyBannerAd = null;
        }
    }

    /* renamed from: io.bidmachine.ads.networks.notsy.NotsyBanner$Listener */
    private static final class Listener implements InternalNotsyBannerAdListener {
        private final UnifiedBannerAdCallback callback;
        private final NotsyBanner notsyBanner;

        public void onAdShown() {
        }

        private Listener(NotsyBanner notsyBanner2, UnifiedBannerAdCallback unifiedBannerAdCallback) {
            this.notsyBanner = notsyBanner2;
            this.callback = unifiedBannerAdCallback;
        }

        public void onAdLoaded(InternalNotsyBannerAd internalNotsyBannerAd) {
            InternalNotsyBannerAd unused = this.notsyBanner.notsyBannerAd = internalNotsyBannerAd;
            this.callback.onAdLoaded(internalNotsyBannerAd.getAdView());
        }

        public void onAdLoadFailed(BMError bMError) {
            this.callback.onAdLoadFailed(bMError);
        }

        public void onAdShowFailed(BMError bMError) {
            this.callback.onAdShowFailed(bMError);
        }

        public void onAdClicked() {
            this.callback.onAdClicked();
        }
    }
}
