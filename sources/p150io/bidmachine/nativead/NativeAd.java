package p150io.bidmachine.nativead;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import p150io.bidmachine.AdProcessCallback;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.BidMachineAd;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.ImageData;
import p150io.bidmachine.NetworkAdapter;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.nativead.view.NativeMediaView;
import p150io.bidmachine.unified.UnifiedNativeAd;
import p150io.bidmachine.unified.UnifiedNativeAdRequestParams;

/* renamed from: io.bidmachine.nativead.NativeAd */
public final class NativeAd extends BidMachineAd<NativeAd, NativeRequest, NativeAdObject, AdObjectParams, UnifiedNativeAdRequestParams, NativeListener> implements NativeContainer, NativePublicData {
    public NativeAd(Context context) {
        super(context, AdsType.Native);
    }

    /* access modifiers changed from: protected */
    public NativeAdObject createAdObject(ContextProvider contextProvider, NativeRequest nativeRequest, NetworkAdapter networkAdapter, AdObjectParams adObjectParams, AdProcessCallback adProcessCallback) {
        UnifiedNativeAd createNativeAd = networkAdapter.createNativeAd();
        if (createNativeAd == null) {
            return null;
        }
        return new NativeAdObject(contextProvider, adProcessCallback, nativeRequest, adObjectParams, createNativeAd);
    }

    public String getTitle() {
        if (hasLoadedObject()) {
            return ((NativeAdObject) getLoadedAdObject()).getTitle();
        }
        return null;
    }

    public String getDescription() {
        if (hasLoadedObject()) {
            return ((NativeAdObject) getLoadedAdObject()).getDescription();
        }
        return null;
    }

    public String getCallToAction() {
        if (hasLoadedObject()) {
            return ((NativeAdObject) getLoadedAdObject()).getCallToAction();
        }
        return null;
    }

    public float getRating() {
        if (hasLoadedObject()) {
            return ((NativeAdObject) getLoadedAdObject()).getRating();
        }
        return -1.0f;
    }

    public ImageData getIcon() {
        if (hasLoadedObject()) {
            return ((NativeAdObject) getLoadedAdObject()).getIcon();
        }
        return null;
    }

    public ImageData getMainImage() {
        if (hasLoadedObject()) {
            return ((NativeAdObject) getLoadedAdObject()).getMainImage();
        }
        return null;
    }

    public boolean hasVideo() {
        return hasLoadedObject() && ((NativeAdObject) getLoadedAdObject()).hasVideo();
    }

    public View getProviderView(Context context) {
        if (hasLoadedObject()) {
            return ((NativeAdObject) getLoadedAdObject()).getProviderView(context);
        }
        return null;
    }

    public void registerView(ViewGroup viewGroup, View view, NativeMediaView nativeMediaView, Set<View> set) {
        if (hasLoadedObject()) {
            ((NativeAdObject) getLoadedAdObject()).registerView(viewGroup, view, nativeMediaView, set);
        }
    }

    public void unregisterView() {
        if (hasLoadedObject()) {
            ((NativeAdObject) getLoadedAdObject()).unregisterView();
        }
    }

    public boolean isViewRegistered() {
        return hasLoadedObject() && ((NativeAdObject) getLoadedAdObject()).isViewRegistered();
    }

    private boolean hasLoadedObject() {
        if (getLoadedAdObject() != null) {
            return true;
        }
        log("not loaded, please load ads first");
        return false;
    }
}
