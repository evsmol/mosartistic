package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.p082ob.C2312Mg;
import com.yandex.metrica.impl.p082ob.C2927ei;
import com.yandex.metrica.impl.p082ob.C3356pi;
import com.yandex.metrica.impl.p082ob.C3416qi;
import com.yandex.metrica.networktasks.api.NetworkTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: com.yandex.metrica.impl.ob.ri */
public class C3450ri {

    /* renamed from: a */
    private final Context f9034a;

    /* renamed from: b */
    private final C2108I3 f9035b;

    /* renamed from: c */
    private final C3323oi f9036c;

    /* renamed from: d */
    private final C3356pi.C3358b f9037d;

    /* renamed from: e */
    private volatile NetworkTask f9038e;

    /* renamed from: f */
    private C2969fi f9039f;

    /* renamed from: g */
    private final TimeProvider f9040g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2104I f9041h;

    /* renamed from: i */
    private final C2495Rh f9042i;

    /* renamed from: j */
    private final C3141l3 f9043j;

    /* renamed from: com.yandex.metrica.impl.ob.ri$a */
    class C3451a implements Function0<C2104I> {
        C3451a() {
        }

        public Object invoke() {
            return C3450ri.this.f9041h;
        }
    }

    public C3450ri(Context context, String str, C2312Mg.C2314b bVar, C3323oi oiVar) {
        this(context, new C1975E3(str), bVar, oiVar, new C3356pi.C3358b(context), new C2441Pl(context), new SystemTimeProvider(), C2007F0.m7154g().mo15742d(), new C2495Rh(), C3141l3.m9936a());
    }

    /* renamed from: b */
    public Context mo18173b() {
        return this.f9034a;
    }

    /* renamed from: c */
    public synchronized NetworkTask mo18174c() {
        if (!mo18176e()) {
            return null;
        }
        if (this.f9038e == null) {
            this.f9038e = C3443rd.m10618a(this, (C2312Mg) this.f9039f.mo15828b());
        }
        return this.f9038e;
    }

    /* renamed from: d */
    public C3356pi mo18175d() {
        return this.f9039f.mo15830d();
    }

    /* renamed from: e */
    public synchronized boolean mo18176e() {
        boolean b;
        C3356pi d = this.f9039f.mo15830d();
        b = C3289ni.m10182b(d);
        if (!b && !(!C3289ni.m10179a(d)) && !this.f9042i.mo16574a(((C2312Mg) this.f9039f.mo15828b()).mo16301C(), d, this.f9041h)) {
            b = true;
        }
        return b;
    }

    /* renamed from: a */
    private void m10647a(C2441Pl pl, C2901dj djVar, C3356pi piVar) {
        C3356pi.C3357a a = piVar.mo17969a();
        if (!C3289ni.m10181a(piVar.mo17968V())) {
            a = a.mo18043k(djVar.mo17469a().f7065a);
        }
        String a2 = pl.mo16485a();
        if (!C3289ni.m10181a(piVar.mo17977i())) {
            a = a.mo18026c(a2).mo18029d("");
        }
        C3356pi a3 = a.mo18017a();
        m10649b(a3);
        m10648a(a3);
    }

    /* renamed from: b */
    private synchronized void m10649b(C3356pi piVar) {
        this.f9039f.mo15826a(piVar);
        this.f9037d.mo18045a(piVar);
        C2007F0.m7154g().mo15739a(piVar);
        this.f9043j.mo17792a((C3246n3) new C3385q3(this.f9035b.mo15879b(), piVar));
    }

    private C3450ri(Context context, C2108I3 i3, C2312Mg.C2314b bVar, C3323oi oiVar, C3356pi.C3358b bVar2, C2441Pl pl, TimeProvider timeProvider, C2104I i, C2495Rh rh, C3141l3 l3Var) {
        this(context, i3, bVar, oiVar, bVar2, bVar2.mo18044a(), pl, timeProvider, i, rh, l3Var);
    }

    /* renamed from: a */
    public C2108I3 mo18167a() {
        return this.f9035b;
    }

