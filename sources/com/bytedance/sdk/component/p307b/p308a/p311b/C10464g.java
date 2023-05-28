package com.bytedance.sdk.component.p307b.p308a.p311b;

import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.b.a.b.g */
/* compiled from: SegmentedByteString */
final class C10464g extends C10461d {

    /* renamed from: g */
    final transient byte[][] f26085g;

    /* renamed from: h */
    final transient int[] f26086h;

    C10464g(C10458a aVar, int i) {
        super((byte[]) null);
        C10466i.m30525a(aVar.f26069b, 0, (long) i);
        C10462e eVar = aVar.f26068a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (eVar.f26078c != eVar.f26077b) {
                i3 += eVar.f26078c - eVar.f26077b;
                i4++;
                eVar = eVar.f26081f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f26085g = new byte[i4][];
        this.f26086h = new int[(i4 * 2)];
        C10462e eVar2 = aVar.f26068a;
        int i5 = 0;
        while (i2 < i) {
            this.f26085g[i5] = eVar2.f26076a;
            i2 += eVar2.f26078c - eVar2.f26077b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f26086h;
            iArr[i5] = i2;
            iArr[this.f26085g.length + i5] = eVar2.f26077b;
            eVar2.f26079d = true;
            i5++;
            eVar2 = eVar2.f26081f;
        }
    }

    /* renamed from: a */
    public String mo63932a() {
        return m30510e().mo63932a();
    }

    /* renamed from: b */
    public String mo63935b() {
        return m30510e().mo63935b();
    }

    /* renamed from: a */
    public C10461d mo63931a(int i, int i2) {
        return m30510e().mo63931a(i, i2);
    }

    /* renamed from: a */
    public byte mo63929a(int i) {
        int i2;
        C10466i.m30525a((long) this.f26086h[this.f26085g.length - 1], (long) i, 1);
        int b = m30509b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.f26086h[b - 1];
        }
        int[] iArr = this.f26086h;
        byte[][] bArr = this.f26085g;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* renamed from: b */
    private int m30509b(int i) {
        int binarySearch = Arrays.binarySearch(this.f26086h, 0, this.f26085g.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: c */
    public int mo63936c() {
        return this.f26086h[this.f26085g.length - 1];
    }

    /* renamed from: d */
    public byte[] mo63938d() {
        int[] iArr = this.f26086h;
        byte[][] bArr = this.f26085g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f26086h;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f26085g[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: a */
    public boolean mo63933a(int i, C10461d dVar, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo63936c() - i3) {
            return false;
        }
        int b = m30509b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f26086h[b - 1];
            }
            int min = Math.min(i3, ((this.f26086h[b] - i4) + i4) - i);
            int[] iArr = this.f26086h;
            byte[][] bArr = this.f26085g;
            if (!dVar.mo63934a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo63934a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo63936c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m30509b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f26086h[b - 1];
            }
            int min = Math.min(i3, ((this.f26086h[b] - i4) + i4) - i);
            int[] iArr = this.f26086h;
            byte[][] bArr2 = this.f26085g;
            if (!C10466i.m30527a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: e */
    private C10461d m30510e() {
        return new C10461d(mo63938d());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10461d) {
            C10461d dVar = (C10461d) obj;
            if (dVar.mo63936c() != mo63936c() || !mo63933a(0, dVar, 0, mo63936c())) {
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
        int length = this.f26085g.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f26085g[i2];
            int[] iArr = this.f26086h;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f26074e = i4;
        return i4;
    }

    public String toString() {
        return m30510e().toString();
    }
}
