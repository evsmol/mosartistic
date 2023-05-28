package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.coreutils.services.UtilityServiceConfiguration;
import com.yandex.metrica.coreutils.services.UtilityServiceLocator;
import com.yandex.metrica.impl.p082ob.C2947fa;
import com.yandex.metrica.impl.p082ob.C3464s2;
import com.yandex.metrica.impl.p082ob.C3650xb;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.F0 */
public final class C2007F0 {

    /* renamed from: x */
    private static volatile C2007F0 f5357x;

    /* renamed from: a */
    private final Context f5358a;

    /* renamed from: b */
    private volatile C3480sg f5359b;

    /* renamed from: c */
    private volatile C3130kh f5360c;

    /* renamed from: d */
    private volatile C2188Jf f5361d;

    /* renamed from: e */
    private volatile C3056ib f5362e;

    /* renamed from: f */
    private volatile C3464s2 f5363f;

    /* renamed from: g */
    private volatile C2897dh f5364g;

    /* renamed from: h */
    private volatile C2442Pm f5365h;

    /* renamed from: i */
    private volatile C2723Xj f5366i;

    /* renamed from: j */
    private volatile C1967E f5367j;

    /* renamed from: k */
    private volatile C3077j2 f5368k;

    /* renamed from: l */
    private volatile C3395qc f5369l;

    /* renamed from: m */
    private volatile C3650xb f5370m;

    /* renamed from: n */
    private volatile C1889Bb f5371n;

    /* renamed from: o */
    private volatile C2106I1 f5372o;

    /* renamed from: p */
    private volatile C2104I f5373p;

    /* renamed from: q */
    private volatile C2917e9 f5374q;

    /* renamed from: r */
    private volatile C2916e8 f5375r;

    /* renamed from: s */
    private C2909e2 f5376s;

    /* renamed from: t */
    private C2938f1 f5377t;

    /* renamed from: u */
    private C3477sd f5378u;

    /* renamed from: v */
    private final C3140l2 f5379v = new C2008a(this);

    /* renamed from: w */
    private C3097jd f5380w;

    /* renamed from: com.yandex.metrica.impl.ob.F0$a */
    class C2008a implements C3140l2 {
        C2008a(C2007F0 f0) {
        }

        /* renamed from: a */
        public void mo15575a() {
            NetworkServiceLocator.getInstance().onCreate();
        }

        /* renamed from: b */
        public void mo15576b() {
            NetworkServiceLocator.getInstance().onDestroy();
        }
    }

    private C2007F0(Context context) {
        this.f5358a = context;
        this.f5365h = new C2442Pm();
        this.f5377t = new C2938f1(context, this.f5365h.mo16486a());
        this.f5367j = new C1967E(this.f5365h.mo16486a(), this.f5377t.mo17564b());
        this.f5376s = new C2909e2();
        this.f5380w = new C3097jd();
        NetworkServiceLocator.init();
    }

    /* renamed from: a */
    public static void m7153a(Context context) {
        if (f5357x == null) {
            synchronized (C2007F0.class) {
                if (f5357x == null) {
                    f5357x = new C2007F0(context.getApplicationContext());
                }
            }
        }
    }

    /* renamed from: g */
    public static C2007F0 m7154g() {
        return f5357x;
    }

    /* renamed from: y */
    private void m7155y() {
        if (this.f5372o == null) {
            synchronized (this) {
                if (this.f5372o == null) {
                    ProtobufStateStorage<C2600Ud> a = C2947fa.C2949b.m9536a(C2600Ud.class).mo17592a(this.f5358a);
                    C2600Ud ud = (C2600Ud) a.read();
                    Context context = this.f5358a;
                    C2835be beVar = new C2835be();
                    C2561Td td = new C2561Td(ud);
                    C2999ge geVar = new C2999ge();
                    C2803ae aeVar = new C2803ae(this.f5358a);
                    C2007F0 g = m7154g();
                    Intrinsics.checkNotNullExpressionValue(g, "GlobalServiceLocator.getInstance()");
                    C2917e9 s = g.mo15756s();
                    Intrinsics.checkNotNullExpressionValue(s, "GlobalServiceLocator.get…ance().servicePreferences");
                    this.f5372o = new C2106I1(context, a, beVar, td, geVar, aeVar, new C2866ce(s), new C2661Vd(), ud, "[PreloadInfoStorage]");
                }
            }
        }
    }

