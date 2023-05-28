package com.appodeal.ads.adapters.meta;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.AppodealNetworks;
import com.appodeal.ads.NetworkInitializationListener;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.meta.C9060a;
import com.appodeal.ads.adapters.meta.banner.C9062a;
import com.appodeal.ads.adapters.meta.interstitial.C9064a;
import com.appodeal.ads.adapters.meta.mrec.C9066a;
import com.appodeal.ads.adapters.meta.native_ad.C9068a;
import com.appodeal.ads.adapters.meta.rewarded_video.C9073a;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.utils.ActivityRule;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;

public class MetaNetwork extends AdNetwork<RequestParams> {
    private static final C9060a initializer = new C9060a();

    public static final class RequestParams {
        public final String metaKey;

        public RequestParams(String str) {
            this.metaKey = str;
        }
    }

    /* renamed from: com.appodeal.ads.adapters.meta.MetaNetwork$a */
    public class C9059a implements C9060a.C9061a {

        /* renamed from: a */
        public final /* synthetic */ NetworkInitializationListener f22871a;

        /* renamed from: b */
        public final /* synthetic */ RequestParams f22872b;

        public C9059a(NetworkInitializationListener networkInitializationListener, RequestParams requestParams) {
            this.f22871a = networkInitializationListener;
            this.f22872b = requestParams;
        }

        /* renamed from: a */
        public final void mo59434a() {
            this.f22871a.onInitializationFailed(LoadingError.InternalError);
        }

        /* renamed from: b */
        public final void mo59435b() {
            try {
                this.f22871a.onInitializationFinished(this.f22872b);
            } catch (Exception unused) {
                this.f22871a.onInitializationFailed(LoadingError.InternalError);
            }
        }
    }

    public static class builder extends AdNetworkBuilder {
        public MetaNetwork build() {
            return new MetaNetwork(this, (C9059a) null);
        }

        public ActivityRule[] getAdActivityRules() {
            return new ActivityRule[]{new ActivityRule.Builder("com.facebook.ads.AudienceNetworkActivity").build()};
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return AppodealNetworks.FACEBOOK;
        }
    }

    private MetaNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    public /* synthetic */ MetaNetwork(AdNetworkBuilder adNetworkBuilder, C9059a aVar) {
        this(adNetworkBuilder);
    }

    public static LoadingError mapError(AdError adError) {
        if (adError == null) {
            return null;
        }
        int errorCode = adError.getErrorCode();
        if (errorCode == 2009) {
            return LoadingError.TimeoutError;
        }
        if (errorCode != 2100) {
            if (errorCode != 3001) {
                if (!(errorCode == 6002 || errorCode == 6003)) {
                    if (!(errorCode == 7001 || errorCode == 7002)) {
                        switch (errorCode) {
                            case 1000:
                                return LoadingError.ConnectionError;
                            case 1001:
                            case 1002:
                                break;
                            default:
                                switch (errorCode) {
                                    case 2000:
                                    case 2001:
                                    case 2002:
                                        break;
                                    default:
                                        switch (errorCode) {
                                            case AdError.MISSING_DEPENDENCIES_ERROR:
                                            case AdError.API_NOT_SUPPORTED:
                                                break;
                                            case AdError.NATIVE_AD_IS_NOT_LOADED:
                                                return LoadingError.IncorrectAdunit;
                                            default:
                                                return null;
                                        }
                                }
                        }
                    }
                    return LoadingError.InternalError;
                }
            }
            return LoadingError.NoFill;
        }
        return LoadingError.InvalidAssets;
    }

    private void updateConsent(RestrictedData restrictedData) {
        if (!restrictedData.isUserInCcpaScope()) {
            return;
        }
        if (restrictedData.isUserHasConsent()) {
            AdSettings.setDataProcessingOptions(new String[0]);
        } else {
            AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
        }
    }

    public UnifiedBanner<RequestParams> createBanner() {
        return new C9062a();
    }

    public UnifiedInterstitial<RequestParams> createInterstitial() {
        return new C9064a();
    }

    public UnifiedMrec<RequestParams> createMrec() {
        return new C9066a();
    }

    public UnifiedNative<RequestParams> createNativeAd() {
        return new C9068a();
    }

    public UnifiedRewarded<RequestParams> createRewarded() {
        return new C9073a();
    }

    public String getRecommendedVersion() {
        return "6.11.0";
    }

    public String getVersion() {
        return "6.11.0";
    }

    public void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<RequestParams> networkInitializationListener) {
        RequestParams requestParams = new RequestParams(adUnit.getJsonData().getString("facebook_key"));
        AdSettings.setMixedAudience(adNetworkMediationParams.getRestrictedData().isUserAgeRestricted());
        AdSettings.setTestMode(adNetworkMediationParams.isTestMode());
        if (adNetworkMediationParams.isTestMode()) {
            AdSettings.turnOnSDKDebugger(contextProvider.getApplicationContextOrNull());
            AdSettings.setTestAdType(AdSettings.TestAdType.DEFAULT);
        }
        updateConsent(adNetworkMediationParams.getRestrictedData());
        C9060a aVar = initializer;
        if (!aVar.mo59437a()) {
            aVar.mo59436a(contextProvider.getApplicationContext(), adUnit.getMediatorName(), new C9059a(networkInitializationListener, requestParams));
        } else {
            networkInitializationListener.onInitializationFinished(requestParams);
        }
    }

    public boolean isSupportSmartBanners() {
        return true;
    }
}
