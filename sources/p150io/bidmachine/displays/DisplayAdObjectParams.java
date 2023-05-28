package p150io.bidmachine.displays;

import com.explorestack.protobuf.adcom.C1611Ad;

/* renamed from: io.bidmachine.displays.DisplayAdObjectParams */
final class DisplayAdObjectParams extends IabAdObjectParams {
    DisplayAdObjectParams(C1611Ad ad) {
        super(ad);
        prepareEvents(ad.getDisplay().getEventList());
    }
}
