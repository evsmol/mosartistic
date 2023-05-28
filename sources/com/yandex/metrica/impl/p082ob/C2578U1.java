package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C2168J;
import com.yandex.metrica.impl.p082ob.C3298o1;
import com.yandex.metrica.rtm.wrapper.C3781k;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.U1 */
public class C2578U1 implements C3298o1.C3301c, C3781k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2411P0 f6844a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3298o1 f6845b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f6846c;

    /* renamed from: d */
    private final ICommonExecutor f6847d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3249n6 f6848e;

    /* renamed from: com.yandex.metrica.impl.ob.U1$a */
    class C2579a extends C2585g {

        /* renamed from: b */
        final /* synthetic */ C1850A3 f6849b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2579a(C1850A3 a3) {
            super(C2578U1.this, (C2579a) null);
            this.f6849b = a3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16738a(IMetricaService iMetricaService) throws RemoteException {
            C2411P0 a = C2578U1.this.f6844a;
            C1850A3 a3 = this.f6849b;
            ((C2541T1) a).getClass();
            Bundle bundle = new Bundle();
            synchronized (a3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", a3);
            }
            iMetricaService.mo64646b(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.U1$b */
    class C2580b extends C2585g {

        /* renamed from: b */
        final /* synthetic */ C1850A3 f6851b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2580b(C1850A3 a3) {
            super(C2578U1.this, (C2579a) null);
            this.f6851b = a3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16738a(IMetricaService iMetricaService) throws RemoteException {
            C2411P0 a = C2578U1.this.f6844a;
            C1850A3 a3 = this.f6851b;
            ((C2541T1) a).getClass();
            Bundle bundle = new Bundle();
            synchronized (a3) {
                bundle.putParcelable("PROCESS_CFG_OBJ", a3);
            }
            iMetricaService.mo64645a(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.U1$c */
    class C2581c extends C2582d {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f6853d = false;

        /* renamed from: e */
        private final C2726Xl f6854e;

        C2581c(C2584f fVar, C2726Xl xl) {
            super(fVar);
            this.f6854e = xl;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo16741b() {
            C2584f fVar = this.f6856b;
            if (fVar.mo16748b().f7531h == 0) {
                Context a = ((C2541T1) C2578U1.this.f6844a).mo16663a();
                Intent a2 = C3245n2.m10121a(a);
                fVar.mo16748b().f7528e = C2788a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.mo17139b();
                a2.putExtras(fVar.mo16748b().mo17328b(fVar.mo16744a().mo16502c()));
                try {
                    a.startService(a2);
                    return false;
                } catch (Throwable unused) {
                    C2578U1.this.f6848e.mo17883a(fVar);
                    return false;
                }
            } else {
                C2578U1.this.f6848e.mo17883a(fVar);
                return false;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
            if (r2.endsWith(":" + "Metrica") != false) goto L_0x0039;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized java.lang.Void mo16739a() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.f6853d     // Catch:{ all -> 0x0051 }
                r1 = 0
                if (r0 == 0) goto L_0x0008
                monitor-exit(r6)
                return r1
            L_0x0008:
                r0 = 1
                r6.f6853d = r0     // Catch:{ all -> 0x0051 }
                com.yandex.metrica.impl.ob.Xl r2 = r6.f6854e     // Catch:{ all -> 0x0051 }
                java.lang.String r3 = "Metrica"
                r2.getClass()     // Catch:{ all -> 0x0051 }
                java.lang.String r4 = r2.mo17070b()     // Catch:{ all -> 0x0038 }
                boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0038 }
                if (r4 != 0) goto L_0x0038
                java.lang.String r2 = r2.mo17070b()     // Catch:{ all -> 0x0038 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0038 }
                r4.<init>()     // Catch:{ all -> 0x0038 }
                java.lang.String r5 = ":"
                r4.append(r5)     // Catch:{ all -> 0x0038 }
                r4.append(r3)     // Catch:{ all -> 0x0038 }
                java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0038 }
                boolean r2 = r2.endsWith(r3)     // Catch:{ all -> 0x0038 }
                if (r2 == 0) goto L_0x0038
                goto L_0x0039
            L_0x0038:
                r0 = 0
            L_0x0039:
                if (r0 == 0) goto L_0x0042
                com.yandex.metrica.impl.ob.U1$f r0 = r6.f6856b     // Catch:{ all -> 0x0051 }
                r6.mo16740a((com.yandex.metrica.impl.p082ob.C2578U1.C2584f) r0)     // Catch:{ all -> 0x0051 }
                monitor-exit(r6)
                return r1
            L_0x0042:
                com.yandex.metrica.impl.ob.U1 r0 = com.yandex.metrica.impl.p082ob.C2578U1.this     // Catch:{ all -> 0x0051 }
                com.yandex.metrica.impl.ob.o1 r0 = r0.f6845b     // Catch:{ all -> 0x0051 }
                r0.mo17900g()     // Catch:{ all -> 0x0051 }
                java.lang.Void r0 = super.call()     // Catch:{ all -> 0x0051 }
                monitor-exit(r6)
                return r0
            L_0x0051:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2578U1.C2581c.mo16739a():java.lang.Void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16740a(C2584f fVar) {
            C2578U1.this.f6848e.mo17883a(fVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.U1$d */
    class C2582d extends C2585g {

        /* renamed from: b */
        final C2584f f6856b;

        C2582d(C2584f fVar) {
            super(C2578U1.this, (C2579a) null);
            this.f6856b = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16738a(IMetricaService iMetricaService) throws RemoteException {
            C2584f fVar = this.f6856b;
            ((C2541T1) C2578U1.this.f6844a).mo16666a(iMetricaService, fVar.mo16751e(), fVar.f6859b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16742a(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object call() throws Exception {
            return call();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.U1$e */
    public interface C2583e {
        /* renamed from: a */
        C2851c0 mo16695a(C2851c0 c0Var);
    }

    /* renamed from: com.yandex.metrica.impl.ob.U1$f */
    public static class C2584f {

        /* renamed from: a */
        private C2851c0 f6858a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C2445Q1 f6859b;

        /* renamed from: c */
        private boolean f6860c = false;

        /* renamed from: d */
        private C2583e f6861d;

        /* renamed from: e */
        private HashMap<C2168J.C2169a, Integer> f6862e;

        public C2584f(C2851c0 c0Var, C2445Q1 q1) {
            this.f6858a = c0Var;
            this.f6859b = new C2445Q1(new C1850A3(q1.mo18443a()), new CounterConfiguration(q1.mo18444b()), q1.mo16504e());
        }

        /* renamed from: b */
        public C2851c0 mo16748b() {
            return this.f6858a;
        }

        /* renamed from: c */
        public HashMap<C2168J.C2169a, Integer> mo16749c() {
            return this.f6862e;
        }

        /* renamed from: d */
        public boolean mo16750d() {
            return this.f6860c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C2851c0 mo16751e() {
            C2583e eVar = this.f6861d;
            return eVar != null ? eVar.mo16695a(this.f6858a) : this.f6858a;
        }

        public String toString() {
            return "ReportToSend{mReport=" + this.f6858a + ", mEnvironment=" + this.f6859b + ", mCrash=" + this.f6860c + ", mAction=" + this.f6861d + ", mTrimmedFields=" + this.f6862e + '}';
        }

        /* renamed from: a */
        public C2584f mo16745a(C2583e eVar) {
            this.f6861d = eVar;
            return this;
        }

        /* renamed from: a */
        public C2584f mo16746a(HashMap<C2168J.C2169a, Integer> hashMap) {
            this.f6862e = hashMap;
            return this;
        }

        /* renamed from: a */
        public C2584f mo16747a(boolean z) {
            this.f6860c = z;
            return this;
        }

        /* renamed from: a */
        public C2445Q1 mo16744a() {
            return this.f6859b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.U1$g */
    private abstract class C2585g implements Callable<Void> {
        private C2585g() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(14:1|2|3|(2:5|6)|8|9|(1:15)|1|2|3|(0)|8|9|21) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            return null;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x000e A[SYNTHETIC, Splitter:B:5:0x000e] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r3 = this;
                r0 = 0
            L_0x0001:
                r1 = 0
                com.yandex.metrica.impl.ob.U1 r2 = com.yandex.metrica.impl.p082ob.C2578U1.this     // Catch:{ all -> 0x0024 }
                com.yandex.metrica.impl.ob.o1 r2 = r2.f6845b     // Catch:{ all -> 0x0024 }
                com.yandex.metrica.IMetricaService r2 = r2.mo17897d()     // Catch:{ all -> 0x0024 }
                if (r2 == 0) goto L_0x0012
                r3.mo16738a((com.yandex.metrica.IMetricaService) r2)     // Catch:{ RemoteException -> 0x0012 }
                return r1
            L_0x0012:
                boolean r2 = r3.mo16741b()     // Catch:{ all -> 0x0024 }
                int r0 = r0 + 1
                if (r2 == 0) goto L_0x0023
                boolean r2 = com.yandex.metrica.impl.p082ob.C1909C1.m6957a()     // Catch:{ all -> 0x0024 }
                if (r2 != 0) goto L_0x0023
                r2 = 2
                if (r0 < r2) goto L_0x0001
            L_0x0023:
                return r1
            L_0x0024:
                r0 = move-exception
                r3.mo16742a((java.lang.Throwable) r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2578U1.C2585g.call():java.lang.Void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo16738a(IMetricaService iMetricaService) throws RemoteException;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16742a(Throwable th) {
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0029 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo16741b() {
            /*
                r5 = this;
                com.yandex.metrica.impl.ob.U1 r0 = com.yandex.metrica.impl.p082ob.C2578U1.this
                com.yandex.metrica.impl.ob.o1 r0 = r0.f6845b
                r0.mo17895b()
                com.yandex.metrica.impl.ob.U1 r0 = com.yandex.metrica.impl.p082ob.C2578U1.this
                java.lang.Object r0 = r0.f6846c
                monitor-enter(r0)
                com.yandex.metrica.impl.ob.U1 r1 = com.yandex.metrica.impl.p082ob.C2578U1.this     // Catch:{ all -> 0x0035 }
                com.yandex.metrica.impl.ob.o1 r1 = r1.f6845b     // Catch:{ all -> 0x0035 }
                boolean r1 = r1.mo17898e()     // Catch:{ all -> 0x0035 }
                if (r1 != 0) goto L_0x0032
                com.yandex.metrica.impl.ob.U1 r1 = com.yandex.metrica.impl.p082ob.C2578U1.this     // Catch:{ InterruptedException -> 0x0029 }
                java.lang.Object r1 = r1.f6846c     // Catch:{ InterruptedException -> 0x0029 }
                r2 = 5000(0x1388, double:2.4703E-320)
                r4 = 0
                r1.wait(r2, r4)     // Catch:{ InterruptedException -> 0x0029 }
                goto L_0x0032
            L_0x0029:
                com.yandex.metrica.impl.ob.U1 r1 = com.yandex.metrica.impl.p082ob.C2578U1.this     // Catch:{ all -> 0x0035 }
                java.lang.Object r1 = r1.f6846c     // Catch:{ all -> 0x0035 }
                r1.notifyAll()     // Catch:{ all -> 0x0035 }
            L_0x0032:
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                r0 = 1
                return r0
            L_0x0035:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2578U1.C2585g.mo16741b():boolean");
        }

        /* synthetic */ C2585g(C2578U1 u1, C2579a aVar) {
            this();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.U1$h */
    class C2586h extends C2585g {

        /* renamed from: b */
        private final int f6864b;

        /* renamed from: c */
        private final Bundle f6865c;

        C2586h(C2578U1 u1, int i, Bundle bundle) {
            super(u1, (C2579a) null);
            this.f6864b = i;
            this.f6865c = bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16738a(IMetricaService iMetricaService) throws RemoteException {
            iMetricaService.mo64644a(this.f6864b, this.f6865c);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2578U1(com.yandex.metrica.impl.p082ob.C2411P0 r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.P r0 = com.yandex.metrica.impl.p082ob.C2410P.m8089g()
            com.yandex.metrica.impl.ob.Im r0 = r0.mo16431d()
            com.yandex.metrica.core.api.executors.ICommonExecutor r0 = r0.mo15963d()
            com.yandex.metrica.impl.ob.n6 r1 = new com.yandex.metrica.impl.ob.n6
            com.yandex.metrica.impl.ob.T1 r4 = (com.yandex.metrica.impl.p082ob.C2541T1) r4
            android.content.Context r2 = r4.mo16663a()
            r1.<init>(r2)
            r3.<init>(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2578U1.<init>(com.yandex.metrica.impl.ob.P0):void");
    }

    public void onServiceConnected() {
        synchronized (this.f6846c) {
            this.f6846c.notifyAll();
        }
    }

    public void onServiceDisconnected() {
    }

    public Future<Void> queuePauseUserSession(C1850A3 a3) {
        return this.f6847d.submit(new C2580b(a3));
    }

    public Future<Void> queueReport(C2584f fVar) {
        Callable callable;
        ICommonExecutor iCommonExecutor = this.f6847d;
        if (fVar.mo16750d()) {
            callable = new C2581c(fVar, C2410P.m8089g().mo16434h());
        } else {
            callable = new C2582d(fVar);
        }
        return iCommonExecutor.submit(callable);
    }

    public Future<Void> queueResumeUserSession(C1850A3 a3) {
        return this.f6847d.submit(new C2579a(a3));
    }

    public void reportData(int i, Bundle bundle) {
        this.f6847d.submit(new C2586h(this, i, bundle));
    }

    public void sendCrash(C2584f fVar) {
        C2581c cVar = new C2581c(fVar, C2410P.m8089g().mo16434h());
        if (this.f6845b.mo17898e()) {
            try {
                this.f6847d.submit(cVar).get(4, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (!cVar.f6853d) {
            try {
                cVar.mo16739a();
            } catch (Throwable unused2) {
            }
        }
    }

    public C2578U1(C2411P0 p0, ICommonExecutor iCommonExecutor, C3249n6 n6Var) {
        this.f6846c = new Object();
        this.f6844a = p0;
        this.f6847d = iCommonExecutor;
        this.f6848e = n6Var;
        C3298o1 c = ((C2541T1) p0).mo16689c();
        this.f6845b = c;
        c.mo17894a((C3298o1.C3301c) this);
    }
}
