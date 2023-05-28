package com.applovin.exoplayer2.p186e.p191e;

import com.applovin.exoplayer2.p186e.C7279i;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.e.f */
final class C7222f {

    /* renamed from: a */
    private static final long[] f16041a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b */
    private final byte[] f16042b = new byte[8];

    /* renamed from: c */
    private int f16043c;

    /* renamed from: d */
    private int f16044d;

    /* renamed from: a */
    public static int m19547a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = f16041a;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    /* renamed from: a */
    public static long m19548a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f16041a[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public long mo53938a(C7279i iVar, boolean z, boolean z2, int i) throws IOException {
        if (this.f16043c == 0) {
            if (!iVar.mo53901a(this.f16042b, 0, 1, z)) {
                return -1;
            }
            int a = m19547a(this.f16042b[0] & 255);
            this.f16044d = a;
            if (a != -1) {
                this.f16043c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f16044d;
        if (i2 > i) {
            this.f16043c = 0;
            return -2;
        }
        if (i2 != 1) {
            iVar.mo53903b(this.f16042b, 1, i2 - 1);
        }
        this.f16043c = 0;
        return m19548a(this.f16042b, this.f16044d, z2);
    }

    /* renamed from: a */
    public void mo53939a() {
        this.f16043c = 0;
        this.f16044d = 0;
    }

    /* renamed from: b */
    public int mo53940b() {
        return this.f16044d;
    }
}
