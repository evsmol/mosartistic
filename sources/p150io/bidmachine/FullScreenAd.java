package p150io.bidmachine;

import android.content.Context;
import p150io.bidmachine.AdListener;
import p150io.bidmachine.FullScreenAd;
import p150io.bidmachine.FullScreenAdObject;
import p150io.bidmachine.FullScreenAdRequest;
import p150io.bidmachine.core.Logger;
import p150io.bidmachine.core.Utils;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.FullScreenAd */
public abstract class FullScreenAd<SelfType extends FullScreenAd<SelfType, AdRequestType, AdObjectType, ListenerType>, AdRequestType extends FullScreenAdRequest<AdRequestType>, AdObjectType extends FullScreenAdObject<AdRequestType>, ListenerType extends AdListener<SelfType>> extends BidMachineAd<SelfType, AdRequestType, AdObjectType, AdObjectParams, UnifiedFullscreenAdRequestParams, ListenerType> {
    protected FullScreenAd(Context context, AdsType adsType) {
        super(context, adsType);
    }

    public void show() {
        if (!Utils.isNetworkAvailable(getContext())) {
            processShowFail(BMError.NoConnection);
            return;
        }
        FullScreenAdObject fullScreenAdObject = (FullScreenAdObject) prepareShow();
        if (fullScreenAdObject != null) {
            try {
                fullScreenAdObject.show(getContextProvider());
            } catch (Throwable th) {
                Logger.log(th);
                processShowFail(BMError.internal("Exception when showing fullscreen object"));
            }
        }
    }

    public boolean canShow() {
        return super.canShow() && Utils.isNetworkAvailable(getContext());
    }
}
