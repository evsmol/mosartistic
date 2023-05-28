package p150io.bidmachine.unified;

import p150io.bidmachine.ContextProvider;

/* renamed from: io.bidmachine.unified.UnifiedFullscreenAd */
public abstract class UnifiedFullscreenAd extends UnifiedAd<UnifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams> {
    public void onClosed(boolean z) {
    }

    public void onFinished() {
    }

    public abstract void show(ContextProvider contextProvider, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable;
}
