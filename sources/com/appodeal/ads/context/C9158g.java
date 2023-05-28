package com.appodeal.ads.context;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.context.g */
public final class C9158g implements ContextProvider.Synchronizer {

    /* renamed from: b */
    public static final C9158g f22974b = new C9158g();

    /* renamed from: a */
    public final /* synthetic */ C9153f f22975a = C9149c.m27236a();

    public final void setActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f22975a.setActivity(activity);
    }

    public final void setApplicationContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        this.f22975a.setApplicationContext(context);
    }

    public final void setAutomaticActivityObserving(boolean z) {
        this.f22975a.setAutomaticActivityObserving(z);
    }
}
