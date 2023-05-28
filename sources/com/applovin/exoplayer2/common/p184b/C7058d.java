package com.applovin.exoplayer2.common.p184b;

import com.applovin.exoplayer2.common.base.Preconditions;

/* renamed from: com.applovin.exoplayer2.common.b.d */
public final class C7058d {
    /* renamed from: a */
    public static int m18936a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m18937a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: a */
    public static long m18938a(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] > j) {
                j = jArr[i];
            }
        }
        return j;
    }
}
