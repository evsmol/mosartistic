package com.applovin.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.C6804ah;
import com.applovin.exoplayer2.C6822ao;
import com.applovin.exoplayer2.C6827ar;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.C7774m;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.exoplayer2.common.p183a.C6967aq;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p180a.C6781a;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p206h.C7506n;
import com.applovin.exoplayer2.p206h.C7508o;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.C7534x;
import com.applovin.exoplayer2.p206h.C7537z;
import com.applovin.exoplayer2.p209i.C7622m;
import com.applovin.exoplayer2.p219j.C7637d;
import com.applovin.exoplayer2.p219j.C7647j;
import com.applovin.exoplayer2.p219j.C7649k;
import com.applovin.exoplayer2.p220k.C7660d;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7732d;
import com.applovin.exoplayer2.p221l.C7749o;
import com.applovin.exoplayer2.p221l.C7755q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.exoplayer2.s */
final class C7824s implements Handler.Callback, C6804ah.C6808d, C6822ao.C6823a, C7506n.C7507a, C7647j.C7648a, C7774m.C7775a {

    /* renamed from: A */
    private boolean f18609A;

    /* renamed from: B */
    private boolean f18610B;

    /* renamed from: C */
    private boolean f18611C;

    /* renamed from: D */
    private boolean f18612D;

    /* renamed from: E */
    private int f18613E;

    /* renamed from: F */
    private boolean f18614F;

    /* renamed from: G */
    private boolean f18615G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f18616H;

    /* renamed from: I */
    private boolean f18617I;

    /* renamed from: J */
    private int f18618J;

    /* renamed from: K */
    private C7832g f18619K;

    /* renamed from: L */
    private long f18620L;

    /* renamed from: M */
    private int f18621M;

    /* renamed from: N */
    private boolean f18622N;

    /* renamed from: O */
    private C7819p f18623O;

    /* renamed from: P */
    private long f18624P;

    /* renamed from: a */
    private final C6827ar[] f18625a;

    /* renamed from: b */
    private final Set<C6827ar> f18626b;

    /* renamed from: c */
    private final C6829as[] f18627c;

    /* renamed from: d */
    private final C7647j f18628d;

    /* renamed from: e */
    private final C7649k f18629e;

    /* renamed from: f */
    private final C6786aa f18630f;

    /* renamed from: g */
    private final C7660d f18631g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C7749o f18632h;

    /* renamed from: i */
    private final HandlerThread f18633i;

    /* renamed from: j */
    private final Looper f18634j;

    /* renamed from: k */
    private final C6904ba.C6908c f18635k;

    /* renamed from: l */
    private final C6904ba.C6906a f18636l;

    /* renamed from: m */
    private final long f18637m;

    /* renamed from: n */
    private final boolean f18638n;

    /* renamed from: o */
    private final C7774m f18639o;

    /* renamed from: p */
    private final ArrayList<C7828c> f18640p;

    /* renamed from: q */
    private final C7732d f18641q;

    /* renamed from: r */
    private final C7830e f18642r;

    /* renamed from: s */
    private final C6802af f18643s;

    /* renamed from: t */
    private final C6804ah f18644t;

    /* renamed from: u */
    private final C7870z f18645u;

    /* renamed from: v */
    private final long f18646v;

    /* renamed from: w */
    private C6832av f18647w;

    /* renamed from: x */
    private C6812al f18648x;

    /* renamed from: y */
    private C7829d f18649y;

    /* renamed from: z */
    private boolean f18650z;

    /* renamed from: com.applovin.exoplayer2.s$a */
    private static final class C7826a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C6804ah.C6807c> f18652a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C7537z f18653b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f18654c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f18655d;

