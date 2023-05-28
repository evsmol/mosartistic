package p150io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;
import p150io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;

/* renamed from: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder */
public interface HeaderBiddingPlacementOrBuilder extends MessageOrBuilder {
    HeaderBiddingPlacement.AdUnit getAdUnits(int i);

    int getAdUnitsCount();

    List<HeaderBiddingPlacement.AdUnit> getAdUnitsList();

    HeaderBiddingPlacement.AdUnitOrBuilder getAdUnitsOrBuilder(int i);

    List<? extends HeaderBiddingPlacement.AdUnitOrBuilder> getAdUnitsOrBuilderList();
}
