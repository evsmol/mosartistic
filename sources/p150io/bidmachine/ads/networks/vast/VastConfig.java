package p150io.bidmachine.ads.networks.vast;

import java.util.Map;
import p150io.bidmachine.NetworkAdapter;
import p150io.bidmachine.NetworkConfig;

/* renamed from: io.bidmachine.ads.networks.vast.VastConfig */
public class VastConfig extends NetworkConfig {
    public VastConfig() {
        super("vast", (Map<String, String>) null);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new VastAdapter();
    }
}
