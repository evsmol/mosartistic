package com.appodeal.ads.adapters.admob.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobFullscreenDisplayListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class UnifiedAdmobRewarded<AdRequestType extends AdRequest> extends UnifiedRewarded<UnifiedAdmobRequestParams<AdRequestType>> {
    private UnifiedAdContainer<RewardedAd> unifiedAdContainer;

    /* renamed from: com.appodeal.ads.adapters.admob.rewarded_video.UnifiedAdmobRewarded$a */
    public static final class C9023a extends RewardedAdLoadCallback {

        /* renamed from: a */
        public final UnifiedAdContainer<RewardedAd> f22817a;

        /* renamed from: b */
        public final UnifiedRewardedCallback f22818b;

        public C9023a(UnifiedRewardedCallback unifiedRewardedCallback, UnifiedAdContainer<RewardedAd> unifiedAdContainer) {
            this.f22818b = unifiedRewardedCallback;
            this.f22817a = unifiedAdContainer;
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            if (loadAdError != null) {
                this.f22818b.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
            }
            this.f22818b.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
        }

        public final void onAdLoaded(Object obj) {
            RewardedAd rewardedAd = (RewardedAd) obj;
            super.onAdLoaded(rewardedAd);
            this.f22817a.setAd(rewardedAd);
            this.f22818b.onAdLoaded();
        }
    }

    public void load(ContextProvider contextProvider, UnifiedRewardedParams unifiedRewardedParams, UnifiedAdmobRequestParams<AdRequestType> unifiedAdmobRequestParams, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.unifiedAdContainer = new UnifiedAdContainer<>();
        RewardedAd.load(contextProvider.getApplicationContext(), unifiedAdmobRequestParams.key, (AdRequest) unifiedAdmobRequestParams.request, (RewardedAdLoadCallback) new C9023a(unifiedRewardedCallback, this.unifiedAdContainer));
    }

    public void onDestroy() {
        UnifiedAdContainer<RewardedAd> unifiedAdContainer2 = this.unifiedAdContainer;
        if (unifiedAdContainer2 != null) {
            unifiedAdContainer2.destroy();
            this.unifiedAdContainer = null;
        }
    }

    public void show(Activity activity, UnifiedRewardedCallback unifiedRewardedCallback) {
        UnifiedAdContainer<RewardedAd> unifiedAdContainer2 = this.unifiedAdContainer;
        RewardedAd ad = unifiedAdContainer2 != null ? unifiedAdContainer2.getAd() : null;
        if (ad != null) {
            ad.setFullScreenContentCallback(new UnifiedAdmobFullscreenDisplayListener(unifiedRewardedCallback));
            ad.show(activity, new OnUserEarnedRewardListener() {
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    UnifiedRewardedCallback.this.onAdFinished();
                }
            });
            return;
        }
        unifiedRewardedCallback.onAdShowFailed();
    }
}
