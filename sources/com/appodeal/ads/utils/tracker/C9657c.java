package com.appodeal.ads.utils.tracker;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: com.appodeal.ads.utils.tracker.c */
public final class C9657c implements C9655a {

    /* renamed from: com.appodeal.ads.utils.tracker.c$a */
    public static final class C9658a implements ComponentCallbacks2 {

        /* renamed from: a */
        public final /* synthetic */ C9657c f24455a;

        public C9658a(C9657c cVar) {
            this.f24455a = cVar;
        }

        public final void onConfigurationChanged(Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "newConfig");
        }

        public final void onLowMemory() {
            this.f24455a.getClass();
            Log.log(LogConstants.EVENT_WARNING, "onLowMemory");
        }

        public final void onTrimMemory(int i) {
            C9657c.m28407a(this.f24455a, i);
        }
    }

    /* renamed from: a */
    public static final void m28407a(C9657c cVar, int i) {
        cVar.getClass();
        if (i == 10 || i == 15) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("Level [%s]: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), "Critical lack of memory"}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            Log.log(LogConstants.EVENT_WARNING, "onTrimMemory", format);
        }
    }

    /* renamed from: a */
    public final void mo61169a(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        application.registerComponentCallbacks(new C9658a(this));
    }
}
