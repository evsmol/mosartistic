package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p221l.C7771x;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.b.o */
public final class C6890o {

    /* renamed from: a */
    private static final int[] f15166a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f15167b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f15168c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: a */
    public static int m18196a(ByteBuffer byteBuffer) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int position = byteBuffer.position();
        byte b2 = byteBuffer.get(position);
        if (b2 != -2) {
            if (b2 == -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                i4 = position + 7;
            } else if (b2 != 31) {
                i3 = (byteBuffer.get(position + 4) & 1) << 6;
                i2 = position + 5;
            } else {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                i4 = position + 6;
            }
            b = byteBuffer.get(i4) & 60;
            return (((b >> 2) | i) + 1) * 32;
        }
        i3 = (byteBuffer.get(position + 5) & 1) << 6;
        i2 = position + 4;
        b = byteBuffer.get(i2) & 252;
        return (((b >> 2) | i) + 1) * 32;
    }

    /* renamed from: a */
    public static int m18197a(byte[] bArr) {
        byte b;
        int i;
        byte b2;
        int i2;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            b = b3 & 60;
            return (((b >> 2) | i) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        b = b2 & 252;
        return (((b >> 2) | i) + 1) * 32;
    }

    /* renamed from: a */
    public static C7864v m18198a(byte[] bArr, String str, String str2, C7148e eVar) {
        C7771x c = m18201c(bArr);
        c.mo55051b(60);
        int i = f15166a[c.mo55054c(6)];
        int i2 = f15167b[c.mo55054c(4)];
        int c2 = c.mo55054c(5);
        int[] iArr = f15168c;
        int i3 = c2 >= iArr.length ? -1 : (iArr[c2] * 1000) / 2;
        c.mo55051b(10);
        return new C7864v.C7866a().mo55421a(str).mo55435f("audio/vnd.dts").mo55430d(i3).mo55440k(i + (c.mo55054c(2) > 0 ? 1 : 0)).mo55441l(i2).mo55418a(eVar).mo55429c(str2).mo55424a();
    }

    /* renamed from: a */
    public static boolean m18199a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m18200b(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L_0x004a
            r2 = -1
            if (r1 == r2) goto L_0x0032
            r2 = 31
            if (r1 == r2) goto L_0x0021
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r4]
            goto L_0x0058
        L_0x0021:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
            goto L_0x0042
        L_0x0032:
            byte r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
        L_0x0042:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L_0x005d
        L_0x004a:
            byte r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r3]
        L_0x0058:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L_0x005d:
            if (r0 == 0) goto L_0x0063
            int r7 = r7 * 16
            int r7 = r7 / 14
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p181b.C6890o.m18200b(byte[]):int");
    }

    /* renamed from: c */
    private static C7771x m18201c(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C7771x(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m18202d(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b;
            }
        }
        C7771x xVar = new C7771x(copyOf);
        if (copyOf[0] == 31) {
            C7771x xVar2 = new C7771x(copyOf);
            while (xVar2.mo55042a() >= 16) {
                xVar2.mo55051b(2);
                xVar.mo55045a(xVar2.mo55054c(14), 14);
            }
        }
        xVar.mo55047a(copyOf);
        return xVar;
    }

    /* renamed from: d */
    private static boolean m18202d(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
