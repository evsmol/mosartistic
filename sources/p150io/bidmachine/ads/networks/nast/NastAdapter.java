package p150io.bidmachine.ads.networks.nast;

import p150io.bidmachine.AdsType;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.InitializationParams;
import p150io.bidmachine.NetworkAdapter;
import p150io.bidmachine.NetworkConfigParams;
import p150io.bidmachine.NetworkInitializationCallback;
import p150io.bidmachine.unified.UnifiedNativeAd;

/* renamed from: io.bidmachine.ads.networks.nast.NastAdapter */
public class NastAdapter extends NetworkAdapter {
    public static final String ADAPTER_SDK_VERSION_NAME = "1.0";
    public static final String ADAPTER_VERSION_NAME = "2.1.5.1";
    public static final String KEY = "nast";

    /* access modifiers changed from: protected */
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        return false;
    }

    public NastAdapter() {
        super("nast", "1.0", "2.1.5.1", 1, new AdsType[]{AdsType.Native});
    }

    /* access modifiers changed from: protected */
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        networkInitializationCallback.onSuccess();
    }

    public UnifiedNativeAd createNativeAd() {
        return new NastNative();
    }
}
