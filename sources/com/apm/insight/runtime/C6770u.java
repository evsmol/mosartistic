package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.apm.insight.runtime.u */
public class C6770u {

    /* renamed from: a */
    static final C6774b<C6776d, Runnable> f14546a = new C6774b<C6776d, Runnable>() {
    };

    /* renamed from: b */
    static final C6774b<Message, Runnable> f14547b = new C6774b<Message, Runnable>() {
    };

    /* renamed from: c */
    private final HandlerThread f14548c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Queue<C6776d> f14549d = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Queue<Message> f14550e = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile Handler f14551f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f14552g = new Object();

    /* renamed from: com.apm.insight.runtime.u$a */
    class C6773a implements Runnable {
        C6773a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52332a() {
            while (!C6770u.this.f14549d.isEmpty()) {
                C6776d dVar = (C6776d) C6770u.this.f14549d.poll();
                if (C6770u.this.f14551f != null) {
                    try {
                        C6770u.this.f14551f.sendMessageAtTime(dVar.f14557a, dVar.f14558b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo52333b() {
            while (!C6770u.this.f14550e.isEmpty()) {
                if (C6770u.this.f14551f != null) {
                    try {
                        C6770u.this.f14551f.sendMessageAtFrontOfQueue((Message) C6770u.this.f14550e.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public void run() {
            mo52333b();
            mo52332a();
        }
    }

    /* renamed from: com.apm.insight.runtime.u$b */
    public interface C6774b<A, B> {
    }

    /* renamed from: com.apm.insight.runtime.u$c */
    class C6775c extends HandlerThread {

        /* renamed from: a */
        volatile int f14554a = 0;

        /* renamed from: b */
        volatile boolean f14555b = false;

        C6775c(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|22|21) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            com.apm.insight.p166b.C6564g.m16054a(com.apm.insight.C6617h.m16313g()).mo51997a().mo51984c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
            if (r4.f14554a < 5) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
            com.apm.insight.C6553b.m16004a().mo52019a("NPTH_CATCH", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            if (r4.f14555b == false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
            r4.f14555b = true;
            com.apm.insight.C6553b.m16004a().mo52019a("NPTH_ERR_MAX", (java.lang.Throwable) new java.lang.RuntimeException());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
            r4.f14554a++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[LOOP:0: B:6:0x0025->B:21:0x0025, LOOP_START, SYNTHETIC, Splitter:B:6:0x0025] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLooperPrepared() {
            /*
                r4 = this;
                super.onLooperPrepared()
                com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C6770u.this
                java.lang.Object r0 = r0.f14552g
                monitor-enter(r0)
                com.apm.insight.runtime.u r1 = com.apm.insight.runtime.C6770u.this     // Catch:{ all -> 0x0063 }
                android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0063 }
                r2.<init>()     // Catch:{ all -> 0x0063 }
                android.os.Handler unused = r1.f14551f = r2     // Catch:{ all -> 0x0063 }
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C6770u.this
                android.os.Handler r0 = r0.f14551f
                com.apm.insight.runtime.u$a r1 = new com.apm.insight.runtime.u$a
                com.apm.insight.runtime.u r2 = com.apm.insight.runtime.C6770u.this
                r1.<init>()
                r0.post(r1)
            L_0x0025:
                android.os.Looper.loop()     // Catch:{ all -> 0x0029 }
                goto L_0x0025
            L_0x0029:
                r0 = move-exception
                android.content.Context r1 = com.apm.insight.C6617h.m16313g()     // Catch:{ all -> 0x0025 }
                com.apm.insight.b.g r1 = com.apm.insight.p166b.C6564g.m16054a(r1)     // Catch:{ all -> 0x0025 }
                com.apm.insight.b.b r1 = r1.mo51997a()     // Catch:{ all -> 0x0025 }
                r1.mo51984c()     // Catch:{ all -> 0x0025 }
                int r1 = r4.f14554a     // Catch:{ all -> 0x0025 }
                r2 = 5
                r3 = 1
                if (r1 >= r2) goto L_0x0049
                com.apm.insight.c r1 = com.apm.insight.C6553b.m16004a()     // Catch:{ all -> 0x0025 }
                java.lang.String r2 = "NPTH_CATCH"
                r1.mo52019a((java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0025 }
                goto L_0x005d
            L_0x0049:
                boolean r0 = r4.f14555b     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x005d
                r4.f14555b = r3     // Catch:{ all -> 0x0025 }
                com.apm.insight.c r0 = com.apm.insight.C6553b.m16004a()     // Catch:{ all -> 0x0025 }
                java.lang.String r1 = "NPTH_ERR_MAX"
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0025 }
                r2.<init>()     // Catch:{ all -> 0x0025 }
                r0.mo52019a((java.lang.String) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0025 }
            L_0x005d:
                int r0 = r4.f14554a     // Catch:{ all -> 0x0025 }
                int r0 = r0 + r3
                r4.f14554a = r0     // Catch:{ all -> 0x0025 }
                goto L_0x0025
            L_0x0063:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.C6770u.C6775c.onLooperPrepared():void");
        }
    }

    /* renamed from: com.apm.insight.runtime.u$d */
    static class C6776d {

        /* renamed from: a */
        Message f14557a;

        /* renamed from: b */
        long f14558b;

        C6776d(Message message, long j) {
            this.f14557a = message;
            this.f14558b = j;
        }
    }

    public C6770u(String str) {
        this.f14548c = new C6775c(str);
    }

    /* renamed from: b */
    private Message m17065b(Runnable runnable) {
        return Message.obtain(this.f14551f, runnable);
    }

    /* renamed from: a */
    public Handler mo52325a() {
        return this.f14551f;
    }

    /* renamed from: a */
    public final boolean mo52326a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return mo52330b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: a */
    public final boolean mo52327a(Runnable runnable) {
        return mo52326a(m17065b(runnable), 0);
    }

    /* renamed from: a */
    public final boolean mo52328a(Runnable runnable, long j) {
        return mo52326a(m17065b(runnable), j);
    }

    /* renamed from: b */
    public void mo52329b() {
        this.f14548c.start();
    }

    /* renamed from: b */
    public final boolean mo52330b(Message message, long j) {
        if (this.f14551f == null) {
            synchronized (this.f14552g) {
                if (this.f14551f == null) {
                    this.f14549d.add(new C6776d(message, j));
                    return true;
                }
            }
        }
        try {
            return this.f14551f.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: c */
    public HandlerThread mo52331c() {
        return this.f14548c;
    }
}
