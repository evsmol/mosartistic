package p150io.bidmachine.ads.networks.notsy;

import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.notsy.InternalLoadListener */
interface InternalLoadListener {
    void onAdLoadFailed(InternalNotsyAd internalNotsyAd, BMError bMError);

    void onAdLoaded(InternalNotsyAd internalNotsyAd);
}
