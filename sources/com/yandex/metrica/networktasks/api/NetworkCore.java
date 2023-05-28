package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.impl.C3762c;
import com.yandex.metrica.networktasks.impl.C3764e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class NetworkCore extends C3762c {

    /* renamed from: b */
    private final BlockingQueue f9664b;

    /* renamed from: c */
    private final Object f9665c;

    /* renamed from: d */
    private final Object f9666d;

    /* renamed from: e */
    private volatile C3758c f9667e;

    /* renamed from: f */
    private final C3764e f9668f;

    public NetworkCore() {
        this(new C3764e());
    }

    NetworkCore(C3764e eVar) {
        this.f9664b = new LinkedBlockingQueue();
        this.f9665c = new Object();
        this.f9666d = new Object();
        this.f9668f = eVar;
    }

    public void onDestroy() {
        synchronized (this.f9666d) {
            C3758c cVar = this.f9667e;
            if (cVar != null) {
                cVar.f9696a.onTaskRemoved();
            }
            ArrayList arrayList = new ArrayList(this.f9664b.size());
            this.f9664b.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C3758c) it.next()).f9696a.onTaskRemoved();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void run() {
        /*
            r4 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            boolean r2 = r4.isRunning()
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r4.f9666d     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            java.util.concurrent.BlockingQueue r2 = r4.f9664b     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            java.lang.Object r2 = r2.take()     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            com.yandex.metrica.networktasks.api.c r2 = (com.yandex.metrica.networktasks.api.C3758c) r2     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            r4.f9667e = r2     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            com.yandex.metrica.networktasks.api.c r2 = r4.f9667e     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            com.yandex.metrica.networktasks.api.NetworkTask r1 = r2.f9696a     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            java.util.concurrent.Executor r2 = r1.getExecutor()     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            com.yandex.metrica.networktasks.impl.e r3 = r4.f9668f     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            com.yandex.metrica.networktasks.impl.f r3 = r3.mo18597a(r1, r4)     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            r2.execute(r3)     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
            java.lang.Object r2 = r4.f9666d
            monitor-enter(r2)
            r4.f9667e = r0     // Catch:{ all -> 0x0034 }
            r1.onTaskFinished()     // Catch:{ all -> 0x0034 }
            r1.onTaskRemoved()     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0002
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r0
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r3     // Catch:{ InterruptedException -> 0x004d, all -> 0x003a }
        L_0x003a:
            r2 = move-exception
            java.lang.Object r3 = r4.f9666d
            monitor-enter(r3)
            r4.f9667e = r0     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0048
            r1.onTaskFinished()     // Catch:{ all -> 0x004a }
            r1.onTaskRemoved()     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r2
        L_0x004a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r0
        L_0x004d:
            java.lang.Object r2 = r4.f9666d
            monitor-enter(r2)
            r4.f9667e = r0     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x005a
            r1.onTaskFinished()     // Catch:{ all -> 0x005c }
            r1.onTaskRemoved()     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r2)     // Catch:{ all -> 0x005c }
            goto L_0x0002
        L_0x005c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.networktasks.api.NetworkCore.run():void");
    }

    public void startTask(NetworkTask networkTask) {
        boolean z;
        synchronized (this.f9665c) {
            C3758c cVar = new C3758c(networkTask);
            if (isRunning()) {
                if (!this.f9664b.contains(cVar)) {
                    if (!cVar.equals(this.f9667e)) {
                        z = false;
                        if (!z && cVar.f9696a.onTaskAdded()) {
                            this.f9664b.offer(cVar);
                        }
                    }
                }
                z = true;
                this.f9664b.offer(cVar);
            }
        }
    }
}
