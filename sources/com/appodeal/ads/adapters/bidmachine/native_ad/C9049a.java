package com.appodeal.ads.adapters.bidmachine.native_ad;

import android.widget.RelativeLayout;
import com.appodeal.ads.Native;
import com.appodeal.ads.NativeAdView;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import java.util.ArrayList;
import p150io.bidmachine.MediaAssetType;
import p150io.bidmachine.nativead.NativeAd;
import p150io.bidmachine.nativead.NativeListener;
import p150io.bidmachine.nativead.NativeRequest;
import p150io.bidmachine.nativead.view.NativeAdContentLayout;
import p150io.bidmachine.nativead.view.NativeMediaView;
import p150io.bidmachine.utils.BMError;

/* renamed from: com.appodeal.ads.adapters.bidmachine.native_ad.a */
/* compiled from: BidMachineNative */
public final class C9049a extends UnifiedNative<BidMachineNetwork.RequestParams> {

    /* renamed from: a */
    public NativeRequest f22859a;

    /* renamed from: b */
    public NativeAd f22860b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.native_ad.a$a */
    /* compiled from: BidMachineNative */
    public static class C9050a extends UnifiedNativeAd {

        /* renamed from: a */
        public final NativeAd f22861a;

        /* renamed from: b */
        public NativeAdContentLayout f22862b;

        /* renamed from: c */
        public NativeMediaView f22863c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9050a(NativeAd nativeAd) {
            super(nativeAd.getTitle(), nativeAd.getDescription(), nativeAd.getCallToAction(), nativeAd.getMainImage() != null ? nativeAd.getMainImage().getRemoteUrl() : null, nativeAd.getIcon() != null ? nativeAd.getIcon().getRemoteUrl() : null, nativeAd.getRating() != 0.0f ? Float.valueOf(nativeAd.getRating()) : null);
            this.f22861a = nativeAd;
        }

        public final boolean containsVideo() {
            return this.f22861a.hasVideo();
        }

        public final boolean hasVideo() {
            return this.f22861a.hasVideo();
        }

        public final void onConfigure(NativeAdView nativeAdView) {
            super.onConfigure(nativeAdView);
            NativeAdContentLayout nativeAdContentLayout = new NativeAdContentLayout(nativeAdView.getContext());
            this.f22862b = nativeAdContentLayout;
            nativeAdContentLayout.setTitleView(nativeAdView.getTitleView());
            this.f22862b.setDescriptionView(nativeAdView.getDescriptionView());
            this.f22862b.setIconView(nativeAdView.getNativeIconView());
            this.f22862b.setCallToActionView(nativeAdView.getCallToActionView());
            this.f22862b.setRatingView(nativeAdView.getRatingView());
            this.f22862b.setProviderView(nativeAdView.getProviderView());
            this.f22862b.setMediaView(this.f22863c);
            nativeAdView.configureContainer(this.f22862b);
        }

        public final boolean onConfigureMediaView(com.appodeal.ads.NativeMediaView nativeMediaView) {
            this.f22863c = new NativeMediaView(nativeMediaView.getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            nativeMediaView.removeAllViews();
            nativeMediaView.addView(this.f22863c, layoutParams);
            return true;
        }

        public final void onDestroy() {
            super.onDestroy();
            this.f22861a.destroy();
            NativeAdContentLayout nativeAdContentLayout = this.f22862b;
            if (nativeAdContentLayout != null) {
                nativeAdContentLayout.destroy();
            }
        }

        public final void onRegisterForInteraction(NativeAdView nativeAdView) {
            super.onRegisterForInteraction(nativeAdView);
            NativeAdContentLayout nativeAdContentLayout = this.f22862b;
            if (nativeAdContentLayout != null) {
                nativeAdContentLayout.bind(this.f22861a);
                this.f22862b.registerViewForInteraction(this.f22861a);
            }
        }
    }

    /* renamed from: com.appodeal.ads.adapters.bidmachine.native_ad.a$b */
    /* compiled from: BidMachineNative */
    public static class C9051b implements NativeListener {

        /* renamed from: a */
        public final UnifiedNativeCallback f22864a;

        public C9051b(UnifiedNativeCallback unifiedNativeCallback) {
            this.f22864a = unifiedNativeCallback;
        }

        public final void onAdClicked(IAd iAd) {
            NativeAd nativeAd = (NativeAd) iAd;
            this.f22864a.onAdClicked();
        }

        public final void onAdExpired(IAd iAd) {
            NativeAd nativeAd = (NativeAd) iAd;
            this.f22864a.onAdExpired();
        }

        public final /* bridge */ /* synthetic */ void onAdImpression(IAd iAd) {
            NativeAd nativeAd = (NativeAd) iAd;
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            NativeAd nativeAd = (NativeAd) iAd;
            this.f22864a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            NativeAd nativeAd = (NativeAd) iAd;
            this.f22864a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(nativeAd.getAuctionResult()));
            this.f22864a.onAdLoaded(new C9050a(nativeAd));
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedNativeParams unifiedNativeParams = (UnifiedNativeParams) unifiedAdParams;
        BidMachineNetwork.RequestParams requestParams = (BidMachineNetwork.RequestParams) obj;
        UnifiedNativeCallback unifiedNativeCallback = (UnifiedNativeCallback) unifiedAdCallback;
        ArrayList arrayList = new ArrayList();
        if (Native.NativeAdType.Video == unifiedNativeParams.getNativeAdType()) {
            arrayList.add(MediaAssetType.Video);
        }
        if (unifiedNativeParams.getMediaAssetType() == Native.MediaAssetType.ICON) {
            arrayList.add(MediaAssetType.Icon);
        } else if (unifiedNativeParams.getMediaAssetType() == Native.MediaAssetType.IMAGE) {
            arrayList.add(MediaAssetType.Image);
        } else {
            arrayList.add(MediaAssetType.Icon);
            arrayList.add(MediaAssetType.Image);
        }
        this.f22859a = (NativeRequest) ((NativeRequest.Builder) requestParams.prepareRequest(new NativeRequest.Builder())).setMediaAssetTypes((MediaAssetType[]) arrayList.toArray(new MediaAssetType[0])).build();
        this.f22860b = (NativeAd) ((NativeAd) new NativeAd(contextProvider.getApplicationContext()).setListener(new C9051b(unifiedNativeCallback))).load(this.f22859a);
    }

    public final void onDestroy() {
        NativeRequest nativeRequest = this.f22859a;
        if (nativeRequest != null) {
            nativeRequest.destroy();
            this.f22859a = null;
        }
        NativeAd nativeAd = this.f22860b;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.f22860b = null;
        }
    }

    public final void onMediationLoss(String str, double d) {
        super.onMediationLoss(str, d);
        NativeRequest nativeRequest = this.f22859a;
        if (nativeRequest != null) {
            nativeRequest.notifyMediationLoss(str, Double.valueOf(d));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        NativeRequest nativeRequest = this.f22859a;
        if (nativeRequest != null) {
            nativeRequest.notifyMediationWin();
        }
    }
}
