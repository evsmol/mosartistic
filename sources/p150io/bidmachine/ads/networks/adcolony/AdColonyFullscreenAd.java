package p150io.bidmachine.ads.networks.adcolony;

import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyAdOptions;
import com.adcolony.sdk.AdColonyInterstitial;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.unified.UnifiedFullscreenAd;
import p150io.bidmachine.unified.UnifiedFullscreenAdCallback;
import p150io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.adcolony.AdColonyFullscreenAd */
class AdColonyFullscreenAd extends UnifiedFullscreenAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private AdColonyInterstitial adColonyInterstitial;
    private final boolean isRewarded;
    private AdColonyFullscreenAdListener listener;

    AdColonyFullscreenAd(boolean z) {
        this.isRewarded = z;
    }

    public void load(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        AdColonyParams adColonyParams = new AdColonyParams(unifiedMediationParams);
        if (adColonyParams.isValid(unifiedFullscreenAdCallback)) {
            this.listener = new AdColonyFullscreenAdListener(adColonyParams.zoneId, this, unifiedFullscreenAdCallback);
            if (this.isRewarded) {
                AdColonyRewardListenerWrapper.get().addListener(this.listener);
            }
            AdColony.requestInterstitial(adColonyParams.zoneId, this.listener, new AdColonyAdOptions().setOption("adm", adColonyParams.adm));
        }
    }

    public void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        AdColonyInterstitial adColonyInterstitial2 = this.adColonyInterstitial;
        if (adColonyInterstitial2 == null || adColonyInterstitial2.isExpired()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Interstitial object is null or expired"));
        } else {
            this.adColonyInterstitial.show();
        }
    }

    public void onDestroy() {
        AdColonyInterstitial adColonyInterstitial2 = this.adColonyInterstitial;
        if (adColonyInterstitial2 != null) {
            adColonyInterstitial2.destroy();
            this.adColonyInterstitial = null;
        }
        if (this.listener != null) {
            if (this.isRewarded) {
                AdColonyRewardListenerWrapper.get().removeListener(this.listener);
            }
            this.listener = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setAdColonyInterstitial(AdColonyInterstitial adColonyInterstitial2) {
        this.adColonyInterstitial = adColonyInterstitial2;
    }
}
