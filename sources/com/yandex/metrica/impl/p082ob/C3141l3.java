package com.yandex.metrica.impl.p082ob;

import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.yandex.metrica.impl.ob.l3 */
public class C3141l3 {

    /* renamed from: a */
    private final C2288Lm f8211a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BlockingQueue<C3143b> f8212b = new LinkedBlockingQueue();

    /* renamed from: c */
    private ConcurrentHashMap<Class, CopyOnWriteArrayList<C3336p3<? extends C3246n3>>> f8213c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private WeakHashMap<Object, CopyOnWriteArrayList<C3145d>> f8214d = new WeakHashMap<>();

    /* renamed from: e */
    private ConcurrentHashMap<Class, C3246n3> f8215e = new ConcurrentHashMap<>();

    /* renamed from: com.yandex.metrica.impl.ob.l3$a */
    class C3142a implements Runnable {
        C3142a() {
        }

        public void run() {
            while (true) {
                C3141l3.this.getClass();
                try {
                    ((C3143b) C3141l3.this.f8212b.take()).mo17796a();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.l3$b */
    private static class C3143b {

        /* renamed from: a */
        private final C3246n3 f8217a;

        /* renamed from: b */
        private final C3336p3<? extends C3246n3> f8218b;

        /* synthetic */ C3143b(C3246n3 n3Var, C3336p3 p3Var, C3142a aVar) {
            this(n3Var, p3Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17796a() {
            try {
                if (!this.f8218b.mo17933a(this.f8217a)) {
                    this.f8218b.mo17934b(this.f8217a);
                }
            } catch (Throwable unused) {
            }
        }

        private C3143b(C3246n3 n3Var, C3336p3<? extends C3246n3> p3Var) {
            this.f8217a = n3Var;
            this.f8218b = p3Var;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.l3$c */
    private static final class C3144c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C3141l3 f8219a = new C3141l3();
    }

    /* renamed from: com.yandex.metrica.impl.ob.l3$d */
    private static class C3145d {

        /* renamed from: a */
        final CopyOnWriteArrayList<C3336p3<? extends C3246n3>> f8220a;

        /* renamed from: b */
        final C3336p3<? extends C3246n3> f8221b;

        /* synthetic */ C3145d(CopyOnWriteArrayList copyOnWriteArrayList, C3336p3 p3Var, C3142a aVar) {
            this(copyOnWriteArrayList, p3Var);
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            super.finalize();
            this.f8220a.remove(this.f8221b);
        }

        private C3145d(CopyOnWriteArrayList<C3336p3<? extends C3246n3>> copyOnWriteArrayList, C3336p3<? extends C3246n3> p3Var) {
            this.f8220a = copyOnWriteArrayList;
            this.f8221b = p3Var;
        }
    }

    C3141l3() {
        C2288Lm a = C2322Mm.m7981a("YMM-BD", new C3142a());
        this.f8211a = a;
        a.start();
    }

    /* renamed from: a */
    public static final C3141l3 m9936a() {
        return C3144c.f8219a;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo17792a(com.yandex.metrica.impl.p082ob.C3246n3 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            monitor-enter(r5)     // Catch:{ all -> 0x003b }
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, java.util.concurrent.CopyOnWriteArrayList<com.yandex.metrica.impl.ob.p3<? extends com.yandex.metrica.impl.ob.n3>>> r0 = r5.f8213c     // Catch:{ all -> 0x0038 }
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0038 }
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x002c
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0038 }
        L_0x0014:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0038 }
            com.yandex.metrica.impl.ob.p3 r1 = (com.yandex.metrica.impl.p082ob.C3336p3) r1     // Catch:{ all -> 0x0038 }
            java.util.concurrent.BlockingQueue<com.yandex.metrica.impl.ob.l3$b> r2 = r5.f8212b     // Catch:{ all -> 0x0038 }
            com.yandex.metrica.impl.ob.l3$b r3 = new com.yandex.metrica.impl.ob.l3$b     // Catch:{ all -> 0x0038 }
            r4 = 0
            r3.<init>(r6, r1, r4)     // Catch:{ all -> 0x0038 }
            r2.add(r3)     // Catch:{ all -> 0x0038 }
            goto L_0x0014
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, com.yandex.metrica.impl.ob.n3> r0 = r5.f8215e     // Catch:{ all -> 0x003b }
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x003b }
            r0.put(r1, r6)     // Catch:{ all -> 0x003b }
            monitor-exit(r5)
            return
        L_0x0038:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            throw r6     // Catch:{ all -> 0x003b }
        L_0x003b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3141l3.mo17792a(com.yandex.metrica.impl.ob.n3):void");
    }

    /* renamed from: a */
    public synchronized void mo17794a(Object obj, Class cls, C3336p3<? extends C3246n3> p3Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8213c.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f8213c.put(cls, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(p3Var);
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f8214d.get(obj);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            this.f8214d.put(obj, copyOnWriteArrayList2);
        }
        copyOnWriteArrayList2.add(new C3145d(copyOnWriteArrayList, p3Var, (C3142a) null));
        C3246n3 n3Var = this.f8215e.get(cls);
        if (n3Var != null) {
            this.f8212b.add(new C3143b(n3Var, p3Var, (C3142a) null));
        }
    }

    /* renamed from: a */
    public synchronized void mo17793a(Object obj) {
        List<C3145d> remove = this.f8214d.remove(obj);
        if (remove != null) {
            for (C3145d dVar : remove) {
                dVar.f8220a.remove(dVar.f8221b);
            }
        }
    }
}
