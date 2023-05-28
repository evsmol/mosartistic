package p150io.bidmachine.banner;

import java.util.List;
import p150io.bidmachine.AdRequest;
import p150io.bidmachine.CustomParams;
import p150io.bidmachine.NetworkConfig;
import p150io.bidmachine.PriceFloorParams;
import p150io.bidmachine.SessionAdParams;
import p150io.bidmachine.TargetingParams;
import p150io.bidmachine.UnifiedAdRequestParamsImpl;
import p150io.bidmachine.models.DataRestrictions;
import p150io.bidmachine.models.IBannerRequestBuilder;
import p150io.bidmachine.models.RequestBuilder;
import p150io.bidmachine.unified.UnifiedBannerAdRequestParams;

/* renamed from: io.bidmachine.banner.BannerRequest */
public final class BannerRequest extends AdRequest<BannerRequest, BannerAdRequestParameters, UnifiedBannerAdRequestParams> {

    /* renamed from: io.bidmachine.banner.BannerRequest$AdRequestListener */
    public interface AdRequestListener extends AdRequest.AdRequestListener<BannerRequest> {
    }

    private BannerRequest(BannerAdRequestParameters bannerAdRequestParameters) {
        super(bannerAdRequestParameters);
    }

    public BannerSize getSize() {
        return ((BannerAdRequestParameters) getAdRequestParameters()).getBannerSize();
    }

    /* access modifiers changed from: protected */
    public UnifiedBannerAdRequestParams createUnifiedAdRequestParams(BannerAdRequestParameters bannerAdRequestParameters, TargetingParams targetingParams, DataRestrictions dataRestrictions) {
        return new BannerUnifiedAdRequestParams(bannerAdRequestParameters, targetingParams, dataRestrictions);
    }

    /* renamed from: io.bidmachine.banner.BannerRequest$Builder */
    public static final class Builder extends AdRequest.AdRequestBuilderImpl<Builder, BannerRequest, BannerAdRequestParameters> implements IBannerRequestBuilder<Builder> {
        private BannerSize bannerSize;

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

        public Builder setSize(BannerSize bannerSize2) {
            this.bannerSize = bannerSize2;
            return this;
        }

        /* access modifiers changed from: protected */
        public BannerAdRequestParameters createAdRequestParameters() {
            BannerSize bannerSize2 = this.bannerSize;
            if (bannerSize2 != null) {
                return new BannerAdRequestParameters(bannerSize2);
            }
            throw new IllegalArgumentException("BannerSize can't be null");
        }

        /* access modifiers changed from: protected */
        public BannerRequest build(BannerAdRequestParameters bannerAdRequestParameters) {
            return new BannerRequest(bannerAdRequestParameters);
        }
    }

    /* renamed from: io.bidmachine.banner.BannerRequest$BannerUnifiedAdRequestParams */
    private static class BannerUnifiedAdRequestParams extends UnifiedAdRequestParamsImpl<BannerAdRequestParameters> implements UnifiedBannerAdRequestParams {
        public /* bridge */ /* synthetic */ BannerAdRequestParameters getAdRequestParameters() {
            return (BannerAdRequestParameters) super.getAdRequestParameters();
        }

        private BannerUnifiedAdRequestParams(BannerAdRequestParameters bannerAdRequestParameters, TargetingParams targetingParams, DataRestrictions dataRestrictions) {
            super(bannerAdRequestParameters, targetingParams, dataRestrictions);
        }
    }
}
