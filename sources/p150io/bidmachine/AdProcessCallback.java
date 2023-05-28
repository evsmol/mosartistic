package p150io.bidmachine;

import p150io.bidmachine.unified.UnifiedAd;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.AdProcessCallback */
public interface AdProcessCallback {
    void processBeforeStartVisibilityTracker();

    void processClicked();

    void processClosed();

    void processDestroy();

    void processExpired();

    void processFillAd();

    void processFinished();

    void processLoadFail(BMError bMError);

    void processLoadSuccess();

    void processShowFail(BMError bMError);

    void processShown();

    void processVisibilityTrackerImpression();

    boolean processVisibilityTrackerShown(UnifiedAd<?, ?> unifiedAd);
}
