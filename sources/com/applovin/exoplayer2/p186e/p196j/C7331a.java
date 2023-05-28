package com.applovin.exoplayer2.p186e.p196j;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.protobuf.openrtb.LossReason;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.e.j.a */
public final class C7331a implements C7262h {

    /* renamed from: a */
    public static final C7340l f16704a = $$Lambda$a$_I_SV3gPxMUyFCqEIVSAu8xQVcs.INSTANCE;

    /* renamed from: b */
    private C7329j f16705b;

    /* renamed from: c */
    private C7357x f16706c;

    /* renamed from: d */
    private C7333b f16707d;

    /* renamed from: e */
    private int f16708e = -1;

    /* renamed from: f */
    private long f16709f = -1;

    /* renamed from: com.applovin.exoplayer2.e.j.a$a */
    private static final class C7332a implements C7333b {

        /* renamed from: a */
        private static final int[] f16710a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: b */
        private static final int[] f16711b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, LossReason.f4818xd24c0733, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: c */
        private final C7329j f16712c;

        /* renamed from: d */
        private final C7357x f16713d;

        /* renamed from: e */
        private final C7335b f16714e;

        /* renamed from: f */
        private final int f16715f;

        /* renamed from: g */
        private final byte[] f16716g;

        /* renamed from: h */
        private final C7772y f16717h;

        /* renamed from: i */
        private final int f16718i;

        /* renamed from: j */
        private final C7864v f16719j;

        /* renamed from: k */
        private int f16720k;

        /* renamed from: l */
        private long f16721l;

        /* renamed from: m */
        private int f16722m;

        /* renamed from: n */
        private long f16723n;

        public C7332a(C7329j jVar, C7357x xVar, C7335b bVar) throws C6809ai {
            this.f16712c = jVar;
            this.f16713d = xVar;
            this.f16714e = bVar;
            this.f16718i = Math.max(1, bVar.f16734c / 10);
            C7772y yVar = new C7772y(bVar.f16738g);
            yVar.mo55086j();
            this.f16715f = yVar.mo55086j();
            int i = bVar.f16733b;
            int i2 = (((bVar.f16736e - (i * 4)) * 8) / (bVar.f16737f * i)) + 1;
            int i3 = this.f16715f;
            if (i3 == i2) {
                int a = C7728ai.m22179a(this.f16718i, i3);
                this.f16716g = new byte[(bVar.f16736e * a)];
                this.f16717h = new C7772y(a * m20197a(this.f16715f, i));
                int i4 = ((bVar.f16734c * bVar.f16736e) * 8) / this.f16715f;
                this.f16719j = new C7864v.C7866a().mo55435f("audio/raw").mo55430d(i4).mo55432e(i4).mo55434f(m20197a(this.f16718i, i)).mo55440k(bVar.f16733b).mo55441l(bVar.f16734c).mo55442m(2).mo55424a();
                return;
            }
            throw C6809ai.m17540b("Expected frames per block: " + i2 + "; got: " + this.f16715f, (Throwable) null);
        }

        /* renamed from: a */
        private static int m20197a(int i, int i2) {
            return i * 2 * i2;
        }

        /* renamed from: a */
        private void m20198a(int i) {
            long d = this.f16721l + C7728ai.m22252d(this.f16723n, 1000000, (long) this.f16714e.f16734c);
            int c = m20202c(i);
            this.f16713d.mo53950a(d, 1, c, this.f16722m - c, (C7357x.C7358a) null);
            this.f16723n += (long) i;
            this.f16722m -= c;
        }

