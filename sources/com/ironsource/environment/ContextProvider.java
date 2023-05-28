package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;

public class ContextProvider {

    /* renamed from: e */
    private static volatile ContextProvider f10423e;

    /* renamed from: a */
    private Activity f10424a;

    /* renamed from: b */
    private Context f10425b;

    /* renamed from: c */
    private ConcurrentHashMap<String, C4375a> f10426c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private Handler f10427d = new Handler(Looper.getMainLooper());

    /* renamed from: com.ironsource.environment.ContextProvider$a */
    public interface C4375a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f10423e == null) {
            synchronized (ContextProvider.class) {
                if (f10423e == null) {
                    f10423e = new ContextProvider();
                }
            }
        }
        return f10423e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f10424a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context getApplicationContext() {
        /*
            r1 = this;
            android.content.Context r0 = r1.f10425b
            if (r0 != 0) goto L_0x000d
            android.app.Activity r0 = r1.f10424a
            if (r0 == 0) goto L_0x000d
            android.content.Context r0 = r0.getApplicationContext()
            return r0
        L_0x000d:
            android.content.Context r0 = r1.f10425b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.ContextProvider.getApplicationContext():android.content.Context");
    }

    public Activity getCurrentActiveActivity() {
        return this.f10424a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            for (C4375a onPause : this.f10426c.values()) {
                onPause.onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f10424a = activity;
            for (C4375a onResume : this.f10426c.values()) {
                onResume.onResume(this.f10424a);
            }
        }
    }

    @Deprecated
    public void postOnUIThread(Runnable runnable) {
        Handler handler = this.f10427d;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void registerLifeCycleListener(C4375a aVar) {
        this.f10426c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f10424a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f10425b = context;
        }
    }
}
