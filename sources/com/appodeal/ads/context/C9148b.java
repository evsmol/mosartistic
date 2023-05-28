package com.appodeal.ads.context;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* renamed from: com.appodeal.ads.context.b */
public final class C9148b implements ContextProvider {

    /* renamed from: b */
    public static final C9148b f22956b = new C9148b();

    /* renamed from: a */
    public final /* synthetic */ C9153f f22957a = C9149c.m27236a();

    public final Activity getActivity() {
        return this.f22957a.getActivity();
    }

    public final Flow<Activity> getActivityFlow() {
        return this.f22957a.f22966e;
    }

    public final Context getApplicationContext() {
        return this.f22957a.getApplicationContext();
    }

    public final Context getApplicationContextOrNull() {
        return this.f22957a.f22962a;
    }

    public final StateFlow<Activity> getTopActivityFlow() {
        return this.f22957a.f22967f;
    }
}
