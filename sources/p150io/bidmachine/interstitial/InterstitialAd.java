package p150io.bidmachine.interstitial;

import android.content.Context;
import p150io.bidmachine.AdProcessCallback;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.FullScreenAd;
import p150io.bidmachine.FullScreenAdObject;
import p150io.bidmachine.NetworkAdapter;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.unified.UnifiedFullscreenAd;

/* renamed from: io.bidmachine.interstitial.InterstitialAd */
public final class InterstitialAd extends FullScreenAd<InterstitialAd, InterstitialRequest, FullScreenAdObject<InterstitialRequest>, InterstitialListener> {
    public InterstitialAd(Context context) {
        super(context, AdsType.Interstitial);
    }

    /* access modifiers changed from: protected */
    public FullScreenAdObject<InterstitialRequest> createAdObject(ContextProvider contextProvider, InterstitialRequest interstitialRequest, NetworkAdapter networkAdapter, AdObjectParams adObjectParams, AdProcessCallback adProcessCallback) {
        UnifiedFullscreenAd createInterstitial = networkAdapter.createInterstitial();
        if (createInterstitial == null) {
            return null;
        }
        return new FullScreenAdObject(contextProvider, adProcessCallback, interstitialRequest, adObjectParams, createInterstitial);
    }
}
