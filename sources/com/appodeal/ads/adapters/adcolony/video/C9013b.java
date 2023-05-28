package com.appodeal.ads.adapters.adcolony.video;

import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyZone;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedVideoCallback;

/* renamed from: com.appodeal.ads.adapters.adcolony.video.b */
public final class C9013b extends AdColonyInterstitialListener {

    /* renamed from: a */
    public final UnifiedVideoCallback f22796a;

    /* renamed from: b */
    public final C9012a f22797b;

    public C9013b(UnifiedVideoCallback unifiedVideoCallback, C9012a aVar) {
        this.f22796a = unifiedVideoCallback;
        this.f22797b = aVar;
    }

    public final void onClicked(AdColonyInterstitial adColonyInterstitial) {
        this.f22796a.onAdClicked();
    }

    public final void onClosed(AdColonyInterstitial adColonyInterstitial) {
        this.f22796a.onAdClosed();
    }

    public final void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        this.f22796a.onAdExpired();
    }

    public final void onOpened(AdColonyInterstitial adColonyInterstitial) {
        this.f22796a.onAdShown();
    }

    public final void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
        this.f22797b.f22795a = adColonyInterstitial;
        this.f22796a.onAdLoaded();
    }

    public final void onRequestNotFilled(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            UnifiedVideoCallback unifiedVideoCallback = this.f22796a;
            unifiedVideoCallback.printError("request not filled for zoneId: " + adColonyZone.getZoneID() + ", isValid zone: " + adColonyZone.isValid(), (Object) null);
        }
        this.f22796a.onAdLoadFailed(LoadingError.NoFill);
    }
}
