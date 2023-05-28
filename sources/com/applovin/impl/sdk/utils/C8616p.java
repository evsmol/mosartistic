package com.applovin.impl.sdk.utils;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.applovin.impl.sdk.utils.p */
public class C8616p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f21757a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Timer f21758b;

    /* renamed from: c */
    private long f21759c;

    /* renamed from: d */
    private long f21760d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Runnable f21761e;

    /* renamed from: f */
    private long f21762f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f21763g = new Object();

    private C8616p(C8490n nVar, Runnable runnable) {
        this.f21757a = nVar;
        this.f21761e = runnable;
    }

    /* renamed from: a */
    public static C8616p m26205a(long j, C8490n nVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        } else if (runnable != null) {
            C8616p pVar = new C8616p(nVar, runnable);
            pVar.f21759c = System.currentTimeMillis();
            pVar.f21760d = j;
            try {
                Timer timer = new Timer();
                pVar.f21758b = timer;
                timer.schedule(pVar.m26210e(), j);
            } catch (OutOfMemoryError e) {
                nVar.mo57320D();
                if (C8626v.m26252a()) {
                    nVar.mo57320D().mo57819b("Timer", "Failed to create timer due to OOM error", e);
                }
            }
            return pVar;
        } else {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
    }

    /* renamed from: e */
    private TimerTask m26210e() {
        return new TimerTask() {
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r5 = this;
                    r0 = 0
                    com.applovin.impl.sdk.utils.p r1 = com.applovin.impl.sdk.utils.C8616p.this     // Catch:{ all -> 0x001b }
                    java.lang.Runnable r1 = r1.f21761e     // Catch:{ all -> 0x001b }
                    r1.run()     // Catch:{ all -> 0x001b }
                    com.applovin.impl.sdk.utils.p r1 = com.applovin.impl.sdk.utils.C8616p.this
                    java.lang.Object r1 = r1.f21763g
                    monitor-enter(r1)
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C8616p.this     // Catch:{ all -> 0x0018 }
                    java.util.Timer unused = r2.f21758b = r0     // Catch:{ all -> 0x0018 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                    goto L_0x0060
                L_0x0018:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                    throw r0
                L_0x001b:
                    r1 = move-exception
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C8616p.this     // Catch:{ all -> 0x0064 }
                    com.applovin.impl.sdk.n r2 = r2.f21757a     // Catch:{ all -> 0x0064 }
                    if (r2 == 0) goto L_0x0053
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C8616p.this     // Catch:{ all -> 0x0064 }
                    com.applovin.impl.sdk.n r2 = r2.f21757a     // Catch:{ all -> 0x0064 }
                    r2.mo57320D()     // Catch:{ all -> 0x0064 }
                    boolean r2 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0064 }
                    if (r2 == 0) goto L_0x0053
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C8616p.this     // Catch:{ all -> 0x0064 }
                    com.applovin.impl.sdk.n r2 = r2.f21757a     // Catch:{ all -> 0x0064 }
                    r2.mo57320D()     // Catch:{ all -> 0x0064 }
                    boolean r2 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0064 }
                    if (r2 == 0) goto L_0x0053
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C8616p.this     // Catch:{ all -> 0x0064 }
                    com.applovin.impl.sdk.n r2 = r2.f21757a     // Catch:{ all -> 0x0064 }
                    com.applovin.impl.sdk.v r2 = r2.mo57320D()     // Catch:{ all -> 0x0064 }
                    java.lang.String r3 = "Timer"
                    java.lang.String r4 = "Encountered error while executing timed task"
                    r2.mo57819b(r3, r4, r1)     // Catch:{ all -> 0x0064 }
                L_0x0053:
                    com.applovin.impl.sdk.utils.p r1 = com.applovin.impl.sdk.utils.C8616p.this
                    java.lang.Object r1 = r1.f21763g
                    monitor-enter(r1)
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C8616p.this     // Catch:{ all -> 0x0061 }
                    java.util.Timer unused = r2.f21758b = r0     // Catch:{ all -> 0x0061 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0061 }
                L_0x0060:
                    return
                L_0x0061:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0061 }
                    throw r0
                L_0x0064:
                    r1 = move-exception
                    com.applovin.impl.sdk.utils.p r2 = com.applovin.impl.sdk.utils.C8616p.this
                    java.lang.Object r2 = r2.f21763g
                    monitor-enter(r2)
                    com.applovin.impl.sdk.utils.p r3 = com.applovin.impl.sdk.utils.C8616p.this     // Catch:{ all -> 0x0073 }
                    java.util.Timer unused = r3.f21758b = r0     // Catch:{ all -> 0x0073 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                    throw r1
                L_0x0073:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C8616p.C86171.run():void");
            }
        };
    }

    /* renamed from: a */
    public long mo57779a() {
        if (this.f21758b == null) {
            return this.f21760d - this.f21762f;
        }
        return this.f21760d - (System.currentTimeMillis() - this.f21759c);
    }

    /* renamed from: b */
    public void mo57780b() {
        synchronized (this.f21763g) {
            if (this.f21758b != null) {
                try {
                    this.f21758b.cancel();
                    this.f21762f = Math.max(1, System.currentTimeMillis() - this.f21759c);
                } catch (Throwable th) {
                    this.f21758b = null;
                    throw th;
                }
                this.f21758b = null;
            }
        }
    }

    /* renamed from: c */
    public void mo57781c() {
        synchronized (this.f21763g) {
            if (this.f21762f > 0) {
                try {
                    long j = this.f21760d - this.f21762f;
                    this.f21760d = j;
                    if (j < 0) {
                        this.f21760d = 0;
                    }
                    Timer timer = new Timer();
                    this.f21758b = timer;
                    timer.schedule(m26210e(), this.f21760d);
                    this.f21759c = System.currentTimeMillis();
                } catch (Throwable th) {
                    this.f21762f = 0;
                    throw th;
                }
                this.f21762f = 0;
            }
        }
    }

    /* renamed from: d */
    public void mo57782d() {
        synchronized (this.f21763g) {
            if (this.f21758b != null) {
                try {
                    this.f21758b.cancel();
                    this.f21758b = null;
                } catch (Throwable th) {
                    this.f21758b = null;
                    this.f21762f = 0;
                    throw th;
                }
                this.f21762f = 0;
            }
        }
    }
}
