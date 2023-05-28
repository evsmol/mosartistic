package com.yandex.metrica.impl.p082ob;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Al */
class C1871Al implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WeakReference f5053a;

    /* renamed from: b */
    final /* synthetic */ List f5054b;

    /* renamed from: c */
    final /* synthetic */ C2972fl f5055c;

    /* renamed from: d */
    final /* synthetic */ C3634wl f5056d;

    /* renamed from: e */
    final /* synthetic */ C1900Bk f5057e;

    /* renamed from: f */
    final /* synthetic */ boolean f5058f;

    /* renamed from: g */
    final /* synthetic */ C1902Bl f5059g;

    C1871Al(C1902Bl bl, WeakReference weakReference, List list, C2972fl flVar, C3634wl wlVar, C1900Bk bk, boolean z) {
        this.f5059g = bl;
        this.f5053a = weakReference;
        this.f5054b = list;
        this.f5055c = flVar;
        this.f5056d = wlVar;
        this.f5057e = bk;
        this.f5058f = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.f5053a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            com.yandex.metrica.impl.ob.Bl r1 = r11.f5059g
            com.yandex.metrica.impl.ob.Bl$a r1 = r1.f5133f
            java.util.List r2 = r11.f5054b
            com.yandex.metrica.impl.ob.Bl r3 = r11.f5059g
            java.util.List r3 = r3.f5134g
            com.yandex.metrica.impl.ob.fl r4 = r11.f5055c
            r1.getClass()
            java.util.Iterator r1 = r2.iterator()
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r1.next()
            com.yandex.metrica.impl.ob.vl r2 = (com.yandex.metrica.impl.p082ob.C3595vl) r2
            boolean r2 = r2.mo16230a(r4)
            if (r2 == 0) goto L_0x0022
            goto L_0x004b
        L_0x0035:
            java.util.Iterator r1 = r3.iterator()
        L_0x0039:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004d
            java.lang.Object r2 = r1.next()
            com.yandex.metrica.impl.ob.vl r2 = (com.yandex.metrica.impl.p082ob.C3595vl) r2
            boolean r2 = r2.mo16230a(r4)
            if (r2 == 0) goto L_0x0039
        L_0x004b:
            r1 = 1
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r1 == 0) goto L_0x0056
            com.yandex.metrica.impl.ob.Uk r1 = new com.yandex.metrica.impl.ob.Uk
            r1.<init>()
            goto L_0x005b
        L_0x0056:
            com.yandex.metrica.impl.ob.pk r1 = new com.yandex.metrica.impl.ob.pk
            r1.<init>()
        L_0x005b:
            r7 = r1
            com.yandex.metrica.impl.ob.Bl r1 = r11.f5059g
            com.yandex.metrica.impl.ob.lk r1 = r1.f5130c
            long r8 = r1.mo17826a()
            com.yandex.metrica.impl.ob.Bl r1 = r11.f5059g
            com.yandex.metrica.impl.p082ob.C1902Bl.m6941a(r1, r0, r8)
            r10 = 0
            com.yandex.metrica.impl.ob.Bl r1 = r11.f5059g     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.el r1 = r1.f5131d     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.wl r3 = r11.f5056d     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.Bk r2 = r11.f5057e     // Catch:{ all -> 0x0084 }
            com.yandex.metrica.impl.ob.Ak r4 = r2.mo15570c()     // Catch:{ all -> 0x0084 }
            boolean r6 = r11.f5058f     // Catch:{ all -> 0x0084 }
            r2 = r0
            r5 = r7
            com.yandex.metrica.impl.ob.dl r1 = r1.mo17559a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0084 }
            r3 = r1
            goto L_0x008f
        L_0x0084:
            r1 = move-exception
            com.yandex.metrica.impl.ob.Bl r2 = r11.f5059g
            java.util.List r3 = r11.f5054b
            com.yandex.metrica.impl.ob.wl r4 = r11.f5056d
            com.yandex.metrica.impl.p082ob.C1902Bl.m6943a(r2, r3, r1, r4)
            r3 = r10
        L_0x008f:
            if (r3 == 0) goto L_0x00a1
            com.yandex.metrica.impl.ob.Bl r1 = r11.f5059g
            java.util.List r2 = r11.f5054b
            java.util.List r4 = r7.mo15877a()
            com.yandex.metrica.impl.ob.fl r6 = r11.f5055c
            com.yandex.metrica.impl.ob.Bk r7 = r11.f5057e
            r5 = r0
            com.yandex.metrica.impl.p082ob.C1902Bl.m6942a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C1871Al.run():void");
    }
}