    /* renamed from: a */
    public void mo18171a(C3004gi giVar) {
        ArrayList<C3131ki> arrayList;
        synchronized (this) {
            this.f9038e = null;
        }
        C3323oi oiVar = this.f9036c;
        String b = this.f9035b.mo15879b();
        C3356pi d = this.f9039f.mo15830d();
        C2927ei.C2928a aVar = (C2927ei.C2928a) oiVar;
        synchronized (C2927ei.this.f7767b) {
            Collection a = C2927ei.this.f7766a.mo18180a(b);
            if (a == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = new ArrayList<>(a);
            }
        }
        for (C3131ki a2 : arrayList) {
            a2.mo15770a(giVar, d);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C3450ri(android.content.Context r14, com.yandex.metrica.impl.p082ob.C2108I3 r15, com.yandex.metrica.impl.p082ob.C2312Mg.C2314b r16, com.yandex.metrica.impl.p082ob.C3323oi r17, com.yandex.metrica.impl.p082ob.C3356pi.C3358b r18, com.yandex.metrica.impl.p082ob.C3356pi r19, com.yandex.metrica.impl.p082ob.C2441Pl r20, com.yandex.metrica.coreutils.services.TimeProvider r21, com.yandex.metrica.impl.p082ob.C2104I r22, com.yandex.metrica.impl.p082ob.C2495Rh r23, com.yandex.metrica.impl.p082ob.C3141l3 r24) {
        /*
            r13 = this;
            r1 = r14
            com.yandex.metrica.impl.ob.fi r7 = new com.yandex.metrica.impl.ob.fi
            com.yandex.metrica.impl.ob.Mg$c r0 = new com.yandex.metrica.impl.ob.Mg$c
            java.lang.String r2 = r15.mo15879b()
            r0.<init>(r14, r2)
            r2 = r16
            r5 = r19
            r7.<init>(r0, r5, r2)
            com.yandex.metrica.impl.ob.ej r0 = com.yandex.metrica.impl.p082ob.C2930ej.m9486a(r14)
            com.yandex.metrica.impl.ob.ij r2 = new com.yandex.metrica.impl.ob.ij
            r4 = r18
            r2.<init>(r4)
            com.yandex.metrica.impl.ob.dj r11 = r0.mo17557a(r14, r2)
            r0 = r13
            r2 = r15
            r3 = r17
            r6 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r12 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3450ri.<init>(android.content.Context, com.yandex.metrica.impl.ob.I3, com.yandex.metrica.impl.ob.Mg$b, com.yandex.metrica.impl.ob.oi, com.yandex.metrica.impl.ob.pi$b, com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.Pl, com.yandex.metrica.coreutils.services.TimeProvider, com.yandex.metrica.impl.ob.I, com.yandex.metrica.impl.ob.Rh, com.yandex.metrica.impl.ob.l3):void");
    }

    C3450ri(Context context, C2108I3 i3, C3323oi oiVar, C3356pi.C3358b bVar, C3356pi piVar, C2441Pl pl, C2969fi fiVar, TimeProvider timeProvider, C2104I i, C2495Rh rh, C2901dj djVar, C3141l3 l3Var) {
        this.f9034a = context;
        this.f9035b = i3;
        this.f9036c = oiVar;
        this.f9037d = bVar;
        this.f9039f = fiVar;
        this.f9040g = timeProvider;
        this.f9041h = i;
        this.f9042i = rh;
        this.f9043j = l3Var;
        m10647a(pl, djVar, piVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public void mo18170a(com.yandex.metrica.impl.p082ob.C2638Ui r6, com.yandex.metrica.impl.p082ob.C2312Mg r7, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.yandex.metrica.impl.p082ob.C1848A2.m6815b((java.util.Map) r8)     // Catch:{ all -> 0x005f }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "Date"
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x005f }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x005f }
            boolean r0 = com.yandex.metrica.impl.p082ob.C1848A2.m6814b((java.util.Collection) r8)     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0033
            r0 = 0
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0033 }
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x0033 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0033 }
            java.util.Date r8 = r0.parse(r8)     // Catch:{ all -> 0x0033 }
            long r2 = r8.getTime()     // Catch:{ all -> 0x0033 }
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r8 = r1
        L_0x0034:
            r2 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x005f }
            if (r8 != 0) goto L_0x003d
            r8 = r0
        L_0x003d:
            java.lang.Long r0 = r6.mo16863N()     // Catch:{ all -> 0x005f }
            com.yandex.metrica.impl.ob.fm r2 = com.yandex.metrica.impl.p082ob.C2974fm.m9584c()     // Catch:{ all -> 0x005f }
            long r3 = r8.longValue()     // Catch:{ all -> 0x005f }
            r2.mo17614a(r3, r0)     // Catch:{ all -> 0x005f }
            com.yandex.metrica.impl.ob.pi r6 = r5.mo18168a((com.yandex.metrica.impl.p082ob.C2638Ui) r6, (com.yandex.metrica.impl.p082ob.C2312Mg) r7, (java.lang.Long) r8)     // Catch:{ all -> 0x005f }
            monitor-enter(r5)     // Catch:{ all -> 0x005f }
            r5.f9038e = r1     // Catch:{ all -> 0x005c }
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            r5.m10649b(r6)     // Catch:{ all -> 0x005f }
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            r5.m10648a((com.yandex.metrica.impl.p082ob.C3356pi) r6)
            return
        L_0x005c:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            throw r6     // Catch:{ all -> 0x005f }
        L_0x005f:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3450ri.mo18170a(com.yandex.metrica.impl.ob.Ui, com.yandex.metrica.impl.ob.Mg, java.util.Map):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3356pi mo18168a(C2638Ui ui, C2312Mg mg, Long l) {
        boolean z;
        String c = C2572Tl.m8538c(mg.mo16301C());
        Map<String, String> b = mg.mo16300B().mo18318b();
        String n = ui.mo16919n();
        String n2 = this.f9039f.mo15830d().mo17982n();
        if (!C2572Tl.m8541d(C2572Tl.m8518a(n))) {
            n = C2572Tl.m8541d(C2572Tl.m8518a(n2)) ? n2 : null;
        }
        String i = this.f9039f.mo15830d().mo17977i();
        if (TextUtils.isEmpty(i)) {
            i = ui.mo16914i();
        }
        C3356pi.C3357a h = new C3356pi.C3357a(new C3416qi.C3418b(ui.mo16902e())).mo18026c(i).mo18029d(ui.mo16911h()).mo18024c(this.f9040g.currentTimeSeconds()).mo18043k(this.f9039f.mo15830d().mo17968V()).mo18033f(ui.mo16920o()).mo18027c(ui.mo16856G()).mo18021b(mg.mo16308J()).mo18040i(ui.mo16930y()).mo18032e(ui.mo16923r()).mo18039i(ui.mo16929x()).mo18041j(ui.mo16853D()).mo18013a(ui.mo16899d()).mo18014a(ui.mo16915j()).mo18036g(ui.mo16925t()).mo18015a((Map<String, ? extends List<String>>) ui.mo16908g()).mo18031e(n).mo18037h(c);
        this.f9042i.getClass();
        Map<String, String> a = C2572Tl.m8518a(n);
        if (C1848A2.m6815b((Map) b)) {
            z = C1848A2.m6815b((Map) a);
        } else {
            z = a.equals(b);
        }
        C3356pi.C3357a a2 = h.mo18028c(z).mo18035g(C2572Tl.m8538c(b)).mo18003a(ui.mo16854E()).mo18030d((List<? extends C3316oc>) ui.mo16922q()).mo18042j((List<? extends C2841bi>) ui.mo16931z()).mo18020b(ui.mo16905f()).mo18001a(ui.mo16928w()).mo18038h((List<? extends C1892Bd>) ui.mo16927v()).mo18002a(ui.mo16852C()).mo18008a(ui.mo16857H()).mo18016a(true);
        Long valueOf = Long.valueOf((System.currentTimeMillis() / 1000) * 1000);
        if (l != null) {
            valueOf = l;
        }
        return a2.mo18018b(valueOf.longValue()).mo17996a(((C2312Mg) this.f9039f.mo15828b()).mo16311a(l.longValue())).mo18023b(false).mo18000a(ui.mo16921p()).mo18012a(ui.mo16851B()).mo18011a(ui.mo16861L()).mo18019b(ui.mo16860K()).mo18025c(ui.mo16862M()).mo18004a(ui.mo16859J()).mo18009a(ui.mo16858I()).mo17998a(ui.mo16895c()).mo18006a(ui.mo16916k()).mo18034f(ui.mo16924s()).mo18005a(ui.mo16890b()).mo17997a(ui.mo16865a()).mo18010a(ui.mo16917l()).mo17999a(ui.mo16918m()).mo18007a(ui.mo16855F()).mo18022b((Map<String, ? extends Object>) ui.mo16926u()).mo18017a();
    }

    /* renamed from: a */
    private void m10648a(C3356pi piVar) {
        ArrayList<C3131ki> arrayList;
        C3323oi oiVar = this.f9036c;
        String b = this.f9035b.mo15879b();
        C2927ei.C2928a aVar = (C2927ei.C2928a) oiVar;
        synchronized (C2927ei.this.f7767b) {
            C3356pi unused = C2927ei.this.f7768c = piVar;
            Collection a = C2927ei.this.f7766a.mo18180a(b);
            if (a == null) {
                arrayList = new ArrayList<>();
            } else {
                arrayList = new ArrayList<>(a);
            }
        }
        for (C3131ki a2 : arrayList) {
            a2.mo15772a(piVar);
        }
    }

    /* renamed from: a */
    public synchronized boolean mo18172a(List<String> list, Map<String, String> map) {
        return !C3289ni.m10180a(this.f9039f.mo15830d(), list, map, new C3451a());
    }

    /* renamed from: a */
    public synchronized void mo18169a(C2312Mg.C2314b bVar) {
        this.f9039f.mo17603a(bVar);
        C2312Mg mg = (C2312Mg) this.f9039f.mo15828b();
        if (mg.mo16309K()) {
            boolean z = false;
            List<String> G = mg.mo16305G();
            boolean z2 = true;
            C3356pi.C3357a aVar = null;
            if (C1848A2.m6814b((Collection) G) && !C1848A2.m6814b((Collection) mg.mo16308J())) {
                aVar = this.f9039f.mo15830d().mo17969a().mo18021b((List<String>) null);
                z = true;
            }
            if (C1848A2.m6814b((Collection) G) || C1848A2.m6810a((Object) G, (Object) mg.mo16308J())) {
                z2 = z;
            } else {
                aVar = this.f9039f.mo15830d().mo17969a().mo18021b(G);
            }
            if (z2) {
                C3356pi a = aVar.mo18017a();
                m10649b(a);
                m10648a(a);
            }
        }
    }
}
