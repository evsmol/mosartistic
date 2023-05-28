package p150io.bidmachine.displays;

import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.C1611Ad;
import java.util.Collection;
import java.util.List;
import p150io.bidmachine.AdContentType;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.NetworkConfig;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import p150io.bidmachine.unified.UnifiedAdRequestParams;

/* renamed from: io.bidmachine.displays.PlacementBuilder */
public abstract class PlacementBuilder<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {
    private final AdContentType contentType;
    private final HeaderBiddingPlacementBuilder<UnifiedAdRequestParamsType> headerBiddingPlacementBuilder = new HeaderBiddingPlacementBuilder<>();

    public abstract AdObjectParams createAdObjectParams(C1611Ad ad);

    public abstract Message.Builder createPlacement(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, int i) throws Exception;

    PlacementBuilder(AdContentType adContentType) {
        this.contentType = adContentType;
    }

    public AdContentType getAdContentType() {
        return this.contentType;
    }

    public HeaderBiddingAd obtainHeaderBiddingAd(C1611Ad ad) {
        return this.headerBiddingPlacementBuilder.obtainHeaderBiddingAd(ad);
    }

    /* access modifiers changed from: package-private */
    public Message.Builder createHeaderBiddingPlacement(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, int i) {
        return this.headerBiddingPlacementBuilder.createPlacement(contextProvider, unifiedadrequestparamstype, adsType, getAdContentType(), collection, list, i);
    }

    /* access modifiers changed from: package-private */
    public AdObjectParams createHeaderBiddingAdObjectParams(C1611Ad ad) {
        return this.headerBiddingPlacementBuilder.createAdObjectParams(ad);
    }
}
