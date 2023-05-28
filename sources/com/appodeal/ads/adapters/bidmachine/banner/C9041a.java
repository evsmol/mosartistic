package com.appodeal.ads.adapters.bidmachine.banner;

import android.content.Context;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import p150io.bidmachine.banner.BannerListener;
import p150io.bidmachine.banner.BannerRequest;
import p150io.bidmachine.banner.BannerSize;
import p150io.bidmachine.banner.BannerView;
import p150io.bidmachine.utils.BMError;

/* renamed from: com.appodeal.ads.adapters.bidmachine.banner.a */
/* compiled from: BidMachineBanner */
public final class C9041a extends UnifiedBanner<BidMachineNetwork.RequestParams> {

    /* renamed from: a */
    public BannerView f22848a;

    /* renamed from: b */
    public BannerRequest f22849b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.banner.a$a */
    /* compiled from: BidMachineBanner */
    public static class C9042a implements BannerListener {

        /* renamed from: a */
        public final UnifiedBannerCallback f22850a;

        /* renamed from: b */
        public final BannerSize f22851b;

        public C9042a(UnifiedBannerCallback unifiedBannerCallback, BannerSize bannerSize) {
            this.f22850a = unifiedBannerCallback;
            this.f22851b = bannerSize;
        }

        public final void onAdClicked(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f22850a.onAdClicked();
        }

        public final void onAdExpired(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f22850a.onAdExpired();
        }

        public final /* bridge */ /* synthetic */ void onAdImpression(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            BannerView bannerView = (BannerView) iAd;
            BidMachineNetwork.printError(this.f22850a, bMError);
            this.f22850a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f22850a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(bannerView.getAuctionResult()));
            UnifiedBannerCallback unifiedBannerCallback = this.f22850a;
            BannerSize bannerSize = this.f22851b;
            unifiedBannerCallback.onAdLoaded(bannerView, bannerSize.width, bannerSize.height);
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        BannerSize bannerSize;
        BidMachineNetwork.RequestParams requestParams = (BidMachineNetwork.RequestParams) obj;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        Context applicationContext = contextProvider.getApplicationContext();
        if (((UnifiedBannerParams) unifiedAdParams).needLeaderBoard(applicationContext)) {
            bannerSize = BannerSize.Size_728x90;
        } else {
            bannerSize = BannerSize.Size_320x50;
        }
        this.f22849b = (BannerRequest) ((BannerRequest.Builder) requestParams.prepareRequest(new BannerRequest.Builder())).setSize(bannerSize).build();
        BannerView bannerView = new BannerView(applicationContext);
        this.f22848a = bannerView;
        bannerView.setListener(new C9042a(unifiedBannerCallback, bannerSize));
        this.f22848a.load(this.f22849b);
    }

    public final void onDestroy() {
        BannerRequest bannerRequest = this.f22849b;
        if (bannerRequest != null) {
            bannerRequest.destroy();
            this.f22849b = null;
        }
        BannerView bannerView = this.f22848a;
        if (bannerView != null) {
            bannerView.destroy();
            this.f22848a = null;
        }
    }

    public final void onMediationLoss(String str, double d) {
        super.onMediationLoss(str, d);
        BannerRequest bannerRequest = this.f22849b;
        if (bannerRequest != null) {
            bannerRequest.notifyMediationLoss(str, Double.valueOf(d));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        BannerRequest bannerRequest = this.f22849b;
        if (bannerRequest != null) {
            bannerRequest.notifyMediationWin();
        }
    }
}
