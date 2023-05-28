package com.applovin.exoplayer2.p186e.p193g;

import android.util.Pair;
import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p186e.C7339k;
import com.applovin.exoplayer2.p186e.C7349r;
import com.applovin.exoplayer2.p186e.p193g.C7233a;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.p204f.C7450a;
import com.applovin.exoplayer2.p198g.p204f.C7458d;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7759u;
import com.applovin.exoplayer2.p221l.C7772y;
import com.applovin.exoplayer2.p222m.C7776a;
import com.applovin.exoplayer2.p222m.C7790b;
import com.applovin.exoplayer2.p222m.C7791c;
import com.applovin.exoplayer2.p222m.C7797f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.e.g.b */
final class C7236b {

    /* renamed from: a */
    private static final byte[] f16104a = C7728ai.m22250c("OpusHead");

    /* renamed from: com.applovin.exoplayer2.e.g.b$a */
    private static final class C7237a {

        /* renamed from: a */
        public final int f16105a;

        /* renamed from: b */
        public int f16106b;

        /* renamed from: c */
        public int f16107c;

        /* renamed from: d */
        public long f16108d;

        /* renamed from: e */
        private final boolean f16109e;

        /* renamed from: f */
        private final C7772y f16110f;

        /* renamed from: g */
        private final C7772y f16111g;

        /* renamed from: h */
        private int f16112h;

        /* renamed from: i */
        private int f16113i;

        public C7237a(C7772y yVar, C7772y yVar2, boolean z) throws C6809ai {
            this.f16111g = yVar;
            this.f16110f = yVar2;
            this.f16109e = z;
            yVar2.mo55076d(12);
            this.f16105a = yVar2.mo55099w();
            yVar.mo55076d(12);
            this.f16113i = yVar.mo55099w();
            C7339k.m20220a(yVar.mo55093q() != 1 ? false : true, "first_chunk must be 1");
            this.f16106b = -1;
        }

