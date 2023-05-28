package p150io.bidmachine;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.C1611Ad;
import com.explorestack.protobuf.openrtb.Response;
import java.util.List;
import p150io.bidmachine.core.Logger;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ProtoTransformer */
class ProtoTransformer {

    /* renamed from: io.bidmachine.ProtoTransformer$Listener */
    interface Listener<AdResponse> {
        void onFail(BMError bMError);

        void onSuccess(AdResponse adresponse);
    }

    ProtoTransformer() {
    }

    static void toAdResponse(AdRequestParameters adRequestParameters, List<NetworkAdUnit> list, Response response, Listener<AdResponse> listener) {
        if (response == null || response.getSeatbidCount() == 0) {
            listener.onFail(BMError.notFound(LogConstants.EVENT_RESPONSE));
            return;
        }
        Response.Seatbid seatbid = response.getSeatbid(0);
        if (seatbid == null || seatbid.getBidCount() == 0) {
            listener.onFail(BMError.notFound("Seatbid"));
            return;
        }
        Response.Seatbid.Bid bid = seatbid.getBid(0);
        if (bid == null) {
            listener.onFail(BMError.notFound("Bid"));
            return;
        }
        Any media = bid.getMedia();
        if (media == null) {
            listener.onFail(BMError.notFound("Media"));
        } else if (!media.mo4690is(C1611Ad.class)) {
            listener.onFail(BMError.incorrectContent("Media not valid"));
        } else {
            try {
                C1611Ad ad = (C1611Ad) media.unpack(C1611Ad.class);
                if (ad == null) {
                    listener.onFail(BMError.notFound("Ad"));
                    return;
                }
                NetworkAdapter findNetworkAdapter = adRequestParameters.getAdsType().findNetworkAdapter(ad);
                if (findNetworkAdapter == null) {
                    listener.onFail(BMError.notFound("NetworkAdapter"));
                } else {
                    listener.onSuccess(new AdResponse(adRequestParameters, list, response, seatbid, bid, ad, findNetworkAdapter));
                }
            } catch (Throwable th) {
                Logger.log(th);
                listener.onFail(BMError.incorrectContent("Failed to process response"));
            }
        }
    }
}
