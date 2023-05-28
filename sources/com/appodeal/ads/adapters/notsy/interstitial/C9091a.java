package com.appodeal.ads.adapters.notsy.interstitial;

import com.appodeal.ads.adapters.admob.interstitial.UnifiedAdmobInterstitial;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;

/* renamed from: com.appodeal.ads.adapters.notsy.interstitial.a */
public final class C9091a extends UnifiedAdmobInterstitial<AdManagerInterstitialAd, AdManagerAdRequest> {

    /* renamed from: com.appodeal.ads.adapters.notsy.interstitial.a$a */
    public static final class C9092a extends AdManagerInterstitialAdLoadCallback {

        /* renamed from: a */
        public final UnifiedInterstitialCallback f22911a;

        /* renamed from: b */
        public final UnifiedAdContainer<AdManagerInterstitialAd> f22912b;

        public C9092a(UnifiedInterstitialCallback unifiedInterstitialCallback, UnifiedAdContainer<AdManagerInterstitialAd> unifiedAdContainer) {
            this.f22911a = unifiedInterstitialCallback;
            this.f22912b = unifiedAdContainer;
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            if (loadAdError != null) {
                this.f22911a.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
            }
            this.f22911a.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
        }

        public final void onAdLoaded(Object obj) {
            AdManagerInterstitialAd adManagerInterstitialAd = (AdManagerInterstitialAd) obj;
            super.onAdLoaded(adManagerInterstitialAd);
            this.f22912b.setAd(adManagerInterstitialAd);
            this.f22911a.onAdLoaded();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedInterstitialParams unifiedInterstitialParams = (UnifiedInterstitialParams) unifiedAdParams;
        UnifiedAdmobRequestParams unifiedAdmobRequestParams = (UnifiedAdmobRequestParams) obj;
        this.unifiedAdContainer = new UnifiedAdContainer<>();
        AdManagerInterstitialAd.load(contextProvider.getApplicationContext(), unifiedAdmobRequestParams.key, (AdManagerAdRequest) unifiedAdmobRequestParams.request, new C9092a((UnifiedInterstitialCallback) unifiedAdCallback, this.unifiedAdContainer));
    }
}
