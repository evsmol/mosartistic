package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.b.c */
public final class C6853c {

    /* renamed from: a */
    private static final int[] f14993a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: com.applovin.exoplayer2.b.c$a */
    public static final class C6855a {

        /* renamed from: a */
        public final int f14994a;

        /* renamed from: b */
        public final int f14995b;

        /* renamed from: c */
        public final int f14996c;

        /* renamed from: d */
        public final int f14997d;

        /* renamed from: e */
        public final int f14998e;

        private C6855a(int i, int i2, int i3, int i4, int i5) {
            this.f14994a = i;
            this.f14996c = i2;
            this.f14995b = i3;
            this.f14997d = i4;
            this.f14998e = i5;
        }
    }

    /* renamed from: a */
    private static int m17942a(C7771x xVar, int i) {
        int i2 = 0;
        while (true) {
            int c = i2 + xVar.mo55054c(i);
            if (!xVar.mo55058e()) {
                return c;
            }
            i2 = (c + 1) << i;
        }
    }

    /* renamed from: a */
    public static int m17943a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m17945a(new C7771x(bArr)).f14998e;
    }

    /* renamed from: a */
    public static int m17944a(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        byte b = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (b == 65535) {
            b = ((bArr[4] & 255) << Ascii.DLE) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return b + i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        if (r10 != 8) goto L_0x0093;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.exoplayer2.p181b.C6853c.C6855a m17945a(com.applovin.exoplayer2.p221l.C7771x r10) {
        /*
            r0 = 16
            int r1 = r10.mo55054c(r0)
            int r0 = r10.mo55054c(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r10.mo55054c(r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = 4
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r7 = r0
            r0 = 2
            int r1 = r10.mo55054c(r0)
            r3 = 3
            if (r1 != r3) goto L_0x002f
            int r4 = m17942a((com.applovin.exoplayer2.p221l.C7771x) r10, (int) r0)
            int r1 = r1 + r4
        L_0x002f:
            r4 = r1
            r1 = 10
            int r1 = r10.mo55054c(r1)
            boolean r5 = r10.mo55058e()
            if (r5 == 0) goto L_0x0045
            int r5 = r10.mo55054c(r3)
            if (r5 <= 0) goto L_0x0045
            r10.mo55051b(r0)
        L_0x0045:
            boolean r5 = r10.mo55058e()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L_0x0055
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0058
        L_0x0055:
            r9 = 44100(0xac44, float:6.1797E-41)
        L_0x0058:
            int r10 = r10.mo55054c(r2)
            r5 = 0
            if (r9 != r8) goto L_0x0069
            r8 = 13
            if (r10 != r8) goto L_0x0069
            int[] r0 = f14993a
            r10 = r0[r10]
            r8 = r10
            goto L_0x0099
        L_0x0069:
            if (r9 != r6) goto L_0x0098
            int[] r6 = f14993a
            int r8 = r6.length
            if (r10 >= r8) goto L_0x0098
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L_0x008e
            r8 = 11
            if (r1 == r0) goto L_0x0089
            if (r1 == r3) goto L_0x008e
            if (r1 == r2) goto L_0x0082
            goto L_0x0093
        L_0x0082:
            if (r10 == r3) goto L_0x0095
            if (r10 == r6) goto L_0x0095
            if (r10 != r8) goto L_0x0093
            goto L_0x0095
        L_0x0089:
            if (r10 == r6) goto L_0x0095
            if (r10 != r8) goto L_0x0093
            goto L_0x0095
        L_0x008e:
            if (r10 == r3) goto L_0x0095
            if (r10 != r6) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r8 = r5
            goto L_0x0099
        L_0x0095:
            int r5 = r5 + 1
            goto L_0x0093
        L_0x0098:
            r8 = 0
        L_0x0099:
            com.applovin.exoplayer2.b.c$a r10 = new com.applovin.exoplayer2.b.c$a
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p181b.C6853c.m17945a(com.applovin.exoplayer2.l.x):com.applovin.exoplayer2.b.c$a");
    }

    /* renamed from: a */
    public static C7864v m17946a(C7772y yVar, String str, String str2, C7148e eVar) {
        yVar.mo55079e(1);
        return new C7864v.C7866a().mo55421a(str).mo55435f("audio/ac4").mo55440k(2).mo55441l(((yVar.mo55084h() & 32) >> 5) == 1 ? 48000 : 44100).mo55418a(eVar).mo55429c(str2).mo55424a();
    }

    /* renamed from: a */
    public static void m17947a(int i, C7772y yVar) {
        yVar.mo55067a(7);
        byte[] d = yVar.mo55077d();
        d[0] = -84;
        d[1] = 64;
        d[2] = -1;
        d[3] = -1;
        d[4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        d[5] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        d[6] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