    /* renamed from: b */
    public C3598w mo15740b() {
        return this.f5377t.mo17562a();
    }

    /* renamed from: c */
    public C1967E mo15741c() {
        return this.f5367j;
    }

    /* renamed from: d */
    public C2104I mo15742d() {
        if (this.f5373p == null) {
            synchronized (this) {
                if (this.f5373p == null) {
                    ProtobufStateStorage<C3566v3> a = C2947fa.C2949b.m9536a(C3566v3.class).mo17592a(this.f5358a);
                    this.f5373p = new C2104I(this.f5358a, a, new C3604w3(), new C3430r3(), new C3682y3(), new C2789a2(this.f5358a), new C3642x3(mo15756s()), new C3467s3(), (C3566v3) a.read(), "[ClidsInfoStorage]");
                }
            }
        }
        return this.f5373p;
    }

    /* renamed from: e */
    public Context mo15743e() {
        return this.f5358a;
    }

    /* renamed from: f */
    public C3056ib mo15744f() {
        if (this.f5362e == null) {
            synchronized (this) {
                if (this.f5362e == null) {
                    this.f5362e = new C3056ib(this.f5377t.mo17562a(), new C3025hb());
                }
            }
        }
        return this.f5362e;
    }

    /* renamed from: h */
    public C2938f1 mo15745h() {
        return this.f5377t;
    }

    /* renamed from: i */
    public C3395qc mo15746i() {
        C3395qc qcVar = this.f5369l;
        if (qcVar == null) {
            synchronized (this) {
                qcVar = this.f5369l;
                if (qcVar == null) {
                    qcVar = new C3395qc(this.f5358a);
                    this.f5369l = qcVar;
                }
            }
        }
        return qcVar;
    }

    /* renamed from: j */
    public C3097jd mo15747j() {
        return this.f5380w;
    }

