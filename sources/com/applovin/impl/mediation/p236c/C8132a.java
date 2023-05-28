package com.applovin.impl.mediation.p236c;

import com.applovin.impl.mediation.ads.C8105a;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* renamed from: com.applovin.impl.mediation.c.a */
public class C8132a implements C8105a.C8106a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private final C8105a.C8106a f19810a;

    public C8132a(C8105a.C8106a aVar) {
        this.f19810a = aVar;
    }

    public void onAdClicked(MaxAd maxAd) {
        C8575k.m26163d(this.f19810a, maxAd);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        C8575k.m26171h(this.f19810a, maxAd);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        C8575k.m26127a((MaxAdListener) this.f19810a, maxAd, maxError);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        C8575k.m26154b((MaxAdListener) this.f19810a, maxAd);
    }

    public void onAdExpanded(MaxAd maxAd) {
        C8575k.m26169g(this.f19810a, maxAd);
    }

    public void onAdHidden(MaxAd maxAd) {
        C8575k.m26160c(this.f19810a, maxAd);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        C8575k.m26132a((MaxAdListener) this.f19810a, str, maxError);
    }

    public void onAdLoaded(MaxAd maxAd) {
        C8575k.m26126a((MaxAdListener) this.f19810a, maxAd);
    }

    public void onAdRequestStarted(String str) {
        C8575k.m26134a((MaxAdRequestListener) this.f19810a, str);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        C8575k.m26136a((MaxAdRevenueListener) this.f19810a, maxAd);
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        C8575k.m26167f(this.f19810a, maxAd);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        C8575k.m26165e(this.f19810a, maxAd);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        C8575k.m26129a((MaxAdListener) this.f19810a, maxAd, maxReward);
    }
}
