package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7762v;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.e.i.k */
public final class C7303k implements C7302j {

    /* renamed from: c */
    private static final double[] f16482c = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f16483a;

    /* renamed from: b */
    private C7357x f16484b;

    /* renamed from: d */
    private final C7293af f16485d;

    /* renamed from: e */
    private final C7772y f16486e;

    /* renamed from: f */
    private final C7317r f16487f;

    /* renamed from: g */
    private final boolean[] f16488g;

    /* renamed from: h */
    private final C7304a f16489h;

    /* renamed from: i */
    private long f16490i;

    /* renamed from: j */
    private boolean f16491j;

    /* renamed from: k */
    private boolean f16492k;

    /* renamed from: l */
    private long f16493l;

    /* renamed from: m */
    private long f16494m;

    /* renamed from: n */
    private long f16495n;

    /* renamed from: o */
    private long f16496o;

    /* renamed from: p */
    private boolean f16497p;

    /* renamed from: q */
    private boolean f16498q;

    /* renamed from: com.applovin.exoplayer2.e.i.k$a */
    private static final class C7304a {

        /* renamed from: d */
        private static final byte[] f16499d = {0, 0, 1};

        /* renamed from: a */
        public int f16500a;

        /* renamed from: b */
        public int f16501b;

        /* renamed from: c */
        public byte[] f16502c;

        /* renamed from: e */
        private boolean f16503e;

        public C7304a(int i) {
            this.f16502c = new byte[i];
        }

        /* renamed from: a */
        public void mo54035a() {
            this.f16503e = false;
            this.f16500a = 0;
            this.f16501b = 0;
        }

        /* renamed from: a */
        public void mo54036a(byte[] bArr, int i, int i2) {
            if (this.f16503e) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f16502c;
                int length = bArr2.length;
                int i4 = this.f16500a;
                if (length < i4 + i3) {
                    this.f16502c = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f16502c, this.f16500a, i3);
                this.f16500a += i3;
            }
        }

