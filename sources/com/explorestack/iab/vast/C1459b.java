package com.explorestack.iab.vast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: com.explorestack.iab.vast.b */
public class C1459b {

    /* renamed from: a */
    public static boolean f4526a = false;

    /* renamed from: b */
    public static boolean f4527b = false;

    /* renamed from: c */
    public static final WeakHashMap<View, C1461b> f4528c = new WeakHashMap<>();

    /* renamed from: d */
    public static final BroadcastReceiver f4529d = new C1460a();

    /* renamed from: e */
    public static final IntentFilter f4530e;

    /* renamed from: com.explorestack.iab.vast.b$a */
    public class C1460a extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            synchronized (C1459b.class) {
                boolean unused = C1459b.f4527b = "android.intent.action.SCREEN_ON".equals(intent.getAction());
            }
            WeakHashMap<View, C1461b> weakHashMap = C1459b.f4528c;
            synchronized (weakHashMap) {
                for (C1461b a : weakHashMap.values()) {
                    a.mo4377a(C1459b.f4527b);
                }
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.b$b */
    public interface C1461b {
        /* renamed from: a */
        void mo4377a(boolean z);
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        f4530e = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
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
    public static synchronized void m6516a(android.content.Context r3) {
        /*
            java.lang.Class<com.explorestack.iab.vast.b> r0 = com.explorestack.iab.vast.C1459b.class
            monitor-enter(r0)
            boolean r1 = f4526a     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x002d
            monitor-enter(r0)     // Catch:{ all -> 0x002f }
            boolean r1 = f4526a     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = "power"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch:{ all -> 0x002a }
            android.os.PowerManager r1 = (android.os.PowerManager) r1     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isScreenOn()     // Catch:{ all -> 0x002a }
            f4527b = r1     // Catch:{ all -> 0x002a }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x002a }
            android.content.BroadcastReceiver r1 = f4529d     // Catch:{ all -> 0x002a }
            android.content.IntentFilter r2 = f4530e     // Catch:{ all -> 0x002a }
            r3.registerReceiver(r1, r2)     // Catch:{ all -> 0x002a }
            r3 = 1
            f4526a = r3     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            goto L_0x002d
        L_0x002a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)
            return
        L_0x002f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.C1459b.m6516a(android.content.Context):void");
    }

    /* renamed from: a */
    public static void m6517a(View view) {
        if (f4526a) {
            WeakHashMap<View, C1461b> weakHashMap = f4528c;
            synchronized (weakHashMap) {
                weakHashMap.remove(view);
            }
        }
    }

    /* renamed from: a */
    public static void m6518a(View view, C1461b bVar) {
        m6516a(view.getContext());
        WeakHashMap<View, C1461b> weakHashMap = f4528c;
        synchronized (weakHashMap) {
            weakHashMap.put(view, bVar);
        }
    }

    /* renamed from: b */
    public static boolean m6521b(Context context) {
        m6516a(context);
        return f4527b;
    }
}
