package com.applovin.exoplayer2;

import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.C6804ah;
import com.applovin.exoplayer2.C6814an;
import com.applovin.exoplayer2.C6822ao;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.C7820q;
import com.applovin.exoplayer2.C7824s;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p180a.C6781a;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.C7515r;
import com.applovin.exoplayer2.p206h.C7537z;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p219j.C7644h;
import com.applovin.exoplayer2.p219j.C7647j;
import com.applovin.exoplayer2.p219j.C7649k;
import com.applovin.exoplayer2.p220k.C7660d;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7732d;
import com.applovin.exoplayer2.p221l.C7749o;
import com.applovin.exoplayer2.p221l.C7751p;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p222m.C7816o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.applovin.exoplayer2.r */
final class C7822r extends C7129d {

    /* renamed from: A */
    private C6832av f18572A;

    /* renamed from: B */
    private C7537z f18573B;

    /* renamed from: C */
    private boolean f18574C;

    /* renamed from: D */
    private C6814an.C6816a f18575D;

    /* renamed from: E */
    private C6797ac f18576E;

    /* renamed from: F */
    private C6797ac f18577F;

    /* renamed from: G */
    private C6812al f18578G;

    /* renamed from: H */
    private int f18579H;

    /* renamed from: I */
    private int f18580I;

    /* renamed from: J */
    private long f18581J;

    /* renamed from: b */
    final C7649k f18582b;

    /* renamed from: c */
    final C6814an.C6816a f18583c;

    /* renamed from: d */
    private final C6827ar[] f18584d;

    /* renamed from: e */
    private final C7647j f18585e;

    /* renamed from: f */
    private final C7749o f18586f;

    /* renamed from: g */
    private final C7824s.C7830e f18587g;

    /* renamed from: h */
    private final C7824s f18588h;

    /* renamed from: i */
    private final C7751p<C6814an.C6818b> f18589i;

    /* renamed from: j */
    private final CopyOnWriteArraySet<C7820q.C7821a> f18590j;

    /* renamed from: k */
    private final C6904ba.C6906a f18591k;

    /* renamed from: l */
    private final List<C7823a> f18592l;

    /* renamed from: m */
    private final boolean f18593m;

    /* renamed from: n */
    private final C7515r f18594n;

    /* renamed from: o */
    private final C6781a f18595o;

    /* renamed from: p */
    private final Looper f18596p;

    /* renamed from: q */
    private final C7660d f18597q;

    /* renamed from: r */
    private final long f18598r;

    /* renamed from: s */
    private final long f18599s;

    /* renamed from: t */
    private final C7732d f18600t;

    /* renamed from: u */
    private int f18601u;

    /* renamed from: v */
    private boolean f18602v;

    /* renamed from: w */
    private int f18603w;

    /* renamed from: x */
    private int f18604x;

    /* renamed from: y */
    private boolean f18605y;

    /* renamed from: z */
    private int f18606z;

    /* renamed from: com.applovin.exoplayer2.r$a */
    private static final class C7823a implements C6803ag {

        /* renamed from: a */
        private final Object f18607a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C6904ba f18608b;

        public C7823a(Object obj, C6904ba baVar) {
            this.f18607a = obj;
            this.f18608b = baVar;
        }

        /* renamed from: a */
        public Object mo52712a() {
            return this.f18607a;
        }

        /* renamed from: b */
        public C6904ba mo52713b() {
            return this.f18608b;
        }
    }