        /* renamed from: a */
        private void m20199a(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3 = this.f16714e.f16736e;
            int i4 = this.f16714e.f16733b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int i8 = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int min = Math.min(bArr[i5 + 2] & 255, 88);
            int i9 = f16711b[min];
            int i10 = ((i * this.f16715f * i4) + i2) * 2;
            bArr2[i10] = (byte) (i8 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[i10 + 1] = (byte) (i8 >> 8);
            for (int i11 = 0; i11 < i7 * 2; i11++) {
                byte b = bArr[((i11 / 8) * i4 * 4) + i6 + ((i11 / 2) % 4)] & 255;
                int i12 = i11 % 2 == 0 ? b & Ascii.f15551SI : b >> 4;
                int i13 = ((((i12 & 7) * 2) + 1) * i9) >> 3;
                if ((i12 & 8) != 0) {
                    i13 = -i13;
                }
                i8 = C7728ai.m22180a(i8 + i13, -32768, 32767);
                i10 += i4 * 2;
                bArr2[i10] = (byte) (i8 & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[i10 + 1] = (byte) (i8 >> 8);
                min = C7728ai.m22180a(min + f16710a[i12], 0, f16711b.length - 1);
                i9 = f16711b[min];
            }
        }

        /* renamed from: a */
        private void m20200a(byte[] bArr, int i, C7772y yVar) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f16714e.f16733b; i3++) {
                    m20199a(bArr, i2, i3, yVar.mo55077d());
                }
            }
            int c = m20202c(this.f16715f * i);
            yVar.mo55076d(0);
            yVar.mo55075c(c);
        }

        /* renamed from: b */
        private int m20201b(int i) {
            return i / (this.f16714e.f16733b * 2);
        }

        /* renamed from: c */
        private int m20202c(int i) {
            return m20197a(i, this.f16714e.f16733b);
        }

        /* renamed from: a */
        public void mo54073a(int i, long j) {
            this.f16712c.mo53896a(new C7338d(this.f16714e, this.f16715f, (long) i, j));
            this.f16713d.mo53953a(this.f16719j);
        }

