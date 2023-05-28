package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.i.ae */
public final class C7292ae {
    /* renamed from: a */
    public static int m19954a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static long m19955a(C7772y yVar, int i, int i2) {
        yVar.mo55076d(i);
        if (yVar.mo55064a() < 5) {
            return -9223372036854775807L;
        }
        int q = yVar.mo55093q();
        if ((8388608 & q) != 0 || ((2096896 & q) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z = true;
        if (((q & 32) != 0) && yVar.mo55084h() >= 7 && yVar.mo55064a() >= 7) {
            if ((yVar.mo55084h() & 16) != 16) {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[6];
                yVar.mo55071a(bArr, 0, 6);
                return m19956a(bArr);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private static long m19956a(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    /* renamed from: a */
    public static boolean m19957a(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }
}
