package com.iab.omid.library.amazon.p099b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.amazon.adsession.C4152a;

/* renamed from: com.iab.omid.library.amazon.b.b */
public class C4155b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C4155b f9933a = new C4155b();

    /* renamed from: b */
    private boolean f9934b;

    /* renamed from: c */
    private boolean f9935c;

    /* renamed from: d */
    private C4156a f9936d;

    /* renamed from: com.iab.omid.library.amazon.b.b$a */
    public interface C4156a {
        /* renamed from: a */
        void mo32354a(boolean z);
    }

    private C4155b() {
    }

    /* renamed from: a */
    public static C4155b m11515a() {
        return f9933a;
    }

    /* renamed from: a */
    private void m11516a(boolean z) {
        if (this.f9935c != z) {
            this.f9935c = z;
            if (this.f9934b) {
                m11517e();
                C4156a aVar = this.f9936d;
                if (aVar != null) {
                    aVar.mo32354a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m11517e() {
        boolean z = !this.f9935c;
        for (C4152a adSessionStatePublisher : C4154a.m11508a().mo32337b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo32401a(z);
        }
    }

    /* renamed from: a */
    public void mo32342a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo32343a(C4156a aVar) {
        this.f9936d = aVar;
    }

    /* renamed from: b */
    public void mo32344b() {
        this.f9934b = true;
        this.f9935c = false;
        m11517e();
    }

    /* renamed from: c */
    public void mo32345c() {
        this.f9934b = false;
        this.f9935c = false;
        this.f9936d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo32346d() {
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
        m11516a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo32346d().importance != 100;
            boolean z3 = true;
            for (C4152a next : C4154a.m11508a().mo32339c()) {
                if (next.mo32306f() && (e = next.mo32305e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m11516a(z);
        }
    }
}
