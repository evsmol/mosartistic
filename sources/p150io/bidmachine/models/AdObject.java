package p150io.bidmachine.models;

import p150io.bidmachine.AdProcessCallback;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.unified.UnifiedAdCallback;
import p150io.bidmachine.unified.UnifiedAdRequestParams;

/* renamed from: io.bidmachine.models.AdObject */
public interface AdObject<AdObjectParamsType extends AdObjectParams, UnifiedAdRequestParamsType extends UnifiedAdRequestParams, UnifiedAdCallbackType extends UnifiedAdCallback> {
    UnifiedAdCallbackType createUnifiedCallback(AdProcessCallback adProcessCallback);

    AdObjectParamsType getParams();

    void hide();

    void load(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, NetworkAdUnit networkAdUnit) throws Throwable;

    void onClicked();

    void onClosed(boolean z);

    void onDestroy();

    void onExpired();

    void onFinished();

    void onImpression();

    void onShowFailed();

    void onShown();
}
