package p150io.bidmachine.ads.networks.meta_audience;

import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.C1715Ad;
import p150io.bidmachine.unified.UnifiedAdCallback;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.meta_audience.BaseMetaAudienceListener */
abstract class BaseMetaAudienceListener<UnifiedAdCallbackType extends UnifiedAdCallback> implements AdListener {
    private final UnifiedAdCallbackType callback;

    BaseMetaAudienceListener(UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    /* access modifiers changed from: package-private */
    public UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    public void onError(C1715Ad ad, AdError adError) {
        this.callback.onAdLoadFailed(mapError(adError));
        ad.destroy();
    }

    public void onAdClicked(C1715Ad ad) {
        this.callback.onAdClicked();
    }

    private static BMError mapError(AdError adError) {
        if (adError != null) {
            int errorCode = adError.getErrorCode();
            if (errorCode == 2009) {
                return BMError.TimeoutError;
            }
            if (errorCode != 3001) {
                switch (errorCode) {
                    case 1000:
                        return BMError.NoConnection;
                    case 1001:
                    case 1002:
                        break;
                    default:
                        switch (errorCode) {
                            case 2000:
                            case 2001:
                            case 2002:
                                break;
                        }
                }
            }
            return BMError.noFill();
        }
        return BMError.internal("Unknown error");
    }
}
