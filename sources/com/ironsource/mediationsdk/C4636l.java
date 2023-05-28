package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.C4671a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.l */
public final class C4636l implements BannerSmashListener {

    /* renamed from: a */
    public AbstractAdapter f11531a;

    /* renamed from: b */
    public NetworkSettings f11532b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public C4671a f11533c;

    /* renamed from: d */
    boolean f11534d;

    /* renamed from: e */
    IronSourceBannerLayout f11535e;

    /* renamed from: f */
    public int f11536f;

    /* renamed from: g */
    private Timer f11537g;

    /* renamed from: h */
    private long f11538h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4638a f11539i = C4638a.NO_INIT;

    /* renamed from: com.ironsource.mediationsdk.l$a */
    public enum C4638a {
        NO_INIT,
        INIT_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    C4636l(C4671a aVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, long j, int i) {
        this.f11536f = i;
        this.f11533c = aVar;
        this.f11531a = abstractAdapter;
        this.f11532b = networkSettings;
        this.f11538h = j;
        abstractAdapter.addBannerListener(this);
    }

    /* renamed from: a */
    private void m13604a(String str, String str2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, str + " Banner exception: " + mo33948a() + " | " + str2, 3);
    }

    /* renamed from: c */
    private void m13606c() {
        if (this.f11531a != null) {
            try {
                String str = C4455H.m12683a().f10654l;
                if (!TextUtils.isEmpty(str)) {
                    this.f11531a.setMediationSegment(str);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.f11531a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e) {
                mo33951a(":setCustomParams():" + e.toString());
            }
        }
    }

    /* renamed from: d */
    private void m13607d() {
        try {
            if (this.f11537g != null) {
                this.f11537g.cancel();
            }
        } catch (Exception e) {
            m13604a("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.f11537g = null;
        }
    }

    /* renamed from: a */
    public final String mo33948a() {
        return this.f11532b.isMultipleInstances() ? this.f11532b.getProviderTypeForReflection() : this.f11532b.getProviderName();
    }

    /* renamed from: a */
    public final void mo33949a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        mo33951a("loadBanner");
        this.f11534d = false;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            mo33951a("loadBanner - bannerLayout is null or destroyed");
            this.f11533c.mo33941a(new IronSourceError(610, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false);
        } else if (this.f11531a == null) {
            mo33951a("loadBanner - mAdapter is null");
            this.f11533c.mo33941a(new IronSourceError(611, "adapter==null"), this, false);
        } else {
            this.f11535e = ironSourceBannerLayout;
            mo33952b();
            if (this.f11539i == C4638a.NO_INIT) {
                mo33950a(C4638a.INIT_IN_PROGRESS);
                m13606c();
                this.f11531a.initBanners(str, str2, this.f11532b.getBannerSettings(), this);
                return;
            }
            mo33950a(C4638a.LOAD_IN_PROGRESS);
            this.f11531a.loadBanner(ironSourceBannerLayout, this.f11532b.getBannerSettings(), this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33950a(C4638a aVar) {
        this.f11539i = aVar;
        mo33951a("state=" + aVar.name());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33951a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
        logger.log(ironSourceTag, "BannerSmash " + mo33948a() + " " + str, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo33952b() {
        try {
            m13607d();
            Timer timer = new Timer();
            this.f11537g = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C4671a b;
                    IronSourceError ironSourceError;
                    cancel();
                    if (C4636l.this.f11539i == C4638a.INIT_IN_PROGRESS) {
                        C4636l.this.mo33950a(C4638a.NO_INIT);
                        C4636l.this.mo33951a("init timed out");
                        b = C4636l.this.f11533c;
                        ironSourceError = new IronSourceError(607, "Timed out");
                    } else if (C4636l.this.f11539i == C4638a.LOAD_IN_PROGRESS) {
                        C4636l.this.mo33950a(C4638a.LOAD_FAILED);
                        C4636l.this.mo33951a("load timed out");
                        b = C4636l.this.f11533c;
                        ironSourceError = new IronSourceError(608, "Timed out");
                    } else if (C4636l.this.f11539i == C4638a.LOADED) {
                        C4636l.this.mo33950a(C4638a.LOAD_FAILED);
                        C4636l.this.mo33951a("reload timed out");
                        C4636l.this.f11533c.mo33943b(new IronSourceError(609, "Timed out"), C4636l.this, false);
                        return;
                    } else {
                        return;
                    }
                    b.mo33941a(ironSourceError, C4636l.this, false);
                }
            }, this.f11538h);
        } catch (Exception e) {
            m13604a("startLoadTimer", e.getLocalizedMessage());
        }
    }

    public final void onBannerAdClicked() {
        C4671a aVar = this.f11533c;
        if (aVar != null) {
            aVar.mo33938a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        C4671a aVar = this.f11533c;
        if (aVar != null) {
            aVar.mo33945d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        mo33951a("onBannerAdLoadFailed()");
        m13607d();
        boolean z = ironSourceError.getErrorCode() == 606;
        if (this.f11539i == C4638a.LOAD_IN_PROGRESS) {
            mo33950a(C4638a.LOAD_FAILED);
            this.f11533c.mo33941a(ironSourceError, this, z);
        } else if (this.f11539i == C4638a.LOADED) {
            this.f11533c.mo33943b(ironSourceError, this, z);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        mo33951a("onBannerAdLoaded()");
        m13607d();
        if (this.f11539i == C4638a.LOAD_IN_PROGRESS) {
            mo33950a(C4638a.LOADED);
            this.f11533c.mo33939a(this, view, layoutParams);
        } else if (this.f11539i == C4638a.LOADED) {
            this.f11533c.mo33940a(this, view, layoutParams, this.f11531a.shouldBindBannerViewOnReload());
        }
    }

    public final void onBannerAdScreenDismissed() {
        C4671a aVar = this.f11533c;
        if (aVar != null) {
            aVar.mo33942b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        C4671a aVar = this.f11533c;
        if (aVar != null) {
            aVar.mo33944c(this);
        }
    }

    public final void onBannerAdShown() {
        C4671a aVar = this.f11533c;
        if (aVar != null) {
            aVar.mo33946e(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        m13607d();
        if (this.f11539i == C4638a.INIT_IN_PROGRESS) {
            this.f11533c.mo33941a(new IronSourceError(612, "Banner init failed"), this, false);
            mo33950a(C4638a.NO_INIT);
        }
    }

    public final void onBannerInitSuccess() {
        m13607d();
        if (this.f11539i == C4638a.INIT_IN_PROGRESS) {
            IronSourceBannerLayout ironSourceBannerLayout = this.f11535e;
            if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
                this.f11533c.mo33941a(new IronSourceError(605, this.f11535e == null ? "banner is null" : "banner is destroyed"), this, false);
                return;
            }
            mo33952b();
            mo33950a(C4638a.LOAD_IN_PROGRESS);
            this.f11531a.loadBanner(this.f11535e, this.f11532b.getBannerSettings(), this);
        }
    }
}
