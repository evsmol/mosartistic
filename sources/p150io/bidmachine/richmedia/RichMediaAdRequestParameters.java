package p150io.bidmachine.richmedia;

import com.explorestack.protobuf.adcom.Placement;
import p150io.bidmachine.AdContentType;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.FullScreenAdRequestParameters;
import p150io.bidmachine.utils.ProtoUtils;

/* renamed from: io.bidmachine.richmedia.RichMediaAdRequestParameters */
public class RichMediaAdRequestParameters extends FullScreenAdRequestParameters {
    public RichMediaAdRequestParameters() {
        super(AdsType.RichMedia, AdContentType.Video);
    }

    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return ProtoUtils.isVideoPlacement(placement);
    }
}
