package p150io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;
import java.util.Map;
import p150io.bidmachine.protobuf.AdNetwork;

/* renamed from: io.bidmachine.protobuf.AdNetworkOrBuilder */
public interface AdNetworkOrBuilder extends MessageOrBuilder {
    boolean containsCustomParams(String str);

    AdNetwork.AdUnit getAdUnits(int i);

    int getAdUnitsCount();

    List<AdNetwork.AdUnit> getAdUnitsList();

    AdNetwork.AdUnitOrBuilder getAdUnitsOrBuilder(int i);

    List<? extends AdNetwork.AdUnitOrBuilder> getAdUnitsOrBuilderList();

    String getClassName();

    ByteString getClassNameBytes();

    @Deprecated
    Map<String, String> getCustomParams();

    int getCustomParamsCount();

    Map<String, String> getCustomParamsMap();

    String getCustomParamsOrDefault(String str, String str2);

    String getCustomParamsOrThrow(String str);

    String getName();

    ByteString getNameBytes();
}
