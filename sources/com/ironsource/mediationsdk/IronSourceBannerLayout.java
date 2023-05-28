package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;

public class IronSourceBannerLayout extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public View f10713a;

    /* renamed from: b */
    private ISBannerSize f10714b;

    /* renamed from: c */
    private String f10715c;

    /* renamed from: d */
    private Activity f10716d;

    /* renamed from: e */
    private boolean f10717e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f10718f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public BannerListener f10719g;

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f10716d = activity;
        this.f10714b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final IronSourceBannerLayout mo33415a() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.f10716d, this.f10714b);
        ironSourceBannerLayout.setBannerListener(this.f10719g);
        ironSourceBannerLayout.setPlacementName(this.f10715c);
        return ironSourceBannerLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33416a(final View view, final FrameLayout.LayoutParams layoutParams) {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                IronSourceBannerLayout.this.removeAllViews();
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
                View unused = IronSourceBannerLayout.this.f10713a = view;
                IronSourceBannerLayout.this.addView(view, 0, layoutParams);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33417a(final IronSourceError ironSourceError) {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (IronSourceBannerLayout.this.f10718f) {
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onBannerAdLoadFailed error=" + ironSourceError);
                    IronSourceBannerLayout.this.f10719g.onBannerAdLoadFailed(ironSourceError);
                    return;
                }
                try {
                    if (IronSourceBannerLayout.this.f10713a != null) {
                        IronSourceBannerLayout.this.removeView(IronSourceBannerLayout.this.f10713a);
                        View unused = IronSourceBannerLayout.this.f10713a = null;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (IronSourceBannerLayout.this.f10719g != null) {
                    IronLog ironLog2 = IronLog.CALLBACK;
                    ironLog2.info("onBannerAdLoadFailed error=" + ironSourceError);
                    IronSourceBannerLayout.this.f10719g.onBannerAdLoadFailed(ironSourceError);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33418a(final String str) {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("smash - " + str);
                if (IronSourceBannerLayout.this.f10719g != null && !IronSourceBannerLayout.this.f10718f) {
                    IronLog.CALLBACK.info("");
                    IronSourceBannerLayout.this.f10719g.onBannerAdLoaded();
                }
                boolean unused = IronSourceBannerLayout.this.f10718f = true;
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33419b() {
        this.f10717e = true;
        this.f10719g = null;
        this.f10716d = null;
        this.f10714b = null;
        this.f10715c = null;
        this.f10713a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo33420c() {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (IronSourceBannerLayout.this.f10719g != null) {
                    IronLog.CALLBACK.info("");
                    IronSourceBannerLayout.this.f10719g.onBannerAdClicked();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo33421d() {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (IronSourceBannerLayout.this.f10719g != null) {
                    IronLog.CALLBACK.info("");
                    IronSourceBannerLayout.this.f10719g.onBannerAdScreenPresented();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo33422e() {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (IronSourceBannerLayout.this.f10719g != null) {
                    IronLog.CALLBACK.info("");
                    IronSourceBannerLayout.this.f10719g.onBannerAdScreenDismissed();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo33423f() {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (IronSourceBannerLayout.this.f10719g != null) {
                    IronLog.CALLBACK.info("");
                    IronSourceBannerLayout.this.f10719g.onBannerAdLeftApplication();
                }
            }
        });
    }

    public Activity getActivity() {
        return this.f10716d;
    }

    public BannerListener getBannerListener() {
        return this.f10719g;
    }

    public View getBannerView() {
        return this.f10713a;
    }

    public String getPlacementName() {
        return this.f10715c;
    }

    public ISBannerSize getSize() {
        return this.f10714b;
    }

    public boolean isDestroyed() {
        return this.f10717e;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        this.f10719g = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info("");
        this.f10719g = bannerListener;
    }

    public void setPlacementName(String str) {
        this.f10715c = str;
    }
}
