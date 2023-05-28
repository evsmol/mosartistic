package com.appodeal.ads.adapters.notsy;

import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.adapters.notsy.banner.C9090a;
import com.appodeal.ads.adapters.notsy.interstitial.C9091a;
import com.appodeal.ads.adapters.notsy.mrec.C9093a;
import com.appodeal.ads.adapters.notsy.native_ad.C9094a;
import com.appodeal.ads.adapters.notsy.rewarded_video.C9095a;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.util.Iterator;
import org.json.JSONObject;

public class NotsyNetwork extends UnifiedAdmobNetwork<AdManagerAdRequest, AdManagerAdRequest.Builder> {

    public static class builder extends UnifiedAdmobNetwork.builder {
        public NotsyNetwork build() {
            return new NotsyNetwork(this);
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return "notsy";
        }
    }

    public NotsyNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    public AdManagerAdRequest createAdRequest(AdManagerAdRequest.Builder builder2) {
        return builder2.build();
    }

    public AdManagerAdRequest.Builder createAdRequestBuilder(JSONObject jSONObject) {
        AdManagerAdRequest.Builder builder2 = new AdManagerAdRequest.Builder();
        JSONObject optJSONObject = jSONObject.optJSONObject("targeting");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                builder2.addCustomTargeting(next, optJSONObject.optString(next));
            }
        }
        return builder2;
    }

    public UnifiedBanner<UnifiedAdmobRequestParams<AdManagerAdRequest>> createBanner() {
        return new C9090a();
    }

    public UnifiedInterstitial<UnifiedAdmobRequestParams<AdManagerAdRequest>> createInterstitial() {
        return new C9091a();
    }

    public UnifiedMrec<UnifiedAdmobRequestParams<AdManagerAdRequest>> createMrec() {
        return new C9093a();
    }

    public UnifiedNative<UnifiedAdmobRequestParams<AdManagerAdRequest>> createNativeAd() {
        return new C9094a();
    }

    public UnifiedRewarded<UnifiedAdmobRequestParams<AdManagerAdRequest>> createRewarded() {
        return new C9095a();
    }
}
