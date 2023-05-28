package com.applovin.exoplayer2.p221l;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.l.y */
public final class C7772y {

    /* renamed from: a */
    private byte[] f18344a;

    /* renamed from: b */
    private int f18345b;

    /* renamed from: c */
    private int f18346c;

    public C7772y() {
        this.f18344a = C7728ai.f18254f;
    }

    public C7772y(int i) {
        this.f18344a = new byte[i];
        this.f18346c = i;
    }

    public C7772y(byte[] bArr) {
        this.f18344a = bArr;
        this.f18346c = bArr.length;
    }

    public C7772y(byte[] bArr, int i) {
        this.f18344a = bArr;
        this.f18346c = i;
    }

    /* renamed from: A */
    public double mo55060A() {
        return Double.longBitsToDouble(mo55095s());
    }

    /* renamed from: B */
    public String mo55061B() {
        return mo55065a(0);
    }

    /* renamed from: C */
    public String mo55062C() {
        if (mo55064a() == 0) {
            return null;
        }
        int i = this.f18345b;
        while (i < this.f18346c && !C7728ai.m22213a((int) this.f18344a[i])) {
            i++;
        }
        int i2 = this.f18345b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f18344a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f18345b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f18344a;
        int i3 = this.f18345b;
        String a = C7728ai.m22204a(bArr2, i3, i - i3);
        this.f18345b = i;
        int i4 = this.f18346c;
        if (i == i4) {
            return a;
        }
        if (this.f18344a[i] == 13) {
            int i5 = i + 1;
            this.f18345b = i5;
            if (i5 == i4) {
                return a;
            }
        }
        byte[] bArr3 = this.f18344a;
        int i6 = this.f18345b;
        if (bArr3[i6] == 10) {
            this.f18345b = i6 + 1;
        }
        return a;
    }

    /* renamed from: D */
    public long mo55063D() {
        int i;
        int i2;
        long j = (long) this.f18344a[this.f18345b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f18344a[this.f18345b + i];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f18345b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: a */
    public int mo55064a() {
        return this.f18346c - this.f18345b;
    }

    /* renamed from: a */
    public String mo55065a(char c) {
        if (mo55064a() == 0) {
            return null;
        }
        int i = this.f18345b;
        while (i < this.f18346c && this.f18344a[i] != c) {
            i++;
        }
        byte[] bArr = this.f18344a;
        int i2 = this.f18345b;
        String a = C7728ai.m22204a(bArr, i2, i - i2);
        this.f18345b = i;
        if (i < this.f18346c) {
            this.f18345b = i + 1;
        }
        return a;
    }

    /* renamed from: a */
    public String mo55066a(int i, Charset charset) {
        String str = new String(this.f18344a, this.f18345b, i, charset);
        this.f18345b += i;
        return str;
    }

    /* renamed from: a */
    public void mo55067a(int i) {
        mo55070a(mo55078e() < i ? new byte[i] : this.f18344a, i);
    }

    /* renamed from: a */
    public void mo55068a(C7771x xVar, int i) {
        mo55071a(xVar.f18340a, 0, i);
        xVar.mo55044a(0);
    }

    /* renamed from: a */
    public void mo55069a(byte[] bArr) {
        mo55070a(bArr, bArr.length);
    }

    /* renamed from: a */
    public void mo55070a(byte[] bArr, int i) {
        this.f18344a = bArr;
        this.f18346c = i;
        this.f18345b = 0;
    }

    /* renamed from: a */
    public void mo55071a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f18344a, this.f18345b, bArr, i, i2);
        this.f18345b += i2;
    }

    /* renamed from: b */
    public int mo55072b() {
        return this.f18346c;
    }

    /* renamed from: b */
    public void mo55073b(int i) {
        if (i > mo55078e()) {
            this.f18344a = Arrays.copyOf(this.f18344a, i);
        }
    }

    /* renamed from: c */
    public int mo55074c() {
        return this.f18345b;
    }

    /* renamed from: c */
    public void mo55075c(int i) {
        C7717a.m22118a(i >= 0 && i <= this.f18344a.length);
        this.f18346c = i;
    }

    /* renamed from: d */
    public void mo55076d(int i) {
        C7717a.m22118a(i >= 0 && i <= this.f18346c);
        this.f18345b = i;
    }

    /* renamed from: d */
    public byte[] mo55077d() {
        return this.f18344a;
    }

    /* renamed from: e */
    public int mo55078e() {
        return this.f18344a.length;
    }

    /* renamed from: e */
    public void mo55079e(int i) {
        mo55076d(this.f18345b + i);
    }

    /* renamed from: f */
    public int mo55080f() {
        return this.f18344a[this.f18345b] & 255;
    }

