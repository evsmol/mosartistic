package com.applovin.exoplayer2.p206h;

import android.os.Looper;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.C7867w;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p185d.C7152f;
import com.applovin.exoplayer2.p185d.C7154g;
import com.applovin.exoplayer2.p185d.C7157h;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p220k.C7657b;
import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7759u;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.h.w */
public class C7529w implements C7357x {

    /* renamed from: A */
    private boolean f17357A;

    /* renamed from: B */
    private C7864v f17358B;

    /* renamed from: C */
    private C7864v f17359C;

    /* renamed from: D */
    private int f17360D;

    /* renamed from: E */
    private boolean f17361E;

    /* renamed from: F */
    private boolean f17362F;

    /* renamed from: G */
    private long f17363G;

    /* renamed from: H */
    private boolean f17364H;

    /* renamed from: a */
    private final C7527v f17365a;

    /* renamed from: b */
    private final C7531a f17366b = new C7531a();

    /* renamed from: c */
    private final C7481ab<C7532b> f17367c = new C7481ab<>($$Lambda$w$ZgqdAvo8Ssoldu4N7_nka4oiy6s.INSTANCE);

    /* renamed from: d */
    private final C7157h f17368d;

    /* renamed from: e */
    private final C7154g.C7155a f17369e;

    /* renamed from: f */
    private final Looper f17370f;

    /* renamed from: g */
    private C7533c f17371g;

    /* renamed from: h */
    private C7864v f17372h;

    /* renamed from: i */
    private C7152f f17373i;

    /* renamed from: j */
    private int f17374j = 1000;

    /* renamed from: k */
    private int[] f17375k = new int[1000];

    /* renamed from: l */
    private long[] f17376l = new long[1000];

    /* renamed from: m */
    private int[] f17377m = new int[1000];

    /* renamed from: n */
    private int[] f17378n = new int[1000];

    /* renamed from: o */
    private long[] f17379o = new long[1000];

    /* renamed from: p */
    private C7357x.C7358a[] f17380p = new C7357x.C7358a[1000];

    /* renamed from: q */
    private int f17381q;

    /* renamed from: r */
    private int f17382r;

    /* renamed from: s */
    private int f17383s;

    /* renamed from: t */
    private int f17384t;

    /* renamed from: u */
    private long f17385u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f17386v = Long.MIN_VALUE;

    /* renamed from: w */
    private long f17387w = Long.MIN_VALUE;

    /* renamed from: x */
    private boolean f17388x;

    /* renamed from: y */
    private boolean f17389y = true;

    /* renamed from: z */
    private boolean f17390z = true;

    /* renamed from: com.applovin.exoplayer2.h.w$a */
    static final class C7531a {

        /* renamed from: a */
        public int f17391a;

        /* renamed from: b */
        public long f17392b;

        /* renamed from: c */
        public C7357x.C7358a f17393c;

        C7531a() {
        }
    }

    /* renamed from: com.applovin.exoplayer2.h.w$b */
    private static final class C7532b {

        /* renamed from: a */
        public final C7864v f17394a;

        /* renamed from: b */
        public final C7157h.C7159a f17395b;

        private C7532b(C7864v vVar, C7157h.C7159a aVar) {
            this.f17394a = vVar;
            this.f17395b = aVar;
        }
    }

    /* renamed from: com.applovin.exoplayer2.h.w$c */
    public interface C7533c {
        /* renamed from: a */
        void mo54571a(C7864v vVar);
    }

    protected C7529w(C7657b bVar, Looper looper, C7157h hVar, C7154g.C7155a aVar) {
        this.f17370f = looper;
        this.f17368d = hVar;
        this.f17369e = aVar;
        this.f17365a = new C7527v(bVar);
    }

