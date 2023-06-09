package p150io.bidmachine;

import p150io.bidmachine.AdRequest;
import p150io.bidmachine.FullScreenAdRequest;
import p150io.bidmachine.displays.PlacementBuilder;
import p150io.bidmachine.models.DataRestrictions;
import p150io.bidmachine.unified.UnifiedFullscreenAdRequestParams;

/* renamed from: io.bidmachine.FullScreenAdRequest */
public abstract class FullScreenAdRequest<SelfType extends FullScreenAdRequest<SelfType>> extends AdRequest<SelfType, FullScreenAdRequestParameters, UnifiedFullscreenAdRequestParams> {
    protected FullScreenAdRequest(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }

    public AdContentType getAdContentType() {
        return ((FullScreenAdRequestParameters) getAdRequestParameters()).getAdContentType();
    }

    /* access modifiers changed from: package-private */
    public boolean isPlacementBuilderMatch(PlacementBuilder placementBuilder) {
        return super.isPlacementBuilderMatch(placementBuilder) && ((FullScreenAdRequestParameters) getAdRequestParameters()).isContentTypeMatch(placementBuilder.getAdContentType());
    }

    /* access modifiers changed from: protected */
    public UnifiedFullscreenAdRequestParams createUnifiedAdRequestParams(FullScreenAdRequestParameters fullScreenAdRequestParameters, TargetingParams targetingParams, DataRestrictions dataRestrictions) {
        return new FullscreenUnifiedAdRequestParams(fullScreenAdRequestParameters, targetingParams, dataRestrictions);
    }

    /* renamed from: io.bidmachine.FullScreenAdRequest$FullScreenRequestBuilder */
    protected static abstract class FullScreenRequestBuilder<SelfType extends FullScreenRequestBuilder<SelfType, ReturnType>, ReturnType extends FullScreenAdRequest<ReturnType>> extends AdRequest.AdRequestBuilderImpl<SelfType, ReturnType, FullScreenAdRequestParameters> {
        protected AdContentType adContentType = AdContentType.All;

        protected FullScreenRequestBuilder() {
        }

        /* access modifiers changed from: protected */
        public SelfType setAdContentType(AdContentType adContentType2) {
            this.adContentType = adContentType2;
            return this;
        }
    }

    /* renamed from: io.bidmachine.FullScreenAdRequest$FullscreenUnifiedAdRequestParams */
    private static class FullscreenUnifiedAdRequestParams extends UnifiedAdRequestParamsImpl<FullScreenAdRequestParameters> implements UnifiedFullscreenAdRequestParams {
        public /* bridge */ /* synthetic */ FullScreenAdRequestParameters getAdRequestParameters() {
            return (FullScreenAdRequestParameters) super.getAdRequestParameters();
        }

        private FullscreenUnifiedAdRequestParams(FullScreenAdRequestParameters fullScreenAdRequestParameters, TargetingParams targetingParams, DataRestrictions dataRestrictions) {
            super(fullScreenAdRequestParameters, targetingParams, dataRestrictions);
        }
    }
}
