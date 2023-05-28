package com.applovin.exoplayer2.common.p183a;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.p */
final class C7028p {
    /* renamed from: a */
    static int m18780a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: a */
    static int m18781a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* renamed from: a */
    static int m18782a(@NullableDecl Object obj) {
        return m18780a(obj == null ? 0 : obj.hashCode());
    }
}