    /* JADX WARNING: type inference failed for: r37v0, types: [com.applovin.exoplayer2.an] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7822r(com.applovin.exoplayer2.C6827ar[] r19, com.applovin.exoplayer2.p219j.C7647j r20, com.applovin.exoplayer2.p206h.C7515r r21, com.applovin.exoplayer2.C6786aa r22, com.applovin.exoplayer2.p220k.C7660d r23, com.applovin.exoplayer2.p180a.C6781a r24, boolean r25, com.applovin.exoplayer2.C6832av r26, long r27, long r29, com.applovin.exoplayer2.C7870z r31, long r32, boolean r34, com.applovin.exoplayer2.p221l.C7732d r35, android.os.Looper r36, com.applovin.exoplayer2.C6814an r37, com.applovin.exoplayer2.C6814an.C6816a r38) {
        /*
            r18 = this;
            r0 = r18
            r2 = r19
            r6 = r23
            r9 = r24
            r15 = r35
            r14 = r36
            r18.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Init "
            r1.append(r3)
            int r3 = java.lang.System.identityHashCode(r18)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = " ["
            r1.append(r3)
            java.lang.String r3 = "ExoPlayerLib/2.15.1"
            r1.append(r3)
            java.lang.String r3 = "] ["
            r1.append(r3)
            java.lang.String r3 = com.applovin.exoplayer2.p221l.C7728ai.f18253e
            r1.append(r3)
            java.lang.String r3 = "]"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ExoPlayerImpl"
            com.applovin.exoplayer2.p221l.C7755q.m22358b(r3, r1)
            int r1 = r2.length
            r3 = 0
            if (r1 <= 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r1)
            java.lang.Object r1 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r19)
            com.applovin.exoplayer2.ar[] r1 = (com.applovin.exoplayer2.C6827ar[]) r1
            r0.f18584d = r1
            java.lang.Object r1 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r20)
            com.applovin.exoplayer2.j.j r1 = (com.applovin.exoplayer2.p219j.C7647j) r1
            r0.f18585e = r1
            r1 = r21
            r0.f18594n = r1
            r0.f18597q = r6
            r0.f18595o = r9
            r1 = r25
            r0.f18593m = r1
            r10 = r26
            r0.f18572A = r10
            r4 = r27
            r0.f18598r = r4
            r4 = r29
            r0.f18599s = r4
            r12 = r34
            r0.f18574C = r12
            r0.f18596p = r14
            r0.f18600t = r15
            r0.f18601u = r3
            if (r37 == 0) goto L_0x0087
            r1 = r37
            goto L_0x0088
        L_0x0087:
            r1 = r0
        L_0x0088:
            com.applovin.exoplayer2.l.p r4 = new com.applovin.exoplayer2.l.p
            com.applovin.exoplayer2.-$$Lambda$r$VAd23GQwbAzdWcODYdRLLcr6drc r5 = new com.applovin.exoplayer2.-$$Lambda$r$VAd23GQwbAzdWcODYdRLLcr6drc
            r5.<init>()
            r4.<init>(r14, r15, r5)
            r0.f18589i = r4
            java.util.concurrent.CopyOnWriteArraySet r4 = new java.util.concurrent.CopyOnWriteArraySet
            r4.<init>()
            r0.f18590j = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f18592l = r4
            com.applovin.exoplayer2.h.z$a r4 = new com.applovin.exoplayer2.h.z$a
            r4.<init>(r3)
            r0.f18573B = r4
            com.applovin.exoplayer2.j.k r3 = new com.applovin.exoplayer2.j.k
            int r4 = r2.length
            com.applovin.exoplayer2.at[] r4 = new com.applovin.exoplayer2.C6830at[r4]
            int r5 = r2.length
            com.applovin.exoplayer2.j.d[] r5 = new com.applovin.exoplayer2.p219j.C7637d[r5]
            r7 = 0
            r3.<init>(r4, r5, r7)
            r0.f18582b = r3
            com.applovin.exoplayer2.ba$a r3 = new com.applovin.exoplayer2.ba$a
            r3.<init>()
            r0.f18591k = r3
            com.applovin.exoplayer2.an$a$a r3 = new com.applovin.exoplayer2.an$a$a
            r3.<init>()
            r4 = 10
            int[] r4 = new int[r4]
            r4 = {1, 2, 12, 13, 14, 15, 16, 17, 18, 19} // fill-array
            com.applovin.exoplayer2.an$a$a r3 = r3.mo52798a((int[]) r4)
            r4 = 28
            boolean r5 = r20.mo54820a()
            com.applovin.exoplayer2.an$a$a r3 = r3.mo52796a(r4, r5)
            r4 = r38
            com.applovin.exoplayer2.an$a$a r3 = r3.mo52797a((com.applovin.exoplayer2.C6814an.C6816a) r4)
            com.applovin.exoplayer2.an$a r3 = r3.mo52799a()
            r0.f18583c = r3
            com.applovin.exoplayer2.an$a$a r3 = new com.applovin.exoplayer2.an$a$a
            r3.<init>()
            com.applovin.exoplayer2.an$a r4 = r0.f18583c
            com.applovin.exoplayer2.an$a$a r3 = r3.mo52797a((com.applovin.exoplayer2.C6814an.C6816a) r4)
            r4 = 3
            com.applovin.exoplayer2.an$a$a r3 = r3.mo52795a((int) r4)
            r4 = 9
            com.applovin.exoplayer2.an$a$a r3 = r3.mo52795a((int) r4)
            com.applovin.exoplayer2.an$a r3 = r3.mo52799a()
            r0.f18575D = r3
            com.applovin.exoplayer2.ac r3 = com.applovin.exoplayer2.C6797ac.f14679a
            r0.f18576E = r3
            com.applovin.exoplayer2.ac r3 = com.applovin.exoplayer2.C6797ac.f14679a
            r0.f18577F = r3
            r3 = -1
            r0.f18579H = r3
            com.applovin.exoplayer2.l.o r3 = r15.mo54964a(r14, r7)
            r0.f18586f = r3
            com.applovin.exoplayer2.-$$Lambda$r$Gjt1BimvXa7pCAiT3T4ckq1YSTU r3 = new com.applovin.exoplayer2.-$$Lambda$r$Gjt1BimvXa7pCAiT3T4ckq1YSTU
            r3.<init>()
            r0.f18587g = r3
            com.applovin.exoplayer2.j.k r3 = r0.f18582b
            com.applovin.exoplayer2.al r3 = com.applovin.exoplayer2.C6812al.m17547a((com.applovin.exoplayer2.p219j.C7649k) r3)
            r0.f18578G = r3
            if (r9 == 0) goto L_0x0130
            r9.mo52477a((com.applovin.exoplayer2.C6814an) r1, (android.os.Looper) r14)
            r0.mo52769a((com.applovin.exoplayer2.C6814an.C6820d) r9)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r14)
            r6.mo54891a(r1, r9)
        L_0x0130:
            com.applovin.exoplayer2.s r13 = new com.applovin.exoplayer2.s
            r1 = r13
            com.applovin.exoplayer2.j.k r4 = r0.f18582b
            int r7 = r0.f18601u
            boolean r8 = r0.f18602v
            com.applovin.exoplayer2.s$e r3 = r0.f18587g
            r17 = r3
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r9 = r24
            r10 = r26
            r11 = r31
            r0 = r13
            r12 = r32
            r14 = r34
            r15 = r36
            r16 = r35
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            r1 = r0
            r0 = r18
            r0.f18588h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.C7822r.<init>(com.applovin.exoplayer2.ar[], com.applovin.exoplayer2.j.j, com.applovin.exoplayer2.h.r, com.applovin.exoplayer2.aa, com.applovin.exoplayer2.k.d, com.applovin.exoplayer2.a.a, boolean, com.applovin.exoplayer2.av, long, long, com.applovin.exoplayer2.z, long, boolean, com.applovin.exoplayer2.l.d, android.os.Looper, com.applovin.exoplayer2.an, com.applovin.exoplayer2.an$a):void");
    }

    /* renamed from: W */
    private int m22735W() {
        return this.f18578G.f14811a.mo53081d() ? this.f18579H : this.f18578G.f14811a.mo52441a(this.f18578G.f14812b.f17251a, this.f18591k).f15258c;
    }

