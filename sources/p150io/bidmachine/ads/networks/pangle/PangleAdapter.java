package p150io.bidmachine.ads.networks.pangle;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.BidMachine;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.HeaderBiddingAdRequestParams;
import p150io.bidmachine.HeaderBiddingAdapter;
import p150io.bidmachine.HeaderBiddingCollectParamsCallback;
import p150io.bidmachine.InitializationParams;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.NetworkConfigParams;
import p150io.bidmachine.NetworkInitializationCallback;
import p150io.bidmachine.core.AdapterLogger;
import p150io.bidmachine.core.Utils;
import p150io.bidmachine.models.DataRestrictions;
import p150io.bidmachine.unified.UnifiedAdRequestParams;
import p150io.bidmachine.unified.UnifiedBannerAd;
import p150io.bidmachine.unified.UnifiedFullscreenAd;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.pangle.PangleAdapter */
class PangleAdapter extends HeaderBiddingAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    PangleAdapter() {
        super("pangle_sdk", "4.5.0.6", BuildConfig.ADAPTER_VERSION_NAME, 16, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    public UnifiedBannerAd createBanner() {
        return new PangleBannerAd();
    }

    public UnifiedFullscreenAd createInterstitial() {
        return new PangleInterstitialAd();
    }

    public UnifiedFullscreenAd createRewarded() {
        return new PangleRewardedAd();
    }

    /* access modifiers changed from: protected */
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        return TTAdSdk.isInitSuccess();
    }

    /* access modifiers changed from: protected */
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, final NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        Map<String, String> obtainNetworkParams = networkConfigParams.obtainNetworkParams();
        if (obtainNetworkParams == null) {
            networkInitializationCallback.onFail("Network parameters not found");
            return;
        }
        String str = obtainNetworkParams.get("app_id");
        if (TextUtils.isEmpty(str)) {
            networkInitializationCallback.onFail(String.format("%s not provided", new Object[]{"app_id"}));
            return;
        }
        DataRestrictions dataRestrictions = initializationParams.getDataRestrictions();
        final Context applicationContext = contextProvider.getApplicationContext();
        final TTAdConfig build = new TTAdConfig.Builder().appId(str).debug(initializationParams.isTestMode()).coppa(toPangleCoppa(dataRestrictions)).setGDPR(toPangleGDPR(dataRestrictions)).data(createPangleData()).build();
        Utils.onUiThread(new Runnable() {
            public void run() {
                try {
                    TTAdSdk.init(applicationContext, build, new TTAdSdk.InitCallback() {
                        public void success() {
                            networkInitializationCallback.onSuccess();
                        }

                        public void fail(int i, String str) {
                            networkInitializationCallback.onFail(str);
                        }
                    });
                } catch (Throwable th) {
                    AdapterLogger.logThrowable(th);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCollectHeaderBiddingParams(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Exception {
        String mediationParameter = networkAdUnit.getMediationParameter("app_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("app_id"));
            return;
        }
        String mediationParameter2 = networkAdUnit.getMediationParameter("slot_id");
        if (TextUtils.isEmpty(mediationParameter2)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("slot_id"));
            return;
        }
        configure(unifiedAdRequestParams.getDataRestrictions());
        String biddingToken = TTAdSdk.getAdManager().getBiddingToken();
        if (TextUtils.isEmpty(biddingToken)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("network_bid_token"));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", mediationParameter);
        hashMap.put("slot_id", mediationParameter2);
        hashMap.put("network_bid_token", biddingToken);
        headerBiddingCollectParamsCallback.onCollectFinished(hashMap);
    }

    private void configure(DataRestrictions dataRestrictions) {
        TTAdSdk.setCoppa(toPangleCoppa(dataRestrictions));
        TTAdSdk.setGdpr(toPangleGDPR(dataRestrictions));
    }

    private int toPangleCoppa(DataRestrictions dataRestrictions) {
        return dataRestrictions.isUserAgeRestricted() ? 1 : 0;
    }

    private int toPangleGDPR(DataRestrictions dataRestrictions) {
        return dataRestrictions.isUserGdprProtected() ? 1 : 0;
    }

    private String createPangleData() {
        try {
            return new JSONArray().put(new JSONObject().put(AppMeasurementSdk.ConditionalUserProperty.NAME, "mediation").put(AppMeasurementSdk.ConditionalUserProperty.VALUE, BidMachine.NAME)).put(new JSONObject().put(AppMeasurementSdk.ConditionalUserProperty.NAME, "adapter_version").put(AppMeasurementSdk.ConditionalUserProperty.VALUE, "2.1.5")).toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
