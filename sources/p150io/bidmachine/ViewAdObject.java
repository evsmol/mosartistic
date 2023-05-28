package p150io.bidmachine;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import p150io.bidmachine.AdObjectImpl;
import p150io.bidmachine.AdRequest;
import p150io.bidmachine.core.Logger;
import p150io.bidmachine.core.Utils;
import p150io.bidmachine.core.VisibilityTracker;
import p150io.bidmachine.models.AdObjectParams;
import p150io.bidmachine.unified.UnifiedAdRequestParams;
import p150io.bidmachine.unified.UnifiedBannerAdCallback;
import p150io.bidmachine.unified.UnifiedViewAd;
import p150io.bidmachine.utils.BMError;
import p150io.bidmachine.utils.ViewHelper;

/* renamed from: io.bidmachine.ViewAdObject */
public final class ViewAdObject<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdType extends UnifiedViewAd<UnifiedBannerAdCallback, UnifiedAdRequestParamsType>, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> extends AdObjectImpl<AdRequestType, AdObjectParams, UnifiedAdType, UnifiedBannerAdCallback, UnifiedAdRequestParamsType> {
    /* access modifiers changed from: private */
    public View adView;
    private int height;
    private MeasureMode heightMeasureMode = MeasureMode.Direct;
    private int width;
    private MeasureMode widthMeasureMode = MeasureMode.Direct;

    public ViewAdObject(ContextProvider contextProvider, AdProcessCallback adProcessCallback, AdRequestType adrequesttype, AdObjectParams adObjectParams, UnifiedAdType unifiedadtype) {
        super(contextProvider, adProcessCallback, adrequesttype, adObjectParams, unifiedadtype);
    }

    public UnifiedBannerAdCallback createUnifiedCallback(AdProcessCallback adProcessCallback) {
        return new UnifiedViewAdCallbackImpl(this, adProcessCallback);
    }

    /* access modifiers changed from: package-private */
    public void show(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        if (viewGroup == null) {
            ((UnifiedBannerAdCallback) getUnifiedAdCallback()).onAdShowFailed(BMError.notFound("Target container"));
        } else if ((getWidthMeasureMode() == MeasureMode.Direct && getWidth() == 0) || (getHeightMeasureMode() == MeasureMode.Direct && getHeight() == 0)) {
            ((UnifiedBannerAdCallback) getUnifiedAdCallback()).onAdShowFailed(BMError.incorrectContent("Width or height are not provided"));
        } else {
            Context context = viewGroup.getContext();
            View view = this.adView;
            if (view != null) {
                VisibilityTracker.stopTracking(view);
            }
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(getScaledWidth(context), getScaledHeight(context), 17);
            } else {
                layoutParams = new ViewGroup.LayoutParams(getScaledWidth(context), getScaledHeight(context));
            }
            getProcessCallback().processBeforeStartVisibilityTracker();
            VisibilityTracker.startTracking(this.adView, getParams().getViewabilityTimeThresholdMs(), getParams().getViewabilityPixelThreshold(), getParams().isViewabilityIgnoreWindowFocus(), new VisibilityTracker.VisibilityChangeCallback() {
                public boolean onViewShown() {
                    return ViewAdObject.this.getProcessCallback().processVisibilityTrackerShown(ViewAdObject.this.getUnifiedAd());
                }

                public void onViewTrackingFinished() {
                    ViewAdObject.this.getProcessCallback().processVisibilityTrackerImpression();
                }
            });
            ViewHelper.safeAddSingleView(viewGroup, this.adView, layoutParams);
            getProcessCallback().processFillAd();
            try {
                ((UnifiedViewAd) getUnifiedAd()).prepareToShow();
            } catch (Throwable th) {
                Logger.log(th);
            }
        }
    }

    public void onImpression() {
        super.onImpression();
        VisibilityTracker.stopTracking(this.adView);
    }

    public void hide() {
        super.hide();
        View view = this.adView;
        if (view != null) {
            ViewHelper.removeViewFromParent(view);
            VisibilityTracker.stopTracking(this.adView);
        }
    }

    public void onDestroy() {
        hide();
        super.onDestroy();
    }

    public MeasureMode getWidthMeasureMode() {
        return this.widthMeasureMode;
    }

    public void setWidthMeasureMode(MeasureMode measureMode) {
        this.widthMeasureMode = measureMode;
    }

    public MeasureMode getHeightMeasureMode() {
        return this.heightMeasureMode;
    }

    public void setHeightMeasureMode(MeasureMode measureMode) {
        this.heightMeasureMode = measureMode;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    private int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    private int getHeight() {
        return this.height;
    }

    private int getScaledWidth(Context context) {
        return this.widthMeasureMode.getSize(context, getWidth());
    }

    private int getScaledHeight(Context context) {
        return this.heightMeasureMode.getSize(context, getHeight());
    }

    /* renamed from: io.bidmachine.ViewAdObject$2 */
    static /* synthetic */ class C52102 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$ViewAdObject$MeasureMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.bidmachine.ViewAdObject$MeasureMode[] r0 = p150io.bidmachine.ViewAdObject.MeasureMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$bidmachine$ViewAdObject$MeasureMode = r0
                io.bidmachine.ViewAdObject$MeasureMode r1 = p150io.bidmachine.ViewAdObject.MeasureMode.Direct     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$bidmachine$ViewAdObject$MeasureMode     // Catch:{ NoSuchFieldError -> 0x001d }
                io.bidmachine.ViewAdObject$MeasureMode r1 = p150io.bidmachine.ViewAdObject.MeasureMode.Wrap     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p150io.bidmachine.ViewAdObject.C52102.<clinit>():void");
        }
    }

    /* renamed from: io.bidmachine.ViewAdObject$MeasureMode */
    public enum MeasureMode {
        Match,
        Wrap,
        Direct;

        /* access modifiers changed from: package-private */
        public int getSize(Context context, int i) {
            int i2 = C52102.$SwitchMap$io$bidmachine$ViewAdObject$MeasureMode[ordinal()];
            if (i2 != 1) {
                return i2 != 2 ? -1 : -2;
            }
            return Math.round(((float) i) * Utils.getScreenDensity(context));
        }
    }

    /* renamed from: io.bidmachine.ViewAdObject$UnifiedViewAdCallbackImpl */
    private static final class UnifiedViewAdCallbackImpl extends AdObjectImpl.BaseUnifiedAdCallback implements UnifiedBannerAdCallback {
        private final WeakReference<ViewAdObject<?, ?, ?>> weakAdObject;

        UnifiedViewAdCallbackImpl(ViewAdObject<?, ?, ?> viewAdObject, AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
            this.weakAdObject = new WeakReference<>(viewAdObject);
        }

        public void onAdLoaded(View view) {
            ViewAdObject viewAdObject = (ViewAdObject) this.weakAdObject.get();
            if (viewAdObject != null) {
                if (viewAdObject.adView != null) {
                    VisibilityTracker.stopTracking(viewAdObject.adView);
                }
                View unused = viewAdObject.adView = view;
                this.processCallback.processLoadSuccess();
                return;
            }
            this.processCallback.processLoadFail(BMError.internal("ViewAdObject is null"));
        }
    }
}
