package com.bytedance.sdk.component.p307b.p308a.p311b;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.b.a.b.d */
/* compiled from: ByteString */
public class C10461d implements Serializable, Comparable<C10461d> {

    /* renamed from: a */
    static final char[] f26070a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final Charset f26071b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final C10461d f26072c = m30494a(new byte[0]);

    /* renamed from: d */
    final byte[] f26073d;

    /* renamed from: e */
    transient int f26074e;

    /* renamed from: f */
    transient String f26075f;

    C10461d(byte[] bArr) {
        this.f26073d = bArr;
    }

    /* renamed from: a */
    public static C10461d m30494a(byte... bArr) {
        if (bArr != null) {
            return new C10461d((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: a */
    public String mo63932a() {
        String str = this.f26075f;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f26073d, f26071b);
        this.f26075f = str2;
        return str2;
    }

    /* renamed from: b */
    public String mo63935b() {
        byte[] bArr = this.f26073d;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f26070a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.f15551SI];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public C10461d mo63931a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f26073d;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f26073d, i, bArr2, 0, i3);
                    return new C10461d(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f26073d.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: a */
    public byte mo63929a(int i) {
        return this.f26073d[i];
    }

    /* renamed from: c */
    public int mo63936c() {
        return this.f26073d.length;
    }

    /* renamed from: d */
    public byte[] mo63938d() {
        return (byte[]) this.f26073d.clone();
    }

    /* renamed from: a */
    public boolean mo63933a(int i, C10461d dVar, int i2, int i3) {
        return dVar.mo63934a(i2, this.f26073d, i, i3);
    }

    /* renamed from: a */
    public boolean mo63934a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f26073d;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C10466i.m30527a(bArr2, i, bArr, i2, i3);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10461d) {
            C10461d dVar = (C10461d) obj;
            int c = dVar.mo63936c();
            byte[] bArr = this.f26073d;
            if (c != bArr.length || !dVar.mo63934a(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f26074e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f26073d);
        this.f26074e = hashCode;
        return hashCode;
    }

    /* renamed from: a */
    public int compareTo(C10461d dVar) {
        int c = mo63936c();
        int c2 = dVar.mo63936c();
        int min = Math.min(c, c2);
        int i = 0;
        while (i < min) {
            byte a = mo63929a(i) & 255;
            byte a2 = dVar.mo63929a(i) & 255;
            if (a == a2) {
                i++;
            } else if (a < a2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (c == c2) {
            return 0;
        }
        if (c < c2) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f26073d.length == 0) {
            return "[size=0]";
        }
        String a = mo63932a();
        int a2 = m30493a(a, 64);
        if (a2 != -1) {
            String replace = a.substring(0, a2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (a2 < a.length()) {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(this.f26073d.length);
                sb.append(" text=");
                sb.append(replace);
                sb.append("…]");
            } else {
                sb = new StringBuilder();
                sb.append("[text=");
                sb.append(replace);
                sb.append("]");
            }
            return sb.toString();
        } else if (this.f26073d.length <= 64) {
            return "[hex=" + mo63935b() + "]";
        } else {
            return "[size=" + this.f26073d.length + " hex=" + mo63931a(0, 64).mo63935b() + "…]";
        }
    }

    /* renamed from: a */
    static int m30493a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
