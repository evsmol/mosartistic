package p150io.bidmachine;

import p150io.bidmachine.IAd;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.AdListener */
public interface AdListener<AdType extends IAd> {
    void onAdClicked(AdType adtype);

    void onAdExpired(AdType adtype);

    void onAdImpression(AdType adtype);

    void onAdLoadFailed(AdType adtype, BMError bMError);

    void onAdLoaded(AdType adtype);
}
