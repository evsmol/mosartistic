package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C3364q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.u */
public class C3520u implements C3364q.C3366b {

    /* renamed from: a */
    private final List<C1973E1<C3071j0>> f9177a;

    /* renamed from: b */
    private volatile C3071j0 f9178b;

    /* renamed from: c */
    private final C3364q f9179c;

    /* renamed from: d */
    private final ICommonExecutor f9180d;

    /* renamed from: com.yandex.metrica.impl.ob.u$a */
    class C3521a implements C1973E1<C3071j0> {

        /* renamed from: a */
        final /* synthetic */ String f9181a;

        C3521a(C3520u uVar, String str) {
            this.f9181a = str;
        }

        /* renamed from: b */
        public void mo15646b(Object obj) {
            ((C3071j0) obj).mo17721b(this.f9181a);
        }
    }

    public C3520u(ICommonExecutor iCommonExecutor) {
        this(iCommonExecutor, C2410P.m8089g().mo16429b());
    }

    /* renamed from: a */
    public void mo18244a() {
        this.f9179c.mo18056a((C3364q.C3366b) this, C3364q.C3365a.CREATED);
    }

    C3520u(ICommonExecutor iCommonExecutor, C3364q qVar) {
        this.f9177a = new ArrayList();
        this.f9178b = null;
        this.f9180d = iCommonExecutor;
        this.f9179c = qVar;
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
    public void mo18245a(com.yandex.metrica.impl.p082ob.C3071j0 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.f9178b = r3     // Catch:{ all -> 0x002a }
            monitor-enter(r2)     // Catch:{ all -> 0x002a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0027 }
            java.util.List<com.yandex.metrica.impl.ob.E1<com.yandex.metrica.impl.ob.j0>> r1 = r2.f9177a     // Catch:{ all -> 0x0027 }
            r0.<init>(r1)     // Catch:{ all -> 0x0027 }
            java.util.List<com.yandex.metrica.impl.ob.E1<com.yandex.metrica.impl.ob.j0>> r1 = r2.f9177a     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            com.yandex.metrica.impl.ob.E1 r1 = (com.yandex.metrica.impl.p082ob.C1973E1) r1
            r1.mo15646b(r3)
            goto L_0x0016
        L_0x0026:
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002a }
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3520u.mo18245a(com.yandex.metrica.impl.ob.j0):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17137a(android.app.Activity r3, com.yandex.metrica.impl.p082ob.C3364q.C3365a r4) {
        /*
            r2 = this;
            r4 = 0
            if (r3 == 0) goto L_0x0008
            android.content.Intent r3 = r3.getIntent()     // Catch:{ all -> 0x0008 }
            goto L_0x0009
        L_0x0008:
            r3 = r4
        L_0x0009:
            if (r3 != 0) goto L_0x000c
            goto L_0x0010
        L_0x000c:
            java.lang.String r4 = r3.getDataString()
        L_0x0010:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x0035
            com.yandex.metrica.impl.ob.u$a r3 = new com.yandex.metrica.impl.ob.u$a
            r3.<init>(r2, r4)
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.j0 r4 = r2.f9178b     // Catch:{ all -> 0x0032 }
            if (r4 != 0) goto L_0x0026
            java.util.List<com.yandex.metrica.impl.ob.E1<com.yandex.metrica.impl.ob.j0>> r4 = r2.f9177a     // Catch:{ all -> 0x0032 }
            r4.add(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0030
        L_0x0026:
            com.yandex.metrica.core.api.executors.ICommonExecutor r0 = r2.f9180d     // Catch:{ all -> 0x0032 }
            com.yandex.metrica.impl.ob.t r1 = new com.yandex.metrica.impl.ob.t     // Catch:{ all -> 0x0032 }
            r1.<init>(r2, r3, r4)     // Catch:{ all -> 0x0032 }
            r0.execute(r1)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r2)
            goto L_0x0035
        L_0x0032:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3520u.mo17137a(android.app.Activity, com.yandex.metrica.impl.ob.q$a):void");
    }
}
