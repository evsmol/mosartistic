package p150io.bidmachine.unified;

import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.unified.UnifiedAdCallback */
public interface UnifiedAdCallback {
    void onAdClicked();

    void onAdExpired();

    void onAdLoadFailed(BMError bMError);

    void onAdShowFailed(BMError bMError);

    void onAdShown();
}
