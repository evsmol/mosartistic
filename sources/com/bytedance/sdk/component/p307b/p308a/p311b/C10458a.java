package com.bytedance.sdk.component.p307b.p308a.p311b;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.b.a.b.a */
/* compiled from: Buffer */
public final class C10458a implements C10459b, C10460c, Cloneable, ByteChannel {

    /* renamed from: c */
    private static final byte[] f26067c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    C10462e f26068a;

    /* renamed from: b */
    long f26069b;

    public void close() {
    }

    public void flush() {
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: a */
    public boolean mo63909a() {
        return this.f26069b == 0;
    }

    /* renamed from: b */
    public byte mo63911b() {
        if (this.f26069b != 0) {
            C10462e eVar = this.f26068a;
            int i = eVar.f26077b;
            int i2 = eVar.f26078c;
            int i3 = i + 1;
            byte b = eVar.f26076a[i];
            this.f26069b--;
            if (i3 == i2) {
                this.f26068a = eVar.mo63944b();
                C10463f.m30508a(eVar);
            } else {
                eVar.f26077b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: c */
    public String mo63916c() {
        try {
            return mo63907a(this.f26069b, C10466i.f26087a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public String mo63907a(long j, Charset charset) throws EOFException {
        C10466i.m30525a(this.f26069b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            C10462e eVar = this.f26068a;
            if (((long) eVar.f26077b) + j > ((long) eVar.f26078c)) {
                return new String(mo63910a(j), charset);
            }
            String str = new String(eVar.f26076a, eVar.f26077b, (int) j, charset);
            eVar.f26077b = (int) (((long) eVar.f26077b) + j);
            this.f26069b -= j;
            if (eVar.f26077b == eVar.f26078c) {
                this.f26068a = eVar.mo63944b();
                C10463f.m30508a(eVar);
            }
            return str;
        }
    }

    /* renamed from: a */
    public byte[] mo63910a(long j) throws EOFException {
        C10466i.m30525a(this.f26069b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            mo63908a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    /* renamed from: a */
    public void mo63908a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a = mo63902a(bArr, i, bArr.length - i);
            if (a != -1) {
                i += a;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    public int mo63902a(byte[] bArr, int i, int i2) {
        C10466i.m30525a((long) bArr.length, (long) i, (long) i2);
        C10462e eVar = this.f26068a;
        if (eVar == null) {
            return -1;
        }
        int min = Math.min(i2, eVar.f26078c - eVar.f26077b);
        System.arraycopy(eVar.f26076a, eVar.f26077b, bArr, i, min);
        eVar.f26077b += min;
        this.f26069b -= (long) min;
        if (eVar.f26077b == eVar.f26078c) {
            this.f26068a = eVar.mo63944b();
            C10463f.m30508a(eVar);
        }
        return min;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C10462e eVar = this.f26068a;
        if (eVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), eVar.f26078c - eVar.f26077b);
        byteBuffer.put(eVar.f26076a, eVar.f26077b, min);
        eVar.f26077b += min;
        this.f26069b -= (long) min;
        if (eVar.f26077b == eVar.f26078c) {
            this.f26068a = eVar.mo63944b();
            C10463f.m30508a(eVar);
        }
        return min;
    }

    /* renamed from: a */
    public C10458a mo63904a(String str) {
        return mo63905a(str, 0, str.length());
    }

    /* renamed from: a */
    public C10458a mo63905a(String str, int i, int i2) {
        char c;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C10462e c2 = mo63915c(1);
                    byte[] bArr = c2.f26076a;
                    int i3 = c2.f26078c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = (i3 + i4) - c2.f26078c;
                    c2.f26078c += i5;
                    this.f26069b += (long) i5;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        mo63912b((charAt >> 6) | 192);
                        mo63912b((int) (charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        mo63912b((charAt >> 12) | 224);
                        mo63912b(((charAt >> 6) & 63) | 128);
                        mo63912b((int) (charAt & '?') | 128);
                    } else {
                        int i6 = i + 1;
                        if (i6 < i2) {
                            c = str.charAt(i6);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || c < 56320 || c > 57343) {
                            mo63912b(63);
                            i = i6;
                        } else {
                            int i7 = (((charAt & 10239) << 10) | (9215 & c)) + Ascii.MIN;
                            mo63912b((i7 >> 18) | 240);
                            mo63912b(((i7 >> 12) & 63) | 128);
                            mo63912b(((i7 >> 6) & 63) | 128);
                            mo63912b((i7 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    /* renamed from: a */
    public C10458a mo63903a(int i) {
        if (i < 128) {
            mo63912b(i);
        } else if (i < 2048) {
            mo63912b((i >> 6) | 192);
            mo63912b((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                mo63912b((i >> 12) | 224);
                mo63912b(((i >> 6) & 63) | 128);
                mo63912b((i & 63) | 128);
            } else {
                mo63912b(63);
            }
        } else if (i <= 1114111) {
            mo63912b((i >> 18) | 240);
            mo63912b(((i >> 12) & 63) | 128);
            mo63912b(((i >> 6) & 63) | 128);
            mo63912b((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    /* renamed from: a */
    public C10458a mo63906a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C10466i.f26087a)) {
            return mo63905a(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return mo63914b(bytes, 0, bytes.length);
        }
    }

    /* renamed from: b */
    public C10458a mo63914b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C10466i.m30525a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C10462e c = mo63915c(1);
                int min = Math.min(i3 - i, 8192 - c.f26078c);
                System.arraycopy(bArr, i, c.f26076a, c.f26078c, min);
                i += min;
                c.f26078c += min;
            }
            this.f26069b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C10462e c = mo63915c(1);
                int min = Math.min(i, 8192 - c.f26078c);
                byteBuffer.get(c.f26076a, c.f26078c, min);
                i -= min;
                c.f26078c += min;
            }
            this.f26069b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public C10458a mo63912b(int i) {
        C10462e c = mo63915c(1);
        byte[] bArr = c.f26076a;
        int i2 = c.f26078c;
        c.f26078c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f26069b++;
        return this;
    }

    /* renamed from: b */
    public C10458a mo63913b(long j) {
        if (j == 0) {
            return mo63912b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C10462e c = mo63915c(numberOfTrailingZeros);
        byte[] bArr = c.f26076a;
        int i = c.f26078c;
        for (int i2 = (c.f26078c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f26067c[(int) (15 & j)];
            j >>>= 4;
        }
        c.f26078c += numberOfTrailingZeros;
        this.f26069b += (long) numberOfTrailingZeros;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10462e mo63915c(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C10462e eVar = this.f26068a;
        if (eVar == null) {
            C10462e a = C10463f.m30507a();
            this.f26068a = a;
            a.f26082g = a;
            a.f26081f = a;
            return a;
        }
        C10462e eVar2 = eVar.f26082g;
        return (eVar2.f26078c + i > 8192 || !eVar2.f26080e) ? eVar2.mo63943a(C10463f.m30507a()) : eVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10458a)) {
            return false;
        }
        C10458a aVar = (C10458a) obj;
        long j = this.f26069b;
        if (j != aVar.f26069b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C10462e eVar = this.f26068a;
        C10462e eVar2 = aVar.f26068a;
        int i = eVar.f26077b;
        int i2 = eVar2.f26077b;
        while (j2 < this.f26069b) {
            long min = (long) Math.min(eVar.f26078c - i, eVar2.f26078c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (eVar.f26076a[i] != eVar2.f26076a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == eVar.f26078c) {
                eVar = eVar.f26081f;
                i = eVar.f26077b;
            }
            if (i2 == eVar2.f26078c) {
                eVar2 = eVar2.f26081f;
                i2 = eVar2.f26077b;
            }
            j2 += min;
        }
        return true;
    }

    public int hashCode() {
        C10462e eVar = this.f26068a;
        if (eVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = eVar.f26078c;
            for (int i3 = eVar.f26077b; i3 < i2; i3++) {
                i = (i * 31) + eVar.f26076a[i3];
            }
            eVar = eVar.f26081f;
        } while (eVar != this.f26068a);
        return i;
    }

    public String toString() {
        return mo63921e().toString();
    }

    /* renamed from: d */
    public C10458a clone() {
        C10458a aVar = new C10458a();
        if (this.f26069b == 0) {
            return aVar;
        }
        C10462e a = this.f26068a.mo63942a();
        aVar.f26068a = a;
        a.f26082g = a;
        a.f26081f = a;
        C10462e eVar = this.f26068a;
        while (true) {
            eVar = eVar.f26081f;
            if (eVar != this.f26068a) {
                aVar.f26068a.f26082g.mo63943a(eVar.mo63942a());
            } else {
                aVar.f26069b = this.f26069b;
                return aVar;
            }
        }
    }

    /* renamed from: e */
    public final C10461d mo63921e() {
        long j = this.f26069b;
        if (j <= 2147483647L) {
            return mo63920d((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f26069b);
    }

    /* renamed from: d */
    public final C10461d mo63920d(int i) {
        if (i == 0) {
            return C10461d.f26072c;
        }
        return new C10464g(this, i);
    }
}
