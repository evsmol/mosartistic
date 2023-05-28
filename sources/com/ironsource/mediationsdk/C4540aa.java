package com.ironsource.mediationsdk;

import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;

/* renamed from: com.ironsource.mediationsdk.aa */
public final class C4540aa {

    /* renamed from: b */
    private static final C4540aa f11138b = new C4540aa();

    /* renamed from: a */
    public RewardedVideoListener f11139a = null;

    private C4540aa() {
    }

    /* renamed from: a */
    public static C4540aa m13201a() {
        return f11138b;
    }

    /* renamed from: a */
    public final void mo33675a(final IronSourceError ironSourceError) {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (C4540aa.this.f11139a != null) {
                    C4540aa.this.f11139a.onRewardedVideoAdShowFailed(ironSourceError);
                    C4540aa aaVar = C4540aa.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() error=" + ironSourceError.getErrorMessage(), 1);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo33676a(final Placement placement) {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (C4540aa.this.f11139a != null) {
                    C4540aa.this.f11139a.onRewardedVideoAdRewarded(placement);
                    C4540aa aaVar = C4540aa.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdRewarded(" + placement + ")", 1);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo33677a(final boolean z) {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (C4540aa.this.f11139a != null) {
                    C4540aa.this.f11139a.onRewardedVideoAvailabilityChanged(z);
                    C4540aa aaVar = C4540aa.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAvailabilityChanged() available=" + z, 1);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo33678b() {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (C4540aa.this.f11139a != null) {
                    C4540aa.this.f11139a.onRewardedVideoAdOpened();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo33679b(final Placement placement) {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (C4540aa.this.f11139a != null) {
                    C4540aa.this.f11139a.onRewardedVideoAdClicked(placement);
                    C4540aa aaVar = C4540aa.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClicked(" + placement + ")", 1);
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo33680c() {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (C4540aa.this.f11139a != null) {
                    C4540aa.this.f11139a.onRewardedVideoAdClosed();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
                }
            }
        });
    }

    /* renamed from: d */
    public final void mo33681d() {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (C4540aa.this.f11139a != null) {
                    C4540aa.this.f11139a.onRewardedVideoAdStarted();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo33682e() {
        C4401c.f10496a.mo33210a(new Runnable() {
            public final void run() {
                if (C4540aa.this.f11139a != null) {
                    C4540aa.this.f11139a.onRewardedVideoAdEnded();
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
                }
            }
        });
    }
}
