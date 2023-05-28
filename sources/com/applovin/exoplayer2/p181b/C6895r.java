package com.applovin.exoplayer2.p181b;

/* renamed from: com.applovin.exoplayer2.b.r */
public final class C6895r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String[] f15183a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final int[] f15184b = {44100, 48000, 32000};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int[] f15185c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f15186d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int[] f15187e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int[] f15188f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final int[] f15189g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: com.applovin.exoplayer2.b.r$a */
    public static final class C6896a {

        /* renamed from: a */
        public int f15190a;

        /* renamed from: b */
        public String f15191b;

        /* renamed from: c */
        public int f15192c;

        /* renamed from: d */
        public int f15193d;

        /* renamed from: e */
        public int f15194e;

        /* renamed from: f */
        public int f15195f;

        /* renamed from: g */
        public int f15196g;

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo53060a(int r9) {
            /*
                r8 = this;
                boolean r0 = com.applovin.exoplayer2.p181b.C6895r.m18259d(r9)
                r1 = 0
                if (r0 != 0) goto L_0x0008
                return r1
            L_0x0008:
                int r0 = r9 >>> 19
                r2 = 3
                r0 = r0 & r2
                r3 = 1
                if (r0 != r3) goto L_0x0010
                return r1
            L_0x0010:
                int r4 = r9 >>> 17
                r4 = r4 & r2
                if (r4 != 0) goto L_0x0016
                return r1
            L_0x0016:
                int r5 = r9 >>> 12
                r6 = 15
                r5 = r5 & r6
                if (r5 == 0) goto L_0x00ae
                if (r5 != r6) goto L_0x0021
                goto L_0x00ae
            L_0x0021:
                int r6 = r9 >>> 10
                r6 = r6 & r2
                if (r6 != r2) goto L_0x0027
                return r1
            L_0x0027:
                r8.f15190a = r0
                java.lang.String[] r1 = com.applovin.exoplayer2.p181b.C6895r.f15183a
                int r7 = 3 - r4
                r1 = r1[r7]
                r8.f15191b = r1
                int[] r1 = com.applovin.exoplayer2.p181b.C6895r.f15184b
                r1 = r1[r6]
                r8.f15193d = r1
                r6 = 2
                if (r0 != r6) goto L_0x0042
                int r1 = r1 / r6
            L_0x003f:
                r8.f15193d = r1
                goto L_0x0047
            L_0x0042:
                if (r0 != 0) goto L_0x0047
                int r1 = r1 / 4
                goto L_0x003f
            L_0x0047:
                int r1 = r9 >>> 9
                r1 = r1 & r3
                int r7 = com.applovin.exoplayer2.p181b.C6895r.m18255b(r0, r4)
                r8.f15196g = r7
                if (r4 != r2) goto L_0x0070
                if (r0 != r2) goto L_0x005c
                int[] r0 = com.applovin.exoplayer2.p181b.C6895r.f15185c
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L_0x0063
            L_0x005c:
                int[] r0 = com.applovin.exoplayer2.p181b.C6895r.f15186d
                int r5 = r5 - r3
                r0 = r0[r5]
            L_0x0063:
                r8.f15195f = r0
                int r0 = r0 * 12
                int r4 = r8.f15193d
                int r0 = r0 / r4
                int r0 = r0 + r1
                int r0 = r0 * 4
            L_0x006d:
                r8.f15192c = r0
                goto L_0x00a5
            L_0x0070:
                r7 = 144(0x90, float:2.02E-43)
                if (r0 != r2) goto L_0x008e
                if (r4 != r6) goto L_0x007e
                int[] r0 = com.applovin.exoplayer2.p181b.C6895r.f15187e
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L_0x0085
            L_0x007e:
                int[] r0 = com.applovin.exoplayer2.p181b.C6895r.f15188f
                int r5 = r5 - r3
                r0 = r0[r5]
            L_0x0085:
                r8.f15195f = r0
                int r0 = r0 * 144
                int r4 = r8.f15193d
                int r0 = r0 / r4
                int r0 = r0 + r1
                goto L_0x006d
            L_0x008e:
                int[] r0 = com.applovin.exoplayer2.p181b.C6895r.f15189g
                int r5 = r5 - r3
                r0 = r0[r5]
                r8.f15195f = r0
                if (r4 != r3) goto L_0x009b
                r7 = 72
            L_0x009b:
                int r0 = r8.f15195f
                int r7 = r7 * r0
                int r0 = r8.f15193d
                int r7 = r7 / r0
                int r7 = r7 + r1
                r8.f15192c = r7
            L_0x00a5:
                int r9 = r9 >> 6
                r9 = r9 & r2
                if (r9 != r2) goto L_0x00ab
                r6 = 1
            L_0x00ab:
                r8.f15194e = r6
                return r3
            L_0x00ae:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p181b.C6895r.C6896a.mo53060a(int):boolean");
        }
    }

    /* renamed from: a */
    public static int m18251a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!m18259d(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f15184b[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f15185c[i4 - 1] : f15186d[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f15187e[i4 - 1] : f15188f[i4 - 1] : f15189g[i4 - 1];
        int i9 = 144;
        if (i2 == 3) {
            return ((i8 * 144) / i6) + i7;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i8) / i6) + i7;
    }

    /* renamed from: b */
    public static int m18254b(int i) {
        int i2;
        int i3;
        if (!m18259d(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m18255b(i2, i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m18255b(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m18259d(int i) {
        return (i & -2097152) == -2097152;
    }
}
