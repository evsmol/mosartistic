package com.appodeal.ads.adapters.meta.interstitial;

import android.app.Activity;
import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.facebook.ads.AdError;
import com.facebook.ads.C1715Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

/* renamed from: com.appodeal.ads.adapters.meta.interstitial.a */
public final class C9064a extends UnifiedInterstitial<MetaNetwork.RequestParams> {

    /* renamed from: a */
    public InterstitialAd f22880a;

    /* renamed from: com.appodeal.ads.adapters.meta.interstitial.a$a */
    public static final class C9065a implements InterstitialAdListener {

        /* renamed from: a */
        public final UnifiedInterstitialCallback f22881a;

        public C9065a(UnifiedInterstitialCallback unifiedInterstitialCallback) {
            this.f22881a = unifiedInterstitialCallback;
        }

        public final void onAdClicked(C1715Ad ad) {
            this.f22881a.onAdClicked();
        }

        public final void onAdLoaded(C1715Ad ad) {
            this.f22881a.onAdLoaded();
        }

        public final void onError(C1715Ad ad, AdError adError) {
            if (ad != null) {
                ad.destroy();
            }
            if (adError != null) {
                this.f22881a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
            }
            this.f22881a.onAdLoadFailed(MetaNetwork.mapError(adError));
        }

        public final void onInterstitialDismissed(C1715Ad ad) {
            if (ad != null) {
                ad.destroy();
            }
            this.f22881a.onAdClosed();
        }

        public final void onInterstitialDisplayed(C1715Ad ad) {
        }

        public final void onLoggingImpression(C1715Ad ad) {
            this.f22881a.onAdShown();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedInterstitialParams unifiedInterstitialParams = (UnifiedInterstitialParams) unifiedAdParams;
        InterstitialAd interstitialAd = new InterstitialAd(contextProvider.getApplicationContext(), ((MetaNetwork.RequestParams) obj).metaKey);
        this.f22880a = interstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new C9065a((UnifiedInterstitialCallback) unifiedAdCallback)).build());
    }

    public final void onDestroy() {
        InterstitialAd interstitialAd = this.f22880a;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.f22880a = null;
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        InterstitialAd interstitialAd = this.f22880a;
        if (interstitialAd == null || !interstitialAd.isAdLoaded() || this.f22880a.isAdInvalidated()) {
            unifiedInterstitialCallback.onAdShowFailed();
        } else {
            this.f22880a.show();
        }
    }
}