    /* renamed from: a */
    private int m21164a(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f17379o[i] <= j; i4++) {
            if (!z || (this.f17378n[i] & 1) != 0) {
                if (this.f17379o[i] == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f17374j) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return -3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int m21165a(com.applovin.exoplayer2.C7867w r5, com.applovin.exoplayer2.p182c.C6922g r6, boolean r7, boolean r8, com.applovin.exoplayer2.p206h.C7529w.C7531a r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r6.f15333c = r0     // Catch:{ all -> 0x008e }
            boolean r0 = r4.m21182o()     // Catch:{ all -> 0x008e }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0035
            if (r8 != 0) goto L_0x002f
            boolean r8 = r4.f17388x     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x0014
            goto L_0x002f
        L_0x0014:
            com.applovin.exoplayer2.v r6 = r4.f17359C     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x002d
            if (r7 != 0) goto L_0x0020
            com.applovin.exoplayer2.v r6 = r4.f17359C     // Catch:{ all -> 0x008e }
            com.applovin.exoplayer2.v r7 = r4.f17372h     // Catch:{ all -> 0x008e }
            if (r6 == r7) goto L_0x002d
        L_0x0020:
            com.applovin.exoplayer2.v r6 = r4.f17359C     // Catch:{ all -> 0x008e }
            java.lang.Object r6 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r6)     // Catch:{ all -> 0x008e }
            com.applovin.exoplayer2.v r6 = (com.applovin.exoplayer2.C7864v) r6     // Catch:{ all -> 0x008e }
            r4.m21169a((com.applovin.exoplayer2.C7864v) r6, (com.applovin.exoplayer2.C7867w) r5)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            return r1
        L_0x002d:
            monitor-exit(r4)
            return r2
        L_0x002f:
            r5 = 4
            r6.mo53122a_(r5)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            return r3
        L_0x0035:
            com.applovin.exoplayer2.h.ab<com.applovin.exoplayer2.h.w$b> r8 = r4.f17367c     // Catch:{ all -> 0x008e }
            int r0 = r4.mo54610f()     // Catch:{ all -> 0x008e }
            java.lang.Object r8 = r8.mo54472a((int) r0)     // Catch:{ all -> 0x008e }
            com.applovin.exoplayer2.h.w$b r8 = (com.applovin.exoplayer2.p206h.C7529w.C7532b) r8     // Catch:{ all -> 0x008e }
            com.applovin.exoplayer2.v r8 = r8.f17394a     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x0089
            com.applovin.exoplayer2.v r7 = r4.f17372h     // Catch:{ all -> 0x008e }
            if (r8 == r7) goto L_0x004a
            goto L_0x0089
        L_0x004a:
            int r5 = r4.f17384t     // Catch:{ all -> 0x008e }
            int r5 = r4.m21178f(r5)     // Catch:{ all -> 0x008e }
            boolean r7 = r4.m21174c((int) r5)     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x005b
            r5 = 1
            r6.f15333c = r5     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            return r2
        L_0x005b:
            int[] r7 = r4.f17378n     // Catch:{ all -> 0x008e }
            r7 = r7[r5]     // Catch:{ all -> 0x008e }
            r6.mo53122a_(r7)     // Catch:{ all -> 0x008e }
            long[] r7 = r4.f17379o     // Catch:{ all -> 0x008e }
            r0 = r7[r5]     // Catch:{ all -> 0x008e }
            r6.f15334d = r0     // Catch:{ all -> 0x008e }
            long r7 = r6.f15334d     // Catch:{ all -> 0x008e }
            long r0 = r4.f17385u     // Catch:{ all -> 0x008e }
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0075
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.mo53123b(r7)     // Catch:{ all -> 0x008e }
        L_0x0075:
            int[] r6 = r4.f17377m     // Catch:{ all -> 0x008e }
            r6 = r6[r5]     // Catch:{ all -> 0x008e }
            r9.f17391a = r6     // Catch:{ all -> 0x008e }
            long[] r6 = r4.f17376l     // Catch:{ all -> 0x008e }
            r7 = r6[r5]     // Catch:{ all -> 0x008e }
            r9.f17392b = r7     // Catch:{ all -> 0x008e }
            com.applovin.exoplayer2.e.x$a[] r6 = r4.f17380p     // Catch:{ all -> 0x008e }
            r5 = r6[r5]     // Catch:{ all -> 0x008e }
            r9.f17393c = r5     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            return r3
        L_0x0089:
            r4.m21169a((com.applovin.exoplayer2.C7864v) r8, (com.applovin.exoplayer2.C7867w) r5)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            return r1
        L_0x008e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7529w.m21165a(com.applovin.exoplayer2.w, com.applovin.exoplayer2.c.g, boolean, boolean, com.applovin.exoplayer2.h.w$a):int");
    }

    /* renamed from: a */
    public static C7529w m21166a(C7657b bVar, Looper looper, C7157h hVar, C7154g.C7155a aVar) {
        return new C7529w(bVar, (Looper) C7717a.m22120b(looper), (C7157h) C7717a.m22120b(hVar), (C7154g.C7155a) C7717a.m22120b(aVar));
    }

    /* renamed from: a */
    private synchronized void m21167a(long j, int i, long j2, int i2, C7357x.C7358a aVar) {
        if (this.f17381q > 0) {
            int f = m21178f(this.f17381q - 1);
            C7717a.m22118a(this.f17376l[f] + ((long) this.f17377m[f]) <= j2);
        }
        this.f17388x = (536870912 & i) != 0;
        this.f17387w = Math.max(this.f17387w, j);
        int f2 = m21178f(this.f17381q);
        this.f17379o[f2] = j;
        this.f17376l[f2] = j2;
        this.f17377m[f2] = i2;
        this.f17378n[f2] = i;
        this.f17380p[f2] = aVar;
        this.f17375k[f2] = this.f17360D;
        if (this.f17367c.mo54477c() || !this.f17367c.mo54471a().f17394a.equals(this.f17359C)) {
            this.f17367c.mo54473a(mo54607c(), new C7532b((C7864v) C7717a.m22120b(this.f17359C), this.f17368d != null ? this.f17368d.mo53780a((Looper) C7717a.m22120b(this.f17370f), this.f17369e, this.f17359C) : C7157h.C7159a.f15739b));
        }
        int i3 = this.f17381q + 1;
        this.f17381q = i3;
        if (i3 == this.f17374j) {
            int i4 = this.f17374j + 1000;
            int[] iArr = new int[i4];
            long[] jArr = new long[i4];
            long[] jArr2 = new long[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            C7357x.C7358a[] aVarArr = new C7357x.C7358a[i4];
            int i5 = this.f17374j - this.f17383s;
            System.arraycopy(this.f17376l, this.f17383s, jArr, 0, i5);
            System.arraycopy(this.f17379o, this.f17383s, jArr2, 0, i5);
            System.arraycopy(this.f17378n, this.f17383s, iArr2, 0, i5);
            System.arraycopy(this.f17377m, this.f17383s, iArr3, 0, i5);
            System.arraycopy(this.f17380p, this.f17383s, aVarArr, 0, i5);
            System.arraycopy(this.f17375k, this.f17383s, iArr, 0, i5);
            int i6 = this.f17383s;
            System.arraycopy(this.f17376l, 0, jArr, i5, i6);
            System.arraycopy(this.f17379o, 0, jArr2, i5, i6);
            System.arraycopy(this.f17378n, 0, iArr2, i5, i6);
            System.arraycopy(this.f17377m, 0, iArr3, i5, i6);
            System.arraycopy(this.f17380p, 0, aVarArr, i5, i6);
            System.arraycopy(this.f17375k, 0, iArr, i5, i6);
            this.f17376l = jArr;
            this.f17379o = jArr2;
            this.f17378n = iArr2;
            this.f17377m = iArr3;
            this.f17380p = aVarArr;
            this.f17375k = iArr;
            this.f17383s = 0;
            this.f17374j = i4;
        }
    }

    /* renamed from: a */
    private void m21169a(C7864v vVar, C7867w wVar) {
        boolean z = this.f17372h == null;
        C7148e eVar = z ? null : this.f17372h.f18924o;
        this.f17372h = vVar;
        C7148e eVar2 = vVar.f18924o;
        C7157h hVar = this.f17368d;
        wVar.f18967b = hVar != null ? vVar.mo55409a(hVar.mo53779a(vVar)) : vVar;
        wVar.f18966a = this.f17373i;
        if (this.f17368d != null) {
            if (z || !C7728ai.m22218a((Object) eVar, (Object) eVar2)) {
                C7152f fVar = this.f17373i;
                C7152f b = this.f17368d.mo53783b((Looper) C7717a.m22120b(this.f17370f), this.f17369e, vVar);
                this.f17373i = b;
                wVar.f18966a = b;
                if (fVar != null) {
                    fVar.mo53763b(this.f17369e);
                }
            }
        }
    }

    /* renamed from: b */
    private long m21170b(int i) {
        int c = mo54607c() - i;
        boolean z = false;
        C7717a.m22118a(c >= 0 && c <= this.f17381q - this.f17384t);
        int i2 = this.f17381q - c;
        this.f17381q = i2;
        this.f17387w = Math.max(this.f17386v, m21177e(i2));
        if (c == 0 && this.f17388x) {
            z = true;
        }
        this.f17388x = z;
        this.f17367c.mo54476c(i);
        int i3 = this.f17381q;
        if (i3 == 0) {
            return 0;
        }
        int f = m21178f(i3 - 1);
        return this.f17376l[f] + ((long) this.f17377m[f]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        return -1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long m21171b(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.f17381q     // Catch:{ all -> 0x0038 }
            r1 = -1
            if (r0 == 0) goto L_0x0036
            long[] r0 = r9.f17379o     // Catch:{ all -> 0x0038 }
            int r3 = r9.f17383s     // Catch:{ all -> 0x0038 }
            r3 = r0[r3]     // Catch:{ all -> 0x0038 }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            goto L_0x0036
        L_0x0012:
            if (r13 == 0) goto L_0x001f
            int r13 = r9.f17384t     // Catch:{ all -> 0x0038 }
            int r0 = r9.f17381q     // Catch:{ all -> 0x0038 }
            if (r13 == r0) goto L_0x001f
            int r13 = r9.f17384t     // Catch:{ all -> 0x0038 }
            int r13 = r13 + 1
            goto L_0x0021
        L_0x001f:
            int r13 = r9.f17381q     // Catch:{ all -> 0x0038 }
        L_0x0021:
            r5 = r13
            int r4 = r9.f17383s     // Catch:{ all -> 0x0038 }
            r3 = r9
            r6 = r10
            r8 = r12
            int r10 = r3.m21164a((int) r4, (int) r5, (long) r6, (boolean) r8)     // Catch:{ all -> 0x0038 }
            r11 = -1
            if (r10 != r11) goto L_0x0030
            monitor-exit(r9)
            return r1
        L_0x0030:
            long r10 = r9.m21176d(r10)     // Catch:{ all -> 0x0038 }
            monitor-exit(r9)
            return r10
        L_0x0036:
            monitor-exit(r9)
            return r1
        L_0x0038:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7529w.m21171b(long, boolean, boolean):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m21172b(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f17381q     // Catch:{ all -> 0x0027 }
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            long r3 = r5.f17386v     // Catch:{ all -> 0x0027 }
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            monitor-exit(r5)
            return r1
        L_0x0011:
            long r3 = r5.mo54613i()     // Catch:{ all -> 0x0027 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            monitor-exit(r5)
            return r2
        L_0x001b:
            int r6 = r5.m21173c((long) r6)     // Catch:{ all -> 0x0027 }
            int r7 = r5.f17382r     // Catch:{ all -> 0x0027 }
            int r7 = r7 + r6
            r5.m21170b((int) r7)     // Catch:{ all -> 0x0027 }
            monitor-exit(r5)
            return r1
        L_0x0027:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7529w.m21172b(long):boolean");
    }

    /* renamed from: c */
    private int m21173c(long j) {
        int i = this.f17381q;
        int f = m21178f(i - 1);
        while (i > this.f17384t && this.f17379o[f] >= j) {
            i--;
            f--;
            if (f == -1) {
                f = this.f17374j - 1;
            }
        }
        return i;
    }

    /* renamed from: c */
    private boolean m21174c(int i) {
        C7152f fVar = this.f17373i;
        return fVar == null || fVar.mo53764c() == 4 || ((this.f17378n[i] & 1073741824) == 0 && this.f17373i.mo53765d());
    }

    /* renamed from: c */
    private synchronized boolean m21175c(C7864v vVar) {
        this.f17390z = false;
        if (C7728ai.m22218a((Object) vVar, (Object) this.f17359C)) {
            return false;
        }
        if (!this.f17367c.mo54477c() && this.f17367c.mo54471a().f17394a.equals(vVar)) {
            vVar = this.f17367c.mo54471a().f17394a;
        }
        this.f17359C = vVar;
        this.f17361E = C7759u.m22378a(this.f17359C.f18921l, this.f17359C.f18918i);
        this.f17362F = false;
        return true;
    }

    /* renamed from: d */
    private long m21176d(int i) {
        this.f17386v = Math.max(this.f17386v, m21177e(i));
        this.f17381q -= i;
        this.f17382r += i;
        int i2 = this.f17383s + i;
        this.f17383s = i2;
        int i3 = this.f17374j;
        if (i2 >= i3) {
            this.f17383s = i2 - i3;
        }
        int i4 = this.f17384t - i;
        this.f17384t = i4;
        if (i4 < 0) {
            this.f17384t = 0;
        }
        this.f17367c.mo54475b(this.f17382r);
        if (this.f17381q != 0) {
            return this.f17376l[this.f17383s];
        }
        int i5 = this.f17383s;
        if (i5 == 0) {
            i5 = this.f17374j;
        }
        int i6 = i5 - 1;
        return this.f17376l[i6] + ((long) this.f17377m[i6]);
    }

    /* renamed from: e */
    private long m21177e(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int f = m21178f(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f17379o[f]);
            if ((this.f17378n[f] & 1) != 0) {
                break;
            }
            f--;
            if (f == -1) {
                f = this.f17374j - 1;
            }
        }
        return j;
    }

    /* renamed from: f */
    private int m21178f(int i) {
        int i2 = this.f17383s + i;
        int i3 = this.f17374j;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: l */
    private synchronized void m21179l() {
        this.f17384t = 0;
        this.f17365a.mo54589b();
    }

    /* renamed from: m */
    private synchronized long m21180m() {
        if (this.f17381q == 0) {
            return -1;
        }
        return m21176d(this.f17381q);
    }

    /* renamed from: n */
    private void m21181n() {
        C7152f fVar = this.f17373i;
        if (fVar != null) {
            fVar.mo53763b(this.f17369e);
            this.f17373i = null;
            this.f17372h = null;
        }
    }

    /* renamed from: o */
    private boolean m21182o() {
        return this.f17384t != this.f17381q;
    }

    /* renamed from: a */
    public /* synthetic */ int mo53948a(C7668g gVar, int i, boolean z) throws IOException {
        return C7357x.CC.$default$a(this, gVar, i, z);
    }

    /* renamed from: a */
    public final int mo53949a(C7668g gVar, int i, boolean z, int i2) throws IOException {
        return this.f17365a.mo54584a(gVar, i, z);
    }

    /* renamed from: a */
    public int mo54595a(C7867w wVar, C6922g gVar, int i, boolean z) {
        boolean z2 = false;
        int a = m21165a(wVar, gVar, (i & 2) != 0, z, this.f17366b);
        if (a == -4 && !gVar.mo53126c()) {
            if ((i & 1) != 0) {
                z2 = true;
            }
            if ((i & 4) == 0) {
                C7527v vVar = this.f17365a;
                C7531a aVar = this.f17366b;
                if (z2) {
                    vVar.mo54590b(gVar, aVar);
                } else {
                    vVar.mo54587a(gVar, aVar);
                }
            }
            if (!z2) {
                this.f17384t++;
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo54596a() {
        mo54601a(true);
        m21181n();
    }

    /* renamed from: a */
    public final synchronized void mo54597a(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f17384t + i <= this.f17381q) {
                    z = true;
                    C7717a.m22118a(z);
                    this.f17384t += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        C7717a.m22118a(z);
        this.f17384t += i;
    }

    /* renamed from: a */
    public final void mo54598a(long j) {
        this.f17385u = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53950a(long r12, int r14, int r15, int r16, com.applovin.exoplayer2.p186e.C7357x.C7358a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f17357A
            if (r0 == 0) goto L_0x0010
            com.applovin.exoplayer2.v r0 = r8.f17358B
            java.lang.Object r0 = com.applovin.exoplayer2.p221l.C7717a.m22115a(r0)
            com.applovin.exoplayer2.v r0 = (com.applovin.exoplayer2.C7864v) r0
            r11.mo53953a((com.applovin.exoplayer2.C7864v) r0)
        L_0x0010:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            boolean r4 = r8.f17389y
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.f17389y = r1
        L_0x0022:
            long r4 = r8.f17363G
            long r4 = r4 + r12
            boolean r6 = r8.f17361E
            if (r6 == 0) goto L_0x0054
            long r6 = r8.f17385u
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x0054
            boolean r0 = r8.f17362F
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            com.applovin.exoplayer2.v r6 = r8.f17359C
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r6, r0)
            r8.f17362F = r2
        L_0x0050:
            r0 = r14 | 1
            r6 = r0
            goto L_0x0055
        L_0x0054:
            r6 = r14
        L_0x0055:
            boolean r0 = r8.f17364H
            if (r0 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0065
            boolean r0 = r11.m21172b((long) r4)
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.f17364H = r1
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            com.applovin.exoplayer2.h.v r0 = r8.f17365a
            long r0 = r0.mo54591c()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.m21167a((long) r1, (int) r3, (long) r4, (int) r6, (com.applovin.exoplayer2.p186e.C7357x.C7358a) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7529w.mo53950a(long, int, int, int, com.applovin.exoplayer2.e.x$a):void");
    }

    /* renamed from: a */
    public final void mo54599a(long j, boolean z, boolean z2) {
        this.f17365a.mo54586a(m21171b(j, z, z2));
    }

    /* renamed from: a */
    public final void mo54600a(C7533c cVar) {
        this.f17371g = cVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo53951a(C7772y yVar, int i) {
        C7357x.CC.$default$a(this, yVar, i);
    }

    /* renamed from: a */
    public final void mo53952a(C7772y yVar, int i, int i2) {
        this.f17365a.mo54588a(yVar, i);
    }

    /* renamed from: a */
    public final void mo53953a(C7864v vVar) {
        C7864v b = mo54604b(vVar);
        this.f17357A = false;
        this.f17358B = vVar;
        boolean c = m21175c(b);
        C7533c cVar = this.f17371g;
        if (cVar != null && c) {
            cVar.mo54571a(b);
        }
    }

    /* renamed from: a */
    public void mo54601a(boolean z) {
        this.f17365a.mo54585a();
        this.f17381q = 0;
        this.f17382r = 0;
        this.f17383s = 0;
        this.f17384t = 0;
        this.f17389y = true;
        this.f17385u = Long.MIN_VALUE;
        this.f17386v = Long.MIN_VALUE;
        this.f17387w = Long.MIN_VALUE;
        this.f17388x = false;
        this.f17367c.mo54474b();
        if (z) {
            this.f17358B = null;
            this.f17359C = null;
            this.f17390z = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo54602a(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m21179l()     // Catch:{ all -> 0x0040 }
            int r0 = r8.f17384t     // Catch:{ all -> 0x0040 }
            int r2 = r8.m21178f(r0)     // Catch:{ all -> 0x0040 }
            boolean r0 = r8.m21182o()     // Catch:{ all -> 0x0040 }
            r7 = 0
            if (r0 == 0) goto L_0x003e
            long[] r0 = r8.f17379o     // Catch:{ all -> 0x0040 }
            r3 = r0[r2]     // Catch:{ all -> 0x0040 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            long r0 = r8.f17387w     // Catch:{ all -> 0x0040 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x003e
        L_0x0022:
            int r11 = r8.f17381q     // Catch:{ all -> 0x0040 }
            int r0 = r8.f17384t     // Catch:{ all -> 0x0040 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.m21164a((int) r2, (int) r3, (long) r4, (boolean) r6)     // Catch:{ all -> 0x0040 }
            r0 = -1
            if (r11 != r0) goto L_0x0034
            monitor-exit(r8)
            return r7
        L_0x0034:
            r8.f17385u = r9     // Catch:{ all -> 0x0040 }
            int r9 = r8.f17384t     // Catch:{ all -> 0x0040 }
            int r9 = r9 + r11
            r8.f17384t = r9     // Catch:{ all -> 0x0040 }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003e:
            monitor-exit(r8)
            return r7
        L_0x0040:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7529w.mo54602a(long, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r9 != -1) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        return 0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo54603b(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f17384t     // Catch:{ all -> 0x003b }
            int r2 = r8.m21178f(r0)     // Catch:{ all -> 0x003b }
            boolean r0 = r8.m21182o()     // Catch:{ all -> 0x003b }
            r7 = 0
            if (r0 == 0) goto L_0x0039
            long[] r0 = r8.f17379o     // Catch:{ all -> 0x003b }
            r3 = r0[r2]     // Catch:{ all -> 0x003b }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x0039
        L_0x0017:
            long r0 = r8.f17387w     // Catch:{ all -> 0x003b }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            if (r11 == 0) goto L_0x0026
            int r9 = r8.f17381q     // Catch:{ all -> 0x003b }
            int r10 = r8.f17384t     // Catch:{ all -> 0x003b }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            int r11 = r8.f17381q     // Catch:{ all -> 0x003b }
            int r0 = r8.f17384t     // Catch:{ all -> 0x003b }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m21164a((int) r2, (int) r3, (long) r4, (boolean) r6)     // Catch:{ all -> 0x003b }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0038
            return r7
        L_0x0038:
            return r9
        L_0x0039:
            monitor-exit(r8)
            return r7
        L_0x003b:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7529w.mo54603b(long, boolean):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C7864v mo54604b(C7864v vVar) {
        return (this.f17363G == 0 || vVar.f18925p == Long.MAX_VALUE) ? vVar : vVar.mo55408a().mo55417a(vVar.f18925p + this.f17363G).mo55424a();
    }

    /* renamed from: b */
    public final void mo54605b() {
        mo54601a(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo54606b(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.m21182o()     // Catch:{ all -> 0x003c }
            r1 = 1
            if (r0 != 0) goto L_0x001c
            if (r3 != 0) goto L_0x001a
            boolean r3 = r2.f17388x     // Catch:{ all -> 0x003c }
            if (r3 != 0) goto L_0x001a
            com.applovin.exoplayer2.v r3 = r2.f17359C     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x0019
            com.applovin.exoplayer2.v r3 = r2.f17359C     // Catch:{ all -> 0x003c }
            com.applovin.exoplayer2.v r0 = r2.f17372h     // Catch:{ all -> 0x003c }
            if (r3 == r0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            monitor-exit(r2)
            return r1
        L_0x001c:
            com.applovin.exoplayer2.h.ab<com.applovin.exoplayer2.h.w$b> r3 = r2.f17367c     // Catch:{ all -> 0x003c }
            int r0 = r2.mo54610f()     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.mo54472a((int) r0)     // Catch:{ all -> 0x003c }
            com.applovin.exoplayer2.h.w$b r3 = (com.applovin.exoplayer2.p206h.C7529w.C7532b) r3     // Catch:{ all -> 0x003c }
            com.applovin.exoplayer2.v r3 = r3.f17394a     // Catch:{ all -> 0x003c }
            com.applovin.exoplayer2.v r0 = r2.f17372h     // Catch:{ all -> 0x003c }
            if (r3 == r0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            int r3 = r2.f17384t     // Catch:{ all -> 0x003c }
            int r3 = r2.m21178f(r3)     // Catch:{ all -> 0x003c }
            boolean r3 = r2.m21174c((int) r3)     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
            return r3
        L_0x003c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7529w.mo54606b(boolean):boolean");
    }

    /* renamed from: c */
    public final int mo54607c() {
        return this.f17382r + this.f17381q;
    }

    /* renamed from: d */
    public void mo54608d() {
        mo54615k();
        m21181n();
    }

    /* renamed from: e */
    public void mo54609e() throws IOException {
        C7152f fVar = this.f17373i;
        if (fVar != null && fVar.mo53764c() == 1) {
            throw ((C7152f.C7153a) C7717a.m22120b(this.f17373i.mo53766e()));
        }
    }

    /* renamed from: f */
    public final int mo54610f() {
        return this.f17382r + this.f17384t;
    }

    /* renamed from: g */
    public final synchronized C7864v mo54611g() {
        return this.f17390z ? null : this.f17359C;
    }

    /* renamed from: h */
    public final synchronized long mo54612h() {
        return this.f17387w;
    }

    /* renamed from: i */
    public final synchronized long mo54613i() {
        return Math.max(this.f17386v, m21177e(this.f17384t));
    }

    /* renamed from: j */
    public final synchronized boolean mo54614j() {
        return this.f17388x;
    }

    /* renamed from: k */
    public final void mo54615k() {
        this.f17365a.mo54586a(m21180m());
    }
}
