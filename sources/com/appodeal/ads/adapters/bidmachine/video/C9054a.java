package com.appodeal.ads.adapters.bidmachine.video;

import android.app.Activity;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;
import p150io.bidmachine.AdContentType;
import p150io.bidmachine.interstitial.InterstitialAd;
import p150io.bidmachine.interstitial.InterstitialListener;
import p150io.bidmachine.interstitial.InterstitialRequest;
import p150io.bidmachine.utils.BMError;

/* renamed from: com.appodeal.ads.adapters.bidmachine.video.a */
/* compiled from: BidMachineVideo */
public final class C9054a extends UnifiedVideo<BidMachineNetwork.RequestParams> {

    /* renamed from: a */
    public InterstitialRequest f22868a;

    /* renamed from: b */
    public InterstitialAd f22869b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.video.a$a */
    /* compiled from: BidMachineVideo */
    public static class C9055a implements InterstitialListener {

        /* renamed from: a */
        public final UnifiedVideoCallback f22870a;

        public C9055a(UnifiedVideoCallback unifiedVideoCallback) {
            this.f22870a = unifiedVideoCallback;
        }

        public final void onAdClicked(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f22870a.onAdClicked();
        }

        public final void onAdClosed(IAd iAd, boolean z) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            if (z) {
                this.f22870a.onAdFinished();
            }
            this.f22870a.onAdClosed();
        }

        public final void onAdExpired(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f22870a.onAdExpired();
        }

        public final void onAdImpression(IAd iAd) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            this.f22870a.onAdShown();
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            BidMachineNetwork.printError(this.f22870a, bMError);
            this.f22870a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            this.f22870a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(((InterstitialAd) iAd).getAuctionResult()));
            this.f22870a.onAdLoaded();
        }

        public final void onAdShowFailed(IAd iAd, BMError bMError) {
            InterstitialAd interstitialAd = (InterstitialAd) iAd;
            BidMachineNetwork.printError(this.f22870a, bMError);
            this.f22870a.onAdShowFailed();
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedVideoParams unifiedVideoParams = (UnifiedVideoParams) unifiedAdParams;
        this.f22868a = (InterstitialRequest) ((InterstitialRequest.Builder) ((BidMachineNetwork.RequestParams) obj).prepareRequest(new InterstitialRequest.Builder())).setAdContentType(AdContentType.Video).build();
        this.f22869b = (InterstitialAd) ((InterstitialAd) new InterstitialAd(contextProvider.getApplicationContext()).setListener(new C9055a((UnifiedVideoCallback) unifiedAdCallback))).load(this.f22868a);
    }

    public final void onDestroy() {
        InterstitialRequest interstitialRequest = this.f22868a;
        if (interstitialRequest != null) {
            interstitialRequest.destroy();
            this.f22868a = null;
        }
        InterstitialAd interstitialAd = this.f22869b;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.f22869b = null;
        }
    }

    public final void onMediationLoss(String str, double d) {
        super.onMediationLoss(str, d);
        InterstitialRequest interstitialRequest = this.f22868a;
        if (interstitialRequest != null) {
            interstitialRequest.notifyMediationLoss(str, Double.valueOf(d));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        InterstitialRequest interstitialRequest = this.f22868a;
        if (interstitialRequest != null) {
            interstitialRequest.notifyMediationWin();
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedVideoCallback unifiedVideoCallback = (UnifiedVideoCallback) unifiedFullscreenAdCallback;
        InterstitialAd interstitialAd = this.f22869b;
        if (interstitialAd == null || !interstitialAd.canShow()) {
            unifiedVideoCallback.onAdShowFailed();
        } else {
            this.f22869b.show();
        }
    }
}
