package p150io.bidmachine.rewarded;

import com.explorestack.protobuf.adcom.Placement;
import p150io.bidmachine.AdContentType;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.FullScreenAdRequestParameters;
import p150io.bidmachine.utils.ProtoUtils;

/* renamed from: io.bidmachine.rewarded.RewardedAdRequestParameters */
public class RewardedAdRequestParameters extends FullScreenAdRequestParameters {
    public RewardedAdRequestParameters(AdContentType adContentType) {
        super(AdsType.Rewarded, adContentType);
    }

    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return ProtoUtils.isRewardedPlacement(placement);
    }
}