    /* renamed from: f */
    public String mo55081f(int i) {
        return mo55066a(i, Charsets.UTF_8);
    }

    /* renamed from: g */
    public char mo55082g() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: g */
    public String mo55083g(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f18345b + i) - 1;
        String a = C7728ai.m22204a(this.f18344a, this.f18345b, (i2 >= this.f18346c || this.f18344a[i2] != 0) ? i : i - 1);
        this.f18345b += i;
        return a;
    }

    /* renamed from: h */
    public int mo55084h() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        this.f18345b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: i */
    public int mo55085i() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        this.f18345b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: j */
    public int mo55086j() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        this.f18345b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: k */
    public short mo55087k() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        this.f18345b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: l */
    public short mo55088l() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        this.f18345b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: m */
    public int mo55089m() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        int i3 = (bArr[i] & 255) << Ascii.DLE;
        int i4 = i2 + 1;
        this.f18345b = i4;
        byte b = i3 | ((bArr[i2] & 255) << 8);
        this.f18345b = i4 + 1;
        return (bArr[i4] & 255) | b;
    }

    /* renamed from: n */
    public int mo55090n() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        int i3 = i2 + 1;
        this.f18345b = i3;
        byte b = (((bArr[i] & 255) << Ascii.CAN) >> 8) | ((bArr[i2] & 255) << 8);
        this.f18345b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: o */
    public long mo55091o() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        int i3 = i2 + 1;
        this.f18345b = i3;
        int i4 = i3 + 1;
        this.f18345b = i4;
        this.f18345b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: p */
    public long mo55092p() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        int i3 = i2 + 1;
        this.f18345b = i3;
        int i4 = i3 + 1;
        this.f18345b = i4;
        this.f18345b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: q */
    public int mo55093q() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        int i3 = (bArr[i] & 255) << Ascii.CAN;
        int i4 = i2 + 1;
        this.f18345b = i4;
        byte b = i3 | ((bArr[i2] & 255) << Ascii.DLE);
        int i5 = i4 + 1;
        this.f18345b = i5;
        byte b2 = b | ((bArr[i4] & 255) << 8);
        this.f18345b = i5 + 1;
        return (bArr[i5] & 255) | b2;
    }

    /* renamed from: r */
    public int mo55094r() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        int i3 = i2 + 1;
        this.f18345b = i3;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f18345b = i4;
        byte b2 = b | ((bArr[i3] & 255) << Ascii.DLE);
        this.f18345b = i4 + 1;
        return ((bArr[i4] & 255) << Ascii.CAN) | b2;
    }

    /* renamed from: s */
    public long mo55095s() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        int i3 = i2 + 1;
        this.f18345b = i3;
        int i4 = i3 + 1;
        this.f18345b = i4;
        int i5 = i4 + 1;
        this.f18345b = i5;
        int i6 = i5 + 1;
        this.f18345b = i6;
        int i7 = i6 + 1;
        this.f18345b = i7;
        int i8 = i7 + 1;
        this.f18345b = i8;
        this.f18345b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: t */
    public long mo55096t() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        int i3 = i2 + 1;
        this.f18345b = i3;
        int i4 = i3 + 1;
        this.f18345b = i4;
        int i5 = i4 + 1;
        this.f18345b = i5;
        int i6 = i5 + 1;
        this.f18345b = i6;
        int i7 = i6 + 1;
        this.f18345b = i7;
        int i8 = i7 + 1;
        this.f18345b = i8;
        this.f18345b = i8 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: u */
    public int mo55097u() {
        byte[] bArr = this.f18344a;
        int i = this.f18345b;
        int i2 = i + 1;
        this.f18345b = i2;
        int i3 = i2 + 1;
        this.f18345b = i3;
        byte b = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f18345b = i3 + 2;
        return b;
    }

    /* renamed from: v */
    public int mo55098v() {
        return (mo55084h() << 21) | (mo55084h() << 14) | (mo55084h() << 7) | mo55084h();
    }

    /* renamed from: w */
    public int mo55099w() {
        int q = mo55093q();
        if (q >= 0) {
            return q;
        }
        throw new IllegalStateException("Top bit not zero: " + q);
    }

    /* renamed from: x */
    public int mo55100x() {
        int r = mo55094r();
        if (r >= 0) {
            return r;
        }
        throw new IllegalStateException("Top bit not zero: " + r);
    }

    /* renamed from: y */
    public long mo55101y() {
        long s = mo55095s();
        if (s >= 0) {
            return s;
        }
        throw new IllegalStateException("Top bit not zero: " + s);
    }

    /* renamed from: z */
    public float mo55102z() {
        return Float.intBitsToFloat(mo55093q());
    }
}
