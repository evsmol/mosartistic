package p150io.bidmachine;

import android.content.Context;
import android.view.ViewGroup;
import p150io.bidmachine.AdListener;
import p150io.bidmachine.AdRequest;
import p150io.bidmachine.ViewAd;
import p150io.bidmachine.ViewAdObject;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.unified.UnifiedAdRequestParams;

/* renamed from: io.bidmachine.ViewAd */
public abstract class ViewAd<AdType extends ViewAd<AdType, AdRequestType, AdObjectType, UnifiedAdRequestParamsType, AdListenerType>, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends ViewAdObject<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdRequestParamsType extends UnifiedAdRequestParams, AdListenerType extends AdListener<AdType>> extends BidMachineAd<AdType, AdRequestType, AdObjectType, AdObjectParams, UnifiedAdRequestParamsType, AdListenerType> {
    protected ViewAd(Context context, AdsType adsType) {
        super(context, adsType);
    }

    /* access modifiers changed from: package-private */
    public void show(ViewGroup viewGroup) {
        ViewAdObject viewAdObject = (ViewAdObject) prepareShow();
        if (viewAdObject != null) {
            viewAdObject.show(viewGroup);
        }
    }
}
