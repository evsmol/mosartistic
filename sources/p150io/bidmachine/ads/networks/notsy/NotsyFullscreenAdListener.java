package p150io.bidmachine.ads.networks.notsy;

import p150io.bidmachine.ads.networks.notsy.InternalNotsyFullscreenAd;
import p150io.bidmachine.unified.UnifiedFullscreenAdCallback;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.notsy.NotsyFullscreenAdListener */
class NotsyFullscreenAdListener<NotsyAdType extends InternalNotsyFullscreenAd> implements InternalNotsyAdLoadListener<NotsyAdType>, InternalNotsyFullscreenAdPresentListener {
    protected final UnifiedFullscreenAdCallback callback;

    NotsyFullscreenAdListener(UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        this.callback = unifiedFullscreenAdCallback;
    }

    public void onAdLoaded(NotsyAdType notsyadtype) {
        this.callback.onAdLoaded();
    }

    public void onAdLoadFailed(BMError bMError) {
        this.callback.onAdLoadFailed(bMError);
    }

    public void onAdShowFailed(BMError bMError) {
        this.callback.onAdShowFailed(bMError);
    }

    public void onAdShown() {
        this.callback.onAdShown();
    }

    public void onAdClicked() {
        this.callback.onAdClicked();
    }

    public void onAdComplete() {
        this.callback.onAdFinished();
    }

    public void onAdClosed() {
        this.callback.onAdClosed();
    }
}
