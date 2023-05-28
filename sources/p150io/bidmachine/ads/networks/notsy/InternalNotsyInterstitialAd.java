package p150io.bidmachine.ads.networks.notsy;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import p150io.bidmachine.ads.networks.notsy.InternalNotsyAd;
import p150io.bidmachine.ads.networks.notsy.InternalNotsyFullscreenAd;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.notsy.InternalNotsyInterstitialAd */
class InternalNotsyInterstitialAd extends InternalNotsyFullscreenAd {
    /* access modifiers changed from: private */
    public AdManagerInterstitialAd interstitialAd;

    InternalNotsyInterstitialAd(InternalNotsyAdUnit internalNotsyAdUnit) {
        super(internalNotsyAdUnit);
    }

    /* access modifiers changed from: protected */
    public void loadAd(Context context, InternalLoadListener internalLoadListener) throws Throwable {
        AdManagerInterstitialAd.load(context, getAdUnitId(), createAdManagerAdRequest(), new LoadListener(this, internalLoadListener));
    }

    /* access modifiers changed from: protected */
    public void showAd(Activity activity, InternalNotsyFullscreenAdPresentListener internalNotsyFullscreenAdPresentListener) throws Throwable {
        AdManagerInterstitialAd adManagerInterstitialAd = this.interstitialAd;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(new InternalNotsyFullscreenAd.InternalFullscreenShowListener(this, internalNotsyFullscreenAdPresentListener));
            this.interstitialAd.show(activity);
            return;
        }
        internalNotsyFullscreenAdPresentListener.onAdShowFailed(BMError.internal("Interstitial object is null or not loaded"));
    }

    /* access modifiers changed from: protected */
    public void destroyAd() throws Throwable {
        AdManagerInterstitialAd adManagerInterstitialAd = this.interstitialAd;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback((FullScreenContentCallback) null);
            this.interstitialAd = null;
        }
    }

    /* renamed from: io.bidmachine.ads.networks.notsy.InternalNotsyInterstitialAd$LoadListener */
    private static final class LoadListener extends AdManagerInterstitialAdLoadCallback {
        private final InternalLoadListener loadListener;
        private final InternalNotsyInterstitialAd notsyInterstitialAd;

        public LoadListener(InternalNotsyInterstitialAd internalNotsyInterstitialAd, InternalLoadListener internalLoadListener) {
            this.notsyInterstitialAd = internalNotsyInterstitialAd;
            this.loadListener = internalLoadListener;
        }

        public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
            AdManagerInterstitialAd unused = this.notsyInterstitialAd.interstitialAd = adManagerInterstitialAd;
            this.notsyInterstitialAd.setStatus(InternalNotsyAd.Status.Loaded);
            this.loadListener.onAdLoaded(this.notsyInterstitialAd);
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.loadListener.onAdLoadFailed(this.notsyInterstitialAd, BMError.noFill());
        }
    }
}
