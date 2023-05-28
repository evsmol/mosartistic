package com.criteo.publisher.p059a0;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import com.criteo.publisher.p074n0.C1311o;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.criteo.publisher.a0.b */
/* compiled from: TopActivityFinder */
public class C1019b {

    /* renamed from: a */
    private final Context f3393a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WeakReference<Activity> f3394b = new WeakReference<>((Object) null);

    public C1019b(Context context) {
        this.f3393a = context;
    }

    /* renamed from: a */
    public ComponentName mo2996a() {
        Activity activity = (Activity) this.f3394b.get();
        if (activity != null) {
            return activity.getComponentName();
        }
        ActivityManager activityManager = (ActivityManager) this.f3393a.getSystemService("activity");
        if (!C1311o.m5780a((Object) activityManager)) {
            return null;
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            if (runningTasks.isEmpty()) {
                return null;
            }
            ComponentName componentName = runningTasks.get(0).topActivity;
            if (componentName.getPackageName().startsWith(this.f3393a.getPackageName())) {
                return componentName;
            }
            return null;
        } catch (SecurityException e) {
            C1311o.m5779a((Throwable) e);
            return null;
        }
    }

    /* renamed from: com.criteo.publisher.a0.b$a */
    /* compiled from: TopActivityFinder */
    class C1020a extends C1018a {
        C1020a() {
        }

        public void onActivityResumed(Activity activity) {
            WeakReference unused = C1019b.this.f3394b = new WeakReference(activity);
        }

        public void onActivityPaused(Activity activity) {
            if (activity.equals(C1019b.this.f3394b.get())) {
                WeakReference unused = C1019b.this.f3394b = new WeakReference((Object) null);
            }
        }
    }

    /* renamed from: a */
    public void mo2997a(Application application) {
        application.registerActivityLifecycleCallbacks(new C1020a());
    }
}
