package p150io.bidmachine;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.bidmachine.NetworkConfigParams */
public interface NetworkConfigParams {
    EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(AdsFormat... adsFormatArr);

    Map<String, String> obtainNetworkParams();
}
