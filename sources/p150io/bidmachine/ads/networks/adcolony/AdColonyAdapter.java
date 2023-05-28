package p150io.bidmachine.ads.networks.adcolony;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyAppOptions;
import com.adcolony.sdk.AdColonySignalsListener;
import com.applovin.sdk.AppLovinEventParameters;
import com.appnext.base.p264b.C8849c;
import java.util.HashMap;
import java.util.Map;
import p150io.bidmachine.AdsType;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.GeneralParams;
import p150io.bidmachine.HeaderBiddingAdRequestParams;
import p150io.bidmachine.HeaderBiddingAdapter;
import p150io.bidmachine.HeaderBiddingCollectParamsCallback;
import p150io.bidmachine.InitializationParams;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.NetworkConfigParams;
import p150io.bidmachine.NetworkInitializationCallback;
import p150io.bidmachine.core.Utils;
import p150io.bidmachine.models.DataRestrictions;
import p150io.bidmachine.models.TargetingInfo;
import p150io.bidmachine.unified.UnifiedAdRequestParams;
import p150io.bidmachine.unified.UnifiedFullscreenAd;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.adcolony.AdColonyAdapter */
class AdColonyAdapter extends HeaderBiddingAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    AdColonyAdapter() {
        super("adcolony", BuildConfig.ADAPTER_SDK_VERSION_NAME, BuildConfig.ADAPTER_VERSION_NAME, 1, new AdsType[]{AdsType.Interstitial, AdsType.Rewarded});
    }

    public UnifiedFullscreenAd createInterstitial() {
        return new AdColonyFullscreenAd(false);
    }

    public UnifiedFullscreenAd createRewarded() {
        return new AdColonyFullscreenAd(true);
    }

    /* access modifiers changed from: protected */
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        return !TextUtils.isEmpty(AdColony.getSDKVersion());
    }

    /* access modifiers changed from: protected */
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
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
        String str2 = obtainNetworkParams.get(AppLovinEventParameters.IN_APP_PURCHASE_TRANSACTION_IDENTIFIER);
        if (TextUtils.isEmpty(str2)) {
            networkInitializationCallback.onFail(String.format("%s not provided", new Object[]{AppLovinEventParameters.IN_APP_PURCHASE_TRANSACTION_IDENTIFIER}));
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        AdColony.configure((Application) applicationContext, createAppOptions(applicationContext, initializationParams, str2), str);
        networkInitializationCallback.onSuccess();
    }

    /* access modifiers changed from: protected */
    public void onCollectHeaderBiddingParams(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, final HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        final String mediationParameter = networkAdUnit.getMediationParameter("app_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("app_id"));
            return;
        }
        final String mediationParameter2 = networkAdUnit.getMediationParameter("zone_id");
        if (TextUtils.isEmpty(mediationParameter2)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("zone_id"));
            return;
        }
        String mediationParameter3 = networkAdUnit.getMediationParameter(AppLovinEventParameters.IN_APP_PURCHASE_TRANSACTION_IDENTIFIER);
        if (TextUtils.isEmpty(mediationParameter3)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter(AppLovinEventParameters.IN_APP_PURCHASE_TRANSACTION_IDENTIFIER));
            return;
        }
        synchronized (AdColonyAdapter.class) {
            AdColony.setAppOptions(createAppOptions(contextProvider.getContext(), unifiedAdRequestParams, mediationParameter3));
            AdColony.collectSignals(new AdColonySignalsListener() {
                public void onSuccess(String str) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("app_id", mediationParameter);
                    hashMap.put("zone_id", mediationParameter2);
                    hashMap.put(C8849c.DATA, str);
                    headerBiddingCollectParamsCallback.onCollectFinished(hashMap);
                }
            });
        }
    }

    private static AdColonyAppOptions createAppOptions(Context context, GeneralParams generalParams, String str) {
        DataRestrictions dataRestrictions = generalParams.getDataRestrictions();
        TargetingInfo targetingInfo = generalParams.getTargetingInfo();
        AdColonyAppOptions adColonyAppOptions = new AdColonyAppOptions();
        String userId = targetingInfo.getUserId();
        if (userId != null) {
            adColonyAppOptions.setUserID(userId);
        }
        adColonyAppOptions.setOriginStore(str);
        String appVersion = Utils.getAppVersion(context);
        if (!TextUtils.isEmpty(appVersion)) {
            adColonyAppOptions.setAppVersion(appVersion);
        }
        adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.COPPA, dataRestrictions.isUserAgeRestricted());
        adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.GDPR, dataRestrictions.isUserInGdprScope());
        adColonyAppOptions.setPrivacyConsentString(AdColonyAppOptions.GDPR, dataRestrictions.getIABGDPRString());
        String uSPrivacyString = dataRestrictions.getUSPrivacyString();
        if (!TextUtils.isEmpty(uSPrivacyString)) {
            adColonyAppOptions.setPrivacyFrameworkRequired(AdColonyAppOptions.CCPA, dataRestrictions.isUserInCcpaScope());
            adColonyAppOptions.setPrivacyConsentString(AdColonyAppOptions.CCPA, uSPrivacyString);
        }
        adColonyAppOptions.setTestModeEnabled(generalParams.isTestMode());
        return adColonyAppOptions;
    }
}
