package com.applovin.exoplayer2.p186e.p193g;

import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.p181b.C6853c;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p186e.C7190b;
import com.applovin.exoplayer2.p186e.C7195c;
import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7349r;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p193g.C7233a;
import com.applovin.exoplayer2.p198g.p200b.C7409c;
import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7762v;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.e.g.e */
public class C7247e implements C7262h {

    /* renamed from: a */
    public static final C7340l f16139a = $$Lambda$e$XdcPKOBxOMtaTqkUwwYk0cfnngM.INSTANCE;

    /* renamed from: b */
    private static final byte[] f16140b = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: c */
    private static final C7864v f16141c = new C7864v.C7866a().mo55435f("application/x-emsg").mo55424a();

    /* renamed from: A */
    private long f16142A;

    /* renamed from: B */
    private long f16143B;

    /* renamed from: C */
    private C7249b f16144C;

    /* renamed from: D */
    private int f16145D;

    /* renamed from: E */
    private int f16146E;

    /* renamed from: F */
    private int f16147F;

    /* renamed from: G */
    private boolean f16148G;

    /* renamed from: H */
    private C7329j f16149H;

    /* renamed from: I */
    private C7357x[] f16150I;

    /* renamed from: J */
    private C7357x[] f16151J;

    /* renamed from: K */
    private boolean f16152K;

    /* renamed from: d */
    private final int f16153d;

    /* renamed from: e */
    private final C7258k f16154e;

    /* renamed from: f */
    private final List<C7864v> f16155f;

    /* renamed from: g */
    private final SparseArray<C7249b> f16156g;

    /* renamed from: h */
    private final C7772y f16157h;

    /* renamed from: i */
    private final C7772y f16158i;

    /* renamed from: j */
    private final C7772y f16159j;

    /* renamed from: k */
    private final byte[] f16160k;

    /* renamed from: l */
    private final C7772y f16161l;

    /* renamed from: m */
    private final C7726ag f16162m;

    /* renamed from: n */
    private final C7409c f16163n;

    /* renamed from: o */
    private final C7772y f16164o;

    /* renamed from: p */
    private final ArrayDeque<C7233a.C7234a> f16165p;

    /* renamed from: q */
    private final ArrayDeque<C7248a> f16166q;

    /* renamed from: r */
    private final C7357x f16167r;

    /* renamed from: s */
    private int f16168s;

    /* renamed from: t */
    private int f16169t;

    /* renamed from: u */
    private long f16170u;

    /* renamed from: v */
    private int f16171v;

    /* renamed from: w */
    private C7772y f16172w;

    /* renamed from: x */
    private long f16173x;

    /* renamed from: y */
    private int f16174y;

    /* renamed from: z */
    private long f16175z;

    /* renamed from: com.applovin.exoplayer2.e.g.e$a */
    private static final class C7248a {

        /* renamed from: a */
        public final long f16176a;

        /* renamed from: b */
        public final int f16177b;

