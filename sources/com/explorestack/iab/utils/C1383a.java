package com.explorestack.iab.utils;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;

/* renamed from: com.explorestack.iab.utils.a */
public class C1383a {

    /* renamed from: a */
    public static final byte[] f4275a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.f15545FS, Ascii.f15546GS, Ascii.f15550RS, Ascii.f15554US, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.f15555VT, Ascii.f15544FF, Ascii.f15542CR, Ascii.f15552SO, Ascii.f15551SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f15543EM, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.f15555VT, Ascii.f15544FF, Ascii.f15542CR, Ascii.f15552SO, Ascii.f15551SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f15543EM};

    /* renamed from: com.explorestack.iab.utils.a$b */
    public static final class C1385b {

        /* renamed from: a */
        public long f4276a;

        /* renamed from: b */
        public byte[] f4277b;

        /* renamed from: c */
        public int f4278c;

        /* renamed from: d */
        public int f4279d;

        /* renamed from: e */
        public boolean f4280e;

        /* renamed from: f */
        public int f4281f;

        private C1385b() {
        }
    }

    /* renamed from: a */
    public final int mo4045a(int i, int i2) {
        int i3 = i + RecyclerView.UNDEFINED_DURATION;
        int i4 = i2 + RecyclerView.UNDEFINED_DURATION;
        if (i3 < i4) {
            return -1;
        }
        return i3 == i4 ? 0 : 1;
    }

    /* renamed from: a */
    public final int mo4046a(C1385b bVar) {
        if (bVar.f4277b != null) {
            return bVar.f4278c - bVar.f4279d;
        }
        return 0;
    }

    /* renamed from: a */
    public String mo4047a(String str) {
        return mo4048a(str.getBytes(Charset.forName("UTF-8")));
    }

    /* renamed from: a */
    public String mo4048a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new String(bArr);
        }
        C1385b bVar = new C1385b();
        mo4049a(bArr, 0, bArr.length, bVar);
        mo4049a(bArr, 0, -1, bVar);
        int i = bVar.f4278c;
        byte[] bArr2 = new byte[i];
        mo4050a(bArr2, i, bVar);
        return new String(bArr2);
    }

    /* renamed from: a */
    public final void mo4049a(byte[] bArr, int i, int i2, C1385b bVar) {
        byte b;
        int i3 = i2;
        C1385b bVar2 = bVar;
        if (!bVar2.f4280e) {
            boolean z = true;
            if (i3 < 0) {
                bVar2.f4280e = true;
            }
            int i4 = i;
            int i5 = 0;
            while (true) {
                if (i5 >= i3) {
                    break;
                }
                int i6 = i4 + 1;
                byte b2 = bArr[i4];
                if (b2 == 61) {
                    bVar2.f4280e = z;
                    break;
                }
                byte[] a = mo4051a(7, bVar2);
                if (b2 >= 0) {
                    byte[] bArr2 = f4275a;
                    if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                        int i7 = (bVar2.f4281f + (z ? 1 : 0)) % 8;
                        bVar2.f4281f = i7;
                        long j = (bVar2.f4276a << 5) + ((long) b);
                        bVar2.f4276a = j;
                        if (i7 == 0) {
                            int i8 = bVar2.f4278c;
                            int i9 = i8 + 1;
                            bVar2.f4278c = i9;
                            a[i8] = (byte) ((int) ((j >> 32) & 255));
                            int i10 = i9 + 1;
                            bVar2.f4278c = i10;
                            a[i9] = (byte) ((int) ((j >> 24) & 255));
                            int i11 = i10 + 1;
                            bVar2.f4278c = i11;
                            a[i10] = (byte) ((int) ((j >> 16) & 255));
                            int i12 = i11 + 1;
                            bVar2.f4278c = i12;
                            a[i11] = (byte) ((int) ((j >> 8) & 255));
                            bVar2.f4278c = i12 + 1;
                            a[i12] = (byte) ((int) (j & 255));
                        }
                    }
                }
                i5++;
                i4 = i6;
                z = true;
            }
            if (bVar2.f4280e && bVar2.f4281f > 0) {
                byte[] a2 = mo4051a(7, bVar2);
                switch (bVar2.f4281f) {
                    case 1:
                    case 2:
                        int i13 = bVar2.f4278c;
                        bVar2.f4278c = i13 + 1;
                        a2[i13] = (byte) ((int) ((bVar2.f4276a >> 2) & 255));
                        return;
                    case 3:
                        int i14 = bVar2.f4278c;
                        bVar2.f4278c = i14 + 1;
                        a2[i14] = (byte) ((int) ((bVar2.f4276a >> 7) & 255));
                        return;
                    case 4:
                        long j2 = bVar2.f4276a >> 4;
                        bVar2.f4276a = j2;
                        int i15 = bVar2.f4278c;
                        int i16 = i15 + 1;
                        bVar2.f4278c = i16;
                        a2[i15] = (byte) ((int) ((j2 >> 8) & 255));
                        bVar2.f4278c = i16 + 1;
                        a2[i16] = (byte) ((int) (j2 & 255));
                        return;
                    case 5:
                        long j3 = bVar2.f4276a >> 1;
                        bVar2.f4276a = j3;
                        int i17 = bVar2.f4278c;
                        int i18 = i17 + 1;
                        bVar2.f4278c = i18;
                        a2[i17] = (byte) ((int) ((j3 >> 16) & 255));
                        int i19 = i18 + 1;
                        bVar2.f4278c = i19;
                        a2[i18] = (byte) ((int) ((j3 >> 8) & 255));
                        bVar2.f4278c = i19 + 1;
                        a2[i19] = (byte) ((int) (j3 & 255));
                        return;
                    case 6:
                        long j4 = bVar2.f4276a >> 6;
                        bVar2.f4276a = j4;
                        int i20 = bVar2.f4278c;
                        int i21 = i20 + 1;
                        bVar2.f4278c = i21;
                        a2[i20] = (byte) ((int) ((j4 >> 16) & 255));
                        int i22 = i21 + 1;
                        bVar2.f4278c = i22;
                        a2[i21] = (byte) ((int) ((j4 >> 8) & 255));
                        bVar2.f4278c = i22 + 1;
                        a2[i22] = (byte) ((int) (j4 & 255));
                        return;
                    case 7:
                        long j5 = bVar2.f4276a >> 3;
                        bVar2.f4276a = j5;
                        int i23 = bVar2.f4278c;
                        int i24 = i23 + 1;
                        bVar2.f4278c = i24;
                        a2[i23] = (byte) ((int) ((j5 >> 24) & 255));
                        int i25 = i24 + 1;
                        bVar2.f4278c = i25;
                        a2[i24] = (byte) ((int) ((j5 >> 16) & 255));
                        int i26 = i25 + 1;
                        bVar2.f4278c = i26;
                        a2[i25] = (byte) ((int) ((j5 >> 8) & 255));
                        bVar2.f4278c = i26 + 1;
                        a2[i26] = (byte) ((int) (j5 & 255));
                        return;
                    default:
                        throw new IllegalStateException("Impossible modulus " + bVar2.f4281f);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4050a(byte[] bArr, int i, C1385b bVar) {
        if (bVar.f4277b != null) {
            int min = Math.min(mo4046a(bVar), i);
            System.arraycopy(bVar.f4277b, bVar.f4279d, bArr, 0, min);
            int i2 = bVar.f4279d + min;
            bVar.f4279d = i2;
            if (i2 >= bVar.f4278c) {
                bVar.f4277b = null;
            }
        }
    }

    /* renamed from: a */
    public final byte[] mo4051a(int i, C1385b bVar) {
        byte[] bArr = bVar.f4277b;
        if (bArr == null) {
            bVar.f4277b = new byte[Math.max(i, 8192)];
            bVar.f4278c = 0;
            bVar.f4279d = 0;
        } else {
            int i2 = bVar.f4278c + i;
            if (i2 - bArr.length > 0) {
                return mo4052a(bVar, i2);
            }
        }
        return bVar.f4277b;
    }

    /* renamed from: a */
    public final byte[] mo4052a(C1385b bVar, int i) {
        int length = bVar.f4277b.length * 2;
        if (mo4045a(length, i) < 0) {
            length = i;
        }
        if (mo4045a(length, 2147483639) > 0) {
            length = Math.max(i, 2147483639);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = bVar.f4277b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        bVar.f4277b = bArr;
        return bArr;
    }
}
