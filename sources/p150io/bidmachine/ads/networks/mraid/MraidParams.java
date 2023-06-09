package p150io.bidmachine.ads.networks.mraid;

import android.text.TextUtils;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.utils.IabElementStyle;
import p150io.bidmachine.unified.UnifiedAdCallback;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.unified.UnifiedParams;
import p150io.bidmachine.utils.BMError;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: io.bidmachine.ads.networks.mraid.MraidParams */
class MraidParams extends UnifiedParams {
    final CacheControl cacheControl;
    final IabElementStyle closeableViewStyle;
    final IabElementStyle countDownStyle;
    final String creativeAdm;
    final int height;
    final boolean omsdkEnabled;
    final float placeholderTimeoutSec;
    final int progressDuration;
    final IabElementStyle progressStyle;

    /* renamed from: r1 */
    final boolean f12807r1;

    /* renamed from: r2 */
    final boolean f12808r2;
    final int skipOffset;
    final String storeUrl;
    final boolean useNativeClose;
    final int width;

    MraidParams(UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.creativeAdm = unifiedMediationParams.getString(IabUtils.KEY_CREATIVE_ADM);
        this.width = unifiedMediationParams.getInt(IabUtils.KEY_WIDTH);
        this.height = unifiedMediationParams.getInt(IabUtils.KEY_HEIGHT);
        this.cacheControl = IabUtils.toCacheControl(unifiedMediationParams.getObject(IabUtils.KEY_CACHE_CONTROL));
        this.placeholderTimeoutSec = unifiedMediationParams.getFloat(IabUtils.KEY_PLACEHOLDER_TIMEOUT_SEC);
        this.skipOffset = unifiedMediationParams.getInt(IabUtils.KEY_SKIP_OFFSET);
        this.useNativeClose = unifiedMediationParams.getBool(IabUtils.KEY_USE_NATIVE_CLOSE);
        this.omsdkEnabled = unifiedMediationParams.getBool(IabUtils.KEY_OM_SDK_ENABLED, true);
        this.f12807r1 = unifiedMediationParams.getBool(IabUtils.KEY_R1);
        this.f12808r2 = unifiedMediationParams.getBool(IabUtils.KEY_R2);
        this.storeUrl = unifiedMediationParams.getString(IabUtils.KEY_STORE_URL);
        this.progressDuration = unifiedMediationParams.getInt(IabUtils.KEY_PROGRESS_DURATION);
        this.closeableViewStyle = (IabElementStyle) unifiedMediationParams.getObject(IabUtils.KEY_CLOSABLE_VIEW_STYLE);
        this.countDownStyle = (IabElementStyle) unifiedMediationParams.getObject(IabUtils.KEY_COUNTDOWN_STYLE);
        this.progressStyle = (IabElementStyle) unifiedMediationParams.getObject(IabUtils.KEY_PROGRESS_STYLE);
    }

    public boolean isValid(UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.creativeAdm)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(IabUtils.KEY_CREATIVE_ADM));
            return false;
        } else if (this.width == 0) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(IabUtils.KEY_WIDTH));
            return false;
        } else if (this.height != 0) {
            return true;
        } else {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(IabUtils.KEY_HEIGHT));
            return false;
        }
    }
}
