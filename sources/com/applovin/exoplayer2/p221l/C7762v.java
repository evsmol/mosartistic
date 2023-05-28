package com.applovin.exoplayer2.p221l;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.l.v */
public final class C7762v {

    /* renamed from: a */
    public static final byte[] f18312a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f18313b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f18314c = new Object();

    /* renamed from: d */
    private static int[] f18315d = new int[10];

    /* renamed from: com.applovin.exoplayer2.l.v$a */
    public static final class C7763a {

        /* renamed from: a */
        public final int f18316a;

        /* renamed from: b */
        public final int f18317b;

        /* renamed from: c */
        public final boolean f18318c;

        public C7763a(int i, int i2, boolean z) {
            this.f18316a = i;
            this.f18317b = i2;
            this.f18318c = z;
        }
    }

    /* renamed from: com.applovin.exoplayer2.l.v$b */
    public static final class C7764b {

        /* renamed from: a */
        public final int f18319a;

        /* renamed from: b */
        public final int f18320b;

        /* renamed from: c */
        public final int f18321c;

        /* renamed from: d */
        public final int f18322d;

        /* renamed from: e */
        public final int f18323e;

        /* renamed from: f */
        public final int f18324f;

        /* renamed from: g */
        public final float f18325g;

        /* renamed from: h */
        public final boolean f18326h;

        /* renamed from: i */
        public final boolean f18327i;

        /* renamed from: j */
        public final int f18328j;

        /* renamed from: k */
        public final int f18329k;

        /* renamed from: l */
        public final int f18330l;

        /* renamed from: m */
        public final boolean f18331m;

