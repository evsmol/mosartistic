package com.ironsource.sdk.p140d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.sdk.utils.SDKUtils;

/* renamed from: com.ironsource.sdk.d.a */
public final class C4907a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private C4924c f12530a;

    public C4907a(C4924c cVar) {
        this.f12530a = cVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (!SDKUtils.isIronSourceActivity(activity)) {
            this.f12530a.mo34627d(activity);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (!SDKUtils.isIronSourceActivity(activity)) {
            this.f12530a.mo34631e(activity);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
