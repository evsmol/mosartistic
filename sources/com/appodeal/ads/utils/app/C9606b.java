package com.appodeal.ads.utils.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.appodeal.ads.utils.C9609c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

@Deprecated
/* renamed from: com.appodeal.ads.utils.app.b */
public enum C9606b implements C9605a {
    All,
    Ad,
    NotAd;
    

    /* renamed from: a */
    public final ConcurrentLinkedQueue f24356a;

    /* renamed from: a */
    public final void mo61051a(C9605a aVar) {
        if (aVar != null) {
            this.f24356a.add(new WeakReference(aVar));
        }
    }

    /* renamed from: a */
    public final boolean mo61052a(Activity activity) {
        return this == All || (this == Ad && C9609c.m28357a(activity)) || (this == NotAd && !C9609c.m28357a(activity));
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (mo61052a(activity)) {
            Iterator it = this.f24356a.iterator();
            while (it.hasNext()) {
                C9605a aVar = (C9605a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityCreated(activity, bundle);
                }
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (mo61052a(activity)) {
            Iterator it = this.f24356a.iterator();
            while (it.hasNext()) {
                C9605a aVar = (C9605a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityDestroyed(activity);
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (mo61052a(activity)) {
            Iterator it = this.f24356a.iterator();
            while (it.hasNext()) {
                C9605a aVar = (C9605a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityPaused(activity);
                }
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (mo61052a(activity)) {
            Iterator it = this.f24356a.iterator();
            while (it.hasNext()) {
                C9605a aVar = (C9605a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityResumed(activity);
                }
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (mo61052a(activity)) {
            Iterator it = this.f24356a.iterator();
            while (it.hasNext()) {
                C9605a aVar = (C9605a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivitySaveInstanceState(activity, bundle);
                }
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (mo61052a(activity)) {
            Iterator it = this.f24356a.iterator();
            while (it.hasNext()) {
                C9605a aVar = (C9605a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityStarted(activity);
                }
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (mo61052a(activity)) {
            Iterator it = this.f24356a.iterator();
            while (it.hasNext()) {
                C9605a aVar = (C9605a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onActivityStopped(activity);
                }
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Iterator it = this.f24356a.iterator();
        while (it.hasNext()) {
            C9605a aVar = (C9605a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.onConfigurationChanged(configuration);
            }
        }
    }

    public final void onLowMemory() {
        Iterator it = this.f24356a.iterator();
        while (it.hasNext()) {
            C9605a aVar = (C9605a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.onLowMemory();
            }
        }
    }
}
