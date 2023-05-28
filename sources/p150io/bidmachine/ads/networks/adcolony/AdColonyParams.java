package p150io.bidmachine.ads.networks.adcolony;

import android.text.TextUtils;
import p150io.bidmachine.unified.UnifiedAdCallback;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.unified.UnifiedParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.adcolony.AdColonyParams */
class AdColonyParams extends UnifiedParams {
    final String adm;
    final String zoneId;

    public AdColonyParams(UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.zoneId = unifiedMediationParams.getString("zone_id");
        this.adm = unifiedMediationParams.getString("adm");
    }

    public boolean isValid(UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.zoneId)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("zone_id"));
            return false;
        } else if (!TextUtils.isEmpty(this.adm)) {
            return true;
        } else {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("adm"));
            return false;
        }
    }
}
