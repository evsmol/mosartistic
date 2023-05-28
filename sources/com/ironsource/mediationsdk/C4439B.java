package com.ironsource.mediationsdk;

import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;

/* renamed from: com.ironsource.mediationsdk.B */
public final class C4439B {

    /* renamed from: a */
    private static final C4439B f10567a = new C4439B();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public InterstitialListener f10568b = null;

    private C4439B() {
    }

    /* renamed from: a */
    public static synchronized C4439B m12623a() {
        C4439B b;
        synchronized (C4439B.class) {
            b = f10567a;
        }
        return b;
    }

    /* renamed from: a */
    public final void mo33282a(final IronSourceError ironSourceError) {
        if (this.f10568b != null) {
            C4401c.f10496a.mo33210a(new Runnable() {
                public final void run() {
                    C4439B.this.f10568b.onInterstitialAdLoadFailed(ironSourceError);
                    C4439B b = C4439B.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    /* renamed from: a */
    public final synchronized void mo33283a(InterstitialListener interstitialListener) {
        this.f10568b = interstitialListener;
    }

    /* renamed from: b */
    public final void mo33284b() {
        if (this.f10568b != null) {
            C4401c.f10496a.mo33210a(new Runnable() {
                public final void run() {
                    C4439B.this.f10568b.onInterstitialAdReady();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo33285b(final IronSourceError ironSourceError) {
        if (this.f10568b != null) {
            C4401c.f10496a.mo33210a(new Runnable() {
                public final void run() {
                    C4439B.this.f10568b.onInterstitialAdShowFailed(ironSourceError);
                    C4439B b = C4439B.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo33286c() {
        if (this.f10568b != null) {
            C4401c.f10496a.mo33210a(new Runnable() {
                public final void run() {
                    C4439B.this.f10568b.onInterstitialAdOpened();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo33287d() {
        if (this.f10568b != null) {
            C4401c.f10496a.mo33210a(new Runnable() {
                public final void run() {
                    C4439B.this.f10568b.onInterstitialAdClosed();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo33288e() {
        if (this.f10568b != null) {
            C4401c.f10496a.mo33210a(new Runnable() {
                public final void run() {
                    C4439B.this.f10568b.onInterstitialAdShowSucceeded();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
                }
            });
        }
    }

    /* renamed from: f */
    public final void mo33289f() {
        if (this.f10568b != null) {
            C4401c.f10496a.mo33210a(new Runnable() {
                public final void run() {
                    C4439B.this.f10568b.onInterstitialAdClicked();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
                }
            });
        }
    }
}
