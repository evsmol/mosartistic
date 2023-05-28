package p150io.bidmachine;

import p150io.bidmachine.AdRequest;
import p150io.bidmachine.IAd;
import p150io.bidmachine.models.AuctionResult;

/* renamed from: io.bidmachine.IAd */
interface IAd<SelfType extends IAd, AdRequestType extends AdRequest> {
    boolean canShow();

    void destroy();

    AuctionResult getAuctionResult();

    boolean isDestroyed();

    boolean isExpired();

    boolean isLoaded();

    boolean isLoading();

    SelfType load(AdRequestType adrequesttype);
}
