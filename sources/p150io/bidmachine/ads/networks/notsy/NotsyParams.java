package p150io.bidmachine.ads.networks.notsy;

import android.text.TextUtils;
import p150io.bidmachine.unified.UnifiedAdCallback;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.unified.UnifiedParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.notsy.NotsyParams */
class NotsyParams extends UnifiedParams {
    final String adUnitId;
    final String price;
    final String score;

    NotsyParams(UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.adUnitId = unifiedMediationParams.getString("ad_unit_id");
        this.score = unifiedMediationParams.getString("score");
        this.price = unifiedMediationParams.getString("price");
    }

    public boolean isValid(UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.adUnitId)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("ad_unit_id"));
            return false;
        } else if (TextUtils.isEmpty(this.score)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("score"));
            return false;
        } else if (!TextUtils.isEmpty(this.price)) {
            return true;
        } else {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("price"));
            return false;
        }
    }
}
