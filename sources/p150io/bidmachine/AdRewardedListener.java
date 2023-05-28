package p150io.bidmachine;

import p150io.bidmachine.IAd;

/* renamed from: io.bidmachine.AdRewardedListener */
public interface AdRewardedListener<AdType extends IAd> {
    void onAdRewarded(AdType adtype);
}
