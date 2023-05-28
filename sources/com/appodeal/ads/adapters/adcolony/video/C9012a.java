package com.appodeal.ads.adapters.adcolony.video;

import android.app.Activity;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.appodeal.ads.adapters.adcolony.AdcolonyNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;

/* renamed from: com.appodeal.ads.adapters.adcolony.video.a */
public final class C9012a extends UnifiedVideo<AdcolonyNetwork.RequestParams> {

    /* renamed from: a */
    public AdColonyInterstitial f22795a;

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedVideoParams unifiedVideoParams = (UnifiedVideoParams) unifiedAdParams;
        AdcolonyNetwork.RequestParams requestParams = (AdcolonyNetwork.RequestParams) obj;
        AdColony.requestInterstitial(requestParams.zoneId, new C9013b((UnifiedVideoCallback) unifiedAdCallback, this), requestParams.adOptions);
    }

    public final void onDestroy() {
        AdColonyInterstitial adColonyInterstitial = this.f22795a;
        if (adColonyInterstitial != null) {
            adColonyInterstitial.setListener((AdColonyInterstitialListener) null);
            this.f22795a.destroy();
            this.f22795a = null;
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedVideoCallback unifiedVideoCallback = (UnifiedVideoCallback) unifiedFullscreenAdCallback;
        AdColonyInterstitial adColonyInterstitial = this.f22795a;
        if (adColonyInterstitial == null || adColonyInterstitial.isExpired()) {
            unifiedVideoCallback.onAdShowFailed();
        } else {
            this.f22795a.show();
        }
    }
}
