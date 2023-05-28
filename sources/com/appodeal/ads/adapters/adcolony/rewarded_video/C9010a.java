package com.appodeal.ads.adapters.adcolony.rewarded_video;

import android.app.Activity;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.appodeal.ads.adapters.adcolony.AdcolonyNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;

/* renamed from: com.appodeal.ads.adapters.adcolony.rewarded_video.a */
public final class C9010a extends UnifiedRewarded<AdcolonyNetwork.RequestParams> {

    /* renamed from: a */
    public AdColonyInterstitial f22791a;

    /* renamed from: b */
    public C9011b f22792b;

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedRewardedParams unifiedRewardedParams = (UnifiedRewardedParams) unifiedAdParams;
        AdcolonyNetwork.RequestParams requestParams = (AdcolonyNetwork.RequestParams) obj;
        C9011b bVar = new C9011b((UnifiedRewardedCallback) unifiedAdCallback, this);
        this.f22792b = bVar;
        AdColony.setRewardListener(bVar);
        AdColony.requestInterstitial(requestParams.zoneId, this.f22792b, requestParams.adOptions);
    }

    public final void onDestroy() {
        AdColonyInterstitial adColonyInterstitial = this.f22791a;
        if (adColonyInterstitial != null) {
            if (this.f22792b == adColonyInterstitial.getListener()) {
                this.f22791a.setListener((AdColonyInterstitialListener) null);
            }
            this.f22791a.destroy();
            this.f22791a = null;
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        AdColonyInterstitial adColonyInterstitial = this.f22791a;
        if (adColonyInterstitial == null || adColonyInterstitial.isExpired()) {
            unifiedRewardedCallback.onAdShowFailed();
        } else {
            this.f22791a.show();
        }
    }
}
