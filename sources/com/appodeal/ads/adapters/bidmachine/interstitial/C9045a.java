package com.appodeal.ads.adapters.bidmachine.interstitial;

import android.app.Activity;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import p150io.bidmachine.AdContentType;
import p150io.bidmachine.interstitial.InterstitialAd;
import p150io.bidmachine.interstitial.InterstitialListener;
import p150io.bidmachine.interstitial.InterstitialRequest;
import p150io.bidmachine.utils.BMError;

/* renamed from: com.appodeal.ads.adapters.bidmachine.interstitial.a */
/* compiled from: BidMachineInterstitial */
public final class C9045a extends UnifiedInterstitial<BidMachineNetwork.RequestParams> {

    /* renamed from: a */
    public InterstitialRequest f22853a;

    /* renamed from: b */
    public InterstitialAd f22854b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.interstitial.a$a */
    /* compiled from: BidMachineInterstitial */
    public static class C9046a implements InterstitialListener {

        /* renamed from: a */
        public final UnifiedInterstitialCallback f22855a;

        public C9046a(UnifiedInterstitialCallback unifiedInterstitialCallback) {
            this.f22855a = unifiedInterstitialCallback;
        }

        public final void onAdClicked(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f22855a.onAdClicked();
        }

        public final void onAdClosed(IAd iAd, boolean z) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            if (z) {
                this.f22855a.onAdFinished();
            }
            this.f22855a.onAdClosed();
        }

        public final void onAdExpired(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f22855a.onAdExpired();
        }

        public final void onAdImpression(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f22855a.onAdShown();
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            BidMachineNetwork.printError(this.f22855a, bMError);
            this.f22855a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            this.f22855a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(((InterstitialAd) iAd).getAuctionResult()));
            this.f22855a.onAdLoaded();
        }

        public final void onAdShowFailed(IAd iAd, BMError bMError) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            BidMachineNetwork.printError(this.f22855a, bMError);
            this.f22855a.onAdShowFailed();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedInterstitialParams unifiedInterstitialParams = (UnifiedInterstitialParams) unifiedAdParams;
        this.f22853a = (InterstitialRequest) ((InterstitialRequest.Builder) ((BidMachineNetwork.RequestParams) obj).prepareRequest(new InterstitialRequest.Builder())).setAdContentType(AdContentType.Static).build();
        this.f22854b = (InterstitialAd) ((InterstitialAd) new InterstitialAd(contextProvider.getApplicationContext()).setListener(new C9046a((UnifiedInterstitialCallback) unifiedAdCallback))).load(this.f22853a);
    }

    public final void onDestroy() {
        InterstitialRequest interstitialRequest = this.f22853a;
        if (interstitialRequest != null) {
            interstitialRequest.destroy();
            this.f22853a = null;
        }
        InterstitialAd interstitialAd = this.f22854b;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.f22854b = null;
        }
    }

    public final void onMediationLoss(String str, double d) {
        super.onMediationLoss(str, d);
        InterstitialRequest interstitialRequest = this.f22853a;
        if (interstitialRequest != null) {
            interstitialRequest.notifyMediationLoss(str, Double.valueOf(d));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        InterstitialRequest interstitialRequest = this.f22853a;
        if (interstitialRequest != null) {
            interstitialRequest.notifyMediationWin();
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedFullscreenAdCallback;
        InterstitialAd interstitialAd = this.f22854b;
        if (interstitialAd == null || !interstitialAd.canShow()) {
            unifiedInterstitialCallback.onAdShowFailed();
        } else {
            this.f22854b.show();
        }
    }
}
