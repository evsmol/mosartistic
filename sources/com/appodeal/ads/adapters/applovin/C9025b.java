package com.appodeal.ads.adapters.applovin;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;

/* renamed from: com.appodeal.ads.adapters.applovin.b */
public abstract class C9025b<UnifiedAdCallbackType extends UnifiedAdCallback> implements AppLovinAdClickListener, AppLovinAdLoadListener {

    /* renamed from: a */
    public UnifiedAdCallbackType f22822a;

    public C9025b(UnifiedAdCallbackType unifiedadcallbacktype) {
        this.f22822a = unifiedadcallbacktype;
    }

    public final void adClicked(AppLovinAd appLovinAd) {
        this.f22822a.onAdClicked();
    }

    public final void failedToReceiveAd(int i) {
        String str;
        LoadingError loadingError = LoadingError.NoFill;
        if (i == 204) {
            str = "no ad is available";
        } else if (i >= 500) {
            str = "internal server error";
        } else {
            loadingError = LoadingError.InternalError;
            str = "internal errors";
        }
        this.f22822a.printError(str, Integer.valueOf(i));
        this.f22822a.onAdLoadFailed(loadingError);
    }
}
