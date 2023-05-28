package com.appodeal.ads.context;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.context.h */
public final class C9159h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final Function1<Activity, Unit> f22976a;

    /* renamed from: b */
    public final Function1<Activity, Unit> f22977b;

    public C9159h(C9151d dVar, C9152e eVar) {
        Intrinsics.checkNotNullParameter(dVar, "onTopActivityUpdated");
        Intrinsics.checkNotNullParameter(eVar, "onActivityDestroyed");
        this.f22976a = dVar;
        this.f22977b = eVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f22977b.invoke(activity);
    }

    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f22976a.invoke(null);
    }

    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f22976a.invoke(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "outState");
    }

    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
