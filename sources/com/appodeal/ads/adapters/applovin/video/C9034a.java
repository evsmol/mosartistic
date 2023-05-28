package com.appodeal.ads.adapters.applovin.video;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.appodeal.ads.adapters.applovin.ApplovinNetwork;
import com.appodeal.ads.adapters.applovin.C9024a;
import com.appodeal.ads.adapters.applovin.C9025b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;

/* renamed from: com.appodeal.ads.adapters.applovin.video.a */
public final class C9034a extends UnifiedVideo<ApplovinNetwork.RequestParams> {

    /* renamed from: a */
    public C9035a f22834a;

    /* renamed from: b */
    public AppLovinSdk f22835b;

    /* renamed from: c */
    public AppLovinAd f22836c;

    /* renamed from: com.appodeal.ads.adapters.applovin.video.a$a */
    public static final class C9035a extends C9025b<UnifiedVideoCallback> implements AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b */
        public final C9034a f22837b;

        public C9035a(UnifiedVideoCallback unifiedVideoCallback, C9034a aVar) {
            super(unifiedVideoCallback);
            this.f22837b = aVar;
        }

        public final void adDisplayed(AppLovinAd appLovinAd) {
            ((UnifiedVideoCallback) this.f22822a).onAdShown();
        }

        public final void adHidden(AppLovinAd appLovinAd) {
            ((UnifiedVideoCallback) this.f22822a).onAdClosed();
        }

        public final void adReceived(AppLovinAd appLovinAd) {
            C9024a.m27130a(appLovinAd);
            this.f22837b.f22836c = appLovinAd;
            ((UnifiedVideoCallback) this.f22822a).onAdLoaded();
        }

        public final void videoPlaybackBegan(AppLovinAd appLovinAd) {
        }

        public final void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            if (z) {
                ((UnifiedVideoCallback) this.f22822a).onAdFinished();
            }
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedVideoParams unifiedVideoParams = (UnifiedVideoParams) unifiedAdParams;
        ApplovinNetwork.RequestParams requestParams = (ApplovinNetwork.RequestParams) obj;
        UnifiedVideoCallback unifiedVideoCallback = (UnifiedVideoCallback) unifiedAdCallback;
        this.f22835b = requestParams.sdk;
        this.f22834a = new C9035a(unifiedVideoCallback, this);
        AppLovinAd a = C9024a.m27129a(requestParams.zoneId);
        this.f22836c = a;
        if (a != null) {
            unifiedVideoCallback.onAdLoaded();
            return;
        }
        AppLovinAdService adService = this.f22835b.getAdService();
        if (TextUtils.isEmpty(requestParams.zoneId)) {
            adService.loadNextAd(AppLovinAdSize.INTERSTITIAL, this.f22834a);
        } else {
            adService.loadNextAdForZoneId(requestParams.zoneId, this.f22834a);
        }
    }

    public final void onDestroy() {
        this.f22836c = null;
        this.f22835b = null;
        this.f22834a = null;
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedVideoCallback unifiedVideoCallback = (UnifiedVideoCallback) unifiedFullscreenAdCallback;
        if (this.f22836c != null) {
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f22835b, activity);
            create.setAdDisplayListener(this.f22834a);
            create.setAdClickListener(this.f22834a);
            create.setAdVideoPlaybackListener(this.f22834a);
            create.showAndRender(this.f22836c);
            return;
        }
        unifiedVideoCallback.onAdShowFailed();
    }
}
