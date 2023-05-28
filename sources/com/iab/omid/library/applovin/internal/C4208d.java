package com.iab.omid.library.applovin.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.iab.omid.library.applovin.internal.d */
public class C4208d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f10064a;

    /* renamed from: b */
    protected boolean f10065b;

    /* renamed from: c */
    private C4209a f10066c;

    /* renamed from: com.iab.omid.library.applovin.internal.d$a */
    public interface C4209a {
        /* renamed from: a */
        void mo32539a(boolean z);
    }

    /* renamed from: a */
    private void m11761a(boolean z) {
        if (this.f10065b != z) {
            this.f10065b = z;
            if (this.f10064a) {
                mo32542b(z);
                C4209a aVar = this.f10066c;
                if (aVar != null) {
                    aVar.mo32539a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m11762a() {
        return (mo32552b().importance == 100) || mo32543d();
    }

    /* renamed from: a */
    public void mo32550a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo32551a(C4209a aVar) {
        this.f10066c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ActivityManager.RunningAppProcessInfo mo32552b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo32542b(boolean z) {
    }

    /* renamed from: c */
    public boolean mo32553c() {
        return this.f10065b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo32543d() {
        return false;
    }

    /* renamed from: e */
    public void mo32554e() {
        this.f10064a = true;
        boolean a = m11762a();
        this.f10065b = a;
        mo32542b(a);
    }

    /* renamed from: f */
    public void mo32555f() {
        this.f10064a = false;
        this.f10066c = null;
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
        m11761a(true);
    }

    public void onActivityStopped(Activity activity) {
        m11761a(m11762a());
    }
}
