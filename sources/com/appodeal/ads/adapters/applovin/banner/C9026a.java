package com.appodeal.ads.adapters.applovin.banner;

import android.content.Context;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.appodeal.ads.adapters.applovin.ApplovinNetwork;
import com.appodeal.ads.adapters.applovin.C9025b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;

/* renamed from: com.appodeal.ads.adapters.applovin.banner.a */
public final class C9026a extends UnifiedBanner<ApplovinNetwork.RequestParams> {

    /* renamed from: a */
    public AppLovinAdView f22823a;

    /* renamed from: com.appodeal.ads.adapters.applovin.banner.a$a */
    public static final class C9027a extends C9025b<UnifiedBannerCallback> {

        /* renamed from: b */
        public final AppLovinAdView f22824b;

        public C9027a(UnifiedBannerCallback unifiedBannerCallback, AppLovinAdView appLovinAdView) {
            super(unifiedBannerCallback);
            this.f22824b = appLovinAdView;
        }

        public final void adReceived(AppLovinAd appLovinAd) {
            ((UnifiedBannerCallback) this.f22822a).onAdLoaded(this.f22824b, appLovinAd.getSize().getWidth(), appLovinAd.getSize().getHeight());
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        ApplovinNetwork.RequestParams requestParams = (ApplovinNetwork.RequestParams) obj;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        Context applicationContext = contextProvider.getApplicationContext();
        AppLovinAdView appLovinAdView = new AppLovinAdView(requestParams.sdk, ((UnifiedBannerParams) unifiedAdParams).needLeaderBoard(applicationContext) ? AppLovinAdSize.LEADER : AppLovinAdSize.BANNER, requestParams.zoneId, applicationContext);
        this.f22823a = appLovinAdView;
        C9027a aVar = new C9027a(unifiedBannerCallback, appLovinAdView);
        appLovinAdView.setAdLoadListener(aVar);
        this.f22823a.setAdClickListener(aVar);
        this.f22823a.loadNextAd();
    }

    public final void onDestroy() {
        AppLovinAdView appLovinAdView = this.f22823a;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.f22823a = null;
        }
    }
}
