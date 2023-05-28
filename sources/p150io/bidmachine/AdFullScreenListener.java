package p150io.bidmachine;

import p150io.bidmachine.IAd;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.AdFullScreenListener */
public interface AdFullScreenListener<AdType extends IAd> {
    void onAdClosed(AdType adtype, boolean z);

    void onAdShowFailed(AdType adtype, BMError bMError);
}
