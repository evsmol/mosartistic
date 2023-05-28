package p150io.bidmachine.ads.networks.pangle;

import java.util.HashMap;
import java.util.Map;
import p150io.bidmachine.AdsFormat;
import p150io.bidmachine.NetworkAdapter;
import p150io.bidmachine.NetworkConfig;

/* renamed from: io.bidmachine.ads.networks.pangle.PangleConfig */
public class PangleConfig extends NetworkConfig {
    static final String KEY_APP_ID = "app_id";
    static final String KEY_BID_PAYLOAD = "bid_payload";
    static final String KEY_BID_TOKEN = "network_bid_token";
    static final String KEY_SLOT_ID = "slot_id";

    public PangleConfig(final String str) {
        this((Map<String, String>) new HashMap<String, String>() {
            {
                put(PangleConfig.KEY_APP_ID, str);
            }
        });
    }

    public PangleConfig(Map<String, String> map) {
        super(BuildConfig.ADAPTER_NAME, map);
    }

    /* access modifiers changed from: protected */
    public NetworkAdapter createNetworkAdapter() {
        return new PangleAdapter();
    }

    public PangleConfig withMediationConfig(AdsFormat adsFormat, final String str) {
        return (PangleConfig) withMediationConfig(adsFormat, new HashMap<String, String>() {
            {
                put(PangleConfig.KEY_SLOT_ID, str);
            }
        });
    }
}
