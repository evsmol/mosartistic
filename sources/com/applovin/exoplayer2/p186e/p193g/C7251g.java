package com.applovin.exoplayer2.p186e.p193g;

import android.util.Pair;
import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.p181b.C6853c;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7349r;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7356w;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p193g.C7233a;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.p204f.C7452b;
import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7762v;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.g.g */
public final class C7251g implements C7262h, C7353v {

    /* renamed from: a */
    public static final C7340l f16191a = $$Lambda$g$0AHKgn45xH3VxUATAkMAzUw_7_E.INSTANCE;

    /* renamed from: b */
    private final int f16192b;

    /* renamed from: c */
    private final C7772y f16193c;

    /* renamed from: d */
    private final C7772y f16194d;

    /* renamed from: e */
    private final C7772y f16195e;

    /* renamed from: f */
    private final C7772y f16196f;

    /* renamed from: g */
    private final ArrayDeque<C7233a.C7234a> f16197g;

    /* renamed from: h */
    private final C7255i f16198h;

    /* renamed from: i */
    private final List<C7399a.C7401a> f16199i;

    /* renamed from: j */
    private int f16200j;

    /* renamed from: k */
    private int f16201k;

    /* renamed from: l */
    private long f16202l;

    /* renamed from: m */
    private int f16203m;

    /* renamed from: n */
    private C7772y f16204n;

    /* renamed from: o */
    private int f16205o;

    /* renamed from: p */
    private int f16206p;

    /* renamed from: q */
    private int f16207q;

    /* renamed from: r */
    private int f16208r;

    /* renamed from: s */
    private C7329j f16209s;

    /* renamed from: t */
    private C7252a[] f16210t;

    /* renamed from: u */
    private long[][] f16211u;

    /* renamed from: v */
    private int f16212v;

    /* renamed from: w */
    private long f16213w;

    /* renamed from: x */
    private int f16214x;

    /* renamed from: y */
    private C7452b f16215y;

    /* renamed from: com.applovin.exoplayer2.e.g.g$a */
    private static final class C7252a {

        /* renamed from: a */
        public final C7258k f16216a;

        /* renamed from: b */
        public final C7261n f16217b;

        /* renamed from: c */
        public final C7357x f16218c;

        /* renamed from: d */
        public int f16219d;

        public C7252a(C7258k kVar, C7261n nVar, C7357x xVar) {
            this.f16216a = kVar;
            this.f16217b = nVar;
            this.f16218c = xVar;
        }
    }

    public C7251g() {
        this(0);
    }

    public C7251g(int i) {
        this.f16192b = i;
        this.f16200j = (i & 4) != 0 ? 3 : 0;
        this.f16198h = new C7255i();
        this.f16199i = new ArrayList();
        this.f16196f = new C7772y(16);
        this.f16197g = new ArrayDeque<>();
        this.f16193c = new C7772y(C7762v.f18312a);
        this.f16194d = new C7772y(4);
        this.f16195e = new C7772y();
        this.f16205o = -1;
    }

