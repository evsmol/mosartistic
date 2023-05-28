package p150io.bidmachine.banner;

import com.explorestack.protobuf.adcom.Placement;
import p150io.bidmachine.AdRequestParameters;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.utils.ProtoUtils;

/* renamed from: io.bidmachine.banner.BannerAdRequestParameters */
public class BannerAdRequestParameters extends AdRequestParameters {
    private final BannerSize bannerSize;

    public BannerAdRequestParameters(BannerSize bannerSize2) {
        super(AdsType.Banner);
        this.bannerSize = bannerSize2;
    }

    public BannerSize getBannerSize() {
        return this.bannerSize;
    }

    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return ProtoUtils.isBannerPlacement(placement, this.bannerSize);
    }

    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof BannerAdRequestParameters) && isParametersMatchedInternal((BannerAdRequestParameters) adRequestParameters);
    }

    private boolean isParametersMatchedInternal(BannerAdRequestParameters bannerAdRequestParameters) {
        return this.bannerSize == bannerAdRequestParameters.bannerSize;
    }
}
