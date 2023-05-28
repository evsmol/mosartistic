package com.yandex.metrica.impl.p082ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.o1 */
public class C3298o1 {

    /* renamed from: j */
    public static final long f8480j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a */
    private final Context f8481a;

    /* renamed from: b */
    private final ICommonExecutor f8482b;

    /* renamed from: c */
    private boolean f8483c;

    /* renamed from: d */
    private final List<C3301c> f8484d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public IMetricaService f8485e;

    /* renamed from: f */
    private final Object f8486f;

    /* renamed from: g */
    private final C3717z1 f8487g;

    /* renamed from: h */
    private final Runnable f8488h;

    /* renamed from: i */
    private final ServiceConnection f8489i;

    /* renamed from: com.yandex.metrica.impl.ob.o1$a */
    class C3299a implements Runnable {
        C3299a() {
        }

        public void run() {
            C3298o1.m10201a(C3298o1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o1$b */
    class C3300b implements ServiceConnection {
        C3300b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (C3298o1.this) {
                IMetricaService unused = C3298o1.this.f8485e = IMetricaService.C10686a.m31475a(iBinder);
            }
            C3298o1.m10202b(C3298o1.this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (C3298o1.this) {
                IMetricaService unused = C3298o1.this.f8485e = null;
            }
            C3298o1.m10203c(C3298o1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o1$c */
    interface C3301c {
        void onServiceConnected();

        void onServiceDisconnected();
    }

    public C3298o1(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, C2410P.m8089g().mo16435i());
    }

    /* renamed from: c */
    static void m10203c(C3298o1 o1Var) {
        for (C3301c onServiceDisconnected : o1Var.f8484d) {
            onServiceDisconnected.onServiceDisconnected();
        }
    }

    /* renamed from: b */
    public void mo17895b() {
        synchronized (this) {
            if (this.f8485e == null) {
                Intent a = C3245n2.m10121a(this.f8481a);
                try {
                    this.f8487g.mo18442a(this.f8481a);
                    this.f8481a.bindService(a, this.f8489i, 1);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: d */
    public synchronized IMetricaService mo17897d() {
        return this.f8485e;
    }

    /* renamed from: e */
    public synchronized boolean mo17898e() {
        return this.f8485e != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo17899f() {
        synchronized (this.f8486f) {
            this.f8482b.remove(this.f8488h);
        }
    }

    /* renamed from: g */
    public void mo17900g() {
        ICommonExecutor iCommonExecutor = this.f8482b;
        synchronized (this.f8486f) {
            iCommonExecutor.remove(this.f8488h);
            if (!this.f8483c) {
                iCommonExecutor.executeDelayed(this.f8488h, f8480j);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|(2:6|7)|8|9|(2:12|10)|18|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[LOOP:0: B:10:0x001d->B:12:0x0023, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m10201a(com.yandex.metrica.impl.p082ob.C3298o1 r3) {
        /*
            monitor-enter(r3)
            android.content.Context r0 = r3.f8481a     // Catch:{ all -> 0x002f }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            boolean r0 = r3.mo17898e()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0015
            r3.f8485e = r1     // Catch:{ all -> 0x0015 }
            android.content.Context r0 = r3.f8481a     // Catch:{ all -> 0x0015 }
            android.content.ServiceConnection r2 = r3.f8489i     // Catch:{ all -> 0x0015 }
            r0.unbindService(r2)     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r3.f8485e = r1     // Catch:{ all -> 0x002f }
            java.util.List<com.yandex.metrica.impl.ob.o1$c> r0 = r3.f8484d     // Catch:{ all -> 0x002f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002f }
        L_0x001d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.o1$c r1 = (com.yandex.metrica.impl.p082ob.C3298o1.C3301c) r1     // Catch:{ all -> 0x002f }
            r1.onServiceDisconnected()     // Catch:{ all -> 0x002f }
            goto L_0x001d
        L_0x002d:
            monitor-exit(r3)
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3298o1.m10201a(com.yandex.metrica.impl.ob.o1):void");
    }

    C3298o1(Context context, ICommonExecutor iCommonExecutor, C3717z1 z1Var) {
        this.f8484d = new CopyOnWriteArrayList();
        this.f8485e = null;
        this.f8486f = new Object();
        this.f8488h = new C3299a();
        this.f8489i = new C3300b();
        this.f8481a = context.getApplicationContext();
        this.f8482b = iCommonExecutor;
        this.f8483c = false;
        this.f8487g = z1Var;
    }

    /* renamed from: c */
    public void mo17896c() {
        synchronized (this.f8486f) {
            this.f8483c = true;
            mo17899f();
        }
    }

    /* renamed from: b */
    static void m10202b(C3298o1 o1Var) {
        for (C3301c onServiceConnected : o1Var.f8484d) {
            onServiceConnected.onServiceConnected();
        }
    }

    /* renamed from: a */
    public void mo17894a(C3301c cVar) {
        this.f8484d.add(cVar);
    }

    /* renamed from: a */
    public void mo17893a() {
        synchronized (this.f8486f) {
            this.f8483c = false;
            mo17900g();
        }
    }
}
