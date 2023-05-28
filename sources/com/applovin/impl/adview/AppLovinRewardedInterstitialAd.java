package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinRewardedInterstitialAd {

    /* renamed from: a */
    private final AppLovinIncentivizedInterstitial f19025a;

    /* renamed from: b */
    private AppLovinAdDisplayListener f19026b;

    /* renamed from: c */
    private AppLovinAdClickListener f19027c;

    /* renamed from: d */
    private AppLovinAdVideoPlaybackListener f19028d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f19025a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f19027c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f19026b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f19028d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f19025a.show(appLovinAd, context, appLovinAdRewardListener, this.f19028d, this.f19026b, this.f19027c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
