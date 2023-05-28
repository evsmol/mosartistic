package p150io.bidmachine;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import p150io.bidmachine.core.Logger;
import p150io.bidmachine.core.Utils;

/* renamed from: io.bidmachine.BidMachineActivityManager */
class BidMachineActivityManager {
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private static WeakReference<Activity> weakTopActivity;

    BidMachineActivityManager() {
    }

    static void initialize(Context context) {
        if (isInitialized.compareAndSet(false, true)) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(new LifecycleCallbacks());
                }
            } catch (Throwable th) {
                Logger.log(th);
            }
        }
    }

    static Activity getTopActivity() {
        WeakReference<Activity> weakReference = weakTopActivity;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    static void setTopActivity(Activity activity) {
        weakTopActivity = new WeakReference<>(activity);
    }

    /* renamed from: io.bidmachine.BidMachineActivityManager$LifecycleCallbacks */
    private static class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }

        private LifecycleCallbacks() {
        }

        public void onActivityStarted(Activity activity) {
            BidMachineActivityManager.setTopActivity(activity);
        }

        public void onActivityResumed(Activity activity) {
            BidMachineActivityManager.setTopActivity(activity);
            Utils.onBackgroundThread(C5146xda7ffa26.INSTANCE);
        }

        public void onActivityPaused(Activity activity) {
            Utils.onBackgroundThread(C5145xfe2ab53a.INSTANCE);
        }
    }
}
