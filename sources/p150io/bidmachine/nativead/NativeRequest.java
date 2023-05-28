package p150io.bidmachine.nativead;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p150io.bidmachine.AdRequest;
import p150io.bidmachine.CustomParams;
import p150io.bidmachine.MediaAssetType;
import p150io.bidmachine.NetworkConfig;
import p150io.bidmachine.PriceFloorParams;
import p150io.bidmachine.SessionAdParams;
import p150io.bidmachine.TargetingParams;
import p150io.bidmachine.UnifiedAdRequestParamsImpl;
import p150io.bidmachine.models.DataRestrictions;
import p150io.bidmachine.models.INativeRequestBuilder;
import p150io.bidmachine.models.RequestBuilder;
import p150io.bidmachine.protobuf.ResponsePayload;
import p150io.bidmachine.unified.UnifiedNativeAdRequestParams;

/* renamed from: io.bidmachine.nativead.NativeRequest */
public final class NativeRequest extends AdRequest<NativeRequest, NativeAdRequestParameters, UnifiedNativeAdRequestParams> {

    /* renamed from: io.bidmachine.nativead.NativeRequest$AdRequestListener */
    public interface AdRequestListener extends AdRequest.AdRequestListener<NativeRequest> {
    }

    private NativeRequest(NativeAdRequestParameters nativeAdRequestParameters) {
        super(nativeAdRequestParameters);
    }

    public boolean containsAssetType(MediaAssetType mediaAssetType) {
        return ((NativeAdRequestParameters) getAdRequestParameters()).containsAssetType(mediaAssetType);
    }

    /* access modifiers changed from: protected */
    public void processBidPayload(ResponsePayload responsePayload) {
        ((NativeAdRequestParameters) getAdRequestParameters()).setValidateAssets(false);
        super.processBidPayload(responsePayload);
    }

    /* access modifiers changed from: protected */
    public UnifiedNativeAdRequestParams createUnifiedAdRequestParams(NativeAdRequestParameters nativeAdRequestParameters, TargetingParams targetingParams, DataRestrictions dataRestrictions) {
        return new NativeUnifiedAdRequestParams(nativeAdRequestParameters, targetingParams, dataRestrictions);
    }

    /* renamed from: io.bidmachine.nativead.NativeRequest$Builder */
    public static final class Builder extends AdRequest.AdRequestBuilderImpl<Builder, NativeRequest, NativeAdRequestParameters> implements INativeRequestBuilder<Builder> {
        private final List<MediaAssetType> mediaAssetTypes = new ArrayList<MediaAssetType>(MediaAssetType.values().length) {
            {
                add(MediaAssetType.Icon);
                add(MediaAssetType.Image);
            }
        };

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

        public Builder setMediaAssetTypes(MediaAssetType... mediaAssetTypeArr) {
            if (mediaAssetTypeArr.length > 0) {
                this.mediaAssetTypes.clear();
                this.mediaAssetTypes.addAll(Arrays.asList(mediaAssetTypeArr));
            }
            return this;
        }

        /* access modifiers changed from: protected */
        public NativeAdRequestParameters createAdRequestParameters() {
            return new NativeAdRequestParameters(this.mediaAssetTypes);
        }

        /* access modifiers changed from: protected */
        public NativeRequest build(NativeAdRequestParameters nativeAdRequestParameters) {
            return new NativeRequest(nativeAdRequestParameters);
        }
    }

    /* renamed from: io.bidmachine.nativead.NativeRequest$NativeUnifiedAdRequestParams */
    private static class NativeUnifiedAdRequestParams extends UnifiedAdRequestParamsImpl<NativeAdRequestParameters> implements UnifiedNativeAdRequestParams {
        public /* bridge */ /* synthetic */ NativeAdRequestParameters getAdRequestParameters() {
            return (NativeAdRequestParameters) super.getAdRequestParameters();
        }

        private NativeUnifiedAdRequestParams(NativeAdRequestParameters nativeAdRequestParameters, TargetingParams targetingParams, DataRestrictions dataRestrictions) {
            super(nativeAdRequestParameters, targetingParams, dataRestrictions);
        }
    }
}
