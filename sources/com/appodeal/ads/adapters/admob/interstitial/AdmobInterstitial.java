package com.appodeal.ads.adapters.admob.interstitial;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class AdmobInterstitial extends UnifiedAdmobInterstitial<InterstitialAd, AdRequest> {

    /* renamed from: com.appodeal.ads.adapters.admob.interstitial.AdmobInterstitial$a */
    public static final class C9019a extends InterstitialAdLoadCallback {

        /* renamed from: a */
        public final UnifiedInterstitialCallback f22809a;

        /* renamed from: b */
        public final UnifiedAdContainer<InterstitialAd> f22810b;

        public C9019a(UnifiedInterstitialCallback unifiedInterstitialCallback, UnifiedAdContainer<InterstitialAd> unifiedAdContainer) {
            this.f22809a = unifiedInterstitialCallback;
            this.f22810b = unifiedAdContainer;
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            if (loadAdError != null) {
                this.f22809a.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
            }
            this.f22809a.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
        }

        public final void onAdLoaded(Object obj) {
            InterstitialAd interstitialAd = (InterstitialAd) obj;
            super.onAdLoaded(interstitialAd);
            this.f22810b.setAd(interstitialAd);
            this.f22809a.onAdLoaded();
        }
    }

    public void load(ContextProvider contextProvider, UnifiedInterstitialParams unifiedInterstitialParams, UnifiedAdmobRequestParams<AdRequest> unifiedAdmobRequestParams, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.unifiedAdContainer = new UnifiedAdContainer<>();
        InterstitialAd.load(contextProvider.getApplicationContext(), unifiedAdmobRequestParams.key, unifiedAdmobRequestParams.request, new C9019a(unifiedInterstitialCallback, this.unifiedAdContainer));
    }
}
