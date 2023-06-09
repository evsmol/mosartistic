package p150io.bidmachine.displays;

import android.graphics.Point;
import android.text.TextUtils;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.C1611Ad;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p150io.bidmachine.AdContentType;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.Constants;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.NetworkConfig;
import p150io.bidmachine.core.Utils;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.unified.UnifiedAdRequestParams;

/* renamed from: io.bidmachine.displays.DisplayPlacementBuilder */
public class DisplayPlacementBuilder<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> extends PlacementBuilder<UnifiedAdRequestParamsType> implements ISizableDisplayPlacement<UnifiedAdRequestParamsType> {
    private final boolean isFullscreen;

    public DisplayPlacementBuilder(boolean z) {
        super(AdContentType.Static);
        this.isFullscreen = z;
    }

    public Message.Builder createPlacement(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, int i) throws Exception {
        Point size = getSize(contextProvider, unifiedadrequestparamstype);
        Placement.DisplayPlacement.Builder h = Placement.DisplayPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_MRAID_2_0).addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).setW(size.x).setH(size.y);
        if (this.isFullscreen) {
            h.setInstl(true);
            h.setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN);
        }
        Message.Builder createHeaderBiddingPlacement = createHeaderBiddingPlacement(contextProvider, unifiedadrequestparamstype, adsType, collection, list, i);
        if (createHeaderBiddingPlacement != null) {
            h.addExtProto(Any.pack(createHeaderBiddingPlacement.build()));
        }
        return h;
    }

    public Point getSize(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype) {
        return Utils.getScreenSize(contextProvider.getContext());
    }

    public AdObjectParams createAdObjectParams(C1611Ad ad) {
        if (!ad.hasDisplay()) {
            return null;
        }
        AdObjectParams createHeaderBiddingAdObjectParams = createHeaderBiddingAdObjectParams(ad);
        if (createHeaderBiddingAdObjectParams != null) {
            return createHeaderBiddingAdObjectParams;
        }
        C1611Ad.Display display = ad.getDisplay();
        if (TextUtils.isEmpty(display.getAdm())) {
            return null;
        }
        DisplayAdObjectParams displayAdObjectParams = new DisplayAdObjectParams(ad);
        displayAdObjectParams.setCreativeAdm(display.getAdm());
        displayAdObjectParams.setWidth(display.getW());
        displayAdObjectParams.setHeight(display.getH());
        return displayAdObjectParams;
    }
}
