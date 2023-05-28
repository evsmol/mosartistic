package com.appodeal.ads.utils;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.appodeal.ads.utils.app.AppState;
import com.appodeal.ads.utils.app.C9605a;

/* renamed from: com.appodeal.ads.utils.c0 */
public abstract class C9614c0 implements C9605a {
    /* renamed from: a */
    public abstract void mo59983a(Activity activity, AppState appState);

    /* renamed from: a */
    public abstract void mo59984a(Configuration configuration);

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo59983a(activity, AppState.Created);
    }

    public final void onActivityDestroyed(Activity activity) {
        mo59983a(activity, AppState.Destroyed);
    }

    public final void onActivityPaused(Activity activity) {
        mo59983a(activity, AppState.Paused);
    }

    public final void onActivityResumed(Activity activity) {
        mo59983a(activity, AppState.Resumed);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        mo59983a(activity, AppState.Started);
    }

    public final void onActivityStopped(Activity activity) {
        mo59983a(activity, AppState.Stopped);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        mo59984a(configuration);
    }

    public final void onLowMemory() {
    }
}
