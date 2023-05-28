package p150io.bidmachine.interstitial;

import com.explorestack.protobuf.adcom.Placement;
import p150io.bidmachine.AdContentType;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.FullScreenAdRequestParameters;
import p150io.bidmachine.utils.ProtoUtils;

/* renamed from: io.bidmachine.interstitial.InterstitialAdRequestParameters */
public class InterstitialAdRequestParameters extends FullScreenAdRequestParameters {
    public InterstitialAdRequestParameters(AdContentType adContentType) {
        super(AdsType.Interstitial, adContentType);
    }

    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return ProtoUtils.isInterstitialPlacement(placement);
    }
}