        /* renamed from: a */
        public boolean mo54037a(int i, int i2) {
            if (this.f16503e) {
                int i3 = this.f16500a - i2;
                this.f16500a = i3;
                if (this.f16501b == 0 && i == 181) {
                    this.f16501b = i3;
                } else {
                    this.f16503e = false;
                    return true;
                }
            } else if (i == 179) {
                this.f16503e = true;
            }
            byte[] bArr = f16499d;
            mo54036a(bArr, 0, bArr.length);
            return false;
        }
    }

    public C7303k() {
        this((C7293af) null);
    }

    C7303k(C7293af afVar) {
        C7772y yVar;
        this.f16485d = afVar;
        this.f16488g = new boolean[4];
        this.f16489h = new C7304a(128);
        if (afVar != null) {
            this.f16487f = new C7317r(178, 128);
            yVar = new C7772y();
        } else {
            yVar = null;
            this.f16487f = null;
        }
        this.f16486e = yVar;
        this.f16494m = -9223372036854775807L;
        this.f16496o = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<com.applovin.exoplayer2.C7864v, java.lang.Long> m20041a(com.applovin.exoplayer2.p186e.p195i.C7303k.C7304a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f16502c
            int r1 = r8.f16500a
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            byte r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            byte r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            byte r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            byte r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L_0x003d
            r7 = 3
            if (r6 == r7) goto L_0x0037
            if (r6 == r1) goto L_0x0031
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0031:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L_0x0042
        L_0x0037:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L_0x0042
        L_0x003d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L_0x0042:
            float r6 = (float) r6
            float r1 = r1 / r6
        L_0x0044:
            com.applovin.exoplayer2.v$a r6 = new com.applovin.exoplayer2.v$a
            r6.<init>()
            com.applovin.exoplayer2.v$a r9 = r6.mo55421a((java.lang.String) r9)
            java.lang.String r6 = "video/mpeg2"
            com.applovin.exoplayer2.v$a r9 = r9.mo55435f((java.lang.String) r6)
            com.applovin.exoplayer2.v$a r9 = r9.mo55436g((int) r2)
            com.applovin.exoplayer2.v$a r9 = r9.mo55437h((int) r4)
            com.applovin.exoplayer2.v$a r9 = r9.mo55425b((float) r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.applovin.exoplayer2.v$a r9 = r9.mo55422a((java.util.List<byte[]>) r1)
            com.applovin.exoplayer2.v r9 = r9.mo55424a()
            r1 = 0
            byte r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x009d
            double[] r5 = f16482c
            int r6 = r5.length
            if (r4 >= r6) goto L_0x009d
            r1 = r5[r4]
            int r8 = r8.f16501b
            int r8 = r8 + 9
            byte r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            byte r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L_0x0096
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L_0x0096:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L_0x009d:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7303k.m20041a(com.applovin.exoplayer2.e.i.k$a, java.lang.String):android.util.Pair");
    }

    /* renamed from: a */
    public void mo54029a() {
        C7762v.m22395a(this.f16488g);
        this.f16489h.mo54035a();
        C7317r rVar = this.f16487f;
        if (rVar != null) {
            rVar.mo54060a();
        }
        this.f16490i = 0;
        this.f16491j = false;
        this.f16494m = -9223372036854775807L;
        this.f16496o = -9223372036854775807L;
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        this.f16494m = j;
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        dVar.mo54024a();
        this.f16483a = dVar.mo54026c();
        this.f16484b = jVar.mo53894a(dVar.mo54025b(), 2);
        C7293af afVar = this.f16485d;
        if (afVar != null) {
            afVar.mo54028a(jVar, dVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0144  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo54032a(com.applovin.exoplayer2.p221l.C7772y r21) {
        /*
            r20 = this;
            r0 = r20
            com.applovin.exoplayer2.e.x r1 = r0.f16484b
            com.applovin.exoplayer2.p221l.C7717a.m22115a(r1)
            int r1 = r21.mo55074c()
            int r2 = r21.mo55072b()
            byte[] r3 = r21.mo55077d()
            long r4 = r0.f16490i
            int r6 = r21.mo55064a()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f16490i = r4
            com.applovin.exoplayer2.e.x r4 = r0.f16484b
            int r5 = r21.mo55064a()
            r6 = r21
            r4.mo53951a(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f16488g
            int r4 = com.applovin.exoplayer2.p221l.C7762v.m22391a(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f16492k
            if (r4 != 0) goto L_0x0039
            com.applovin.exoplayer2.e.i.k$a r4 = r0.f16489h
            r4.mo54036a(r3, r1, r2)
        L_0x0039:
            com.applovin.exoplayer2.e.i.r r4 = r0.f16487f
            if (r4 == 0) goto L_0x0040
            r4.mo54062a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            byte[] r5 = r21.mo55077d()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f16492k
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L_0x008a
            if (r8 <= 0) goto L_0x005a
            com.applovin.exoplayer2.e.i.k$a r9 = r0.f16489h
            r9.mo54036a(r3, r1, r4)
        L_0x005a:
            if (r8 >= 0) goto L_0x005e
            int r9 = -r8
            goto L_0x005f
        L_0x005e:
            r9 = 0
        L_0x005f:
            com.applovin.exoplayer2.e.i.k$a r12 = r0.f16489h
            boolean r9 = r12.mo54037a(r5, r9)
            if (r9 == 0) goto L_0x008a
            com.applovin.exoplayer2.e.i.k$a r9 = r0.f16489h
            java.lang.String r12 = r0.f16483a
            java.lang.Object r12 = com.applovin.exoplayer2.p221l.C7717a.m22120b(r12)
            java.lang.String r12 = (java.lang.String) r12
            android.util.Pair r9 = m20041a((com.applovin.exoplayer2.p186e.p195i.C7303k.C7304a) r9, (java.lang.String) r12)
            com.applovin.exoplayer2.e.x r12 = r0.f16484b
            java.lang.Object r13 = r9.first
            com.applovin.exoplayer2.v r13 = (com.applovin.exoplayer2.C7864v) r13
            r12.mo53953a(r13)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            r0.f16493l = r12
            r0.f16492k = r11
        L_0x008a:
            com.applovin.exoplayer2.e.i.r r9 = r0.f16487f
            if (r9 == 0) goto L_0x00db
            if (r8 <= 0) goto L_0x0095
            r9.mo54062a(r3, r1, r4)
            r1 = 0
            goto L_0x0096
        L_0x0095:
            int r1 = -r8
        L_0x0096:
            com.applovin.exoplayer2.e.i.r r8 = r0.f16487f
            boolean r1 = r8.mo54064b(r1)
            if (r1 == 0) goto L_0x00c8
            com.applovin.exoplayer2.e.i.r r1 = r0.f16487f
            byte[] r1 = r1.f16645a
            com.applovin.exoplayer2.e.i.r r8 = r0.f16487f
            int r8 = r8.f16646b
            int r1 = com.applovin.exoplayer2.p221l.C7762v.m22390a((byte[]) r1, (int) r8)
            com.applovin.exoplayer2.l.y r8 = r0.f16486e
            java.lang.Object r8 = com.applovin.exoplayer2.p221l.C7728ai.m22198a(r8)
            com.applovin.exoplayer2.l.y r8 = (com.applovin.exoplayer2.p221l.C7772y) r8
            com.applovin.exoplayer2.e.i.r r9 = r0.f16487f
            byte[] r9 = r9.f16645a
            r8.mo55070a((byte[]) r9, (int) r1)
            com.applovin.exoplayer2.e.i.af r1 = r0.f16485d
            java.lang.Object r1 = com.applovin.exoplayer2.p221l.C7728ai.m22198a(r1)
            com.applovin.exoplayer2.e.i.af r1 = (com.applovin.exoplayer2.p186e.p195i.C7293af) r1
            long r8 = r0.f16496o
            com.applovin.exoplayer2.l.y r12 = r0.f16486e
            r1.mo54027a((long) r8, (com.applovin.exoplayer2.p221l.C7772y) r12)
        L_0x00c8:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x00db
            byte[] r1 = r21.mo55077d()
            int r8 = r4 + 2
            byte r1 = r1[r8]
            if (r1 != r11) goto L_0x00db
            com.applovin.exoplayer2.e.i.r r1 = r0.f16487f
            r1.mo54061a(r5)
        L_0x00db:
            if (r5 == 0) goto L_0x00e9
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L_0x00e2
            goto L_0x00e9
        L_0x00e2:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L_0x0147
            r0.f16497p = r11
            goto L_0x0147
        L_0x00e9:
            int r1 = r2 - r4
            boolean r4 = r0.f16498q
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0114
            boolean r4 = r0.f16492k
            if (r4 == 0) goto L_0x0114
            long r13 = r0.f16496o
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0114
            boolean r15 = r0.f16497p
            long r11 = r0.f16490i
            r19 = r5
            long r4 = r0.f16495n
            long r11 = r11 - r4
            int r4 = (int) r11
            int r16 = r4 - r1
            com.applovin.exoplayer2.e.x r12 = r0.f16484b
            r18 = 0
            r17 = r1
            r12.mo53950a(r13, r15, r16, r17, r18)
            goto L_0x0116
        L_0x0114:
            r19 = r5
        L_0x0116:
            boolean r4 = r0.f16491j
            if (r4 == 0) goto L_0x0121
            boolean r4 = r0.f16498q
            if (r4 == 0) goto L_0x011f
            goto L_0x0121
        L_0x011f:
            r1 = 1
            goto L_0x0142
        L_0x0121:
            long r4 = r0.f16490i
            long r11 = (long) r1
            long r4 = r4 - r11
            r0.f16495n = r4
            long r4 = r0.f16494m
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012e
            goto L_0x0139
        L_0x012e:
            long r4 = r0.f16496o
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0138
            long r11 = r0.f16493l
            long r4 = r4 + r11
            goto L_0x0139
        L_0x0138:
            r4 = r8
        L_0x0139:
            r0.f16496o = r4
            r0.f16497p = r10
            r0.f16494m = r8
            r1 = 1
            r0.f16491j = r1
        L_0x0142:
            if (r19 != 0) goto L_0x0145
            r10 = 1
        L_0x0145:
            r0.f16498q = r10
        L_0x0147:
            r1 = r7
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7303k.mo54032a(com.applovin.exoplayer2.l.y):void");
    }

    /* renamed from: b */
    public void mo54033b() {
    }
}
