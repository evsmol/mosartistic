package p150io.bidmachine.ads.networks.nast;

import android.text.TextUtils;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.ImageDataImpl;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.nativead.NativeNetworkAdapter;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.unified.UnifiedNativeAd;
import p150io.bidmachine.unified.UnifiedNativeAdCallback;
import p150io.bidmachine.unified.UnifiedNativeAdRequestParams;

/* renamed from: io.bidmachine.ads.networks.nast.NastNative */
class NastNative extends UnifiedNativeAd {
    NastNative() {
    }

    public void load(ContextProvider contextProvider, UnifiedNativeAdCallback unifiedNativeAdCallback, UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        NastParams nastParams = new NastParams(unifiedMediationParams);
        if (nastParams.isValid(unifiedNativeAdRequestParams, unifiedNativeAdCallback)) {
            unifiedNativeAdCallback.onAdLoaded(new NastAdapter().setTitle(nastParams.title).setDescription(nastParams.description).setCallToAction(nastParams.callToAction).setRating(nastParams.rating).setIcon(new ImageDataImpl(nastParams.iconUrl)).setMainImage(new ImageDataImpl(nastParams.imageUrl)).setVideoUrl(nastParams.videoUrl).setVideoAdm(nastParams.videoAdm).setClickUrl(nastParams.clickUrl).setNetworkControlLoadingAssets(false));
        }
    }

    /* renamed from: io.bidmachine.ads.networks.nast.NastNative$NastAdapter */
    private static final class NastAdapter extends NativeNetworkAdapter {
        private NastAdapter() {
        }

        public boolean hasVideo() {
            return !TextUtils.isEmpty(getVideoAdm()) || !TextUtils.isEmpty(getVideoUrl());
        }
    }
}
