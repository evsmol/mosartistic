package com.iab.omid.library.appodeal.p105b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.appodeal.adsession.C4259a;

/* renamed from: com.iab.omid.library.appodeal.b.b */
public class C4262b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C4262b f10174a = new C4262b();

    /* renamed from: b */
    private boolean f10175b;

    /* renamed from: c */
    private boolean f10176c;

    /* renamed from: d */
    private C4263a f10177d;

    /* renamed from: com.iab.omid.library.appodeal.b.b$a */
    public interface C4263a {
        /* renamed from: a */
        void mo32761a(boolean z);
    }

    private C4262b() {
    }

    /* renamed from: a */
    public static C4262b m11996a() {
        return f10174a;
    }

    /* renamed from: a */
    private void m11997a(boolean z) {
        if (this.f10176c != z) {
            this.f10176c = z;
            if (this.f10175b) {
                m11998e();
                C4263a aVar = this.f10177d;
                if (aVar != null) {
                    aVar.mo32761a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m11998e() {
        boolean z = !this.f10176c;
        for (C4259a adSessionStatePublisher : C4261a.m11989a().mo32744b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo32808a(z);
        }
    }

    /* renamed from: a */
    public void mo32749a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo32750a(C4263a aVar) {
        this.f10177d = aVar;
    }

    /* renamed from: b */
    public void mo32751b() {
        this.f10175b = true;
        this.f10176c = false;
        m11998e();
    }

    /* renamed from: c */
    public void mo32752c() {
        this.f10175b = false;
        this.f10176c = false;
        this.f10177d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo32753d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        View d;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo32753d().importance != 100;
            boolean z3 = true;
            for (C4259a next : C4261a.m11989a().mo32746c()) {
                if (next.mo32713e() && (d = next.mo32712d()) != null && d.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m11997a(z);
        }
    }

    public void onActivityResumed(Activity activity) {
        m11997a(false);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
