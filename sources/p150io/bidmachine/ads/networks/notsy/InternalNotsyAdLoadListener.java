package p150io.bidmachine.ads.networks.notsy;

import p150io.bidmachine.ads.networks.notsy.InternalNotsyAd;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.notsy.InternalNotsyAdLoadListener */
interface InternalNotsyAdLoadListener<NotsyAdType extends InternalNotsyAd> {
    void onAdLoadFailed(BMError bMError);

    void onAdLoaded(NotsyAdType notsyadtype);
}
