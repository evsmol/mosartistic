package p150io.bidmachine.ads.networks.notsy;

import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.notsy.InternalNotsyAdPresentListener */
interface InternalNotsyAdPresentListener {
    void onAdClicked();

    void onAdShowFailed(BMError bMError);

    void onAdShown();
}
