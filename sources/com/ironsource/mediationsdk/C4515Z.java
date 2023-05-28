package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;

/* renamed from: com.ironsource.mediationsdk.Z */
public final class C4515Z {

    /* renamed from: b */
    private static final C4515Z f11022b = new C4515Z();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public ISDemandOnlyRewardedVideoListener f11023a = null;

    private C4515Z() {
    }

    /* renamed from: a */
    public static C4515Z m13111a() {
        return f11022b;
    }

    /* renamed from: a */
    public final void mo33618a(final String str, final IronSourceError ironSourceError) {
        if (this.f11023a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C4515Z.this.f11023a.onRewardedVideoAdLoadFailed(str, ironSourceError);
                    C4515Z z = C4515Z.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdLoadFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo33619b(final String str, final IronSourceError ironSourceError) {
        if (this.f11023a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C4515Z.this.f11023a.onRewardedVideoAdShowFailed(str, ironSourceError);
                    C4515Z z = C4515Z.this;
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdShowFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage(), 1);
                }
            });
        }
    }
}
