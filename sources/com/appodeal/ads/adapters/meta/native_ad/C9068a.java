package com.appodeal.ads.adapters.meta.native_ad;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.appodeal.ads.Native;
import com.appodeal.ads.NativeAdView;
import com.appodeal.ads.NativeMediaView;
import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.C1715Ad;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;

/* renamed from: com.appodeal.ads.adapters.meta.native_ad.a */
public final class C9068a extends UnifiedNative<MetaNetwork.RequestParams> {

    /* renamed from: a */
    public C9072d f22885a;

    /* renamed from: com.appodeal.ads.adapters.meta.native_ad.a$a */
    public final class C9069a implements NativeAdListener {

        /* renamed from: a */
        public final UnifiedNativeCallback f22886a;

        public C9069a(UnifiedNativeCallback unifiedNativeCallback) {
            this.f22886a = unifiedNativeCallback;
        }

        public final void onAdClicked(C1715Ad ad) {
            this.f22886a.onAdClicked();
        }

        public final void onAdLoaded(C1715Ad ad) {
            C9068a aVar;
            C9072d bVar;
            try {
                NativeAdBase nativeAdBase = (NativeAdBase) ad;
                String a = C9068a.m27158a(C9068a.this, nativeAdBase.getAdIcon());
                String a2 = C9068a.m27158a(C9068a.this, nativeAdBase.getAdCoverImage());
                if (nativeAdBase instanceof NativeBannerAd) {
                    aVar = C9068a.this;
                    bVar = new C9071c((NativeBannerAd) nativeAdBase, a2, a);
                } else if (nativeAdBase instanceof NativeAd) {
                    aVar = C9068a.this;
                    bVar = new C9070b((NativeAd) nativeAdBase, a2, a);
                } else {
                    this.f22886a.onAdLoadFailed(LoadingError.NoFill);
                    return;
                }
                aVar.f22885a = bVar;
                this.f22886a.onAdLoaded(C9068a.this.f22885a);
            } catch (Exception unused) {
                this.f22886a.onAdLoadFailed(LoadingError.InternalError);
            }
        }

        public final void onError(C1715Ad ad, AdError adError) {
            if (ad != null) {
                ad.destroy();
            }
            if (adError != null) {
                this.f22886a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
            }
            this.f22886a.onAdLoadFailed(MetaNetwork.mapError(adError));
        }

        public final void onLoggingImpression(C1715Ad ad) {
        }

        public final void onMediaDownloaded(C1715Ad ad) {
        }
    }

    /* renamed from: com.appodeal.ads.adapters.meta.native_ad.a$b */
    public static class C9070b extends C9072d<NativeAd> {

        /* renamed from: d */
        public MediaView f22888d;

        public C9070b(NativeAd nativeAd, String str, String str2) {
            super(nativeAd, str, str2);
        }

        public final boolean containsVideo() {
            return hasVideo();
        }

        public final boolean hasVideo() {
            return ((NativeAd) this.f22889a).getAdCreativeType() == NativeAd.AdCreativeType.VIDEO;
        }

        public final boolean onConfigureMediaView(NativeMediaView nativeMediaView) {
            this.f22888d = new MediaView(nativeMediaView.getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            nativeMediaView.removeAllViews();
            nativeMediaView.addView(this.f22888d, layoutParams);
            return true;
        }

        public final void onDestroy() {
            super.onDestroy();
            MediaView mediaView = this.f22888d;
            if (mediaView != null) {
                mediaView.destroy();
                this.f22888d = null;
            }
        }

        public final void onRegisterForInteraction(NativeAdView nativeAdView) {
            super.onRegisterForInteraction(nativeAdView);
            ((NativeAd) this.f22889a).registerViewForInteraction((View) nativeAdView, this.f22888d, this.f22890b, nativeAdView.getClickableViews());
        }
    }

    /* renamed from: com.appodeal.ads.adapters.meta.native_ad.a$c */
    public static class C9071c extends C9072d<NativeBannerAd> {
        public C9071c(NativeBannerAd nativeBannerAd, String str, String str2) {
            super(nativeBannerAd, str, str2);
        }

