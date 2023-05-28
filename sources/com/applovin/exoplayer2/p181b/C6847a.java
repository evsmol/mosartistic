package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7771x;

/* renamed from: com.applovin.exoplayer2.b.a */
public final class C6847a {

    /* renamed from: a */
    private static final int[] f14976a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f14977b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: com.applovin.exoplayer2.b.a$a */
    public static final class C6849a {

        /* renamed from: a */
        public final int f14978a;

        /* renamed from: b */
        public final int f14979b;

        /* renamed from: c */
        public final String f14980c;

        private C6849a(int i, int i2, String str) {
            this.f14978a = i;
            this.f14979b = i2;
            this.f14980c = str;
        }
    }

    /* renamed from: a */
    private static int m17927a(C7771x xVar) {
        int c = xVar.mo55054c(5);
        return c == 31 ? xVar.mo55054c(6) + 32 : c;
    }

    /* renamed from: a */
    public static C6849a m17928a(C7771x xVar, boolean z) throws C6809ai {
        int a = m17927a(xVar);
        int b = m17932b(xVar);
        int c = xVar.mo55054c(4);
        String str = "mp4a.40." + a;
        if (a == 5 || a == 29) {
            b = m17932b(xVar);
            a = m17927a(xVar);
            if (a == 22) {
                c = xVar.mo55054c(4);
            }
        }
        if (z) {
            if (!(a == 1 || a == 2 || a == 3 || a == 4 || a == 6 || a == 7 || a == 17)) {
                switch (a) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C6809ai.m17538a("Unsupported audio object type: " + a);
                }
            }
            m17930a(xVar, a, c);
            switch (a) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int c2 = xVar.mo55054c(2);
                    if (c2 == 2 || c2 == 3) {
                        throw C6809ai.m17538a("Unsupported epConfig: " + c2);
                    }
            }
        }
        int i = f14977b[c];
        if (i != -1) {
            return new C6849a(b, i, str);
        }
        throw C6809ai.m17540b((String) null, (Throwable) null);
    }

    /* renamed from: a */
    public static C6849a m17929a(byte[] bArr) throws C6809ai {
        return m17928a(new C7771x(bArr), false);
    }

    /* renamed from: a */
    private static void m17930a(C7771x xVar, int i, int i2) {
        if (xVar.mo55058e()) {
            C7755q.m22361c("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xVar.mo55058e()) {
            xVar.mo55051b(14);
        }
        boolean e = xVar.mo55058e();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                xVar.mo55051b(3);
            }
            if (e) {
                if (i == 22) {
                    xVar.mo55051b(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    xVar.mo55051b(3);
                }
                xVar.mo55051b(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static byte[] m17931a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: b */
    private static int m17932b(C7771x xVar) throws C6809ai {
        int c = xVar.mo55054c(4);
        if (c == 15) {
            return xVar.mo55054c(24);
        }
        if (c < 13) {
            return f14976a[c];
        }
        throw C6809ai.m17540b((String) null, (Throwable) null);
    }
}
