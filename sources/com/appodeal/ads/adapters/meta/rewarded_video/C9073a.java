package com.appodeal.ads.adapters.meta.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.facebook.ads.AdError;
import com.facebook.ads.C1715Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;

/* renamed from: com.appodeal.ads.adapters.meta.rewarded_video.a */
public final class C9073a extends UnifiedRewarded<MetaNetwork.RequestParams> {

    /* renamed from: a */
    public RewardedVideoAd f22892a;

    /* renamed from: com.appodeal.ads.adapters.meta.rewarded_video.a$a */
    public static final class C9074a implements RewardedVideoAdListener {

        /* renamed from: a */
        public final UnifiedRewardedCallback f22893a;

        public C9074a(UnifiedRewardedCallback unifiedRewardedCallback) {
            this.f22893a = unifiedRewardedCallback;
        }

        public /* synthetic */ C9074a(UnifiedRewardedCallback unifiedRewardedCallback, int i) {
            this(unifiedRewardedCallback);
        }

        public final void onAdClicked(C1715Ad ad) {
            this.f22893a.onAdClicked();
        }

        public final void onAdLoaded(C1715Ad ad) {
            this.f22893a.onAdLoaded();
        }

        public final void onError(C1715Ad ad, AdError adError) {
            if (ad != null) {
                ad.destroy();
            }
            if (adError != null) {
                this.f22893a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
            }
            this.f22893a.onAdLoadFailed(MetaNetwork.mapError(adError));
        }

        public final void onLoggingImpression(C1715Ad ad) {
            this.f22893a.onAdShown();
        }

        public final void onRewardedVideoClosed() {
            this.f22893a.onAdClosed();
        }

        public final void onRewardedVideoCompleted() {
            this.f22893a.onAdFinished();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedRewardedParams unifiedRewardedParams = (UnifiedRewardedParams) unifiedAdParams;
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(contextProvider.getApplicationContext(), ((MetaNetwork.RequestParams) obj).metaKey);
        this.f22892a = rewardedVideoAd;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(new C9074a((UnifiedRewardedCallback) unifiedAdCallback, 0)).build());
    }

    public final void onDestroy() {
        RewardedVideoAd rewardedVideoAd = this.f22892a;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
            this.f22892a = null;
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        RewardedVideoAd rewardedVideoAd = this.f22892a;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded() || this.f22892a.isAdInvalidated()) {
            unifiedRewardedCallback.onAdShowFailed();
        } else {
            this.f22892a.show();
        }
    }
}