        /* renamed from: a */
        public boolean mo53959a() {
            int i = this.f16106b + 1;
            this.f16106b = i;
            if (i == this.f16105a) {
                return false;
            }
            this.f16108d = this.f16109e ? this.f16110f.mo55101y() : this.f16110f.mo55091o();
            if (this.f16106b == this.f16112h) {
                this.f16107c = this.f16111g.mo55099w();
                this.f16111g.mo55079e(4);
                int i2 = this.f16113i - 1;
                this.f16113i = i2;
                this.f16112h = i2 > 0 ? this.f16111g.mo55099w() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.g.b$b */
    private interface C7238b {
        /* renamed from: a */
        int mo53960a();

        /* renamed from: b */
        int mo53961b();

        /* renamed from: c */
        int mo53962c();
    }

    /* renamed from: com.applovin.exoplayer2.e.g.b$c */
    private static final class C7239c {

        /* renamed from: a */
        public final C7259l[] f16114a;

        /* renamed from: b */
        public C7864v f16115b;

        /* renamed from: c */
        public int f16116c;

        /* renamed from: d */
        public int f16117d = 0;

        public C7239c(int i) {
            this.f16114a = new C7259l[i];
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.g.b$d */
    static final class C7240d implements C7238b {

        /* renamed from: a */
        private final int f16118a;

        /* renamed from: b */
        private final int f16119b;

        /* renamed from: c */
        private final C7772y f16120c;

        public C7240d(C7233a.C7235b bVar, C7864v vVar) {
            C7772y yVar = bVar.f16103b;
            this.f16120c = yVar;
            yVar.mo55076d(12);
            int w = this.f16120c.mo55099w();
            if ("audio/raw".equals(vVar.f18921l)) {
                int c = C7728ai.m22244c(vVar.f18904A, vVar.f18934y);
                if (w == 0 || w % c != 0) {
                    C7755q.m22361c("AtomParsers", "Audio sample size mismatch. stsd sample size: " + c + ", stsz sample size: " + w);
                    w = c;
                }
            }
            this.f16118a = w == 0 ? -1 : w;
            this.f16119b = this.f16120c.mo55099w();
        }

        /* renamed from: a */
        public int mo53960a() {
            return this.f16119b;
        }

        /* renamed from: b */
        public int mo53961b() {
            return this.f16118a;
        }

        /* renamed from: c */
        public int mo53962c() {
            int i = this.f16118a;
            return i == -1 ? this.f16120c.mo55099w() : i;
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.g.b$e */
    static final class C7241e implements C7238b {

        /* renamed from: a */
        private final C7772y f16121a;

        /* renamed from: b */
        private final int f16122b = this.f16121a.mo55099w();

        /* renamed from: c */
        private final int f16123c = (this.f16121a.mo55099w() & KotlinVersion.MAX_COMPONENT_VALUE);

        /* renamed from: d */
        private int f16124d;

        /* renamed from: e */
        private int f16125e;

        public C7241e(C7233a.C7235b bVar) {
            C7772y yVar = bVar.f16103b;
            this.f16121a = yVar;
            yVar.mo55076d(12);
        }

        /* renamed from: a */
        public int mo53960a() {
            return this.f16122b;
        }

        /* renamed from: b */
        public int mo53961b() {
            return -1;
        }

        /* renamed from: c */
        public int mo53962c() {
            int i = this.f16123c;
            if (i == 8) {
                return this.f16121a.mo55084h();
            }
            if (i == 16) {
                return this.f16121a.mo55085i();
            }
            int i2 = this.f16124d;
            this.f16124d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f16125e & 15;
            }
            int h = this.f16121a.mo55084h();
            this.f16125e = h;
            return (h & 240) >> 4;
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.g.b$f */
    private static final class C7242f {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f16126a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f16127b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f16128c;

        public C7242f(int i, long j, int i2) {
            this.f16126a = i;
            this.f16127b = j;
            this.f16128c = i2;
        }
    }

    /* renamed from: a */
    private static int m19625a(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* renamed from: a */
    public static Pair<C7399a, C7399a> m19626a(C7233a.C7235b bVar) {
        C7772y yVar = bVar.f16103b;
        yVar.mo55076d(8);
        C7399a aVar = null;
        C7399a aVar2 = null;
        while (yVar.mo55064a() >= 8) {
            int c = yVar.mo55074c();
            int q = yVar.mo55093q();
            int q2 = yVar.mo55093q();
            if (q2 == 1835365473) {
                yVar.mo55076d(c);
                aVar = m19633a(yVar, c + q);
            } else if (q2 == 1936553057) {
                yVar.mo55076d(c);
                aVar2 = m19647c(yVar, c + q);
            }
            yVar.mo55076d(c + q);
        }
        return Pair.create(aVar, aVar2);
    }

    /* renamed from: a */
    static Pair<Integer, C7259l> m19627a(C7772y yVar, int i, int i2) throws C6809ai {
        int i3 = i + 8;
        boolean z = false;
        String str = null;
        Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            yVar.mo55076d(i3);
            int q = yVar.mo55093q();
            int q2 = yVar.mo55093q();
            if (q2 == 1718775137) {
                num = Integer.valueOf(yVar.mo55093q());
            } else if (q2 == 1935894637) {
                yVar.mo55079e(4);
                str = yVar.mo55081f(4);
            } else if (q2 == 1935894633) {
                i4 = i3;
                i5 = q;
            }
            i3 += q;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C7339k.m20220a(num != null, "frma atom is mandatory");
        C7339k.m20220a(i4 != -1, "schi atom is mandatory");
        C7259l a = m19630a(yVar, i4, i5, str);
        if (a != null) {
            z = true;
        }
        C7339k.m20220a(z, "tenc atom is mandatory");
        return Pair.create(num, (C7259l) C7728ai.m22198a(a));
    }

    /* renamed from: a */
    private static C7239c m19628a(C7772y yVar, int i, int i2, String str, C7148e eVar, boolean z) throws C6809ai {
        int i3;
        C7772y yVar2 = yVar;
        int i4 = i;
        yVar2.mo55076d(12);
        int q = yVar.mo55093q();
        C7239c cVar = new C7239c(q);
        for (int i5 = 0; i5 < q; i5++) {
            int c = yVar.mo55074c();
            int q2 = yVar.mo55093q();
            C7339k.m20220a(q2 > 0, "childAtomSize must be positive");
            int q3 = yVar.mo55093q();
            if (q3 == 1635148593 || q3 == 1635148595 || q3 == 1701733238 || q3 == 1831958048 || q3 == 1836070006 || q3 == 1752589105 || q3 == 1751479857 || q3 == 1932670515 || q3 == 1211250227 || q3 == 1987063864 || q3 == 1987063865 || q3 == 1635135537 || q3 == 1685479798 || q3 == 1685479729 || q3 == 1685481573 || q3 == 1685481521) {
                i3 = c;
                m19636a(yVar, q3, i3, q2, i, i2, eVar, cVar, i5);
            } else if (q3 == 1836069985 || q3 == 1701733217 || q3 == 1633889587 || q3 == 1700998451 || q3 == 1633889588 || q3 == 1685353315 || q3 == 1685353317 || q3 == 1685353320 || q3 == 1685353324 || q3 == 1685353336 || q3 == 1935764850 || q3 == 1935767394 || q3 == 1819304813 || q3 == 1936684916 || q3 == 1953984371 || q3 == 778924082 || q3 == 778924083 || q3 == 1835557169 || q3 == 1835560241 || q3 == 1634492771 || q3 == 1634492791 || q3 == 1970037111 || q3 == 1332770163 || q3 == 1716281667) {
                i3 = c;
                m19638a(yVar, q3, c, q2, i, str, z, eVar, cVar, i5);
            } else {
                if (q3 == 1414810956 || q3 == 1954034535 || q3 == 2004251764 || q3 == 1937010800 || q3 == 1664495672) {
                    m19637a(yVar, q3, c, q2, i, str, cVar);
                } else if (q3 == 1835365492) {
                    m19639a(yVar2, q3, c, i4, cVar);
                } else if (q3 == 1667329389) {
                    cVar.f16115b = new C7864v.C7866a().mo55416a(i4).mo55435f("application/x-camera-motion").mo55424a();
                }
                i3 = c;
            }
            yVar2.mo55076d(i3 + q2);
        }
        return cVar;
    }

    /* renamed from: a */
    private static C7258k m19629a(C7233a.C7234a aVar, C7233a.C7235b bVar, long j, C7148e eVar, boolean z, boolean z2) throws C6809ai {
        long j2;
        C7233a.C7235b bVar2;
        long[] jArr;
        long[] jArr2;
        C7233a.C7234a e;
        Pair<long[], long[]> b;
        C7233a.C7234a aVar2 = aVar;
        C7233a.C7234a aVar3 = (C7233a.C7234a) C7717a.m22120b(aVar2.mo53958e(1835297121));
        int a = m19625a(m19649d(((C7233a.C7235b) C7717a.m22120b(aVar3.mo53957d(1751411826))).f16103b));
        if (a == -1) {
            return null;
        }
        C7242f c = m19646c(((C7233a.C7235b) C7717a.m22120b(aVar2.mo53957d(1953196132))).f16103b);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = c.f16127b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long b2 = m19642b(bVar2.f16103b);
        if (j2 != -9223372036854775807L) {
            j3 = C7728ai.m22252d(j2, 1000000, b2);
        }
        long j4 = j3;
        Pair<Long, String> e2 = m19651e(((C7233a.C7235b) C7717a.m22120b(aVar3.mo53957d(1835296868))).f16103b);
        C7239c a2 = m19628a(((C7233a.C7235b) C7717a.m22120b(((C7233a.C7234a) C7717a.m22120b(((C7233a.C7234a) C7717a.m22120b(aVar3.mo53958e(1835626086))).mo53958e(1937007212))).mo53957d(1937011556))).f16103b, c.f16126a, c.f16128c, (String) e2.second, eVar, z2);
        if (z || (e = aVar2.mo53958e(1701082227)) == null || (b = m19643b(e)) == null) {
            jArr2 = null;
            jArr = null;
        } else {
            jArr = (long[]) b.second;
            jArr2 = (long[]) b.first;
        }
        if (a2.f16115b == null) {
            return null;
        }
        return new C7258k(c.f16126a, a, ((Long) e2.first).longValue(), b2, j4, a2.f16115b, a2.f16117d, a2.f16114a, a2.f16116c, jArr2, jArr);
    }

    /* renamed from: a */
    private static C7259l m19630a(C7772y yVar, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            yVar.mo55076d(i5);
            int q = yVar.mo55093q();
            if (yVar.mo55093q() == 1952804451) {
                int a = C7233a.m19618a(yVar.mo55093q());
                yVar.mo55079e(1);
                if (a == 0) {
                    yVar.mo55079e(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int h = yVar.mo55084h();
                    i3 = h & 15;
                    i4 = (h & 240) >> 4;
                }
                boolean z = yVar.mo55084h() == 1;
                int h2 = yVar.mo55084h();
                byte[] bArr2 = new byte[16];
                yVar.mo55071a(bArr2, 0, 16);
                if (z && h2 == 0) {
                    int h3 = yVar.mo55084h();
                    bArr = new byte[h3];
                    yVar.mo55071a(bArr, 0, h3);
                }
                return new C7259l(z, str, h2, bArr2, i4, i3, bArr);
            }
            i5 += q;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0135  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.p186e.p193g.C7261n m19631a(com.applovin.exoplayer2.p186e.p193g.C7258k r38, com.applovin.exoplayer2.p186e.p193g.C7233a.C7234a r39, com.applovin.exoplayer2.p186e.C7349r r40) throws com.applovin.exoplayer2.C6809ai {
        /*
            r1 = r38
            r0 = r39
            r2 = r40
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            com.applovin.exoplayer2.e.g.a$b r3 = r0.mo53957d(r3)
            if (r3 == 0) goto L_0x0017
            com.applovin.exoplayer2.e.g.b$d r5 = new com.applovin.exoplayer2.e.g.b$d
            com.applovin.exoplayer2.v r6 = r1.f16237f
            r5.<init>(r3, r6)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            com.applovin.exoplayer2.e.g.a$b r3 = r0.mo53957d(r3)
            if (r3 == 0) goto L_0x052e
            com.applovin.exoplayer2.e.g.b$e r5 = new com.applovin.exoplayer2.e.g.b$e
            r5.<init>(r3)
        L_0x0025:
            int r3 = r5.mo53960a()
            r6 = 0
            if (r3 != 0) goto L_0x0040
            com.applovin.exoplayer2.e.g.n r9 = new com.applovin.exoplayer2.e.g.n
            long[] r2 = new long[r6]
            int[] r3 = new int[r6]
            r4 = 0
            long[] r5 = new long[r6]
            int[] r6 = new int[r6]
            r7 = 0
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0040:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            com.applovin.exoplayer2.e.g.a$b r7 = r0.mo53957d(r7)
            r8 = 1
            if (r7 != 0) goto L_0x0059
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            com.applovin.exoplayer2.e.g.a$b r7 = r0.mo53957d(r7)
            java.lang.Object r7 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r7)
            com.applovin.exoplayer2.e.g.a$b r7 = (com.applovin.exoplayer2.p186e.p193g.C7233a.C7235b) r7
            r9 = 1
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            com.applovin.exoplayer2.l.y r7 = r7.f16103b
            r10 = 1937011555(0x73747363, float:1.9367382E31)
            com.applovin.exoplayer2.e.g.a$b r10 = r0.mo53957d(r10)
            java.lang.Object r10 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r10)
            com.applovin.exoplayer2.e.g.a$b r10 = (com.applovin.exoplayer2.p186e.p193g.C7233a.C7235b) r10
            com.applovin.exoplayer2.l.y r10 = r10.f16103b
            r11 = 1937011827(0x73747473, float:1.9367711E31)
            com.applovin.exoplayer2.e.g.a$b r11 = r0.mo53957d(r11)
            java.lang.Object r11 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r11)
            com.applovin.exoplayer2.e.g.a$b r11 = (com.applovin.exoplayer2.p186e.p193g.C7233a.C7235b) r11
            com.applovin.exoplayer2.l.y r11 = r11.f16103b
            r12 = 1937011571(0x73747373, float:1.9367401E31)
            com.applovin.exoplayer2.e.g.a$b r12 = r0.mo53957d(r12)
            if (r12 == 0) goto L_0x0086
            com.applovin.exoplayer2.l.y r12 = r12.f16103b
            goto L_0x0087
        L_0x0086:
            r12 = 0
        L_0x0087:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            com.applovin.exoplayer2.e.g.a$b r0 = r0.mo53957d(r13)
            if (r0 == 0) goto L_0x0093
            com.applovin.exoplayer2.l.y r0 = r0.f16103b
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            com.applovin.exoplayer2.e.g.b$a r13 = new com.applovin.exoplayer2.e.g.b$a
            r13.<init>(r10, r7, r9)
            r7 = 12
            r11.mo55076d(r7)
            int r9 = r11.mo55099w()
            int r9 = r9 - r8
            int r10 = r11.mo55099w()
            int r14 = r11.mo55099w()
            if (r0 == 0) goto L_0x00b5
            r0.mo55076d(r7)
            int r15 = r0.mo55099w()
            goto L_0x00b6
        L_0x00b5:
            r15 = 0
        L_0x00b6:
            r4 = -1
            if (r12 == 0) goto L_0x00cb
            r12.mo55076d(r7)
            int r7 = r12.mo55099w()
            if (r7 <= 0) goto L_0x00c9
            int r16 = r12.mo55099w()
            int r16 = r16 + -1
            goto L_0x00ce
        L_0x00c9:
            r12 = 0
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            r16 = -1
        L_0x00ce:
            int r6 = r5.mo53961b()
            com.applovin.exoplayer2.v r8 = r1.f16237f
            java.lang.String r8 = r8.f18921l
            if (r6 == r4) goto L_0x00fa
            java.lang.String r4 = "audio/raw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f0
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f0
            java.lang.String r4 = "audio/g711-alaw"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x00fa
        L_0x00f0:
            if (r9 != 0) goto L_0x00fa
            if (r15 != 0) goto L_0x00fa
            if (r7 != 0) goto L_0x00fa
            r39 = r7
            r4 = 1
            goto L_0x00fd
        L_0x00fa:
            r39 = r7
            r4 = 0
        L_0x00fd:
            if (r4 == 0) goto L_0x0135
            int r0 = r13.f16105a
            long[] r0 = new long[r0]
            int r4 = r13.f16105a
            int[] r4 = new int[r4]
        L_0x0107:
            boolean r5 = r13.mo53959a()
            if (r5 == 0) goto L_0x011a
            int r5 = r13.f16106b
            long r9 = r13.f16108d
            r0[r5] = r9
            int r5 = r13.f16106b
            int r9 = r13.f16107c
            r4[r5] = r9
            goto L_0x0107
        L_0x011a:
            long r9 = (long) r14
            com.applovin.exoplayer2.e.g.d$a r0 = com.applovin.exoplayer2.p186e.p193g.C7244d.m19667a(r6, r0, r4, r9)
            long[] r4 = r0.f16133a
            int[] r5 = r0.f16134b
            int r6 = r0.f16135c
            long[] r9 = r0.f16136d
            int[] r10 = r0.f16137e
            long r11 = r0.f16138f
            r14 = r1
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r13 = r10
            r15 = r11
            r12 = r9
            goto L_0x02a4
        L_0x0135:
            long[] r4 = new long[r3]
            int[] r6 = new int[r3]
            long[] r7 = new long[r3]
            int[] r8 = new int[r3]
            r24 = r11
            r2 = r16
            r1 = 0
            r11 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r16 = r15
            r15 = r14
            r14 = r10
            r37 = r9
            r9 = r39
        L_0x0155:
            r39 = r37
            java.lang.String r10 = "AtomParsers"
            if (r1 >= r3) goto L_0x021d
            r28 = r27
            r27 = r22
            r22 = 1
        L_0x0161:
            if (r27 != 0) goto L_0x017e
            boolean r22 = r13.mo53959a()
            if (r22 == 0) goto L_0x017e
            r30 = r14
            r31 = r15
            long r14 = r13.f16108d
            r32 = r3
            int r3 = r13.f16107c
            r27 = r3
            r28 = r14
            r14 = r30
            r15 = r31
            r3 = r32
            goto L_0x0161
        L_0x017e:
            r32 = r3
            r30 = r14
            r31 = r15
            if (r22 != 0) goto L_0x01a2
            java.lang.String r2 = "Unexpected end of chunk data"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r10, r2)
            long[] r4 = java.util.Arrays.copyOf(r4, r1)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r8 = java.util.Arrays.copyOf(r8, r1)
            r3 = r1
            r2 = r21
            r1 = r27
            goto L_0x0225
        L_0x01a2:
            if (r0 == 0) goto L_0x01b5
        L_0x01a4:
            if (r23 != 0) goto L_0x01b3
            if (r16 <= 0) goto L_0x01b3
            int r23 = r0.mo55099w()
            int r21 = r0.mo55093q()
            int r16 = r16 + -1
            goto L_0x01a4
        L_0x01b3:
            int r23 = r23 + -1
        L_0x01b5:
            r3 = r21
            r4[r1] = r28
            int r10 = r5.mo53962c()
            r6[r1] = r10
            r10 = r6[r1]
            if (r10 <= r11) goto L_0x01c6
            r10 = r6[r1]
            r11 = r10
        L_0x01c6:
            long r14 = (long) r3
            long r14 = r25 + r14
            r7[r1] = r14
            if (r12 != 0) goto L_0x01cf
            r10 = 1
            goto L_0x01d0
        L_0x01cf:
            r10 = 0
        L_0x01d0:
            r8[r1] = r10
            if (r1 != r2) goto L_0x01e6
            r10 = 1
            r8[r1] = r10
            int r9 = r9 + -1
            if (r9 <= 0) goto L_0x01e6
            java.lang.Object r2 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r12)
            com.applovin.exoplayer2.l.y r2 = (com.applovin.exoplayer2.p221l.C7772y) r2
            int r2 = r2.mo55099w()
            int r2 = r2 - r10
        L_0x01e6:
            r15 = r2
            r10 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r30 + -1
            if (r2 != 0) goto L_0x01fe
            if (r39 <= 0) goto L_0x01fe
            int r2 = r24.mo55099w()
            int r3 = r24.mo55093q()
            int r14 = r39 + -1
            goto L_0x0201
        L_0x01fe:
            r3 = r14
            r14 = r39
        L_0x0201:
            r39 = r2
            r2 = r6[r1]
            r21 = r3
            long r2 = (long) r2
            long r2 = r28 + r2
            int r22 = r27 + -1
            int r1 = r1 + 1
            r27 = r2
            r2 = r15
            r15 = r21
            r3 = r32
            r21 = r10
            r37 = r14
            r14 = r39
            goto L_0x0155
        L_0x021d:
            r32 = r3
            r30 = r14
            r2 = r21
            r1 = r22
        L_0x0225:
            long r12 = (long) r2
            long r12 = r25 + r12
            if (r0 == 0) goto L_0x023a
        L_0x022a:
            if (r16 <= 0) goto L_0x023a
            int r2 = r0.mo55099w()
            if (r2 == 0) goto L_0x0234
            r0 = 0
            goto L_0x023b
        L_0x0234:
            r0.mo55093q()
            int r16 = r16 + -1
            goto L_0x022a
        L_0x023a:
            r0 = 1
        L_0x023b:
            if (r9 != 0) goto L_0x024d
            if (r30 != 0) goto L_0x024d
            if (r1 != 0) goto L_0x024d
            if (r39 != 0) goto L_0x024d
            r2 = r23
            if (r2 != 0) goto L_0x024f
            if (r0 != 0) goto L_0x024a
            goto L_0x024f
        L_0x024a:
            r14 = r38
            goto L_0x029d
        L_0x024d:
            r2 = r23
        L_0x024f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "Inconsistent stbl box for track "
            r5.append(r14)
            r14 = r38
            int r15 = r14.f16232a
            r5.append(r15)
            java.lang.String r15 = ": remainingSynchronizationSamples "
            r5.append(r15)
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesAtTimestampDelta "
            r5.append(r9)
            r9 = r30
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesInChunk "
            r5.append(r9)
            r5.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r5.append(r1)
            r9 = r39
            r5.append(r9)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r5.append(r1)
            r5.append(r2)
            if (r0 != 0) goto L_0x0291
            java.lang.String r0 = ", ctts invalid"
            goto L_0x0293
        L_0x0291:
            java.lang.String r0 = ""
        L_0x0293:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r10, r0)
        L_0x029d:
            r0 = r3
            r2 = r4
            r3 = r6
            r4 = r11
            r15 = r12
            r12 = r7
            r13 = r8
        L_0x02a4:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r14.f16234c
            r5 = r15
            long r7 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r5, r7, r9)
            long[] r1 = r14.f16239h
            r10 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L_0x02c5
            long r0 = r14.f16234c
            com.applovin.exoplayer2.p221l.C7728ai.m22212a((long[]) r12, (long) r10, (long) r0)
            com.applovin.exoplayer2.e.g.n r9 = new com.applovin.exoplayer2.e.g.n
            r0 = r9
            r1 = r38
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02c5:
            long[] r1 = r14.f16239h
            int r1 = r1.length
            r5 = 1
            if (r1 != r5) goto L_0x0364
            int r1 = r14.f16233b
            if (r1 != r5) goto L_0x0364
            int r1 = r12.length
            r5 = 2
            if (r1 < r5) goto L_0x0364
            long[] r1 = r14.f16240i
            java.lang.Object r1 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r1)
            long[] r1 = (long[]) r1
            r5 = 0
            r21 = r1[r5]
            long[] r1 = r14.f16239h
            r23 = r1[r5]
            long r5 = r14.f16234c
            long r7 = r14.f16235d
            r25 = r5
            r27 = r7
            long r5 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r23, r25, r27)
            long r23 = r21 + r5
            r5 = r12
            r6 = r15
            r8 = r21
            r25 = r0
            r0 = r10
            r10 = r23
            boolean r5 = m19640a((long[]) r5, (long) r6, (long) r8, (long) r10)
            if (r5 == 0) goto L_0x0366
            long r6 = r15 - r23
            r5 = 0
            r8 = r12[r5]
            long r26 = r21 - r8
            com.applovin.exoplayer2.v r5 = r14.f16237f
            int r5 = r5.f18935z
            long r8 = (long) r5
            long r10 = r14.f16234c
            r28 = r8
            r30 = r10
            long r10 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r26, r28, r30)
            com.applovin.exoplayer2.v r5 = r14.f16237f
            int r5 = r5.f18935z
            long r8 = (long) r5
            long r0 = r14.f16234c
            r39 = r4
            r4 = r10
            r10 = r0
            long r0 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r6, r8, r10)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x032e
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0368
        L_0x032e:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0368
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0368
            int r5 = (int) r4
            r4 = r40
            r4.f16767a = r5
            int r1 = (int) r0
            r4.f16768b = r1
            long r0 = r14.f16234c
            r4 = 1000000(0xf4240, double:4.940656E-318)
            com.applovin.exoplayer2.p221l.C7728ai.m22212a((long[]) r12, (long) r4, (long) r0)
            long[] r0 = r14.f16239h
            r1 = 0
            r4 = r0[r1]
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r14.f16235d
            long r7 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r4, r6, r8)
            com.applovin.exoplayer2.e.g.n r9 = new com.applovin.exoplayer2.e.g.n
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0364:
            r25 = r0
        L_0x0366:
            r39 = r4
        L_0x0368:
            long[] r0 = r14.f16239h
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L_0x03b5
            long[] r0 = r14.f16239h
            r1 = 0
            r4 = r0[r1]
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x03b5
            long[] r0 = r14.f16240i
            java.lang.Object r0 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r0)
            long[] r0 = (long[]) r0
            r4 = r0[r1]
            r6 = 0
        L_0x0384:
            int r0 = r12.length
            if (r6 >= r0) goto L_0x039b
            r0 = r12[r6]
            long r17 = r0 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f16234c
            r21 = r0
            long r0 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r17, r19, r21)
            r12[r6] = r0
            int r6 = r6 + 1
            goto L_0x0384
        L_0x039b:
            long r17 = r15 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f16234c
            r21 = r0
            long r7 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r17, r19, r21)
            com.applovin.exoplayer2.e.g.n r9 = new com.applovin.exoplayer2.e.g.n
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03b5:
            int r0 = r14.f16233b
            r1 = 1
            if (r0 != r1) goto L_0x03bc
            r10 = 1
            goto L_0x03bd
        L_0x03bc:
            r10 = 0
        L_0x03bd:
            long[] r0 = r14.f16239h
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r1 = r14.f16239h
            int r1 = r1.length
            int[] r1 = new int[r1]
            long[] r4 = r14.f16240i
            java.lang.Object r4 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r4)
            long[] r4 = (long[]) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x03d3:
            long[] r9 = r14.f16239h
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0442
            r9 = r2
            r11 = r3
            r2 = r4[r5]
            r15 = -1
            int r21 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r21 == 0) goto L_0x042f
            long[] r15 = r14.f16239h
            r26 = r15[r5]
            r15 = r8
            r16 = r9
            long r8 = r14.f16234c
            r40 = r6
            r21 = r7
            long r6 = r14.f16235d
            r28 = r8
            r30 = r6
            long r6 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r26, r28, r30)
            r8 = 1
            int r9 = com.applovin.exoplayer2.p221l.C7728ai.m22189a((long[]) r12, (long) r2, (boolean) r8, (boolean) r8)
            r0[r5] = r9
            long r2 = r2 + r6
            r6 = 0
            int r2 = com.applovin.exoplayer2.p221l.C7728ai.m22228b((long[]) r12, (long) r2, (boolean) r10, (boolean) r6)
            r1[r5] = r2
        L_0x0408:
            r2 = r0[r5]
            r3 = r1[r5]
            if (r2 >= r3) goto L_0x041b
            r2 = r0[r5]
            r2 = r13[r2]
            r2 = r2 & r8
            if (r2 != 0) goto L_0x041b
            r2 = r0[r5]
            int r2 = r2 + r8
            r0[r5] = r2
            goto L_0x0408
        L_0x041b:
            r2 = r1[r5]
            r3 = r0[r5]
            int r2 = r2 - r3
            int r7 = r21 + r2
            r2 = r0[r5]
            r3 = r15
            if (r3 == r2) goto L_0x0429
            r2 = 1
            goto L_0x042a
        L_0x0429:
            r2 = 0
        L_0x042a:
            r2 = r40 | r2
            r3 = r1[r5]
            goto L_0x043a
        L_0x042f:
            r40 = r6
            r21 = r7
            r3 = r8
            r16 = r9
            r6 = 0
            r8 = 1
            r2 = r40
        L_0x043a:
            int r5 = r5 + 1
            r6 = r2
            r8 = r3
            r3 = r11
            r2 = r16
            goto L_0x03d3
        L_0x0442:
            r16 = r2
            r11 = r3
            r40 = r6
            r3 = r25
            r6 = 0
            r8 = 1
            if (r7 == r3) goto L_0x044e
            goto L_0x044f
        L_0x044e:
            r8 = 0
        L_0x044f:
            r2 = r40 | r8
            if (r2 == 0) goto L_0x0456
            long[] r3 = new long[r7]
            goto L_0x0458
        L_0x0456:
            r3 = r16
        L_0x0458:
            if (r2 == 0) goto L_0x045d
            int[] r4 = new int[r7]
            goto L_0x045e
        L_0x045d:
            r4 = r11
        L_0x045e:
            if (r2 == 0) goto L_0x0462
            r5 = 0
            goto L_0x0464
        L_0x0462:
            r5 = r39
        L_0x0464:
            if (r2 == 0) goto L_0x0469
            int[] r8 = new int[r7]
            goto L_0x046a
        L_0x0469:
            r8 = r13
        L_0x046a:
            long[] r7 = new long[r7]
            r39 = r5
            r9 = 0
            r15 = 0
        L_0x0471:
            long[] r5 = r14.f16239h
            int r5 = r5.length
            if (r6 >= r5) goto L_0x050e
            long[] r5 = r14.f16240i
            r17 = r5[r6]
            r5 = r0[r6]
            r27 = r0
            r0 = r1[r6]
            r28 = r1
            if (r2 == 0) goto L_0x0494
            int r1 = r0 - r5
            r29 = r6
            r6 = r16
            java.lang.System.arraycopy(r6, r5, r3, r15, r1)
            java.lang.System.arraycopy(r11, r5, r4, r15, r1)
            java.lang.System.arraycopy(r13, r5, r8, r15, r1)
            goto L_0x0498
        L_0x0494:
            r29 = r6
            r6 = r16
        L_0x0498:
            r1 = r39
        L_0x049a:
            if (r5 >= r0) goto L_0x04ea
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r40 = r0
            r16 = r1
            long r0 = r14.f16235d
            r21 = r9
            r25 = r0
            long r0 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r21, r23, r25)
            r21 = r12[r5]
            r23 = r12
            r24 = r13
            long r12 = r21 - r17
            r30 = r8
            r21 = r9
            r8 = 0
            long r31 = java.lang.Math.max(r8, r12)
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r14.f16234c
            r35 = r12
            long r12 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r31, r33, r35)
            long r0 = r0 + r12
            r7[r15] = r0
            if (r2 == 0) goto L_0x04d9
            r0 = r4[r15]
            r1 = r16
            if (r0 <= r1) goto L_0x04db
            r0 = r11[r5]
            r1 = r0
            goto L_0x04db
        L_0x04d9:
            r1 = r16
        L_0x04db:
            int r15 = r15 + 1
            int r5 = r5 + 1
            r0 = r40
            r9 = r21
            r12 = r23
            r13 = r24
            r8 = r30
            goto L_0x049a
        L_0x04ea:
            r30 = r8
            r21 = r9
            r23 = r12
            r24 = r13
            r8 = 0
            long[] r0 = r14.f16239h
            r12 = r0[r29]
            long r12 = r21 + r12
            int r0 = r29 + 1
            r39 = r1
            r16 = r6
            r9 = r12
            r12 = r23
            r13 = r24
            r1 = r28
            r8 = r30
            r6 = r0
            r0 = r27
            goto L_0x0471
        L_0x050e:
            r30 = r8
            r21 = r9
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f16235d
            r25 = r0
            long r8 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r21, r23, r25)
            com.applovin.exoplayer2.e.g.n r10 = new com.applovin.exoplayer2.e.g.n
            r0 = r10
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r39
            r5 = r7
            r6 = r30
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x052e:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.applovin.exoplayer2.ai r0 = com.applovin.exoplayer2.C6809ai.m17540b(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p193g.C7236b.m19631a(com.applovin.exoplayer2.e.g.k, com.applovin.exoplayer2.e.g.a$a, com.applovin.exoplayer2.e.r):com.applovin.exoplayer2.e.g.n");
    }

    /* renamed from: a */
    public static C7399a m19632a(C7233a.C7234a aVar) {
        C7233a.C7235b d = aVar.mo53957d(1751411826);
        C7233a.C7235b d2 = aVar.mo53957d(1801812339);
        C7233a.C7235b d3 = aVar.mo53957d(1768715124);
        if (d == null || d2 == null || d3 == null || m19649d(d.f16103b) != 1835299937) {
            return null;
        }
        C7772y yVar = d2.f16103b;
        yVar.mo55076d(12);
        int q = yVar.mo55093q();
        String[] strArr = new String[q];
        for (int i = 0; i < q; i++) {
            int q2 = yVar.mo55093q();
            yVar.mo55079e(4);
            strArr[i] = yVar.mo55081f(q2 - 8);
        }
        C7772y yVar2 = d3.f16103b;
        yVar2.mo55076d(8);
        ArrayList arrayList = new ArrayList();
        while (yVar2.mo55064a() > 8) {
            int c = yVar2.mo55074c();
            int q3 = yVar2.mo55093q();
            int q4 = yVar2.mo55093q() - 1;
            if (q4 < 0 || q4 >= q) {
                C7755q.m22361c("AtomParsers", "Skipped metadata with unknown key index: " + q4);
            } else {
                C7450a a = C7250f.m19728a(yVar2, c + q3, strArr[q4]);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            yVar2.mo55076d(c + q3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7399a((List<? extends C7399a.C7401a>) arrayList);
    }

    /* renamed from: a */
    private static C7399a m19633a(C7772y yVar, int i) {
        yVar.mo55079e(8);
        m19635a(yVar);
        while (yVar.mo55074c() < i) {
            int c = yVar.mo55074c();
            int q = yVar.mo55093q();
            if (yVar.mo55093q() == 1768715124) {
                yVar.mo55076d(c);
                return m19644b(yVar, c + q);
            }
            yVar.mo55076d(c + q);
        }
        return null;
    }

    /* renamed from: a */
    public static List<C7261n> m19634a(C7233a.C7234a aVar, C7349r rVar, long j, C7148e eVar, boolean z, boolean z2, Function<C7258k, C7258k> function) throws C6809ai {
        C7233a.C7234a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar2.f16102d.size(); i++) {
            C7233a.C7234a aVar3 = aVar2.f16102d.get(i);
            if (aVar3.f16099a != 1953653099) {
                C7349r rVar2 = rVar;
                Function<C7258k, C7258k> function2 = function;
            } else {
                C7258k apply = function.apply(m19629a(aVar3, (C7233a.C7235b) C7717a.m22120b(aVar.mo53957d(1836476516)), j, eVar, z, z2));
                if (apply == null) {
                    C7349r rVar3 = rVar;
                } else {
                    C7349r rVar4 = rVar;
                    arrayList.add(m19631a(apply, (C7233a.C7234a) C7717a.m22120b(((C7233a.C7234a) C7717a.m22120b(((C7233a.C7234a) C7717a.m22120b(aVar3.mo53958e(1835297121))).mo53958e(1835626086))).mo53958e(1937007212)), rVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m19635a(C7772y yVar) {
        int c = yVar.mo55074c();
        yVar.mo55079e(4);
        if (yVar.mo55093q() != 1751411826) {
            c += 4;
        }
        yVar.mo55076d(c);
    }

    /* renamed from: a */
    private static void m19636a(C7772y yVar, int i, int i2, int i3, int i4, int i5, C7148e eVar, C7239c cVar, int i6) throws C6809ai {
        C7148e eVar2;
        String str;
        C7772y yVar2 = yVar;
        int i7 = i2;
        int i8 = i3;
        C7148e eVar3 = eVar;
        C7239c cVar2 = cVar;
        yVar2.mo55076d(i7 + 8 + 8);
        yVar2.mo55079e(16);
        int i9 = yVar.mo55085i();
        int i10 = yVar.mo55085i();
        yVar2.mo55079e(50);
        int c = yVar.mo55074c();
        int i11 = i;
        if (i11 == 1701733238) {
            Pair<Integer, C7259l> c2 = m19645c(yVar2, i7, i8);
            if (c2 != null) {
                i11 = ((Integer) c2.first).intValue();
                eVar3 = eVar3 == null ? null : eVar3.mo53797a(((C7259l) c2.second).f16244b);
                cVar2.f16114a[i6] = (C7259l) c2.second;
            }
            yVar2.mo55076d(c);
        }
        String str2 = "video/3gpp";
        String str3 = i11 == 1831958048 ? "video/mpeg" : i11 == 1211250227 ? str2 : null;
        int i12 = -1;
        float f = 1.0f;
        String str4 = null;
        List list = null;
        byte[] bArr = null;
        C7790b bVar = null;
        boolean z = false;
        while (true) {
            if (c - i7 >= i8) {
                eVar2 = eVar3;
                break;
            }
            yVar2.mo55076d(c);
            int c3 = yVar.mo55074c();
            String str5 = str2;
            int q = yVar.mo55093q();
            if (q == 0) {
                eVar2 = eVar3;
                if (yVar.mo55074c() - i7 == i8) {
                    break;
                }
            } else {
                eVar2 = eVar3;
            }
            C7339k.m20220a(q > 0, "childAtomSize must be positive");
            int q2 = yVar.mo55093q();
            if (q2 == 1635148611) {
                C7339k.m20220a(str3 == null, (String) null);
                yVar2.mo55076d(c3 + 8);
                C7776a a = C7776a.m22498a(yVar);
                list = a.f18357a;
                cVar2.f16116c = a.f18358b;
                if (!z) {
                    f = a.f18361e;
                }
                str4 = a.f18362f;
                str = "video/avc";
            } else if (q2 == 1752589123) {
                C7339k.m20220a(str3 == null, (String) null);
                yVar2.mo55076d(c3 + 8);
                C7797f a2 = C7797f.m22571a(yVar);
                list = a2.f18444a;
                cVar2.f16116c = a2.f18445b;
                str4 = a2.f18446c;
                str = "video/hevc";
            } else if (q2 == 1685480259 || q2 == 1685485123) {
                C7791c a3 = C7791c.m22549a(yVar);
                if (a3 != null) {
                    str4 = a3.f18419c;
                    str3 = "video/dolby-vision";
                }
                c += q;
                yVar2 = yVar;
                i7 = i2;
                i8 = i3;
                str2 = str5;
                eVar3 = eVar2;
            } else if (q2 == 1987076931) {
                C7339k.m20220a(str3 == null, (String) null);
                str = i11 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else {
                if (q2 == 1635135811) {
                    C7339k.m20220a(str3 == null, (String) null);
                    str3 = "video/av01";
                } else if (q2 == 1681012275) {
                    C7339k.m20220a(str3 == null, (String) null);
                    str3 = str5;
                } else if (q2 == 1702061171) {
                    C7339k.m20220a(str3 == null, (String) null);
                    Pair<String, byte[]> e = m19652e(yVar2, c3);
                    String str6 = (String) e.first;
                    byte[] bArr2 = (byte[]) e.second;
                    if (bArr2 != null) {
                        list = C7033s.m18793a(bArr2);
                    }
                    str3 = str6;
                } else if (q2 == 1885434736) {
                    f = m19648d(yVar2, c3);
                    z = true;
                } else if (q2 == 1937126244) {
                    bArr = m19650d(yVar2, c3, q);
                } else if (q2 == 1936995172) {
                    int h = yVar.mo55084h();
                    yVar2.mo55079e(3);
                    if (h == 0) {
                        int h2 = yVar.mo55084h();
                        if (h2 == 0) {
                            i12 = 0;
                        } else if (h2 == 1) {
                            i12 = 1;
                        } else if (h2 == 2) {
                            i12 = 2;
                        } else if (h2 == 3) {
                            i12 = 3;
                        }
                    }
                } else if (q2 == 1668246642) {
                    int q3 = yVar.mo55093q();
                    boolean z2 = q3 == 1852009592;
                    if (z2 || q3 == 1852009571) {
                        int i13 = yVar.mo55085i();
                        int i14 = yVar.mo55085i();
                        yVar2.mo55079e(2);
                        bVar = new C7790b(C7790b.m22545a(i13), z2 && (yVar.mo55084h() & 128) != 0 ? 1 : 2, C7790b.m22547b(i14), (byte[]) null);
                    } else {
                        C7755q.m22361c("AtomParsers", "Unsupported color type: " + C7233a.m19620c(q3));
                    }
                }
                c += q;
                yVar2 = yVar;
                i7 = i2;
                i8 = i3;
                str2 = str5;
                eVar3 = eVar2;
            }
            str3 = str;
            c += q;
            yVar2 = yVar;
            i7 = i2;
            i8 = i3;
            str2 = str5;
            eVar3 = eVar2;
        }
        if (str3 != null) {
            cVar2.f16115b = new C7864v.C7866a().mo55416a(i4).mo55435f(str3).mo55431d(str4).mo55436g(i9).mo55437h(i10).mo55425b(f).mo55438i(i5).mo55423a(bArr).mo55439j(i12).mo55422a((List<byte[]>) list).mo55418a(eVar2).mo55420a(bVar).mo55424a();
        }
    }

    /* renamed from: a */
    private static void m19637a(C7772y yVar, int i, int i2, int i3, int i4, String str, C7239c cVar) {
        yVar.mo55076d(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        C7033s sVar = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                yVar.mo55071a(bArr, 0, i5);
                sVar = C7033s.m18793a(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                cVar.f16117d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f16115b = new C7864v.C7866a().mo55416a(i4).mo55435f(str2).mo55429c(str).mo55417a(j).mo55422a((List<byte[]>) sVar).mo55424a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0151  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m19638a(com.applovin.exoplayer2.p221l.C7772y r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.applovin.exoplayer2.p185d.C7148e r27, com.applovin.exoplayer2.p186e.p193g.C7236b.C7239c r28, int r29) throws com.applovin.exoplayer2.C6809ai {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r27
            r6 = r28
            int r7 = r1 + 8
            r8 = 8
            int r7 = r7 + r8
            r0.mo55076d(r7)
            r7 = 6
            if (r26 == 0) goto L_0x0021
            int r8 = r20.mo55085i()
            r0.mo55079e(r7)
            goto L_0x0025
        L_0x0021:
            r0.mo55079e(r8)
            r8 = 0
        L_0x0025:
            r10 = 16
            r11 = 2
            r12 = 1
            if (r8 == 0) goto L_0x0047
            if (r8 != r12) goto L_0x002e
            goto L_0x0047
        L_0x002e:
            if (r8 != r11) goto L_0x0046
            r0.mo55079e(r10)
            double r7 = r20.mo55060A()
            long r7 = java.lang.Math.round(r7)
            int r8 = (int) r7
            int r7 = r20.mo55099w()
            r10 = 20
            r0.mo55079e(r10)
            goto L_0x0059
        L_0x0046:
            return
        L_0x0047:
            int r13 = r20.mo55085i()
            r0.mo55079e(r7)
            int r7 = r20.mo55097u()
            if (r8 != r12) goto L_0x0057
            r0.mo55079e(r10)
        L_0x0057:
            r8 = r7
            r7 = r13
        L_0x0059:
            int r10 = r20.mo55074c()
            r13 = 1701733217(0x656e6361, float:7.0359778E22)
            r15 = r21
            if (r15 != r13) goto L_0x008f
            android.util.Pair r13 = m19645c(r0, r1, r2)
            if (r13 == 0) goto L_0x008a
            java.lang.Object r15 = r13.first
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r5 != 0) goto L_0x0076
            r14 = 0
            goto L_0x0081
        L_0x0076:
            java.lang.Object r14 = r13.second
            com.applovin.exoplayer2.e.g.l r14 = (com.applovin.exoplayer2.p186e.p193g.C7259l) r14
            java.lang.String r14 = r14.f16244b
            com.applovin.exoplayer2.d.e r5 = r5.mo53797a((java.lang.String) r14)
            r14 = r5
        L_0x0081:
            com.applovin.exoplayer2.e.g.l[] r5 = r6.f16114a
            java.lang.Object r13 = r13.second
            com.applovin.exoplayer2.e.g.l r13 = (com.applovin.exoplayer2.p186e.p193g.C7259l) r13
            r5[r29] = r13
            goto L_0x008b
        L_0x008a:
            r14 = r5
        L_0x008b:
            r0.mo55076d(r10)
            goto L_0x0090
        L_0x008f:
            r14 = r5
        L_0x0090:
            r5 = 1633889587(0x61632d33, float:2.6191674E20)
            r13 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r17 = "audio/raw"
            if (r15 != r5) goto L_0x009f
            java.lang.String r17 = "audio/ac3"
        L_0x009c:
            r5 = -1
            goto L_0x0148
        L_0x009f:
            r5 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r15 != r5) goto L_0x00a7
            java.lang.String r17 = "audio/eac3"
            goto L_0x009c
        L_0x00a7:
            r5 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r15 != r5) goto L_0x00af
            java.lang.String r17 = "audio/ac4"
            goto L_0x009c
        L_0x00af:
            r5 = 1685353315(0x64747363, float:1.803728E22)
            if (r15 != r5) goto L_0x00b7
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x009c
        L_0x00b7:
            r5 = 1685353320(0x64747368, float:1.8037286E22)
            if (r15 == r5) goto L_0x0144
            r5 = 1685353324(0x6474736c, float:1.803729E22)
            if (r15 != r5) goto L_0x00c3
            goto L_0x0144
        L_0x00c3:
            r5 = 1685353317(0x64747365, float:1.8037282E22)
            if (r15 != r5) goto L_0x00cb
            java.lang.String r17 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x009c
        L_0x00cb:
            r5 = 1685353336(0x64747378, float:1.8037304E22)
            if (r15 != r5) goto L_0x00d3
            java.lang.String r17 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x009c
        L_0x00d3:
            r5 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r15 != r5) goto L_0x00db
            java.lang.String r17 = "audio/3gpp"
            goto L_0x009c
        L_0x00db:
            r5 = 1935767394(0x73617762, float:1.7863284E31)
            if (r15 != r5) goto L_0x00e3
            java.lang.String r17 = "audio/amr-wb"
            goto L_0x009c
        L_0x00e3:
            r5 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r15 == r5) goto L_0x0142
            r5 = 1936684916(0x736f7774, float:1.89725E31)
            if (r15 != r5) goto L_0x00ee
            goto L_0x0142
        L_0x00ee:
            r5 = 1953984371(0x74776f73, float:7.841539E31)
            if (r15 != r5) goto L_0x00f6
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0148
        L_0x00f6:
            r5 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r15 == r5) goto L_0x013e
            r5 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r15 != r5) goto L_0x0101
            goto L_0x013e
        L_0x0101:
            r5 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r15 != r5) goto L_0x0109
            java.lang.String r17 = "audio/mha1"
            goto L_0x009c
        L_0x0109:
            r5 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r15 != r5) goto L_0x0111
            java.lang.String r17 = "audio/mhm1"
            goto L_0x009c
        L_0x0111:
            if (r15 != r13) goto L_0x0116
            java.lang.String r17 = "audio/alac"
            goto L_0x009c
        L_0x0116:
            r5 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r15 != r5) goto L_0x011f
            java.lang.String r17 = "audio/g711-alaw"
            goto L_0x009c
        L_0x011f:
            r5 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r15 != r5) goto L_0x0128
            java.lang.String r17 = "audio/g711-mlaw"
            goto L_0x009c
        L_0x0128:
            r5 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r15 != r5) goto L_0x0131
            java.lang.String r17 = "audio/opus"
            goto L_0x009c
        L_0x0131:
            r5 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r15 != r5) goto L_0x013a
            java.lang.String r17 = "audio/flac"
            goto L_0x009c
        L_0x013a:
            r5 = -1
            r17 = 0
            goto L_0x0148
        L_0x013e:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x009c
        L_0x0142:
            r5 = 2
            goto L_0x0148
        L_0x0144:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x009c
        L_0x0148:
            r11 = r17
            r15 = 0
            r19 = 0
        L_0x014d:
            int r13 = r10 - r1
            if (r13 >= r2) goto L_0x02cd
            r0.mo55076d(r10)
            int r13 = r20.mo55093q()
            if (r13 <= 0) goto L_0x015b
            goto L_0x015c
        L_0x015b:
            r12 = 0
        L_0x015c:
            java.lang.String r9 = "childAtomSize must be positive"
            com.applovin.exoplayer2.p186e.C7339k.m20220a((boolean) r12, (java.lang.String) r9)
            int r9 = r20.mo55093q()
            r12 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r9 != r12) goto L_0x0188
            int r9 = r13 + -13
            byte[] r12 = new byte[r9]
            int r1 = r10 + 13
            r0.mo55076d(r1)
            r1 = 0
            r0.mo55071a(r12, r1, r9)
            com.applovin.exoplayer2.common.a.s r1 = com.applovin.exoplayer2.common.p183a.C7033s.m18793a(r12)
        L_0x017b:
            r19 = r1
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r17 = 0
            r18 = 2
            goto L_0x02c7
        L_0x0188:
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r9 == r1) goto L_0x028e
            if (r26 == 0) goto L_0x0196
            r12 = 2002876005(0x77617665, float:4.5729223E33)
            if (r9 != r12) goto L_0x0196
            goto L_0x028e
        L_0x0196:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r9 != r1) goto L_0x01b4
            int r1 = r10 + 8
            r0.mo55076d(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            com.applovin.exoplayer2.v r1 = com.applovin.exoplayer2.p181b.C6850b.m17938a(r0, r1, r4, r14)
        L_0x01a8:
            r6.f16115b = r1
            r9 = 0
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r18 = 2
            goto L_0x028b
        L_0x01b4:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r9 != r1) goto L_0x01c7
            int r1 = r10 + 8
            r0.mo55076d(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            com.applovin.exoplayer2.v r1 = com.applovin.exoplayer2.p181b.C6850b.m17941b(r0, r1, r4, r14)
            goto L_0x01a8
        L_0x01c7:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r9 != r1) goto L_0x01da
            int r1 = r10 + 8
            r0.mo55076d(r1)
            java.lang.String r1 = java.lang.Integer.toString(r24)
            com.applovin.exoplayer2.v r1 = com.applovin.exoplayer2.p181b.C6853c.m17946a(r0, r1, r4, r14)
            goto L_0x01a8
        L_0x01da:
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r9 != r1) goto L_0x0201
            com.applovin.exoplayer2.v$a r1 = new com.applovin.exoplayer2.v$a
            r1.<init>()
            com.applovin.exoplayer2.v$a r1 = r1.mo55416a((int) r3)
            com.applovin.exoplayer2.v$a r1 = r1.mo55435f((java.lang.String) r11)
            com.applovin.exoplayer2.v$a r1 = r1.mo55440k((int) r7)
            com.applovin.exoplayer2.v$a r1 = r1.mo55441l((int) r8)
            com.applovin.exoplayer2.v$a r1 = r1.mo55418a((com.applovin.exoplayer2.p185d.C7148e) r14)
            com.applovin.exoplayer2.v$a r1 = r1.mo55429c((java.lang.String) r4)
            com.applovin.exoplayer2.v r1 = r1.mo55424a()
            goto L_0x01a8
        L_0x0201:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r9 != r1) goto L_0x0221
            int r1 = r13 + -8
            byte[] r9 = f16104a
            int r12 = r9.length
            int r12 = r12 + r1
            byte[] r9 = java.util.Arrays.copyOf(r9, r12)
            int r12 = r10 + 8
            r0.mo55076d(r12)
            byte[] r12 = f16104a
            int r12 = r12.length
            r0.mo55071a(r9, r12, r1)
            java.util.List r1 = com.applovin.exoplayer2.p181b.C6897s.m18268b((byte[]) r9)
            goto L_0x017b
        L_0x0221:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r9 != r1) goto L_0x0256
            int r1 = r13 + -12
            int r9 = r1 + 4
            byte[] r9 = new byte[r9]
            r12 = 102(0x66, float:1.43E-43)
            r17 = 0
            r9[r17] = r12
            r12 = 76
            r16 = 1
            r9[r16] = r12
            r12 = 97
            r18 = 2
            r9[r18] = r12
            r12 = 3
            r19 = 67
            r9[r12] = r19
            int r12 = r10 + 12
            r0.mo55076d(r12)
            r12 = 4
            r0.mo55071a(r9, r12, r1)
            com.applovin.exoplayer2.common.a.s r1 = com.applovin.exoplayer2.common.p183a.C7033s.m18793a(r9)
            r19 = r1
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x028b
        L_0x0256:
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r18 = 2
            if (r9 != r12) goto L_0x028a
            int r1 = r13 + -12
            byte[] r7 = new byte[r1]
            int r8 = r10 + 12
            r0.mo55076d(r8)
            r9 = 0
            r0.mo55071a(r7, r9, r1)
            android.util.Pair r1 = com.applovin.exoplayer2.p221l.C7733e.m22281a((byte[]) r7)
            java.lang.Object r8 = r1.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.applovin.exoplayer2.common.a.s r7 = com.applovin.exoplayer2.common.p183a.C7033s.m18793a(r7)
            r19 = r7
            r17 = 0
            r7 = r1
            goto L_0x02c7
        L_0x028a:
            r9 = 0
        L_0x028b:
            r17 = 0
            goto L_0x02c7
        L_0x028e:
            r12 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r17 = 0
            r18 = 2
            if (r9 != r1) goto L_0x029b
            r1 = r10
            goto L_0x029f
        L_0x029b:
            int r1 = m19641b(r0, r10, r13)
        L_0x029f:
            r9 = -1
            if (r1 == r9) goto L_0x02c7
            android.util.Pair r1 = m19652e(r0, r1)
            java.lang.Object r11 = r1.first
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x02c7
            java.lang.String r9 = "audio/mp4a-latm"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x02c3
            com.applovin.exoplayer2.b.a$a r7 = com.applovin.exoplayer2.p181b.C6847a.m17929a((byte[]) r1)
            int r8 = r7.f14978a
            int r9 = r7.f14979b
            java.lang.String r15 = r7.f14980c
            r7 = r9
        L_0x02c3:
            com.applovin.exoplayer2.common.a.s r19 = com.applovin.exoplayer2.common.p183a.C7033s.m18793a(r1)
        L_0x02c7:
            int r10 = r10 + r13
            r1 = r22
            r12 = 1
            goto L_0x014d
        L_0x02cd:
            com.applovin.exoplayer2.v r0 = r6.f16115b
            if (r0 != 0) goto L_0x0304
            if (r11 == 0) goto L_0x0304
            com.applovin.exoplayer2.v$a r0 = new com.applovin.exoplayer2.v$a
            r0.<init>()
            com.applovin.exoplayer2.v$a r0 = r0.mo55416a((int) r3)
            com.applovin.exoplayer2.v$a r0 = r0.mo55435f((java.lang.String) r11)
            com.applovin.exoplayer2.v$a r0 = r0.mo55431d((java.lang.String) r15)
            com.applovin.exoplayer2.v$a r0 = r0.mo55440k((int) r7)
            com.applovin.exoplayer2.v$a r0 = r0.mo55441l((int) r8)
            com.applovin.exoplayer2.v$a r0 = r0.mo55442m((int) r5)
            r1 = r19
            com.applovin.exoplayer2.v$a r0 = r0.mo55422a((java.util.List<byte[]>) r1)
            com.applovin.exoplayer2.v$a r0 = r0.mo55418a((com.applovin.exoplayer2.p185d.C7148e) r14)
            com.applovin.exoplayer2.v$a r0 = r0.mo55429c((java.lang.String) r4)
            com.applovin.exoplayer2.v r0 = r0.mo55424a()
            r6.f16115b = r0
        L_0x0304:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p193g.C7236b.m19638a(com.applovin.exoplayer2.l.y, int, int, int, int, java.lang.String, boolean, com.applovin.exoplayer2.d.e, com.applovin.exoplayer2.e.g.b$c, int):void");
    }

    /* renamed from: a */
    private static void m19639a(C7772y yVar, int i, int i2, int i3, C7239c cVar) {
        yVar.mo55076d(i2 + 8 + 8);
        if (i == 1835365492) {
            yVar.mo55061B();
            String B = yVar.mo55061B();
            if (B != null) {
                cVar.f16115b = new C7864v.C7866a().mo55416a(i3).mo55435f(B).mo55424a();
            }
        }
    }

    /* renamed from: a */
    private static boolean m19640a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[C7728ai.m22180a(4, 0, length)] && jArr[C7728ai.m22180a(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    /* renamed from: b */
    private static int m19641b(C7772y yVar, int i, int i2) throws C6809ai {
        int c = yVar.mo55074c();
        while (c - i < i2) {
            yVar.mo55076d(c);
            int q = yVar.mo55093q();
            C7339k.m20220a(q > 0, "childAtomSize must be positive");
            if (yVar.mo55093q() == 1702061171) {
                return c;
            }
            c += q;
        }
        return -1;
    }

    /* renamed from: b */
    private static long m19642b(C7772y yVar) {
        int i = 8;
        yVar.mo55076d(8);
        if (C7233a.m19618a(yVar.mo55093q()) != 0) {
            i = 16;
        }
        yVar.mo55079e(i);
        return yVar.mo55091o();
    }

    /* renamed from: b */
    private static Pair<long[], long[]> m19643b(C7233a.C7234a aVar) {
        C7233a.C7235b d = aVar.mo53957d(1701606260);
        if (d == null) {
            return null;
        }
        C7772y yVar = d.f16103b;
        yVar.mo55076d(8);
        int a = C7233a.m19618a(yVar.mo55093q());
        int w = yVar.mo55099w();
        long[] jArr = new long[w];
        long[] jArr2 = new long[w];
        int i = 0;
        while (i < w) {
            jArr[i] = a == 1 ? yVar.mo55101y() : yVar.mo55091o();
            jArr2[i] = a == 1 ? yVar.mo55095s() : (long) yVar.mo55093q();
            if (yVar.mo55087k() == 1) {
                yVar.mo55079e(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: b */
    private static C7399a m19644b(C7772y yVar, int i) {
        yVar.mo55079e(8);
        ArrayList arrayList = new ArrayList();
        while (yVar.mo55074c() < i) {
            C7399a.C7401a a = C7250f.m19723a(yVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7399a((List<? extends C7399a.C7401a>) arrayList);
    }

    /* renamed from: c */
    private static Pair<Integer, C7259l> m19645c(C7772y yVar, int i, int i2) throws C6809ai {
        Pair<Integer, C7259l> a;
        int c = yVar.mo55074c();
        while (c - i < i2) {
            yVar.mo55076d(c);
            int q = yVar.mo55093q();
            C7339k.m20220a(q > 0, "childAtomSize must be positive");
            if (yVar.mo55093q() == 1936289382 && (a = m19627a(yVar, c, q)) != null) {
                return a;
            }
            c += q;
        }
        return null;
    }

    /* renamed from: c */
    private static C7242f m19646c(C7772y yVar) {
        boolean z;
        int i = 8;
        yVar.mo55076d(8);
        int a = C7233a.m19618a(yVar.mo55093q());
        yVar.mo55079e(a == 0 ? 8 : 16);
        int q = yVar.mo55093q();
        yVar.mo55079e(4);
        int c = yVar.mo55074c();
        if (a == 0) {
            i = 4;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (yVar.mo55077d()[c + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            yVar.mo55079e(i);
        } else {
            long o = a == 0 ? yVar.mo55091o() : yVar.mo55101y();
            if (o != 0) {
                j = o;
            }
        }
        yVar.mo55079e(16);
        int q2 = yVar.mo55093q();
        int q3 = yVar.mo55093q();
        yVar.mo55079e(4);
        int q4 = yVar.mo55093q();
        int q5 = yVar.mo55093q();
        if (q2 == 0 && q3 == 65536 && q4 == -65536 && q5 == 0) {
            i2 = 90;
        } else if (q2 == 0 && q3 == -65536 && q4 == 65536 && q5 == 0) {
            i2 = 270;
        } else if (q2 == -65536 && q3 == 0 && q4 == 0 && q5 == -65536) {
            i2 = 180;
        }
        return new C7242f(q, j, i2);
    }

    /* renamed from: c */
    private static C7399a m19647c(C7772y yVar, int i) {
        yVar.mo55079e(12);
        while (yVar.mo55074c() < i) {
            int c = yVar.mo55074c();
            int q = yVar.mo55093q();
            if (yVar.mo55093q() != 1935766900) {
                yVar.mo55076d(c + q);
            } else if (q < 14) {
                return null;
            } else {
                yVar.mo55079e(5);
                int h = yVar.mo55084h();
                if (h != 12 && h != 13) {
                    return null;
                }
                float f = h == 12 ? 240.0f : 120.0f;
                yVar.mo55079e(1);
                return new C7399a(new C7458d(f, yVar.mo55084h()));
            }
        }
        return null;
    }

    /* renamed from: d */
    private static float m19648d(C7772y yVar, int i) {
        yVar.mo55076d(i + 8);
        return ((float) yVar.mo55099w()) / ((float) yVar.mo55099w());
    }

    /* renamed from: d */
    private static int m19649d(C7772y yVar) {
        yVar.mo55076d(16);
        return yVar.mo55093q();
    }

    /* renamed from: d */
    private static byte[] m19650d(C7772y yVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            yVar.mo55076d(i3);
            int q = yVar.mo55093q();
            if (yVar.mo55093q() == 1886547818) {
                return Arrays.copyOfRange(yVar.mo55077d(), i3, q + i3);
            }
            i3 += q;
        }
        return null;
    }

    /* renamed from: e */
    private static Pair<Long, String> m19651e(C7772y yVar) {
        int i = 8;
        yVar.mo55076d(8);
        int a = C7233a.m19618a(yVar.mo55093q());
        yVar.mo55079e(a == 0 ? 8 : 16);
        long o = yVar.mo55091o();
        if (a == 0) {
            i = 4;
        }
        yVar.mo55079e(i);
        int i2 = yVar.mo55085i();
        return Pair.create(Long.valueOf(o), "" + ((char) (((i2 >> 10) & 31) + 96)) + ((char) (((i2 >> 5) & 31) + 96)) + ((char) ((i2 & 31) + 96)));
    }

    /* renamed from: e */
    private static Pair<String, byte[]> m19652e(C7772y yVar, int i) {
        yVar.mo55076d(i + 8 + 4);
        yVar.mo55079e(1);
        m19653f(yVar);
        yVar.mo55079e(2);
        int h = yVar.mo55084h();
        if ((h & 128) != 0) {
            yVar.mo55079e(2);
        }
        if ((h & 64) != 0) {
            yVar.mo55079e(yVar.mo55085i());
        }
        if ((h & 32) != 0) {
            yVar.mo55079e(2);
        }
        yVar.mo55079e(1);
        m19653f(yVar);
        String a = C7759u.m22376a(yVar.mo55084h());
        if ("audio/mpeg".equals(a) || "audio/vnd.dts".equals(a) || "audio/vnd.dts.hd".equals(a)) {
            return Pair.create(a, (Object) null);
        }
        yVar.mo55079e(12);
        yVar.mo55079e(1);
        int f = m19653f(yVar);
        byte[] bArr = new byte[f];
        yVar.mo55071a(bArr, 0, f);
        return Pair.create(a, bArr);
    }

    /* renamed from: f */
    private static int m19653f(C7772y yVar) {
        int h = yVar.mo55084h();
        int i = h & 127;
        while ((h & 128) == 128) {
            h = yVar.mo55084h();
            i = (i << 7) | (h & 127);
        }
        return i;
    }
}
