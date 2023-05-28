package p150io.bidmachine.ads.networks.vast;

import android.content.Context;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.VastRequestListener;
import com.explorestack.iab.vast.activity.VastView;
import p150io.bidmachine.unified.UnifiedBannerAdCallback;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.vast.VastRichMediaAdLoadListener */
class VastRichMediaAdLoadListener implements VastRequestListener {
    private final UnifiedBannerAdCallback callback;
    private final VastView vastView;

    VastRichMediaAdLoadListener(UnifiedBannerAdCallback unifiedBannerAdCallback, VastView vastView2) {
        this.callback = unifiedBannerAdCallback;
        this.vastView = vastView2;
    }

    public void onVastLoaded(VastRequest vastRequest) {
        this.callback.onAdLoaded(this.vastView);
    }

    public void onVastError(Context context, VastRequest vastRequest, int i) {
        if (i == 4) {
            this.callback.onAdExpired();
        } else {
            this.callback.onAdLoadFailed(BMError.noFill());
        }
    }
}
