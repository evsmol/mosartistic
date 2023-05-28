package p150io.bidmachine.ads.networks.meta_audience;

import android.text.TextUtils;
import p150io.bidmachine.unified.UnifiedAdCallback;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.unified.UnifiedParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.meta_audience.MetaAudienceParams */
class MetaAudienceParams extends UnifiedParams {
    final String bidPayload;
    final String placementId;

    MetaAudienceParams(UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.placementId = unifiedMediationParams.getString("meta_key");
        this.bidPayload = unifiedMediationParams.getString("bid_payload");
    }

    public boolean isValid(UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.placementId)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("meta_key"));
            return false;
        } else if (!TextUtils.isEmpty(this.bidPayload)) {
            return true;
        } else {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("bid_payload"));
            return false;
        }
    }
}