        /* renamed from: a */
        public void mo54074a(long j) {
            this.f16720k = 0;
            this.f16721l = j;
            this.f16722m = 0;
            this.f16723n = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[EDGE_INSN: B:22:0x003f->B:10:0x003f ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0021  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo54075a(com.applovin.exoplayer2.p186e.C7279i r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f16718i
                int r1 = r6.f16722m
                int r1 = r6.m20201b(r1)
                int r0 = r0 - r1
                int r1 = r6.f16715f
                int r0 = com.applovin.exoplayer2.p221l.C7728ai.m22179a((int) r0, (int) r1)
                com.applovin.exoplayer2.e.j.b r1 = r6.f16714e
                int r1 = r1.f16736e
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x001e
            L_0x001c:
                r2 = 1
                goto L_0x001f
            L_0x001e:
                r2 = 0
            L_0x001f:
                if (r2 != 0) goto L_0x003f
                int r3 = r6.f16720k
                if (r3 >= r0) goto L_0x003f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.f16716g
                int r5 = r6.f16720k
                int r3 = r7.mo53898a(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L_0x0039
                goto L_0x001c
            L_0x0039:
                int r4 = r6.f16720k
                int r4 = r4 + r3
                r6.f16720k = r4
                goto L_0x001f
            L_0x003f:
                int r7 = r6.f16720k
                com.applovin.exoplayer2.e.j.b r8 = r6.f16714e
                int r8 = r8.f16736e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0077
                byte[] r8 = r6.f16716g
                com.applovin.exoplayer2.l.y r9 = r6.f16717h
                r6.m20200a(r8, r7, r9)
                int r8 = r6.f16720k
                com.applovin.exoplayer2.e.j.b r9 = r6.f16714e
                int r9 = r9.f16736e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f16720k = r8
                com.applovin.exoplayer2.l.y r7 = r6.f16717h
                int r7 = r7.mo55072b()
                com.applovin.exoplayer2.e.x r8 = r6.f16713d
                com.applovin.exoplayer2.l.y r9 = r6.f16717h
                r8.mo53951a(r9, r7)
                int r8 = r6.f16722m
                int r8 = r8 + r7
                r6.f16722m = r8
                int r7 = r6.m20201b(r8)
                int r8 = r6.f16718i
                if (r7 < r8) goto L_0x0077
                r6.m20198a((int) r8)
            L_0x0077:
                if (r2 == 0) goto L_0x0084
                int r7 = r6.f16722m
                int r7 = r6.m20201b(r7)
                if (r7 <= 0) goto L_0x0084
                r6.m20198a((int) r7)
            L_0x0084:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p196j.C7331a.C7332a.mo54075a(com.applovin.exoplayer2.e.i, long):boolean");
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.j.a$b */
    private interface C7333b {
        /* renamed from: a */
        void mo54073a(int i, long j) throws C6809ai;

        /* renamed from: a */
        void mo54074a(long j);

        /* renamed from: a */
        boolean mo54075a(C7279i iVar, long j) throws IOException;
    }

    /* renamed from: com.applovin.exoplayer2.e.j.a$c */
    private static final class C7334c implements C7333b {

        /* renamed from: a */
        private final C7329j f16724a;

        /* renamed from: b */
        private final C7357x f16725b;

        /* renamed from: c */
        private final C7335b f16726c;

        /* renamed from: d */
        private final C7864v f16727d;

        /* renamed from: e */
        private final int f16728e;

        /* renamed from: f */
        private long f16729f;

        /* renamed from: g */
        private int f16730g;

        /* renamed from: h */
        private long f16731h;

        public C7334c(C7329j jVar, C7357x xVar, C7335b bVar, String str, int i) throws C6809ai {
            this.f16724a = jVar;
            this.f16725b = xVar;
            this.f16726c = bVar;
            int i2 = (bVar.f16733b * bVar.f16737f) / 8;
            if (bVar.f16736e == i2) {
                int i3 = bVar.f16734c * i2 * 8;
                this.f16728e = Math.max(i2, (bVar.f16734c * i2) / 10);
                this.f16727d = new C7864v.C7866a().mo55435f(str).mo55430d(i3).mo55432e(i3).mo55434f(this.f16728e).mo55440k(bVar.f16733b).mo55441l(bVar.f16734c).mo55442m(i).mo55424a();
                return;
            }
            throw C6809ai.m17540b("Expected block size: " + i2 + "; got: " + bVar.f16736e, (Throwable) null);
        }

        /* renamed from: a */
        public void mo54073a(int i, long j) {
            this.f16724a.mo53896a(new C7338d(this.f16726c, 1, (long) i, j));
            this.f16725b.mo53953a(this.f16727d);
        }

        /* renamed from: a */
        public void mo54074a(long j) {
            this.f16729f = j;
            this.f16730g = 0;
            this.f16731h = 0;
        }

        /* renamed from: a */
        public boolean mo54075a(C7279i iVar, long j) throws IOException {
            int i;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i <= 0 || (i2 = this.f16730g) >= (i3 = this.f16728e)) {
                    int i4 = this.f16726c.f16736e;
                    int i5 = this.f16730g / i4;
                } else {
                    int a = this.f16725b.mo53948a((C7668g) iVar, (int) Math.min((long) (i3 - i2), j2), true);
                    if (a == -1) {
                        j2 = 0;
                    } else {
                        this.f16730g += a;
                        j2 -= (long) a;
                    }
                }
            }
            int i42 = this.f16726c.f16736e;
            int i52 = this.f16730g / i42;
            if (i52 > 0) {
                int i6 = i52 * i42;
                int i7 = this.f16730g - i6;
                this.f16725b.mo53950a(this.f16729f + C7728ai.m22252d(this.f16731h, 1000000, (long) this.f16726c.f16734c), 1, i6, i7, (C7357x.C7358a) null);
                this.f16731h += (long) i52;
                this.f16730g = i7;
            }
            return i <= 0;
        }
    }

    /* renamed from: a */
    private void m20190a() {
        C7717a.m22115a(this.f16706c);
        C7728ai.m22198a(this.f16705b);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ C7262h[] m20191b() {
        return new C7262h[]{new C7331a()};
    }

    /* JADX WARNING: type inference failed for: r8v21, types: [com.applovin.exoplayer2.e.j.a$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo53876a(com.applovin.exoplayer2.p186e.C7279i r7, com.applovin.exoplayer2.p186e.C7352u r8) throws java.io.IOException {
        /*
            r6 = this;
            r6.m20190a()
            com.applovin.exoplayer2.e.j.a$b r8 = r6.f16707d
            if (r8 != 0) goto L_0x007c
            com.applovin.exoplayer2.e.j.b r3 = com.applovin.exoplayer2.p186e.p196j.C7336c.m20212a(r7)
            if (r3 == 0) goto L_0x0074
            int r8 = r3.f16732a
            r0 = 17
            if (r8 != r0) goto L_0x001f
            com.applovin.exoplayer2.e.j.a$a r8 = new com.applovin.exoplayer2.e.j.a$a
            com.applovin.exoplayer2.e.j r0 = r6.f16705b
            com.applovin.exoplayer2.e.x r1 = r6.f16706c
            r8.<init>(r0, r1, r3)
        L_0x001c:
            r6.f16707d = r8
            goto L_0x007c
        L_0x001f:
            int r8 = r3.f16732a
            r0 = 6
            if (r8 != r0) goto L_0x0032
            com.applovin.exoplayer2.e.j.a$c r8 = new com.applovin.exoplayer2.e.j.a$c
            com.applovin.exoplayer2.e.j r1 = r6.f16705b
            com.applovin.exoplayer2.e.x r2 = r6.f16706c
            r5 = -1
            java.lang.String r4 = "audio/g711-alaw"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x001c
        L_0x0032:
            int r8 = r3.f16732a
            r0 = 7
            if (r8 != r0) goto L_0x0045
            com.applovin.exoplayer2.e.j.a$c r8 = new com.applovin.exoplayer2.e.j.a$c
            com.applovin.exoplayer2.e.j r1 = r6.f16705b
            com.applovin.exoplayer2.e.x r2 = r6.f16706c
            r5 = -1
            java.lang.String r4 = "audio/g711-mlaw"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x001c
        L_0x0045:
            int r8 = r3.f16732a
            int r0 = r3.f16737f
            int r5 = com.applovin.exoplayer2.p181b.C6903y.m18333a(r8, r0)
            if (r5 == 0) goto L_0x005c
            com.applovin.exoplayer2.e.j.a$c r8 = new com.applovin.exoplayer2.e.j.a$c
            com.applovin.exoplayer2.e.j r1 = r6.f16705b
            com.applovin.exoplayer2.e.x r2 = r6.f16706c
            java.lang.String r4 = "audio/raw"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x001c
        L_0x005c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unsupported WAV format type: "
            r7.append(r8)
            int r8 = r3.f16732a
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.applovin.exoplayer2.ai r7 = com.applovin.exoplayer2.C6809ai.m17538a(r7)
            throw r7
        L_0x0074:
            r7 = 0
            java.lang.String r8 = "Unsupported or unrecognized wav header."
            com.applovin.exoplayer2.ai r7 = com.applovin.exoplayer2.C6809ai.m17540b(r8, r7)
            throw r7
        L_0x007c:
            int r8 = r6.f16708e
            r0 = -1
            if (r8 != r0) goto L_0x00a1
            android.util.Pair r8 = com.applovin.exoplayer2.p186e.p196j.C7336c.m20213b(r7)
            java.lang.Object r1 = r8.first
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            r6.f16708e = r1
            java.lang.Object r8 = r8.second
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            r6.f16709f = r1
            com.applovin.exoplayer2.e.j.a$b r8 = r6.f16707d
            int r3 = r6.f16708e
            r8.mo54073a((int) r3, (long) r1)
            goto L_0x00b0
        L_0x00a1:
            long r1 = r7.mo53892c()
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00b0
            int r8 = r6.f16708e
            r7.mo53902b(r8)
        L_0x00b0:
            long r1 = r6.f16709f
            r3 = -1
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00bb
            r1 = 1
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r1)
            long r1 = r6.f16709f
            long r3 = r7.mo53892c()
            long r1 = r1 - r3
            com.applovin.exoplayer2.e.j.a$b r3 = r6.f16707d
            boolean r7 = r3.mo54075a((com.applovin.exoplayer2.p186e.C7279i) r7, (long) r1)
            if (r7 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p196j.C7331a.mo53876a(com.applovin.exoplayer2.e.i, com.applovin.exoplayer2.e.u):int");
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        C7333b bVar = this.f16707d;
        if (bVar != null) {
            bVar.mo54074a(j2);
        }
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f16705b = jVar;
        this.f16706c = jVar.mo53894a(0, 1);
        jVar.mo53895a();
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        return C7336c.m20212a(iVar) != null;
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
