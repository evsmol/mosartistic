package com.appodeal.ads.adapters.meta.mrec;

import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.C1715Ad;

/* renamed from: com.appodeal.ads.adapters.meta.mrec.a */
public final class C9066a extends UnifiedMrec<MetaNetwork.RequestParams> {

    /* renamed from: a */
    public AdView f22882a;

    /* renamed from: com.appodeal.ads.adapters.meta.mrec.a$a */
    public final class C9067a implements AdListener {

        /* renamed from: a */
        public final UnifiedMrecCallback f22883a;

        public C9067a(UnifiedMrecCallback unifiedMrecCallback) {
            this.f22883a = unifiedMrecCallback;
        }

        public final void onAdClicked(C1715Ad ad) {
            this.f22883a.onAdClicked();
        }

        public final void onAdLoaded(C1715Ad ad) {
            this.f22883a.onAdLoaded(C9066a.this.f22882a);
        }

        public final void onError(C1715Ad ad, AdError adError) {
            if (ad != null) {
                ad.destroy();
            }
            if (adError != null) {
                this.f22883a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
            }
            this.f22883a.onAdLoadFailed(MetaNetwork.mapError(adError));
        }

        public final void onLoggingImpression(C1715Ad ad) {
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedMrecParams unifiedMrecParams = (UnifiedMrecParams) unifiedAdParams;
        AdView adView = new AdView(contextProvider.getApplicationContext(), ((MetaNetwork.RequestParams) obj).metaKey, AdSize.RECTANGLE_HEIGHT_250);
        this.f22882a = adView;
        adView.loadAd(adView.buildLoadAdConfig().withAdListener(new C9067a((UnifiedMrecCallback) unifiedAdCallback)).build());
    }

    public final void onDestroy() {
        AdView adView = this.f22882a;
        if (adView != null) {
            adView.destroy();
            this.f22882a = null;
        }
    }
}