    /* renamed from: X */
    private void m22736X() {
        C6814an.C6816a aVar = this.f18575D;
        C6814an.C6816a a = mo53731a(this.f18583c);
        this.f18575D = a;
        if (!a.equals(aVar)) {
            this.f18589i.mo55022a(13, new C7751p.C7752a() {
                public final void invoke(Object obj) {
                    C7822r.this.m22766c((C6814an.C6818b) obj);
                }
            });
        }
    }

    /* renamed from: Y */
    private C6904ba m22737Y() {
        return new C6825ap(this.f18592l, this.f18573B);
    }

    /* renamed from: a */
    private long m22738a(C6812al alVar) {
        return alVar.f14811a.mo53081d() ? C7476h.m20800b(this.f18581J) : alVar.f14812b.mo54546a() ? alVar.f14829s : m22739a(alVar.f14811a, alVar.f14812b, alVar.f14829s);
    }

    /* renamed from: a */
    private long m22739a(C6904ba baVar, C7509p.C7510a aVar, long j) {
        baVar.mo52441a(aVar.f17251a, this.f18591k);
        return j + this.f18591k.mo53094c();
    }

    /* renamed from: a */
    private Pair<Boolean, Integer> m22740a(C6812al alVar, C6812al alVar2, boolean z, int i, boolean z2) {
        C6904ba baVar = alVar2.f14811a;
        C6904ba baVar2 = alVar.f14811a;
        if (baVar2.mo53081d() && baVar.mo53081d()) {
            return new Pair<>(false, -1);
        }
        int i2 = 3;
        if (baVar2.mo53081d() != baVar.mo53081d()) {
            return new Pair<>(true, 3);
        }
        if (baVar.mo53079a(baVar.mo52441a(alVar2.f14812b.f17251a, this.f18591k).f15258c, this.f15644a).f15271b.equals(baVar2.mo53079a(baVar2.mo52441a(alVar.f14812b.f17251a, this.f18591k).f15258c, this.f15644a).f15271b)) {
            return (!z || i != 0 || alVar2.f14812b.f17254d >= alVar.f14812b.f17254d) ? new Pair<>(false, -1) : new Pair<>(true, 0);
        }
        if (z && i == 0) {
            i2 = 1;
        } else if (z && i == 1) {
            i2 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair<>(true, Integer.valueOf(i2));
    }

    /* renamed from: a */
    private Pair<Object, Long> m22741a(C6904ba baVar, int i, long j) {
        if (baVar.mo53081d()) {
            this.f18579H = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f18581J = j;
            this.f18580I = 0;
            return null;
        }
        if (i == -1 || i >= baVar.mo52823b()) {
            i = baVar.mo52446b(this.f18602v);
            j = baVar.mo53079a(i, this.f15644a).mo53104a();
        }
        return baVar.mo53076a(this.f15644a, this.f18591k, i, C7476h.m20800b(j));
    }

    /* renamed from: a */
    private Pair<Object, Long> m22742a(C6904ba baVar, C6904ba baVar2) {
        long N = mo52757N();
        int i = -1;
        if (baVar.mo53081d() || baVar2.mo53081d()) {
            boolean z = !baVar.mo53081d() && baVar2.mo53081d();
            if (!z) {
                i = m22735W();
            }
            if (z) {
                N = -9223372036854775807L;
            }
            return m22741a(baVar2, i, N);
        }
        Pair<Object, Long> a = baVar.mo53076a(this.f15644a, this.f18591k, mo52750G(), C7476h.m20800b(N));
        Object obj = ((Pair) C7728ai.m22198a(a)).first;
        if (baVar2.mo52448c(obj) != -1) {
            return a;
        }
        Object a2 = C7824s.m22853a(this.f15644a, this.f18591k, this.f18601u, this.f18602v, obj, baVar, baVar2);
        if (a2 == null) {
            return m22741a(baVar2, -1, -9223372036854775807L);
        }
        baVar2.mo52441a(a2, this.f18591k);
        return m22741a(baVar2, this.f18591k.f15258c, baVar2.mo53079a(this.f18591k.f15258c, this.f15644a).mo53104a());
    }

    /* renamed from: a */
    private C6812al m22743a(int i, int i2) {
        boolean z = false;
        C7717a.m22118a(i >= 0 && i2 >= i && i2 <= this.f18592l.size());
        int G = mo52750G();
        C6904ba S = mo52762S();
        int size = this.f18592l.size();
        this.f18603w++;
        m22760b(i, i2);
        C6904ba Y = m22737Y();
        C6812al a = m22744a(this.f18578G, Y, m22742a(S, Y));
        if (a.f14815e != 1 && a.f14815e != 4 && i < i2 && i2 == size && G >= a.f14811a.mo52823b()) {
            z = true;
        }
        if (z) {
            a = a.mo52730a(4);
        }
        this.f18588h.mo55249a(i, i2, this.f18573B);
        return a;
    }

    /* renamed from: a */
    private C6812al m22744a(C6812al alVar, C6904ba baVar, Pair<Object, Long> pair) {
        int i;
        C6904ba baVar2 = baVar;
        Pair<Object, Long> pair2 = pair;
        C7717a.m22118a(baVar.mo53081d() || pair2 != null);
        C6904ba baVar3 = alVar.f14811a;
        C6812al a = alVar.mo52732a(baVar);
        if (baVar.mo53081d()) {
            C7509p.C7510a a2 = C6812al.m17548a();
            long b = C7476h.m20800b(this.f18581J);
            C6812al a3 = a.mo52734a(a2, b, b, b, 0, C7483ad.f17172a, this.f18582b, C7033s.m18803g()).mo52733a(a2);
            a3.f14827q = a3.f14829s;
            return a3;
        }
        Object obj = a.f14812b.f17251a;
        boolean z = !obj.equals(((Pair) C7728ai.m22198a(pair)).first);
        C7509p.C7510a aVar = z ? new C7509p.C7510a(pair2.first) : a.f14812b;
        long longValue = ((Long) pair2.second).longValue();
        long b2 = C7476h.m20800b(mo52757N());
        if (!baVar3.mo53081d()) {
            b2 -= baVar3.mo52441a(obj, this.f18591k).mo53094c();
        }
        if (z || longValue < b2) {
            C7509p.C7510a aVar2 = aVar;
            C7717a.m22121b(!aVar2.mo54546a());
            C7509p.C7510a aVar3 = aVar2;
            C6812al a4 = a.mo52734a(aVar3, longValue, longValue, longValue, 0, z ? C7483ad.f17172a : a.f14818h, z ? this.f18582b : a.f14819i, z ? C7033s.m18803g() : a.f14820j).mo52733a(aVar3);
            a4.f14827q = longValue;
            return a4;
        }
        if (i == 0) {
            int c = baVar2.mo52448c(a.f14821k.f17251a);
            if (c == -1 || baVar2.mo53078a(c, this.f18591k).f15258c != baVar2.mo52441a(aVar.f17251a, this.f18591k).f15258c) {
                baVar2.mo52441a(aVar.f17251a, this.f18591k);
                long j = aVar.mo54546a() ? this.f18591k.mo53093b(aVar.f17252b, aVar.f17253c) : this.f18591k.f15259d;
                a = a.mo52734a(aVar, a.f14829s, a.f14829s, a.f14814d, j - a.f14829s, a.f14818h, a.f14819i, a.f14820j).mo52733a(aVar);
                a.f14827q = j;
            }
        } else {
            C7509p.C7510a aVar4 = aVar;
            C7717a.m22121b(!aVar4.mo54546a());
            long max = Math.max(0, a.f14828r - (longValue - b2));
            long j2 = a.f14827q;
            if (a.f14821k.equals(a.f14812b)) {
                j2 = longValue + max;
            }
            a = a.mo52734a(aVar4, longValue, longValue, longValue, max, a.f14818h, a.f14819i, a.f14820j);
            a.f14827q = j;
        }
        return a;
    }

    /* renamed from: a */
    private C6814an.C6821e m22745a(int i, C6812al alVar, int i2) {
        int i3;
        Object obj;
        C6787ab abVar;
        int i4;
        Object obj2;
        long j;
        long j2;
        long j3;
        C6812al alVar2 = alVar;
        C6904ba.C6906a aVar = new C6904ba.C6906a();
        if (!alVar2.f14811a.mo53081d()) {
            Object obj3 = alVar2.f14812b.f17251a;
            alVar2.f14811a.mo52441a(obj3, aVar);
            int i5 = aVar.f15258c;
            i4 = i5;
            obj = obj3;
            i3 = alVar2.f14811a.mo52448c(obj3);
            obj2 = alVar2.f14811a.mo53079a(i5, this.f15644a).f15271b;
            abVar = this.f15644a.f15273d;
        } else {
            i4 = i2;
            obj2 = null;
            abVar = null;
            obj = null;
            i3 = -1;
        }
        if (i == 0) {
            j3 = aVar.f15260e + aVar.f15259d;
            if (alVar2.f14812b.mo54546a()) {
                j = aVar.mo53093b(alVar2.f14812b.f17252b, alVar2.f14812b.f17253c);
            } else {
                if (alVar2.f14812b.f17255e != -1 && this.f18578G.f14812b.mo54546a()) {
                    j3 = m22759b(this.f18578G);
                }
                j2 = j;
                return new C6814an.C6821e(obj2, i4, abVar, obj, i3, C7476h.m20797a(j), C7476h.m20797a(j2), alVar2.f14812b.f17252b, alVar2.f14812b.f17253c);
            }
        } else if (alVar2.f14812b.mo54546a()) {
            j = alVar2.f14829s;
        } else {
            j3 = aVar.f15260e + alVar2.f14829s;
            j2 = j;
            return new C6814an.C6821e(obj2, i4, abVar, obj, i3, C7476h.m20797a(j), C7476h.m20797a(j2), alVar2.f14812b.f17252b, alVar2.f14812b.f17253c);
        }
        j2 = m22759b(alVar);
        return new C6814an.C6821e(obj2, i4, abVar, obj, i3, C7476h.m20797a(j), C7476h.m20797a(j2), alVar2.f14812b.f17252b, alVar2.f14812b.f17253c);
    }

    /* renamed from: a */
    private List<C6804ah.C6807c> m22746a(int i, List<C7509p> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C6804ah.C6807c cVar = new C6804ah.C6807c(list.get(i2), this.f18593m);
            arrayList.add(cVar);
            this.f18592l.add(i2 + i, new C7823a(cVar.f14799b, cVar.f14798a.mo54542f()));
        }
        this.f18573B = this.f18573B.mo54618a(i, arrayList.size());
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22748a(int i, C6814an.C6821e eVar, C6814an.C6821e eVar2, C6814an.C6818b bVar) {
        bVar.mo52522e(i);
        bVar.mo52476a(eVar, eVar2, i);
    }

    /* renamed from: a */
    private void m22751a(C6812al alVar, int i, int i2, boolean z, boolean z2, int i3, long j, int i4) {
        C6812al alVar2 = alVar;
        int i5 = i3;
        C6812al alVar3 = this.f18578G;
        this.f18578G = alVar2;
        Pair<Boolean, Integer> a = m22740a(alVar, alVar3, z2, i3, !alVar3.f14811a.equals(alVar2.f14811a));
        boolean booleanValue = ((Boolean) a.first).booleanValue();
        int intValue = ((Integer) a.second).intValue();
        C6797ac acVar = this.f18576E;
        C6787ab abVar = null;
        if (booleanValue) {
            if (!alVar2.f14811a.mo53081d()) {
                abVar = alVar2.f14811a.mo53079a(alVar2.f14811a.mo52441a(alVar2.f14812b.f17251a, this.f18591k).f15258c, this.f15644a).f15273d;
            }
            acVar = abVar != null ? abVar.f14616e : C6797ac.f14679a;
        }
        if (!alVar3.f14820j.equals(alVar2.f14820j)) {
            acVar = acVar.mo52634a().mo52644a(alVar2.f14820j).mo52647a();
        }
        boolean z3 = !acVar.equals(this.f18576E);
        this.f18576E = acVar;
        if (!alVar3.f14811a.equals(alVar2.f14811a)) {
            this.f18589i.mo55022a(0, new C7751p.C7752a(i) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52479a(C6812al.this.f14811a, this.f$1);
                }
            });
        }
        if (z2) {
            this.f18589i.mo55022a(11, new C7751p.C7752a(i5, m22745a(i5, alVar3, i4), m22764c(j)) {
                public final /* synthetic */ int f$0;
                public final /* synthetic */ C6814an.C6821e f$1;
                public final /* synthetic */ C6814an.C6821e f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void invoke(Object obj) {
                    C7822r.m22748a(this.f$0, this.f$1, this.f$2, (C6814an.C6818b) obj);
                }
            });
        }
        if (booleanValue) {
            this.f18589i.mo55022a(1, new C7751p.C7752a(intValue) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52471a(C6787ab.this, this.f$1);
                }
            });
        }
        if (alVar3.f14816f != alVar2.f14816f) {
            this.f18589i.mo55022a(10, new C7751p.C7752a() {
                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52501b((C6811ak) C6812al.this.f14816f);
                }
            });
            if (alVar2.f14816f != null) {
                this.f18589i.mo55022a(10, new C7751p.C7752a() {
                    public final void invoke(Object obj) {
                        ((C6814an.C6818b) obj).mo52473a((C6811ak) C6812al.this.f14816f);
                    }
                });
            }
        }
        if (alVar3.f14819i != alVar2.f14819i) {
            this.f18585e.mo54859a(alVar2.f14819i.f17988d);
            this.f18589i.mo55022a(2, new C7751p.C7752a(new C7644h(alVar2.f14819i.f17987c)) {
                public final /* synthetic */ C7644h f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52482a(C6812al.this.f14818h, this.f$1);
                }
            });
        }
        if (z3) {
            this.f18589i.mo55022a(14, new C7751p.C7752a() {
                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52472a(C6797ac.this);
                }
            });
        }
        if (alVar3.f14817g != alVar2.f14817g) {
            this.f18589i.mo55022a(3, new C7751p.C7752a() {
                public final void invoke(Object obj) {
                    C7822r.m22773f(C6812al.this, (C6814an.C6818b) obj);
                }
            });
        }
        if (!(alVar3.f14815e == alVar2.f14815e && alVar3.f14822l == alVar2.f14822l)) {
            this.f18589i.mo55022a(-1, new C7751p.C7752a() {
                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52493a(C6812al.this.f14822l, C6812al.this.f14815e);
                }
            });
        }
        if (alVar3.f14815e != alVar2.f14815e) {
            this.f18589i.mo55022a(4, new C7751p.C7752a() {
                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52497b(C6812al.this.f14815e);
                }
            });
        }
        if (alVar3.f14822l != alVar2.f14822l) {
            this.f18589i.mo55022a(5, new C7751p.C7752a(i2) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52507b(C6812al.this.f14822l, this.f$1);
                }
            });
        }
        if (alVar3.f14823m != alVar2.f14823m) {
            this.f18589i.mo55022a(6, new C7751p.C7752a() {
                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52510c(C6812al.this.f14823m);
                }
            });
        }
        if (m22768c(alVar3) != m22768c(alVar)) {
            this.f18589i.mo55022a(7, new C7751p.C7752a() {
                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52520d(C7822r.m22768c(C6812al.this));
                }
            });
        }
        if (!alVar3.f14824n.equals(alVar2.f14824n)) {
            this.f18589i.mo55022a(12, new C7751p.C7752a() {
                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52474a(C6812al.this.f14824n);
                }
            });
        }
        if (z) {
            this.f18589i.mo55022a(-1, $$Lambda$kxQdK3QrXIWx_g2EVlOVyvP3ZJw.INSTANCE);
        }
        m22736X();
        this.f18589i.mo55021a();
        if (alVar3.f14825o != alVar2.f14825o) {
            Iterator<C7820q.C7821a> it = this.f18590j.iterator();
            while (it.hasNext()) {
                it.next().mo52878a(alVar2.f14825o);
            }
        }
        if (alVar3.f14826p != alVar2.f14826p) {
            Iterator<C7820q.C7821a> it2 = this.f18590j.iterator();
            while (it2.hasNext()) {
                it2.next().mo52879b(alVar2.f14826p);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22767c(C7824s.C7829d dVar) {
        long j;
        boolean z;
        this.f18603w -= dVar.f18665b;
        boolean z2 = true;
        if (dVar.f18666c) {
            this.f18604x = dVar.f18667d;
            this.f18605y = true;
        }
        if (dVar.f18668e) {
            this.f18606z = dVar.f18669f;
        }
        if (this.f18603w == 0) {
            C6904ba baVar = dVar.f18664a.f14811a;
            if (!this.f18578G.f14811a.mo53081d() && baVar.mo53081d()) {
                this.f18579H = -1;
                this.f18581J = 0;
                this.f18580I = 0;
            }
            if (!baVar.mo53081d()) {
                List<C6904ba> a = ((C6825ap) baVar).mo52822a();
                C7717a.m22121b(a.size() == this.f18592l.size());
                for (int i = 0; i < a.size(); i++) {
                    C6904ba unused = this.f18592l.get(i).f18608b = a.get(i);
                }
            }
            long j2 = -9223372036854775807L;
            if (this.f18605y) {
                if (dVar.f18664a.f14812b.equals(this.f18578G.f14812b) && dVar.f18664a.f14814d == this.f18578G.f14829s) {
                    z2 = false;
                }
                if (z2) {
                    j2 = (baVar.mo53081d() || dVar.f18664a.f14812b.mo54546a()) ? dVar.f18664a.f14814d : m22739a(baVar, dVar.f18664a.f14812b, dVar.f18664a.f14814d);
                }
                j = j2;
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f18605y = false;
            m22751a(dVar.f18664a, 1, this.f18606z, false, z, this.f18604x, j, -1);
        }
    }

    /* renamed from: a */
    private void m22757a(List<C7509p> list, int i, long j, boolean z) {
        int i2;
        long j2;
        int i3 = i;
        int W = m22735W();
        long I = mo52752I();
        boolean z2 = true;
        this.f18603w++;
        if (!this.f18592l.isEmpty()) {
            m22760b(0, this.f18592l.size());
        }
        List<C6804ah.C6807c> a = m22746a(0, list);
        C6904ba Y = m22737Y();
        if (Y.mo53081d() || i3 < Y.mo52823b()) {
            long j3 = j;
            if (z) {
                j2 = -9223372036854775807L;
                i2 = Y.mo52446b(this.f18602v);
            } else if (i3 == -1) {
                i2 = W;
                j2 = I;
            } else {
                i2 = i3;
                j2 = j3;
            }
            C6812al a2 = m22744a(this.f18578G, Y, m22741a(Y, i2, j2));
            int i4 = a2.f14815e;
            if (!(i2 == -1 || a2.f14815e == 1)) {
                i4 = (Y.mo53081d() || i2 >= Y.mo52823b()) ? 4 : 2;
            }
            C6812al a3 = a2.mo52730a(i4);
            this.f18588h.mo55252a(a, i2, C7476h.m20800b(j2), this.f18573B);
            if (this.f18578G.f14812b.f17251a.equals(a3.f14812b.f17251a) || this.f18578G.f14811a.mo53081d()) {
                z2 = false;
            }
            m22751a(a3, 0, 1, false, z2, 4, m22738a(a3), -1);
            return;
        }
        throw new C7869y(Y, i3, j);
    }

    /* renamed from: b */
    private static long m22759b(C6812al alVar) {
        C6904ba.C6908c cVar = new C6904ba.C6908c();
        C6904ba.C6906a aVar = new C6904ba.C6906a();
        alVar.f14811a.mo52441a(alVar.f14812b.f17251a, aVar);
        return alVar.f14813c == -9223372036854775807L ? alVar.f14811a.mo53079a(aVar.f15258c, cVar).mo53106b() : aVar.mo53094c() + alVar.f14813c;
    }

    /* renamed from: b */
    private void m22760b(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f18592l.remove(i3);
        }
        this.f18573B = this.f18573B.mo54621b(i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m22763b(C7824s.C7829d dVar) {
        this.f18586f.mo54974a((Runnable) new Runnable(dVar) {
            public final /* synthetic */ C7824s.C7829d f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7822r.this.m22767c(this.f$1);
            }
        });
    }

    /* renamed from: c */
    private C6814an.C6821e m22764c(long j) {
        int i;
        Object obj;
        C6787ab abVar;
        int G = mo52750G();
        Object obj2 = null;
        if (!this.f18578G.f14811a.mo53081d()) {
            Object obj3 = this.f18578G.f14812b.f17251a;
            this.f18578G.f14811a.mo52441a(obj3, this.f18591k);
            i = this.f18578G.f14811a.mo52448c(obj3);
            obj2 = this.f18578G.f14811a.mo53079a(G, this.f15644a).f15271b;
            abVar = this.f15644a.f15273d;
            obj = obj3;
        } else {
            abVar = null;
            obj = null;
            i = -1;
        }
        long a = C7476h.m20797a(j);
        return new C6814an.C6821e(obj2, G, abVar, obj, i, a, this.f18578G.f14812b.mo54546a() ? C7476h.m20797a(m22759b(this.f18578G)) : a, this.f18578G.f14812b.f17252b, this.f18578G.f14812b.f17253c);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m22766c(C6814an.C6818b bVar) {
        bVar.mo52475a(this.f18575D);
    }

    /* renamed from: c */
    private static boolean m22768c(C6812al alVar) {
        return alVar.f14815e == 3 && alVar.f14822l && alVar.f14823m == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m22770d(C6814an.C6818b bVar) {
        bVar.mo52472a(this.f18576E);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m22773f(C6812al alVar, C6814an.C6818b bVar) {
        bVar.mo52515c(alVar.f14817g);
        bVar.mo52508b_(alVar.f14817g);
    }

    /* renamed from: A */
    public long mo52745A() {
        return this.f18598r;
    }

    /* renamed from: B */
    public long mo52746B() {
        return this.f18599s;
    }

    /* renamed from: C */
    public long mo52747C() {
        return 3000;
    }

    /* renamed from: D */
    public C6813am mo52748D() {
        return this.f18578G.f14824n;
    }

    /* renamed from: E */
    public void mo55233E() {
        C7755q.m22358b("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.15.1" + "] [" + C7728ai.f18253e + "] [" + C7833t.m22961a() + "]");
        if (!this.f18588h.mo55257c()) {
            this.f18589i.mo55025b(10, $$Lambda$r$LeAHXFEhLVK4Q0t1kwqfu4RNHAc.INSTANCE);
        }
        this.f18589i.mo55024b();
        this.f18586f.mo54970a((Object) null);
        C6781a aVar = this.f18595o;
        if (aVar != null) {
            this.f18597q.mo54892a(aVar);
        }
        C6812al a = this.f18578G.mo52730a(1);
        this.f18578G = a;
        C6812al a2 = a.mo52733a(a.f14812b);
        this.f18578G = a2;
        a2.f14827q = a2.f14829s;
        this.f18578G.f14828r = 0;
    }

    /* renamed from: F */
    public int mo52749F() {
        return this.f18578G.f14811a.mo53081d() ? this.f18580I : this.f18578G.f14811a.mo52448c(this.f18578G.f14812b.f17251a);
    }

    /* renamed from: G */
    public int mo52750G() {
        int W = m22735W();
        if (W == -1) {
            return 0;
        }
        return W;
    }

    /* renamed from: H */
    public long mo52751H() {
        if (!mo52754K()) {
            return mo53742p();
        }
        C7509p.C7510a aVar = this.f18578G.f14812b;
        this.f18578G.f14811a.mo52441a(aVar.f17251a, this.f18591k);
        return C7476h.m20797a(this.f18591k.mo53093b(aVar.f17252b, aVar.f17253c));
    }

    /* renamed from: I */
    public long mo52752I() {
        return C7476h.m20797a(m22738a(this.f18578G));
    }

    /* renamed from: J */
    public long mo52753J() {
        return C7476h.m20797a(this.f18578G.f14828r);
    }

    /* renamed from: K */
    public boolean mo52754K() {
        return this.f18578G.f14812b.mo54546a();
    }

    /* renamed from: L */
    public int mo52755L() {
        if (mo52754K()) {
            return this.f18578G.f14812b.f17252b;
        }
        return -1;
    }

    /* renamed from: M */
    public int mo52756M() {
        if (mo52754K()) {
            return this.f18578G.f14812b.f17253c;
        }
        return -1;
    }

    /* renamed from: N */
    public long mo52757N() {
        if (!mo52754K()) {
            return mo52752I();
        }
        this.f18578G.f14811a.mo52441a(this.f18578G.f14812b.f17251a, this.f18591k);
        return this.f18578G.f14813c == -9223372036854775807L ? this.f18578G.f14811a.mo53079a(mo52750G(), this.f15644a).mo53104a() : this.f18591k.mo53092b() + C7476h.m20797a(this.f18578G.f14813c);
    }

    /* renamed from: O */
    public long mo52758O() {
        if (this.f18578G.f14811a.mo53081d()) {
            return this.f18581J;
        }
        int i = (this.f18578G.f14821k.f17254d > this.f18578G.f14812b.f17254d ? 1 : (this.f18578G.f14821k.f17254d == this.f18578G.f14812b.f17254d ? 0 : -1));
        C6812al alVar = this.f18578G;
        if (i != 0) {
            return alVar.f14811a.mo53079a(mo52750G(), this.f15644a).mo53107c();
        }
        long j = alVar.f14827q;
        if (this.f18578G.f14821k.mo54546a()) {
            C6904ba.C6906a a = this.f18578G.f14811a.mo52441a(this.f18578G.f14821k.f17251a, this.f18591k);
            long a2 = a.mo53087a(this.f18578G.f14821k.f17252b);
            j = a2 == Long.MIN_VALUE ? a.f15259d : a2;
        }
        return C7476h.m20797a(m22739a(this.f18578G.f14811a, this.f18578G.f14821k, j));
    }

    /* renamed from: P */
    public C7483ad mo52759P() {
        return this.f18578G.f14818h;
    }

    /* renamed from: Q */
    public C7644h mo52760Q() {
        return new C7644h(this.f18578G.f14819i.f17987c);
    }

    /* renamed from: R */
    public C6797ac mo52761R() {
        return this.f18576E;
    }

    /* renamed from: S */
    public C6904ba mo52762S() {
        return this.f18578G.f14811a;
    }

    /* renamed from: T */
    public C7816o mo52763T() {
        return C7816o.f18542a;
    }

    /* renamed from: U */
    public C7033s<C7540a> mo52764V() {
        return C7033s.m18803g();
    }

    /* renamed from: a */
    public C6822ao mo55235a(C6822ao.C6824b bVar) {
        return new C6822ao(this.f18588h, bVar, this.f18578G.f14811a, mo52750G(), this.f18600t, this.f18588h.mo55258d());
    }

    /* renamed from: a */
    public void mo52765a(int i, long j) {
        int i2 = i;
        long j2 = j;
        C6904ba baVar = this.f18578G.f14811a;
        if (i2 < 0 || (!baVar.mo53081d() && i2 >= baVar.mo52823b())) {
            throw new C7869y(baVar, i, j2);
        }
        int i3 = 1;
        this.f18603w++;
        if (mo52754K()) {
            C7755q.m22361c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C7824s.C7829d dVar = new C7824s.C7829d(this.f18578G);
            dVar.mo55263a(1);
            this.f18587g.onPlaybackInfoUpdate(dVar);
            return;
        }
        if (mo52786t() != 1) {
            i3 = 2;
        }
        int G = mo52750G();
        C6812al a = m22744a(this.f18578G.mo52730a(i3), baVar, m22741a(baVar, i, j2));
        this.f18588h.mo55251a(baVar, i, C7476h.m20800b(j));
        m22751a(a, 0, 1, true, true, 1, m22738a(a), G);
    }

    /* renamed from: a */
    public void mo52767a(SurfaceView surfaceView) {
    }

    /* renamed from: a */
    public void mo52768a(TextureView textureView) {
    }

    /* renamed from: a */
    public void mo55236a(C6814an.C6818b bVar) {
        this.f18589i.mo55023a(bVar);
    }

    /* renamed from: a */
    public void mo52769a(C6814an.C6820d dVar) {
        mo55236a((C6814an.C6818b) dVar);
    }

    /* renamed from: a */
    public void mo55237a(C7399a aVar) {
        C6797ac a = this.f18576E.mo52634a().mo52640a(aVar).mo52647a();
        if (!a.equals(this.f18576E)) {
            this.f18576E = a;
            this.f18589i.mo55025b(14, new C7751p.C7752a() {
                public final void invoke(Object obj) {
                    C7822r.this.m22770d((C6814an.C6818b) obj);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo55238a(C7509p pVar) {
        mo55240a((List<C7509p>) Collections.singletonList(pVar));
    }

    /* renamed from: a */
    public void mo55239a(C7820q.C7821a aVar) {
        this.f18590j.add(aVar);
    }

    /* renamed from: a */
    public void mo55240a(List<C7509p> list) {
        mo55241a(list, true);
    }

    /* renamed from: a */
    public void mo55241a(List<C7509p> list, boolean z) {
        m22757a(list, -1, -9223372036854775807L, z);
    }

    /* renamed from: a */
    public void mo52770a(boolean z) {
        mo55242a(z, 0, 1);
    }

    /* renamed from: a */
    public void mo55242a(boolean z, int i, int i2) {
        if (this.f18578G.f14822l != z || this.f18578G.f14823m != i) {
            this.f18603w++;
            C6812al a = this.f18578G.mo52737a(z, i);
            this.f18588h.mo55254a(z, i);
            m22751a(a, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: a */
    public void mo55243a(boolean z, C7819p pVar) {
        C6812al alVar;
        if (z) {
            alVar = m22743a(0, this.f18592l.size()).mo52735a((C7819p) null);
        } else {
            C6812al alVar2 = this.f18578G;
            alVar = alVar2.mo52733a(alVar2.f14812b);
            alVar.f14827q = alVar.f14829s;
            alVar.f14828r = 0;
        }
        C6812al a = alVar.mo52730a(1);
        if (pVar != null) {
            a = a.mo52735a(pVar);
        }
        C6812al alVar3 = a;
        this.f18603w++;
        this.f18588h.mo55255b();
        m22751a(alVar3, 0, 1, false, alVar3.f14811a.mo53081d() && !this.f18578G.f14811a.mo53081d(), 4, m22738a(alVar3), -1);
    }

    /* renamed from: b */
    public void mo55244b(long j) {
        this.f18588h.mo55250a(j);
    }

    /* renamed from: b */
    public void mo52773b(SurfaceView surfaceView) {
    }

    /* renamed from: b */
    public void mo52774b(TextureView textureView) {
    }

    /* renamed from: b */
    public void mo55245b(C6814an.C6818b bVar) {
        this.f18589i.mo55026b(bVar);
    }

    /* renamed from: b */
    public void mo52775b(C6814an.C6820d dVar) {
        mo55245b((C6814an.C6818b) dVar);
    }

    /* renamed from: b */
    public void mo52776b(boolean z) {
        if (this.f18602v != z) {
            this.f18602v = z;
            this.f18588h.mo55253a(z);
            this.f18589i.mo55022a(9, new C7751p.C7752a(z) {
                public final /* synthetic */ boolean f$0;

                {
                    this.f$0 = r1;
                }

                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52524e(this.f$0);
                }
            });
            m22736X();
            this.f18589i.mo55021a();
        }
    }

    /* renamed from: c */
    public void mo52778c(int i) {
        if (this.f18601u != i) {
            this.f18601u = i;
            this.f18588h.mo55248a(i);
            this.f18589i.mo55022a(8, new C7751p.C7752a(i) {
                public final /* synthetic */ int f$0;

                {
                    this.f$0 = r1;
                }

                public final void invoke(Object obj) {
                    ((C6814an.C6818b) obj).mo52517d(this.f$0);
                }
            });
            m22736X();
            this.f18589i.mo55021a();
        }
    }

    /* renamed from: q */
    public boolean mo52868q() {
        return this.f18578G.f14826p;
    }

    /* renamed from: r */
    public Looper mo52784r() {
        return this.f18596p;
    }

    /* renamed from: s */
    public C6814an.C6816a mo52785s() {
        return this.f18575D;
    }

    /* renamed from: t */
    public int mo52786t() {
        return this.f18578G.f14815e;
    }

    /* renamed from: u */
    public int mo52787u() {
        return this.f18578G.f14823m;
    }

    /* renamed from: v */
    public C7819p mo52780e() {
        return this.f18578G.f14816f;
    }

    /* renamed from: w */
    public void mo52788w() {
        if (this.f18578G.f14815e == 1) {
            C6812al a = this.f18578G.mo52735a((C7819p) null);
            C6812al a2 = a.mo52730a(a.f14811a.mo53081d() ? 4 : 2);
            this.f18603w++;
            this.f18588h.mo55247a();
            m22751a(a2, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: x */
    public boolean mo52789x() {
        return this.f18578G.f14822l;
    }

    /* renamed from: y */
    public int mo52790y() {
        return this.f18601u;
    }

    /* renamed from: z */
    public boolean mo52791z() {
        return this.f18602v;
    }
}
