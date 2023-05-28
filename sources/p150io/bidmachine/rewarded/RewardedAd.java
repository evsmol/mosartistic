package p150io.bidmachine.rewarded;

import android.content.Context;
import p150io.bidmachine.AdProcessCallback;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.FullScreenAd;
import p150io.bidmachine.FullScreenAdObject;
import p150io.bidmachine.NetworkAdapter;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.unified.UnifiedFullscreenAd;

/* renamed from: io.bidmachine.rewarded.RewardedAd */
public final class RewardedAd extends FullScreenAd<RewardedAd, RewardedRequest, FullScreenAdObject<RewardedRequest>, RewardedListener> {
    public RewardedAd(Context context) {
        super(context, AdsType.Rewarded);
    }

    /* access modifiers changed from: protected */
    public FullScreenAdObject<RewardedRequest> createAdObject(ContextProvider contextProvider, RewardedRequest rewardedRequest, NetworkAdapter networkAdapter, AdObjectParams adObjectParams, AdProcessCallback adProcessCallback) {
        UnifiedFullscreenAd createRewarded = networkAdapter.createRewarded();
        if (createRewarded == null) {
            return null;
        }
        return new FullScreenAdObject(contextProvider, adProcessCallback, rewardedRequest, adObjectParams, createRewarded);
    }
}
