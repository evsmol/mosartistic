package p150io.bidmachine.ads.networks.notsy;

import android.app.Activity;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.unified.UnifiedFullscreenAd;
import p150io.bidmachine.unified.UnifiedFullscreenAdCallback;
import p150io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.notsy.NotsyInterstitial */
class NotsyInterstitial extends UnifiedFullscreenAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Listener listener;
    /* access modifiers changed from: private */
    public InternalNotsyInterstitialAd notsyInterstitialAd;

    NotsyInterstitial() {
    }

    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        if (new NotsyParams(unifiedMediationParams).isValid(unifiedFullscreenAdCallback)) {
            Listener listener2 = new Listener(unifiedFullscreenAdCallback, this);
            this.listener = listener2;
            NotsyNetwork.loadInterstitial(networkAdUnit, listener2);
        }
    }

    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        Listener listener2;
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Activity is null"));
            return;
        }
        InternalNotsyInterstitialAd internalNotsyInterstitialAd = this.notsyInterstitialAd;
        if (internalNotsyInterstitialAd == null || (listener2 = this.listener) == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Interstitial object is null or not loaded"));
        } else {
            internalNotsyInterstitialAd.show(activity, listener2);
        }
    }

    public void onDestroy() {
        this.listener = null;
        InternalNotsyInterstitialAd internalNotsyInterstitialAd = this.notsyInterstitialAd;
        if (internalNotsyInterstitialAd != null) {
            internalNotsyInterstitialAd.destroy();
            this.notsyInterstitialAd = null;
        }
    }

    /* renamed from: io.bidmachine.ads.networks.notsy.NotsyInterstitial$Listener */
    private static final class Listener extends NotsyFullscreenAdListener<InternalNotsyInterstitialAd> implements InternalNotsyInterstitialAdListener {
        private final NotsyInterstitial notsyInterstitial;

        private Listener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, NotsyInterstitial notsyInterstitial2) {
            super(unifiedFullscreenAdCallback);
            this.notsyInterstitial = notsyInterstitial2;
        }

        public void onAdLoaded(InternalNotsyInterstitialAd internalNotsyInterstitialAd) {
            InternalNotsyInterstitialAd unused = this.notsyInterstitial.notsyInterstitialAd = internalNotsyInterstitialAd;
            super.onAdLoaded(internalNotsyInterstitialAd);
        }
    }
}
