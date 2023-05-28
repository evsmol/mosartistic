package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.billing_interface.C1799b;
import com.yandex.metrica.impl.p082ob.C3598w;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.e3 */
public class C2910e3 {

    /* renamed from: a */
    private C3108k f7692a;

    /* renamed from: b */
    private final Context f7693b;

    /* renamed from: c */
    private final Executor f7694c;

    /* renamed from: d */
    private final Executor f7695d;

    /* renamed from: e */
    private final C1799b f7696e;

    /* renamed from: f */
    private final C3242n f7697f;

    /* renamed from: g */
    private final C3170m f7698g;

    /* renamed from: h */
    private final C3598w f7699h;

    /* renamed from: i */
    private final C2882d3 f7700i;

    /* renamed from: com.yandex.metrica.impl.ob.e3$a */
    class C2911a implements C3598w.C3600b {
        C2911a() {
        }

        /* renamed from: a */
        public void mo17481a(C3598w.C3599a aVar) {
            C2910e3.m9396a(C2910e3.this, aVar);
        }
    }

    public C2910e3(Context context, Executor executor, Executor executor2, C1799b bVar, C3242n nVar, C3170m mVar, C3598w wVar, C2882d3 d3Var) {
        this.f7693b = context;
        this.f7694c = executor;
        this.f7695d = executor2;
        this.f7696e = bVar;
        this.f7697f = nVar;
        this.f7698g = mVar;
        this.f7699h = wVar;
        this.f7700i = d3Var;
    }

    /* renamed from: a */
    static void m9396a(C2910e3 e3Var, C3598w.C3599a aVar) {
        e3Var.getClass();
        if (aVar == C3598w.C3599a.VISIBLE) {
            try {
                C3108k kVar = e3Var.f7692a;
                if (kVar != null) {
                    kVar.mo15228b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo17480a(C3356pi piVar, Boolean bool) {
        C3108k a;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            synchronized (this) {
                a = this.f7700i.mo17430a(this.f7693b, this.f7694c, this.f7695d, this.f7696e, this.f7697f, this.f7698g);
                this.f7692a = a;
            }
            a.mo15227a(piVar.mo17971c());
            if (this.f7699h.mo18345a((C3598w.C3600b) new C2911a()) == C3598w.C3599a.VISIBLE) {
                try {
                    C3108k kVar = this.f7692a;
                    if (kVar != null) {
                        kVar.mo15228b();
                    }
                } catch (Throwable unused) {
                }
            }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo17479a(com.yandex.metrica.impl.p082ob.C3356pi r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0013 }
            com.yandex.metrica.impl.ob.k r0 = r1.f7692a     // Catch:{ all -> 0x0010 }
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x000e
            com.yandex.metrica.impl.ob.i r2 = r2.mo17971c()     // Catch:{ all -> 0x0013 }
            r0.mo15227a(r2)     // Catch:{ all -> 0x0013 }
        L_0x000e:
            monitor-exit(r1)
            return
        L_0x0010:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0010 }
            throw r2     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2910e3.mo17479a(com.yandex.metrica.impl.ob.pi):void");
    }
}
