package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;

/* renamed from: com.ironsource.mediationsdk.A */
public final class C4432A {

    /* renamed from: b */
    private static final C4432A f10551b = new C4432A();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyInterstitialListener f10552a = null;

    private C4432A() {
    }

    /* renamed from: a */
    public static C4432A m12618a() {
        return f10551b;
    }

    /* renamed from: a */
    public final void mo33251a(final String str, final IronSourceError ironSourceError) {
        if (this.f10552a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C4432A.this.f10552a.onInterstitialAdLoadFailed(str, ironSourceError);
                    C4432A a = C4432A.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdLoadFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo33252b(final String str, final IronSourceError ironSourceError) {
        if (this.f10552a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C4432A.this.f10552a.onInterstitialAdShowFailed(str, ironSourceError);
                    C4432A a = C4432A.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }
}
