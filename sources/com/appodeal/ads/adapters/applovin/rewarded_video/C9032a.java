package com.appodeal.ads.adapters.applovin.rewarded_video;

import android.app.Activity;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.appodeal.ads.adapters.applovin.ApplovinNetwork;
import com.appodeal.ads.adapters.applovin.C9025b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;

/* renamed from: com.appodeal.ads.adapters.applovin.rewarded_video.a */
public final class C9032a extends UnifiedRewarded<ApplovinNetwork.RequestParams> {

    /* renamed from: a */
    public C9033a f22832a;

    /* renamed from: b */
    public AppLovinIncentivizedInterstitial f22833b;

    /* renamed from: com.appodeal.ads.adapters.applovin.rewarded_video.a$a */
    public static class C9033a extends C9025b<UnifiedRewardedCallback> implements AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        public C9033a(UnifiedRewardedCallback unifiedRewardedCallback) {
            super(unifiedRewardedCallback);
        }

        public final void adDisplayed(AppLovinAd appLovinAd) {
            ((UnifiedRewardedCallback) this.f22822a).onAdShown();
        }

        public final void adHidden(AppLovinAd appLovinAd) {
            ((UnifiedRewardedCallback) this.f22822a).onAdClosed();
        }

        public final void adReceived(AppLovinAd appLovinAd) {
            ((UnifiedRewardedCallback) this.f22822a).onAdLoaded();
        }

        public final void videoPlaybackBegan(AppLovinAd appLovinAd) {
        }

        public final void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            if (z) {
                ((UnifiedRewardedCallback) this.f22822a).onAdFinished();
            }
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedRewardedParams unifiedRewardedParams = (UnifiedRewardedParams) unifiedAdParams;
        ApplovinNetwork.RequestParams requestParams = (ApplovinNetwork.RequestParams) obj;
        this.f22832a = new C9033a((UnifiedRewardedCallback) unifiedAdCallback);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(requestParams.zoneId, requestParams.sdk);
        this.f22833b = create;
        create.preload(this.f22832a);
    }

    public final void onDestroy() {
        this.f22833b = null;
        this.f22832a = null;
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.f22833b;
        if (appLovinIncentivizedInterstitial == null || !appLovinIncentivizedInterstitial.isAdReadyToDisplay()) {
            unifiedRewardedCallback.onAdShowFailed();
            return;
        }
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial2 = this.f22833b;
        C9033a aVar = this.f22832a;
        appLovinIncentivizedInterstitial2.show(activity, (AppLovinAdRewardListener) null, aVar, aVar, aVar);
    }
}
