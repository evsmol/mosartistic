package p150io.bidmachine.unified;

import java.util.concurrent.atomic.AtomicBoolean;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.unified.UnifiedAdCallback;
import p150io.bidmachine.unified.UnifiedAdRequestParams;

/* renamed from: io.bidmachine.unified.UnifiedAd */
public abstract class UnifiedAd<UnifiedAdCallbackType extends UnifiedAdCallback, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {
    private final AtomicBoolean considerNetworkImpressionTracking = new AtomicBoolean(false);

    public abstract void load(ContextProvider contextProvider, UnifiedAdCallbackType unifiedadcallbacktype, UnifiedAdRequestParamsType unifiedadrequestparamstype, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable;

    public void onClicked() {
    }

    public void onDestroy() {
    }

    public void onExpired() {
    }

    public void onImpression() {
    }

    public void onShowFailed() {
    }

    public void onShown() {
    }

    public boolean isConsiderNetworkImpressionTracking() {
        return this.considerNetworkImpressionTracking.get();
    }

    /* access modifiers changed from: protected */
    public final void setConsiderNetworkImpressionTracking(boolean z) {
        this.considerNetworkImpressionTracking.set(z);
    }
}
