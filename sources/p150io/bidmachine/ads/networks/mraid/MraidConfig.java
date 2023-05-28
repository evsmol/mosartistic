package p150io.bidmachine.ads.networks.mraid;

import java.util.Map;
import p150io.bidmachine.NetworkAdapter;
import p150io.bidmachine.NetworkConfig;

/* renamed from: io.bidmachine.ads.networks.mraid.MraidConfig */
public class MraidConfig extends NetworkConfig {
    public MraidConfig() {
        super("mraid", (Map<String, String>) null);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new MraidAdapter();
    }
}
