package com.criteo.publisher.p074n0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.criteo.publisher.C1071e;
import com.criteo.publisher.p058a.C1017a;

/* renamed from: com.criteo.publisher.n0.e */
/* compiled from: AppLifecycleUtil */
public class C1298e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final C1017a f4013a;

    /* renamed from: b */
    private final C1071e f4014b;

    /* renamed from: c */
    private int f4015c = 0;

    /* renamed from: d */
    private int f4016d = 0;

    /* renamed from: e */
    private boolean f4017e = false;

    /* renamed from: f */
    private boolean f4018f = false;

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public C1298e(C1017a aVar, C1071e eVar) {
        this.f4013a = aVar;
        this.f4014b = eVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f4018f) {
            this.f4018f = true;
            this.f4013a.mo2989d();
        }
    }

    public void onActivityStarted(Activity activity) {
        this.f4015c++;
    }

    public void onActivityResumed(Activity activity) {
        if (this.f4016d == 0 && !this.f4017e) {
            this.f4013a.mo2987b();
        }
        this.f4017e = false;
        this.f4016d++;
    }

    public void onActivityPaused(Activity activity) {
        this.f4017e = true;
        this.f4016d--;
    }

    public void onActivityStopped(Activity activity) {
        if (this.f4015c == 1) {
            if (this.f4017e && this.f4016d == 0) {
                this.f4013a.mo2988c();
            }
            this.f4013a.mo2985a();
            this.f4014b.mo3119c();
        }
        this.f4017e = false;
        this.f4015c--;
    }
}
