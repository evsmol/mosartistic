package p150io.bidmachine.ads.networks.notsy;

import android.app.Activity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import p150io.bidmachine.ads.networks.notsy.InternalNotsyAd;
import p150io.bidmachine.core.AdapterLogger;
import p150io.bidmachine.core.Utils;
import p150io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.notsy.InternalNotsyFullscreenAd */
abstract class InternalNotsyFullscreenAd extends InternalNotsyAd {
    /* access modifiers changed from: protected */
    public abstract void showAd(Activity activity, InternalNotsyFullscreenAdPresentListener internalNotsyFullscreenAdPresentListener) throws Throwable;

    InternalNotsyFullscreenAd(InternalNotsyAdUnit internalNotsyAdUnit) {
        super(internalNotsyAdUnit);
    }

    public final void show(Activity activity, InternalNotsyFullscreenAdPresentListener internalNotsyFullscreenAdPresentListener) {
        Utils.onUiThread(new Runnable(activity, internalNotsyFullscreenAdPresentListener) {
            public final /* synthetic */ Activity f$1;
            public final /* synthetic */ InternalNotsyFullscreenAdPresentListener f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                InternalNotsyFullscreenAd.this.lambda$show$0$InternalNotsyFullscreenAd(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$show$0$InternalNotsyFullscreenAd(Activity activity, InternalNotsyFullscreenAdPresentListener internalNotsyFullscreenAdPresentListener) {
        try {
            setStatus(InternalNotsyAd.Status.Showing);
            showAd(activity, internalNotsyFullscreenAdPresentListener);
        } catch (Throwable th) {
            AdapterLogger.logThrowable(th);
            internalNotsyFullscreenAdPresentListener.onAdShowFailed(BMError.internal("Exception when showing ad object"));
        }
    }

    /* renamed from: io.bidmachine.ads.networks.notsy.InternalNotsyFullscreenAd$InternalFullscreenShowListener */
    static class InternalFullscreenShowListener extends FullScreenContentCallback {
        private final InternalNotsyFullscreenAdPresentListener adListener;
        private final InternalNotsyAd internalNotsyAd;

        InternalFullscreenShowListener(InternalNotsyAd internalNotsyAd2, InternalNotsyFullscreenAdPresentListener internalNotsyFullscreenAdPresentListener) {
            this.internalNotsyAd = internalNotsyAd2;
            this.adListener = internalNotsyFullscreenAdPresentListener;
        }

        public void onAdShowedFullScreenContent() {
            NotsyLoader.onNotsyAdShown(this.internalNotsyAd);
            this.internalNotsyAd.setStatus(InternalNotsyAd.Status.Shown);
            this.adListener.onAdShown();
        }

        public void onAdFailedToShowFullScreenContent(AdError adError) {
            this.adListener.onAdShowFailed(BMError.internal(adError.getMessage()));
        }

        public void onAdClicked() {
            this.adListener.onAdClicked();
        }

        public void onAdDismissedFullScreenContent() {
            this.adListener.onAdComplete();
            this.adListener.onAdClosed();
        }
    }
}
