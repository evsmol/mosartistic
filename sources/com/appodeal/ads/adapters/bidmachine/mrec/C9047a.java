package com.appodeal.ads.adapters.bidmachine.mrec;

import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import p150io.bidmachine.banner.BannerListener;
import p150io.bidmachine.banner.BannerRequest;
import p150io.bidmachine.banner.BannerSize;
import p150io.bidmachine.banner.BannerView;
import p150io.bidmachine.utils.BMError;

/* renamed from: com.appodeal.ads.adapters.bidmachine.mrec.a */
/* compiled from: BidMachineMrec */
public final class C9047a extends UnifiedMrec<BidMachineNetwork.RequestParams> {

    /* renamed from: a */
    public BannerView f22856a;

    /* renamed from: b */
    public BannerRequest f22857b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.mrec.a$a */
    /* compiled from: BidMachineMrec */
    public static class C9048a implements BannerListener {

        /* renamed from: a */
        public final UnifiedMrecCallback f22858a;

        public C9048a(UnifiedMrecCallback unifiedMrecCallback) {
            this.f22858a = unifiedMrecCallback;
        }

        public final void onAdClicked(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f22858a.onAdClicked();
        }

        public final void onAdExpired(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f22858a.onAdExpired();
        }

        public final /* bridge */ /* synthetic */ void onAdImpression(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            BannerView bannerView = (BannerView) iAd;
            BidMachineNetwork.printError(this.f22858a, bMError);
            this.f22858a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            BannerView bannerView = (BannerView) iAd;
            this.f22858a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(bannerView.getAuctionResult()));
            this.f22858a.onAdLoaded(bannerView);
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedMrecParams unifiedMrecParams = (UnifiedMrecParams) unifiedAdParams;
        this.f22857b = (BannerRequest) ((BannerRequest.Builder) ((BidMachineNetwork.RequestParams) obj).prepareRequest(new BannerRequest.Builder())).setSize(BannerSize.Size_300x250).build();
        BannerView bannerView = new BannerView(contextProvider.getApplicationContext());
        this.f22856a = bannerView;
        bannerView.setListener(new C9048a((UnifiedMrecCallback) unifiedAdCallback));
        this.f22856a.load(this.f22857b);
    }

    public final void onDestroy() {
        BannerRequest bannerRequest = this.f22857b;
        if (bannerRequest != null) {
            bannerRequest.destroy();
            this.f22857b = null;
        }
        BannerView bannerView = this.f22856a;
        if (bannerView != null) {
            bannerView.destroy();
            this.f22856a = null;
        }
    }

    public final void onMediationLoss(String str, double d) {
        super.onMediationLoss(str, d);
        BannerRequest bannerRequest = this.f22857b;
        if (bannerRequest != null) {
            bannerRequest.notifyMediationLoss(str, Double.valueOf(d));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        BannerRequest bannerRequest = this.f22857b;
        if (bannerRequest != null) {
            bannerRequest.notifyMediationWin();
        }
    }
}
