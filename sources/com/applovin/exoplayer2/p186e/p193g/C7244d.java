package com.applovin.exoplayer2.p186e.p193g;

import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.e.g.d */
final class C7244d {

    /* renamed from: com.applovin.exoplayer2.e.g.d$a */
    public static final class C7246a {

        /* renamed from: a */
        public final long[] f16133a;

        /* renamed from: b */
        public final int[] f16134b;

        /* renamed from: c */
        public final int f16135c;

        /* renamed from: d */
        public final long[] f16136d;

        /* renamed from: e */
        public final int[] f16137e;

        /* renamed from: f */
        public final long f16138f;

        private C7246a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f16133a = jArr;
            this.f16134b = iArr;
            this.f16135c = i;
            this.f16136d = jArr2;
            this.f16137e = iArr2;
            this.f16138f = j;
        }
    }

    /* renamed from: a */
    public static C7246a m19667a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        for (int a : iArr2) {
            i3 += C7728ai.m22179a(a, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr3 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr4 = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            int i8 = iArr2[i7];
            long j2 = jArr[i7];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i5] = j2;
                iArr3[i5] = i * min;
                i6 = Math.max(i6, iArr3[i5]);
                jArr3[i5] = ((long) i4) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i4 += min;
                i8 -= min;
                i5++;
            }
        }
        return new C7246a(jArr2, iArr3, i6, jArr3, iArr4, j * ((long) i4));
    }
}
