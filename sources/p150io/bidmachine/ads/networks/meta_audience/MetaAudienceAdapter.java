package p150io.bidmachine.ads.networks.meta_audience;

import android.text.TextUtils;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import java.util.HashMap;
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
import p150io.bidmachine.models.DataRestrictions;
import p150io.bidmachine.unified.UnifiedAdRequestParams;
import p150io.bidmachine.unified.UnifiedBannerAd;
import p150io.bidmachine.unified.UnifiedFullscreenAd;
import p150io.bidmachine.unified.UnifiedNativeAd;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.meta_audience.MetaAudienceAdapter */
class MetaAudienceAdapter extends HeaderBiddingAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    MetaAudienceAdapter() {
        super(BuildConfig.ADAPTER_NAME, "6.11.0", BuildConfig.ADAPTER_VERSION_NAME, 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded, AdsType.Native});
    }

    public UnifiedBannerAd createBanner() {
        return new MetaAudienceBanner();
    }

    public UnifiedFullscreenAd createInterstitial() {
        return new MetaAudienceInterstitial();
    }

    public UnifiedFullscreenAd createRewarded() {
        return new MetaAudienceRewarded();
    }

    public UnifiedNativeAd createNativeAd() {
        return new MetaAudienceNative();
    }

    /* access modifiers changed from: protected */
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        return AudienceNetworkAds.isInitialized(contextProvider.getApplicationContext());
    }

    /* access modifiers changed from: protected */
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        configure(initializationParams.isTestMode(), initializationParams.getDataRestrictions());
        AudienceNetworkAds.initialize(contextProvider.getApplicationContext());
        networkInitializationCallback.onSuccess();
    }

    /* access modifiers changed from: protected */
    public void onCollectHeaderBiddingParams(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("app_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("app_id"));
            return;
        }
        String mediationParameter2 = networkAdUnit.getMediationParameter("meta_key");
        if (TextUtils.isEmpty(mediationParameter2)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("meta_key"));
            return;
        }
        String bidderToken = BidderTokenProvider.getBidderToken(contextProvider.getApplicationContext());
        if (TextUtils.isEmpty(bidderToken)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("token"));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", mediationParameter);
        hashMap.put("meta_key", mediationParameter2);
        hashMap.put("token", bidderToken);
        headerBiddingCollectParamsCallback.onCollectFinished(hashMap);
    }

    private void configure(boolean z, DataRestrictions dataRestrictions) {
        if (z) {
            AdSettings.setTestAdType(AdSettings.TestAdType.DEFAULT);
        }
        AdSettings.setMediationService(String.format("%s_%s:%s", new Object[]{BidMachine.NAME.toLowerCase(), "2.1.5", getAdapterVersion()}));
        AdSettings.setMixedAudience(dataRestrictions.isUserAgeRestricted());
        if (!dataRestrictions.isUserInCcpaScope()) {
            return;
        }
        if (dataRestrictions.isUserHasCcpaConsent()) {
            AdSettings.setDataProcessingOptions(new String[0]);
        } else {
            AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
        }
    }
}
