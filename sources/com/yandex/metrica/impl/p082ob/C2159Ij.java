package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C2121If;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.Ij */
class C2159Ij extends C3419qj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TelephonyManager f5778a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public PhoneStateListener f5779b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f5780c;

    /* renamed from: d */
    private C3356pi f5781d;

    /* renamed from: e */
    private C3208mc f5782e;

    /* renamed from: f */
    private final C2036G<C2778Zj> f5783f;

    /* renamed from: g */
    private final C2036G<Collection<C3555uj>> f5784g;

    /* renamed from: h */
    private final ICommonExecutor f5785h;

    /* renamed from: i */
    private final Context f5786i;

    /* renamed from: j */
    private final C3627wj f5787j;

    /* renamed from: k */
    private final C2640Uj f5788k;

    /* renamed from: l */
    private final C3452rj f5789l;

    /* renamed from: m */
    private final C1987Ed f5790m;

    /* renamed from: n */
    private C3697yd f5791n;

    /* renamed from: o */
    private C2284Lj f5792o;

    /* renamed from: p */
    private final C3731zd f5793p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C3141l3 f5794q;

    /* renamed from: com.yandex.metrica.impl.ob.Ij$a */
    class C2160a implements Runnable {
        C2160a() {
        }

        public void run() {
            PhoneStateListener unused = C2159Ij.this.f5779b = new C2163d(C2159Ij.this, (C2160a) null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Ij$b */
    class C2161b implements Runnable {
        C2161b() {
        }

        public void run() {
            if (!C2159Ij.this.f5780c) {
                boolean unused = C2159Ij.this.f5780c = true;
                if (C2159Ij.this.f5779b != null && C2159Ij.this.f5778a != null) {
                    try {
                        C2159Ij.this.f5778a.listen(C2159Ij.this.f5779b, 256);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Ij$c */
    class C2162c implements Runnable {
        C2162c() {
        }

        public void run() {
            if (C2159Ij.this.f5780c) {
                boolean unused = C2159Ij.this.f5780c = false;
                C2159Ij.this.f5794q.mo17793a((Object) C2159Ij.this);
                if (C2159Ij.this.f5779b != null && C2159Ij.this.f5778a != null) {
                    try {
                        C2159Ij.this.f5778a.listen(C2159Ij.this.f5779b, 0);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Ij$d */
    private class C2163d extends PhoneStateListener {
        private C2163d() {
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            C2159Ij.m7428a(C2159Ij.this, signalStrength);
        }

        /* synthetic */ C2163d(C2159Ij ij, C2160a aVar) {
            this();
        }
    }

    protected C2159Ij(Context context, ICommonExecutor iCommonExecutor) {
        this(context, new C1987Ed(), iCommonExecutor);
    }

    /* renamed from: e */
    public Context mo15949e() {
        return this.f5786i;
    }

    /* renamed from: f */
    public TelephonyManager mo15950f() {
        return this.f5778a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized C2778Zj mo15951g() {
        C3555uj b;
        if (this.f5783f.mo15795b() || this.f5783f.mo15797d()) {
            C2778Zj zj = new C2778Zj(this.f5787j, this.f5788k, this.f5789l);
            C3555uj b2 = zj.mo17124b();
            if (b2 != null && b2.mo18290p() == null && !this.f5783f.mo15795b() && (b = this.f5783f.mo15792a().mo17124b()) != null) {
                zj.mo17124b().mo18275a(b.mo18290p());
            }
            this.f5783f.mo15794a(zj);
        }
        return this.f5783f.mo15792a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected C2159Ij(Context context, C1987Ed ed, ICommonExecutor iCommonExecutor) {
        this(context, ed, new C3697yd(ed.mo15683a()), iCommonExecutor, C1848A2.m6808a(17) ? new C3484sj() : new C3513tj(), new C2038G1(), C3141l3.m9936a());
    }

    /* renamed from: b */
    public synchronized void mo15946b() {
        this.f5785h.execute(new C2162c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean mo15947c() {
        C3208mc mcVar;
        mcVar = this.f5782e;
        return mcVar != null && mcVar.f8318l;
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
    /* renamed from: d */
    synchronized boolean mo15948d() {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x001d }
            com.yandex.metrica.impl.ob.pi r0 = r4.f5781d     // Catch:{ all -> 0x001a }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x0017
            com.yandex.metrica.impl.ob.Sh r0 = r0.mo17974f()     // Catch:{ all -> 0x001d }
            boolean r0 = r0.f6680s     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            monitor-exit(r4)
            return r1
        L_0x001a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2159Ij.mo15948d():boolean");
    }

    /* renamed from: a */
    public synchronized void mo15940a() {
        this.f5785h.execute(new C2161b());
    }

    /* renamed from: a */
    public synchronized void mo15941a(C2810ak akVar) {
        if (akVar != null) {
            akVar.mo15406a(mo15951g());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo15944a(com.yandex.metrica.impl.p082ob.C3593vj r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r9 == 0) goto L_0x009d
            monitor-enter(r8)     // Catch:{ all -> 0x009a }
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f5784g     // Catch:{ all -> 0x0097 }
            boolean r0 = r0.mo15795b()     // Catch:{ all -> 0x0097 }
            if (r0 != 0) goto L_0x0014
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f5784g     // Catch:{ all -> 0x0097 }
            boolean r0 = r0.mo15797d()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x008a
        L_0x0014:
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f5784g     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0097 }
            r1.<init>()     // Catch:{ all -> 0x0097 }
            r2 = 17
            boolean r2 = com.yandex.metrica.impl.p082ob.C1848A2.m6808a((int) r2)     // Catch:{ all -> 0x0097 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x006c
            com.yandex.metrica.impl.ob.zd r2 = r8.f5793p     // Catch:{ all -> 0x0097 }
            android.content.Context r5 = r8.f5786i     // Catch:{ all -> 0x0097 }
            boolean r2 = r2.mo15812a(r5)     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x006c
            monitor-enter(r8)     // Catch:{ all -> 0x0097 }
            com.yandex.metrica.impl.ob.mc r2 = r8.f5782e     // Catch:{ all -> 0x0069 }
            r5 = 0
            if (r2 == 0) goto L_0x003b
            boolean r2 = r2.f8317k     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            monitor-exit(r8)     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x006c
            android.telephony.TelephonyManager r2 = r8.f5778a     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x0048
            java.util.List r2 = r2.getAllCellInfo()     // Catch:{ all -> 0x0048 }
            goto L_0x0049
        L_0x0048:
            r2 = r3
        L_0x0049:
            boolean r6 = com.yandex.metrica.impl.p082ob.C1848A2.m6814b((java.util.Collection) r2)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x006c
        L_0x004f:
            int r6 = r2.size()     // Catch:{ all -> 0x0097 }
            if (r5 >= r6) goto L_0x006c
            java.lang.Object r6 = r2.get(r5)     // Catch:{ all -> 0x0097 }
            android.telephony.CellInfo r6 = (android.telephony.CellInfo) r6     // Catch:{ all -> 0x0097 }
            com.yandex.metrica.impl.ob.Lj r7 = r8.f5792o     // Catch:{ all -> 0x0097 }
            com.yandex.metrica.impl.ob.uj r6 = r7.mo16224a(r6)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0066
            r1.add(r6)     // Catch:{ all -> 0x0097 }
        L_0x0066:
            int r5 = r5 + 1
            goto L_0x004f
        L_0x0069:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0097 }
            throw r9     // Catch:{ all -> 0x0097 }
        L_0x006c:
            int r2 = r1.size()     // Catch:{ all -> 0x0097 }
            if (r2 >= r4) goto L_0x0082
            com.yandex.metrica.impl.ob.Zj r1 = r8.mo15951g()     // Catch:{ all -> 0x0097 }
            com.yandex.metrica.impl.ob.uj r1 = r1.mo17124b()     // Catch:{ all -> 0x0097 }
            if (r1 != 0) goto L_0x007d
            goto L_0x0087
        L_0x007d:
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ all -> 0x0097 }
            goto L_0x0086
        L_0x0082:
            java.util.List r1 = com.yandex.metrica.impl.p082ob.C1848A2.m6816c(r1)     // Catch:{ all -> 0x0097 }
        L_0x0086:
            r3 = r1
        L_0x0087:
            r0.mo15794a(r3)     // Catch:{ all -> 0x0097 }
        L_0x008a:
            com.yandex.metrica.impl.ob.G<java.util.Collection<com.yandex.metrica.impl.ob.uj>> r0 = r8.f5784g     // Catch:{ all -> 0x0097 }
            java.lang.Object r0 = r0.mo15792a()     // Catch:{ all -> 0x0097 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0097 }
            monitor-exit(r8)     // Catch:{ all -> 0x009a }
            r9.mo17646a(r0)     // Catch:{ all -> 0x009a }
            goto L_0x009d
        L_0x0097:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x009a }
            throw r9     // Catch:{ all -> 0x009a }
        L_0x009a:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        L_0x009d:
            monitor-exit(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2159Ij.mo15944a(com.yandex.metrica.impl.ob.vj):void");
    }

    protected C2159Ij(Context context, C1987Ed ed, C3697yd ydVar, ICommonExecutor iCommonExecutor, C2284Lj lj, C2038G1 g1, C3141l3 l3Var) {
        TelephonyManager telephonyManager;
        this.f5780c = false;
        C2121If.C2126c cVar = C2036G.f5424e;
        long j = cVar.f5614a;
        this.f5783f = new C2036G<>(j, j * 2);
        long j2 = cVar.f5614a;
        this.f5784g = new C2036G<>(j2, 2 * j2);
        this.f5786i = context;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable unused) {
            telephonyManager = null;
        }
        this.f5778a = telephonyManager;
        this.f5793p = m7427a(ydVar, g1);
        this.f5785h = iCommonExecutor;
        iCommonExecutor.execute(new C2160a());
        this.f5787j = new C3627wj(this, ydVar);
        this.f5788k = new C2640Uj(this, ydVar);
        this.f5789l = new C3452rj(this);
        this.f5790m = ed;
        this.f5791n = ydVar;
        this.f5792o = lj;
        this.f5794q = l3Var;
    }

    /* renamed from: a */
    static void m7428a(C2159Ij ij, SignalStrength signalStrength) {
        C3555uj b;
        int i;
        synchronized (ij) {
            if (!ij.f5783f.mo15795b() && !ij.f5783f.mo15797d() && (b = ij.f5783f.mo15792a().mo17124b()) != null) {
                if (signalStrength.isGsm()) {
                    int gsmSignalStrength = signalStrength.getGsmSignalStrength();
                    i = 99 == gsmSignalStrength ? -1 : (gsmSignalStrength * 2) - 113;
                } else {
                    int cdmaDbm = signalStrength.getCdmaDbm();
                    i = signalStrength.getEvdoDbm();
                    if (-120 == i) {
                        i = cdmaDbm;
                    } else if (-120 != cdmaDbm) {
                        i = Math.min(cdmaDbm, i);
                    }
                }
                b.mo18275a(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: a */
    public void mo15943a(C3356pi piVar) {
        this.f5781d = piVar;
        this.f5790m.mo15684a(piVar);
        this.f5791n.mo18423a(this.f5790m.mo15683a());
        this.f5792o.mo16584a(piVar.mo17974f());
        if (piVar.mo17972d() != null) {
            this.f5783f.mo15793a(piVar.mo17972d().f6483a, piVar.mo17972d().f6483a * 2);
            this.f5784g.mo15793a(piVar.mo17972d().f6483a, piVar.mo17972d().f6483a * 2);
        }
    }

    /* renamed from: a */
    public synchronized void mo15942a(C3208mc mcVar) {
        this.f5782e = mcVar;
    }

    /* renamed from: a */
    public void mo15945a(boolean z) {
        this.f5790m.mo15685a(z);
        this.f5791n.mo18423a(this.f5790m.mo15683a());
    }

    /* renamed from: a */
    private static C3731zd m7427a(C3697yd ydVar, C2038G1 g1) {
        if (C1848A2.m6808a(29)) {
            return g1.mo15809c(ydVar);
        }
        return g1.mo15808b(ydVar);
    }
}
