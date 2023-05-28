package p150io.bidmachine.ads.networks.meta_audience;

import com.facebook.ads.C1715Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.unified.UnifiedFullscreenAd;
import p150io.bidmachine.unified.UnifiedFullscreenAdCallback;
import p150io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.meta_audience.MetaAudienceInterstitial */
class MetaAudienceInterstitial extends UnifiedFullscreenAd {
    private InterstitialAd interstitialAd;
    private Listener listener;

    MetaAudienceInterstitial() {
    }

    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        MetaAudienceParams metaAudienceParams = new MetaAudienceParams(unifiedMediationParams);
        if (metaAudienceParams.isValid(unifiedFullscreenAdCallback)) {
            this.listener = new Listener(unifiedFullscreenAdCallback);
            InterstitialAd interstitialAd2 = new InterstitialAd(contextProvider.getContext(), metaAudienceParams.placementId);
            this.interstitialAd = interstitialAd2;
            interstitialAd2.loadAd(interstitialAd2.buildLoadAdConfig().withAdListener(this.listener).withBid(metaAudienceParams.bidPayload).build());
        }
    }

    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 == null || !interstitialAd2.isAdLoaded() || this.interstitialAd.isAdInvalidated()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Interstitial object is null or not loaded or invalidated"));
        } else {
            this.interstitialAd.show();
        }
    }

    public void onDestroy() {
        this.listener = null;
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.destroy();
            this.interstitialAd = null;
        }
    }

    /* renamed from: io.bidmachine.ads.networks.meta_audience.MetaAudienceInterstitial$Listener */
    private static final class Listener extends BaseMetaAudienceListener<UnifiedFullscreenAdCallback> implements InterstitialAdListener {
        public void onInterstitialDisplayed(C1715Ad ad) {
        }

        Listener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
            super(unifiedFullscreenAdCallback);
        }

        public void onAdLoaded(C1715Ad ad) {
            ((UnifiedFullscreenAdCallback) getCallback()).onAdLoaded();
        }

        public void onLoggingImpression(C1715Ad ad) {
            ((UnifiedFullscreenAdCallback) getCallback()).onAdShown();
        }

        public void onInterstitialDismissed(C1715Ad ad) {
            ((UnifiedFullscreenAdCallback) getCallback()).onAdClosed();
            ad.destroy();
        }
    }
}
