package com.appodeal.ads.adapters.admob.native_ad;

import android.widget.RelativeLayout;
import com.appodeal.ads.Native;
import com.appodeal.ads.NativeMediaView;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;

public class UnifiedAdmobNative<AdRequestType extends AdRequest> extends UnifiedNative<UnifiedAdmobRequestParams<AdRequestType>> {

    /* renamed from: com.appodeal.ads.adapters.admob.native_ad.UnifiedAdmobNative$a */
    public class C9021a extends AdListener {

        /* renamed from: a */
        public final /* synthetic */ UnifiedNativeCallback f22813a;

        public C9021a(UnifiedNativeCallback unifiedNativeCallback) {
            this.f22813a = unifiedNativeCallback;
        }

        public final void onAdClicked() {
            super.onAdClicked();
            this.f22813a.onAdClicked();
        }

        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            if (loadAdError != null) {
                this.f22813a.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
            }
            this.f22813a.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
        }

        public final void onAdOpened() {
            super.onAdOpened();
            this.f22813a.onAdClicked();
        }
    }

    /* renamed from: com.appodeal.ads.adapters.admob.native_ad.UnifiedAdmobNative$b */
    public static class C9022b extends UnifiedNativeAd {

        /* renamed from: a */
        public final NativeAd f22814a;

        /* renamed from: b */
        public NativeAdView f22815b;

        /* renamed from: c */
        public MediaView f22816c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9022b(com.google.android.gms.ads.nativead.NativeAd r9, java.lang.String r10, java.lang.String r11) {
            /*
                r8 = this;
                java.lang.String r1 = r9.getHeadline()
                java.lang.String r2 = r9.getBody()
                java.lang.String r3 = r9.getCallToAction()
                java.lang.Double r0 = r9.getStarRating()
                if (r0 == 0) goto L_0x002d
                java.lang.Double r0 = r9.getStarRating()
                double r4 = r0.doubleValue()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 == 0) goto L_0x002d
                java.lang.Double r0 = r9.getStarRating()
                float r0 = r0.floatValue()
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                goto L_0x002e
            L_0x002d:
                r0 = 0
            L_0x002e:
                r6 = r0
                r0 = r8
                r4 = r11
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r8.f22814a = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.admob.native_ad.UnifiedAdmobNative.C9022b.<init>(com.google.android.gms.ads.nativead.NativeAd, java.lang.String, java.lang.String):void");
        }

        public final boolean containsVideo() {
            return hasVideo();
        }

        public final boolean hasVideo() {
            if (this.f22814a.getMediaContent() != null) {
                return this.f22814a.getMediaContent().hasVideoContent();
            }
            return false;
        }

        public final void onConfigure(com.appodeal.ads.NativeAdView nativeAdView) {
            super.onConfigure(nativeAdView);
            NativeAdView nativeAdView2 = new NativeAdView(nativeAdView.getContext());
            this.f22815b = nativeAdView2;
            nativeAdView2.setHeadlineView(nativeAdView.getTitleView());
            this.f22815b.setBodyView(nativeAdView.getDescriptionView());
            this.f22815b.setIconView(nativeAdView.getNativeIconView());
            this.f22815b.setCallToActionView(nativeAdView.getCallToActionView());
            this.f22815b.setStarRatingView(nativeAdView.getRatingView());
            this.f22815b.setMediaView(this.f22816c);
            nativeAdView.configureContainer(this.f22815b);
        }

        public final boolean onConfigureMediaView(NativeMediaView nativeMediaView) {
            this.f22816c = new MediaView(nativeMediaView.getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            nativeMediaView.removeAllViews();
            nativeMediaView.addView(this.f22816c, layoutParams);
            return true;
        }

        public final void onDestroy() {
            super.onDestroy();
            this.f22814a.destroy();
            NativeAdView nativeAdView = this.f22815b;
            if (nativeAdView != null) {
                nativeAdView.destroy();
            }
        }

        public final void onRegisterForInteraction(com.appodeal.ads.NativeAdView nativeAdView) {
            super.onRegisterForInteraction(nativeAdView);
            NativeAdView nativeAdView2 = this.f22815b;
            if (nativeAdView2 != null) {
                nativeAdView2.setNativeAd(this.f22814a);
            }
        }
    }

    private boolean isNativeValid(NativeAd nativeAd) {
        return (nativeAd.getHeadline() == null || nativeAd.getBody() == null || nativeAd.getImages().size() <= 0 || nativeAd.getImages().get(0) == null || nativeAd.getIcon() == null || nativeAd.getCallToAction() == null) ? false : true;
    }

    public /* synthetic */ void lambda$load$0$UnifiedAdmobNative(UnifiedNativeCallback unifiedNativeCallback, NativeAd nativeAd) {
        if (isNativeValid(nativeAd)) {
            unifiedNativeCallback.onAdLoaded(new C9022b(nativeAd, nativeAd.getIcon().getUri().toString(), nativeAd.getImages().get(0).getUri().toString()));
            return;
        }
        unifiedNativeCallback.onAdLoadFailed(LoadingError.IncorrectCreative);
    }

    public void load(ContextProvider contextProvider, UnifiedNativeParams unifiedNativeParams, UnifiedAdmobRequestParams<AdRequestType> unifiedAdmobRequestParams, UnifiedNativeCallback unifiedNativeCallback) {
        boolean z = false;
        NativeAdOptions.Builder mediaAspectRatio = new NativeAdOptions.Builder().setReturnUrlsForImageAssets(false).setRequestMultipleImages(false).setMediaAspectRatio(2);
        if (unifiedNativeParams.getNativeAdType() != Native.NativeAdType.NoVideo) {
            VideoOptions.Builder builder = new VideoOptions.Builder();
            Boolean bool = unifiedAdmobRequestParams.isMuted;
            if (bool != null && bool.booleanValue()) {
                z = true;
            }
            mediaAspectRatio.setVideoOptions(builder.setStartMuted(z).build());
        }
        new AdLoader.Builder(contextProvider.getApplicationContext(), unifiedAdmobRequestParams.key).forNativeAd(new NativeAd.OnNativeAdLoadedListener(unifiedNativeCallback) {
            public final /* synthetic */ UnifiedNativeCallback f$1;

            {
                this.f$1 = r2;
            }

            public final void onNativeAdLoaded(NativeAd nativeAd) {
                UnifiedAdmobNative.this.lambda$load$0$UnifiedAdmobNative(this.f$1, nativeAd);
            }
        }).withAdListener(new C9021a(unifiedNativeCallback)).withNativeAdOptions(mediaAspectRatio.build()).build().loadAd((AdRequest) unifiedAdmobRequestParams.request);
    }

    public void onDestroy() {
    }
}