        public C7248a(long j, int i) {
            this.f16176a = j;
            this.f16177b = i;
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.g.e$b */
    private static final class C7249b {

        /* renamed from: a */
        public final C7357x f16178a;

        /* renamed from: b */
        public final C7260m f16179b = new C7260m();

        /* renamed from: c */
        public final C7772y f16180c = new C7772y();

        /* renamed from: d */
        public C7261n f16181d;

        /* renamed from: e */
        public C7243c f16182e;

        /* renamed from: f */
        public int f16183f;

        /* renamed from: g */
        public int f16184g;

        /* renamed from: h */
        public int f16185h;

        /* renamed from: i */
        public int f16186i;

        /* renamed from: j */
        private final C7772y f16187j = new C7772y(1);

        /* renamed from: k */
        private final C7772y f16188k = new C7772y();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f16189l;

        public C7249b(C7357x xVar, C7261n nVar, C7243c cVar) {
            this.f16178a = xVar;
            this.f16181d = nVar;
            this.f16182e = cVar;
            mo53968a(nVar, cVar);
        }

        /* renamed from: a */
        public int mo53964a(int i, int i2) {
            C7772y yVar;
            int i3;
            C7259l h = mo53975h();
            if (h == null) {
                return 0;
            }
            if (h.f16246d != 0) {
                yVar = this.f16179b.f16263p;
                i3 = h.f16246d;
            } else {
                byte[] bArr = (byte[]) C7728ai.m22198a(h.f16247e);
                this.f16188k.mo55070a(bArr, bArr.length);
                yVar = this.f16188k;
                i3 = bArr.length;
            }
            boolean c = this.f16179b.mo53985c(this.f16183f);
            boolean z = c || i2 != 0;
            this.f16187j.mo55077d()[0] = (byte) ((z ? 128 : 0) | i3);
            this.f16187j.mo55076d(0);
            this.f16178a.mo53952a(this.f16187j, 1, 1);
            this.f16178a.mo53952a(yVar, i3, 1);
            if (!z) {
                return i3 + 1;
            }
            if (!c) {
                this.f16180c.mo55067a(8);
                byte[] d = this.f16180c.mo55077d();
                d[0] = 0;
                d[1] = 1;
                d[2] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                d[3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                d[4] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                d[5] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                d[6] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                d[7] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f16178a.mo53952a(this.f16180c, 8, 1);
                return i3 + 1 + 8;
            }
            C7772y yVar2 = this.f16179b.f16263p;
            int i4 = yVar2.mo55085i();
            yVar2.mo55079e(-2);
            int i5 = (i4 * 6) + 2;
            if (i2 != 0) {
                this.f16180c.mo55067a(i5);
                byte[] d2 = this.f16180c.mo55077d();
                yVar2.mo55071a(d2, 0, i5);
                int i6 = (((d2[2] & 255) << 8) | (d2[3] & 255)) + i2;
                d2[2] = (byte) ((i6 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                d2[3] = (byte) (i6 & KotlinVersion.MAX_COMPONENT_VALUE);
                yVar2 = this.f16180c;
            }
            this.f16178a.mo53952a(yVar2, i5, 1);
            return i3 + 1 + i5;
        }

        /* renamed from: a */
        public void mo53965a() {
            this.f16179b.mo53979a();
            this.f16183f = 0;
            this.f16185h = 0;
            this.f16184g = 0;
            this.f16186i = 0;
            this.f16189l = false;
        }

        /* renamed from: a */
        public void mo53966a(long j) {
            int i = this.f16183f;
            while (i < this.f16179b.f16253f && this.f16179b.mo53984b(i) < j) {
                if (this.f16179b.f16259l[i]) {
                    this.f16186i = i;
                }
                i++;
            }
        }

        /* renamed from: a */
        public void mo53967a(C7148e eVar) {
            C7259l a = this.f16181d.f16267a.mo53978a(((C7243c) C7728ai.m22198a(this.f16179b.f16248a)).f16129a);
            this.f16178a.mo53953a(this.f16181d.f16267a.f16237f.mo55408a().mo55418a(eVar.mo53797a(a != null ? a.f16244b : null)).mo55424a());
        }

        /* renamed from: a */
        public void mo53968a(C7261n nVar, C7243c cVar) {
            this.f16181d = nVar;
            this.f16182e = cVar;
            this.f16178a.mo53953a(nVar.f16267a.f16237f);
            mo53965a();
        }

        /* renamed from: b */
        public long mo53969b() {
            return !this.f16189l ? this.f16181d.f16272f[this.f16183f] : this.f16179b.mo53984b(this.f16183f);
        }

        /* renamed from: c */
        public long mo53970c() {
            return !this.f16189l ? this.f16181d.f16269c[this.f16183f] : this.f16179b.f16254g[this.f16185h];
        }

        /* renamed from: d */
        public int mo53971d() {
            return !this.f16189l ? this.f16181d.f16270d[this.f16183f] : this.f16179b.f16256i[this.f16183f];
        }

        /* renamed from: e */
        public int mo53972e() {
            int i = !this.f16189l ? this.f16181d.f16273g[this.f16183f] : this.f16179b.f16259l[this.f16183f] ? 1 : 0;
            return mo53975h() != null ? i | 1073741824 : i;
        }

        /* renamed from: f */
        public boolean mo53973f() {
            this.f16183f++;
            if (!this.f16189l) {
                return false;
            }
            int i = this.f16184g + 1;
            this.f16184g = i;
            int[] iArr = this.f16179b.f16255h;
            int i2 = this.f16185h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f16185h = i2 + 1;
            this.f16184g = 0;
            return false;
        }

        /* renamed from: g */
        public void mo53974g() {
            C7259l h = mo53975h();
            if (h != null) {
                C7772y yVar = this.f16179b.f16263p;
                if (h.f16246d != 0) {
                    yVar.mo55079e(h.f16246d);
                }
                if (this.f16179b.mo53985c(this.f16183f)) {
                    yVar.mo55079e(yVar.mo55085i() * 6);
                }
            }
        }

        /* renamed from: h */
        public C7259l mo53975h() {
            if (!this.f16189l) {
                return null;
            }
            C7259l a = this.f16179b.f16262o != null ? this.f16179b.f16262o : this.f16181d.f16267a.mo53978a(((C7243c) C7728ai.m22198a(this.f16179b.f16248a)).f16129a);
            if (a == null || !a.f16243a) {
                return null;
            }
            return a;
        }
    }

    public C7247e() {
        this(0);
    }

    public C7247e(int i) {
        this(i, (C7726ag) null);
    }

    public C7247e(int i, C7726ag agVar) {
        this(i, agVar, (C7258k) null, Collections.emptyList());
    }

    public C7247e(int i, C7726ag agVar, C7258k kVar, List<C7864v> list) {
        this(i, agVar, kVar, list, (C7357x) null);
    }

    public C7247e(int i, C7726ag agVar, C7258k kVar, List<C7864v> list, C7357x xVar) {
        this.f16153d = i;
        this.f16162m = agVar;
        this.f16154e = kVar;
        this.f16155f = Collections.unmodifiableList(list);
        this.f16167r = xVar;
        this.f16163n = new C7409c();
        this.f16164o = new C7772y(16);
        this.f16157h = new C7772y(C7762v.f18312a);
        this.f16158i = new C7772y(5);
        this.f16159j = new C7772y();
        byte[] bArr = new byte[16];
        this.f16160k = bArr;
        this.f16161l = new C7772y(bArr);
        this.f16165p = new ArrayDeque<>();
        this.f16166q = new ArrayDeque<>();
        this.f16156g = new SparseArray<>();
        this.f16142A = -9223372036854775807L;
        this.f16175z = -9223372036854775807L;
        this.f16143B = -9223372036854775807L;
        this.f16149H = C7329j.f16703a;
        this.f16150I = new C7357x[0];
        this.f16151J = new C7357x[0];
    }

    /* renamed from: a */
    private static int m19668a(int i) throws C6809ai {
        if (i >= 0) {
            return i;
        }
        throw C6809ai.m17540b("Unexpected negative value: " + i, (Throwable) null);
    }

    /* renamed from: a */
    private static int m19669a(C7249b bVar, int i, int i2, C7772y yVar, int i3) throws C6809ai {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        C7249b bVar2 = bVar;
        yVar.mo55076d(8);
        int b = C7233a.m19619b(yVar.mo55093q());
        C7258k kVar = bVar2.f16181d.f16267a;
        C7260m mVar = bVar2.f16179b;
        C7243c cVar = (C7243c) C7728ai.m22198a(mVar.f16248a);
        mVar.f16255h[i] = yVar.mo55099w();
        mVar.f16254g[i] = mVar.f16250c;
        if ((b & 1) != 0) {
            long[] jArr = mVar.f16254g;
            jArr[i] = jArr[i] + ((long) yVar.mo55093q());
        }
        boolean z5 = (b & 4) != 0;
        int i6 = cVar.f16132d;
        if (z5) {
            i6 = yVar.mo55093q();
        }
        boolean z6 = (b & 256) != 0;
        boolean z7 = (b & 512) != 0;
        boolean z8 = (b & 1024) != 0;
        boolean z9 = (b & 2048) != 0;
        long j = 0;
        if (kVar.f16239h != null && kVar.f16239h.length == 1 && kVar.f16239h[0] == 0) {
            j = C7728ai.m22252d(((long[]) C7728ai.m22198a(kVar.f16240i))[0], 1000000, kVar.f16234c);
        }
        int[] iArr = mVar.f16256i;
        int[] iArr2 = mVar.f16257j;
        long[] jArr2 = mVar.f16258k;
        int i7 = i6;
        boolean[] zArr = mVar.f16259l;
        boolean z10 = kVar.f16233b == 2 && (i2 & 1) != 0;
        int i8 = i3 + mVar.f16255h[i];
        boolean z11 = z10;
        long j2 = kVar.f16234c;
        long j3 = j;
        long[] jArr3 = jArr2;
        long j4 = mVar.f16265r;
        int i9 = i3;
        while (i9 < i8) {
            int a = m19668a(z6 ? yVar.mo55093q() : cVar.f16130b);
            if (z7) {
                z = z6;
                i4 = yVar.mo55093q();
            } else {
                z = z6;
                i4 = cVar.f16131c;
            }
            int a2 = m19668a(i4);
            if (z8) {
                z2 = z5;
                i5 = yVar.mo55093q();
            } else if (i9 != 0 || !z5) {
                z2 = z5;
                i5 = cVar.f16132d;
            } else {
                z2 = z5;
                i5 = i7;
            }
            boolean z12 = z9;
            if (z9) {
                z4 = z7;
                z3 = z8;
                iArr2[i9] = (int) ((((long) yVar.mo55093q()) * 1000000) / j2);
            } else {
                z4 = z7;
                z3 = z8;
                iArr2[i9] = 0;
            }
            jArr3[i9] = C7728ai.m22252d(j4, 1000000, j2) - j3;
            if (!mVar.f16266s) {
                jArr3[i9] = jArr3[i9] + bVar2.f16181d.f16274h;
            }
            iArr[i9] = a2;
            zArr[i9] = ((i5 >> 16) & 1) == 0 && (!z11 || i9 == 0);
            j4 += (long) a;
            i9++;
            bVar2 = bVar;
            z6 = z;
            j2 = j2;
            z5 = z2;
            z9 = z12;
            z7 = z4;
            z8 = z3;
        }
        mVar.f16265r = j4;
        return i8;
    }

    /* renamed from: a */
    private static Pair<Long, C7195c> m19670a(C7772y yVar, long j) throws C6809ai {
        long j2;
        long j3;
        C7772y yVar2 = yVar;
        yVar2.mo55076d(8);
        int a = C7233a.m19618a(yVar.mo55093q());
        yVar2.mo55079e(4);
        long o = yVar.mo55091o();
        if (a == 0) {
            j3 = yVar.mo55091o();
            j2 = yVar.mo55091o();
        } else {
            j3 = yVar.mo55101y();
            j2 = yVar.mo55101y();
        }
        long j4 = j3;
        long j5 = j + j2;
        long d = C7728ai.m22252d(j4, 1000000, o);
        yVar2.mo55079e(2);
        int i = yVar.mo55085i();
        int[] iArr = new int[i];
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        long[] jArr3 = new long[i];
        long j6 = j4;
        long j7 = d;
        int i2 = 0;
        while (i2 < i) {
            int q = yVar.mo55093q();
            if ((q & RecyclerView.UNDEFINED_DURATION) == 0) {
                long o2 = yVar.mo55091o();
                iArr[i2] = q & Integer.MAX_VALUE;
                jArr[i2] = j5;
                jArr3[i2] = j7;
                long j8 = j6 + o2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i3 = i;
                int[] iArr2 = iArr;
                long d2 = C7728ai.m22252d(j8, 1000000, o);
                jArr4[i2] = d2 - jArr5[i2];
                yVar2.mo55079e(4);
                j5 += (long) iArr2[i2];
                i2++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                i = i3;
                long j9 = d2;
                j6 = j8;
                j7 = j9;
            } else {
                throw C6809ai.m17540b("Unhandled indirect reference", (Throwable) null);
            }
        }
        return Pair.create(Long.valueOf(d), new C7195c(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: a */
    private static C7148e m19671a(List<C7233a.C7235b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C7233a.C7235b bVar = list.get(i);
            if (bVar.f16099a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d = bVar.f16103b.mo55077d();
                UUID b = C7253h.m19768b(d);
                if (b == null) {
                    C7755q.m22361c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C7148e.C7150a(b, "video/mp4", d));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C7148e((List<C7148e.C7150a>) arrayList);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.util.SparseArray, android.util.SparseArray<com.applovin.exoplayer2.e.g.c>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.exoplayer2.p186e.p193g.C7243c m19672a(android.util.SparseArray<com.applovin.exoplayer2.p186e.p193g.C7243c> r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L_0x000f
            r4 = 0
            java.lang.Object r3 = r3.valueAt(r4)
        L_0x000c:
            com.applovin.exoplayer2.e.g.c r3 = (com.applovin.exoplayer2.p186e.p193g.C7243c) r3
            return r3
        L_0x000f:
            java.lang.Object r3 = r3.get(r4)
            com.applovin.exoplayer2.e.g.c r3 = (com.applovin.exoplayer2.p186e.p193g.C7243c) r3
            java.lang.Object r3 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r3)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p193g.C7247e.m19672a(android.util.SparseArray, int):com.applovin.exoplayer2.e.g.c");
    }

    /* renamed from: a */
    private static C7249b m19673a(SparseArray<C7249b> sparseArray) {
        int size = sparseArray.size();
        C7249b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C7249b valueAt = sparseArray.valueAt(i);
            if ((valueAt.f16189l || valueAt.f16183f != valueAt.f16181d.f16268b) && (!valueAt.f16189l || valueAt.f16185h != valueAt.f16179b.f16252e)) {
                long c = valueAt.mo53970c();
                if (c < j) {
                    bVar = valueAt;
                    j = c;
                }
            }
        }
        return bVar;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.util.SparseArray, android.util.SparseArray<com.applovin.exoplayer2.e.g.e$b>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.p186e.p193g.C7247e.C7249b m19674a(com.applovin.exoplayer2.p221l.C7772y r4, android.util.SparseArray<com.applovin.exoplayer2.p186e.p193g.C7247e.C7249b> r5, boolean r6) {
        /*
            r0 = 8
            r4.mo55076d(r0)
            int r0 = r4.mo55093q()
            int r0 = com.applovin.exoplayer2.p186e.p193g.C7233a.m19619b(r0)
            int r1 = r4.mo55093q()
            if (r6 == 0) goto L_0x0019
            r6 = 0
            java.lang.Object r5 = r5.valueAt(r6)
            goto L_0x001d
        L_0x0019:
            java.lang.Object r5 = r5.get(r1)
        L_0x001d:
            com.applovin.exoplayer2.e.g.e$b r5 = (com.applovin.exoplayer2.p186e.p193g.C7247e.C7249b) r5
            if (r5 != 0) goto L_0x0023
            r4 = 0
            return r4
        L_0x0023:
            r6 = r0 & 1
            if (r6 == 0) goto L_0x0033
            long r1 = r4.mo55101y()
            com.applovin.exoplayer2.e.g.m r6 = r5.f16179b
            r6.f16250c = r1
            com.applovin.exoplayer2.e.g.m r6 = r5.f16179b
            r6.f16251d = r1
        L_0x0033:
            com.applovin.exoplayer2.e.g.c r6 = r5.f16182e
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0040
            int r1 = r4.mo55093q()
            int r1 = r1 + -1
            goto L_0x0042
        L_0x0040:
            int r1 = r6.f16129a
        L_0x0042:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x004b
            int r2 = r4.mo55093q()
            goto L_0x004d
        L_0x004b:
            int r2 = r6.f16130b
        L_0x004d:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x0056
            int r3 = r4.mo55093q()
            goto L_0x0058
        L_0x0056:
            int r3 = r6.f16131c
        L_0x0058:
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0061
            int r4 = r4.mo55093q()
            goto L_0x0063
        L_0x0061:
            int r4 = r6.f16132d
        L_0x0063:
            com.applovin.exoplayer2.e.g.m r6 = r5.f16179b
            com.applovin.exoplayer2.e.g.c r0 = new com.applovin.exoplayer2.e.g.c
            r0.<init>(r1, r2, r3, r4)
            r6.f16248a = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p193g.C7247e.m19674a(com.applovin.exoplayer2.l.y, android.util.SparseArray, boolean):com.applovin.exoplayer2.e.g.e$b");
    }

    /* renamed from: a */
    private void m19675a() {
        this.f16168s = 0;
        this.f16171v = 0;
    }

    /* renamed from: a */
    private void m19676a(long j) throws C6809ai {
        while (!this.f16165p.isEmpty() && this.f16165p.peek().f16100b == j) {
            m19677a(this.f16165p.pop());
        }
        m19675a();
    }

    /* renamed from: a */
    private void m19677a(C7233a.C7234a aVar) throws C6809ai {
        if (aVar.f16099a == 1836019574) {
            m19690b(aVar);
        } else if (aVar.f16099a == 1836019558) {
            m19696c(aVar);
        } else if (!this.f16165p.isEmpty()) {
            this.f16165p.peek().mo53955a(aVar);
        }
    }

    /* renamed from: a */
    private static void m19678a(C7233a.C7234a aVar, SparseArray<C7249b> sparseArray, boolean z, int i, byte[] bArr) throws C6809ai {
        int size = aVar.f16102d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7233a.C7234a aVar2 = aVar.f16102d.get(i2);
            if (aVar2.f16099a == 1953653094) {
                m19691b(aVar2, sparseArray, z, i, bArr);
            }
        }
    }

    /* renamed from: a */
    private static void m19679a(C7233a.C7234a aVar, C7249b bVar, int i) throws C6809ai {
        List<C7233a.C7235b> list = aVar.f16101c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C7233a.C7235b bVar2 = list.get(i4);
            if (bVar2.f16099a == 1953658222) {
                C7772y yVar = bVar2.f16103b;
                yVar.mo55076d(12);
                int w = yVar.mo55099w();
                if (w > 0) {
                    i3 += w;
                    i2++;
                }
            }
        }
        bVar.f16185h = 0;
        bVar.f16184g = 0;
        bVar.f16183f = 0;
        bVar.f16179b.mo53981a(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C7233a.C7235b bVar3 = list.get(i7);
            if (bVar3.f16099a == 1953658222) {
                i6 = m19669a(bVar, i5, i, bVar3.f16103b, i6);
                i5++;
            }
        }
    }

    /* renamed from: a */
    private static void m19680a(C7233a.C7234a aVar, String str, C7260m mVar) throws C6809ai {
        C7233a.C7234a aVar2 = aVar;
        C7260m mVar2 = mVar;
        byte[] bArr = null;
        C7772y yVar = null;
        C7772y yVar2 = null;
        for (int i = 0; i < aVar2.f16101c.size(); i++) {
            C7233a.C7235b bVar = aVar2.f16101c.get(i);
            C7772y yVar3 = bVar.f16103b;
            if (bVar.f16099a == 1935828848) {
                yVar3.mo55076d(12);
                if (yVar3.mo55093q() == 1936025959) {
                    yVar = yVar3;
                }
            } else if (bVar.f16099a == 1936158820) {
                yVar3.mo55076d(12);
                if (yVar3.mo55093q() == 1936025959) {
                    yVar2 = yVar3;
                }
            }
        }
        if (yVar != null && yVar2 != null) {
            yVar.mo55076d(8);
            int a = C7233a.m19618a(yVar.mo55093q());
            yVar.mo55079e(4);
            if (a == 1) {
                yVar.mo55079e(4);
            }
            if (yVar.mo55093q() == 1) {
                yVar2.mo55076d(8);
                int a2 = C7233a.m19618a(yVar2.mo55093q());
                yVar2.mo55079e(4);
                if (a2 == 1) {
                    if (yVar2.mo55091o() == 0) {
                        throw C6809ai.m17538a("Variable length description in sgpd found (unsupported)");
                    }
                } else if (a2 >= 2) {
                    yVar2.mo55079e(4);
                }
                if (yVar2.mo55091o() == 1) {
                    yVar2.mo55079e(1);
                    int h = yVar2.mo55084h();
                    int i2 = (h & 240) >> 4;
                    int i3 = h & 15;
                    boolean z = yVar2.mo55084h() == 1;
                    if (z) {
                        int h2 = yVar2.mo55084h();
                        byte[] bArr2 = new byte[16];
                        yVar2.mo55071a(bArr2, 0, 16);
                        if (h2 == 0) {
                            int h3 = yVar2.mo55084h();
                            bArr = new byte[h3];
                            yVar2.mo55071a(bArr, 0, h3);
                        }
                        mVar2.f16260m = true;
                        mVar2.f16262o = new C7259l(z, str, h2, bArr2, i2, i3, bArr);
                        return;
                    }
                    return;
                }
                throw C6809ai.m17538a("Entry count in sgpd != 1 (unsupported).");
            }
            throw C6809ai.m17538a("Entry count in sbgp != 1 (unsupported).");
        }
    }

    /* renamed from: a */
    private void m19681a(C7233a.C7235b bVar, long j) throws C6809ai {
        if (!this.f16165p.isEmpty()) {
            this.f16165p.peek().mo53956a(bVar);
        } else if (bVar.f16099a == 1936286840) {
            Pair<Long, C7195c> a = m19670a(bVar.f16103b, j);
            this.f16143B = ((Long) a.first).longValue();
            this.f16149H.mo53896a((C7353v) a.second);
            this.f16152K = true;
        } else if (bVar.f16099a == 1701671783) {
            m19683a(bVar.f16103b);
        }
    }

    /* renamed from: a */
    private static void m19682a(C7259l lVar, C7772y yVar, C7260m mVar) throws C6809ai {
        int i;
        int i2 = lVar.f16246d;
        yVar.mo55076d(8);
        boolean z = true;
        if ((C7233a.m19619b(yVar.mo55093q()) & 1) == 1) {
            yVar.mo55079e(8);
        }
        int h = yVar.mo55084h();
        int w = yVar.mo55099w();
        if (w <= mVar.f16253f) {
            if (h == 0) {
                boolean[] zArr = mVar.f16261n;
                i = 0;
                for (int i3 = 0; i3 < w; i3++) {
                    int h2 = yVar.mo55084h();
                    i += h2;
                    zArr[i3] = h2 > i2;
                }
            } else {
                if (h <= i2) {
                    z = false;
                }
                i = (h * w) + 0;
                Arrays.fill(mVar.f16261n, 0, w, z);
            }
            Arrays.fill(mVar.f16261n, w, mVar.f16253f, false);
            if (i > 0) {
                mVar.mo53980a(i);
                return;
            }
            return;
        }
        throw C6809ai.m17540b("Saiz sample count " + w + " is greater than fragment sample count" + mVar.f16253f, (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19683a(com.applovin.exoplayer2.p221l.C7772y r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.applovin.exoplayer2.e.x[] r2 = r0.f16150I
            int r2 = r2.length
            if (r2 != 0) goto L_0x000a
            return
        L_0x000a:
            r2 = 8
            r1.mo55076d(r2)
            int r2 = r27.mo55093q()
            int r2 = com.applovin.exoplayer2.p186e.p193g.C7233a.m19618a(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0074
            r5 = 1
            if (r2 == r5) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentedMp4Extractor"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r2, r1)
            return
        L_0x0038:
            long r11 = r27.mo55091o()
            long r5 = r27.mo55101y()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r11
            long r13 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r5, r7, r9)
            long r5 = r27.mo55091o()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r5, r7, r9)
            long r7 = r27.mo55091o()
            java.lang.String r2 = r27.mo55061B()
            java.lang.Object r2 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r9 = r27.mo55061B()
            java.lang.Object r9 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r9)
            java.lang.String r9 = (java.lang.String) r9
            r19 = r2
            r21 = r5
            r23 = r7
            r20 = r9
            r7 = r3
            goto L_0x00be
        L_0x0074:
            java.lang.String r2 = r27.mo55061B()
            java.lang.Object r2 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = r27.mo55061B()
            java.lang.Object r5 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r5)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            long r5 = r27.mo55091o()
            long r10 = r27.mo55091o()
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r14 = r5
            long r7 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r10, r12, r14)
            long r10 = r0.f16143B
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x00a3
            long r10 = r10 + r7
            r16 = r10
            goto L_0x00a5
        L_0x00a3:
            r16 = r3
        L_0x00a5:
            long r10 = r27.mo55091o()
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = r5
            long r5 = com.applovin.exoplayer2.p221l.C7728ai.m22252d(r10, r12, r14)
            long r10 = r27.mo55091o()
            r19 = r2
            r21 = r5
            r20 = r9
            r23 = r10
            r13 = r16
        L_0x00be:
            int r2 = r27.mo55064a()
            byte[] r2 = new byte[r2]
            int r5 = r27.mo55064a()
            r6 = 0
            r1.mo55071a(r2, r6, r5)
            com.applovin.exoplayer2.g.b.a r1 = new com.applovin.exoplayer2.g.b.a
            r18 = r1
            r25 = r2
            r18.<init>(r19, r20, r21, r23, r25)
            com.applovin.exoplayer2.l.y r2 = new com.applovin.exoplayer2.l.y
            com.applovin.exoplayer2.g.b.c r5 = r0.f16163n
            byte[] r1 = r5.mo54235a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.mo55064a()
            com.applovin.exoplayer2.e.x[] r5 = r0.f16150I
            int r9 = r5.length
            r10 = 0
        L_0x00e8:
            if (r10 >= r9) goto L_0x00f5
            r11 = r5[r10]
            r2.mo55076d(r6)
            r11.mo53951a(r2, r1)
            int r10 = r10 + 1
            goto L_0x00e8
        L_0x00f5:
            int r2 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0109
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.e$a> r2 = r0.f16166q
            com.applovin.exoplayer2.e.g.e$a r3 = new com.applovin.exoplayer2.e.g.e$a
            r3.<init>(r7, r1)
            r2.addLast(r3)
            int r2 = r0.f16174y
            int r2 = r2 + r1
            r0.f16174y = r2
            goto L_0x0128
        L_0x0109:
            com.applovin.exoplayer2.l.ag r2 = r0.f16162m
            if (r2 == 0) goto L_0x0111
            long r13 = r2.mo54991c(r13)
        L_0x0111:
            com.applovin.exoplayer2.e.x[] r2 = r0.f16150I
            int r3 = r2.length
        L_0x0114:
            if (r6 >= r3) goto L_0x0128
            r15 = r2[r6]
            r18 = 1
            r20 = 0
            r21 = 0
            r16 = r13
            r19 = r1
            r15.mo53950a(r16, r18, r19, r20, r21)
            int r6 = r6 + 1
            goto L_0x0114
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p193g.C7247e.m19683a(com.applovin.exoplayer2.l.y):void");
    }

    /* renamed from: a */
    private static void m19684a(C7772y yVar, int i, C7260m mVar) throws C6809ai {
        yVar.mo55076d(i + 8);
        int b = C7233a.m19619b(yVar.mo55093q());
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int w = yVar.mo55099w();
            if (w == 0) {
                Arrays.fill(mVar.f16261n, 0, mVar.f16253f, false);
            } else if (w == mVar.f16253f) {
                Arrays.fill(mVar.f16261n, 0, w, z);
                mVar.mo53980a(yVar.mo55064a());
                mVar.mo53983a(yVar);
            } else {
                throw C6809ai.m17540b("Senc sample count " + w + " is different from fragment sample count" + mVar.f16253f, (Throwable) null);
            }
        } else {
            throw C6809ai.m17538a("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    /* renamed from: a */
    private static void m19685a(C7772y yVar, C7260m mVar) throws C6809ai {
        yVar.mo55076d(8);
        int q = yVar.mo55093q();
        if ((C7233a.m19619b(q) & 1) == 1) {
            yVar.mo55079e(8);
        }
        int w = yVar.mo55099w();
        if (w == 1) {
            mVar.f16251d += C7233a.m19618a(q) == 0 ? yVar.mo55091o() : yVar.mo55101y();
            return;
        }
        throw C6809ai.m17540b("Unexpected saio entry count: " + w, (Throwable) null);
    }

    /* renamed from: a */
    private static void m19686a(C7772y yVar, C7260m mVar, byte[] bArr) throws C6809ai {
        yVar.mo55076d(8);
        yVar.mo55071a(bArr, 0, 16);
        if (Arrays.equals(bArr, f16140b)) {
            m19684a(yVar, 16, mVar);
        }
    }

    /* renamed from: b */
    private static Pair<Integer, C7243c> m19687b(C7772y yVar) {
        yVar.mo55076d(12);
        return Pair.create(Integer.valueOf(yVar.mo55093q()), new C7243c(yVar.mo55093q() - 1, yVar.mo55093q(), yVar.mo55093q(), yVar.mo55093q()));
    }

    /* renamed from: b */
    private void m19688b() {
        int i;
        C7357x[] xVarArr = new C7357x[2];
        this.f16150I = xVarArr;
        C7357x xVar = this.f16167r;
        int i2 = 0;
        if (xVar != null) {
            xVarArr[0] = xVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f16153d & 4) != 0) {
            this.f16150I[i] = this.f16149H.mo53894a(100, 5);
            i++;
            i3 = 101;
        }
        C7357x[] xVarArr2 = (C7357x[]) C7728ai.m22221a((T[]) this.f16150I, i);
        this.f16150I = xVarArr2;
        for (C7357x a : xVarArr2) {
            a.mo53953a(f16141c);
        }
        this.f16151J = new C7357x[this.f16155f.size()];
        while (i2 < this.f16151J.length) {
            C7357x a2 = this.f16149H.mo53894a(i3, 3);
            a2.mo53953a(this.f16155f.get(i2));
            this.f16151J[i2] = a2;
            i2++;
            i3++;
        }
    }

    /* renamed from: b */
    private void m19689b(long j) {
        while (!this.f16166q.isEmpty()) {
            C7248a removeFirst = this.f16166q.removeFirst();
            this.f16174y -= removeFirst.f16177b;
            long j2 = removeFirst.f16176a + j;
            C7726ag agVar = this.f16162m;
            if (agVar != null) {
                j2 = agVar.mo54991c(j2);
            }
            for (C7357x a : this.f16150I) {
                a.mo53950a(j2, 1, removeFirst.f16177b, this.f16174y, (C7357x.C7358a) null);
            }
        }
    }

    /* renamed from: b */
    private void m19690b(C7233a.C7234a aVar) throws C6809ai {
        boolean z = true;
        int i = 0;
        C7717a.m22122b(this.f16154e == null, "Unexpected moov box.");
        C7148e a = m19671a(aVar.f16101c);
        C7233a.C7234a aVar2 = (C7233a.C7234a) C7717a.m22120b(aVar.mo53958e(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f16101c.size();
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            C7233a.C7235b bVar = aVar2.f16101c.get(i2);
            if (bVar.f16099a == 1953654136) {
                Pair<Integer, C7243c> b = m19687b(bVar.f16103b);
                sparseArray.put(((Integer) b.first).intValue(), (C7243c) b.second);
            } else if (bVar.f16099a == 1835362404) {
                j = m19695c(bVar.f16103b);
            }
        }
        List<C7261n> a2 = C7236b.m19634a(aVar, new C7349r(), j, a, (this.f16153d & 16) != 0, false, (Function<C7258k, C7258k>) new Function() {
            public final Object apply(Object obj) {
                return C7247e.this.mo53963a((C7258k) obj);
            }
        });
        int size2 = a2.size();
        if (this.f16156g.size() == 0) {
            while (i < size2) {
                C7261n nVar = a2.get(i);
                C7258k kVar = nVar.f16267a;
                this.f16156g.put(kVar.f16232a, new C7249b(this.f16149H.mo53894a(i, kVar.f16233b), nVar, m19672a((SparseArray<C7243c>) sparseArray, kVar.f16232a)));
                this.f16142A = Math.max(this.f16142A, kVar.f16236e);
                i++;
            }
            this.f16149H.mo53895a();
            return;
        }
        if (this.f16156g.size() != size2) {
            z = false;
        }
        C7717a.m22121b(z);
        while (i < size2) {
            C7261n nVar2 = a2.get(i);
            C7258k kVar2 = nVar2.f16267a;
            this.f16156g.get(kVar2.f16232a).mo53968a(nVar2, m19672a((SparseArray<C7243c>) sparseArray, kVar2.f16232a));
            i++;
        }
    }

    /* renamed from: b */
    private static void m19691b(C7233a.C7234a aVar, SparseArray<C7249b> sparseArray, boolean z, int i, byte[] bArr) throws C6809ai {
        C7249b a = m19674a(((C7233a.C7235b) C7717a.m22120b(aVar.mo53957d(1952868452))).f16103b, sparseArray, z);
        if (a != null) {
            C7260m mVar = a.f16179b;
            long j = mVar.f16265r;
            boolean z2 = mVar.f16266s;
            a.mo53965a();
            boolean unused = a.f16189l = true;
            C7233a.C7235b d = aVar.mo53957d(1952867444);
            if (d == null || (i & 2) != 0) {
                mVar.f16265r = j;
                mVar.f16266s = z2;
            } else {
                mVar.f16265r = m19699d(d.f16103b);
                mVar.f16266s = true;
            }
            m19679a(aVar, a, i);
            C7259l a2 = a.f16181d.f16267a.mo53978a(((C7243c) C7717a.m22120b(mVar.f16248a)).f16129a);
            C7233a.C7235b d2 = aVar.mo53957d(1935763834);
            if (d2 != null) {
                m19682a((C7259l) C7717a.m22120b(a2), d2.f16103b, mVar);
            }
            C7233a.C7235b d3 = aVar.mo53957d(1935763823);
            if (d3 != null) {
                m19685a(d3.f16103b, mVar);
            }
            C7233a.C7235b d4 = aVar.mo53957d(1936027235);
            if (d4 != null) {
                m19692b(d4.f16103b, mVar);
            }
            m19680a(aVar, a2 != null ? a2.f16244b : null, mVar);
            int size = aVar.f16101c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C7233a.C7235b bVar = aVar.f16101c.get(i2);
                if (bVar.f16099a == 1970628964) {
                    m19686a(bVar.f16103b, mVar, bArr);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m19692b(C7772y yVar, C7260m mVar) throws C6809ai {
        m19684a(yVar, 0, mVar);
    }

    /* renamed from: b */
    private static boolean m19693b(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0152  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m19694b(com.applovin.exoplayer2.p186e.C7279i r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f16171v
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x002c
            com.applovin.exoplayer2.l.y r0 = r11.f16164o
            byte[] r0 = r0.mo55077d()
            boolean r0 = r12.mo53901a(r0, r2, r1, r3)
            if (r0 != 0) goto L_0x0015
            return r2
        L_0x0015:
            r11.f16171v = r1
            com.applovin.exoplayer2.l.y r0 = r11.f16164o
            r0.mo55076d(r2)
            com.applovin.exoplayer2.l.y r0 = r11.f16164o
            long r4 = r0.mo55091o()
            r11.f16170u = r4
            com.applovin.exoplayer2.l.y r0 = r11.f16164o
            int r0 = r0.mo55093q()
            r11.f16169t = r0
        L_0x002c:
            long r4 = r11.f16170u
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x004b
            com.applovin.exoplayer2.l.y r0 = r11.f16164o
            byte[] r0 = r0.mo55077d()
            r12.mo53903b(r0, r1, r1)
            int r0 = r11.f16171v
            int r0 = r0 + r1
            r11.f16171v = r0
            com.applovin.exoplayer2.l.y r0 = r11.f16164o
            long r4 = r0.mo55101y()
        L_0x0048:
            r11.f16170u = r4
            goto L_0x007b
        L_0x004b:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x007b
            long r4 = r12.mo53893d()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r0 = r11.f16165p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006d
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r0 = r11.f16165p
            java.lang.Object r0 = r0.peek()
            com.applovin.exoplayer2.e.g.a$a r0 = (com.applovin.exoplayer2.p186e.p193g.C7233a.C7234a) r0
            long r4 = r0.f16100b
        L_0x006d:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x007b
            long r6 = r12.mo53892c()
            long r4 = r4 - r6
            int r0 = r11.f16171v
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x0048
        L_0x007b:
            long r4 = r11.f16170u
            int r0 = r11.f16171v
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0152
            long r4 = r12.mo53892c()
            int r0 = r11.f16171v
            long r6 = (long) r0
            long r4 = r4 - r6
            int r0 = r11.f16169t
            r6 = 1835295092(0x6d646174, float:4.4175247E27)
            r7 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r0 == r7) goto L_0x0098
            if (r0 != r6) goto L_0x00aa
        L_0x0098:
            boolean r0 = r11.f16152K
            if (r0 != 0) goto L_0x00aa
            com.applovin.exoplayer2.e.j r0 = r11.f16149H
            com.applovin.exoplayer2.e.v$b r8 = new com.applovin.exoplayer2.e.v$b
            long r9 = r11.f16142A
            r8.<init>(r9, r4)
            r0.mo53896a(r8)
            r11.f16152K = r3
        L_0x00aa:
            int r0 = r11.f16169t
            if (r0 != r7) goto L_0x00ca
            android.util.SparseArray<com.applovin.exoplayer2.e.g.e$b> r0 = r11.f16156g
            int r0 = r0.size()
            r7 = 0
        L_0x00b5:
            if (r7 >= r0) goto L_0x00ca
            android.util.SparseArray<com.applovin.exoplayer2.e.g.e$b> r8 = r11.f16156g
            java.lang.Object r8 = r8.valueAt(r7)
            com.applovin.exoplayer2.e.g.e$b r8 = (com.applovin.exoplayer2.p186e.p193g.C7247e.C7249b) r8
            com.applovin.exoplayer2.e.g.m r8 = r8.f16179b
            r8.f16249b = r4
            r8.f16251d = r4
            r8.f16250c = r4
            int r7 = r7 + 1
            goto L_0x00b5
        L_0x00ca:
            int r0 = r11.f16169t
            r7 = 0
            if (r0 != r6) goto L_0x00da
            r11.f16144C = r7
            long r0 = r11.f16170u
            long r4 = r4 + r0
            r11.f16173x = r4
            r12 = 2
            r11.f16168s = r12
            return r3
        L_0x00da:
            boolean r0 = m19698c((int) r0)
            if (r0 == 0) goto L_0x0107
            long r0 = r12.mo53892c()
            long r4 = r11.f16170u
            long r0 = r0 + r4
            r4 = 8
            long r0 = r0 - r4
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r12 = r11.f16165p
            com.applovin.exoplayer2.e.g.a$a r2 = new com.applovin.exoplayer2.e.g.a$a
            int r4 = r11.f16169t
            r2.<init>(r4, r0)
            r12.push(r2)
            long r4 = r11.f16170u
            int r12 = r11.f16171v
            long r6 = (long) r12
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x0103
            r11.m19676a((long) r0)
            goto L_0x014a
        L_0x0103:
            r11.m19675a()
            goto L_0x014a
        L_0x0107:
            int r12 = r11.f16169t
            boolean r12 = m19693b((int) r12)
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r12 == 0) goto L_0x0140
            int r12 = r11.f16171v
            if (r12 != r1) goto L_0x0139
            long r6 = r11.f16170u
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 > 0) goto L_0x0132
            com.applovin.exoplayer2.l.y r12 = new com.applovin.exoplayer2.l.y
            int r0 = (int) r6
            r12.<init>((int) r0)
            com.applovin.exoplayer2.l.y r0 = r11.f16164o
            byte[] r0 = r0.mo55077d()
            byte[] r4 = r12.mo55077d()
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r11.f16172w = r12
            goto L_0x0148
        L_0x0132:
            java.lang.String r12 = "Leaf atom with length > 2147483647 (unsupported)."
            com.applovin.exoplayer2.ai r12 = com.applovin.exoplayer2.C6809ai.m17538a(r12)
            throw r12
        L_0x0139:
            java.lang.String r12 = "Leaf atom defines extended atom size (unsupported)."
            com.applovin.exoplayer2.ai r12 = com.applovin.exoplayer2.C6809ai.m17538a(r12)
            throw r12
        L_0x0140:
            long r0 = r11.f16170u
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 > 0) goto L_0x014b
            r11.f16172w = r7
        L_0x0148:
            r11.f16168s = r3
        L_0x014a:
            return r3
        L_0x014b:
            java.lang.String r12 = "Skipping atom with length > 2147483647 (unsupported)."
            com.applovin.exoplayer2.ai r12 = com.applovin.exoplayer2.C6809ai.m17538a(r12)
            throw r12
        L_0x0152:
            java.lang.String r12 = "Atom size less than header length (unsupported)."
            com.applovin.exoplayer2.ai r12 = com.applovin.exoplayer2.C6809ai.m17538a(r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p193g.C7247e.m19694b(com.applovin.exoplayer2.e.i):boolean");
    }

    /* renamed from: c */
    private static long m19695c(C7772y yVar) {
        yVar.mo55076d(8);
        return C7233a.m19618a(yVar.mo55093q()) == 0 ? yVar.mo55091o() : yVar.mo55101y();
    }

    /* renamed from: c */
    private void m19696c(C7233a.C7234a aVar) throws C6809ai {
        m19678a(aVar, this.f16156g, this.f16154e != null, this.f16153d, this.f16160k);
        C7148e a = m19671a(aVar.f16101c);
        if (a != null) {
            int size = this.f16156g.size();
            for (int i = 0; i < size; i++) {
                this.f16156g.valueAt(i).mo53967a(a);
            }
        }
        if (this.f16175z != -9223372036854775807L) {
            int size2 = this.f16156g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f16156g.valueAt(i2).mo53966a(this.f16175z);
            }
            this.f16175z = -9223372036854775807L;
        }
    }

    /* renamed from: c */
    private void m19697c(C7279i iVar) throws IOException {
        int i = ((int) this.f16170u) - this.f16171v;
        C7772y yVar = this.f16172w;
        if (yVar != null) {
            iVar.mo53903b(yVar.mo55077d(), 8, i);
            m19681a(new C7233a.C7235b(this.f16169t, yVar), iVar.mo53892c());
        } else {
            iVar.mo53902b(i);
        }
        m19676a(iVar.mo53892c());
    }

    /* renamed from: c */
    private static boolean m19698c(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* renamed from: d */
    private static long m19699d(C7772y yVar) {
        yVar.mo55076d(8);
        return C7233a.m19618a(yVar.mo55093q()) == 1 ? yVar.mo55101y() : yVar.mo55091o();
    }

    /* renamed from: d */
    private void m19700d(C7279i iVar) throws IOException {
        int size = this.f16156g.size();
        long j = Long.MAX_VALUE;
        C7249b bVar = null;
        for (int i = 0; i < size; i++) {
            C7260m mVar = this.f16156g.valueAt(i).f16179b;
            if (mVar.f16264q && mVar.f16251d < j) {
                j = mVar.f16251d;
                bVar = this.f16156g.valueAt(i);
            }
        }
        if (bVar == null) {
            this.f16168s = 3;
            return;
        }
        int c = (int) (j - iVar.mo53892c());
        if (c >= 0) {
            iVar.mo53902b(c);
            bVar.f16179b.mo53982a(iVar);
            return;
        }
        throw C6809ai.m17540b("Offset to encryption data was negative.", (Throwable) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C7262h[] m19701d() {
        return new C7262h[]{new C7247e()};
    }

    /* renamed from: e */
    private boolean m19702e(C7279i iVar) throws IOException {
        int i;
        int i2;
        C7279i iVar2 = iVar;
        C7249b bVar = this.f16144C;
        Throwable th = null;
        if (bVar == null) {
            bVar = m19673a(this.f16156g);
            if (bVar == null) {
                int c = (int) (this.f16173x - iVar.mo53892c());
                if (c >= 0) {
                    iVar2.mo53902b(c);
                    m19675a();
                    return false;
                }
                throw C6809ai.m17540b("Offset to end of mdat was negative.", (Throwable) null);
            }
            int c2 = (int) (bVar.mo53970c() - iVar.mo53892c());
            if (c2 < 0) {
                C7755q.m22361c("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                c2 = 0;
            }
            iVar2.mo53902b(c2);
            this.f16144C = bVar;
        }
        int i3 = 4;
        int i4 = 1;
        if (this.f16168s == 3) {
            this.f16145D = bVar.mo53971d();
            if (bVar.f16183f < bVar.f16186i) {
                iVar2.mo53902b(this.f16145D);
                bVar.mo53974g();
                if (!bVar.mo53973f()) {
                    this.f16144C = null;
                }
                this.f16168s = 3;
                return true;
            }
            if (bVar.f16181d.f16267a.f16238g == 1) {
                this.f16145D -= 8;
                iVar2.mo53902b(8);
            }
            if ("audio/ac4".equals(bVar.f16181d.f16267a.f16237f.f18921l)) {
                this.f16146E = bVar.mo53964a(this.f16145D, 7);
                C6853c.m17947a(this.f16145D, this.f16161l);
                bVar.f16178a.mo53951a(this.f16161l, 7);
                i2 = this.f16146E + 7;
            } else {
                i2 = bVar.mo53964a(this.f16145D, 0);
            }
            this.f16146E = i2;
            this.f16145D += this.f16146E;
            this.f16168s = 4;
            this.f16147F = 0;
        }
        C7258k kVar = bVar.f16181d.f16267a;
        C7357x xVar = bVar.f16178a;
        long b = bVar.mo53969b();
        C7726ag agVar = this.f16162m;
        if (agVar != null) {
            b = agVar.mo54991c(b);
        }
        long j = b;
        if (kVar.f16241j == 0) {
            while (true) {
                int i5 = this.f16146E;
                int i6 = this.f16145D;
                if (i5 >= i6) {
                    break;
                }
                this.f16146E += xVar.mo53948a((C7668g) iVar2, i6 - i5, false);
            }
        } else {
            byte[] d = this.f16158i.mo55077d();
            d[0] = 0;
            d[1] = 0;
            d[2] = 0;
            int i7 = kVar.f16241j + 1;
            int i8 = 4 - kVar.f16241j;
            while (this.f16146E < this.f16145D) {
                int i9 = this.f16147F;
                if (i9 == 0) {
                    iVar2.mo53903b(d, i8, i7);
                    this.f16158i.mo55076d(0);
                    int q = this.f16158i.mo55093q();
                    if (q >= i4) {
                        this.f16147F = q - 1;
                        this.f16157h.mo55076d(0);
                        xVar.mo53951a(this.f16157h, i3);
                        xVar.mo53951a(this.f16158i, i4);
                        this.f16148G = this.f16151J.length > 0 && C7762v.m22396a(kVar.f16237f.f18921l, d[i3]);
                        this.f16146E += 5;
                        this.f16145D += i8;
                    } else {
                        throw C6809ai.m17540b("Invalid NAL length", th);
                    }
                } else {
                    if (this.f16148G) {
                        this.f16159j.mo55067a(i9);
                        iVar2.mo53903b(this.f16159j.mo55077d(), 0, this.f16147F);
                        xVar.mo53951a(this.f16159j, this.f16147F);
                        i = this.f16147F;
                        int a = C7762v.m22390a(this.f16159j.mo55077d(), this.f16159j.mo55072b());
                        this.f16159j.mo55076d("video/hevc".equals(kVar.f16237f.f18921l) ? 1 : 0);
                        this.f16159j.mo55075c(a);
                        C7190b.m19342a(j, this.f16159j, this.f16151J);
                    } else {
                        i = xVar.mo53948a((C7668g) iVar2, i9, false);
                    }
                    this.f16146E += i;
                    this.f16147F -= i;
                    th = null;
                    i3 = 4;
                    i4 = 1;
                }
            }
        }
        int e = bVar.mo53972e();
        C7259l h = bVar.mo53975h();
        xVar.mo53950a(j, e, this.f16145D, 0, h != null ? h.f16245c : null);
        m19689b(j);
        if (!bVar.mo53973f()) {
            this.f16144C = null;
        }
        this.f16168s = 3;
        return true;
    }

    /* renamed from: a */
    public int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        while (true) {
            int i = this.f16168s;
            if (i != 0) {
                if (i == 1) {
                    m19697c(iVar);
                } else if (i == 2) {
                    m19700d(iVar);
                } else if (m19702e(iVar)) {
                    return 0;
                }
            } else if (!m19694b(iVar)) {
                return -1;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7258k mo53963a(C7258k kVar) {
        return kVar;
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        int size = this.f16156g.size();
        for (int i = 0; i < size; i++) {
            this.f16156g.valueAt(i).mo53965a();
        }
        this.f16166q.clear();
        this.f16174y = 0;
        this.f16175z = j2;
        this.f16165p.clear();
        m19675a();
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f16149H = jVar;
        m19675a();
        m19688b();
        C7258k kVar = this.f16154e;
        if (kVar != null) {
            this.f16156g.put(0, new C7249b(jVar.mo53894a(0, kVar.f16233b), new C7261n(this.f16154e, new long[0], new int[0], 0, new long[0], new int[0], 0), new C7243c(0, 0, 0, 0)));
            this.f16149H.mo53895a();
        }
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        return C7257j.m19782a(iVar);
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
