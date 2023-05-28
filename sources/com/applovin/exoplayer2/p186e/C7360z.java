package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.e.z */
public final class C7360z {

    /* renamed from: com.applovin.exoplayer2.e.z$a */
    private static final class C7361a {

        /* renamed from: a */
        public final int f16790a;

        /* renamed from: b */
        public final int f16791b;

        /* renamed from: c */
        public final long[] f16792c;

        /* renamed from: d */
        public final int f16793d;

        /* renamed from: e */
        public final boolean f16794e;

        public C7361a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f16790a = i;
            this.f16791b = i2;
            this.f16792c = jArr;
            this.f16793d = i3;
            this.f16794e = z;
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.z$b */
    public static final class C7362b {

        /* renamed from: a */
        public final String f16795a;

        /* renamed from: b */
        public final String[] f16796b;

        /* renamed from: c */
        public final int f16797c;

        public C7362b(String str, String[] strArr, int i) {
            this.f16795a = str;
            this.f16796b = strArr;
            this.f16797c = i;
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.z$c */
    public static final class C7363c {

        /* renamed from: a */
        public final boolean f16798a;

        /* renamed from: b */
        public final int f16799b;

        /* renamed from: c */
        public final int f16800c;

        /* renamed from: d */
        public final int f16801d;

        public C7363c(boolean z, int i, int i2, int i3) {
            this.f16798a = z;
            this.f16799b = i;
            this.f16800c = i2;
            this.f16801d = i3;
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.z$d */
    public static final class C7364d {

        /* renamed from: a */
        public final int f16802a;

        /* renamed from: b */
        public final int f16803b;

        /* renamed from: c */
        public final int f16804c;

        /* renamed from: d */
        public final int f16805d;

        /* renamed from: e */
        public final int f16806e;

        /* renamed from: f */
        public final int f16807f;

        /* renamed from: g */
        public final int f16808g;

        /* renamed from: h */
        public final int f16809h;

        /* renamed from: i */
        public final boolean f16810i;

        /* renamed from: j */
        public final byte[] f16811j;

        public C7364d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f16802a = i;
            this.f16803b = i2;
            this.f16804c = i3;
            this.f16805d = i4;
            this.f16806e = i5;
            this.f16807f = i6;
            this.f16808g = i7;
            this.f16809h = i8;
            this.f16810i = z;
            this.f16811j = bArr;
        }
    }

    /* renamed from: a */
    public static int m20301a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    private static long m20302a(long j, long j2) {
        return (long) Math.floor(Math.pow((double) j, 1.0d / ((double) j2)));
    }

    /* renamed from: a */
    public static C7362b m20303a(C7772y yVar, boolean z, boolean z2) throws C6809ai {
        if (z) {
            m20306a(3, yVar, false);
        }
        String f = yVar.mo55081f((int) yVar.mo55092p());
        int length = 11 + f.length();
        long p = yVar.mo55092p();
        String[] strArr = new String[((int) p)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < p; i2++) {
            strArr[i2] = yVar.mo55081f((int) yVar.mo55092p());
            i = i + 4 + strArr[i2].length();
        }
        if (!z2 || (yVar.mo55084h() & 1) != 0) {
            return new C7362b(f, strArr, i + 1);
        }
        throw C6809ai.m17540b("framing bit expected to be set", (Throwable) null);
    }

    /* renamed from: a */
    public static C7364d m20304a(C7772y yVar) throws C6809ai {
        boolean z = true;
        m20306a(1, yVar, false);
        int x = yVar.mo55100x();
        int h = yVar.mo55084h();
        int x2 = yVar.mo55100x();
        int r = yVar.mo55094r();
        if (r <= 0) {
            r = -1;
        }
        int r2 = yVar.mo55094r();
        if (r2 <= 0) {
            r2 = -1;
        }
        int r3 = yVar.mo55094r();
        if (r3 <= 0) {
            r3 = -1;
        }
        int h2 = yVar.mo55084h();
        int pow = (int) Math.pow(2.0d, (double) (h2 & 15));
        int pow2 = (int) Math.pow(2.0d, (double) ((h2 & 240) >> 4));
        if ((yVar.mo55084h() & 1) <= 0) {
            z = false;
        }
        return new C7364d(x, h, x2, r, r2, r3, pow, pow2, z, Arrays.copyOf(yVar.mo55077d(), yVar.mo55072b()));
    }

    /* renamed from: a */
    private static void m20305a(int i, C7359y yVar) throws C6809ai {
        int a = yVar.mo54096a(6) + 1;
        for (int i2 = 0; i2 < a; i2++) {
            int a2 = yVar.mo54096a(16);
            if (a2 != 0) {
                C7755q.m22363d("VorbisUtil", "mapping type other than 0 not supported: " + a2);
            } else {
                int a3 = yVar.mo54097a() ? yVar.mo54096a(4) + 1 : 1;
                if (yVar.mo54097a()) {
                    int a4 = yVar.mo54096a(8) + 1;
                    for (int i3 = 0; i3 < a4; i3++) {
                        int i4 = i - 1;
                        yVar.mo54099b(m20301a(i4));
                        yVar.mo54099b(m20301a(i4));
                    }
                }
                if (yVar.mo54096a(2) == 0) {
                    if (a3 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            yVar.mo54099b(4);
                        }
                    }
                    for (int i6 = 0; i6 < a3; i6++) {
                        yVar.mo54099b(8);
                        yVar.mo54099b(8);
                        yVar.mo54099b(8);
                    }
                } else {
                    throw C6809ai.m17540b("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m20306a(int i, C7772y yVar, boolean z) throws C6809ai {
        if (yVar.mo55064a() < 7) {
            if (z) {
                return false;
            }
            throw C6809ai.m17540b("too short header: " + yVar.mo55064a(), (Throwable) null);
        } else if (yVar.mo55084h() != i) {
            if (z) {
                return false;
            }
            throw C6809ai.m17540b("expected header type " + Integer.toHexString(i), (Throwable) null);
        } else if (yVar.mo55084h() == 118 && yVar.mo55084h() == 111 && yVar.mo55084h() == 114 && yVar.mo55084h() == 98 && yVar.mo55084h() == 105 && yVar.mo55084h() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw C6809ai.m17540b("expected characters 'vorbis'", (Throwable) null);
        }
    }

    /* renamed from: a */
    private static C7363c[] m20307a(C7359y yVar) {
        int a = yVar.mo54096a(6) + 1;
        C7363c[] cVarArr = new C7363c[a];
        for (int i = 0; i < a; i++) {
            cVarArr[i] = new C7363c(yVar.mo54097a(), yVar.mo54096a(16), yVar.mo54096a(16), yVar.mo54096a(8));
        }
        return cVarArr;
    }

    /* renamed from: a */
    public static C7363c[] m20308a(C7772y yVar, int i) throws C6809ai {
        int i2 = 0;
        m20306a(5, yVar, false);
        int h = yVar.mo55084h() + 1;
        C7359y yVar2 = new C7359y(yVar.mo55077d());
        yVar2.mo54099b(yVar.mo55074c() * 8);
        for (int i3 = 0; i3 < h; i3++) {
            m20312d(yVar2);
        }
        int a = yVar2.mo54096a(6) + 1;
        while (i2 < a) {
            if (yVar2.mo54096a(16) == 0) {
                i2++;
            } else {
                throw C6809ai.m17540b("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        m20311c(yVar2);
        m20310b(yVar2);
        m20305a(i, yVar2);
        C7363c[] a2 = m20307a(yVar2);
        if (yVar2.mo54097a()) {
            return a2;
        }
        throw C6809ai.m17540b("framing bit after modes not set as expected", (Throwable) null);
    }

    /* renamed from: b */
    public static C7362b m20309b(C7772y yVar) throws C6809ai {
        return m20303a(yVar, true, true);
    }

    /* renamed from: b */
    private static void m20310b(C7359y yVar) throws C6809ai {
        int a = yVar.mo54096a(6) + 1;
        int i = 0;
        while (i < a) {
            if (yVar.mo54096a(16) <= 2) {
                yVar.mo54099b(24);
                yVar.mo54099b(24);
                yVar.mo54099b(24);
                int a2 = yVar.mo54096a(6) + 1;
                yVar.mo54099b(8);
                int[] iArr = new int[a2];
                for (int i2 = 0; i2 < a2; i2++) {
                    iArr[i2] = ((yVar.mo54097a() ? yVar.mo54096a(5) : 0) * 8) + yVar.mo54096a(3);
                }
                for (int i3 = 0; i3 < a2; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            yVar.mo54099b(8);
                        }
                    }
                }
                i++;
            } else {
                throw C6809ai.m17540b("residueType greater than 2 is not decodable", (Throwable) null);
            }
        }
    }

    /* renamed from: c */
    private static void m20311c(C7359y yVar) throws C6809ai {
        int a = yVar.mo54096a(6) + 1;
        for (int i = 0; i < a; i++) {
            int a2 = yVar.mo54096a(16);
            if (a2 == 0) {
                yVar.mo54099b(8);
                yVar.mo54099b(16);
                yVar.mo54099b(16);
                yVar.mo54099b(6);
                yVar.mo54099b(8);
                int a3 = yVar.mo54096a(4) + 1;
                for (int i2 = 0; i2 < a3; i2++) {
                    yVar.mo54099b(8);
                }
            } else if (a2 == 1) {
                int a4 = yVar.mo54096a(5);
                int i3 = -1;
                int[] iArr = new int[a4];
                for (int i4 = 0; i4 < a4; i4++) {
                    iArr[i4] = yVar.mo54096a(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = yVar.mo54096a(3) + 1;
                    int a5 = yVar.mo54096a(2);
                    if (a5 > 0) {
                        yVar.mo54099b(8);
                    }
                    for (int i7 = 0; i7 < (1 << a5); i7++) {
                        yVar.mo54099b(8);
                    }
                }
                yVar.mo54099b(2);
                int a6 = yVar.mo54096a(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < a4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        yVar.mo54099b(a6);
                        i9++;
                    }
                }
            } else {
                throw C6809ai.m17540b("floor type greater than 1 not decodable: " + a2, (Throwable) null);
            }
        }
    }

    /* renamed from: d */
    private static C7361a m20312d(C7359y yVar) throws C6809ai {
        if (yVar.mo54096a(24) == 5653314) {
            int a = yVar.mo54096a(16);
            int a2 = yVar.mo54096a(24);
            long[] jArr = new long[a2];
            boolean a3 = yVar.mo54097a();
            long j = 0;
            if (!a3) {
                boolean a4 = yVar.mo54097a();
                for (int i = 0; i < a2; i++) {
                    if (!a4) {
                        jArr[i] = (long) (yVar.mo54096a(5) + 1);
                    } else if (yVar.mo54097a()) {
                        jArr[i] = (long) (yVar.mo54096a(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int a5 = yVar.mo54096a(5) + 1;
                int i2 = 0;
                while (i2 < a2) {
                    int a6 = yVar.mo54096a(m20301a(a2 - i2));
                    for (int i3 = 0; i3 < a6 && i2 < a2; i3++) {
                        jArr[i2] = (long) a5;
                        i2++;
                    }
                    a5++;
                }
            }
            int a7 = yVar.mo54096a(4);
            if (a7 <= 2) {
                if (a7 == 1 || a7 == 2) {
                    yVar.mo54099b(32);
                    yVar.mo54099b(32);
                    int a8 = yVar.mo54096a(4) + 1;
                    yVar.mo54099b(1);
                    if (a7 != 1) {
                        j = ((long) a2) * ((long) a);
                    } else if (a != 0) {
                        j = m20302a((long) a2, (long) a);
                    }
                    yVar.mo54099b((int) (j * ((long) a8)));
                }
                return new C7361a(a, a2, jArr, a7, a3);
            }
            throw C6809ai.m17540b("lookup type greater than 2 not decodable: " + a7, (Throwable) null);
        }
        throw C6809ai.m17540b("expected code book to start with [0x56, 0x43, 0x42] at " + yVar.mo54098b(), (Throwable) null);
    }
}
