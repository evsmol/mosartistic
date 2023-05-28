package p150io.bidmachine.ads.networks.nast;

import java.util.Map;
import p150io.bidmachine.NetworkAdapter;
import p150io.bidmachine.NetworkConfig;

/* renamed from: io.bidmachine.ads.networks.nast.NastConfig */
public class NastConfig extends NetworkConfig {
    public NastConfig() {
        super("nast", (Map<String, String>) null);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new NastAdapter();
    }
}
