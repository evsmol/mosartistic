package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.utils.f */
public class C8568f implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private static final Set<C8568f> f21641a = new HashSet();

    /* renamed from: b */
    private final C8616p f21642b;

    /* renamed from: c */
    private final C8490n f21643c;

    private C8568f(long j, C8490n nVar, final Runnable runnable) {
        this.f21642b = C8616p.m26205a(j, nVar, new Runnable() {
            public void run() {
                C8568f.this.mo57699a();
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.f21643c = nVar;
        f21641a.add(this);
        nVar.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        nVar.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* renamed from: a */
    public static C8568f m26077a(long j, C8490n nVar, Runnable runnable) {
        return new C8568f(j, nVar, runnable);
    }

    /* renamed from: a */
    public void mo57699a() {
        this.f21642b.mo57782d();
        this.f21643c.mo57372am().unregisterReceiver(this);
        f21641a.remove(this);
    }

    /* renamed from: b */
    public long mo57700b() {
        return this.f21642b.mo57779a();
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f21642b.mo57780b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f21642b.mo57781c();
        }
    }
}
