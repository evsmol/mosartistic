package p150io.bidmachine.ads.networks.pangle;

import android.text.TextUtils;
import p150io.bidmachine.unified.UnifiedAdCallback;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.unified.UnifiedParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.pangle.PangleParams */
class PangleParams extends UnifiedParams {
    final String bidPayload;
    final String slotId;

    PangleParams(UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.slotId = unifiedMediationParams.getString("slot_id");
        this.bidPayload = unifiedMediationParams.getString("bid_payload");
    }

    public boolean isValid(UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.slotId)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("slot_id"));
            return false;
        } else if (!TextUtils.isEmpty(this.bidPayload)) {
            return true;
        } else {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("bid_payload"));
            return false;
        }
    }
}