    /* renamed from: a */
    private static int m19735a(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static int m19736a(C7261n nVar, long j) {
        int a = nVar.mo53986a(j);
        return a == -1 ? nVar.mo53987b(j) : a;
    }

    /* renamed from: a */
    private static int m19737a(C7772y yVar) {
        yVar.mo55076d(8);
        int a = m19735a(yVar.mo55093q());
        if (a != 0) {
            return a;
        }
        yVar.mo55079e(4);
        while (yVar.mo55064a() > 0) {
            int a2 = m19735a(yVar.mo55093q());
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static long m19738a(C7261n nVar, long j, long j2) {
        int a = m19736a(nVar, j);
        return a == -1 ? j2 : Math.min(nVar.f16269c[a], j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C7258k m19739a(C7258k kVar) {
        return kVar;
    }

    /* renamed from: a */
    private void m19740a(C7233a.C7234a aVar) throws C6809ai {
        C7399a aVar2;
        C7399a aVar3;
        int i;
        List<C7261n> list;
        ArrayList arrayList;
        C7233a.C7234a aVar4 = aVar;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.f16214x == 1;
        C7349r rVar = new C7349r();
        C7233a.C7235b d = aVar4.mo53957d(1969517665);
        if (d != null) {
            Pair<C7399a, C7399a> a = C7236b.m19626a(d);
            C7399a aVar5 = (C7399a) a.first;
            C7399a aVar6 = (C7399a) a.second;
            if (aVar5 != null) {
                rVar.mo54086a(aVar5);
            }
            aVar3 = aVar6;
            aVar2 = aVar5;
        } else {
            aVar3 = null;
            aVar2 = null;
        }
        C7233a.C7234a e = aVar4.mo53958e(1835365473);
        C7399a a2 = e != null ? C7236b.m19632a(e) : null;
        List<C7261n> a3 = C7236b.m19634a(aVar, rVar, -9223372036854775807L, (C7148e) null, (this.f16192b & 1) != 0, z, (Function<C7258k, C7258k>) $$Lambda$g$63yPC0iSamo2bG8FUE7OCQhmrAE.INSTANCE);
        C7329j jVar = (C7329j) C7717a.m22120b(this.f16209s);
        int size = a3.size();
        int i2 = 0;
        int i3 = -1;
        long j = -9223372036854775807L;
        while (i2 < size) {
            C7261n nVar = a3.get(i2);
            if (nVar.f16268b == 0) {
                list = a3;
                i = size;
                arrayList = arrayList2;
            } else {
                C7258k kVar = nVar.f16267a;
                int i4 = i3;
                arrayList = arrayList2;
                long j2 = kVar.f16236e != -9223372036854775807L ? kVar.f16236e : nVar.f16274h;
                long max = Math.max(j, j2);
                list = a3;
                i = size;
                C7252a aVar7 = new C7252a(kVar, nVar, jVar.mo53894a(i2, kVar.f16233b));
                long j3 = max;
                C7864v.C7866a a4 = kVar.f16237f.mo55408a();
                a4.mo55434f(nVar.f16271e + 30);
                if (kVar.f16233b == 2 && j2 > 0 && nVar.f16268b > 1) {
                    a4.mo55415a(((float) nVar.f16268b) / (((float) j2) / 1000000.0f));
                }
                C7250f.m19729a(kVar.f16233b, rVar, a4);
                int i5 = kVar.f16233b;
                C7399a[] aVarArr = new C7399a[2];
                aVarArr[0] = aVar3;
                aVarArr[1] = this.f16199i.isEmpty() ? null : new C7399a((List<? extends C7399a.C7401a>) this.f16199i);
                C7250f.m19730a(i5, aVar2, a2, a4, aVarArr);
                aVar7.f16218c.mo53953a(a4.mo55424a());
                int i6 = i4;
                if (kVar.f16233b == 2) {
                    if (i6 == -1) {
                        i3 = arrayList.size();
                        arrayList.add(aVar7);
                        j = j3;
                    }
                }
                i3 = i6;
                arrayList.add(aVar7);
                j = j3;
            }
            i2++;
            arrayList2 = arrayList;
            a3 = list;
            size = i;
        }
        this.f16212v = i3;
        this.f16213w = j;
        C7252a[] aVarArr2 = (C7252a[]) arrayList2.toArray(new C7252a[0]);
        this.f16210t = aVarArr2;
        this.f16211u = m19741a(aVarArr2);
        jVar.mo53895a();
        jVar.mo53896a(this);
    }

    /* renamed from: a */
    private static long[][] m19741a(C7252a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].f16217b.f16268b];
            jArr2[i] = aVarArr[i].f16217b.f16272f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += (long) aVarArr[i3].f16217b.f16270d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = aVarArr[i3].f16217b.f16272f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: b */
    private void m19742b(long j) throws C6809ai {
        while (!this.f16197g.isEmpty() && this.f16197g.peek().f16100b == j) {
            C7233a.C7234a pop = this.f16197g.pop();
            if (pop.f16099a == 1836019574) {
                m19740a(pop);
                this.f16197g.clear();
                this.f16200j = 2;
            } else if (!this.f16197g.isEmpty()) {
                this.f16197g.peek().mo53955a(pop);
            }
        }
        if (this.f16200j != 2) {
            m19751d();
        }
    }

    /* renamed from: b */
    private static boolean m19743b(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m19744b(com.applovin.exoplayer2.p186e.C7279i r9) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.f16203m
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 != 0) goto L_0x002f
            com.applovin.exoplayer2.l.y r0 = r8.f16196f
            byte[] r0 = r0.mo55077d()
            boolean r0 = r9.mo53901a(r0, r3, r2, r1)
            if (r0 != 0) goto L_0x0018
            r8.m19753e()
            return r3
        L_0x0018:
            r8.f16203m = r2
            com.applovin.exoplayer2.l.y r0 = r8.f16196f
            r0.mo55076d(r3)
            com.applovin.exoplayer2.l.y r0 = r8.f16196f
            long r4 = r0.mo55091o()
            r8.f16202l = r4
            com.applovin.exoplayer2.l.y r0 = r8.f16196f
            int r0 = r0.mo55093q()
            r8.f16201k = r0
        L_0x002f:
            long r4 = r8.f16202l
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x004e
            com.applovin.exoplayer2.l.y r0 = r8.f16196f
            byte[] r0 = r0.mo55077d()
            r9.mo53903b(r0, r2, r2)
            int r0 = r8.f16203m
            int r0 = r0 + r2
            r8.f16203m = r0
            com.applovin.exoplayer2.l.y r0 = r8.f16196f
            long r4 = r0.mo55101y()
        L_0x004b:
            r8.f16202l = r4
            goto L_0x0078
        L_0x004e:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0078
            long r4 = r9.mo53893d()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x006a
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r0 = r8.f16197g
            java.lang.Object r0 = r0.peek()
            com.applovin.exoplayer2.e.g.a$a r0 = (com.applovin.exoplayer2.p186e.p193g.C7233a.C7234a) r0
            if (r0 == 0) goto L_0x006a
            long r4 = r0.f16100b
        L_0x006a:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0078
            long r6 = r9.mo53892c()
            long r4 = r4 - r6
            int r0 = r8.f16203m
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x004b
        L_0x0078:
            long r4 = r8.f16202l
            int r0 = r8.f16203m
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0108
            int r0 = r8.f16201k
            boolean r0 = m19749c((int) r0)
            if (r0 == 0) goto L_0x00c0
            long r2 = r9.mo53892c()
            long r4 = r8.f16202l
            long r2 = r2 + r4
            int r0 = r8.f16203m
            long r6 = (long) r0
            long r2 = r2 - r6
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00a3
            int r0 = r8.f16201k
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r0 != r4) goto L_0x00a3
            r8.m19748c((com.applovin.exoplayer2.p186e.C7279i) r9)
        L_0x00a3:
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r9 = r8.f16197g
            com.applovin.exoplayer2.e.g.a$a r0 = new com.applovin.exoplayer2.e.g.a$a
            int r4 = r8.f16201k
            r0.<init>(r4, r2)
            r9.push(r0)
            long r4 = r8.f16202l
            int r9 = r8.f16203m
            long r6 = (long) r9
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00bc
            r8.m19742b((long) r2)
            goto L_0x0107
        L_0x00bc:
            r8.m19751d()
            goto L_0x0107
        L_0x00c0:
            int r0 = r8.f16201k
            boolean r0 = m19743b((int) r0)
            if (r0 == 0) goto L_0x00f7
            int r9 = r8.f16203m
            if (r9 != r2) goto L_0x00ce
            r9 = 1
            goto L_0x00cf
        L_0x00ce:
            r9 = 0
        L_0x00cf:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r9)
            long r4 = r8.f16202l
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x00dd
            r9 = 1
            goto L_0x00de
        L_0x00dd:
            r9 = 0
        L_0x00de:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r9)
            com.applovin.exoplayer2.l.y r9 = new com.applovin.exoplayer2.l.y
            long r4 = r8.f16202l
            int r0 = (int) r4
            r9.<init>((int) r0)
            com.applovin.exoplayer2.l.y r0 = r8.f16196f
            byte[] r0 = r0.mo55077d()
            byte[] r4 = r9.mo55077d()
            java.lang.System.arraycopy(r0, r3, r4, r3, r2)
            goto L_0x0103
        L_0x00f7:
            long r2 = r9.mo53892c()
            int r9 = r8.f16203m
            long r4 = (long) r9
            long r2 = r2 - r4
            r8.m19754e(r2)
            r9 = 0
        L_0x0103:
            r8.f16204n = r9
            r8.f16200j = r1
        L_0x0107:
            return r1
        L_0x0108:
            java.lang.String r9 = "Atom size less than header length (unsupported)."
            com.applovin.exoplayer2.ai r9 = com.applovin.exoplayer2.C6809ai.m17538a(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p193g.C7251g.m19744b(com.applovin.exoplayer2.e.i):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m19745b(com.applovin.exoplayer2.p186e.C7279i r10, com.applovin.exoplayer2.p186e.C7352u r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.f16202l
            int r2 = r9.f16203m
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.mo53892c()
            long r2 = r2 + r0
            com.applovin.exoplayer2.l.y r4 = r9.f16204n
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0044
            byte[] r11 = r4.mo55077d()
            int r7 = r9.f16203m
            int r1 = (int) r0
            r10.mo53903b(r11, r7, r1)
            int r10 = r9.f16201k
            r11 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r11) goto L_0x0029
            int r10 = m19737a((com.applovin.exoplayer2.p221l.C7772y) r4)
            r9.f16214x = r10
            goto L_0x004f
        L_0x0029:
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r10 = r9.f16197g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x004f
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r10 = r9.f16197g
            java.lang.Object r10 = r10.peek()
            com.applovin.exoplayer2.e.g.a$a r10 = (com.applovin.exoplayer2.p186e.p193g.C7233a.C7234a) r10
            com.applovin.exoplayer2.e.g.a$b r11 = new com.applovin.exoplayer2.e.g.a$b
            int r0 = r9.f16201k
            r11.<init>(r0, r4)
            r10.mo53956a((com.applovin.exoplayer2.p186e.p193g.C7233a.C7235b) r11)
            goto L_0x004f
        L_0x0044:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0051
            int r11 = (int) r0
            r10.mo53902b(r11)
        L_0x004f:
            r10 = 0
            goto L_0x0059
        L_0x0051:
            long r7 = r10.mo53892c()
            long r7 = r7 + r0
            r11.f16774a = r7
            r10 = 1
        L_0x0059:
            r9.m19742b((long) r2)
            if (r10 == 0) goto L_0x0064
            int r10 = r9.f16200j
            r11 = 2
            if (r10 == r11) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p193g.C7251g.m19745b(com.applovin.exoplayer2.e.i, com.applovin.exoplayer2.e.u):boolean");
    }

    /* renamed from: c */
    private int m19746c(long j) {
        int i = -1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < ((C7252a[]) C7728ai.m22198a(this.f16210t)).length; i3++) {
            C7252a aVar = this.f16210t[i3];
            int i4 = aVar.f16219d;
            if (i4 != aVar.f16217b.f16268b) {
                long j5 = aVar.f16217b.f16269c[i4];
                long j6 = ((long[][]) C7728ai.m22198a(this.f16211u))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    /* renamed from: c */
    private int m19747c(C7279i iVar, C7352u uVar) throws IOException {
        int a = this.f16198h.mo53976a(iVar, uVar, this.f16199i);
        if (a == 1 && uVar.f16774a == 0) {
            m19751d();
        }
        return a;
    }

    /* renamed from: c */
    private void m19748c(C7279i iVar) throws IOException {
        this.f16195e.mo55067a(8);
        iVar.mo53908d(this.f16195e.mo55077d(), 0, 8);
        C7236b.m19635a(this.f16195e);
        iVar.mo53902b(this.f16195e.mo55074c());
        iVar.mo53899a();
    }

    /* renamed from: c */
    private static boolean m19749c(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* renamed from: d */
    private int m19750d(C7279i iVar, C7352u uVar) throws IOException {
        long c = iVar.mo53892c();
        if (this.f16205o == -1) {
            int c2 = m19746c(c);
            this.f16205o = c2;
            if (c2 == -1) {
                return -1;
            }
        }
        C7252a aVar = ((C7252a[]) C7728ai.m22198a(this.f16210t))[this.f16205o];
        C7357x xVar = aVar.f16218c;
        int i = aVar.f16219d;
        long j = aVar.f16217b.f16269c[i];
        int i2 = aVar.f16217b.f16270d[i];
        long j2 = (j - c) + ((long) this.f16206p);
        if (j2 < 0 || j2 >= 262144) {
            uVar.f16774a = j;
            return 1;
        }
        if (aVar.f16216a.f16238g == 1) {
            j2 += 8;
            i2 -= 8;
        }
        iVar.mo53902b((int) j2);
        if (aVar.f16216a.f16241j == 0) {
            if ("audio/ac4".equals(aVar.f16216a.f16237f.f18921l)) {
                if (this.f16207q == 0) {
                    C6853c.m17947a(i2, this.f16195e);
                    xVar.mo53951a(this.f16195e, 7);
                    this.f16207q += 7;
                }
                i2 += 7;
            }
            while (true) {
                int i3 = this.f16207q;
                if (i3 >= i2) {
                    break;
                }
                int a = xVar.mo53948a((C7668g) iVar, i2 - i3, false);
                this.f16206p += a;
                this.f16207q += a;
                this.f16208r -= a;
            }
        } else {
            byte[] d = this.f16194d.mo55077d();
            d[0] = 0;
            d[1] = 0;
            d[2] = 0;
            int i4 = aVar.f16216a.f16241j;
            int i5 = 4 - aVar.f16216a.f16241j;
            while (this.f16207q < i2) {
                int i6 = this.f16208r;
                if (i6 == 0) {
                    iVar.mo53903b(d, i5, i4);
                    this.f16206p += i4;
                    this.f16194d.mo55076d(0);
                    int q = this.f16194d.mo55093q();
                    if (q >= 0) {
                        this.f16208r = q;
                        this.f16193c.mo55076d(0);
                        xVar.mo53951a(this.f16193c, 4);
                        this.f16207q += 4;
                        i2 += i5;
                    } else {
                        throw C6809ai.m17540b("Invalid NAL length", (Throwable) null);
                    }
                } else {
                    int a2 = xVar.mo53948a((C7668g) iVar, i6, false);
                    this.f16206p += a2;
                    this.f16207q += a2;
                    this.f16208r -= a2;
                }
            }
        }
        xVar.mo53950a(aVar.f16217b.f16272f[i], aVar.f16217b.f16273g[i], i2, 0, (C7357x.C7358a) null);
        aVar.f16219d++;
        this.f16205o = -1;
        this.f16206p = 0;
        this.f16207q = 0;
        this.f16208r = 0;
        return 0;
    }

    /* renamed from: d */
    private void m19751d() {
        this.f16200j = 0;
        this.f16203m = 0;
    }

    /* renamed from: d */
    private void m19752d(long j) {
        for (C7252a aVar : this.f16210t) {
            C7261n nVar = aVar.f16217b;
            int a = nVar.mo53986a(j);
            if (a == -1) {
                a = nVar.mo53987b(j);
            }
            aVar.f16219d = a;
        }
    }

    /* renamed from: e */
    private void m19753e() {
        C7399a aVar;
        if (this.f16214x == 2 && (this.f16192b & 2) != 0) {
            C7329j jVar = (C7329j) C7717a.m22120b(this.f16209s);
            C7357x a = jVar.mo53894a(0, 4);
            if (this.f16215y == null) {
                aVar = null;
            } else {
                aVar = new C7399a(this.f16215y);
            }
            a.mo53953a(new C7864v.C7866a().mo55419a(aVar).mo55424a());
            jVar.mo53895a();
            jVar.mo53896a(new C7353v.C7355b(-9223372036854775807L));
        }
    }

    /* renamed from: e */
    private void m19754e(long j) {
        if (this.f16201k == 1836086884) {
            int i = this.f16203m;
            this.f16215y = new C7452b(0, j, -9223372036854775807L, j + ((long) i), this.f16202l - ((long) i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ C7262h[] m19755f() {
        return new C7262h[]{new C7251g()};
    }

    /* renamed from: a */
    public int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        while (true) {
            int i = this.f16200j;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m19750d(iVar, uVar);
                    }
                    if (i == 3) {
                        return m19747c(iVar, uVar);
                    }
                    throw new IllegalStateException();
                } else if (m19745b(iVar, uVar)) {
                    return 1;
                }
            } else if (!m19744b(iVar)) {
                return -1;
            }
        }
    }

    /* renamed from: a */
    public C7353v.C7354a mo53869a(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        if (((C7252a[]) C7717a.m22120b(this.f16210t)).length == 0) {
            return new C7353v.C7354a(C7356w.f16779a);
        }
        int i = this.f16212v;
        if (i != -1) {
            C7261n nVar = this.f16210t[i].f16217b;
            int a = m19736a(nVar, j);
            if (a == -1) {
                return new C7353v.C7354a(C7356w.f16779a);
            }
            long j6 = nVar.f16272f[a];
            j2 = nVar.f16269c[a];
            if (j6 >= j || a >= nVar.f16268b - 1 || (b = nVar.mo53987b(j)) == -1 || b == a) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = nVar.f16272f[b];
                j5 = nVar.f16269c[b];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C7252a[] aVarArr = this.f16210t;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (i2 != this.f16212v) {
                C7261n nVar2 = aVarArr[i2].f16217b;
                long a2 = m19738a(nVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = m19738a(nVar2, j4, j3);
                }
                j2 = a2;
            }
            i2++;
        }
        C7356w wVar = new C7356w(j, j2);
        return j4 == -9223372036854775807L ? new C7353v.C7354a(wVar) : new C7353v.C7354a(wVar, new C7356w(j4, j3));
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        this.f16197g.clear();
        this.f16203m = 0;
        this.f16205o = -1;
        this.f16206p = 0;
        this.f16207q = 0;
        this.f16208r = 0;
        if (j == 0) {
            if (this.f16200j != 3) {
                m19751d();
                return;
            }
            this.f16198h.mo53977a();
            this.f16199i.clear();
        } else if (this.f16210t != null) {
            m19752d(j2);
        }
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f16209s = jVar;
    }

    /* renamed from: a */
    public boolean mo53870a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        return C7257j.m19783a(iVar, (this.f16192b & 2) != 0);
    }

    /* renamed from: b */
    public long mo53871b() {
        return this.f16213w;
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
