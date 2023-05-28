package com.applovin.exoplayer2.p186e.p195i;

import android.util.SparseArray;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7733e;
import com.applovin.exoplayer2.p221l.C7762v;
import com.applovin.exoplayer2.p221l.C7772y;
import com.applovin.exoplayer2.p221l.C7773z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.i.m */
public final class C7308m implements C7302j {

    /* renamed from: a */
    private final C7328z f16530a;

    /* renamed from: b */
    private final boolean f16531b;

    /* renamed from: c */
    private final boolean f16532c;

    /* renamed from: d */
    private final C7317r f16533d = new C7317r(7, 128);

    /* renamed from: e */
    private final C7317r f16534e = new C7317r(8, 128);

    /* renamed from: f */
    private final C7317r f16535f = new C7317r(6, 128);

    /* renamed from: g */
    private long f16536g;

    /* renamed from: h */
    private final boolean[] f16537h = new boolean[3];

    /* renamed from: i */
    private String f16538i;

    /* renamed from: j */
    private C7357x f16539j;

    /* renamed from: k */
    private C7310a f16540k;

    /* renamed from: l */
    private boolean f16541l;

    /* renamed from: m */
    private long f16542m = -9223372036854775807L;

    /* renamed from: n */
    private boolean f16543n;

    /* renamed from: o */
    private final C7772y f16544o = new C7772y();

    /* renamed from: com.applovin.exoplayer2.e.i.m$a */
    private static final class C7310a {

        /* renamed from: a */
        private final C7357x f16545a;

        /* renamed from: b */
        private final boolean f16546b;

        /* renamed from: c */
        private final boolean f16547c;

        /* renamed from: d */
        private final SparseArray<C7762v.C7764b> f16548d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<C7762v.C7763a> f16549e = new SparseArray<>();

        /* renamed from: f */
        private final C7773z f16550f;

        /* renamed from: g */
        private byte[] f16551g;

        /* renamed from: h */
        private int f16552h;

        /* renamed from: i */
        private int f16553i;

        /* renamed from: j */
        private long f16554j;

        /* renamed from: k */
        private boolean f16555k;

        /* renamed from: l */
        private long f16556l;

        /* renamed from: m */
        private C7311a f16557m = new C7311a();

        /* renamed from: n */
        private C7311a f16558n = new C7311a();

        /* renamed from: o */
        private boolean f16559o;

        /* renamed from: p */
        private long f16560p;

        /* renamed from: q */
        private long f16561q;

        /* renamed from: r */
        private boolean f16562r;

        /* renamed from: com.applovin.exoplayer2.e.i.m$a$a */
        private static final class C7311a {

            /* renamed from: a */
            private boolean f16563a;

            /* renamed from: b */
            private boolean f16564b;

            /* renamed from: c */
            private C7762v.C7764b f16565c;

            /* renamed from: d */
            private int f16566d;

            /* renamed from: e */
            private int f16567e;

            /* renamed from: f */
            private int f16568f;

            /* renamed from: g */
            private int f16569g;

            /* renamed from: h */
            private boolean f16570h;

            /* renamed from: i */
            private boolean f16571i;

            /* renamed from: j */
            private boolean f16572j;

            /* renamed from: k */
            private boolean f16573k;

            /* renamed from: l */
            private int f16574l;

            /* renamed from: m */
            private int f16575m;

            /* renamed from: n */
            private int f16576n;

            /* renamed from: o */
            private int f16577o;

            /* renamed from: p */
            private int f16578p;

