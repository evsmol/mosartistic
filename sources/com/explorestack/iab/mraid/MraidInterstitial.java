package com.explorestack.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.measurer.MraidAdMeasurer;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.IabElementStyle;
import java.util.concurrent.atomic.AtomicInteger;

public class MraidInterstitial {

    /* renamed from: i */
    public static final String f4073i;

    /* renamed from: j */
    public static final AtomicInteger f4074j = new AtomicInteger(0);

    /* renamed from: k */
    public static final /* synthetic */ boolean f4075k;

    /* renamed from: a */
    public MraidInterstitialListener f4076a;

    /* renamed from: b */
    public MraidView f4077b;

    /* renamed from: c */
    public boolean f4078c;

    /* renamed from: d */
    public boolean f4079d;

    /* renamed from: e */
    public boolean f4080e;

    /* renamed from: f */
    public boolean f4081f = true;

    /* renamed from: g */
    public boolean f4082g = false;

    /* renamed from: h */
    public final MraidViewListener f4083h = new C1340a();

    /* renamed from: id */
    public final int f4084id = f4074j.getAndIncrement();

    public class Builder {

        /* renamed from: a */
        public final MraidView.Builder f4085a = new MraidView.Builder(C1358d.INTERSTITIAL);

        public Builder() {
        }

        public MraidInterstitial build(Context context) {
            this.f4085a.setListener(MraidInterstitial.this.f4083h);
            MraidInterstitial.this.f4077b = this.f4085a.build(context);
            return MraidInterstitial.this;
        }

        public Builder forceUseNativeCloseButton(boolean z) {
            this.f4085a.forceUseNativeCloseButton(z);
            return this;
        }

        public Builder setAdMeasurer(MraidAdMeasurer mraidAdMeasurer) {
            this.f4085a.setAdMeasurer(mraidAdMeasurer);
            return this;
        }

        public Builder setBaseUrl(String str) {
            this.f4085a.setBaseUrl(str);
            return this;
        }

        public Builder setCacheControl(CacheControl cacheControl) {
            this.f4085a.setCacheControl(cacheControl);
            return this;
        }

        public Builder setCloseStyle(IabElementStyle iabElementStyle) {
            this.f4085a.setCloseStyle(iabElementStyle);
            return this;
        }

        public Builder setCloseTime(float f) {
            this.f4085a.setCloseTimeSec(f);
            return this;
        }

        public Builder setCountDownStyle(IabElementStyle iabElementStyle) {
            this.f4085a.setCountDownStyle(iabElementStyle);
            return this;
        }

        public Builder setDurationSec(float f) {
            this.f4085a.setDurationSec(f);
            return this;
        }

        public Builder setIsTag(boolean z) {
            this.f4085a.setIsTag(z);
            return this;
        }

        public Builder setListener(MraidInterstitialListener mraidInterstitialListener) {
            MraidInterstitialListener unused = MraidInterstitial.this.f4076a = mraidInterstitialListener;
            return this;
        }

        public Builder setLoadingStyle(IabElementStyle iabElementStyle) {
            this.f4085a.setLoadingStyle(iabElementStyle);
            return this;
        }

        public Builder setPageFinishedScript(String str) {
            this.f4085a.setPageFinishedScript(str);
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f) {
            this.f4085a.setPlaceholderTimeoutSec(f);
            return this;
        }

        public Builder setProductLink(String str) {
            this.f4085a.setProductLink(str);
            return this;
        }

        public Builder setProgressStyle(IabElementStyle iabElementStyle) {
            this.f4085a.setProgressStyle(iabElementStyle);
            return this;
        }

        public Builder setR1(boolean z) {
            this.f4085a.setR1(z);
            return this;
        }

        public Builder setR2(boolean z) {
            this.f4085a.setR2(z);
            return this;
        }
    }

    /* renamed from: com.explorestack.iab.mraid.MraidInterstitial$a */
    public class C1340a implements MraidViewListener {
        public C1340a() {
        }

        public void onClose(MraidView mraidView) {
            MraidLog.m5985d(MraidInterstitial.f4073i, "ViewListener: onClose");
            MraidInterstitial.this.mo3756b();
            MraidInterstitial.this.mo3757c();
        }

        public void onError(MraidView mraidView, int i) {
            String a = MraidInterstitial.f4073i;
            MraidLog.m5985d(a, "ViewListener: onError (" + i + ")");
            MraidInterstitial.this.mo3756b();
            MraidInterstitial.this.mo3753a(i);
        }

        public void onExpand(MraidView mraidView) {
        }

