package com.yandex.metrica;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C2410P;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.a */
public class C10696a {

    /* renamed from: a */
    private final ICommonExecutor f26778a;

    /* renamed from: b */
    private final Set<C10698b> f26779b;

    /* renamed from: c */
    private boolean f26780c;

    /* renamed from: com.yandex.metrica.a$a */
    public interface C10697a {
        /* renamed from: a */
        void mo17724a();

        /* renamed from: b */
        void mo17725b();
    }

    /* renamed from: com.yandex.metrica.a$b */
    private class C10698b {

        /* renamed from: a */
        final ICommonExecutor f26781a;

        /* renamed from: b */
        final C10697a f26782b;

        /* renamed from: c */
        private final long f26783c;

        /* renamed from: d */
        private boolean f26784d = true;

        /* renamed from: e */
        private final Runnable f26785e = new C10699a();

        /* renamed from: com.yandex.metrica.a$b$a */
        class C10699a implements Runnable {
            C10699a() {
            }

            public void run() {
                C10698b.this.f26782b.mo17724a();
            }
        }

        C10698b(C10696a aVar, C10697a aVar2, ICommonExecutor iCommonExecutor, long j) {
            this.f26782b = aVar2;
            this.f26781a = iCommonExecutor;
            this.f26783c = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo64724a() {
            if (!this.f26784d) {
                this.f26784d = true;
                this.f26781a.executeDelayed(this.f26785e, this.f26783c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo64725b() {
            if (this.f26784d) {
                this.f26784d = false;
                this.f26781a.remove(this.f26785e);
                this.f26782b.mo17725b();
            }
        }
    }

    public C10696a(long j) {
        this(j, C2410P.m8089g().mo16431d().mo15961b());
    }

    /* renamed from: a */
    public synchronized void mo64721a() {
        this.f26780c = true;
        for (C10698b a : this.f26779b) {
            a.mo64724a();
        }
    }

    /* renamed from: b */
    public synchronized void mo64723b() {
        this.f26780c = false;
        for (C10698b b : this.f26779b) {
            b.mo64725b();
        }
    }

    C10696a(long j, ICommonExecutor iCommonExecutor) {
        this.f26779b = new HashSet();
        this.f26780c = true;
        this.f26778a = iCommonExecutor;
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
    public synchronized void mo64722a(com.yandex.metrica.C10696a.C10697a r8, long r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            monitor-enter(r7)     // Catch:{ all -> 0x0018 }
            com.yandex.metrica.a$b r6 = new com.yandex.metrica.a$b     // Catch:{ all -> 0x0015 }
            com.yandex.metrica.core.api.executors.ICommonExecutor r3 = r7.f26778a     // Catch:{ all -> 0x0015 }
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)     // Catch:{ all -> 0x0015 }
            java.util.Set<com.yandex.metrica.a$b> r8 = r7.f26779b     // Catch:{ all -> 0x0015 }
            r8.add(r6)     // Catch:{ all -> 0x0015 }
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            monitor-exit(r7)
            return
        L_0x0015:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            throw r8     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.C10696a.mo64722a(com.yandex.metrica.a$a, long):void");
    }
}
