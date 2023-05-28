package com.applovin.exoplayer2.p221l;

/* renamed from: com.applovin.exoplayer2.l.ab */
public final class C7719ab {
    /* renamed from: a */
    public static int m22125a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (m22126b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m22126b(int i, int i2) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i2 & 2) != 0 : (i2 & 1) != 0;
        }
        return true;
    }
}
