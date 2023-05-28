package com.appodeal.ads.adapters.bidmachine;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.AppodealNetworks;
import com.appodeal.ads.NetworkInitializationListener;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.bidmachine.C9039b;
import com.appodeal.ads.adapters.bidmachine.banner.C9041a;
import com.appodeal.ads.adapters.bidmachine.interstitial.C9045a;
import com.appodeal.ads.adapters.bidmachine.mrec.C9047a;
import com.appodeal.ads.adapters.bidmachine.native_ad.C9049a;
import com.appodeal.ads.adapters.bidmachine.rewarded_video.C9052a;
import com.appodeal.ads.adapters.bidmachine.video.C9054a;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.utils.ActivityRule;
import org.json.JSONArray;
import org.json.JSONObject;
import p150io.bidmachine.BidMachine;
import p150io.bidmachine.CustomParams;
import p150io.bidmachine.PriceFloorParams;
import p150io.bidmachine.TargetingParams;
import p150io.bidmachine.models.AuctionResult;
import p150io.bidmachine.models.RequestBuilder;
import p150io.bidmachine.utils.BMError;

public class BidMachineNetwork extends AdNetwork<RequestParams> {

    public static final class RequestParams {
        public final CustomParams customParams;
        public final String networksConfig;
        public final PriceFloorParams priceFloorParams;
        public final TargetingParams targetingParams;

        public RequestParams(TargetingParams targetingParams2, PriceFloorParams priceFloorParams2, CustomParams customParams2, String str) {
            this.priceFloorParams = priceFloorParams2;
            this.targetingParams = targetingParams2;
            this.customParams = customParams2;
            this.networksConfig = str;
        }

        public <T extends RequestBuilder<T, ?>> T prepareRequest(T t) {
            t.setTargetingParams(this.targetingParams);
            t.setPriceFloorParams(this.priceFloorParams);
            t.setNetworks(this.networksConfig);
            t.setCustomParams(this.customParams);
            return t;
        }
    }

    /* renamed from: com.appodeal.ads.adapters.bidmachine.BidMachineNetwork$a */
    public class C9036a implements C9039b.C9040a {

        /* renamed from: a */
        public final /* synthetic */ TargetingParams f22838a;

        /* renamed from: b */
        public final /* synthetic */ PriceFloorParams f22839b;

        /* renamed from: c */
        public final /* synthetic */ CustomParams f22840c;

        /* renamed from: d */
        public final /* synthetic */ JSONArray f22841d;

        /* renamed from: e */
        public final /* synthetic */ NetworkInitializationListener f22842e;

        public C9036a(TargetingParams targetingParams, PriceFloorParams priceFloorParams, CustomParams customParams, JSONArray jSONArray, NetworkInitializationListener networkInitializationListener) {
            this.f22838a = targetingParams;
            this.f22839b = priceFloorParams;
            this.f22840c = customParams;
            this.f22841d = jSONArray;
            this.f22842e = networkInitializationListener;
        }

        public final void onInitializationFailed(LoadingError loadingError) {
            this.f22842e.onInitializationFailed(loadingError);
        }

        public final void onInitializationFinished() {
            TargetingParams targetingParams = this.f22838a;
            PriceFloorParams priceFloorParams = this.f22839b;
            CustomParams customParams = this.f22840c;
            JSONArray jSONArray = this.f22841d;
            try {
                this.f22842e.onInitializationFinished(new RequestParams(targetingParams, priceFloorParams, customParams, jSONArray != null ? jSONArray.toString() : null));
            } catch (Exception e) {
                e.printStackTrace();
                this.f22842e.onInitializationFailed(LoadingError.InternalError);
            }
        }
    }

    public static class builder extends AdNetworkBuilder {
        public ActivityRule[] getAdActivityRules() {
            return new ActivityRule[]{new ActivityRule.Builder("io.bidmachine.nativead.view.VideoPlayerActivity").build(), new ActivityRule.Builder("com.explorestack.iab.mraid.MraidActivity").build(), new ActivityRule.Builder("com.explorestack.iab.vast.activity.VastActivity").build()};
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return AppodealNetworks.BIDMACHINE;
        }

        public BidMachineNetwork build() {
            return new BidMachineNetwork(this, (C9036a) null);
        }
    }

    public /* synthetic */ BidMachineNetwork(AdNetworkBuilder adNetworkBuilder, C9036a aVar) {
        this(adNetworkBuilder);
    }

    public static Bundle getRequestedAdInfo(AuctionResult auctionResult) {
        if (auctionResult == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        String str = auctionResult.getNetworkParams().get("appodeal_id");
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("id", str);
        }
        bundle.putString("demand_source", auctionResult.getDemandSource());
        bundle.putDouble("ecpm", auctionResult.getPrice());
        return bundle;
    }

    public static LoadingError mapBidMachineError(BMError bMError) {
        if (bMError != null) {
            if (BMError.NoConnection.getCode() == bMError.getCode()) {
                return LoadingError.ConnectionError;
            }
            if (BMError.TimeoutError.getCode() == bMError.getCode()) {
                return LoadingError.TimeoutError;
            }
            if (103 == bMError.getCode()) {
                return LoadingError.NoFill;
            }
            if (101 == bMError.getCode()) {
                return LoadingError.IncorrectAdunit;
            }
            if (108 == bMError.getCode()) {
                return LoadingError.InternalError;
            }
            if (BMError.Server.getCode() == bMError.getCode()) {
                return LoadingError.ServerError;
            }
            if (BMError.AlreadyShown.getCode() == bMError.getCode()) {
                return LoadingError.ShowFailed;
            }
            if (BMError.Destroyed.getCode() == bMError.getCode()) {
                return LoadingError.ShowFailed;
            }
            if (BMError.Expired.getCode() == bMError.getCode()) {
                return LoadingError.ShowFailed;
            }
            if (110 == bMError.getCode()) {
                return LoadingError.RequestError;
            }
        }
        return LoadingError.InternalError;
    }

    public static void printError(UnifiedAdCallback unifiedAdCallback, BMError bMError) {
        if (bMError != null) {
            unifiedAdCallback.printError(bMError.getMessage(), Integer.valueOf(bMError.getCode()));
        }
    }

    public UnifiedBanner<RequestParams> createBanner() {
        return new C9041a();
    }

    public UnifiedInterstitial<RequestParams> createInterstitial() {
        return new C9045a();
    }

    public UnifiedMrec<RequestParams> createMrec() {
        return new C9047a();
    }

    public UnifiedNative<RequestParams> createNativeAd() {
        return new C9049a();
    }

    public UnifiedRewarded<RequestParams> createRewarded() {
        return new C9052a();
    }

    public UnifiedVideo<RequestParams> createVideo() {
        return new C9054a();
    }

    public String getRecommendedVersion() {
        return "2.1.5";
    }

    public String getVersion() {
        return "2.1.5";
    }

    public void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<RequestParams> networkInitializationListener) {
        JSONObject jsonData = adUnit.getJsonData();
        Context applicationContext = contextProvider.getApplicationContext();
        if (jsonData == null) {
            networkInitializationListener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        C9039b.m27133a().mo59420a(applicationContext, jsonData, adNetworkMediationParams, new C9036a(C9043c.m27143a(applicationContext, jsonData, adNetworkMediationParams.getRestrictedData()), C9043c.m27142a(jsonData.optString("price_floors")), C9043c.m27141a(jsonData.optJSONObject("custom_parameters")), jsonData.optJSONArray("mediation_config"), networkInitializationListener));
    }

    public void setLogging(boolean z) {
        BidMachine.setLoggingEnabled(z);
    }

    private BidMachineNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }
}
