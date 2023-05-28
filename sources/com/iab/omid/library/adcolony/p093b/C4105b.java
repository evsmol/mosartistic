package com.iab.omid.library.adcolony.p093b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.adcolony.adsession.C4102a;

/* renamed from: com.iab.omid.library.adcolony.b.b */
public class C4105b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C4105b f9816a = new C4105b();

    /* renamed from: b */
    private boolean f9817b;

    /* renamed from: c */
    private boolean f9818c;

    /* renamed from: d */
    private C4106a f9819d;

    /* renamed from: com.iab.omid.library.adcolony.b.b$a */
    public interface C4106a {
        /* renamed from: a */
        void mo32155a(boolean z);
    }

    private C4105b() {
    }

    /* renamed from: a */
    public static C4105b m11285a() {
        return f9816a;
    }

    /* renamed from: a */
    private void m11286a(boolean z) {
        if (this.f9818c != z) {
            this.f9818c = z;
            if (this.f9817b) {
                m11287e();
                C4106a aVar = this.f9819d;
                if (aVar != null) {
                    aVar.mo32155a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m11287e() {
        boolean z = !this.f9818c;
        for (C4102a adSessionStatePublisher : C4104a.m11278a().mo32138b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo32202a(z);
        }
    }

    /* renamed from: a */
    public void mo32143a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo32144a(C4106a aVar) {
        this.f9819d = aVar;
    }

    /* renamed from: b */
    public void mo32145b() {
        this.f9817b = true;
        this.f9818c = false;
        m11287e();
    }

    /* renamed from: c */
    public void mo32146c() {
        this.f9817b = false;
        this.f9818c = false;
        this.f9819d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo32147d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        m11286a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo32147d().importance != 100;
            boolean z3 = true;
            for (C4102a next : C4104a.m11278a().mo32140c()) {
                if (next.mo32107f() && (e = next.mo32106e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m11286a(z);
        }
    }
}
