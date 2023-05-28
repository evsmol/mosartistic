package p150io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.adcom.AdOrBuilder;
import com.explorestack.protobuf.adcom.C1611Ad;
import com.explorestack.protobuf.openrtb.Response;

/* renamed from: io.bidmachine.protobuf.analytics.BidEventOrBuilder */
public interface BidEventOrBuilder extends MessageOrBuilder {
    C1611Ad getAd();

    AdOrBuilder getAdOrBuilder();

    AuctionContext getAuctionContext();

    AuctionContextOrBuilder getAuctionContextOrBuilder();

    Response.Seatbid.Bid getBid();

    Response.Seatbid.BidOrBuilder getBidOrBuilder();

    String getBidid();

    ByteString getBididBytes();

    String getSeat();

    ByteString getSeatBytes();

    String getTimestamp();

    ByteString getTimestampBytes();

    boolean hasAd();

    boolean hasAuctionContext();

    boolean hasBid();
}
