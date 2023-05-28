package com.yandex.metrica.impl.p082ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.coreutils.services.FirstExecutionConditionService;
import com.yandex.metrica.impl.p082ob.C2028Fh;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Jh */
public class C2198Jh implements C2063Gh, Runnable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ServiceConnection f5890a;

    /* renamed from: b */
    private final Handler f5891b;

    /* renamed from: c */
    private final Runnable f5892c;

    /* renamed from: d */
    private final HashMap<String, C1897Bh> f5893d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f5894e;

    /* renamed from: f */
    private volatile boolean f5895f;

    /* renamed from: g */
    private ServerSocket f5896g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2900di f5897h;

    /* renamed from: i */
    private C2288Lm f5898i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C2291M0 f5899j;

    /* renamed from: k */
    private final FirstExecutionConditionService.FirstExecutionHandler f5900k;

    /* renamed from: l */
    private final C3736zh f5901l;

    /* renamed from: m */
    private final C3736zh f5902m;

    /* renamed from: n */
    private final C2028Fh f5903n;

    /* renamed from: o */
    private final C2442Pm f5904o;

    /* renamed from: p */
    private final C3293nm<C2900di, List<Integer>> f5905p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C3706yh f5906q;

    /* renamed from: r */
    private final C2157Ih f5907r;

    /* renamed from: s */
    private final String f5908s;

    /* renamed from: com.yandex.metrica.impl.ob.Jh$a */
    class C2199a implements ServiceConnection {
        C2199a(C2198Jh jh) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Jh$b */
    class C2200b extends Handler {
        C2200b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100) {
                C2198Jh.this.mo16040c();
                try {
                    C2198Jh.this.f5894e.unbindService(C2198Jh.this.f5890a);
                } catch (Throwable unused) {
                    C2198Jh.this.f5899j.reportEvent("socket_unbind_has_thrown_exception");
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Jh$c */
    class C2201c implements Runnable {
        C2201c() {
        }

        public void run() {
            C2198Jh jh = C2198Jh.this;
            C2198Jh.m7560a(jh, jh.f5897h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Jh$d */
    class C2202d extends HashMap<String, C1897Bh> {

        /* renamed from: com.yandex.metrica.impl.ob.Jh$d$a */
        class C2203a implements C1897Bh {
            C2203a() {
            }

            /* renamed from: a */
            public C1867Ah mo15567a(Socket socket, Uri uri, C2097Hh hh) {
                C2198Jh jh = C2198Jh.this;
                return new C3414qh(socket, uri, jh, jh.f5897h, C2198Jh.this.f5906q.mo18431a(), hh);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.Jh$d$b */
        class C2204b implements C1897Bh {
            C2204b() {
            }

            /* renamed from: a */
            public C1867Ah mo15567a(Socket socket, Uri uri, C2097Hh hh) {
                C2198Jh jh = C2198Jh.this;
                return new C1960Dh(socket, uri, jh, jh.f5897h, hh);
            }
        }

        C2202d() {
            put("p", new C2203a());
            put("i", new C2204b());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Jh$e */
    class C2205e implements Runnable {
        C2205e() {
        }

        public void run() {
            C2198Jh.m7568f(C2198Jh.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Jh$f */
    private enum C2206f {
        OK,
        SHOULD_RETRY,
        ORDINARY_FAIL
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2198Jh(android.content.Context r15, com.yandex.metrica.impl.p082ob.C3356pi r16, com.yandex.metrica.impl.p082ob.C2028Fh r17, com.yandex.metrica.impl.p082ob.C3293nm<com.yandex.metrica.impl.p082ob.C2900di, java.util.List<java.lang.Integer>> r18, com.yandex.metrica.impl.p082ob.C3625wh r19, com.yandex.metrica.impl.p082ob.C3625wh r20, java.lang.String r21) {
        /*
            r14 = this;
            com.yandex.metrica.coreutils.services.UtilityServiceLocator r0 = com.yandex.metrica.coreutils.services.UtilityServiceLocator.getInstance()
            com.yandex.metrica.coreutils.services.FirstExecutionConditionService r4 = r0.getFirstExecutionService()
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.Pm r5 = r0.mo15754q()
            com.yandex.metrica.impl.ob.M0 r6 = com.yandex.metrica.impl.p082ob.C3322oh.m10248a()
            com.yandex.metrica.impl.ob.zh r7 = new com.yandex.metrica.impl.ob.zh
            java.lang.String r0 = "open"
            r1 = r19
            r7.<init>(r0, r1)
            com.yandex.metrica.impl.ob.zh r8 = new com.yandex.metrica.impl.ob.zh
            java.lang.String r0 = "port_already_in_use"
            r1 = r20
            r8.<init>(r0, r1)
            com.yandex.metrica.impl.ob.yh r9 = new com.yandex.metrica.impl.ob.yh
            r0 = r15
            r3 = r16
            r9.<init>(r15, r3)
            com.yandex.metrica.impl.ob.Ih r10 = new com.yandex.metrica.impl.ob.Ih
            r10.<init>()
            r1 = r14
            r2 = r15
            r11 = r17
            r12 = r18
            r13 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2198Jh.<init>(android.content.Context, com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.Fh, com.yandex.metrica.impl.ob.nm, com.yandex.metrica.impl.ob.wh, com.yandex.metrica.impl.ob.wh, java.lang.String):void");
    }

    /* renamed from: f */
    static void m7568f(C2198Jh jh) {
        jh.getClass();
        Intent intent = new Intent(jh.f5894e, MetricaService.class);
        intent.setAction("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER");
        try {
            if (!jh.f5894e.bindService(intent, jh.f5890a, 1)) {
                jh.f5899j.reportEvent("socket_bind_has_failed");
            }
        } catch (Throwable unused) {
            jh.f5899j.reportEvent("socket_bind_has_thrown_exception");
        }
        C2288Lm b = jh.f5904o.mo16489b(jh);
        jh.f5898i = b;
        b.start();
        jh.f5907r.mo15937d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (com.yandex.metrica.impl.p082ob.C1848A2.m6808a(26) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        android.net.TrafficStats.setThreadStatsTag(40230);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r5.f5896g == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.metrica.impl.ob.di r0 = r5.f5897h     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0028
            com.yandex.metrica.impl.ob.Jh$f r0 = r5.m7557a((com.yandex.metrica.impl.p082ob.C2900di) r0)     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.Jh$f r1 = com.yandex.metrica.impl.p082ob.C2198Jh.C2206f.SHOULD_RETRY     // Catch:{ all -> 0x0082 }
            if (r0 != r1) goto L_0x0028
            r0 = 0
            r5.f5895f = r0     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.di r0 = r5.f5897h     // Catch:{ all -> 0x0082 }
            long r0 = r0.f7682j     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.impl.ob.Pm r2 = r5.f5904o     // Catch:{ all -> 0x0082 }
            com.yandex.metrica.core.api.executors.ICommonExecutor r2 = r2.mo16486a()     // Catch:{ all -> 0x0082 }
            java.lang.Runnable r3 = r5.f5892c     // Catch:{ all -> 0x0082 }
            r2.remove(r3)     // Catch:{ all -> 0x0082 }
            java.lang.Runnable r3 = r5.f5892c     // Catch:{ all -> 0x0082 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0082 }
            r2.executeDelayed(r3, r0, r4)     // Catch:{ all -> 0x0082 }
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            return
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            r0 = 26
            boolean r1 = com.yandex.metrica.impl.p082ob.C1848A2.m6808a((int) r0)
            if (r1 == 0) goto L_0x0037
            r1 = 40230(0x9d26, float:5.6374E-41)
            android.net.TrafficStats.setThreadStatsTag(r1)
        L_0x0037:
            java.net.ServerSocket r1 = r5.f5896g
            if (r1 == 0) goto L_0x0081
        L_0x003b:
            boolean r1 = r5.f5895f
            if (r1 == 0) goto L_0x0081
            monitor-enter(r5)
            boolean r1 = r5.f5895f     // Catch:{ all -> 0x007e }
            r2 = 0
            if (r1 == 0) goto L_0x0048
            java.net.ServerSocket r1 = r5.f5896g     // Catch:{ all -> 0x007e }
            goto L_0x0049
        L_0x0048:
            r1 = r2
        L_0x0049:
            monitor-exit(r5)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x003b
            java.net.Socket r2 = r1.accept()     // Catch:{ all -> 0x0075 }
            com.yandex.metrica.impl.ob.Hh r1 = new com.yandex.metrica.impl.ob.Hh     // Catch:{ all -> 0x0075 }
            com.yandex.metrica.coreutils.services.SystemTimeProvider r3 = new com.yandex.metrica.coreutils.services.SystemTimeProvider     // Catch:{ all -> 0x0075 }
            r3.<init>()     // Catch:{ all -> 0x0075 }
            com.yandex.metrica.impl.ob.gm r4 = new com.yandex.metrica.impl.ob.gm     // Catch:{ all -> 0x0075 }
            r4.<init>()     // Catch:{ all -> 0x0075 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0075 }
            boolean r3 = com.yandex.metrica.impl.p082ob.C1848A2.m6808a((int) r0)     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x0068
            android.net.TrafficStats.tagSocket(r2)     // Catch:{ all -> 0x0075 }
        L_0x0068:
            com.yandex.metrica.impl.ob.Ch r3 = new com.yandex.metrica.impl.ob.Ch     // Catch:{ all -> 0x0075 }
            java.util.HashMap<java.lang.String, com.yandex.metrica.impl.ob.Bh> r4 = r5.f5893d     // Catch:{ all -> 0x0075 }
            r3.<init>(r2, r5, r4, r1)     // Catch:{ all -> 0x0075 }
            r3.mo15592a()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x003b
            goto L_0x0078
        L_0x0075:
            if (r2 == 0) goto L_0x003b
        L_0x0078:
            r2.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x003b
        L_0x007c:
            goto L_0x003b
        L_0x007e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007e }
            throw r0
        L_0x0081:
            return
        L_0x0082:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2198Jh.run():void");
    }

    /* renamed from: c */
    private synchronized void m7565c(C2900di diVar) {
        if (!this.f5895f && this.f5900k.tryExecute(diVar.f7678f)) {
            this.f5895f = true;
        }
    }

    /* renamed from: a */
    public void mo16030a() {
        this.f5891b.removeMessages(100);
        this.f5907r.mo15938e();
    }

    /* renamed from: b */
    public synchronized void mo16037b() {
        if (this.f5895f) {
            mo16030a();
            Handler handler = this.f5891b;
            handler.sendMessageDelayed(handler.obtainMessage(100), TimeUnit.SECONDS.toMillis(this.f5897h.f7673a));
            this.f5907r.mo15936c();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo16031a(com.yandex.metrica.impl.p082ob.C3356pi r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            com.yandex.metrica.impl.ob.di r1 = r1.mo17959M()     // Catch:{ all -> 0x0012 }
            monitor-enter(r0)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x000f
            r0.m7565c((com.yandex.metrica.impl.p082ob.C2900di) r1)     // Catch:{ all -> 0x000c }
            goto L_0x000f
        L_0x000c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)
            return
        L_0x0012:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2198Jh.mo16031a(com.yandex.metrica.impl.ob.pi):void");
    }

    C2198Jh(Context context, C3356pi piVar, FirstExecutionConditionService firstExecutionConditionService, C2442Pm pm, C2291M0 m0, C3736zh zhVar, C3736zh zhVar2, C3706yh yhVar, C2157Ih ih, C2028Fh fh, C3293nm<C2900di, List<Integer>> nmVar, String str) {
        this.f5890a = new C2199a(this);
        this.f5891b = new C2200b(Looper.getMainLooper());
        this.f5892c = new C2201c();
        this.f5893d = new C2202d();
        this.f5894e = context;
        this.f5899j = m0;
        this.f5901l = zhVar;
        this.f5902m = zhVar2;
        this.f5903n = fh;
        this.f5905p = nmVar;
        this.f5904o = pm;
        this.f5906q = yhVar;
        this.f5907r = ih;
        String format = String.format("[YandexUID%sServer]", new Object[]{str});
        this.f5908s = format;
        this.f5900k = firstExecutionConditionService.createFirstExecutionHandler((Runnable) new C2205e(), pm.mo16486a(), format);
        m7563b(piVar.mo17959M());
        C2900di diVar = this.f5897h;
        if (diVar != null) {
            m7565c(diVar);
        }
    }

    /* renamed from: a */
    static void m7560a(C2198Jh jh, C2900di diVar) {
        synchronized (jh) {
            if (diVar != null) {
                jh.m7565c(diVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo16040c() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.f5895f = r0     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            com.yandex.metrica.impl.ob.Lm r0 = r2.f5898i     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0.stopRunning()     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            r2.f5898i = r1     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
        L_0x000e:
            java.net.ServerSocket r0 = r2.f5896g     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            if (r0 == 0) goto L_0x001b
            r0.close()     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            r2.f5896g = r1     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x001b:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2198Jh.mo16040c():void");
    }

    /* renamed from: a */
    private synchronized C2206f m7557a(C2900di diVar) {
        C2206f fVar;
        Integer num;
        C2028Fh.C2029a e;
        String message;
        Throwable cause;
        Throwable th;
        Iterator it = this.f5905p.mo15448a(diVar).iterator();
        Integer num2 = null;
        fVar = C2206f.ORDINARY_FAIL;
        while (this.f5896g == null && it.hasNext()) {
            try {
                num = (Integer) it.next();
                if (num != null) {
                    try {
                        this.f5896g = this.f5903n.mo15789a(num.intValue());
                        fVar = C2206f.OK;
                        this.f5901l.mo18464a(this, num.intValue(), diVar);
                    } catch (BindException unused) {
                        num2 = num;
                    } catch (C2028Fh.C2029a e2) {
                        e = e2;
                        message = e.getMessage();
                        cause = e.getCause();
                        if (!(cause == null || message == null)) {
                            Map<String, Object> a = m7559a(num);
                            ((HashMap) a).put("exception", Log.getStackTraceString(cause));
                            this.f5899j.reportEvent(m7562b(message), a);
                        }
                        num2 = num;
                    } catch (Throwable th2) {
                        th = th2;
                        Map<String, Object> a2 = m7559a(num);
                        ((HashMap) a2).put("exception", Log.getStackTraceString(th));
                        this.f5899j.reportEvent(m7562b("open_error"), a2);
                        num2 = num;
                    }
                }
            } catch (BindException unused2) {
                fVar = C2206f.SHOULD_RETRY;
                this.f5902m.mo18464a(this, num2.intValue(), diVar);
            } catch (C2028Fh.C2029a e3) {
                C2028Fh.C2029a aVar = e3;
                num = num2;
                e = aVar;
                message = e.getMessage();
                cause = e.getCause();
                Map<String, Object> a3 = m7559a(num);
                ((HashMap) a3).put("exception", Log.getStackTraceString(cause));
                this.f5899j.reportEvent(m7562b(message), a3);
                num2 = num;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                num = num2;
                th = th4;
                Map<String, Object> a22 = m7559a(num);
                ((HashMap) a22).put("exception", Log.getStackTraceString(th));
                this.f5899j.reportEvent(m7562b("open_error"), a22);
                num2 = num;
            }
            num2 = num;
        }
        return fVar;
    }

    /* renamed from: b */
    private void m7563b(C2900di diVar) {
        this.f5897h = diVar;
        if (diVar != null) {
            this.f5900k.setDelaySeconds(diVar.f7677e);
        }
    }

    /* renamed from: b */
    public void mo16038b(int i, C2097Hh hh) {
        this.f5899j.reportEvent(m7562b("sync_succeed"), m7558a(i, hh));
    }

    /* renamed from: b */
    public synchronized void mo16039b(C3356pi piVar) {
        this.f5906q.mo18432a(piVar);
        C2900di M = piVar.mo17959M();
        if (M != null) {
            this.f5897h = M;
            this.f5900k.setDelaySeconds(M.f7677e);
            m7565c(M);
        } else {
            mo16040c();
            m7563b((C2900di) null);
        }
    }

    /* renamed from: b */
    private String m7562b(String str) {
        return "socket_" + str;
    }

    /* renamed from: a */
    private Map<String, Object> m7559a(Integer num) {
        String str;
        HashMap hashMap = new HashMap();
        if (num == null) {
            str = "";
        } else {
            str = String.valueOf(num);
        }
        hashMap.put("port", str);
        return hashMap;
    }

    /* renamed from: a */
    private Map<String, Object> m7558a(int i, C2097Hh hh) {
        Map<String, Object> a = m7559a(Integer.valueOf(i));
        HashMap hashMap = (HashMap) a;
        hashMap.put("idle_interval", Double.valueOf(this.f5907r.mo15935b()));
        hashMap.put("background_interval", Double.valueOf(this.f5907r.mo15934a()));
        hashMap.put("request_read_time", Long.valueOf(hh.mo15873d()));
        hashMap.put("response_form_time", Long.valueOf(hh.mo15874e()));
        hashMap.put("response_send_time", Long.valueOf(hh.mo15875f()));
        return a;
    }

    /* renamed from: a */
    public void mo16034a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str2);
        C2291M0 m0 = this.f5899j;
        m0.reportEvent("socket_" + str, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public void mo16032a(String str) {
        this.f5899j.reportEvent(m7562b(str));
    }

    /* renamed from: a */
    public void mo16035a(String str, Throwable th) {
        this.f5899j.reportError(m7562b(str), th);
    }

    /* renamed from: a */
    public void mo16033a(String str, Integer num) {
        this.f5899j.reportEvent(m7562b(str), m7559a(num));
    }

    /* renamed from: a */
    public void mo16036a(Map<String, Object> map, int i, C2097Hh hh) {
        Map<String, Object> a = m7558a(i, hh);
        ((HashMap) a).put("params", map);
        this.f5899j.reportEvent(m7562b("reversed_sync_succeed"), a);
    }
}