        private C7826a(List<C6804ah.C6807c> list, C7537z zVar, int i, long j) {
            this.f18652a = list;
            this.f18653b = zVar;
            this.f18654c = i;
            this.f18655d = j;
        }
    }

    /* renamed from: com.applovin.exoplayer2.s$b */
    private static class C7827b {

        /* renamed from: a */
        public final int f18656a;

        /* renamed from: b */
        public final int f18657b;

        /* renamed from: c */
        public final int f18658c;

        /* renamed from: d */
        public final C7537z f18659d;
    }

    /* renamed from: com.applovin.exoplayer2.s$c */
    private static final class C7828c implements Comparable<C7828c> {

        /* renamed from: a */
        public final C6822ao f18660a;

        /* renamed from: b */
        public int f18661b;

        /* renamed from: c */
        public long f18662c;

        /* renamed from: d */
        public Object f18663d;

        public C7828c(C6822ao aoVar) {
            this.f18660a = aoVar;
        }

        /* renamed from: a */
        public int compareTo(C7828c cVar) {
            if ((this.f18663d == null) != (cVar.f18663d == null)) {
                return this.f18663d != null ? -1 : 1;
            }
            if (this.f18663d == null) {
                return 0;
            }
            int i = this.f18661b - cVar.f18661b;
            return i != 0 ? i : C7728ai.m22181a(this.f18662c, cVar.f18662c);
        }

        /* renamed from: a */
        public void mo55261a(int i, long j, Object obj) {
            this.f18661b = i;
            this.f18662c = j;
            this.f18663d = obj;
        }
    }

    /* renamed from: com.applovin.exoplayer2.s$d */
    public static final class C7829d {

        /* renamed from: a */
        public C6812al f18664a;

        /* renamed from: b */
        public int f18665b;

        /* renamed from: c */
        public boolean f18666c;

        /* renamed from: d */
        public int f18667d;

        /* renamed from: e */
        public boolean f18668e;

        /* renamed from: f */
        public int f18669f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f18670g;

        public C7829d(C6812al alVar) {
            this.f18664a = alVar;
        }

        /* renamed from: a */
        public void mo55263a(int i) {
            this.f18670g |= i > 0;
            this.f18665b += i;
        }

        /* renamed from: a */
        public void mo55264a(C6812al alVar) {
            this.f18670g |= this.f18664a != alVar;
            this.f18664a = alVar;
        }

        /* renamed from: b */
        public void mo55265b(int i) {
            boolean z = true;
            if (!this.f18666c || this.f18667d == 5) {
                this.f18670g = true;
                this.f18666c = true;
                this.f18667d = i;
                return;
            }
            if (i != 5) {
                z = false;
            }
            C7717a.m22118a(z);
        }

        /* renamed from: c */
        public void mo55266c(int i) {
            this.f18670g = true;
            this.f18668e = true;
            this.f18669f = i;
        }
    }

    /* renamed from: com.applovin.exoplayer2.s$e */
    public interface C7830e {
        void onPlaybackInfoUpdate(C7829d dVar);
    }

    /* renamed from: com.applovin.exoplayer2.s$f */
    private static final class C7831f {

        /* renamed from: a */
        public final C7509p.C7510a f18671a;

        /* renamed from: b */
        public final long f18672b;

        /* renamed from: c */
        public final long f18673c;

        /* renamed from: d */
        public final boolean f18674d;

        /* renamed from: e */
        public final boolean f18675e;

        /* renamed from: f */
        public final boolean f18676f;

        public C7831f(C7509p.C7510a aVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f18671a = aVar;
            this.f18672b = j;
            this.f18673c = j2;
            this.f18674d = z;
            this.f18675e = z2;
            this.f18676f = z3;
        }
    }

    /* renamed from: com.applovin.exoplayer2.s$g */
    private static final class C7832g {

        /* renamed from: a */
        public final C6904ba f18677a;

        /* renamed from: b */
        public final int f18678b;

        /* renamed from: c */
        public final long f18679c;

        public C7832g(C6904ba baVar, int i, long j) {
            this.f18677a = baVar;
            this.f18678b = i;
            this.f18679c = j;
        }
    }

    public C7824s(C6827ar[] arVarArr, C7647j jVar, C7649k kVar, C6786aa aaVar, C7660d dVar, int i, boolean z, C6781a aVar, C6832av avVar, C7870z zVar, long j, boolean z2, Looper looper, C7732d dVar2, C7830e eVar) {
        C6827ar[] arVarArr2 = arVarArr;
        C7660d dVar3 = dVar;
        C6781a aVar2 = aVar;
        long j2 = j;
        C7732d dVar4 = dVar2;
        this.f18642r = eVar;
        this.f18625a = arVarArr2;
        this.f18628d = jVar;
        this.f18629e = kVar;
        this.f18630f = aaVar;
        this.f18631g = dVar3;
        this.f18613E = i;
        this.f18614F = z;
        this.f18647w = avVar;
        this.f18645u = zVar;
        this.f18646v = j2;
        this.f18624P = j2;
        this.f18609A = z2;
        this.f18641q = dVar4;
        this.f18637m = aaVar.mo52609e();
        this.f18638n = aaVar.mo52610f();
        C6812al a = C6812al.m17547a(kVar);
        this.f18648x = a;
        this.f18649y = new C7829d(a);
        this.f18627c = new C6829as[arVarArr2.length];
        for (int i2 = 0; i2 < arVarArr2.length; i2++) {
            arVarArr2[i2].mo52828a(i2);
            this.f18627c[i2] = arVarArr2[i2].mo52833b();
        }
        this.f18639o = new C7774m(this, dVar4);
        this.f18640p = new ArrayList<>();
        this.f18626b = C6967aq.m18599b();
        this.f18635k = new C6904ba.C6908c();
        this.f18636l = new C6904ba.C6906a();
        jVar.mo54866a(this, dVar3);
        this.f18622N = true;
        Handler handler = new Handler(looper);
        this.f18643s = new C6802af(aVar2, handler);
        this.f18644t = new C6804ah(this, aVar2, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f18633i = handlerThread;
        handlerThread.start();
        Looper looper2 = this.f18633i.getLooper();
        this.f18634j = looper2;
        this.f18632h = dVar4.mo54964a(looper2, this);
    }

    /* renamed from: A */
    private void m22833A() {
        C6800ad c = this.f18643s.mo52707c();
        this.f18610B = c != null && c.f14748f.f14765h && this.f18609A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r0 = (r0 = r7.f18643s.mo52707c()).mo52687g();
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22834B() {
        /*
            r7 = this;
            boolean r0 = r7.m22842J()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r7.f18610B
            if (r0 == 0) goto L_0x000d
            return r1
        L_0x000d:
            com.applovin.exoplayer2.af r0 = r7.f18643s
            com.applovin.exoplayer2.ad r0 = r0.mo52707c()
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            com.applovin.exoplayer2.ad r0 = r0.mo52687g()
            if (r0 == 0) goto L_0x002b
            long r2 = r7.f18620L
            long r4 = r0.mo52677b()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x002b
            boolean r0 = r0.f14749g
            if (r0 == 0) goto L_0x002b
            r1 = 1
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.C7824s.m22834B():boolean");
    }

    /* renamed from: C */
    private boolean m22835C() {
        C6800ad d = this.f18643s.mo52708d();
        if (!d.f14746d) {
            return false;
        }
        int i = 0;
        while (true) {
            C6827ar[] arVarArr = this.f18625a;
            if (i >= arVarArr.length) {
                return true;
            }
            C6827ar arVar = arVarArr[i];
            C7534x xVar = d.f14745c[i];
            if (arVar.mo52837f() != xVar || (xVar != null && !arVar.mo52838g() && !m22880a(arVar, d))) {
                return false;
            }
            i++;
        }
        return false;
    }

    /* renamed from: D */
    private void m22836D() {
        boolean E = m22837E();
        this.f18612D = E;
        if (E) {
            this.f18643s.mo52706b().mo52685e(this.f18620L);
        }
        m22839G();
    }

    /* renamed from: E */
    private boolean m22837E() {
        if (!m22838F()) {
            return false;
        }
        C6800ad b = this.f18643s.mo52706b();
        return this.f18630f.mo52605a(b == this.f18643s.mo52707c() ? b.mo52678b(this.f18620L) : b.mo52678b(this.f18620L) - b.f14748f.f14759b, m22900d(b.mo52684e()), this.f18639o.mo53055d().f14832b);
    }

    /* renamed from: F */
    private boolean m22838F() {
        C6800ad b = this.f18643s.mo52706b();
        return (b == null || b.mo52684e() == Long.MIN_VALUE) ? false : true;
    }

    /* renamed from: G */
    private void m22839G() {
        C6800ad b = this.f18643s.mo52706b();
        boolean z = this.f18612D || (b != null && b.f14743a.mo54509f());
        if (z != this.f18648x.f14817g) {
            this.f18648x = this.f18648x.mo52736a(z);
        }
    }

    /* renamed from: H */
    private void m22840H() throws C7819p {
        m22878a(new boolean[this.f18625a.length]);
    }

    /* renamed from: I */
    private long m22841I() {
        return m22900d(this.f18648x.f14827q);
    }

    /* renamed from: J */
    private boolean m22842J() {
        return this.f18648x.f14822l && this.f18648x.f14823m == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ Boolean m22843K() {
        return Boolean.valueOf(this.f18650z);
    }

    /* renamed from: a */
    private long m22844a(C6904ba baVar, Object obj, long j) {
        baVar.mo53079a(baVar.mo52441a(obj, this.f18636l).f15258c, this.f18635k);
        if (this.f18635k.f15276g == -9223372036854775807L || !this.f18635k.mo53109e() || !this.f18635k.f15279j) {
            return -9223372036854775807L;
        }
        return C7476h.m20800b(this.f18635k.mo53108d() - this.f18635k.f15276g) - (j + this.f18636l.mo53094c());
    }

    /* renamed from: a */
    private long m22845a(C7509p.C7510a aVar, long j, boolean z) throws C7819p {
        return m22846a(aVar, j, this.f18643s.mo52707c() != this.f18643s.mo52708d(), z);
    }

    /* renamed from: a */
    private long m22846a(C7509p.C7510a aVar, long j, boolean z, boolean z2) throws C7819p {
        m22914j();
        this.f18611C = false;
        if (z2 || this.f18648x.f14815e == 3) {
            m22885b(2);
        }
        C6800ad c = this.f18643s.mo52707c();
        C6800ad adVar = c;
        while (adVar != null && !aVar.equals(adVar.f14748f.f14758a)) {
            adVar = adVar.mo52687g();
        }
        if (z || c != adVar || (adVar != null && adVar.mo52672a(j) < 0)) {
            for (C6827ar b : this.f18625a) {
                m22890b(b);
            }
            if (adVar != null) {
                while (this.f18643s.mo52707c() != adVar) {
                    this.f18643s.mo52710f();
                }
                this.f18643s.mo52701a(adVar);
                adVar.mo52680c(0);
                m22840H();
            }
        }
        C6802af afVar = this.f18643s;
        if (adVar != null) {
            afVar.mo52701a(adVar);
            if (!adVar.f14746d) {
                adVar.f14748f = adVar.f14748f.mo52691a(j);
            } else if (adVar.f14747e) {
                long b2 = adVar.f14743a.mo54501b(j);
                adVar.f14743a.mo54497a(b2 - this.f18637m, this.f18638n);
                j = b2;
            }
            m22887b(j);
            m22836D();
        } else {
            afVar.mo52711g();
            m22887b(j);
        }
        m22912h(false);
        this.f18632h.mo54976c(2);
        return j;
    }

    /* renamed from: a */
    private Pair<C7509p.C7510a, Long> m22847a(C6904ba baVar) {
        long j = 0;
        if (baVar.mo53081d()) {
            return Pair.create(C6812al.m17548a(), 0L);
        }
        C6904ba baVar2 = baVar;
        Pair<Object, Long> a = baVar2.mo53076a(this.f18635k, this.f18636l, baVar.mo52446b(this.f18614F), -9223372036854775807L);
        C7509p.C7510a a2 = this.f18643s.mo52698a(baVar, a.first, 0);
        long longValue = ((Long) a.second).longValue();
        if (a2.mo54546a()) {
            baVar.mo52441a(a2.f17251a, this.f18636l);
            if (a2.f17253c == this.f18636l.mo53090b(a2.f17252b)) {
                j = this.f18636l.mo53101f();
            }
            longValue = j;
        }
        return Pair.create(a2, Long.valueOf(longValue));
    }

    /* renamed from: a */
    private static Pair<Object, Long> m22848a(C6904ba baVar, C7832g gVar, boolean z, int i, boolean z2, C6904ba.C6908c cVar, C6904ba.C6906a aVar) {
        Object a;
        C6904ba baVar2 = baVar;
        C7832g gVar2 = gVar;
        C6904ba.C6906a aVar2 = aVar;
        C6904ba baVar3 = gVar2.f18677a;
        if (baVar.mo53081d()) {
            return null;
        }
        C6904ba baVar4 = baVar3.mo53081d() ? baVar2 : baVar3;
        try {
            Pair<Object, Long> a2 = baVar4.mo53076a(cVar, aVar, gVar2.f18678b, gVar2.f18679c);
            if (baVar.equals(baVar4)) {
                return a2;
            }
            if (baVar.mo52448c(a2.first) == -1) {
                C6904ba.C6908c cVar2 = cVar;
                if (z && (a = m22853a(cVar, aVar, i, z2, a2.first, baVar4, baVar)) != null) {
                    return baVar.mo53076a(cVar, aVar, baVar.mo52441a(a, aVar2).f15258c, -9223372036854775807L);
                }
                return null;
            } else if (!baVar4.mo52441a(a2.first, aVar2).f15261f || baVar4.mo53079a(aVar2.f15258c, cVar).f15285p != baVar4.mo52448c(a2.first)) {
                return a2;
            } else {
                return baVar.mo53076a(cVar, aVar, baVar.mo52441a(a2.first, aVar2).f15258c, gVar2.f18679c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: a */
    private C6812al m22849a(C7509p.C7510a aVar, long j, long j2, long j3, boolean z, int i) {
        C7033s<C7399a> sVar;
        C7649k kVar;
        C7483ad adVar;
        C7509p.C7510a aVar2 = aVar;
        long j4 = j2;
        this.f18622N = this.f18622N || j != this.f18648x.f14829s || !aVar.equals(this.f18648x.f14812b);
        m22833A();
        C7483ad adVar2 = this.f18648x.f14818h;
        C7649k kVar2 = this.f18648x.f14819i;
        List list = this.f18648x.f14820j;
        if (this.f18644t.mo52722a()) {
            C6800ad c = this.f18643s.mo52707c();
            C7483ad h = c == null ? C7483ad.f17172a : c.mo52688h();
            C7649k i2 = c == null ? this.f18629e : c.mo52689i();
            C7033s<C7399a> a = m22850a(i2.f17987c);
            if (!(c == null || c.f14748f.f14760c == j4)) {
                c.f14748f = c.f14748f.mo52692b(j4);
            }
            adVar = h;
            kVar = i2;
            sVar = a;
        } else {
            if (!aVar.equals(this.f18648x.f14812b)) {
                adVar2 = C7483ad.f17172a;
                kVar2 = this.f18629e;
                list = C7033s.m18803g();
            }
            adVar = adVar2;
            kVar = kVar2;
            sVar = list;
        }
        if (z) {
            this.f18649y.mo55265b(i);
        }
        return this.f18648x.mo52734a(aVar, j, j2, j3, m22841I(), adVar, kVar, sVar);
    }

    /* renamed from: a */
    private C7033s<C7399a> m22850a(C7637d[] dVarArr) {
        C7033s.C7034a aVar = new C7033s.C7034a();
        boolean z = false;
        for (C7637d dVar : dVarArr) {
            if (dVar != null) {
                C7864v a = dVar.mo54806a(0);
                if (a.f18919j == null) {
                    aVar.mo53515a(new C7399a(new C7399a.C7401a[0]));
                } else {
                    aVar.mo53515a(a.f18919j);
                    z = true;
                }
            }
        }
        return z ? aVar.mo53531a() : C7033s.m18803g();
    }

    /* renamed from: a */
    private static C7831f m22852a(C6904ba baVar, C6812al alVar, C7832g gVar, C6802af afVar, int i, boolean z, C6904ba.C6908c cVar, C6904ba.C6906a aVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        C7509p.C7510a aVar2;
        int i3;
        long j;
        long j2;
        C6802af afVar2;
        long j3;
        long j4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8;
        C6904ba baVar2 = baVar;
        C6812al alVar2 = alVar;
        C7832g gVar2 = gVar;
        boolean z9 = z;
        C6904ba.C6906a aVar3 = aVar;
        if (baVar.mo53081d()) {
            return new C7831f(C6812al.m17548a(), 0, -9223372036854775807L, false, true, false);
        }
        C7509p.C7510a aVar4 = alVar2.f14812b;
        Object obj = aVar4.f17251a;
        boolean a = m22879a(alVar2, aVar3);
        long j5 = (alVar2.f14812b.mo54546a() || a) ? alVar2.f14813c : alVar2.f14829s;
        boolean z10 = false;
        if (gVar2 != null) {
            C7509p.C7510a aVar5 = aVar4;
            i2 = -1;
            Pair<Object, Long> a2 = m22848a(baVar, gVar, true, i, z, cVar, aVar);
            if (a2 == null) {
                i6 = baVar2.mo52446b(z9);
                j = j5;
                z8 = false;
                z7 = false;
                z6 = true;
            } else {
                if (gVar2.f18679c == -9223372036854775807L) {
                    i6 = baVar2.mo52441a(a2.first, aVar3).f15258c;
                    j = j5;
                    z8 = false;
                } else {
                    obj = a2.first;
                    j = ((Long) a2.second).longValue();
                    z8 = true;
                    i6 = -1;
                }
                z7 = alVar2.f14815e == 4;
                z6 = false;
            }
            C6904ba.C6908c cVar2 = cVar;
            z2 = z8;
            z4 = z7;
            z3 = z6;
            i3 = i6;
            aVar2 = aVar5;
        } else {
            C7509p.C7510a aVar6 = aVar4;
            i2 = -1;
            if (alVar2.f14811a.mo53081d()) {
                i4 = baVar2.mo52446b(z9);
            } else if (baVar2.mo52448c(obj) == -1) {
                Object a3 = m22853a(cVar, aVar, i, z, obj, alVar2.f14811a, baVar);
                if (a3 == null) {
                    i5 = baVar2.mo52446b(z9);
                    z5 = true;
                } else {
                    i5 = baVar2.mo52441a(a3, aVar3).f15258c;
                    z5 = false;
                }
                C6904ba.C6908c cVar3 = cVar;
                i3 = i5;
                z3 = z5;
                j3 = j5;
                aVar2 = aVar6;
                z4 = false;
                z2 = false;
            } else if (j5 == -9223372036854775807L) {
                i4 = baVar2.mo52441a(obj, aVar3).f15258c;
            } else if (a) {
                aVar2 = aVar6;
                alVar2.f14811a.mo52441a(aVar2.f17251a, aVar3);
                if (alVar2.f14811a.mo53079a(aVar3.f15258c, cVar).f15285p == alVar2.f14811a.mo52448c(aVar2.f17251a)) {
                    Pair<Object, Long> a4 = baVar.mo53076a(cVar, aVar, baVar2.mo52441a(obj, aVar3).f15258c, j5 + aVar.mo53094c());
                    obj = a4.first;
                    j4 = ((Long) a4.second).longValue();
                } else {
                    j4 = j5;
                }
                i3 = -1;
                z4 = false;
                z3 = false;
                z2 = true;
            } else {
                C6904ba.C6908c cVar4 = cVar;
                aVar2 = aVar6;
                j3 = j5;
                i3 = -1;
                z4 = false;
                z3 = false;
                z2 = false;
            }
            C6904ba.C6908c cVar5 = cVar;
            i3 = i4;
            j3 = j5;
            aVar2 = aVar6;
            z4 = false;
            z3 = false;
            z2 = false;
        }
        if (i3 != i2) {
            Pair<Object, Long> a5 = baVar.mo53076a(cVar, aVar, i3, -9223372036854775807L);
            obj = a5.first;
            j = ((Long) a5.second).longValue();
            afVar2 = afVar;
            j2 = -9223372036854775807L;
        } else {
            afVar2 = afVar;
            j2 = j;
        }
        C7509p.C7510a a6 = afVar2.mo52698a(baVar2, obj, j);
        boolean z11 = a6.f17255e == i2 || (aVar2.f17255e != i2 && a6.f17252b >= aVar2.f17255e);
        boolean equals = aVar2.f17251a.equals(obj);
        boolean z12 = equals && !aVar2.mo54546a() && !a6.mo54546a() && z11;
        baVar2.mo52441a(obj, aVar3);
        if (equals && !a && j5 == j2 && ((a6.mo54546a() && aVar3.mo53099e(a6.f17252b)) || (aVar2.mo54546a() && aVar3.mo53099e(aVar2.f17252b)))) {
            z10 = true;
        }
        if (z12 || z10) {
            a6 = aVar2;
        }
        if (a6.mo54546a()) {
            if (a6.equals(aVar2)) {
                j = alVar2.f14829s;
            } else {
                baVar2.mo52441a(a6.f17251a, aVar3);
                j = a6.f17253c == aVar3.mo53090b(a6.f17252b) ? aVar.mo53101f() : 0;
            }
        }
        return new C7831f(a6, j, j2, z4, z3, z2);
    }

    /* renamed from: a */
    static Object m22853a(C6904ba.C6908c cVar, C6904ba.C6906a aVar, int i, boolean z, Object obj, C6904ba baVar, C6904ba baVar2) {
        int c = baVar.mo52448c(obj);
        int c2 = baVar.mo52824c();
        int i2 = c;
        int i3 = -1;
        for (int i4 = 0; i4 < c2 && i3 == -1; i4++) {
            i2 = baVar.mo53075a(i2, aVar, cVar, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = baVar2.mo52448c(baVar.mo52443a(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return baVar2.mo52443a(i3);
    }

    /* renamed from: a */
    private void m22854a(float f) {
        for (C6800ad c = this.f18643s.mo52707c(); c != null; c = c.mo52687g()) {
            for (C7637d dVar : c.mo52689i().f17987c) {
                if (dVar != null) {
                    dVar.mo54799a(f);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22855a(int i, boolean z) throws C7819p {
        C6827ar arVar = this.f18625a[i];
        if (!m22899c(arVar)) {
            C6800ad d = this.f18643s.mo52708d();
            boolean z2 = d == this.f18643s.mo52707c();
            C7649k i2 = d.mo52689i();
            C6830at atVar = i2.f17986b[i];
            C7864v[] a = m22884a(i2.f17987c[i]);
            boolean z3 = m22842J() && this.f18648x.f14815e == 3;
            boolean z4 = !z && z3;
            this.f18618J++;
            this.f18626b.add(arVar);
            arVar.mo52831a(atVar, a, d.f14745c[i], this.f18620L, z4, z2, d.mo52677b(), d.mo52671a());
            arVar.mo52821a(11, new C6827ar.C6828a() {
                /* renamed from: a */
                public void mo52848a() {
                    C7824s.this.f18632h.mo54976c(2);
                }

                /* renamed from: a */
                public void mo52849a(long j) {
                    if (j >= 2000) {
                        boolean unused = C7824s.this.f18616H = true;
                    }
                }
            });
            this.f18639o.mo55115a(arVar);
            if (z3) {
                arVar.mo52836e();
            }
        }
    }

    /* renamed from: a */
    private void m22856a(long j, long j2) {
        this.f18632h.mo54977d(2);
        this.f18632h.mo54972a(2, j + j2);
    }

    /* renamed from: a */
    private void m22857a(C6813am amVar, float f, boolean z, boolean z2) throws C7819p {
        if (z) {
            if (z2) {
                this.f18649y.mo55263a(1);
            }
            this.f18648x = this.f18648x.mo52731a(amVar);
        }
        m22854a(amVar.f14832b);
        for (C6827ar arVar : this.f18625a) {
            if (arVar != null) {
                arVar.mo52827a(f, amVar.f14832b);
            }
        }
    }

    /* renamed from: a */
    private void m22858a(C6813am amVar, boolean z) throws C7819p {
        m22857a(amVar, amVar.f14832b, true, z);
    }

    /* renamed from: a */
    private void m22859a(C6827ar arVar) throws C7819p {
        if (arVar.mo52835d_() == 2) {
            arVar.mo52843l();
        }
    }

    /* renamed from: a */
    private void m22860a(C6827ar arVar, long j) {
        arVar.mo52840i();
        if (arVar instanceof C7622m) {
            ((C7622m) arVar).mo54793c(j);
        }
    }

    /* renamed from: a */
    private void m22861a(C6832av avVar) {
        this.f18647w = avVar;
    }

    /* renamed from: a */
    private void m22862a(C6904ba baVar, C6904ba baVar2) {
        if (!baVar.mo53081d() || !baVar2.mo53081d()) {
            for (int size = this.f18640p.size() - 1; size >= 0; size--) {
                if (!m22882a(this.f18640p.get(size), baVar, baVar2, this.f18613E, this.f18614F, this.f18635k, this.f18636l)) {
                    this.f18640p.get(size).f18660a.mo52809a(false);
                    this.f18640p.remove(size);
                }
            }
            Collections.sort(this.f18640p);
        }
    }

    /* renamed from: a */
    private void m22863a(C6904ba baVar, C7509p.C7510a aVar, C6904ba baVar2, C7509p.C7510a aVar2, long j) {
        if (!baVar.mo53081d() && m22881a(baVar, aVar)) {
            baVar.mo53079a(baVar.mo52441a(aVar.f17251a, this.f18636l).f15258c, this.f18635k);
            this.f18645u.mo54874a((C6787ab.C6794e) C7728ai.m22198a(this.f18635k.f15281l));
            if (j != -9223372036854775807L) {
                this.f18645u.mo54873a(m22844a(baVar, aVar.f17251a, j));
                return;
            }
            Object obj = this.f18635k.f15271b;
            Object obj2 = null;
            if (!baVar2.mo53081d()) {
                obj2 = baVar2.mo53079a(baVar2.mo52441a(aVar2.f17251a, this.f18636l).f15258c, this.f18635k).f15271b;
            }
            if (!C7728ai.m22218a(obj2, obj)) {
                this.f18645u.mo54873a(-9223372036854775807L);
            }
        } else if (this.f18639o.mo53055d().f14832b != this.f18648x.f14824n.f14832b) {
            this.f18639o.mo53045a(this.f18648x.f14824n);
        }
    }

    /* renamed from: a */
    private static void m22864a(C6904ba baVar, C7828c cVar, C6904ba.C6908c cVar2, C6904ba.C6906a aVar) {
        int i = baVar.mo53079a(baVar.mo52441a(cVar.f18663d, aVar).f15258c, cVar2).f15286q;
        cVar.mo55261a(i, aVar.f15259d != -9223372036854775807L ? aVar.f15259d - 1 : Long.MAX_VALUE, baVar.mo52440a(i, aVar, true).f15257b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22865a(com.applovin.exoplayer2.C6904ba r25, boolean r26) throws com.applovin.exoplayer2.C7819p {
        /*
            r24 = this;
            r11 = r24
            r12 = r25
            com.applovin.exoplayer2.al r2 = r11.f18648x
            com.applovin.exoplayer2.s$g r3 = r11.f18619K
            com.applovin.exoplayer2.af r4 = r11.f18643s
            int r5 = r11.f18613E
            boolean r6 = r11.f18614F
            com.applovin.exoplayer2.ba$c r7 = r11.f18635k
            com.applovin.exoplayer2.ba$a r8 = r11.f18636l
            r1 = r25
            com.applovin.exoplayer2.s$f r7 = m22852a(r1, r2, r3, r4, r5, r6, r7, r8)
            com.applovin.exoplayer2.h.p$a r8 = r7.f18671a
            long r9 = r7.f18673c
            boolean r0 = r7.f18674d
            long r13 = r7.f18672b
            com.applovin.exoplayer2.al r1 = r11.f18648x
            com.applovin.exoplayer2.h.p$a r1 = r1.f14812b
            boolean r1 = r1.equals(r8)
            r15 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0038
            com.applovin.exoplayer2.al r1 = r11.f18648x
            long r1 = r1.f14829s
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r16 = 0
            goto L_0x003a
        L_0x0038:
            r16 = 1
        L_0x003a:
            r17 = 3
            r6 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 4
            boolean r1 = r7.f18675e     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x0053
            com.applovin.exoplayer2.al r1 = r11.f18648x     // Catch:{ all -> 0x0125 }
            int r1 = r1.f14815e     // Catch:{ all -> 0x0125 }
            if (r1 == r15) goto L_0x0050
            r11.m22885b((int) r4)     // Catch:{ all -> 0x0125 }
        L_0x0050:
            r11.m22877a((boolean) r5, (boolean) r5, (boolean) r5, (boolean) r15)     // Catch:{ all -> 0x0125 }
        L_0x0053:
            if (r16 != 0) goto L_0x006f
            com.applovin.exoplayer2.af r1 = r11.f18643s     // Catch:{ all -> 0x0125 }
            long r3 = r11.f18620L     // Catch:{ all -> 0x0125 }
            long r21 = r24.m22924t()     // Catch:{ all -> 0x0125 }
            r2 = r25
            r15 = -1
            r20 = 4
            r15 = 0
            r5 = r21
            boolean r0 = r1.mo52703a((com.applovin.exoplayer2.C6904ba) r2, (long) r3, (long) r5)     // Catch:{ all -> 0x0122 }
            if (r0 != 0) goto L_0x00a1
            r11.m22908f((boolean) r15)     // Catch:{ all -> 0x0122 }
            goto L_0x00a1
        L_0x006f:
            r15 = 0
            r20 = 4
            boolean r1 = r25.mo53081d()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x00a1
            com.applovin.exoplayer2.af r1 = r11.f18643s     // Catch:{ all -> 0x0122 }
            com.applovin.exoplayer2.ad r1 = r1.mo52707c()     // Catch:{ all -> 0x0122 }
        L_0x007e:
            if (r1 == 0) goto L_0x009c
            com.applovin.exoplayer2.ae r2 = r1.f14748f     // Catch:{ all -> 0x0122 }
            com.applovin.exoplayer2.h.p$a r2 = r2.f14758a     // Catch:{ all -> 0x0122 }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x0122 }
            if (r2 == 0) goto L_0x0097
            com.applovin.exoplayer2.af r2 = r11.f18643s     // Catch:{ all -> 0x0122 }
            com.applovin.exoplayer2.ae r3 = r1.f14748f     // Catch:{ all -> 0x0122 }
            com.applovin.exoplayer2.ae r2 = r2.mo52697a((com.applovin.exoplayer2.C6904ba) r12, (com.applovin.exoplayer2.C6801ae) r3)     // Catch:{ all -> 0x0122 }
            r1.f14748f = r2     // Catch:{ all -> 0x0122 }
            r1.mo52690j()     // Catch:{ all -> 0x0122 }
        L_0x0097:
            com.applovin.exoplayer2.ad r1 = r1.mo52687g()     // Catch:{ all -> 0x0122 }
            goto L_0x007e
        L_0x009c:
            long r0 = r11.m22845a((com.applovin.exoplayer2.p206h.C7509p.C7510a) r8, (long) r13, (boolean) r0)     // Catch:{ all -> 0x0122 }
            r13 = r0
        L_0x00a1:
            com.applovin.exoplayer2.al r0 = r11.f18648x
            com.applovin.exoplayer2.ba r4 = r0.f14811a
            com.applovin.exoplayer2.al r0 = r11.f18648x
            com.applovin.exoplayer2.h.p$a r5 = r0.f14812b
            boolean r0 = r7.f18676f
            if (r0 == 0) goto L_0x00af
            r6 = r13
            goto L_0x00b1
        L_0x00af:
            r6 = r18
        L_0x00b1:
            r1 = r24
            r2 = r25
            r3 = r8
            r1.m22863a(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x00c3
            com.applovin.exoplayer2.al r0 = r11.f18648x
            long r0 = r0.f14813c
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0103
        L_0x00c3:
            com.applovin.exoplayer2.al r0 = r11.f18648x
            com.applovin.exoplayer2.h.p$a r0 = r0.f14812b
            java.lang.Object r0 = r0.f17251a
            com.applovin.exoplayer2.al r1 = r11.f18648x
            com.applovin.exoplayer2.ba r1 = r1.f14811a
            if (r16 == 0) goto L_0x00e4
            if (r26 == 0) goto L_0x00e4
            boolean r2 = r1.mo53081d()
            if (r2 != 0) goto L_0x00e4
            com.applovin.exoplayer2.ba$a r2 = r11.f18636l
            com.applovin.exoplayer2.ba$a r1 = r1.mo52441a((java.lang.Object) r0, (com.applovin.exoplayer2.C6904ba.C6906a) r2)
            boolean r1 = r1.f15261f
            if (r1 != 0) goto L_0x00e4
            r23 = 1
            goto L_0x00e6
        L_0x00e4:
            r23 = 0
        L_0x00e6:
            com.applovin.exoplayer2.al r1 = r11.f18648x
            long r5 = r1.f14814d
            int r0 = r12.mo52448c((java.lang.Object) r0)
            r1 = -1
            if (r0 != r1) goto L_0x00f3
            r17 = 4
        L_0x00f3:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            com.applovin.exoplayer2.al r0 = r1.m22849a(r2, r3, r5, r7, r9, r10)
            r11.f18648x = r0
        L_0x0103:
            r24.m22833A()
            com.applovin.exoplayer2.al r0 = r11.f18648x
            com.applovin.exoplayer2.ba r0 = r0.f14811a
            r11.m22862a((com.applovin.exoplayer2.C6904ba) r12, (com.applovin.exoplayer2.C6904ba) r0)
            com.applovin.exoplayer2.al r0 = r11.f18648x
            com.applovin.exoplayer2.al r0 = r0.mo52732a((com.applovin.exoplayer2.C6904ba) r12)
            r11.f18648x = r0
            boolean r0 = r25.mo53081d()
            if (r0 != 0) goto L_0x011e
            r6 = 0
            r11.f18619K = r6
        L_0x011e:
            r11.m22912h(r15)
            return
        L_0x0122:
            r0 = move-exception
            r6 = 0
            goto L_0x0129
        L_0x0125:
            r0 = move-exception
            r15 = 0
            r20 = 4
        L_0x0129:
            com.applovin.exoplayer2.al r1 = r11.f18648x
            com.applovin.exoplayer2.ba r4 = r1.f14811a
            com.applovin.exoplayer2.al r1 = r11.f18648x
            com.applovin.exoplayer2.h.p$a r5 = r1.f14812b
            boolean r1 = r7.f18676f
            if (r1 == 0) goto L_0x0137
            r18 = r13
        L_0x0137:
            r1 = r24
            r2 = r25
            r3 = r8
            r15 = r6
            r6 = r18
            r1.m22863a(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x014c
            com.applovin.exoplayer2.al r1 = r11.f18648x
            long r1 = r1.f14813c
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x018c
        L_0x014c:
            com.applovin.exoplayer2.al r1 = r11.f18648x
            com.applovin.exoplayer2.h.p$a r1 = r1.f14812b
            java.lang.Object r1 = r1.f17251a
            com.applovin.exoplayer2.al r2 = r11.f18648x
            com.applovin.exoplayer2.ba r2 = r2.f14811a
            if (r16 == 0) goto L_0x016d
            if (r26 == 0) goto L_0x016d
            boolean r3 = r2.mo53081d()
            if (r3 != 0) goto L_0x016d
            com.applovin.exoplayer2.ba$a r3 = r11.f18636l
            com.applovin.exoplayer2.ba$a r2 = r2.mo52441a((java.lang.Object) r1, (com.applovin.exoplayer2.C6904ba.C6906a) r3)
            boolean r2 = r2.f15261f
            if (r2 != 0) goto L_0x016d
            r23 = 1
            goto L_0x016f
        L_0x016d:
            r23 = 0
        L_0x016f:
            com.applovin.exoplayer2.al r2 = r11.f18648x
            long r5 = r2.f14814d
            int r1 = r12.mo52448c((java.lang.Object) r1)
            r2 = -1
            if (r1 != r2) goto L_0x017c
            r17 = 4
        L_0x017c:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            com.applovin.exoplayer2.al r1 = r1.m22849a(r2, r3, r5, r7, r9, r10)
            r11.f18648x = r1
        L_0x018c:
            r24.m22833A()
            com.applovin.exoplayer2.al r1 = r11.f18648x
            com.applovin.exoplayer2.ba r1 = r1.f14811a
            r11.m22862a((com.applovin.exoplayer2.C6904ba) r12, (com.applovin.exoplayer2.C6904ba) r1)
            com.applovin.exoplayer2.al r1 = r11.f18648x
            com.applovin.exoplayer2.al r1 = r1.mo52732a((com.applovin.exoplayer2.C6904ba) r12)
            r11.f18648x = r1
            boolean r1 = r25.mo53081d()
            if (r1 != 0) goto L_0x01a6
            r11.f18619K = r15
        L_0x01a6:
            r1 = 0
            r11.m22912h(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.C7824s.m22865a(com.applovin.exoplayer2.ba, boolean):void");
    }

    /* renamed from: a */
    private synchronized void m22866a(Supplier<Boolean> supplier, long j) {
        long a = this.f18641q.mo54963a() + j;
        boolean z = false;
        while (!supplier.get().booleanValue() && j > 0) {
            try {
                this.f18641q.mo54966c();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = a - this.f18641q.mo54963a();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: a */
    private void m22867a(C7483ad adVar, C7649k kVar) {
        this.f18630f.mo52603a(this.f18625a, adVar, kVar.f17987c);
    }

    /* renamed from: a */
    private void m22868a(C7537z zVar) throws C7819p {
        this.f18649y.mo55263a(1);
        m22865a(this.f18644t.mo52717a(zVar), false);
    }

    /* renamed from: a */
    private void m22869a(C7826a aVar) throws C7819p {
        this.f18649y.mo55263a(1);
        if (aVar.f18654c != -1) {
            this.f18619K = new C7832g(new C6825ap(aVar.f18652a, aVar.f18653b), aVar.f18654c, aVar.f18655d);
        }
        m22865a(this.f18644t.mo52718a((List<C6804ah.C6807c>) aVar.f18652a, aVar.f18653b), false);
    }

    /* renamed from: a */
    private void m22870a(C7826a aVar, int i) throws C7819p {
        this.f18649y.mo55263a(1);
        C6804ah ahVar = this.f18644t;
        if (i == -1) {
            i = ahVar.mo52723b();
        }
        m22865a(ahVar.mo52716a(i, (List<C6804ah.C6807c>) aVar.f18652a, aVar.f18653b), false);
    }

    /* renamed from: a */
    private void m22871a(C7827b bVar) throws C7819p {
        this.f18649y.mo55263a(1);
        m22865a(this.f18644t.mo52714a(bVar.f18656a, bVar.f18657b, bVar.f18658c, bVar.f18659d), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab A[Catch:{ all -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ae A[Catch:{ all -> 0x0152 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22872a(com.applovin.exoplayer2.C7824s.C7832g r20) throws com.applovin.exoplayer2.C7819p {
        /*
            r19 = this;
            r11 = r19
            r0 = r20
            com.applovin.exoplayer2.s$d r1 = r11.f18649y
            r8 = 1
            r1.mo55263a((int) r8)
            com.applovin.exoplayer2.al r1 = r11.f18648x
            com.applovin.exoplayer2.ba r1 = r1.f14811a
            int r4 = r11.f18613E
            boolean r5 = r11.f18614F
            com.applovin.exoplayer2.ba$c r6 = r11.f18635k
            com.applovin.exoplayer2.ba$a r7 = r11.f18636l
            r3 = 1
            r2 = r20
            android.util.Pair r1 = m22848a((com.applovin.exoplayer2.C6904ba) r1, (com.applovin.exoplayer2.C7824s.C7832g) r2, (boolean) r3, (int) r4, (boolean) r5, (com.applovin.exoplayer2.C6904ba.C6908c) r6, (com.applovin.exoplayer2.C6904ba.C6906a) r7)
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x004b
            com.applovin.exoplayer2.al r7 = r11.f18648x
            com.applovin.exoplayer2.ba r7 = r7.f14811a
            android.util.Pair r7 = r11.m22847a((com.applovin.exoplayer2.C6904ba) r7)
            java.lang.Object r9 = r7.first
            com.applovin.exoplayer2.h.p$a r9 = (com.applovin.exoplayer2.p206h.C7509p.C7510a) r9
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            com.applovin.exoplayer2.al r7 = r11.f18648x
            com.applovin.exoplayer2.ba r7 = r7.f14811a
            boolean r7 = r7.mo53081d()
            r7 = r7 ^ r8
            r10 = r7
            r17 = r4
        L_0x0047:
            r4 = r12
            r12 = r17
            goto L_0x00a1
        L_0x004b:
            java.lang.Object r7 = r1.first
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r9 = r0.f18679c
            int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x005d
            r9 = r4
            goto L_0x005e
        L_0x005d:
            r9 = r12
        L_0x005e:
            com.applovin.exoplayer2.af r14 = r11.f18643s
            com.applovin.exoplayer2.al r15 = r11.f18648x
            com.applovin.exoplayer2.ba r15 = r15.f14811a
            com.applovin.exoplayer2.h.p$a r7 = r14.mo52698a((com.applovin.exoplayer2.C6904ba) r15, (java.lang.Object) r7, (long) r12)
            boolean r14 = r7.mo54546a()
            if (r14 == 0) goto L_0x0093
            com.applovin.exoplayer2.al r4 = r11.f18648x
            com.applovin.exoplayer2.ba r4 = r4.f14811a
            java.lang.Object r5 = r7.f17251a
            com.applovin.exoplayer2.ba$a r12 = r11.f18636l
            r4.mo52441a((java.lang.Object) r5, (com.applovin.exoplayer2.C6904ba.C6906a) r12)
            com.applovin.exoplayer2.ba$a r4 = r11.f18636l
            int r5 = r7.f17252b
            int r4 = r4.mo53090b((int) r5)
            int r5 = r7.f17253c
            if (r4 != r5) goto L_0x008d
            com.applovin.exoplayer2.ba$a r4 = r11.f18636l
            long r4 = r4.mo53101f()
            r12 = r4
            goto L_0x008e
        L_0x008d:
            r12 = r2
        L_0x008e:
            r4 = r12
            r12 = r9
            r10 = 1
            r9 = r7
            goto L_0x00a1
        L_0x0093:
            long r14 = r0.f18679c
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x009b
            r4 = 1
            goto L_0x009c
        L_0x009b:
            r4 = 0
        L_0x009c:
            r17 = r9
            r10 = r4
            r9 = r7
            goto L_0x0047
        L_0x00a1:
            com.applovin.exoplayer2.al r7 = r11.f18648x     // Catch:{ all -> 0x0152 }
            com.applovin.exoplayer2.ba r7 = r7.f14811a     // Catch:{ all -> 0x0152 }
            boolean r7 = r7.mo53081d()     // Catch:{ all -> 0x0152 }
            if (r7 == 0) goto L_0x00ae
            r11.f18619K = r0     // Catch:{ all -> 0x0152 }
            goto L_0x00bd
        L_0x00ae:
            r0 = 4
            if (r1 != 0) goto L_0x00c0
            com.applovin.exoplayer2.al r1 = r11.f18648x     // Catch:{ all -> 0x0152 }
            int r1 = r1.f14815e     // Catch:{ all -> 0x0152 }
            if (r1 == r8) goto L_0x00ba
            r11.m22885b((int) r0)     // Catch:{ all -> 0x0152 }
        L_0x00ba:
            r11.m22877a((boolean) r6, (boolean) r8, (boolean) r6, (boolean) r8)     // Catch:{ all -> 0x0152 }
        L_0x00bd:
            r7 = r4
            goto L_0x013f
        L_0x00c0:
            com.applovin.exoplayer2.al r1 = r11.f18648x     // Catch:{ all -> 0x0152 }
            com.applovin.exoplayer2.h.p$a r1 = r1.f14812b     // Catch:{ all -> 0x0152 }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x0152 }
            if (r1 == 0) goto L_0x0115
            com.applovin.exoplayer2.af r1 = r11.f18643s     // Catch:{ all -> 0x0152 }
            com.applovin.exoplayer2.ad r1 = r1.mo52707c()     // Catch:{ all -> 0x0152 }
            if (r1 == 0) goto L_0x00e3
            boolean r7 = r1.f14746d     // Catch:{ all -> 0x0152 }
            if (r7 == 0) goto L_0x00e3
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x00e3
            com.applovin.exoplayer2.h.n r1 = r1.f14743a     // Catch:{ all -> 0x0152 }
            com.applovin.exoplayer2.av r2 = r11.f18647w     // Catch:{ all -> 0x0152 }
            long r1 = r1.mo54493a((long) r4, (com.applovin.exoplayer2.C6832av) r2)     // Catch:{ all -> 0x0152 }
            goto L_0x00e4
        L_0x00e3:
            r1 = r4
        L_0x00e4:
            long r14 = com.applovin.exoplayer2.C7476h.m20797a((long) r1)     // Catch:{ all -> 0x0152 }
            com.applovin.exoplayer2.al r3 = r11.f18648x     // Catch:{ all -> 0x0152 }
            long r6 = r3.f14829s     // Catch:{ all -> 0x0152 }
            long r6 = com.applovin.exoplayer2.C7476h.m20797a((long) r6)     // Catch:{ all -> 0x0152 }
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0116
            com.applovin.exoplayer2.al r3 = r11.f18648x     // Catch:{ all -> 0x0152 }
            int r3 = r3.f14815e     // Catch:{ all -> 0x0152 }
            r6 = 2
            if (r3 == r6) goto L_0x0102
            com.applovin.exoplayer2.al r3 = r11.f18648x     // Catch:{ all -> 0x0152 }
            int r3 = r3.f14815e     // Catch:{ all -> 0x0152 }
            r6 = 3
            if (r3 != r6) goto L_0x0116
        L_0x0102:
            com.applovin.exoplayer2.al r0 = r11.f18648x     // Catch:{ all -> 0x0152 }
            long r7 = r0.f14829s     // Catch:{ all -> 0x0152 }
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            com.applovin.exoplayer2.al r0 = r1.m22849a(r2, r3, r5, r7, r9, r10)
            r11.f18648x = r0
            return
        L_0x0115:
            r1 = r4
        L_0x0116:
            com.applovin.exoplayer2.al r3 = r11.f18648x     // Catch:{ all -> 0x0152 }
            int r3 = r3.f14815e     // Catch:{ all -> 0x0152 }
            if (r3 != r0) goto L_0x011e
            r0 = 1
            goto L_0x011f
        L_0x011e:
            r0 = 0
        L_0x011f:
            long r14 = r11.m22845a((com.applovin.exoplayer2.p206h.C7509p.C7510a) r9, (long) r1, (boolean) r0)     // Catch:{ all -> 0x0152 }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0128
            goto L_0x0129
        L_0x0128:
            r8 = 0
        L_0x0129:
            r8 = r8 | r10
            com.applovin.exoplayer2.al r0 = r11.f18648x     // Catch:{ all -> 0x014e }
            com.applovin.exoplayer2.ba r2 = r0.f14811a     // Catch:{ all -> 0x014e }
            com.applovin.exoplayer2.al r0 = r11.f18648x     // Catch:{ all -> 0x014e }
            com.applovin.exoplayer2.ba r4 = r0.f14811a     // Catch:{ all -> 0x014e }
            com.applovin.exoplayer2.al r0 = r11.f18648x     // Catch:{ all -> 0x014e }
            com.applovin.exoplayer2.h.p$a r5 = r0.f14812b     // Catch:{ all -> 0x014e }
            r1 = r19
            r3 = r9
            r6 = r12
            r1.m22863a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x014e }
            r10 = r8
            r7 = r14
        L_0x013f:
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            com.applovin.exoplayer2.al r0 = r1.m22849a(r2, r3, r5, r7, r9, r10)
            r11.f18648x = r0
            return
        L_0x014e:
            r0 = move-exception
            r10 = r8
            r7 = r14
            goto L_0x0154
        L_0x0152:
            r0 = move-exception
            r7 = r4
        L_0x0154:
            r14 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r14
            com.applovin.exoplayer2.al r1 = r1.m22849a(r2, r3, r5, r7, r9, r10)
            r11.f18648x = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.C7824s.m22872a(com.applovin.exoplayer2.s$g):void");
    }

    /* renamed from: a */
    private void m22873a(IOException iOException, int i) {
        C7819p a = C7819p.m22725a(iOException, i);
        C6800ad c = this.f18643s.mo52707c();
        if (c != null) {
            a = a.mo55232a((C7508o) c.f14748f.f14758a);
        }
        C7755q.m22362c("ExoPlayerImplInternal", "Playback error", a);
        m22876a(false, false);
        this.f18648x = this.f18648x.mo52735a(a);
    }

    /* renamed from: a */
    private void m22874a(boolean z, int i, boolean z2, int i2) throws C7819p {
        this.f18649y.mo55263a(z2 ? 1 : 0);
        this.f18649y.mo55266c(i2);
        this.f18648x = this.f18648x.mo52737a(z, i);
        this.f18611C = false;
        m22891b(z);
        if (!m22842J()) {
            m22914j();
            m22916l();
            return;
        }
        if (this.f18648x.f14815e == 3) {
            m22913i();
        } else if (this.f18648x.f14815e != 2) {
            return;
        }
        this.f18632h.mo54976c(2);
    }

    /* renamed from: a */
    private void m22875a(boolean z, AtomicBoolean atomicBoolean) {
        if (this.f18615G != z) {
            this.f18615G = z;
            if (!z) {
                for (C6827ar arVar : this.f18625a) {
                    if (!m22899c(arVar) && this.f18626b.remove(arVar)) {
                        arVar.mo52845n();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: a */
    private void m22876a(boolean z, boolean z2) {
        m22877a(z || !this.f18615G, false, true, false);
        this.f18649y.mo55263a(z2 ? 1 : 0);
        this.f18630f.mo52606b();
        m22885b(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22877a(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            r34 = this;
            r1 = r34
            com.applovin.exoplayer2.l.o r0 = r1.f18632h
            r2 = 2
            r0.mo54977d(r2)
            r2 = 0
            r1.f18623O = r2
            r3 = 0
            r1.f18611C = r3
            com.applovin.exoplayer2.m r0 = r1.f18639o
            r0.mo55116b()
            r4 = 0
            r1.f18620L = r4
            com.applovin.exoplayer2.ar[] r4 = r1.f18625a
            int r5 = r4.length
            r6 = 0
        L_0x001b:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r5) goto L_0x0030
            r0 = r4[r6]
            r1.m22890b((com.applovin.exoplayer2.C6827ar) r0)     // Catch:{ p -> 0x0027, RuntimeException -> 0x0025 }
            goto L_0x002d
        L_0x0025:
            r0 = move-exception
            goto L_0x0028
        L_0x0027:
            r0 = move-exception
        L_0x0028:
            java.lang.String r8 = "Disable failed."
            com.applovin.exoplayer2.p221l.C7755q.m22362c(r7, r8, r0)
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0030:
            if (r35 == 0) goto L_0x0050
            com.applovin.exoplayer2.ar[] r4 = r1.f18625a
            int r5 = r4.length
            r6 = 0
        L_0x0036:
            if (r6 >= r5) goto L_0x0050
            r0 = r4[r6]
            java.util.Set<com.applovin.exoplayer2.ar> r8 = r1.f18626b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x004d
            r0.mo52845n()     // Catch:{ RuntimeException -> 0x0046 }
            goto L_0x004d
        L_0x0046:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            com.applovin.exoplayer2.p221l.C7755q.m22362c(r7, r0, r8)
        L_0x004d:
            int r6 = r6 + 1
            goto L_0x0036
        L_0x0050:
            r1.f18618J = r3
            com.applovin.exoplayer2.al r0 = r1.f18648x
            com.applovin.exoplayer2.h.p$a r0 = r0.f14812b
            com.applovin.exoplayer2.al r4 = r1.f18648x
            long r4 = r4.f14829s
            com.applovin.exoplayer2.al r6 = r1.f18648x
            com.applovin.exoplayer2.h.p$a r6 = r6.f14812b
            boolean r6 = r6.mo54546a()
            if (r6 != 0) goto L_0x0074
            com.applovin.exoplayer2.al r6 = r1.f18648x
            com.applovin.exoplayer2.ba$a r7 = r1.f18636l
            boolean r6 = m22879a((com.applovin.exoplayer2.C6812al) r6, (com.applovin.exoplayer2.C6904ba.C6906a) r7)
            if (r6 == 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            com.applovin.exoplayer2.al r6 = r1.f18648x
            long r6 = r6.f14829s
            goto L_0x0078
        L_0x0074:
            com.applovin.exoplayer2.al r6 = r1.f18648x
            long r6 = r6.f14813c
        L_0x0078:
            if (r36 == 0) goto L_0x00ac
            r1.f18619K = r2
            com.applovin.exoplayer2.al r0 = r1.f18648x
            com.applovin.exoplayer2.ba r0 = r0.f14811a
            android.util.Pair r0 = r1.m22847a((com.applovin.exoplayer2.C6904ba) r0)
            java.lang.Object r4 = r0.first
            com.applovin.exoplayer2.h.p$a r4 = (com.applovin.exoplayer2.p206h.C7509p.C7510a) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.applovin.exoplayer2.al r0 = r1.f18648x
            com.applovin.exoplayer2.h.p$a r0 = r0.f14812b
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a6
            r0 = 1
            r22 = r4
            r30 = r5
            r12 = r7
            goto L_0x00b2
        L_0x00a6:
            r22 = r4
            r30 = r5
            r12 = r7
            goto L_0x00b1
        L_0x00ac:
            r22 = r0
            r30 = r4
            r12 = r6
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            com.applovin.exoplayer2.af r4 = r1.f18643s
            r4.mo52711g()
            r1.f18612D = r3
            com.applovin.exoplayer2.al r3 = new com.applovin.exoplayer2.al
            com.applovin.exoplayer2.al r4 = r1.f18648x
            com.applovin.exoplayer2.ba r10 = r4.f14811a
            com.applovin.exoplayer2.al r4 = r1.f18648x
            int r4 = r4.f14815e
            if (r38 == 0) goto L_0x00c6
            goto L_0x00ca
        L_0x00c6:
            com.applovin.exoplayer2.al r2 = r1.f18648x
            com.applovin.exoplayer2.p r2 = r2.f14816f
        L_0x00ca:
            r17 = r2
            r18 = 0
            if (r0 == 0) goto L_0x00d3
            com.applovin.exoplayer2.h.ad r2 = com.applovin.exoplayer2.p206h.C7483ad.f17172a
            goto L_0x00d7
        L_0x00d3:
            com.applovin.exoplayer2.al r2 = r1.f18648x
            com.applovin.exoplayer2.h.ad r2 = r2.f14818h
        L_0x00d7:
            r19 = r2
            if (r0 == 0) goto L_0x00de
            com.applovin.exoplayer2.j.k r2 = r1.f18629e
            goto L_0x00e2
        L_0x00de:
            com.applovin.exoplayer2.al r2 = r1.f18648x
            com.applovin.exoplayer2.j.k r2 = r2.f14819i
        L_0x00e2:
            r20 = r2
            if (r0 == 0) goto L_0x00eb
            com.applovin.exoplayer2.common.a.s r0 = com.applovin.exoplayer2.common.p183a.C7033s.m18803g()
            goto L_0x00ef
        L_0x00eb:
            com.applovin.exoplayer2.al r0 = r1.f18648x
            java.util.List<com.applovin.exoplayer2.g.a> r0 = r0.f14820j
        L_0x00ef:
            r21 = r0
            com.applovin.exoplayer2.al r0 = r1.f18648x
            boolean r0 = r0.f14822l
            r23 = r0
            com.applovin.exoplayer2.al r0 = r1.f18648x
            int r0 = r0.f14823m
            r24 = r0
            com.applovin.exoplayer2.al r0 = r1.f18648x
            com.applovin.exoplayer2.am r0 = r0.f14824n
            r25 = r0
            r28 = 0
            boolean r0 = r1.f18617I
            r32 = r0
            r33 = 0
            r9 = r3
            r11 = r22
            r14 = r30
            r16 = r4
            r26 = r30
            r9.<init>(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r33)
            r1.f18648x = r3
            if (r37 == 0) goto L_0x0120
            com.applovin.exoplayer2.ah r0 = r1.f18644t
            r0.mo52724c()
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.C7824s.m22877a(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: a */
    private void m22878a(boolean[] zArr) throws C7819p {
        C6800ad d = this.f18643s.mo52708d();
        C7649k i = d.mo52689i();
        for (int i2 = 0; i2 < this.f18625a.length; i2++) {
            if (!i.mo54868a(i2) && this.f18626b.remove(this.f18625a[i2])) {
                this.f18625a[i2].mo52845n();
            }
        }
        for (int i3 = 0; i3 < this.f18625a.length; i3++) {
            if (i.mo54868a(i3)) {
                m22855a(i3, zArr[i3]);
            }
        }
        d.f14749g = true;
    }

    /* renamed from: a */
    private static boolean m22879a(C6812al alVar, C6904ba.C6906a aVar) {
        C7509p.C7510a aVar2 = alVar.f14812b;
        C6904ba baVar = alVar.f14811a;
        return baVar.mo53081d() || baVar.mo52441a(aVar2.f17251a, aVar).f15261f;
    }

    /* renamed from: a */
    private boolean m22880a(C6827ar arVar, C6800ad adVar) {
        C6800ad g = adVar.mo52687g();
        return adVar.f14748f.f14763f && g.f14746d && ((arVar instanceof C7622m) || arVar.mo52839h() >= g.mo52677b());
    }

    /* renamed from: a */
    private boolean m22881a(C6904ba baVar, C7509p.C7510a aVar) {
        if (aVar.mo54546a() || baVar.mo53081d()) {
            return false;
        }
        baVar.mo53079a(baVar.mo52441a(aVar.f17251a, this.f18636l).f15258c, this.f18635k);
        return this.f18635k.mo53109e() && this.f18635k.f15279j && this.f18635k.f15276g != -9223372036854775807L;
    }

    /* renamed from: a */
    private static boolean m22882a(C7828c cVar, C6904ba baVar, C6904ba baVar2, int i, boolean z, C6904ba.C6908c cVar2, C6904ba.C6906a aVar) {
        C7828c cVar3 = cVar;
        C6904ba baVar3 = baVar;
        C6904ba baVar4 = baVar2;
        C6904ba.C6908c cVar4 = cVar2;
        C6904ba.C6906a aVar2 = aVar;
        if (cVar3.f18663d == null) {
            Pair<Object, Long> a = m22848a(baVar, new C7832g(cVar3.f18660a.mo52808a(), cVar3.f18660a.mo52816g(), cVar3.f18660a.mo52815f() == Long.MIN_VALUE ? -9223372036854775807L : C7476h.m20800b(cVar3.f18660a.mo52815f())), false, i, z, cVar2, aVar);
            if (a == null) {
                return false;
            }
            cVar.mo55261a(baVar3.mo52448c(a.first), ((Long) a.second).longValue(), a.first);
            if (cVar3.f18660a.mo52815f() == Long.MIN_VALUE) {
                m22864a(baVar3, cVar, cVar4, aVar2);
            }
            return true;
        }
        int c = baVar3.mo52448c(cVar3.f18663d);
        if (c == -1) {
            return false;
        }
        if (cVar3.f18660a.mo52815f() == Long.MIN_VALUE) {
            m22864a(baVar3, cVar, cVar4, aVar2);
            return true;
        }
        cVar3.f18661b = c;
        baVar4.mo52441a(cVar3.f18663d, aVar2);
        if (aVar2.f15261f && baVar4.mo53079a(aVar2.f15258c, cVar4).f15285p == baVar4.mo52448c(cVar3.f18663d)) {
            Pair<Object, Long> a2 = baVar.mo53076a(cVar2, aVar, baVar3.mo52441a(cVar3.f18663d, aVar2).f15258c, cVar3.f18662c + aVar.mo53094c());
            cVar.mo55261a(baVar3.mo52448c(a2.first), ((Long) a2.second).longValue(), a2.first);
        }
        return true;
    }

    /* renamed from: a */
    private static C7864v[] m22884a(C7637d dVar) {
        int e = dVar != null ? dVar.mo54810e() : 0;
        C7864v[] vVarArr = new C7864v[e];
        for (int i = 0; i < e; i++) {
            vVarArr[i] = dVar.mo54806a(i);
        }
        return vVarArr;
    }

    /* renamed from: b */
    private void m22885b(int i) {
        if (this.f18648x.f14815e != i) {
            this.f18648x = this.f18648x.mo52730a(i);
        }
    }

    /* renamed from: b */
    private void m22886b(int i, int i2, C7537z zVar) throws C7819p {
        this.f18649y.mo55263a(1);
        m22865a(this.f18644t.mo52715a(i, i2, zVar), false);
    }

    /* renamed from: b */
    private void m22887b(long j) throws C7819p {
        C6800ad c = this.f18643s.mo52707c();
        if (c != null) {
            j = c.mo52672a(j);
        }
        this.f18620L = j;
        this.f18639o.mo55114a(j);
        for (C6827ar arVar : this.f18625a) {
            if (m22899c(arVar)) {
                arVar.mo52829a(this.f18620L);
            }
        }
        m22922r();
    }

    /* renamed from: b */
    private void m22888b(C6813am amVar) throws C7819p {
        this.f18639o.mo53045a(amVar);
        m22858a(this.f18639o.mo53055d(), true);
    }

    /* renamed from: b */
    private void m22889b(C6822ao aoVar) throws C7819p {
        if (aoVar.mo52815f() == -9223372036854775807L) {
            m22896c(aoVar);
        } else if (this.f18648x.f14811a.mo53081d()) {
            this.f18640p.add(new C7828c(aoVar));
        } else {
            C7828c cVar = new C7828c(aoVar);
            if (m22882a(cVar, this.f18648x.f14811a, this.f18648x.f14811a, this.f18613E, this.f18614F, this.f18635k, this.f18636l)) {
                this.f18640p.add(cVar);
                Collections.sort(this.f18640p);
                return;
            }
            aoVar.mo52809a(false);
        }
    }

    /* renamed from: b */
    private void m22890b(C6827ar arVar) throws C7819p {
        if (m22899c(arVar)) {
            this.f18639o.mo55117b(arVar);
            m22859a(arVar);
            arVar.mo52844m();
            this.f18618J--;
        }
    }

    /* renamed from: b */
    private void m22891b(boolean z) {
        for (C6800ad c = this.f18643s.mo52707c(); c != null; c = c.mo52687g()) {
            for (C7637d dVar : c.mo52689i().f17987c) {
                if (dVar != null) {
                    dVar.mo54807a(z);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m22892b(long j, long j2) {
        if (this.f18617I && this.f18616H) {
            return false;
        }
        m22856a(j, j2);
        return true;
    }

    /* renamed from: c */
    private void m22893c(int i) throws C7819p {
        this.f18613E = i;
        if (!this.f18643s.mo52702a(this.f18648x.f14811a, i)) {
            m22908f(true);
        }
        m22912h(false);
    }

    /* renamed from: c */
    private void m22894c(long j) {
        for (C6827ar arVar : this.f18625a) {
            if (arVar.mo52837f() != null) {
                m22860a(arVar, j);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r3 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r3.f18661b > r0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r3.f18661b != r0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r3.f18662c <= r8) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r1 <= 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r1 >= r7.f18640p.size()) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        r3 = r7.f18640p.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r3 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (r3.f18663d == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r3.f18661b < r0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r3.f18661b != r0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (r3.f18662c > r8) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (r1 >= r7.f18640p.size()) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (r3 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        if (r3.f18663d == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        if (r3.f18661b != r0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        if (r3.f18662c <= r8) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
        if (r3.f18662c > r10) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        m22896c(r3.f18660a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        if (r3.f18660a.mo52817h() != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        if (r3.f18660a.mo52819j() == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b9, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        r7.f18640p.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        if (r1 >= r7.f18640p.size()) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c9, code lost:
        r3 = r7.f18640p.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d2, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d4, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e5, code lost:
        r7.f18640p.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ea, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        r7.f18621M = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (r1 > 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        r3 = r7.f18640p.get(r1 - 1);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22895c(long r8, long r10) throws com.applovin.exoplayer2.C7819p {
        /*
            r7 = this;
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r0 = r7.f18640p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ed
            com.applovin.exoplayer2.al r0 = r7.f18648x
            com.applovin.exoplayer2.h.p$a r0 = r0.f14812b
            boolean r0 = r0.mo54546a()
            if (r0 == 0) goto L_0x0014
            goto L_0x00ed
        L_0x0014:
            boolean r0 = r7.f18622N
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r8 = r8 - r0
            r0 = 0
            r7.f18622N = r0
        L_0x001e:
            com.applovin.exoplayer2.al r0 = r7.f18648x
            com.applovin.exoplayer2.ba r0 = r0.f14811a
            com.applovin.exoplayer2.al r1 = r7.f18648x
            com.applovin.exoplayer2.h.p$a r1 = r1.f14812b
            java.lang.Object r1 = r1.f17251a
            int r0 = r0.mo52448c((java.lang.Object) r1)
            int r1 = r7.f18621M
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r2 = r7.f18640p
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0046
        L_0x003b:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.f18640p
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            com.applovin.exoplayer2.s$c r3 = (com.applovin.exoplayer2.C7824s.C7828c) r3
            goto L_0x0047
        L_0x0046:
            r3 = r2
        L_0x0047:
            if (r3 == 0) goto L_0x005c
            int r4 = r3.f18661b
            if (r4 > r0) goto L_0x0057
            int r4 = r3.f18661b
            if (r4 != r0) goto L_0x005c
            long r3 = r3.f18662c
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x005c
        L_0x0057:
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x0046
            goto L_0x003b
        L_0x005c:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.f18640p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x006d
        L_0x0064:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.f18640p
            java.lang.Object r3 = r3.get(r1)
            com.applovin.exoplayer2.s$c r3 = (com.applovin.exoplayer2.C7824s.C7828c) r3
            goto L_0x006e
        L_0x006d:
            r3 = r2
        L_0x006e:
            if (r3 == 0) goto L_0x008d
            java.lang.Object r4 = r3.f18663d
            if (r4 == 0) goto L_0x008d
            int r4 = r3.f18661b
            if (r4 < r0) goto L_0x0082
            int r4 = r3.f18661b
            if (r4 != r0) goto L_0x008d
            long r4 = r3.f18662c
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x008d
        L_0x0082:
            int r1 = r1 + 1
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.f18640p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x006d
            goto L_0x0064
        L_0x008d:
            if (r3 == 0) goto L_0x00eb
            java.lang.Object r4 = r3.f18663d
            if (r4 == 0) goto L_0x00eb
            int r4 = r3.f18661b
            if (r4 != r0) goto L_0x00eb
            long r4 = r3.f18662c
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00eb
            long r4 = r3.f18662c
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x00eb
            com.applovin.exoplayer2.ao r4 = r3.f18660a     // Catch:{ all -> 0x00d4 }
            r7.m22896c((com.applovin.exoplayer2.C6822ao) r4)     // Catch:{ all -> 0x00d4 }
            com.applovin.exoplayer2.ao r4 = r3.f18660a
            boolean r4 = r4.mo52817h()
            if (r4 != 0) goto L_0x00bc
            com.applovin.exoplayer2.ao r3 = r3.f18660a
            boolean r3 = r3.mo52819j()
            if (r3 == 0) goto L_0x00b9
            goto L_0x00bc
        L_0x00b9:
            int r1 = r1 + 1
            goto L_0x00c1
        L_0x00bc:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.f18640p
            r3.remove(r1)
        L_0x00c1:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.f18640p
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00d2
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r3 = r7.f18640p
            java.lang.Object r3 = r3.get(r1)
            com.applovin.exoplayer2.s$c r3 = (com.applovin.exoplayer2.C7824s.C7828c) r3
            goto L_0x008d
        L_0x00d2:
            r3 = r2
            goto L_0x008d
        L_0x00d4:
            r8 = move-exception
            com.applovin.exoplayer2.ao r9 = r3.f18660a
            boolean r9 = r9.mo52817h()
            if (r9 != 0) goto L_0x00e5
            com.applovin.exoplayer2.ao r9 = r3.f18660a
            boolean r9 = r9.mo52819j()
            if (r9 == 0) goto L_0x00ea
        L_0x00e5:
            java.util.ArrayList<com.applovin.exoplayer2.s$c> r9 = r7.f18640p
            r9.remove(r1)
        L_0x00ea:
            throw r8
        L_0x00eb:
            r7.f18621M = r1
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.C7824s.m22895c(long, long):void");
    }

    /* renamed from: c */
    private void m22896c(C6822ao aoVar) throws C7819p {
        if (aoVar.mo52814e() == this.f18634j) {
            m22904e(aoVar);
            if (this.f18648x.f14815e == 3 || this.f18648x.f14815e == 2) {
                this.f18632h.mo54976c(2);
                return;
            }
            return;
        }
        this.f18632h.mo54969a(15, (Object) aoVar).mo54979a();
    }

    /* renamed from: c */
    private void m22897c(C7506n nVar) throws C7819p {
        if (this.f18643s.mo52705a(nVar)) {
            C6800ad b = this.f18643s.mo52706b();
            b.mo52675a(this.f18639o.mo53055d().f14832b, this.f18648x.f14811a);
            m22867a(b.mo52688h(), b.mo52689i());
            if (b == this.f18643s.mo52707c()) {
                m22887b(b.f14748f.f14759b);
                m22840H();
                this.f18648x = m22849a(this.f18648x.f14812b, b.f14748f.f14759b, this.f18648x.f14813c, b.f14748f.f14759b, false, 5);
            }
            m22836D();
        }
    }

    /* renamed from: c */
    private void m22898c(boolean z) throws C7819p {
        this.f18609A = z;
        m22833A();
        if (this.f18610B && this.f18643s.mo52708d() != this.f18643s.mo52707c()) {
            m22908f(true);
            m22912h(false);
        }
    }

    /* renamed from: c */
    private static boolean m22899c(C6827ar arVar) {
        return arVar.mo52835d_() != 0;
    }

    /* renamed from: d */
    private long m22900d(long j) {
        C6800ad b = this.f18643s.mo52706b();
        if (b == null) {
            return 0;
        }
        return Math.max(0, j - b.mo52678b(this.f18620L));
    }

    /* renamed from: d */
    private void m22901d(C6822ao aoVar) {
        Looper e = aoVar.mo52814e();
        if (!e.getThread().isAlive()) {
            C7755q.m22361c("TAG", "Trying to send message on a dead thread.");
            aoVar.mo52809a(false);
            return;
        }
        this.f18641q.mo54964a(e, (Handler.Callback) null).mo54974a((Runnable) new Runnable(aoVar) {
            public final /* synthetic */ C6822ao f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7824s.this.m22907f(this.f$1);
            }
        });
    }

    /* renamed from: d */
    private void m22902d(C7506n nVar) {
        if (this.f18643s.mo52705a(nVar)) {
            this.f18643s.mo52699a(this.f18620L);
            m22836D();
        }
    }

    /* renamed from: d */
    private void m22903d(boolean z) {
        if (z != this.f18617I) {
            this.f18617I = z;
            int i = this.f18648x.f14815e;
            if (z || i == 4 || i == 1) {
                this.f18648x = this.f18648x.mo52738b(z);
            } else {
                this.f18632h.mo54976c(2);
            }
        }
    }

    /* renamed from: e */
    private void m22904e(C6822ao aoVar) throws C7819p {
        if (!aoVar.mo52819j()) {
            try {
                aoVar.mo52811b().mo52821a(aoVar.mo52812c(), aoVar.mo52813d());
            } finally {
                aoVar.mo52809a(true);
            }
        }
    }

    /* renamed from: e */
    private void m22905e(boolean z) throws C7819p {
        this.f18614F = z;
        if (!this.f18643s.mo52704a(this.f18648x.f14811a, z)) {
            m22908f(true);
        }
        m22912h(false);
    }

    /* renamed from: f */
    private void m22906f() {
        this.f18649y.mo55264a(this.f18648x);
        if (this.f18649y.f18670g) {
            this.f18642r.onPlaybackInfoUpdate(this.f18649y);
            this.f18649y = new C7829d(this.f18648x);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m22907f(C6822ao aoVar) {
        try {
            m22904e(aoVar);
        } catch (C7819p e) {
            C7755q.m22362c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    private void m22908f(boolean z) throws C7819p {
        C7509p.C7510a aVar = this.f18643s.mo52707c().f14748f.f14758a;
        long a = m22846a(aVar, this.f18648x.f14829s, true, false);
        if (a != this.f18648x.f14829s) {
            this.f18648x = m22849a(aVar, a, this.f18648x.f14813c, this.f18648x.f14814d, z, 5);
        }
    }

    /* renamed from: g */
    private void m22909g() {
        this.f18649y.mo55263a(1);
        m22877a(false, false, false, true);
        this.f18630f.mo52602a();
        m22885b(this.f18648x.f14811a.mo53081d() ? 4 : 2);
        this.f18644t.mo52721a(this.f18631g.mo54890a());
        this.f18632h.mo54976c(2);
    }

    /* renamed from: g */
    private boolean m22910g(boolean z) {
        if (this.f18618J == 0) {
            return m22923s();
        }
        if (!z) {
            return false;
        }
        if (!this.f18648x.f14817g) {
            return true;
        }
        long b = m22881a(this.f18648x.f14811a, this.f18643s.mo52707c().f14748f.f14758a) ? this.f18645u.mo54875b() : -9223372036854775807L;
        C6800ad b2 = this.f18643s.mo52706b();
        return (b2.mo52681c() && b2.f14748f.f14766i) || (b2.f14748f.f14758a.mo54546a() && !b2.f14746d) || this.f18630f.mo52604a(m22841I(), this.f18639o.mo53055d().f14832b, this.f18611C, b);
    }

    /* renamed from: h */
    private void m22911h() throws C7819p {
        m22865a(this.f18644t.mo52725d(), true);
    }

    /* renamed from: h */
    private void m22912h(boolean z) {
        C6800ad b = this.f18643s.mo52706b();
        C7509p.C7510a aVar = b == null ? this.f18648x.f14812b : b.f14748f.f14758a;
        boolean z2 = !this.f18648x.f14821k.equals(aVar);
        if (z2) {
            this.f18648x = this.f18648x.mo52733a(aVar);
        }
        C6812al alVar = this.f18648x;
        alVar.f14827q = b == null ? alVar.f14829s : b.mo52682d();
        this.f18648x.f14828r = m22841I();
        if ((z2 || z) && b != null && b.f14746d) {
            m22867a(b.mo52688h(), b.mo52689i());
        }
    }

    /* renamed from: i */
    private void m22913i() throws C7819p {
        this.f18611C = false;
        this.f18639o.mo55113a();
        for (C6827ar arVar : this.f18625a) {
            if (m22899c(arVar)) {
                arVar.mo52836e();
            }
        }
    }

    /* renamed from: j */
    private void m22914j() throws C7819p {
        this.f18639o.mo55116b();
        for (C6827ar arVar : this.f18625a) {
            if (m22899c(arVar)) {
                m22859a(arVar);
            }
        }
    }

    /* renamed from: k */
    private void m22915k() throws C7819p {
        m22908f(true);
    }

    /* renamed from: l */
    private void m22916l() throws C7819p {
        C6800ad c = this.f18643s.mo52707c();
        if (c != null) {
            long c2 = c.f14746d ? c.f14743a.mo54504c() : -9223372036854775807L;
            if (c2 != -9223372036854775807L) {
                m22887b(c2);
                if (c2 != this.f18648x.f14829s) {
                    this.f18648x = m22849a(this.f18648x.f14812b, c2, this.f18648x.f14813c, c2, true, 5);
                }
            } else {
                long a = this.f18639o.mo55112a(c != this.f18643s.mo52708d());
                this.f18620L = a;
                long b = c.mo52678b(a);
                m22895c(this.f18648x.f14829s, b);
                this.f18648x.f14829s = b;
            }
            this.f18648x.f14827q = this.f18643s.mo52706b().mo52682d();
            this.f18648x.f14828r = m22841I();
            if (this.f18648x.f14822l && this.f18648x.f14815e == 3 && m22881a(this.f18648x.f14811a, this.f18648x.f14812b) && this.f18648x.f14824n.f14832b == 1.0f) {
                float a2 = this.f18645u.mo54871a(m22919o(), m22841I());
                if (this.f18639o.mo53055d().f14832b != a2) {
                    this.f18639o.mo53045a(this.f18648x.f14824n.mo52741a(a2));
                    m22857a(this.f18648x.f14824n, this.f18639o.mo53055d().f14832b, false, false);
                }
            }
        }
    }

    /* renamed from: m */
    private void m22917m() {
        for (C6800ad c = this.f18643s.mo52707c(); c != null; c = c.mo52687g()) {
            for (C7637d dVar : c.mo52689i().f17987c) {
                if (dVar != null) {
                    dVar.mo54814h();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013c  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22918n() throws com.applovin.exoplayer2.C7819p, java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            com.applovin.exoplayer2.l.d r1 = r0.f18641q
            long r1 = r1.mo54965b()
            r16.m22925u()
            com.applovin.exoplayer2.al r3 = r0.f18648x
            int r3 = r3.f14815e
            r5 = 1
            if (r3 == r5) goto L_0x01db
            com.applovin.exoplayer2.al r3 = r0.f18648x
            int r3 = r3.f14815e
            r6 = 4
            if (r3 != r6) goto L_0x001b
            goto L_0x01db
        L_0x001b:
            com.applovin.exoplayer2.af r3 = r0.f18643s
            com.applovin.exoplayer2.ad r3 = r3.mo52707c()
            r7 = 10
            if (r3 != 0) goto L_0x0029
            r0.m22856a((long) r1, (long) r7)
            return
        L_0x0029:
            java.lang.String r9 = "doSomeWork"
            com.applovin.exoplayer2.p221l.C7727ah.m22175a(r9)
            r16.m22916l()
            boolean r9 = r3.f14746d
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            if (r9 == 0) goto L_0x00a9
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 * r10
            com.applovin.exoplayer2.h.n r9 = r3.f14743a
            com.applovin.exoplayer2.al r15 = r0.f18648x
            long r10 = r15.f14829s
            long r7 = r0.f18637m
            long r10 = r10 - r7
            boolean r7 = r0.f18638n
            r9.mo54497a((long) r10, (boolean) r7)
            r7 = 0
            r8 = 1
            r9 = 1
        L_0x004f:
            com.applovin.exoplayer2.ar[] r10 = r0.f18625a
            int r11 = r10.length
            if (r7 >= r11) goto L_0x00b0
            r10 = r10[r7]
            boolean r11 = m22899c((com.applovin.exoplayer2.C6827ar) r10)
            if (r11 != 0) goto L_0x005d
            goto L_0x00a5
        L_0x005d:
            long r4 = r0.f18620L
            r10.mo52830a((long) r4, (long) r13)
            if (r8 == 0) goto L_0x006c
            boolean r4 = r10.mo52825A()
            if (r4 == 0) goto L_0x006c
            r8 = 1
            goto L_0x006d
        L_0x006c:
            r8 = 0
        L_0x006d:
            com.applovin.exoplayer2.h.x[] r4 = r3.f14745c
            r4 = r4[r7]
            com.applovin.exoplayer2.h.x r5 = r10.mo52837f()
            if (r4 == r5) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            if (r4 != 0) goto L_0x0084
            boolean r5 = r10.mo52838g()
            if (r5 == 0) goto L_0x0084
            r5 = 1
            goto L_0x0085
        L_0x0084:
            r5 = 0
        L_0x0085:
            if (r4 != 0) goto L_0x0098
            if (r5 != 0) goto L_0x0098
            boolean r4 = r10.mo52847z()
            if (r4 != 0) goto L_0x0098
            boolean r4 = r10.mo52825A()
            if (r4 == 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r4 = 0
            goto L_0x0099
        L_0x0098:
            r4 = 1
        L_0x0099:
            if (r9 == 0) goto L_0x009f
            if (r4 == 0) goto L_0x009f
            r9 = 1
            goto L_0x00a0
        L_0x009f:
            r9 = 0
        L_0x00a0:
            if (r4 != 0) goto L_0x00a5
            r10.mo52842k()
        L_0x00a5:
            int r7 = r7 + 1
            r5 = 1
            goto L_0x004f
        L_0x00a9:
            com.applovin.exoplayer2.h.n r4 = r3.f14743a
            r4.mo54508e_()
            r8 = 1
            r9 = 1
        L_0x00b0:
            com.applovin.exoplayer2.ae r4 = r3.f14748f
            long r4 = r4.f14762e
            if (r8 == 0) goto L_0x00cd
            boolean r7 = r3.f14746d
            if (r7 == 0) goto L_0x00cd
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x00cb
            com.applovin.exoplayer2.al r7 = r0.f18648x
            long r7 = r7.f14829s
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x00cd
        L_0x00cb:
            r4 = 1
            goto L_0x00ce
        L_0x00cd:
            r4 = 0
        L_0x00ce:
            if (r4 == 0) goto L_0x00de
            boolean r5 = r0.f18610B
            if (r5 == 0) goto L_0x00de
            r0.f18610B = r12
            com.applovin.exoplayer2.al r5 = r0.f18648x
            int r5 = r5.f14823m
            r7 = 5
            r0.m22874a((boolean) r12, (int) r5, (boolean) r12, (int) r7)
        L_0x00de:
            r5 = 3
            if (r4 == 0) goto L_0x00ee
            com.applovin.exoplayer2.ae r4 = r3.f14748f
            boolean r4 = r4.f14766i
            if (r4 == 0) goto L_0x00ee
            r0.m22885b((int) r6)
        L_0x00ea:
            r16.m22914j()
            goto L_0x0135
        L_0x00ee:
            com.applovin.exoplayer2.al r4 = r0.f18648x
            int r4 = r4.f14815e
            r7 = 2
            if (r4 != r7) goto L_0x010b
            boolean r4 = r0.m22910g(r9)
            if (r4 == 0) goto L_0x010b
            r0.m22885b((int) r5)
            r4 = 0
            r0.f18623O = r4
            boolean r4 = r16.m22842J()
            if (r4 == 0) goto L_0x0135
            r16.m22913i()
            goto L_0x0135
        L_0x010b:
            com.applovin.exoplayer2.al r4 = r0.f18648x
            int r4 = r4.f14815e
            if (r4 != r5) goto L_0x0135
            int r4 = r0.f18618J
            if (r4 != 0) goto L_0x011c
            boolean r4 = r16.m22923s()
            if (r4 == 0) goto L_0x011e
            goto L_0x0135
        L_0x011c:
            if (r9 != 0) goto L_0x0135
        L_0x011e:
            boolean r4 = r16.m22842J()
            r0.f18611C = r4
            r4 = 2
            r0.m22885b((int) r4)
            boolean r4 = r0.f18611C
            if (r4 == 0) goto L_0x00ea
            r16.m22917m()
            com.applovin.exoplayer2.z r4 = r0.f18645u
            r4.mo54872a()
            goto L_0x00ea
        L_0x0135:
            com.applovin.exoplayer2.al r4 = r0.f18648x
            int r4 = r4.f14815e
            r7 = 2
            if (r4 != r7) goto L_0x0182
            r4 = 0
        L_0x013d:
            com.applovin.exoplayer2.ar[] r7 = r0.f18625a
            int r8 = r7.length
            if (r4 >= r8) goto L_0x0162
            r7 = r7[r4]
            boolean r7 = m22899c((com.applovin.exoplayer2.C6827ar) r7)
            if (r7 == 0) goto L_0x015f
            com.applovin.exoplayer2.ar[] r7 = r0.f18625a
            r7 = r7[r4]
            com.applovin.exoplayer2.h.x r7 = r7.mo52837f()
            com.applovin.exoplayer2.h.x[] r8 = r3.f14745c
            r8 = r8[r4]
            if (r7 != r8) goto L_0x015f
            com.applovin.exoplayer2.ar[] r7 = r0.f18625a
            r7 = r7[r4]
            r7.mo52842k()
        L_0x015f:
            int r4 = r4 + 1
            goto L_0x013d
        L_0x0162:
            com.applovin.exoplayer2.al r3 = r0.f18648x
            boolean r3 = r3.f14817g
            if (r3 != 0) goto L_0x0182
            com.applovin.exoplayer2.al r3 = r0.f18648x
            long r3 = r3.f14828r
            r7 = 500000(0x7a120, double:2.47033E-318)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0182
            boolean r3 = r16.m22838F()
            if (r3 != 0) goto L_0x017a
            goto L_0x0182
        L_0x017a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)
            throw r1
        L_0x0182:
            boolean r3 = r0.f18617I
            com.applovin.exoplayer2.al r4 = r0.f18648x
            boolean r4 = r4.f14825o
            if (r3 == r4) goto L_0x0194
            com.applovin.exoplayer2.al r3 = r0.f18648x
            boolean r4 = r0.f18617I
            com.applovin.exoplayer2.al r3 = r3.mo52738b(r4)
            r0.f18648x = r3
        L_0x0194:
            boolean r3 = r16.m22842J()
            if (r3 == 0) goto L_0x01a0
            com.applovin.exoplayer2.al r3 = r0.f18648x
            int r3 = r3.f14815e
            if (r3 == r5) goto L_0x01a7
        L_0x01a0:
            com.applovin.exoplayer2.al r3 = r0.f18648x
            int r3 = r3.f14815e
            r4 = 2
            if (r3 != r4) goto L_0x01b0
        L_0x01a7:
            r3 = 10
            boolean r1 = r0.m22892b(r1, r3)
            r2 = 1
            r1 = r1 ^ r2
            goto L_0x01c7
        L_0x01b0:
            int r3 = r0.f18618J
            if (r3 == 0) goto L_0x01c0
            com.applovin.exoplayer2.al r3 = r0.f18648x
            int r3 = r3.f14815e
            if (r3 == r6) goto L_0x01c0
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.m22856a((long) r1, (long) r3)
            goto L_0x01c6
        L_0x01c0:
            com.applovin.exoplayer2.l.o r1 = r0.f18632h
            r2 = 2
            r1.mo54977d(r2)
        L_0x01c6:
            r1 = 0
        L_0x01c7:
            com.applovin.exoplayer2.al r2 = r0.f18648x
            boolean r2 = r2.f14826p
            if (r2 == r1) goto L_0x01d5
            com.applovin.exoplayer2.al r2 = r0.f18648x
            com.applovin.exoplayer2.al r1 = r2.mo52739c(r1)
            r0.f18648x = r1
        L_0x01d5:
            r0.f18616H = r12
            com.applovin.exoplayer2.p221l.C7727ah.m22174a()
            return
        L_0x01db:
            com.applovin.exoplayer2.l.o r1 = r0.f18632h
            r2 = 2
            r1.mo54977d(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.C7824s.m22918n():void");
    }

    /* renamed from: o */
    private long m22919o() {
        return m22844a(this.f18648x.f14811a, this.f18648x.f14812b.f17251a, this.f18648x.f14829s);
    }

    /* renamed from: p */
    private void m22920p() {
        m22877a(true, false, true, false);
        this.f18630f.mo52607c();
        m22885b(1);
        this.f18633i.quit();
        synchronized (this) {
            this.f18650z = true;
            notifyAll();
        }
    }

    /* renamed from: q */
    private void m22921q() throws C7819p {
        float f = this.f18639o.mo53055d().f14832b;
        C6800ad c = this.f18643s.mo52707c();
        C6800ad d = this.f18643s.mo52708d();
        boolean z = true;
        while (c != null && c.f14746d) {
            C7649k b = c.mo52679b(f, this.f18648x.f14811a);
            if (!b.mo54869a(c.mo52689i())) {
                C6802af afVar = this.f18643s;
                if (z) {
                    C6800ad c2 = afVar.mo52707c();
                    boolean a = this.f18643s.mo52701a(c2);
                    boolean[] zArr = new boolean[this.f18625a.length];
                    long a2 = c2.mo52674a(b, this.f18648x.f14829s, a, zArr);
                    boolean z2 = (this.f18648x.f14815e == 4 || a2 == this.f18648x.f14829s) ? false : true;
                    C6800ad adVar = c2;
                    boolean[] zArr2 = zArr;
                    this.f18648x = m22849a(this.f18648x.f14812b, a2, this.f18648x.f14813c, this.f18648x.f14814d, z2, 5);
                    if (z2) {
                        m22887b(a2);
                    }
                    boolean[] zArr3 = new boolean[this.f18625a.length];
                    int i = 0;
                    while (true) {
                        C6827ar[] arVarArr = this.f18625a;
                        if (i >= arVarArr.length) {
                            break;
                        }
                        C6827ar arVar = arVarArr[i];
                        zArr3[i] = m22899c(arVar);
                        C7534x xVar = adVar.f14745c[i];
                        if (zArr3[i]) {
                            if (xVar != arVar.mo52837f()) {
                                m22890b(arVar);
                            } else if (zArr2[i]) {
                                arVar.mo52829a(this.f18620L);
                            }
                        }
                        i++;
                    }
                    m22878a(zArr3);
                } else {
                    afVar.mo52701a(c);
                    if (c.f14746d) {
                        c.mo52673a(b, Math.max(c.f14748f.f14759b, c.mo52678b(this.f18620L)), false);
                    }
                }
                m22912h(true);
                if (this.f18648x.f14815e != 4) {
                    m22836D();
                    m22916l();
                    this.f18632h.mo54976c(2);
                    return;
                }
                return;
            }
            if (c == d) {
                z = false;
            }
            c = c.mo52687g();
        }
    }

    /* renamed from: r */
    private void m22922r() {
        for (C6800ad c = this.f18643s.mo52707c(); c != null; c = c.mo52687g()) {
            for (C7637d dVar : c.mo52689i().f17987c) {
                if (dVar != null) {
                    dVar.mo54813g();
                }
            }
        }
    }

    /* renamed from: s */
    private boolean m22923s() {
        C6800ad c = this.f18643s.mo52707c();
        long j = c.f14748f.f14762e;
        return c.f14746d && (j == -9223372036854775807L || this.f18648x.f14829s < j || !m22842J());
    }

    /* renamed from: t */
    private long m22924t() {
        C6800ad d = this.f18643s.mo52708d();
        if (d == null) {
            return 0;
        }
        long a = d.mo52671a();
        if (!d.f14746d) {
            return a;
        }
        int i = 0;
        while (true) {
            C6827ar[] arVarArr = this.f18625a;
            if (i >= arVarArr.length) {
                return a;
            }
            if (m22899c(arVarArr[i]) && this.f18625a[i].mo52837f() == d.f14745c[i]) {
                long h = this.f18625a[i].mo52839h();
                if (h == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                a = Math.max(h, a);
            }
            i++;
        }
    }

    /* renamed from: u */
    private void m22925u() throws C7819p, IOException {
        if (!this.f18648x.f14811a.mo53081d() && this.f18644t.mo52722a()) {
            m22926v();
            m22927w();
            m22928x();
            m22930z();
        }
    }

    /* renamed from: v */
    private void m22926v() throws C7819p {
        C6801ae a;
        this.f18643s.mo52699a(this.f18620L);
        if (this.f18643s.mo52700a() && (a = this.f18643s.mo52696a(this.f18620L, this.f18648x)) != null) {
            C6800ad a2 = this.f18643s.mo52695a(this.f18627c, this.f18628d, this.f18630f.mo52608d(), this.f18644t, a, this.f18629e);
            a2.f14743a.mo54498a((C7506n.C7507a) this, a.f14759b);
            if (this.f18643s.mo52707c() == a2) {
                m22887b(a2.mo52677b());
            }
            m22912h(false);
        }
        if (this.f18612D) {
            this.f18612D = m22838F();
            m22839G();
            return;
        }
        m22836D();
    }

    /* renamed from: w */
    private void m22927w() {
        C6800ad d = this.f18643s.mo52708d();
        if (d != null) {
            int i = 0;
            if (d.mo52687g() == null || this.f18610B) {
                if (d.f14748f.f14766i || this.f18610B) {
                    while (true) {
                        C6827ar[] arVarArr = this.f18625a;
                        if (i < arVarArr.length) {
                            C6827ar arVar = arVarArr[i];
                            C7534x xVar = d.f14745c[i];
                            if (xVar != null && arVar.mo52837f() == xVar && arVar.mo52838g()) {
                                m22860a(arVar, (d.f14748f.f14762e == -9223372036854775807L || d.f14748f.f14762e == Long.MIN_VALUE) ? -9223372036854775807L : d.mo52671a() + d.f14748f.f14762e);
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (m22835C()) {
                if (d.mo52687g().f14746d || this.f18620L >= d.mo52687g().mo52677b()) {
                    C7649k i2 = d.mo52689i();
                    C6800ad e = this.f18643s.mo52709e();
                    C7649k i3 = e.mo52689i();
                    if (!e.f14746d || e.f14743a.mo54504c() == -9223372036854775807L) {
                        for (int i4 = 0; i4 < this.f18625a.length; i4++) {
                            boolean a = i2.mo54868a(i4);
                            boolean a2 = i3.mo54868a(i4);
                            if (a && !this.f18625a[i4].mo52841j()) {
                                boolean z = this.f18627c[i4].mo52850a() == -2;
                                C6830at atVar = i2.f17986b[i4];
                                C6830at atVar2 = i3.f17986b[i4];
                                if (!a2 || !atVar2.equals(atVar) || z) {
                                    m22860a(this.f18625a[i4], e.mo52677b());
                                }
                            }
                        }
                        return;
                    }
                    m22894c(e.mo52677b());
                }
            }
        }
    }

    /* renamed from: x */
    private void m22928x() throws C7819p {
        C6800ad d = this.f18643s.mo52708d();
        if (d != null && this.f18643s.mo52707c() != d && !d.f14749g && m22929y()) {
            m22840H();
        }
    }

    /* renamed from: y */
    private boolean m22929y() throws C7819p {
        C6800ad d = this.f18643s.mo52708d();
        C7649k i = d.mo52689i();
        int i2 = 0;
        boolean z = false;
        while (true) {
            C6827ar[] arVarArr = this.f18625a;
            if (i2 >= arVarArr.length) {
                return !z;
            }
            C6827ar arVar = arVarArr[i2];
            if (m22899c(arVar)) {
                boolean z2 = arVar.mo52837f() != d.f14745c[i2];
                if (!i.mo54868a(i2) || z2) {
                    if (!arVar.mo52841j()) {
                        arVar.mo52832a(m22884a(i.f17987c[i2]), d.f14745c[i2], d.mo52677b(), d.mo52671a());
                    } else if (arVar.mo52825A()) {
                        m22890b(arVar);
                    } else {
                        z = true;
                    }
                }
            }
            i2++;
        }
    }

    /* renamed from: z */
    private void m22930z() throws C7819p {
        boolean z = false;
        while (m22834B()) {
            if (z) {
                m22906f();
            }
            C6800ad c = this.f18643s.mo52707c();
            C6800ad f = this.f18643s.mo52710f();
            C6812al a = m22849a(f.f14748f.f14758a, f.f14748f.f14759b, f.f14748f.f14760c, f.f14748f.f14759b, true, 0);
            this.f18648x = a;
            m22863a(a.f14811a, f.f14748f.f14758a, this.f18648x.f14811a, c.f14748f.f14758a, -9223372036854775807L);
            m22833A();
            m22916l();
            z = true;
        }
    }

    /* renamed from: a */
    public void mo55247a() {
        this.f18632h.mo54975b(0).mo54979a();
    }

    /* renamed from: a */
    public void mo55248a(int i) {
        this.f18632h.mo54967a(11, i, 0).mo54979a();
    }

    /* renamed from: a */
    public void mo55249a(int i, int i2, C7537z zVar) {
        this.f18632h.mo54968a(20, i, i2, zVar).mo54979a();
    }

    /* renamed from: a */
    public void mo55250a(long j) {
        this.f18624P = j;
    }

    /* renamed from: a */
    public void mo55118a(C6813am amVar) {
        this.f18632h.mo54969a(16, (Object) amVar).mo54979a();
    }

    /* renamed from: a */
    public synchronized void mo52820a(C6822ao aoVar) {
        if (!this.f18650z) {
            if (this.f18633i.isAlive()) {
                this.f18632h.mo54969a(14, (Object) aoVar).mo54979a();
                return;
            }
        }
        C7755q.m22361c("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        aoVar.mo52809a(false);
    }

    /* renamed from: a */
    public void mo55251a(C6904ba baVar, int i, long j) {
        this.f18632h.mo54969a(3, (Object) new C7832g(baVar, i, j)).mo54979a();
    }

    /* renamed from: a */
    public void mo54499a(C7506n nVar) {
        this.f18632h.mo54969a(8, (Object) nVar).mo54979a();
    }

    /* renamed from: a */
    public void mo55252a(List<C6804ah.C6807c> list, int i, long j, C7537z zVar) {
        this.f18632h.mo54969a(17, (Object) new C7826a(list, zVar, i, j)).mo54979a();
    }

    /* renamed from: a */
    public void mo55253a(boolean z) {
        this.f18632h.mo54967a(12, z ? 1 : 0, 0).mo54979a();
    }

    /* renamed from: a */
    public void mo55254a(boolean z, int i) {
        this.f18632h.mo54967a(1, z ? 1 : 0, i).mo54979a();
    }

    /* renamed from: b */
    public void mo55255b() {
        this.f18632h.mo54975b(6).mo54979a();
    }

    /* renamed from: b */
    public void mo54500a(C7506n nVar) {
        this.f18632h.mo54969a(9, (Object) nVar).mo54979a();
    }

    /* renamed from: c */
    public synchronized boolean mo55257c() {
        if (!this.f18650z) {
            if (this.f18633i.isAlive()) {
                this.f18632h.mo54976c(7);
                m22866a((Supplier<Boolean>) new Supplier() {
                    public final Object get() {
                        return C7824s.this.m22843K();
                    }
                }, this.f18646v);
                return this.f18650z;
            }
        }
        return true;
    }

    /* renamed from: d */
    public Looper mo55258d() {
        return this.f18634j;
    }

    /* renamed from: e */
    public void mo52727e() {
        this.f18632h.mo54976c(22);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: com.applovin.exoplayer2.d.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: com.applovin.exoplayer2.k.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v57, resolved type: com.applovin.exoplayer2.d.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v58, resolved type: com.applovin.exoplayer2.d.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v59, resolved type: com.applovin.exoplayer2.h.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Playback error"
            java.lang.String r1 = "ExoPlayerImplInternal"
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 0
            r4 = 1
            int r5 = r8.what     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            switch(r5) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x00e1;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00d3;
                case 4: goto L_0x00ca;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00bc;
                case 7: goto L_0x00b8;
                case 8: goto L_0x00af;
                case 9: goto L_0x00a6;
                case 10: goto L_0x00a1;
                case 11: goto L_0x009a;
                case 12: goto L_0x008e;
                case 13: goto L_0x007e;
                case 14: goto L_0x0075;
                case 15: goto L_0x006c;
                case 16: goto L_0x0063;
                case 17: goto L_0x005a;
                case 18: goto L_0x004f;
                case 19: goto L_0x0046;
                case 20: goto L_0x0039;
                case 21: goto L_0x0030;
                case 22: goto L_0x002b;
                case 23: goto L_0x001f;
                case 24: goto L_0x0013;
                case 25: goto L_0x000e;
                default: goto L_0x000d;
            }     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
        L_0x000d:
            return r3
        L_0x000e:
            r7.m22915k()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0013:
            int r8 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            if (r8 != r4) goto L_0x0019
            r8 = 1
            goto L_0x001a
        L_0x0019:
            r8 = 0
        L_0x001a:
            r7.m22903d((boolean) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x001f:
            int r8 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            if (r8 == 0) goto L_0x0025
            r8 = 1
            goto L_0x0026
        L_0x0025:
            r8 = 0
        L_0x0026:
            r7.m22898c((boolean) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x002b:
            r7.m22911h()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0030:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.h.z r8 = (com.applovin.exoplayer2.p206h.C7537z) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22868a((com.applovin.exoplayer2.p206h.C7537z) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0039:
            int r5 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            int r6 = r8.arg2     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.h.z r8 = (com.applovin.exoplayer2.p206h.C7537z) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22886b(r5, r6, r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0046:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.s$b r8 = (com.applovin.exoplayer2.C7824s.C7827b) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22871a((com.applovin.exoplayer2.C7824s.C7827b) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x004f:
            java.lang.Object r5 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.s$a r5 = (com.applovin.exoplayer2.C7824s.C7826a) r5     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            int r8 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22870a((com.applovin.exoplayer2.C7824s.C7826a) r5, (int) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x005a:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.s$a r8 = (com.applovin.exoplayer2.C7824s.C7826a) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22869a((com.applovin.exoplayer2.C7824s.C7826a) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0063:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.am r8 = (com.applovin.exoplayer2.C6813am) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22858a((com.applovin.exoplayer2.C6813am) r8, (boolean) r3)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x006c:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.ao r8 = (com.applovin.exoplayer2.C6822ao) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22901d((com.applovin.exoplayer2.C6822ao) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x0075:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.ao r8 = (com.applovin.exoplayer2.C6822ao) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22889b((com.applovin.exoplayer2.C6822ao) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x007e:
            int r5 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            if (r5 == 0) goto L_0x0084
            r5 = 1
            goto L_0x0085
        L_0x0084:
            r5 = 0
        L_0x0085:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            java.util.concurrent.atomic.AtomicBoolean r8 = (java.util.concurrent.atomic.AtomicBoolean) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22875a((boolean) r5, (java.util.concurrent.atomic.AtomicBoolean) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x008e:
            int r8 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            if (r8 == 0) goto L_0x0094
            r8 = 1
            goto L_0x0095
        L_0x0094:
            r8 = 0
        L_0x0095:
            r7.m22905e((boolean) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x009a:
            int r8 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22893c((int) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00a1:
            r7.m22921q()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00a6:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.h.n r8 = (com.applovin.exoplayer2.p206h.C7506n) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22902d((com.applovin.exoplayer2.p206h.C7506n) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00af:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.h.n r8 = (com.applovin.exoplayer2.p206h.C7506n) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22897c((com.applovin.exoplayer2.p206h.C7506n) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00b8:
            r7.m22920p()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            return r4
        L_0x00bc:
            r7.m22876a((boolean) r3, (boolean) r4)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00c1:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.av r8 = (com.applovin.exoplayer2.C6832av) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22861a((com.applovin.exoplayer2.C6832av) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00ca:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.am r8 = (com.applovin.exoplayer2.C6813am) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22888b((com.applovin.exoplayer2.C6813am) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00d3:
            java.lang.Object r8 = r8.obj     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            com.applovin.exoplayer2.s$g r8 = (com.applovin.exoplayer2.C7824s.C7832g) r8     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22872a((com.applovin.exoplayer2.C7824s.C7832g) r8)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00dc:
            r7.m22918n()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00e1:
            int r5 = r8.arg1     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            if (r5 == 0) goto L_0x00e7
            r5 = 1
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            int r8 = r8.arg2     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            r7.m22874a((boolean) r5, (int) r8, (boolean) r4, (int) r4)     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00ef:
            r7.m22909g()     // Catch:{ p -> 0x014f, a -> 0x0148, ai -> 0x011f, j -> 0x011b, b -> 0x0117, IOException -> 0x0113, RuntimeException -> 0x00f4 }
            goto L_0x018a
        L_0x00f4:
            r8 = move-exception
            boolean r5 = r8 instanceof java.lang.IllegalStateException
            if (r5 != 0) goto L_0x00fd
            boolean r5 = r8 instanceof java.lang.IllegalArgumentException
            if (r5 == 0) goto L_0x00ff
        L_0x00fd:
            r2 = 1004(0x3ec, float:1.407E-42)
        L_0x00ff:
            com.applovin.exoplayer2.p r8 = com.applovin.exoplayer2.C7819p.m22727a((java.lang.RuntimeException) r8, (int) r2)
        L_0x0103:
            com.applovin.exoplayer2.p221l.C7755q.m22362c(r1, r0, r8)
            r7.m22876a((boolean) r4, (boolean) r3)
            com.applovin.exoplayer2.al r0 = r7.f18648x
            com.applovin.exoplayer2.al r8 = r0.mo52735a((com.applovin.exoplayer2.C7819p) r8)
            r7.f18648x = r8
            goto L_0x018a
        L_0x0113:
            r8 = move-exception
            r0 = 2000(0x7d0, float:2.803E-42)
            goto L_0x014b
        L_0x0117:
            r8 = move-exception
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x014b
        L_0x011b:
            r8 = move-exception
            int r0 = r8.f18050a
            goto L_0x014b
        L_0x011f:
            r8 = move-exception
            int r0 = r8.f14804b
            if (r0 != r4) goto L_0x0132
            boolean r0 = r8.f14803a
            if (r0 == 0) goto L_0x012d
            r0 = 3001(0xbb9, float:4.205E-42)
            r2 = 3001(0xbb9, float:4.205E-42)
            goto L_0x0144
        L_0x012d:
            r0 = 3003(0xbbb, float:4.208E-42)
            r2 = 3003(0xbbb, float:4.208E-42)
            goto L_0x0144
        L_0x0132:
            int r0 = r8.f14804b
            r1 = 4
            if (r0 != r1) goto L_0x0144
            boolean r0 = r8.f14803a
            if (r0 == 0) goto L_0x0140
            r0 = 3002(0xbba, float:4.207E-42)
            r2 = 3002(0xbba, float:4.207E-42)
            goto L_0x0144
        L_0x0140:
            r0 = 3004(0xbbc, float:4.21E-42)
            r2 = 3004(0xbbc, float:4.21E-42)
        L_0x0144:
            r7.m22873a((java.io.IOException) r8, (int) r2)
            goto L_0x018a
        L_0x0148:
            r8 = move-exception
            int r0 = r8.f15731a
        L_0x014b:
            r7.m22873a((java.io.IOException) r8, (int) r0)
            goto L_0x018a
        L_0x014f:
            r8 = move-exception
            int r2 = r8.f18565a
            if (r2 != r4) goto L_0x0164
            com.applovin.exoplayer2.af r2 = r7.f18643s
            com.applovin.exoplayer2.ad r2 = r2.mo52708d()
            if (r2 == 0) goto L_0x0164
            com.applovin.exoplayer2.ae r2 = r2.f14748f
            com.applovin.exoplayer2.h.p$a r2 = r2.f14758a
            com.applovin.exoplayer2.p r8 = r8.mo55232a((com.applovin.exoplayer2.p206h.C7508o) r2)
        L_0x0164:
            boolean r2 = r8.f18571g
            if (r2 == 0) goto L_0x017f
            com.applovin.exoplayer2.p r2 = r7.f18623O
            if (r2 != 0) goto L_0x017f
            java.lang.String r0 = "Recoverable renderer error"
            com.applovin.exoplayer2.p221l.C7755q.m22359b(r1, r0, r8)
            r7.f18623O = r8
            com.applovin.exoplayer2.l.o r0 = r7.f18632h
            r1 = 25
            com.applovin.exoplayer2.l.o$a r8 = r0.mo54969a((int) r1, (java.lang.Object) r8)
            r0.mo54973a((com.applovin.exoplayer2.p221l.C7749o.C7750a) r8)
            goto L_0x018a
        L_0x017f:
            com.applovin.exoplayer2.p r2 = r7.f18623O
            if (r2 == 0) goto L_0x0103
            r2.addSuppressed(r8)
            com.applovin.exoplayer2.p r8 = r7.f18623O
            goto L_0x0103
        L_0x018a:
            r7.m22906f()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.C7824s.handleMessage(android.os.Message):boolean");
    }
}