    /* renamed from: k */
    public C2106I1 mo15748k() {
        m7155y();
        return this.f5372o;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: l */
    public com.yandex.metrica.impl.p082ob.C2188Jf mo15749l() {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.Jf r0 = r8.f5361d
            if (r0 != 0) goto L_0x004a
            monitor-enter(r8)
            com.yandex.metrica.impl.ob.Jf r0 = r8.f5361d     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0045
            com.yandex.metrica.impl.ob.Jf r0 = new com.yandex.metrica.impl.ob.Jf     // Catch:{ all -> 0x0047 }
            android.content.Context r2 = r8.f5358a     // Catch:{ all -> 0x0047 }
            java.lang.Class<com.yandex.metrica.impl.ob.Jf$e> r1 = com.yandex.metrica.impl.p082ob.C2188Jf.C2193e.class
            com.yandex.metrica.impl.ob.fa r1 = com.yandex.metrica.impl.p082ob.C2947fa.C2949b.m9536a(r1)     // Catch:{ all -> 0x0047 }
            android.content.Context r3 = r8.f5358a     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.core.api.ProtobufStateStorage r3 = r1.mo17592a(r3)     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.s2 r4 = r8.mo15758u()     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.kh r1 = r8.f5360c     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0032
            monitor-enter(r8)     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.kh r1 = r8.f5360c     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x002d
            com.yandex.metrica.impl.ob.kh r1 = new com.yandex.metrica.impl.ob.kh     // Catch:{ all -> 0x002f }
            r1.<init>()     // Catch:{ all -> 0x002f }
            r8.f5360c = r1     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0032
        L_0x002f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0032:
            com.yandex.metrica.impl.ob.kh r5 = r8.f5360c     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.Pm r1 = r8.f5365h     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.core.api.executors.ICommonExecutor r6 = r1.mo16494g()     // Catch:{ all -> 0x0047 }
            com.yandex.metrica.impl.ob.Ml r7 = new com.yandex.metrica.impl.ob.Ml     // Catch:{ all -> 0x0047 }
            r7.<init>()     // Catch:{ all -> 0x0047 }
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0047 }
            r8.f5361d = r0     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r8)     // Catch:{ all -> 0x0047 }
            goto L_0x004a
        L_0x0047:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0047 }
            throw r0
        L_0x004a:
            com.yandex.metrica.impl.ob.Jf r0 = r8.f5361d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2007F0.mo15749l():com.yandex.metrica.impl.ob.Jf");
    }

    /* renamed from: m */
    public C3480sg mo15750m() {
        if (this.f5359b == null) {
            synchronized (this) {
                if (this.f5359b == null) {
                    this.f5359b = new C3480sg(this.f5358a);
                }
            }
        }
        return this.f5359b;
    }

    /* renamed from: n */
    public C2909e2 mo15751n() {
        return this.f5376s;
    }

    /* renamed from: o */
    public C2897dh mo15752o() {
        if (this.f5364g == null) {
            synchronized (this) {
                if (this.f5364g == null) {
                    this.f5364g = new C2897dh(this.f5358a, this.f5365h.mo16494g());
                }
            }
        }
        return this.f5364g;
    }

    /* renamed from: p */
    public synchronized C3077j2 mo15753p() {
        return this.f5368k;
    }

    /* renamed from: q */
    public C2442Pm mo15754q() {
        return this.f5365h;
    }

    /* renamed from: r */
    public C3650xb mo15755r() {
        if (this.f5370m == null) {
            synchronized (this) {
                if (this.f5370m == null) {
                    this.f5370m = new C3650xb(new C3650xb.C3658h(), new C3650xb.C3654d(), new C3650xb.C3653c(), this.f5365h.mo16486a(), "ServiceInternal");
                }
            }
        }
        return this.f5370m;
    }

    /* renamed from: s */
    public C2917e9 mo15756s() {
        if (this.f5374q == null) {
            synchronized (this) {
                if (this.f5374q == null) {
                    this.f5374q = new C2917e9(C3093ja.m9805a(this.f5358a).mo17747i());
                }
            }
        }
        return this.f5374q;
    }

    /* renamed from: t */
    public synchronized C3477sd mo15757t() {
        if (this.f5378u == null) {
            this.f5378u = new C3477sd(this.f5358a);
        }
        return this.f5378u;
    }

    /* renamed from: u */
    public C3464s2 mo15758u() {
        if (this.f5363f == null) {
            synchronized (this) {
                if (this.f5363f == null) {
                    this.f5363f = new C3464s2(new C3464s2.C3466b(mo15756s()));
                }
            }
        }
        return this.f5363f;
    }

    /* renamed from: v */
    public C2723Xj mo15759v() {
        if (this.f5366i == null) {
            synchronized (this) {
                if (this.f5366i == null) {
                    this.f5366i = new C2723Xj(this.f5358a, this.f5365h.mo16495h());
                }
            }
        }
        return this.f5366i;
    }

    /* renamed from: w */
    public synchronized C2916e8 mo15760w() {
        if (this.f5375r == null) {
            this.f5375r = new C2916e8(this.f5358a);
        }
        return this.f5375r;
    }

    /* renamed from: x */
    public synchronized void mo15761x() {
        UtilityServiceLocator.getInstance().initAsync();
        NetworkServiceLocator.getInstance().initAsync();
        this.f5377t.mo17563a(this.f5379v);
        mo15749l().mo16005a();
        m7155y();
        mo15746i().mo18071b();
    }

    /* renamed from: a */
    public synchronized void mo15739a(C3356pi piVar) {
        if (this.f5370m != null) {
            this.f5370m.mo18396a(piVar);
        }
        if (this.f5364g != null) {
            this.f5364g.mo17465b(piVar);
        }
        UtilityServiceLocator.getInstance().updateConfiguration(new UtilityServiceConfiguration(piVar.mo17983o(), piVar.mo17948B()));
        if (this.f5362e != null) {
            this.f5362e.mo17711b(piVar);
        }
    }

    /* renamed from: a */
    public C1889Bb mo15737a() {
        if (this.f5371n == null) {
            synchronized (this) {
                if (this.f5371n == null) {
                    this.f5371n = new C1889Bb(this.f5358a, C1920Cb.m6967a());
                }
            }
        }
        return this.f5371n;
    }

    /* renamed from: a */
    public synchronized void mo15738a(C3111k2 k2Var) {
        this.f5368k = new C3077j2(this.f5358a, k2Var);
    }
}
