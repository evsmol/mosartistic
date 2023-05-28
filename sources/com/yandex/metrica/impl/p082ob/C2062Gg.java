package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C1959Dg;
import com.yandex.metrica.impl.p082ob.C1992Eg;
import com.yandex.metrica.impl.p082ob.C1992Eg.C1996d;
import com.yandex.metrica.impl.p082ob.C2980g1;

/* renamed from: com.yandex.metrica.impl.ob.Gg */
public abstract class C2062Gg<T extends C1992Eg, IA, A extends C1959Dg<IA, A>, L extends C1992Eg.C1996d<T, C1992Eg.C1995c<A>>> implements C2980g1.C2981a {

    /* renamed from: a */
    private T f5458a;

    /* renamed from: b */
    private L f5459b;

    /* renamed from: c */
    private C1992Eg.C1995c<A> f5460c;

    public C2062Gg(L l, C3356pi piVar, A a) {
        this.f5459b = l;
        C2980g1.m9593a(C2007F0.m7154g().mo15743e()).mo17619a((C2980g1.C2981a) this);
        mo15825a(new C1992Eg.C1995c(piVar, a));
    }

    /* renamed from: a */
    public void mo15824a() {
        synchronized (this) {
            this.f5458a = null;
        }
    }

    /* renamed from: b */
    public synchronized T mo15828b() {
        if (this.f5458a == null) {
            this.f5458a = this.f5459b.mo15618a(this.f5460c);
        }
        return this.f5458a;
    }

    /* renamed from: c */
    public synchronized A mo15829c() {
        return (C1959Dg) this.f5460c.f5342b;
    }

    /* renamed from: d */
    public synchronized C3356pi mo15830d() {
        return this.f5460c.f5341a;
    }

    /* renamed from: e */
    public synchronized void mo15831e() {
        this.f5458a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo15825a(C1992Eg.C1995c<A> cVar) {
        this.f5460c = cVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo15827a(IA r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.yandex.metrica.impl.ob.Eg$c<A> r0 = r3.f5460c     // Catch:{ all -> 0x0035 }
            A r0 = r0.f5342b     // Catch:{ all -> 0x0035 }
            com.yandex.metrica.impl.ob.Dg r0 = (com.yandex.metrica.impl.p082ob.C1959Dg) r0     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.mo15607b(r4)     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0033
            com.yandex.metrica.impl.ob.Eg$c r0 = new com.yandex.metrica.impl.ob.Eg$c     // Catch:{ all -> 0x0035 }
            monitor-enter(r3)     // Catch:{ all -> 0x0035 }
            com.yandex.metrica.impl.ob.Eg$c<A> r1 = r3.f5460c     // Catch:{ all -> 0x0030 }
            com.yandex.metrica.impl.ob.pi r2 = r1.f5341a     // Catch:{ all -> 0x0030 }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            A r1 = r1.f5342b     // Catch:{ all -> 0x0035 }
            com.yandex.metrica.impl.ob.Dg r1 = (com.yandex.metrica.impl.p082ob.C1959Dg) r1     // Catch:{ all -> 0x0035 }
            java.lang.Object r4 = r1.mo15606a(r4)     // Catch:{ all -> 0x0035 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x0035 }
            monitor-enter(r3)     // Catch:{ all -> 0x0035 }
            r3.f5460c = r0     // Catch:{ all -> 0x002d }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            monitor-enter(r3)     // Catch:{ all -> 0x0035 }
            r4 = 0
            r3.f5458a = r4     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x0033
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r3)
            return
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2062Gg.mo15827a(java.lang.Object):void");
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
    public synchronized void mo15826a(com.yandex.metrica.impl.p082ob.C3356pi r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.Eg$c r0 = new com.yandex.metrica.impl.ob.Eg$c     // Catch:{ all -> 0x0022 }
            monitor-enter(r2)     // Catch:{ all -> 0x0022 }
            com.yandex.metrica.impl.ob.Eg$c<A> r1 = r2.f5460c     // Catch:{ all -> 0x001f }
            A r1 = r1.f5342b     // Catch:{ all -> 0x001f }
            com.yandex.metrica.impl.ob.Dg r1 = (com.yandex.metrica.impl.p082ob.C1959Dg) r1     // Catch:{ all -> 0x001f }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0022 }
            monitor-enter(r2)     // Catch:{ all -> 0x0022 }
            r2.f5460c = r0     // Catch:{ all -> 0x001c }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            monitor-enter(r2)     // Catch:{ all -> 0x0022 }
            r3 = 0
            r2.f5458a = r3     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            monitor-exit(r2)
            return
        L_0x0019:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2062Gg.mo15826a(com.yandex.metrica.impl.ob.pi):void");
    }
}