        public C7764b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f18319a = i;
            this.f18320b = i2;
            this.f18321c = i3;
            this.f18322d = i4;
            this.f18323e = i5;
            this.f18324f = i6;
            this.f18325g = f;
            this.f18326h = z;
            this.f18327i = z2;
            this.f18328j = i7;
            this.f18329k = i8;
            this.f18330l = i9;
            this.f18331m = z3;
        }
    }

    /* renamed from: a */
    public static int m22390a(byte[] bArr, int i) {
        int i2;
        synchronized (f18314c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m22400c(bArr, i3, i);
                    if (i3 < i) {
                        if (f18315d.length <= i4) {
                            f18315d = Arrays.copyOf(f18315d, f18315d.length * 2);
                        }
                        f18315d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } finally {
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f18315d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* renamed from: a */
    public static int m22391a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        boolean z = false;
        C7717a.m22121b(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m22395a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m22395a(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                if ((bArr[i5] & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && bArr[i5] == 1) {
                        m22395a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 + -2] == 0 && bArr[i4] == 1)) : bArr[i2 + -3] == 0 && bArr[i2 + -2] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z = true;
            }
            zArr[2] = z;
            return i2;
        } else {
            m22395a(zArr);
            return i - 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0149  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.exoplayer2.p221l.C7762v.C7764b m22392a(byte[] r21, int r22, int r23) {
        /*
            com.applovin.exoplayer2.l.z r0 = new com.applovin.exoplayer2.l.z
            r1 = r21
            r2 = r22
            r3 = r23
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo55104a(r1)
            int r3 = r0.mo55108c(r1)
            int r4 = r0.mo55108c(r1)
            int r5 = r0.mo55108c(r1)
            int r6 = r0.mo55110d()
            r2 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004e
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 44
            if (r3 == r10) goto L_0x004e
            r10 = 83
            if (r3 == r10) goto L_0x004e
            r10 = 86
            if (r3 == r10) goto L_0x004e
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r10 = 1
            r11 = 0
            goto L_0x0087
        L_0x004e:
            int r10 = r0.mo55110d()
            if (r10 != r2) goto L_0x0059
            boolean r11 = r0.mo55106b()
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r0.mo55110d()
            r0.mo55110d()
            r0.mo55103a()
            boolean r12 = r0.mo55106b()
            if (r12 == 0) goto L_0x0087
            if (r10 == r2) goto L_0x006e
            r12 = 8
            goto L_0x0070
        L_0x006e:
            r12 = 12
        L_0x0070:
            r13 = 0
        L_0x0071:
            if (r13 >= r12) goto L_0x0087
            boolean r14 = r0.mo55106b()
            if (r14 == 0) goto L_0x0084
            r14 = 6
            if (r13 >= r14) goto L_0x007f
            r14 = 16
            goto L_0x0081
        L_0x007f:
            r14 = 64
        L_0x0081:
            m22393a((com.applovin.exoplayer2.p221l.C7773z) r0, (int) r14)
        L_0x0084:
            int r13 = r13 + 1
            goto L_0x0071
        L_0x0087:
            int r12 = r0.mo55110d()
            int r12 = r12 + 4
            int r13 = r0.mo55110d()
            if (r13 != 0) goto L_0x009a
            int r14 = r0.mo55110d()
            int r14 = r14 + 4
            goto L_0x00bb
        L_0x009a:
            if (r13 != r9) goto L_0x00ba
            boolean r14 = r0.mo55106b()
            r0.mo55111e()
            r0.mo55111e()
            int r15 = r0.mo55110d()
            long r1 = (long) r15
            r15 = 0
        L_0x00ac:
            long r7 = (long) r15
            int r17 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r17 >= 0) goto L_0x00b7
            r0.mo55110d()
            int r15 = r15 + 1
            goto L_0x00ac
        L_0x00b7:
            r15 = r14
            r14 = 0
            goto L_0x00bc
        L_0x00ba:
            r14 = 0
        L_0x00bb:
            r15 = 0
        L_0x00bc:
            r0.mo55110d()
            r0.mo55103a()
            int r1 = r0.mo55110d()
            int r1 = r1 + r9
            int r2 = r0.mo55110d()
            int r2 = r2 + r9
            boolean r16 = r0.mo55106b()
            int r7 = 2 - r16
            int r7 = r7 * r2
            if (r16 != 0) goto L_0x00d9
            r0.mo55103a()
        L_0x00d9:
            r0.mo55103a()
            r2 = 16
            int r1 = r1 * 16
            int r7 = r7 * 16
            boolean r2 = r0.mo55106b()
            if (r2 == 0) goto L_0x011c
            int r2 = r0.mo55110d()
            int r8 = r0.mo55110d()
            int r17 = r0.mo55110d()
            int r18 = r0.mo55110d()
            if (r10 != 0) goto L_0x00fd
            int r10 = 2 - r16
            goto L_0x0112
        L_0x00fd:
            r19 = 2
            r9 = 3
            if (r10 != r9) goto L_0x0106
            r9 = 1
            r20 = 1
            goto L_0x0109
        L_0x0106:
            r9 = 1
            r20 = 2
        L_0x0109:
            if (r10 != r9) goto L_0x010c
            r9 = 2
        L_0x010c:
            int r10 = 2 - r16
            int r10 = r10 * r9
            r9 = r20
        L_0x0112:
            int r2 = r2 + r8
            int r2 = r2 * r9
            int r1 = r1 - r2
            int r17 = r17 + r18
            int r17 = r17 * r10
            int r7 = r7 - r17
        L_0x011c:
            r8 = r7
            r7 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.mo55106b()
            if (r2 == 0) goto L_0x0168
            boolean r2 = r0.mo55106b()
            if (r2 == 0) goto L_0x0168
            r2 = 8
            int r2 = r0.mo55108c(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0149
            r9 = 16
            int r2 = r0.mo55108c(r9)
            int r0 = r0.mo55108c(r9)
            if (r2 == 0) goto L_0x0147
            if (r0 == 0) goto L_0x0147
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0147:
            r9 = r1
            goto L_0x016a
        L_0x0149:
            float[] r0 = f18313b
            int r9 = r0.length
            if (r2 >= r9) goto L_0x0152
            r0 = r0[r2]
            r9 = r0
            goto L_0x016a
        L_0x0152:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r2, r0)
        L_0x0168:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x016a:
            com.applovin.exoplayer2.l.v$b r0 = new com.applovin.exoplayer2.l.v$b
            r2 = r0
            r10 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p221l.C7762v.m22392a(byte[], int, int):com.applovin.exoplayer2.l.v$b");
    }

    /* renamed from: a */
    private static void m22393a(C7773z zVar, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((zVar.mo55111e() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: a */
    public static void m22394a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & Ascii.f15554US) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m22395a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: a */
    public static boolean m22396a(String str, byte b) {
        if (!"video/avc".equals(str) || (b & Ascii.f15554US) != 6) {
            return "video/hevc".equals(str) && ((b & 126) >> 1) == 39;
        }
        return true;
    }

    /* renamed from: b */
    public static int m22397b(byte[] bArr, int i) {
        return bArr[i + 3] & Ascii.f15554US;
    }

    /* renamed from: b */
    public static C7763a m22398b(byte[] bArr, int i, int i2) {
        C7773z zVar = new C7773z(bArr, i, i2);
        zVar.mo55104a(8);
        int d = zVar.mo55110d();
        int d2 = zVar.mo55110d();
        zVar.mo55103a();
        return new C7763a(d, d2, zVar.mo55106b());
    }

    /* renamed from: c */
    public static int m22399c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: c */
    private static int m22400c(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
