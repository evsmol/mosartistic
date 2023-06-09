package p150io.bidmachine;

import java.util.concurrent.atomic.AtomicBoolean;
import p150io.bidmachine.AdObjectImpl;
import p150io.bidmachine.FullScreenAdRequest;
import p150io.bidmachine.core.Logger;
import p150io.bidmachine.core.Utils;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.unified.UnifiedFullscreenAd;
import p150io.bidmachine.unified.UnifiedFullscreenAdCallback;
import p150io.bidmachine.unified.UnifiedFullscreenAdRequestParams;

/* renamed from: io.bidmachine.FullScreenAdObject */
public final class FullScreenAdObject<AdRequestType extends FullScreenAdRequest<AdRequestType>> extends AdObjectImpl<AdRequestType, AdObjectParams, UnifiedFullscreenAd, UnifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams> {
    private final AtomicBoolean isShowing = new AtomicBoolean(false);
    private final ImpressionThresholdTask thresholdTask = new ImpressionThresholdTask() {
        /* access modifiers changed from: package-private */
        public void onTracked() {
            FullScreenAdObject.this.getProcessCallback().processVisibilityTrackerImpression();
        }
    };

    public FullScreenAdObject(ContextProvider contextProvider, AdProcessCallback adProcessCallback, AdRequestType adrequesttype, AdObjectParams adObjectParams, UnifiedFullscreenAd unifiedFullscreenAd) {
        super(contextProvider, adProcessCallback, adrequesttype, adObjectParams, unifiedFullscreenAd);
    }

    public UnifiedFullscreenAdCallback createUnifiedCallback(AdProcessCallback adProcessCallback) {
        return new UnifiedFullscreenAdCallbackImpl(adProcessCallback);
    }

    public void show(ContextProvider contextProvider) throws Throwable {
        if (this.isShowing.get()) {
            Logger.log("Fullscreen ad already showing, please wait until the ad closes");
            return;
        }
        this.isShowing.set(true);
        ((UnifiedFullscreenAd) getUnifiedAd()).show(contextProvider, (UnifiedFullscreenAdCallback) getUnifiedAdCallback());
        getProcessCallback().processFillAd();
    }

    public void onShown() {
        super.onShown();
        startImpressionThresholdTask();
    }

    public void onShowFailed() {
        this.isShowing.set(false);
        super.onShowFailed();
    }

    public void onImpression() {
        super.onImpression();
        cancelImpressionThresholdTask();
    }

    public void onClosed(boolean z) {
        this.isShowing.set(false);
        super.onClosed(z);
        cancelImpressionThresholdTask();
    }

    public void onFinished() {
        super.onFinished();
        cancelImpressionThresholdTask();
    }

    private void startImpressionThresholdTask() {
        this.thresholdTask.start(getParams().getViewabilityTimeThresholdMs());
    }

    private void cancelImpressionThresholdTask() {
        this.thresholdTask.cancel();
    }

    /* renamed from: io.bidmachine.FullScreenAdObject$ImpressionThresholdTask */
    private static abstract class ImpressionThresholdTask implements Runnable {
        /* access modifiers changed from: package-private */
        public abstract void onTracked();

        private ImpressionThresholdTask() {
        }

        /* access modifiers changed from: package-private */
        public void start(long j) {
            Utils.onBackgroundThread(this, j);
        }

        /* access modifiers changed from: package-private */
        public void cancel() {
            Utils.cancelBackgroundThreadTask(this);
        }

        public void run() {
            onTracked();
        }
    }

    /* renamed from: io.bidmachine.FullScreenAdObject$UnifiedFullscreenAdCallbackImpl */
    private static final class UnifiedFullscreenAdCallbackImpl extends AdObjectImpl.BaseUnifiedAdCallback implements UnifiedFullscreenAdCallback {
        UnifiedFullscreenAdCallbackImpl(AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
        }

        public void onAdLoaded() {
            this.processCallback.processLoadSuccess();
        }

        public void onAdFinished() {
            this.processCallback.processFinished();
        }

        public void onAdClosed() {
            this.processCallback.processClosed();
        }
    }
}
