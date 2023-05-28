package com.applovin.impl.sdk.p256e;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8568f;
import com.applovin.impl.sdk.utils.Utils;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.o */
public class C8432o {

    /* renamed from: a */
    private static final ExecutorService f21164a = Executors.newFixedThreadPool(4);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8490n f21165b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8626v f21166c;

    /* renamed from: d */
    private final ScheduledThreadPoolExecutor f21167d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ScheduledThreadPoolExecutor f21168e;

    /* renamed from: f */
    private final List<C8437c> f21169f = new ArrayList(5);

    /* renamed from: g */
    private final Object f21170g = new Object();

    /* renamed from: h */
    private boolean f21171h;

    /* renamed from: com.applovin.impl.sdk.e.o$a */
    public enum C8434a {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        ADVERTISING_INFO_COLLECTION,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BANNER,
        MEDIATION_INTERSTITIAL,
        MEDIATION_APP_OPEN,
        MEDIATION_INCENTIVIZED,
        MEDIATION_REWARDED_INTERSTITIAL,
        MEDIATION_REWARD
    }

    /* renamed from: com.applovin.impl.sdk.e.o$b */
    private class C8435b implements ThreadFactory {

        /* renamed from: b */
        private final String f21195b;

        C8435b(String str) {
            this.f21195b = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f21195b + ":" + Utils.shortenKey(C8432o.this.f21165b.mo57319C()));
            thread.setDaemon(true);
            thread.setPriority(((Integer) C8432o.this.f21165b.mo57342a(C8380b.f20977fr)).intValue());
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    C8626v unused = C8432o.this.f21166c;
                    if (C8626v.m26252a()) {
                        C8432o.this.f21166c.mo57819b("TaskManager", "Caught unhandled exception", th);
                    }
                }
            });
            return thread;
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.o$c */
    private static class C8437c implements Runnable {

        /* renamed from: a */
        private final C8490n f21197a;

        /* renamed from: b */
        private final String f21198b;

        /* renamed from: c */
        private final C8626v f21199c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C8401a f21200d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C8434a f21201e;

        C8437c(C8490n nVar, C8401a aVar, C8434a aVar2) {
            this.f21197a = nVar;
            this.f21199c = nVar.mo57320D();
            this.f21198b = aVar.mo57168e();
            this.f21200d = aVar;
            this.f21201e = aVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = " queue finished task "
                com.applovin.impl.sdk.utils.C8571h.m26082a()     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.n r1 = r6.f21197a     // Catch:{ all -> 0x004a }
                boolean r1 = r1.mo57386c()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0035
                com.applovin.impl.sdk.e.a r1 = r6.f21200d     // Catch:{ all -> 0x004a }
                boolean r1 = r1.mo57170g()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0016
                goto L_0x0035
            L_0x0016:
                boolean r1 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0025
                com.applovin.impl.sdk.v r1 = r6.f21199c     // Catch:{ all -> 0x004a }
                java.lang.String r2 = r6.f21198b     // Catch:{ all -> 0x004a }
                java.lang.String r3 = "Task re-scheduled..."
                r1.mo57820c(r2, r3)     // Catch:{ all -> 0x004a }
            L_0x0025:
                com.applovin.impl.sdk.n r1 = r6.f21197a     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.o r1 = r1.mo57337V()     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.a r2 = r6.f21200d     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.o$a r3 = r6.f21201e     // Catch:{ all -> 0x004a }
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.mo57229a((com.applovin.impl.sdk.p256e.C8401a) r2, (com.applovin.impl.sdk.p256e.C8432o.C8434a) r3, (long) r4)     // Catch:{ all -> 0x004a }
                goto L_0x003a
            L_0x0035:
                com.applovin.impl.sdk.e.a r1 = r6.f21200d     // Catch:{ all -> 0x004a }
                r1.run()     // Catch:{ all -> 0x004a }
            L_0x003a:
                boolean r1 = com.applovin.impl.sdk.C8626v.m26252a()
                if (r1 == 0) goto L_0x0081
                com.applovin.impl.sdk.v r1 = r6.f21199c
                java.lang.String r2 = r6.f21198b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                goto L_0x0069
            L_0x004a:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x0082 }
                if (r2 == 0) goto L_0x005a
                com.applovin.impl.sdk.v r2 = r6.f21199c     // Catch:{ all -> 0x0082 }
                java.lang.String r3 = r6.f21198b     // Catch:{ all -> 0x0082 }
                java.lang.String r4 = "Task failed execution"
                r2.mo57819b(r3, r4, r1)     // Catch:{ all -> 0x0082 }
            L_0x005a:
                boolean r1 = com.applovin.impl.sdk.C8626v.m26252a()
                if (r1 == 0) goto L_0x0081
                com.applovin.impl.sdk.v r1 = r6.f21199c
                java.lang.String r2 = r6.f21198b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
            L_0x0069:
                com.applovin.impl.sdk.e.o$a r4 = r6.f21201e
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f21200d
                java.lang.String r0 = r0.mo57168e()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.mo57820c(r2, r0)
            L_0x0081:
                return
            L_0x0082:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.C8626v.m26252a()
                if (r2 == 0) goto L_0x00aa
                com.applovin.impl.sdk.v r2 = r6.f21199c
                java.lang.String r3 = r6.f21198b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.sdk.e.o$a r5 = r6.f21201e
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f21200d
                java.lang.String r0 = r0.mo57168e()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.mo57820c(r3, r0)
            L_0x00aa:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p256e.C8432o.C8437c.run():void");
        }
    }

    public C8432o(C8490n nVar) {
        this.f21165b = nVar;
        this.f21166c = nVar.mo57320D();
        this.f21167d = m25415a("auxiliary_operations", ((Integer) nVar.mo57342a(C8380b.f20841cl)).intValue());
        this.f21168e = m25415a("shared_thread_pool", ((Integer) nVar.mo57342a(C8380b.f20740ap)).intValue());
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m25415a(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new C8435b(str));
    }

    /* renamed from: a */
    private void m25416a(final Runnable runnable, long j, boolean z) {
        if (j <= 0) {
            this.f21168e.submit(runnable);
        } else if (z) {
            C8568f.m26077a(j, this.f21165b, new Runnable() {
                public void run() {
                    C8432o.this.f21168e.execute(runnable);
                }
            });
        } else {
            this.f21168e.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    private boolean m25417a(C8437c cVar) {
        if (cVar.f21200d.mo57170g()) {
            return false;
        }
        synchronized (this.f21170g) {
            if (this.f21171h) {
                return false;
            }
            this.f21169f.add(cVar);
            return true;
        }
    }

    /* renamed from: a */
    public void mo57227a(C8401a aVar) {
        if (aVar != null) {
            try {
                if (!Utils.isMainThread() || !((Boolean) this.f21165b.mo57342a(C8380b.f20976fq)).booleanValue()) {
                    aVar.run();
                } else {
                    this.f21168e.submit(aVar);
                }
            } catch (Throwable th) {
                if (C8626v.m26252a()) {
                    this.f21166c.mo57819b(aVar.mo57168e(), "Task failed execution", th);
                }
            }
        } else if (C8626v.m26252a()) {
            this.f21166c.mo57822e("TaskManager", "Attempted to execute null task immediately");
        }
    }

    /* renamed from: a */
    public void mo57228a(C8401a aVar, C8434a aVar2) {
        mo57229a(aVar, aVar2, 0);
    }

    /* renamed from: a */
    public void mo57229a(C8401a aVar, C8434a aVar2, long j) {
        mo57230a(aVar, aVar2, j, false);
    }

    /* renamed from: a */
    public void mo57230a(C8401a aVar, C8434a aVar2, long j, boolean z) {
        if (aVar == null) {
            throw new IllegalArgumentException("No task specified");
        } else if (j < 0) {
            throw new IllegalArgumentException("Invalid delay (millis) specified: " + j);
        } else if (!m25417a(new C8437c(this.f21165b, aVar, aVar2))) {
            m25416a((Runnable) aVar, j, z);
        } else if (C8626v.m26252a()) {
            this.f21166c.mo57820c(aVar.mo57168e(), "Task execution delayed until after init");
        }
    }

    /* renamed from: a */
    public void mo57231a(Runnable runnable) {
        this.f21167d.submit(runnable);
    }

    /* renamed from: a */
    public boolean mo57232a() {
        return this.f21171h;
    }

    /* renamed from: b */
    public Executor mo57233b() {
        return this.f21168e;
    }

    /* renamed from: c */
    public ExecutorService mo57234c() {
        return f21164a;
    }

    /* renamed from: d */
    public void mo57235d() {
        synchronized (this.f21170g) {
            this.f21171h = false;
        }
    }

    /* renamed from: e */
    public void mo57236e() {
        synchronized (this.f21170g) {
            this.f21171h = true;
            for (C8437c next : this.f21169f) {
                mo57228a(next.f21200d, next.f21201e);
            }
            this.f21169f.clear();
        }
    }
}
