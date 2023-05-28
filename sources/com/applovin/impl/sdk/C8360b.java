package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.mediation.p234a.C8073d;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.utils.C8616p;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.b */
public class C8360b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C8490n f20600a;

    /* renamed from: b */
    private final C8626v f20601b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8362a f20602c;

    /* renamed from: d */
    private C8616p f20603d;

    /* renamed from: e */
    private final Object f20604e = new Object();

    /* renamed from: f */
    private long f20605f;

    /* renamed from: com.applovin.impl.sdk.b$a */
    public interface C8362a {
        void onAdExpired();
    }

    public C8360b(C8490n nVar, C8362a aVar) {
        this.f20600a = nVar;
        this.f20601b = nVar.mo57320D();
        this.f20602c = aVar;
    }

    /* renamed from: a */
    private void m25141a(long j) {
        synchronized (this.f20604e) {
            mo57052a();
            this.f20605f = System.currentTimeMillis() + j;
            this.f20600a.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            this.f20600a.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            if (((Boolean) this.f20600a.mo57342a(C8379a.f20651F)).booleanValue() || !this.f20600a.mo57366ag().isApplicationPaused()) {
                this.f20603d = C8616p.m26205a(j, this.f20600a, new Runnable() {
                    public void run() {
                        C8360b.this.mo57052a();
                        C8360b.this.f20602c.onAdExpired();
                    }
                });
            }
        }
    }

    /* renamed from: b */
    private void m25142b() {
        C8616p pVar = this.f20603d;
        if (pVar != null) {
            pVar.mo57782d();
            this.f20603d = null;
        }
    }

    /* renamed from: c */
    private void m25143c() {
        synchronized (this.f20604e) {
            m25142b();
        }
    }

    /* renamed from: d */
    private void m25144d() {
        boolean z;
        synchronized (this.f20604e) {
            long currentTimeMillis = this.f20605f - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                mo57052a();
                z = true;
            } else {
                m25141a(currentTimeMillis);
                z = false;
            }
        }
        if (z) {
            this.f20602c.onAdExpired();
        }
    }

    /* renamed from: a */
    public void mo57052a() {
        synchronized (this.f20604e) {
            m25142b();
            this.f20600a.mo57372am().unregisterReceiver(this);
        }
    }

    /* renamed from: a */
    public boolean mo57053a(C8070a aVar) {
        long j;
        if (aVar instanceof C8072c) {
            j = ((C8072c) aVar).mo56113z();
        } else if (aVar instanceof C8073d) {
            j = ((C8073d) aVar).mo56132C();
        } else {
            throw new IllegalArgumentException("Ad does not support scheduling expiration");
        }
        long elapsedRealtime = j - (SystemClock.elapsedRealtime() - aVar.mo56102u());
        if (elapsedRealtime > 2000) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f20601b;
                vVar.mo57818b("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime) + " seconds from now for " + aVar.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            m25141a(elapsedRealtime);
            return true;
        } else if (!C8626v.m26252a()) {
            return false;
        } else {
            this.f20601b.mo57818b("AdExpirationManager", "Ad is already expired");
            return false;
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            m25143c();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            m25144d();
        }
    }
}
