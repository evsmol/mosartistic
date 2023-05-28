package p150io.bidmachine.ads.networks.vast;

import com.explorestack.iab.utils.Logger;
import com.explorestack.iab.vast.VastLog;
import com.explorestack.iab.vast.VideoType;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.InitializationParams;
import p150io.bidmachine.NetworkAdapter;
import p150io.bidmachine.NetworkConfigParams;
import p150io.bidmachine.NetworkInitializationCallback;
import p150io.bidmachine.measurer.OMSDKSettings;
import p150io.bidmachine.unified.UnifiedFullscreenAd;
import p150io.bidmachine.unified.UnifiedRichMediaAd;

/* renamed from: io.bidmachine.ads.networks.vast.VastAdapter */
public class VastAdapter extends NetworkAdapter {
    public static final String ADAPTER_SDK_VERSION_NAME = "1.3.0";
    public static final String ADAPTER_VERSION_NAME = "2.1.5.1";
    public static final String KEY = "vast";

    /* access modifiers changed from: protected */
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        return false;
    }

    public VastAdapter() {
        super("vast", "1.3.0", "2.1.5.1", 1, new AdsType[]{AdsType.Interstitial, AdsType.Rewarded, AdsType.RichMedia});
    }

    public void setLogging(boolean z) throws Throwable {
        VastLog.setLoggingLevel(z ? Logger.LogLevel.debug : Logger.LogLevel.none);
    }

    /* access modifiers changed from: protected */
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        OMSDKSettings.initialize(contextProvider.getContext());
        networkInitializationCallback.onSuccess();
    }

    public UnifiedRichMediaAd createRichMedia() {
        return new VastRichMediaAd();
    }

    public UnifiedFullscreenAd createInterstitial() {
        return new VastFullScreenAd(VideoType.NonRewarded);
    }

    public UnifiedFullscreenAd createRewarded() {
        return new VastFullScreenAd(VideoType.Rewarded);
    }
}