        public void onLoaded(MraidView mraidView) {
            MraidLog.m5985d(MraidInterstitial.f4073i, "ViewListener: onLoaded");
            boolean unused = MraidInterstitial.this.f4078c = true;
            if (MraidInterstitial.this.f4076a != null) {
                MraidInterstitial.this.f4076a.onLoaded(MraidInterstitial.this);
            }
        }

        public void onOpenBrowser(MraidView mraidView, String str, IabClickCallback iabClickCallback) {
            String a = MraidInterstitial.f4073i;
            MraidLog.m5985d(a, "ViewListener: onOpenBrowser (" + str + ")");
            if (MraidInterstitial.this.f4076a != null) {
                MraidInterstitial.this.f4076a.onOpenBrowser(MraidInterstitial.this, str, iabClickCallback);
            }
        }

        public void onPlayVideo(MraidView mraidView, String str) {
            String a = MraidInterstitial.f4073i;
            MraidLog.m5985d(a, "ViewListener: onPlayVideo (" + str + ")");
            if (MraidInterstitial.this.f4076a != null) {
                MraidInterstitial.this.f4076a.onPlayVideo(MraidInterstitial.this, str);
            }
        }

        public void onShown(MraidView mraidView) {
            MraidLog.m5985d(MraidInterstitial.f4073i, "ViewListener: onShown");
            if (MraidInterstitial.this.f4076a != null) {
                MraidInterstitial.this.f4076a.onShown(MraidInterstitial.this);
            }
        }
    }

    static {
        Class<MraidInterstitial> cls = MraidInterstitial.class;
        f4075k = !cls.desiredAssertionStatus();
        f4073i = cls.getSimpleName();
    }

    private MraidInterstitial() {
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /* renamed from: a */
    public void mo3753a(int i) {
        this.f4078c = false;
        this.f4080e = true;
        MraidInterstitialListener mraidInterstitialListener = this.f4076a;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onError(this, i);
        }
        destroy();
    }

    /* renamed from: a */
    public void mo3754a(Activity activity, ViewGroup viewGroup, boolean z, boolean z2) {
        if (!isReady()) {
            if (activity != null && z) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            mo3759d();
            MraidLog.m5984b(f4073i, "Show failed: interstitial is not ready");
        } else if (f4075k || this.f4077b != null) {
            this.f4081f = z2;
            this.f4082g = z;
            viewGroup.addView(this.f4077b, new ViewGroup.LayoutParams(-1, -1));
            this.f4077b.show(activity);
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo3755a(Activity activity, boolean z) {
        mo3754a(activity, (ViewGroup) activity.findViewById(16908290), true, z);
    }

    /* renamed from: b */
    public final void mo3756b() {
        Activity peekActivity;
        if (this.f4082g && (peekActivity = this.f4077b.peekActivity()) != null) {
            peekActivity.finish();
            peekActivity.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: c */
    public void mo3757c() {
        if (!isClosed() && !isReceivedError()) {
            this.f4078c = false;
            this.f4079d = true;
            MraidInterstitialListener mraidInterstitialListener = this.f4076a;
            if (mraidInterstitialListener != null) {
                mraidInterstitialListener.onClose(this);
            }
            if (this.f4081f) {
                destroy();
            }
        }
    }

    public boolean canBeClosed() {
        MraidView mraidView = this.f4077b;
        return mraidView == null || mraidView.canBeClosed() || isReceivedError();
    }

    /* renamed from: d */
    public void mo3759d() {
        MraidInterstitialListener mraidInterstitialListener = this.f4076a;
        if (mraidInterstitialListener != null) {
            mraidInterstitialListener.onError(this, 1);
        }
    }

    public void destroy() {
        MraidLog.m5985d(f4073i, "destroy");
        this.f4078c = false;
        this.f4076a = null;
        MraidView mraidView = this.f4077b;
        if (mraidView != null) {
            mraidView.destroy();
            this.f4077b = null;
        }
    }

    public void dispatchClose() {
        if (this.f4077b != null && canBeClosed()) {
            this.f4077b.mo3824f();
        }
    }

    public boolean isClosed() {
        return this.f4079d;
    }

    public boolean isReady() {
        return this.f4078c && this.f4077b != null;
    }

    public boolean isReceivedError() {
        return this.f4080e;
    }

    public void load(String str) {
        MraidView mraidView = this.f4077b;
        if (mraidView != null) {
            mraidView.load(str);
            return;
        }
        throw new IllegalStateException("MraidView not created (mraidView == null)");
    }

    public void show(Context context, MraidType mraidType) {
        MraidActivity.show(context, this, mraidType);
    }

    public void showInView(ViewGroup viewGroup, boolean z) {
        mo3754a((Activity) null, viewGroup, false, z);
    }
}
