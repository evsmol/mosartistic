package p150io.bidmachine.ads.networks.notsy;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p150io.bidmachine.AdsFormat;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.HeaderBiddingAdRequestParams;
import p150io.bidmachine.HeaderBiddingAdapter;
import p150io.bidmachine.HeaderBiddingCollectParamsCallback;
import p150io.bidmachine.InitializationParams;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.NetworkConfigParams;
import p150io.bidmachine.NetworkInitializationCallback;
import p150io.bidmachine.ads.networks.notsy.InternalNotsyData;
import p150io.bidmachine.unified.UnifiedAdRequestParams;
import p150io.bidmachine.unified.UnifiedBannerAd;
import p150io.bidmachine.unified.UnifiedFullscreenAd;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.notsy.NotsyAdapter */
class NotsyAdapter extends HeaderBiddingAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    NotsyAdapter() {
        super("notsy", BuildConfig.ADAPTER_SDK_VERSION_NAME, BuildConfig.ADAPTER_VERSION_NAME, 16, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    public UnifiedBannerAd createBanner() {
        return new NotsyBanner();
    }

    public UnifiedFullscreenAd createInterstitial() {
        return new NotsyInterstitial();
    }

    public UnifiedFullscreenAd createRewarded() {
        return new NotsyRewarded();
    }

    /* access modifiers changed from: protected */
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        return NotsyNetwork.isInitialized();
    }

    /* access modifiers changed from: protected */
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        Context applicationContext = contextProvider.getApplicationContext();
        if (!NotsyNetwork.isGAMPresent(applicationContext)) {
            networkInitializationCallback.onFail("GAM is absent or used unsupported version");
            return;
        }
        EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs = networkConfigParams.obtainNetworkMediationConfigs(AdsFormat.values());
        if (obtainNetworkMediationConfigs == null) {
            networkInitializationCallback.onFail("Network mediation configs not found");
            return;
        }
        EnumMap enumMap = new EnumMap(AdsFormat.class);
        for (AdsFormat adsFormat : AdsFormat.values()) {
            List<Map> list = obtainNetworkMediationConfigs.get(adsFormat);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Map map : list) {
                    String str = (String) map.remove("ad_unit_id");
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = (String) map.remove("score");
                        if (!TextUtils.isEmpty(str2)) {
                            String str3 = (String) map.remove("price");
                            if (!TextUtils.isEmpty(str3)) {
                                arrayList.add(new InternalNotsyAdUnit(adsFormat, new InternalNotsyData(str, Float.parseFloat(str2), Float.parseFloat(str3)), map));
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    enumMap.put(adsFormat, arrayList);
                }
            }
        }
        NotsyNetwork.init(applicationContext, enumMap);
        networkInitializationCallback.onSuccess();
    }

    /* access modifiers changed from: protected */
    public void onCollectHeaderBiddingParams(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        Map<String, String> mediationConfig = networkAdUnit.getMediationConfig();
        InternalNotsyData create = InternalNotsyData.Factory.create(mediationConfig);
        if (create == null) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter("InternalNotsyData is null"));
        } else if (!NotsyNetwork.reserveNotsyAd(networkAdUnit, create)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter(String.format("Ad not loaded by this parameters - %s", new Object[]{create})));
        } else {
            headerBiddingCollectParamsCallback.onCollectFinished(new HashMap(mediationConfig));
        }
    }

    public void onLossAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        NotsyNetwork.unReserveNotsyAd(networkAdUnit);
    }

    public void clearAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        NotsyNetwork.unReserveNotsyAd(networkAdUnit);
    }
}
