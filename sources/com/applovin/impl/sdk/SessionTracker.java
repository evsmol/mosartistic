package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8394f;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C8561a;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: b */
    private static final AtomicBoolean f20456b = new AtomicBoolean();

    /* renamed from: a */
    final C8490n f20457a;

    /* renamed from: c */
    private final AtomicBoolean f20458c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f20459d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicInteger f20460e = new AtomicInteger();

    /* renamed from: f */
    private Date f20461f;

    /* renamed from: g */
    private Date f20462g;

    SessionTracker(final C8490n nVar) {
        this.f20457a = nVar;
        final Application application = (Application) nVar.mo57332P();
        application.registerActivityLifecycleCallbacks(new C8561a() {
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                SessionTracker.this.m24920a();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() {
            public void onConfigurationChanged(Configuration configuration) {
            }

            public void onLowMemory() {
            }

            public void onTrimMemory(int i) {
                SessionTracker.this.f20460e.set(i);
                if (i == 20) {
                    SessionTracker.this.m24923b();
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (Utils.isCurrentProcessInForeground()) {
                        SessionTracker.this.m24920a();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    SessionTracker.this.m24923b();
                }
            }
        }, intentFilter);
        if (((Boolean) nVar.mo57342a(C8380b.f20853cx)).booleanValue() && f20456b.compareAndSet(false, true)) {
            final Intent intent = new Intent(application, AppKilledService.class);
            application.startService(intent);
            nVar.mo57372am().registerReceiver(new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    application.stopService(intent);
                    nVar.mo57372am().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24920a() {
        if (this.f20459d.compareAndSet(true, false)) {
            m24926d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24923b() {
        if (this.f20459d.compareAndSet(false, true)) {
            m24924c();
        }
    }

    /* renamed from: c */
    private void m24924c() {
        this.f20457a.mo57320D();
        if (C8626v.m26252a()) {
            this.f20457a.mo57320D().mo57818b("SessionTracker", "Application Paused");
        }
        this.f20457a.mo57372am().sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), (Map<String, Object>) null);
        if (!this.f20458c.get()) {
            boolean booleanValue = ((Boolean) this.f20457a.mo57342a(C8380b.f20900ds)).booleanValue();
            long millis = TimeUnit.MINUTES.toMillis(((Long) this.f20457a.mo57342a(C8380b.f20902du)).longValue());
            if (this.f20461f == null || System.currentTimeMillis() - this.f20461f.getTime() >= millis) {
                ((EventServiceImpl) this.f20457a.mo57408x()).trackEvent("paused");
                if (booleanValue) {
                    this.f20461f = new Date();
                }
            }
            if (!booleanValue) {
                this.f20461f = new Date();
            }
        }
    }

    /* renamed from: d */
    private void m24926d() {
        this.f20457a.mo57320D();
        if (C8626v.m26252a()) {
            this.f20457a.mo57320D().mo57818b("SessionTracker", "Application Resumed");
        }
        boolean booleanValue = ((Boolean) this.f20457a.mo57342a(C8380b.f20900ds)).booleanValue();
        long longValue = ((Long) this.f20457a.mo57342a(C8380b.f20901dt)).longValue();
        this.f20457a.mo57372am().sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), (Map<String, Object>) null);
        if (!this.f20458c.getAndSet(false)) {
            long millis = TimeUnit.MINUTES.toMillis(longValue);
            if (this.f20462g == null || System.currentTimeMillis() - this.f20462g.getTime() >= millis) {
                ((EventServiceImpl) this.f20457a.mo57408x()).trackEvent("resumed");
                if (booleanValue) {
                    this.f20462g = new Date();
                }
            }
            if (!booleanValue) {
                this.f20462g = new Date();
            }
            this.f20457a.mo57338W().mo57151a(C8394f.f21094m);
        }
    }

    public int getLastTrimMemoryLevel() {
        return this.f20460e.get();
    }

    public boolean isApplicationPaused() {
        return this.f20459d.get();
    }

    public void pauseForClick() {
        this.f20458c.set(true);
    }

    public void resumeForClick() {
        this.f20458c.set(false);
    }
}
