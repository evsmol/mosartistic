package com.appodeal.ads.adapters.meta.banner;

import android.content.Context;
import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.C1715Ad;

/* renamed from: com.appodeal.ads.adapters.meta.banner.a */
public final class C9062a extends UnifiedBanner<MetaNetwork.RequestParams> {

    /* renamed from: a */
    public AdSize f22876a;

    /* renamed from: b */
    public AdView f22877b;

    /* renamed from: com.appodeal.ads.adapters.meta.banner.a$a */
    public final class C9063a implements AdListener {

        /* renamed from: a */
        public final UnifiedBannerCallback f22878a;

        public C9063a(UnifiedBannerCallback unifiedBannerCallback) {
            this.f22878a = unifiedBannerCallback;
        }

        public final void onAdClicked(C1715Ad ad) {
            this.f22878a.onAdClicked();
        }

        public final void onAdLoaded(C1715Ad ad) {
            this.f22878a.onAdLoaded(C9062a.this.f22877b, -1, C9062a.this.f22876a.getHeight());
        }

        public final void onError(C1715Ad ad, AdError adError) {
            if (ad != null) {
                ad.destroy();
            }
            if (adError != null) {
                this.f22878a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
            }
            this.f22878a.onAdLoadFailed(MetaNetwork.mapError(adError));
        }

        public final void onLoggingImpression(C1715Ad ad) {
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        MetaNetwork.RequestParams requestParams = (MetaNetwork.RequestParams) obj;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        Context applicationContext = contextProvider.getApplicationContext();
        this.f22876a = ((UnifiedBannerParams) unifiedAdParams).needLeaderBoard(applicationContext) ? AdSize.BANNER_HEIGHT_90 : AdSize.BANNER_HEIGHT_50;
        AdView adView = new AdView(applicationContext, requestParams.metaKey, this.f22876a);
        this.f22877b = adView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(new C9063a(unifiedBannerCallback)).build());
    }

    public final void onDestroy() {
        AdView adView = this.f22877b;
        if (adView != null) {
            adView.destroy();
            this.f22877b = null;
        }
        this.f22876a = null;
    }
}
