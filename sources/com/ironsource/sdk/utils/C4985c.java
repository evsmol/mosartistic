package com.ironsource.sdk.utils;

import com.applovin.exoplayer2.common.base.Ascii;
import com.appodeal.ads.adapters.admob.BuildConfig;
import kotlin.KotlinVersion;

/* renamed from: com.ironsource.sdk.utils.c */
public final class C4985c {

    /* renamed from: d */
    private static final byte[] f12755d = {Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    private C4986a f12756a = new C4986a(this, (byte) 0);

    /* renamed from: b */
    private C4986a f12757b = new C4986a(this, (byte) 0);

    /* renamed from: c */
    private int[] f12758c = new int[16];

    /* renamed from: com.ironsource.sdk.utils.c$a */
    class C4986a {

        /* renamed from: a */
        boolean f12759a;

        /* renamed from: b */
        int[] f12760b;

        /* renamed from: c */
        long f12761c;

        /* renamed from: d */
        byte[] f12762d;

        private C4986a() {
            this.f12759a = true;
            this.f12760b = new int[4];
            this.f12762d = new byte[64];
            mo34735a();
        }

        /* synthetic */ C4986a(C4985c cVar, byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo34735a() {
            int[] iArr = this.f12760b;
            iArr[0] = 1732584193;
            iArr[1] = -271733879;
            iArr[2] = -1732584194;
            iArr[3] = 271733878;
            this.f12761c = 0;
        }
    }

    C4985c() {
        this.f12756a.mo34735a();
        this.f12757b.f12759a = false;
    }

    /* renamed from: a */
    private static int m14523a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & i2) | (i4 & (~i2))) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: a */
    private String m14524a() {
        if (!this.f12757b.f12759a) {
            C4986a aVar = this.f12757b;
            C4986a aVar2 = this.f12756a;
            System.arraycopy(aVar2.f12762d, 0, aVar.f12762d, 0, aVar.f12762d.length);
            System.arraycopy(aVar2.f12760b, 0, aVar.f12760b, 0, aVar.f12760b.length);
            aVar.f12759a = aVar2.f12759a;
            aVar.f12761c = aVar2.f12761c;
            long j = this.f12757b.f12761c;
            int i = (int) ((j >>> 3) & 63);
            m14526a(this.f12757b, f12755d, 0, i < 56 ? 56 - i : 120 - i);
            m14526a(this.f12757b, new byte[]{(byte) ((int) (j & 255)), (byte) ((int) ((j >>> 8) & 255)), (byte) ((int) ((j >>> 16) & 255)), (byte) ((int) ((j >>> 24) & 255)), (byte) ((int) ((j >>> 32) & 255)), (byte) ((int) ((j >>> 40) & 255)), (byte) ((int) ((j >>> 48) & 255)), (byte) ((int) ((j >>> 56) & 255))}, 0, 8);
            this.f12757b.f12759a = true;
        }
        int[] iArr = this.f12757b.f12760b;
        byte[] bArr = new byte[16];
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3 += 4) {
            bArr[i3] = (byte) (iArr[i2] & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 1] = (byte) ((iArr[i2] >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 2] = (byte) ((iArr[i2] >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 3] = (byte) ((iArr[i2] >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            i2++;
        }
        StringBuffer stringBuffer = new StringBuffer(32);
        for (int i4 = 0; i4 < 16; i4++) {
            byte b = bArr[i4] & 255;
            if (b < 16) {
                stringBuffer.append(BuildConfig.ADAPTER_VERSION);
            }
            stringBuffer.append(Integer.toHexString(b));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m14525a(String str) {
        C4985c cVar = new C4985c();
        byte[] bytes = str.getBytes();
        cVar.m14526a(cVar.f12756a, bytes, 0, bytes.length);
        return cVar.m14524a();
    }

    /* renamed from: a */
    private void m14526a(C4986a aVar, byte[] bArr, int i, int i2) {
        int i3 = 0;
        this.f12757b.f12759a = false;
        if (i2 + i > bArr.length) {
            i2 = bArr.length - i;
        }
        int i4 = ((int) (aVar.f12761c >>> 3)) & 63;
        aVar.f12761c += (long) (i2 << 3);
        int i5 = 64 - i4;
        if (i2 >= i5) {
            System.arraycopy(bArr, i, aVar.f12762d, i4, i5);
            m14527a(aVar, m14528a(aVar.f12762d, 64, 0));
            while (i5 + 63 < i2) {
                m14527a(aVar, m14528a(bArr, 64, i5));
                i5 += 64;
            }
            i3 = i5;
            i4 = 0;
        }
        if (i3 < i2) {
            for (int i6 = i3; i6 < i2; i6++) {
                aVar.f12762d[(i4 + i6) - i3] = bArr[i6 + i];
            }
        }
    }

    /* renamed from: a */
    private static void m14527a(C4986a aVar, int[] iArr) {
        C4986a aVar2 = aVar;
        int i = aVar2.f12760b[0];
        int i2 = aVar2.f12760b[1];
        int i3 = aVar2.f12760b[2];
        int i4 = aVar2.f12760b[3];
        int a = m14523a(i, i2, i3, i4, iArr[0], 7, -680876936);
        int a2 = m14523a(i4, a, i2, i3, iArr[1], 12, -389564586);
        int a3 = m14523a(i3, a2, a, i2, iArr[2], 17, 606105819);
        int a4 = m14523a(i2, a3, a2, a, iArr[3], 22, -1044525330);
        int a5 = m14523a(a, a4, a3, a2, iArr[4], 7, -176418897);
        int a6 = m14523a(a2, a5, a4, a3, iArr[5], 12, 1200080426);
        int a7 = m14523a(a3, a6, a5, a4, iArr[6], 17, -1473231341);
        int a8 = m14523a(a4, a7, a6, a5, iArr[7], 22, -45705983);
        int a9 = m14523a(a5, a8, a7, a6, iArr[8], 7, 1770035416);
        int i5 = a9;
        int a10 = m14523a(a6, i5, a8, a7, iArr[9], 12, -1958414417);
        int a11 = m14523a(a7, a10, a9, a8, iArr[10], 17, -42063);
        int a12 = m14523a(a8, a11, a10, a9, iArr[11], 22, -1990404162);
        int a13 = m14523a(i5, a12, a11, a10, iArr[12], 7, 1804603682);
        int i6 = a13;
        int a14 = m14523a(a10, i6, a12, a11, iArr[13], 12, -40341101);
        int a15 = m14523a(a11, a14, a13, a12, iArr[14], 17, -1502002290);
        int a16 = m14523a(a12, a15, a14, a13, iArr[15], 22, 1236535329);
        int b = m14529b(i6, a16, a15, a14, iArr[1], 5, -165796510);
        int b2 = m14529b(a14, b, a16, a15, iArr[6], 9, -1069501632);
        int b3 = m14529b(a15, b2, b, a16, iArr[11], 14, 643717713);
        int b4 = m14529b(a16, b3, b2, b, iArr[0], 20, -373897302);
        int b5 = m14529b(b, b4, b3, b2, iArr[5], 5, -701558691);
        int b6 = m14529b(b2, b5, b4, b3, iArr[10], 9, 38016083);
        int b7 = m14529b(b3, b6, b5, b4, iArr[15], 14, -660478335);
        int b8 = m14529b(b4, b7, b6, b5, iArr[4], 20, -405537848);
        int b9 = m14529b(b5, b8, b7, b6, iArr[9], 5, 568446438);
        int i7 = b9;
        int b10 = m14529b(b6, i7, b8, b7, iArr[14], 9, -1019803690);
        int b11 = m14529b(b7, b10, b9, b8, iArr[3], 14, -187363961);
        int b12 = m14529b(b8, b11, b10, b9, iArr[8], 20, 1163531501);
        int b13 = m14529b(i7, b12, b11, b10, iArr[13], 5, -1444681467);
        int i8 = b13;
        int b14 = m14529b(b10, i8, b12, b11, iArr[2], 9, -51403784);
        int b15 = m14529b(b11, b14, b13, b12, iArr[7], 14, 1735328473);
        int b16 = m14529b(b12, b15, b14, b13, iArr[12], 20, -1926607734);
        int c = m14530c(i8, b16, b15, b14, iArr[5], 4, -378558);
        int c2 = m14530c(b14, c, b16, b15, iArr[8], 11, -2022574463);
        int c3 = m14530c(b15, c2, c, b16, iArr[11], 16, 1839030562);
        int c4 = m14530c(b16, c3, c2, c, iArr[14], 23, -35309556);
        int c5 = m14530c(c, c4, c3, c2, iArr[1], 4, -1530992060);
        int c6 = m14530c(c2, c5, c4, c3, iArr[4], 11, 1272893353);
        int c7 = m14530c(c3, c6, c5, c4, iArr[7], 16, -155497632);
        int c8 = m14530c(c4, c7, c6, c5, iArr[10], 23, -1094730640);
        int c9 = m14530c(c5, c8, c7, c6, iArr[13], 4, 681279174);
        int i9 = c9;
        int c10 = m14530c(c6, i9, c8, c7, iArr[0], 11, -358537222);
        int c11 = m14530c(c7, c10, c9, c8, iArr[3], 16, -722521979);
        int c12 = m14530c(c8, c11, c10, c9, iArr[6], 23, 76029189);
        int c13 = m14530c(i9, c12, c11, c10, iArr[9], 4, -640364487);
        int i10 = c13;
        int c14 = m14530c(c10, i10, c12, c11, iArr[12], 11, -421815835);
        int c15 = m14530c(c11, c14, c13, c12, iArr[15], 16, 530742520);
        int c16 = m14530c(c12, c15, c14, c13, iArr[2], 23, -995338651);
        int d = m14531d(i10, c16, c15, c14, iArr[0], 6, -198630844);
        int d2 = m14531d(c14, d, c16, c15, iArr[7], 10, 1126891415);
        int d3 = m14531d(c15, d2, d, c16, iArr[14], 15, -1416354905);
        int d4 = m14531d(c16, d3, d2, d, iArr[5], 21, -57434055);
        int d5 = m14531d(d, d4, d3, d2, iArr[12], 6, 1700485571);
        int d6 = m14531d(d2, d5, d4, d3, iArr[3], 10, -1894986606);
        int d7 = m14531d(d3, d6, d5, d4, iArr[10], 15, -1051523);
        int d8 = m14531d(d4, d7, d6, d5, iArr[1], 21, -2054922799);
        int d9 = m14531d(d5, d8, d7, d6, iArr[8], 6, 1873313359);
        int i11 = d9;
        int d10 = m14531d(d6, i11, d8, d7, iArr[15], 10, -30611744);
        int d11 = m14531d(d7, d10, d9, d8, iArr[6], 15, -1560198380);
        int d12 = m14531d(d8, d11, d10, d9, iArr[13], 21, 1309151649);
        int d13 = m14531d(i11, d12, d11, d10, iArr[4], 6, -145523070);
        int d14 = m14531d(d10, d13, d12, d11, iArr[11], 10, -1120210379);
        int d15 = m14531d(d11, d14, d13, d12, iArr[2], 15, 718787259);
        int d16 = m14531d(d12, d15, d14, d13, iArr[9], 21, -343485551);
        int[] iArr2 = aVar2.f12760b;
        iArr2[0] = iArr2[0] + d13;
        int[] iArr3 = aVar2.f12760b;
        iArr3[1] = iArr3[1] + d16;
        int[] iArr4 = aVar2.f12760b;
        iArr4[2] = iArr4[2] + d15;
        int[] iArr5 = aVar2.f12760b;
        iArr5[3] = iArr5[3] + d14;
    }

    /* renamed from: a */
    private int[] m14528a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 64; i4 += 4) {
            this.f12758c[i3] = (bArr[i4 + i2] & 255) | ((bArr[(i4 + 1) + i2] & 255) << 8) | ((bArr[(i4 + 2) + i2] & 255) << Ascii.DLE) | ((bArr[(i4 + 3) + i2] & 255) << Ascii.CAN);
            i3++;
        }
        return this.f12758c;
    }

    /* renamed from: b */
    private static int m14529b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & (~i4)) | (i2 & i4)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: c */
    private static int m14530c(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 ^ i2) ^ i4) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: d */
    private static int m14531d(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + (i3 ^ ((~i4) | i2)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    public final String toString() {
        return m14524a();
    }
}
