package p150io.bidmachine.models;

import java.util.Map;
import p150io.bidmachine.CreativeFormat;

/* renamed from: io.bidmachine.models.AuctionResult */
public interface AuctionResult {
    String[] getAdDomains();

    String getCid();

    CreativeFormat getCreativeFormat();

    String getCreativeId();

    Map<String, String> getCustomParams();

    String getDeal();

    String getDemandSource();

    String getId();

    String getNetworkKey();

    Map<String, String> getNetworkParams();

    double getPrice();
}
