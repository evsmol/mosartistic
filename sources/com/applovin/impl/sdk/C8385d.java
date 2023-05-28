package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.utils.C8616p;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.d */
public class C8385d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private C8616p f21025a;

    /* renamed from: b */
    private final Object f21026b = new Object();

    /* renamed from: c */
    private final AtomicBoolean f21027c = new AtomicBoolean();

    /* renamed from: d */
    private boolean f21028d;

    /* renamed from: e */
    private final C8490n f21029e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference<C8387a> f21030f;

    /* renamed from: g */
    private long f21031g;

    /* renamed from: com.applovin.impl.sdk.d$a */
    public interface C8387a {
        void onAdRefresh();
    }

    public C8385d(C8490n nVar, C8387a aVar) {
        this.f21030f = new WeakReference<>(aVar);
        this.f21029e = nVar;
    }

    /* renamed from: i */
    private void m25230i() {
        synchronized (this.f21026b) {
            if (this.f21025a != null) {
                this.f21025a.mo57780b();
            } else {
                this.f21029e.mo57320D();
                if (C8626v.m26252a()) {
                    this.f21029e.mo57320D().mo57818b("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f21027c.set(true);
            }
        }
    }

    /* renamed from: j */
    private void m25231j() {
        synchronized (this.f21026b) {
            if (this.f21025a != null) {
                this.f21025a.mo57781c();
            } else {
                this.f21027c.set(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m25232k() {
        synchronized (this.f21026b) {
            this.f21025a = null;
            if (!((Boolean) this.f21029e.mo57342a(C8379a.f20688r)).booleanValue()) {
                this.f21029e.mo57372am().unregisterReceiver(this);
            }
        }
    }

    /* renamed from: l */
    private void m25233l() {
        if (((Boolean) this.f21029e.mo57342a(C8379a.f20687q)).booleanValue()) {
            m25230i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25234m() {
        /*
            r4 = this;
            com.applovin.impl.sdk.n r0 = r4.f21029e
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.p254c.C8379a.f20687q
            java.lang.Object r0 = r0.mo57342a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r4.f21026b
            monitor-enter(r0)
            boolean r1 = r4.f21028d     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0031
            com.applovin.impl.sdk.n r1 = r4.f21029e     // Catch:{ all -> 0x0062 }
            r1.mo57320D()     // Catch:{ all -> 0x0062 }
            boolean r1 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x002f
            com.applovin.impl.sdk.n r1 = r4.f21029e     // Catch:{ all -> 0x0062 }
            com.applovin.impl.sdk.v r1 = r1.mo57320D()     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh."
            r1.mo57818b(r2, r3)     // Catch:{ all -> 0x0062 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return
        L_0x0031:
            com.applovin.impl.sdk.n r1 = r4.f21029e     // Catch:{ all -> 0x0062 }
            com.applovin.impl.sdk.SessionTracker r1 = r1.mo57366ag()     // Catch:{ all -> 0x0062 }
            boolean r1 = r1.isApplicationPaused()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0057
            com.applovin.impl.sdk.n r1 = r4.f21029e     // Catch:{ all -> 0x0062 }
            r1.mo57320D()     // Catch:{ all -> 0x0062 }
            boolean r1 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0055
            com.applovin.impl.sdk.n r1 = r4.f21029e     // Catch:{ all -> 0x0062 }
            com.applovin.impl.sdk.v r1 = r1.mo57320D()     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the application to enter foreground to resume the timer."
            r1.mo57818b(r2, r3)     // Catch:{ all -> 0x0062 }
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            return
        L_0x0057:
            com.applovin.impl.sdk.utils.p r1 = r4.f21025a     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0060
            com.applovin.impl.sdk.utils.p r1 = r4.f21025a     // Catch:{ all -> 0x0062 }
            r1.mo57781c()     // Catch:{ all -> 0x0062 }
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            goto L_0x0065
        L_0x0062:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            throw r1
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8385d.m25234m():void");
    }

    /* renamed from: a */
    public void mo57110a(long j) {
        synchronized (this.f21026b) {
            mo57113c();
            this.f21031g = j;
            this.f21025a = C8616p.m26205a(j, this.f21029e, new Runnable() {
                public void run() {
                    C8385d.this.m25232k();
                    C8387a aVar = (C8387a) C8385d.this.f21030f.get();
                    if (aVar != null) {
                        aVar.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.f21029e.mo57342a(C8379a.f20688r)).booleanValue()) {
                this.f21029e.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                this.f21029e.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                this.f21029e.mo57372am().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                this.f21029e.mo57372am().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f21029e.mo57342a(C8379a.f20687q)).booleanValue() && (this.f21029e.mo57367ah().mo57675b() || this.f21029e.mo57366ag().isApplicationPaused())) {
                this.f21025a.mo57780b();
            }
            if (this.f21027c.compareAndSet(true, false) && ((Boolean) this.f21029e.mo57342a(C8379a.f20689s)).booleanValue()) {
                this.f21029e.mo57320D();
                if (C8626v.m26252a()) {
                    this.f21029e.mo57320D().mo57818b("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f21025a.mo57780b();
            }
        }
    }

    /* renamed from: a */
    public boolean mo57111a() {
        boolean z;
        synchronized (this.f21026b) {
            z = this.f21025a != null;
        }
        return z;
    }

    /* renamed from: b */
    public long mo57112b() {
        long a;
        synchronized (this.f21026b) {
            a = this.f21025a != null ? this.f21025a.mo57779a() : -1;
        }
        return a;
    }

    /* renamed from: c */
    public void mo57113c() {
        synchronized (this.f21026b) {
            if (this.f21025a != null) {
                this.f21025a.mo57782d();
                m25232k();
            }
        }
    }

    /* renamed from: d */
    public void mo57114d() {
        synchronized (this.f21026b) {
            m25230i();
            this.f21028d = true;
        }
    }

    /* renamed from: e */
    public void mo57115e() {
        synchronized (this.f21026b) {
            m25231j();
            this.f21028d = false;
        }
    }

    /* renamed from: f */
    public boolean mo57116f() {
        return this.f21028d;
    }

    /* renamed from: g */
    public void mo57117g() {
        if (((Boolean) this.f21029e.mo57342a(C8379a.f20686p)).booleanValue()) {
            m25230i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        r0 = (com.applovin.impl.sdk.C8385d.C8387a) r9.f21030f.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r0.onAdRefresh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57118h() {
        /*
            r9 = this;
            com.applovin.impl.sdk.n r0 = r9.f21029e
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.p254c.C8379a.f20686p
            java.lang.Object r0 = r0.mo57342a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r9.f21026b
            monitor-enter(r0)
            boolean r1 = r9.f21028d     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0031
            com.applovin.impl.sdk.n r1 = r9.f21029e     // Catch:{ all -> 0x0097 }
            r1.mo57320D()     // Catch:{ all -> 0x0097 }
            boolean r1 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x002f
            com.applovin.impl.sdk.n r1 = r9.f21029e     // Catch:{ all -> 0x0097 }
            com.applovin.impl.sdk.v r1 = r1.mo57320D()     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh."
            r1.mo57818b(r2, r3)     // Catch:{ all -> 0x0097 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            return
        L_0x0031:
            com.applovin.impl.sdk.n r1 = r9.f21029e     // Catch:{ all -> 0x0097 }
            com.applovin.impl.sdk.t r1 = r1.mo57367ah()     // Catch:{ all -> 0x0097 }
            boolean r1 = r1.mo57675b()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0057
            com.applovin.impl.sdk.n r1 = r9.f21029e     // Catch:{ all -> 0x0097 }
            r1.mo57320D()     // Catch:{ all -> 0x0097 }
            boolean r1 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0055
            com.applovin.impl.sdk.n r1 = r9.f21029e     // Catch:{ all -> 0x0097 }
            com.applovin.impl.sdk.v r1 = r1.mo57320D()     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the full screen ad to be dismissed to resume the timer."
            r1.mo57818b(r2, r3)     // Catch:{ all -> 0x0097 }
        L_0x0055:
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            return
        L_0x0057:
            com.applovin.impl.sdk.utils.p r1 = r9.f21025a     // Catch:{ all -> 0x0097 }
            r2 = 0
            if (r1 == 0) goto L_0x0086
            long r3 = r9.f21031g     // Catch:{ all -> 0x0097 }
            long r5 = r9.mo57112b()     // Catch:{ all -> 0x0097 }
            long r3 = r3 - r5
            com.applovin.impl.sdk.n r1 = r9.f21029e     // Catch:{ all -> 0x0097 }
            com.applovin.impl.sdk.c.b<java.lang.Long> r5 = com.applovin.impl.sdk.p254c.C8379a.f20685o     // Catch:{ all -> 0x0097 }
            java.lang.Object r1 = r1.mo57342a(r5)     // Catch:{ all -> 0x0097 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0097 }
            long r5 = r1.longValue()     // Catch:{ all -> 0x0097 }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x0081
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0081
            r9.mo57113c()     // Catch:{ all -> 0x0097 }
            r1 = 1
            r2 = 1
            goto L_0x0086
        L_0x0081:
            com.applovin.impl.sdk.utils.p r1 = r9.f21025a     // Catch:{ all -> 0x0097 }
            r1.mo57781c()     // Catch:{ all -> 0x0097 }
        L_0x0086:
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x009a
            java.lang.ref.WeakReference<com.applovin.impl.sdk.d$a> r0 = r9.f21030f
            java.lang.Object r0 = r0.get()
            com.applovin.impl.sdk.d$a r0 = (com.applovin.impl.sdk.C8385d.C8387a) r0
            if (r0 == 0) goto L_0x009a
            r0.onAdRefresh()
            goto L_0x009a
        L_0x0097:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            throw r1
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8385d.mo57118h():void");
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            mo57117g();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            mo57118h();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            m25233l();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m25234m();
        }
    }
}
