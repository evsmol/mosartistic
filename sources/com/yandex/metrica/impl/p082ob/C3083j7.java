package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.j7 */
public class C3083j7 {

    /* renamed from: a */
    private String f8109a;

    /* renamed from: b */
    private final Context f8110b;

    /* renamed from: c */
    private final List<C3119k7> f8111c;

    /* renamed from: d */
    private final C2826b7 f8112d;

    /* renamed from: e */
    private boolean f8113e;

    /* renamed from: f */
    private boolean f8114f;

    /* renamed from: g */
    private C3119k7 f8115g;

    /* renamed from: h */
    private final C1877B0 f8116h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3083j7(android.content.Context r3, com.yandex.metrica.impl.p082ob.C1850A3 r4) {
        /*
            r2 = this;
            r0 = 21
            boolean r0 = com.yandex.metrica.impl.p082ob.C1848A2.m6808a((int) r0)
            if (r0 == 0) goto L_0x0020
            r0 = 2
            com.yandex.metrica.impl.ob.k7[] r0 = new com.yandex.metrica.impl.p082ob.C3119k7[r0]
            com.yandex.metrica.impl.ob.A7 r1 = new com.yandex.metrica.impl.ob.A7
            r1.<init>(r3, r4)
            r4 = 0
            r0[r4] = r1
            com.yandex.metrica.impl.ob.o7 r4 = new com.yandex.metrica.impl.ob.o7
            r4.<init>()
            r1 = 1
            r0[r1] = r4
            java.util.List r4 = java.util.Arrays.asList(r0)
            goto L_0x0029
        L_0x0020:
            com.yandex.metrica.impl.ob.o7 r4 = new com.yandex.metrica.impl.ob.o7
            r4.<init>()
            java.util.List r4 = java.util.Collections.singletonList(r4)
        L_0x0029:
            com.yandex.metrica.impl.ob.B0 r0 = new com.yandex.metrica.impl.ob.B0
            r0.<init>()
            com.yandex.metrica.impl.ob.b7 r1 = new com.yandex.metrica.impl.ob.b7
            r1.<init>()
            r2.<init>(r3, r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3083j7.<init>(android.content.Context, com.yandex.metrica.impl.ob.A3):void");
    }

    /* renamed from: a */
    private void m9801a() {
        C3119k7 k7Var;
        if (!this.f8114f) {
            Iterator<C3119k7> it = this.f8111c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    k7Var = null;
                    break;
                }
                k7Var = it.next();
                try {
                    C2826b7 b7Var = this.f8112d;
                    String c = k7Var.mo15446c();
                    b7Var.getClass();
                    System.loadLibrary(c);
                    break;
                } catch (Throwable unused) {
                }
            }
            this.f8115g = k7Var;
            if (k7Var != null) {
                try {
                    k7Var.mo15444a(false);
                } catch (Throwable unused2) {
                }
                this.f8109a = this.f8116h.mo15523b(this.f8110b, this.f8115g.mo15441a());
            }
        }
        this.f8114f = true;
    }

    C3083j7(Context context, List<C3119k7> list, C1877B0 b0, C2826b7 b7Var) {
        this.f8110b = context;
        this.f8111c = list;
        this.f8116h = b0;
        this.f8112d = b7Var;
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
    public synchronized void mo17735a(boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0027
            r4.m9801a()     // Catch:{ all -> 0x0024 }
            monitor-enter(r4)     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.k7 r5 = r4.f8115g     // Catch:{ all -> 0x0021 }
            if (r5 == 0) goto L_0x000f
            r2 = 1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0040
            java.lang.String r2 = r4.f8109a     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0040
            boolean r3 = r4.f8113e     // Catch:{ all -> 0x0024 }
            if (r3 != 0) goto L_0x0040
            r5.mo15443a(r6, r2, r7)     // Catch:{ all -> 0x0024 }
            r4.f8113e = r0     // Catch:{ all -> 0x0024 }
            goto L_0x0040
        L_0x0021:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            throw r5     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4.f8113e = r1     // Catch:{ all -> 0x0045 }
            goto L_0x0040
        L_0x0027:
            monitor-enter(r4)     // Catch:{ all -> 0x0045 }
            monitor-enter(r4)     // Catch:{ all -> 0x003d }
            com.yandex.metrica.impl.ob.k7 r5 = r4.f8115g     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003d
            boolean r6 = r4.f8113e     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x003d
            r5.mo15445b()     // Catch:{ all -> 0x003d }
            goto L_0x003d
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            throw r5     // Catch:{ all -> 0x003d }
        L_0x003d:
            r4.f8113e = r1     // Catch:{ all -> 0x0042 }
            monitor-exit(r4)     // Catch:{ all -> 0x0045 }
        L_0x0040:
            monitor-exit(r4)
            return
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0045 }
            throw r5     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3083j7.mo17735a(boolean, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo17734a(String str) {
        C3119k7 k7Var = this.f8115g;
        if (k7Var != null) {
            k7Var.mo15442a(str);
        }
    }
}
