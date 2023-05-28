package p150io.bidmachine;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: io.bidmachine.NetworkAdUnit */
public class NetworkAdUnit {

    /* renamed from: id */
    private final String f12779id;
    private final Map<String, String> mediationConfig;
    private final NetworkAdapter networkAdapter;

    public NetworkAdUnit(NetworkAdapter networkAdapter2) {
        this(networkAdapter2, new HashMap());
    }

    public NetworkAdUnit(NetworkAdapter networkAdapter2, Map<String, String> map) {
        this.f12779id = UUID.randomUUID().toString();
        this.networkAdapter = networkAdapter2;
        this.mediationConfig = map;
    }

    public String getId() {
        return this.f12779id;
    }

    public NetworkAdapter getNetworkAdapter() {
        return this.networkAdapter;
    }

    public Map<String, String> getMediationConfig() {
        return this.mediationConfig;
    }

    public String getNetworkKey() {
        return this.networkAdapter.getKey();
    }

    public String getMediationParameter(String str) {
        return this.mediationConfig.get(str);
    }
}
