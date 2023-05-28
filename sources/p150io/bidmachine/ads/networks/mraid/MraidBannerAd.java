package p150io.bidmachine.ads.networks.mraid;

import android.app.Activity;
import android.content.Context;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.mraid.MraidView;
import java.util.concurrent.atomic.AtomicBoolean;
import p150io.bidmachine.ContextProvider;
import p150io.bidmachine.NetworkAdUnit;
import p150io.bidmachine.core.Logger;
import p150io.bidmachine.core.Utils;
import p150io.bidmachine.measurer.MraidOMSDKAdMeasurer;
import p150io.bidmachine.unified.UnifiedBannerAd;
import p150io.bidmachine.unified.UnifiedBannerAdCallback;
import p150io.bidmachine.unified.UnifiedBannerAdRequestParams;
import p150io.bidmachine.unified.UnifiedMediationParams;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.mraid.MraidBannerAd */
class MraidBannerAd extends UnifiedBannerAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final AtomicBoolean isPrepareToShowExecuted = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer;
    MraidView mraidView;

    MraidBannerAd() {
    }

    public void load(ContextProvider contextProvider, UnifiedBannerAdCallback unifiedBannerAdCallback, UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        String str;
        final MraidParams mraidParams = new MraidParams(unifiedMediationParams);
        if (mraidParams.isValid(unifiedBannerAdCallback)) {
            if (mraidParams.cacheControl == CacheControl.PartialLoad) {
                setConsiderNetworkImpressionTracking(true);
            }
            final Context applicationContext = contextProvider.getApplicationContext();
            if (mraidParams.omsdkEnabled) {
                MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer2 = new MraidOMSDKAdMeasurer();
                this.mraidOMSDKAdMeasurer = mraidOMSDKAdMeasurer2;
                str = mraidOMSDKAdMeasurer2.injectMeasurerJS(mraidParams.creativeAdm);
            } else {
                str = mraidParams.creativeAdm;
            }
            final String str2 = str;
            final UnifiedBannerAdCallback unifiedBannerAdCallback2 = unifiedBannerAdCallback;
            Utils.onUiThread(new Runnable() {
                public void run() {
                    try {
                        MraidBannerAd.this.mraidView = new MraidView.Builder().setCacheControl(mraidParams.cacheControl).setPlaceholderTimeoutSec(mraidParams.placeholderTimeoutSec).setListener(new MraidBannerAdListener(unifiedBannerAdCallback2)).setAdMeasurer(MraidBannerAd.this.mraidOMSDKAdMeasurer).build(applicationContext);
                        MraidBannerAd.this.mraidView.load(str2);
                    } catch (Throwable th) {
                        Logger.log(th);
                        unifiedBannerAdCallback2.onAdLoadFailed(BMError.internal("Exception when loading banner object"));
                    }
                }
            });
        }
    }

    public void prepareToShow() throws Throwable {
        MraidView mraidView2;
        super.prepareToShow();
        if (this.isPrepareToShowExecuted.compareAndSet(false, true) && (mraidView2 = this.mraidView) != null) {
            mraidView2.show((Activity) null);
        }
    }

    public void onShown() {
        super.onShown();
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer2 = this.mraidOMSDKAdMeasurer;
        if (mraidOMSDKAdMeasurer2 != null) {
            mraidOMSDKAdMeasurer2.onAdShown();
        }
    }

    public void onDestroy() {
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer2 = this.mraidOMSDKAdMeasurer;
        if (mraidOMSDKAdMeasurer2 != null) {
            mraidOMSDKAdMeasurer2.destroy(new Runnable() {
                public void run() {
                    MraidBannerAd.this.destroyMraidView();
                }
            });
            this.mraidOMSDKAdMeasurer = null;
            return;
        }
        destroyMraidView();
    }

    /* access modifiers changed from: private */
    public void destroyMraidView() {
        MraidView mraidView2 = this.mraidView;
        if (mraidView2 != null) {
            mraidView2.destroy();
            this.mraidView = null;
        }
    }
}
