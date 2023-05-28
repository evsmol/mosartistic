package com.appodeal.ads.adapters.applovin.interstitial;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.appodeal.ads.adapters.applovin.ApplovinNetwork;
import com.appodeal.ads.adapters.applovin.C9024a;
import com.appodeal.ads.adapters.applovin.C9025b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;

/* renamed from: com.appodeal.ads.adapters.applovin.interstitial.a */
public final class C9028a extends UnifiedInterstitial<ApplovinNetwork.RequestParams> {

    /* renamed from: a */
    public C9029a f22825a;

    /* renamed from: b */
    public AppLovinSdk f22826b;

    /* renamed from: c */
    public AppLovinAd f22827c;

    /* renamed from: com.appodeal.ads.adapters.applovin.interstitial.a$a */
    public static final class C9029a extends C9025b<UnifiedInterstitialCallback> implements AppLovinAdDisplayListener {

        /* renamed from: b */
        public final C9028a f22828b;

        /* renamed from: c */
        public final boolean f22829c;

        public C9029a(UnifiedInterstitialCallback unifiedInterstitialCallback, C9028a aVar, boolean z) {
            super(unifiedInterstitialCallback);
            this.f22828b = aVar;
            this.f22829c = z;
        }

        public final void adDisplayed(AppLovinAd appLovinAd) {
            ((UnifiedInterstitialCallback) this.f22822a).onAdShown();
        }

        public final void adHidden(AppLovinAd appLovinAd) {
            ((UnifiedInterstitialCallback) this.f22822a).onAdClosed();
        }

        public final void adReceived(AppLovinAd appLovinAd) {
            if (!this.f22829c || !appLovinAd.isVideoAd()) {
                C9024a.m27130a(appLovinAd);
                this.f22828b.f22827c = appLovinAd;
                ((UnifiedInterstitialCallback) this.f22822a).onAdLoaded();
                return;
            }
            ((UnifiedInterstitialCallback) this.f22822a).onAdLoadFailed(LoadingError.IncorrectCreative);
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedInterstitialParams unifiedInterstitialParams = (UnifiedInterstitialParams) unifiedAdParams;
        ApplovinNetwork.RequestParams requestParams = (ApplovinNetwork.RequestParams) obj;
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedAdCallback;
        boolean optBoolean = requestParams.jsonData.optBoolean("check_video");
        this.f22826b = requestParams.sdk;
        this.f22825a = new C9029a(unifiedInterstitialCallback, this, optBoolean);
        AppLovinAd a = C9024a.m27129a(requestParams.zoneId);
        this.f22827c = a;
        if (a != null) {
            unifiedInterstitialCallback.onAdLoaded();
            return;
        }
        AppLovinAdService adService = this.f22826b.getAdService();
        if (TextUtils.isEmpty(requestParams.zoneId)) {
            adService.loadNextAd(AppLovinAdSize.INTERSTITIAL, this.f22825a);
        } else {
            adService.loadNextAdForZoneId(requestParams.zoneId, this.f22825a);
        }
    }

    public final void onDestroy() {
        this.f22827c = null;
        this.f22826b = null;
        this.f22825a = null;
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        if (this.f22827c != null) {
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f22826b, activity);
            create.setAdDisplayListener(this.f22825a);
            create.setAdClickListener(this.f22825a);
            create.showAndRender(this.f22827c);
            return;
        }
        unifiedInterstitialCallback.onAdShowFailed();
    }
}
