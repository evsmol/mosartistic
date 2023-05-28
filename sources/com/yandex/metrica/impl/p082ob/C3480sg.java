package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.sg */
public class C3480sg {

    /* renamed from: a */
    private final Set<C3510tg> f9102a;

    /* renamed from: b */
    private C2895dg f9103b;

    /* renamed from: c */
    private boolean f9104c;

    /* renamed from: d */
    private final C2796a8 f9105d;

    /* renamed from: e */
    private final Context f9106e;

    /* renamed from: com.yandex.metrica.impl.ob.sg$a */
    public interface C3481a {
        /* renamed from: a */
        void mo16760a(C2895dg dgVar);
    }

    public C3480sg(Context context) {
        this(context, C2007F0.m7154g().mo15760w().mo17499a());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo18212a(com.yandex.metrica.impl.p082ob.C2895dg r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f9103b = r3     // Catch:{ all -> 0x002f }
            r0 = 1
            r2.f9104c = r0     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.a8 r1 = r2.f9105d     // Catch:{ all -> 0x002f }
            r1.mo17157a((com.yandex.metrica.impl.p082ob.C2895dg) r3)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.a8 r3 = r2.f9105d     // Catch:{ all -> 0x002f }
            r3.mo17160a((boolean) r0)     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.dg r3 = r2.f9103b     // Catch:{ all -> 0x002f }
            monitor-enter(r2)     // Catch:{ all -> 0x002f }
            java.util.Set<com.yandex.metrica.impl.ob.tg> r0 = r2.f9102a     // Catch:{ all -> 0x002c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002c }
        L_0x0019:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002c }
            com.yandex.metrica.impl.ob.tg r1 = (com.yandex.metrica.impl.p082ob.C3510tg) r1     // Catch:{ all -> 0x002c }
            r1.mo18235a(r3)     // Catch:{ all -> 0x002c }
            goto L_0x0019
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r2)
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            throw r3     // Catch:{ all -> 0x002f }
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3480sg.mo18212a(com.yandex.metrica.impl.ob.dg):void");
    }

    /* renamed from: b */
    public void mo18214b() {
        if (!this.f9104c) {
            Context context = this.f9106e;
            C2007F0 g = C2007F0.m7154g();
            Intrinsics.checkNotNullExpressionValue(g, "GlobalServiceLocator.getInstance()");
            C2442Pm q = g.mo15754q();
            Intrinsics.checkNotNullExpressionValue(q, "GlobalServiceLocator.get…).serviceExecutorProvider");
            new C3230mg(this, new C3623wg(context, q.mo16486a()), new C3002gg(context), new C3666xg(context, (C3241mn) null, (C2291M0) null, 6)).mo17862b();
        }
    }

    C3480sg(Context context, C2796a8 a8Var) {
        this.f9102a = new HashSet();
        this.f9106e = context;
        this.f9105d = a8Var;
        this.f9103b = a8Var.mo17169g();
        this.f9104c = a8Var.mo17170h();
    }

    /* renamed from: a */
    public C2895dg mo18211a() {
        return this.f9103b;
    }

    /* renamed from: a */
    public synchronized void mo18213a(C3510tg tgVar) {
        this.f9102a.add(tgVar);
        if (this.f9104c) {
            tgVar.mo18235a(this.f9103b);
        }
    }
}