        public final void onRegisterForInteraction(NativeAdView nativeAdView) {
            super.onRegisterForInteraction(nativeAdView);
            ((NativeBannerAd) this.f22889a).registerViewForInteraction((View) nativeAdView, this.f22890b, nativeAdView.getClickableViews());
        }
    }

    /* renamed from: com.appodeal.ads.adapters.meta.native_ad.a$d */
    public static class C9072d<T extends NativeAdBase> extends UnifiedNativeAd {

        /* renamed from: a */
        public final T f22889a;

        /* renamed from: b */
        public MediaView f22890b;

        /* renamed from: c */
        public NativeAdLayout f22891c;

        public C9072d(T t, String str, String str2) {
            super(t.getAdvertiserName(), t.getAdBodyText(), t.getAdCallToAction(), str, str2);
            this.f22889a = t;
        }

        public final Float getRating() {
            NativeAdBase.Rating adStarRating = this.f22889a.getAdStarRating();
            return (adStarRating == null || adStarRating.getValue() == 0.0d) ? super.getRating() : Float.valueOf((float) adStarRating.getValue());
        }

        public final View obtainIconView(Context context) {
            if (this.f22890b == null) {
                this.f22890b = new MediaView(context);
            }
            return this.f22890b;
        }

        public final View obtainProviderView(Context context) {
            AdOptionsView adOptionsView = new AdOptionsView(context, this.f22889a, (NativeAdLayout) null);
            RelativeLayout relativeLayout = new RelativeLayout(context);
            relativeLayout.addView(adOptionsView, new RelativeLayout.LayoutParams(Math.round(UnifiedAdUtils.getScreenDensity(context) * 20.0f), Math.round(UnifiedAdUtils.getScreenDensity(context) * 20.0f)));
            return relativeLayout;
        }

        public final void onConfigure(NativeAdView nativeAdView) {
            super.onConfigure(nativeAdView);
            NativeAdLayout nativeAdLayout = new NativeAdLayout(nativeAdView.getContext());
            this.f22891c = nativeAdLayout;
            nativeAdView.configureContainer(nativeAdLayout);
        }

        public void onDestroy() {
            super.onDestroy();
            T t = this.f22889a;
            if (t != null) {
                t.destroy();
            }
            MediaView mediaView = this.f22890b;
            if (mediaView != null) {
                mediaView.destroy();
                this.f22890b = null;
            }
            if (this.f22891c != null) {
                this.f22891c = null;
            }
        }

        public void onRegisterForInteraction(NativeAdView nativeAdView) {
            super.onRegisterForInteraction(nativeAdView);
        }

        public final void onUnregisterForInteraction() {
            super.onUnregisterForInteraction();
            this.f22889a.unregisterView();
        }
    }

    /* renamed from: a */
    public static String m27158a(C9068a aVar, NativeAdBase.Image image) {
        aVar.getClass();
        if (image == null) {
            return null;
        }
        return image.getUrl();
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        NativeAdBase nativeAdBase;
        MetaNetwork.RequestParams requestParams = (MetaNetwork.RequestParams) obj;
        UnifiedNativeCallback unifiedNativeCallback = (UnifiedNativeCallback) unifiedAdCallback;
        Context applicationContext = contextProvider.getApplicationContext();
        if (((UnifiedNativeParams) unifiedAdParams).getMediaAssetType() == Native.MediaAssetType.ICON) {
            nativeAdBase = new NativeBannerAd(applicationContext, requestParams.metaKey);
        } else {
            nativeAdBase = new NativeAd(applicationContext, requestParams.metaKey);
        }
        nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new C9069a(unifiedNativeCallback)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).build());
    }

    public final void onDestroy() {
        C9072d dVar = this.f22885a;
        if (dVar != null) {
            dVar.onDestroy();
            this.f22885a = null;
        }
    }
}
