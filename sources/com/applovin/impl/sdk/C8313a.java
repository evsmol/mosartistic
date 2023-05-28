package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.C8561a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.a */
public class C8313a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final List<C8561a> f20480a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private WeakReference<Activity> f20481b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private WeakReference<Activity> f20482c = new WeakReference<>((Object) null);

    public C8313a(Context context) {
        C8626v.m26255f("AppLovinSdk", "Attaching Activity lifecycle manager...");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f20481b = new WeakReference<>(activity);
            if (activity.hasWindowFocus()) {
                this.f20482c = this.f20481b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: a */
    public Activity mo56831a() {
        return (Activity) this.f20481b.get();
    }

    /* renamed from: a */
    public void mo56832a(C8561a aVar) {
        this.f20480a.add(aVar);
    }

    /* renamed from: b */
    public Activity mo56833b() {
        return (Activity) this.f20482c.get();
    }

    /* renamed from: b */
    public void mo56834b(C8561a aVar) {
        this.f20480a.remove(aVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (C8561a onActivityCreated : new ArrayList(this.f20480a)) {
            onActivityCreated.onActivityCreated(activity, bundle);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        for (C8561a onActivityDestroyed : new ArrayList(this.f20480a)) {
            onActivityDestroyed.onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        this.f20482c = new WeakReference<>((Object) null);
        for (C8561a onActivityPaused : new ArrayList(this.f20480a)) {
            onActivityPaused.onActivityPaused(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.f20481b = weakReference;
        this.f20482c = weakReference;
        for (C8561a onActivityResumed : new ArrayList(this.f20480a)) {
            onActivityResumed.onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (C8561a onActivitySaveInstanceState : new ArrayList(this.f20480a)) {
            onActivitySaveInstanceState.onActivitySaveInstanceState(activity, bundle);
        }
    }

    public void onActivityStarted(Activity activity) {
        for (C8561a onActivityStarted : new ArrayList(this.f20480a)) {
            onActivityStarted.onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        for (C8561a onActivityStopped : new ArrayList(this.f20480a)) {
            onActivityStopped.onActivityStopped(activity);
        }
    }
}
