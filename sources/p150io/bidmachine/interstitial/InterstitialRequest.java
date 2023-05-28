package p150io.bidmachine.interstitial;

import java.util.List;
import p150io.bidmachine.AdContentType;
import p150io.bidmachine.AdRequest;
import p150io.bidmachine.CustomParams;
import p150io.bidmachine.FullScreenAdRequest;
import p150io.bidmachine.FullScreenAdRequestParameters;
import p150io.bidmachine.NetworkConfig;
import p150io.bidmachine.PriceFloorParams;
import p150io.bidmachine.SessionAdParams;
import p150io.bidmachine.TargetingParams;
import p150io.bidmachine.models.RequestBuilder;

/* renamed from: io.bidmachine.interstitial.InterstitialRequest */
public final class InterstitialRequest extends FullScreenAdRequest<InterstitialRequest> {

    /* renamed from: io.bidmachine.interstitial.InterstitialRequest$AdRequestListener */
    public interface AdRequestListener extends AdRequest.AdRequestListener<InterstitialRequest> {
    }

    private InterstitialRequest(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }

    /* renamed from: io.bidmachine.interstitial.InterstitialRequest$Builder */
    public static final class Builder extends FullScreenAdRequest.FullScreenRequestBuilder<Builder, InterstitialRequest> {
        public /* bridge */ /* synthetic */ AdRequest build() {
            return super.build();
        }

        public /* bridge */ /* synthetic */ RequestBuilder setBidPayload(String str) {
            return super.setBidPayload(str);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setCustomParams(CustomParams customParams) {
            return super.setCustomParams(customParams);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setListener(AdRequest.AdRequestListener adRequestListener) {
            return super.setListener(adRequestListener);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setLoadingTimeOut(Integer num) {
            return super.setLoadingTimeOut(num);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setNetworks(String str) {
            return super.setNetworks(str);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setNetworks(List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setPlacementId(String str) {
            return super.setPlacementId(str);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setPriceFloorParams(PriceFloorParams priceFloorParams) {
            return super.setPriceFloorParams(priceFloorParams);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setSessionAdParams(SessionAdParams sessionAdParams) {
            return super.setSessionAdParams(sessionAdParams);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setTargetingParams(TargetingParams targetingParams) {
            return super.setTargetingParams(targetingParams);
        }

        public Builder setAdContentType(AdContentType adContentType) {
            return (Builder) super.setAdContentType(adContentType);
        }

        /* access modifiers changed from: protected */
        public FullScreenAdRequestParameters createAdRequestParameters() {
            return new InterstitialAdRequestParameters(this.adContentType);
        }

        /* access modifiers changed from: protected */
        public InterstitialRequest build(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
            return new InterstitialRequest(fullScreenAdRequestParameters);
        }
    }
}