            private C7311a() {
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
                r4 = r6.f16566d;
                r5 = r7.f16566d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x006e, code lost:
                r0 = r6.f16573k;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean m20080a(com.applovin.exoplayer2.p186e.p195i.C7308m.C7310a.C7311a r7) {
                /*
                    r6 = this;
                    boolean r0 = r6.f16563a
                    r1 = 0
                    if (r0 != 0) goto L_0x0006
                    return r1
                L_0x0006:
                    boolean r0 = r7.f16563a
                    r2 = 1
                    if (r0 != 0) goto L_0x000c
                    return r2
                L_0x000c:
                    com.applovin.exoplayer2.l.v$b r0 = r6.f16565c
                    java.lang.Object r0 = com.applovin.exoplayer2.p221l.C7717a.m22115a(r0)
                    com.applovin.exoplayer2.l.v$b r0 = (com.applovin.exoplayer2.p221l.C7762v.C7764b) r0
                    com.applovin.exoplayer2.l.v$b r3 = r7.f16565c
                    java.lang.Object r3 = com.applovin.exoplayer2.p221l.C7717a.m22115a(r3)
                    com.applovin.exoplayer2.l.v$b r3 = (com.applovin.exoplayer2.p221l.C7762v.C7764b) r3
                    int r4 = r6.f16568f
                    int r5 = r7.f16568f
                    if (r4 != r5) goto L_0x007c
                    int r4 = r6.f16569g
                    int r5 = r7.f16569g
                    if (r4 != r5) goto L_0x007c
                    boolean r4 = r6.f16570h
                    boolean r5 = r7.f16570h
                    if (r4 != r5) goto L_0x007c
                    boolean r4 = r6.f16571i
                    if (r4 == 0) goto L_0x003c
                    boolean r4 = r7.f16571i
                    if (r4 == 0) goto L_0x003c
                    boolean r4 = r6.f16572j
                    boolean r5 = r7.f16572j
                    if (r4 != r5) goto L_0x007c
                L_0x003c:
                    int r4 = r6.f16566d
                    int r5 = r7.f16566d
                    if (r4 == r5) goto L_0x0046
                    if (r4 == 0) goto L_0x007c
                    if (r5 == 0) goto L_0x007c
                L_0x0046:
                    int r4 = r0.f18329k
                    if (r4 != 0) goto L_0x005a
                    int r4 = r3.f18329k
                    if (r4 != 0) goto L_0x005a
                    int r4 = r6.f16575m
                    int r5 = r7.f16575m
                    if (r4 != r5) goto L_0x007c
                    int r4 = r6.f16576n
                    int r5 = r7.f16576n
                    if (r4 != r5) goto L_0x007c
                L_0x005a:
                    int r0 = r0.f18329k
                    if (r0 != r2) goto L_0x006e
                    int r0 = r3.f18329k
                    if (r0 != r2) goto L_0x006e
                    int r0 = r6.f16577o
                    int r3 = r7.f16577o
                    if (r0 != r3) goto L_0x007c
                    int r0 = r6.f16578p
                    int r3 = r7.f16578p
                    if (r0 != r3) goto L_0x007c
                L_0x006e:
                    boolean r0 = r6.f16573k
                    boolean r3 = r7.f16573k
                    if (r0 != r3) goto L_0x007c
                    if (r0 == 0) goto L_0x007d
                    int r0 = r6.f16574l
                    int r7 = r7.f16574l
                    if (r0 == r7) goto L_0x007d
                L_0x007c:
                    r1 = 1
                L_0x007d:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7308m.C7310a.C7311a.m20080a(com.applovin.exoplayer2.e.i.m$a$a):boolean");
            }

            /* renamed from: a */
            public void mo54052a() {
                this.f16564b = false;
                this.f16563a = false;
            }

            /* renamed from: a */
            public void mo54053a(int i) {
                this.f16567e = i;
                this.f16564b = true;
            }

            /* renamed from: a */
            public void mo54054a(C7762v.C7764b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f16565c = bVar;
                this.f16566d = i;
                this.f16567e = i2;
                this.f16568f = i3;
                this.f16569g = i4;
                this.f16570h = z;
                this.f16571i = z2;
                this.f16572j = z3;
                this.f16573k = z4;
                this.f16574l = i5;
                this.f16575m = i6;
                this.f16576n = i7;
                this.f16577o = i8;
                this.f16578p = i9;
                this.f16563a = true;
                this.f16564b = true;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.f16567e;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean mo54055b() {
                /*
                    r2 = this;
                    boolean r0 = r2.f16564b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.f16567e
                    r1 = 7
                    if (r0 == r1) goto L_0x000c
                    r1 = 2
                    if (r0 != r1) goto L_0x000e
                L_0x000c:
                    r0 = 1
                    goto L_0x000f
                L_0x000e:
                    r0 = 0
                L_0x000f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7308m.C7310a.C7311a.mo54055b():boolean");
            }
        }

        public C7310a(C7357x xVar, boolean z, boolean z2) {
            this.f16545a = xVar;
            this.f16546b = z;
            this.f16547c = z2;
            byte[] bArr = new byte[128];
            this.f16551g = bArr;
            this.f16550f = new C7773z(bArr, 0, 0);
            mo54051b();
        }

        /* renamed from: a */
        private void m20072a(int i) {
            long j = this.f16561q;
            if (j != -9223372036854775807L) {
                boolean z = this.f16562r;
                this.f16545a.mo53950a(j, z ? 1 : 0, (int) (this.f16554j - this.f16560p), i, (C7357x.C7358a) null);
            }
        }

        /* renamed from: a */
        public void mo54045a(long j, int i, long j2) {
            this.f16553i = i;
            this.f16556l = j2;
            this.f16554j = j;
            if (!this.f16546b || i != 1) {
                if (this.f16547c) {
                    int i2 = this.f16553i;
                    if (!(i2 == 5 || i2 == 1 || i2 == 2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C7311a aVar = this.f16557m;
            this.f16557m = this.f16558n;
            this.f16558n = aVar;
            aVar.mo54052a();
            this.f16552h = 0;
            this.f16555k = true;
        }

        /* renamed from: a */
        public void mo54046a(C7762v.C7763a aVar) {
            this.f16549e.append(aVar.f18316a, aVar);
        }

        /* renamed from: a */
        public void mo54047a(C7762v.C7764b bVar) {
            this.f16548d.append(bVar.f18322d, bVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo54048a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f16555k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f16551g
                int r4 = r3.length
                int r5 = r0.f16552h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001e
                int r5 = r5 + r2
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f16551g = r3
            L_0x001e:
                byte[] r3 = r0.f16551g
                int r4 = r0.f16552h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f16552h
                int r1 = r1 + r2
                r0.f16552h = r1
                com.applovin.exoplayer2.l.z r2 = r0.f16550f
                byte[] r3 = r0.f16551g
                r4 = 0
                r2.mo55105a(r3, r4, r1)
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                r2 = 8
                boolean r1 = r1.mo55107b(r2)
                if (r1 != 0) goto L_0x003f
                return
            L_0x003f:
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                r1.mo55103a()
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                int r10 = r1.mo55108c(r7)
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                r2 = 5
                r1.mo55104a(r2)
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                boolean r1 = r1.mo55109c()
                if (r1 != 0) goto L_0x0059
                return
            L_0x0059:
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                r1.mo55110d()
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                boolean r1 = r1.mo55109c()
                if (r1 != 0) goto L_0x0067
                return
            L_0x0067:
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                int r11 = r1.mo55110d()
                boolean r1 = r0.f16547c
                if (r1 != 0) goto L_0x0079
                r0.f16555k = r4
                com.applovin.exoplayer2.e.i.m$a$a r1 = r0.f16558n
                r1.mo54053a((int) r11)
                return
            L_0x0079:
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                boolean r1 = r1.mo55109c()
                if (r1 != 0) goto L_0x0082
                return
            L_0x0082:
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                int r13 = r1.mo55110d()
                android.util.SparseArray<com.applovin.exoplayer2.l.v$a> r1 = r0.f16549e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0093
                r0.f16555k = r4
                return
            L_0x0093:
                android.util.SparseArray<com.applovin.exoplayer2.l.v$a> r1 = r0.f16549e
                java.lang.Object r1 = r1.get(r13)
                com.applovin.exoplayer2.l.v$a r1 = (com.applovin.exoplayer2.p221l.C7762v.C7763a) r1
                android.util.SparseArray<com.applovin.exoplayer2.l.v$b> r3 = r0.f16548d
                int r5 = r1.f18317b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                com.applovin.exoplayer2.l.v$b r9 = (com.applovin.exoplayer2.p221l.C7762v.C7764b) r9
                boolean r3 = r9.f18326h
                if (r3 == 0) goto L_0x00b8
                com.applovin.exoplayer2.l.z r3 = r0.f16550f
                boolean r3 = r3.mo55107b(r7)
                if (r3 != 0) goto L_0x00b3
                return
            L_0x00b3:
                com.applovin.exoplayer2.l.z r3 = r0.f16550f
                r3.mo55104a(r7)
            L_0x00b8:
                com.applovin.exoplayer2.l.z r3 = r0.f16550f
                int r5 = r9.f18328j
                boolean r3 = r3.mo55107b(r5)
                if (r3 != 0) goto L_0x00c3
                return
            L_0x00c3:
                com.applovin.exoplayer2.l.z r3 = r0.f16550f
                int r5 = r9.f18328j
                int r12 = r3.mo55108c(r5)
                boolean r3 = r9.f18327i
                r5 = 1
                if (r3 != 0) goto L_0x00f7
                com.applovin.exoplayer2.l.z r3 = r0.f16550f
                boolean r3 = r3.mo55107b(r5)
                if (r3 != 0) goto L_0x00d9
                return
            L_0x00d9:
                com.applovin.exoplayer2.l.z r3 = r0.f16550f
                boolean r3 = r3.mo55106b()
                if (r3 == 0) goto L_0x00f5
                com.applovin.exoplayer2.l.z r6 = r0.f16550f
                boolean r6 = r6.mo55107b(r5)
                if (r6 != 0) goto L_0x00ea
                return
            L_0x00ea:
                com.applovin.exoplayer2.l.z r6 = r0.f16550f
                boolean r6 = r6.mo55106b()
                r14 = r3
                r16 = r6
                r15 = 1
                goto L_0x00fb
            L_0x00f5:
                r14 = r3
                goto L_0x00f8
            L_0x00f7:
                r14 = 0
            L_0x00f8:
                r15 = 0
                r16 = 0
            L_0x00fb:
                int r3 = r0.f16553i
                if (r3 != r2) goto L_0x0102
                r17 = 1
                goto L_0x0104
            L_0x0102:
                r17 = 0
            L_0x0104:
                if (r17 == 0) goto L_0x0118
                com.applovin.exoplayer2.l.z r2 = r0.f16550f
                boolean r2 = r2.mo55109c()
                if (r2 != 0) goto L_0x010f
                return
            L_0x010f:
                com.applovin.exoplayer2.l.z r2 = r0.f16550f
                int r2 = r2.mo55110d()
                r18 = r2
                goto L_0x011a
            L_0x0118:
                r18 = 0
            L_0x011a:
                int r2 = r9.f18329k
                if (r2 != 0) goto L_0x014e
                com.applovin.exoplayer2.l.z r2 = r0.f16550f
                int r3 = r9.f18330l
                boolean r2 = r2.mo55107b(r3)
                if (r2 != 0) goto L_0x0129
                return
            L_0x0129:
                com.applovin.exoplayer2.l.z r2 = r0.f16550f
                int r3 = r9.f18330l
                int r2 = r2.mo55108c(r3)
                boolean r1 = r1.f18318c
                if (r1 == 0) goto L_0x014b
                if (r14 != 0) goto L_0x014b
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                boolean r1 = r1.mo55109c()
                if (r1 != 0) goto L_0x0140
                return
            L_0x0140:
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                int r1 = r1.mo55111e()
                r20 = r1
                r19 = r2
                goto L_0x018e
            L_0x014b:
                r19 = r2
                goto L_0x018c
            L_0x014e:
                int r2 = r9.f18329k
                if (r2 != r5) goto L_0x018a
                boolean r2 = r9.f18331m
                if (r2 != 0) goto L_0x018a
                com.applovin.exoplayer2.l.z r2 = r0.f16550f
                boolean r2 = r2.mo55109c()
                if (r2 != 0) goto L_0x015f
                return
            L_0x015f:
                com.applovin.exoplayer2.l.z r2 = r0.f16550f
                int r2 = r2.mo55111e()
                boolean r1 = r1.f18318c
                if (r1 == 0) goto L_0x0183
                if (r14 != 0) goto L_0x0183
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                boolean r1 = r1.mo55109c()
                if (r1 != 0) goto L_0x0174
                return
            L_0x0174:
                com.applovin.exoplayer2.l.z r1 = r0.f16550f
                int r1 = r1.mo55111e()
                r22 = r1
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0192
            L_0x0183:
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0190
            L_0x018a:
                r19 = 0
            L_0x018c:
                r20 = 0
            L_0x018e:
                r21 = 0
            L_0x0190:
                r22 = 0
            L_0x0192:
                com.applovin.exoplayer2.e.i.m$a$a r8 = r0.f16558n
                r8.mo54054a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f16555k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7308m.C7310a.mo54048a(byte[], int, int):void");
        }

        /* renamed from: a */
        public boolean mo54049a() {
            return this.f16547c;
        }

        /* renamed from: a */
        public boolean mo54050a(long j, int i, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f16553i == 9 || (this.f16547c && this.f16558n.m20080a(this.f16557m))) {
                if (z && this.f16559o) {
                    m20072a(i + ((int) (j - this.f16554j)));
                }
                this.f16560p = this.f16554j;
                this.f16561q = this.f16556l;
                this.f16562r = false;
                this.f16559o = true;
            }
            if (this.f16546b) {
                z2 = this.f16558n.mo54055b();
            }
            boolean z4 = this.f16562r;
            int i2 = this.f16553i;
            if (i2 == 5 || (z2 && i2 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.f16562r = z5;
            return z5;
        }

        /* renamed from: b */
        public void mo54051b() {
            this.f16555k = false;
            this.f16559o = false;
            this.f16558n.mo54052a();
        }
    }

    public C7308m(C7328z zVar, boolean z, boolean z2) {
        this.f16530a = zVar;
        this.f16531b = z;
        this.f16532c = z2;
    }

    /* renamed from: a */
    private void m20063a(long j, int i, int i2, long j2) {
        C7317r rVar;
        if (!this.f16541l || this.f16540k.mo54049a()) {
            this.f16533d.mo54064b(i2);
            this.f16534e.mo54064b(i2);
            if (!this.f16541l) {
                if (this.f16533d.mo54063b() && this.f16534e.mo54063b()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.f16533d.f16645a, this.f16533d.f16646b));
                    arrayList.add(Arrays.copyOf(this.f16534e.f16645a, this.f16534e.f16646b));
                    C7762v.C7764b a = C7762v.m22392a(this.f16533d.f16645a, 3, this.f16533d.f16646b);
                    C7762v.C7763a b = C7762v.m22398b(this.f16534e.f16645a, 3, this.f16534e.f16646b);
                    this.f16539j.mo53953a(new C7864v.C7866a().mo55421a(this.f16538i).mo55435f("video/avc").mo55431d(C7733e.m22282a(a.f18319a, a.f18320b, a.f18321c)).mo55436g(a.f18323e).mo55437h(a.f18324f).mo55425b(a.f18325g).mo55422a((List<byte[]>) arrayList).mo55424a());
                    this.f16541l = true;
                    this.f16540k.mo54047a(a);
                    this.f16540k.mo54046a(b);
                    this.f16533d.mo54060a();
                    rVar = this.f16534e;
                }
            } else if (this.f16533d.mo54063b()) {
                this.f16540k.mo54047a(C7762v.m22392a(this.f16533d.f16645a, 3, this.f16533d.f16646b));
                rVar = this.f16533d;
            } else if (this.f16534e.mo54063b()) {
                this.f16540k.mo54046a(C7762v.m22398b(this.f16534e.f16645a, 3, this.f16534e.f16646b));
                rVar = this.f16534e;
            }
            rVar.mo54060a();
        }
        if (this.f16535f.mo54064b(i2)) {
            this.f16544o.mo55070a(this.f16535f.f16645a, C7762v.m22390a(this.f16535f.f16645a, this.f16535f.f16646b));
            this.f16544o.mo55076d(4);
            this.f16530a.mo54071a(j2, this.f16544o);
        }
        if (this.f16540k.mo54050a(j, i, this.f16541l, this.f16543n)) {
            this.f16543n = false;
        }
    }

    /* renamed from: a */
    private void m20064a(long j, int i, long j2) {
        if (!this.f16541l || this.f16540k.mo54049a()) {
            this.f16533d.mo54061a(i);
            this.f16534e.mo54061a(i);
        }
        this.f16535f.mo54061a(i);
        this.f16540k.mo54045a(j, i, j2);
    }

    /* renamed from: a */
    private void m20065a(byte[] bArr, int i, int i2) {
        if (!this.f16541l || this.f16540k.mo54049a()) {
            this.f16533d.mo54062a(bArr, i, i2);
            this.f16534e.mo54062a(bArr, i, i2);
        }
        this.f16535f.mo54062a(bArr, i, i2);
        this.f16540k.mo54048a(bArr, i, i2);
    }

    /* renamed from: c */
    private void m20066c() {
        C7717a.m22115a(this.f16539j);
        C7728ai.m22198a(this.f16540k);
    }

    /* renamed from: a */
    public void mo54029a() {
        this.f16536g = 0;
        this.f16543n = false;
        this.f16542m = -9223372036854775807L;
        C7762v.m22395a(this.f16537h);
        this.f16533d.mo54060a();
        this.f16534e.mo54060a();
        this.f16535f.mo54060a();
        C7310a aVar = this.f16540k;
        if (aVar != null) {
            aVar.mo54051b();
        }
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f16542m = j;
        }
        this.f16543n |= (i & 2) != 0;
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        dVar.mo54024a();
        this.f16538i = dVar.mo54026c();
        C7357x a = jVar.mo53894a(dVar.mo54025b(), 2);
        this.f16539j = a;
        this.f16540k = new C7310a(a, this.f16531b, this.f16532c);
        this.f16530a.mo54072a(jVar, dVar);
    }

    /* renamed from: a */
    public void mo54032a(C7772y yVar) {
        m20066c();
        int c = yVar.mo55074c();
        int b = yVar.mo55072b();
        byte[] d = yVar.mo55077d();
        this.f16536g += (long) yVar.mo55064a();
        this.f16539j.mo53951a(yVar, yVar.mo55064a());
        while (true) {
            int a = C7762v.m22391a(d, c, b, this.f16537h);
            if (a == b) {
                m20065a(d, c, b);
                return;
            }
            int b2 = C7762v.m22397b(d, a);
            int i = a - c;
            if (i > 0) {
                m20065a(d, c, a);
            }
            int i2 = b - a;
            long j = this.f16536g - ((long) i2);
            m20063a(j, i2, i < 0 ? -i : 0, this.f16542m);
            m20064a(j, b2, this.f16542m);
            c = a + 3;
        }
    }

    /* renamed from: b */
    public void mo54033b() {
    }
}
