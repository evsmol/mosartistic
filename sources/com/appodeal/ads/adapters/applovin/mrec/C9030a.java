package com.appodeal.ads.adapters.applovin.mrec;

import android.content.Context;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.appodeal.ads.adapters.applovin.ApplovinNetwork;
import com.appodeal.ads.adapters.applovin.C9025b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;

/* renamed from: com.appodeal.ads.adapters.applovin.mrec.a */
public final class C9030a extends UnifiedMrec<ApplovinNetwork.RequestParams> {

    /* renamed from: a */
    public AppLovinAdView f22830a;

    /* renamed from: com.appodeal.ads.adapters.applovin.mrec.a$a */
    public static final class C9031a extends C9025b<UnifiedMrecCallback> {

        /* renamed from: b */
        public final AppLovinAdView f22831b;

        public C9031a(UnifiedMrecCallback unifiedMrecCallback, AppLovinAdView appLovinAdView) {
            super(unifiedMrecCallback);
            this.f22831b = appLovinAdView;
        }

        public final void adReceived(AppLovinAd appLovinAd) {
            ((UnifiedMrecCallback) this.f22822a).onAdLoaded(this.f22831b);
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedMrecParams unifiedMrecParams = (UnifiedMrecParams) unifiedAdParams;
        ApplovinNetwork.RequestParams requestParams = (ApplovinNetwork.RequestParams) obj;
        Context applicationContext = contextProvider.getApplicationContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Math.round(UnifiedAdUtils.getScreenDensity(applicationContext) * ((float) AppLovinAdSize.MREC.getWidth())), Math.round(UnifiedAdUtils.getScreenDensity(applicationContext) * ((float) AppLovinAdSize.MREC.getHeight())), 1);
        AppLovinAdView appLovinAdView = new AppLovinAdView(requestParams.sdk, AppLovinAdSize.MREC, requestParams.zoneId, applicationContext);
        this.f22830a = appLovinAdView;
        C9031a aVar = new C9031a((UnifiedMrecCallback) unifiedAdCallback, appLovinAdView);
        appLovinAdView.setLayoutParams(layoutParams);
        this.f22830a.setAdLoadListener(aVar);
        this.f22830a.setAdClickListener(aVar);
        this.f22830a.loadNextAd();
    }

    public final void onDestroy() {
        AppLovinAdView appLovinAdView = this.f22830a;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.f22830a = null;
        }
    }
}
