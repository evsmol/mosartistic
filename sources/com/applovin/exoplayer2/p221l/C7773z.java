package com.applovin.exoplayer2.p221l;

/* renamed from: com.applovin.exoplayer2.l.z */
public final class C7773z {

    /* renamed from: a */
    private byte[] f18347a;

    /* renamed from: b */
    private int f18348b;

    /* renamed from: c */
    private int f18349c;

    /* renamed from: d */
    private int f18350d;

    public C7773z(byte[] bArr, int i, int i2) {
        mo55105a(bArr, i, i2);
    }

    /* renamed from: d */
    private boolean m22474d(int i) {
        if (2 <= i && i < this.f18348b) {
            byte[] bArr = this.f18347a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    /* renamed from: f */
    private int m22475f() {
        int i = 0;
        int i2 = 0;
        while (!mo55106b()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo55108c(i2);
        }
        return i3 + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f18348b;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22476g() {
        /*
            r2 = this;
            int r0 = r2.f18349c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f18348b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f18350d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p221l.C7773z.m22476g():void");
    }

    /* renamed from: a */
    public void mo55103a() {
        int i = 1;
        int i2 = this.f18350d + 1;
        this.f18350d = i2;
        if (i2 == 8) {
            this.f18350d = 0;
            int i3 = this.f18349c;
            if (m22474d(i3 + 1)) {
                i = 2;
            }
            this.f18349c = i3 + i;
        }
        m22476g();
    }

    /* renamed from: a */
    public void mo55104a(int i) {
        int i2 = this.f18349c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f18349c = i4;
        int i5 = this.f18350d + (i - (i3 * 8));
        this.f18350d = i5;
        if (i5 > 7) {
            this.f18349c = i4 + 1;
            this.f18350d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f18349c) {
                m22476g();
                return;
            } else if (m22474d(i2)) {
                this.f18349c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: a */
    public void mo55105a(byte[] bArr, int i, int i2) {
        this.f18347a = bArr;
        this.f18349c = i;
        this.f18348b = i2;
        this.f18350d = 0;
        m22476g();
    }

    /* renamed from: b */
    public boolean mo55106b() {
        boolean z = (this.f18347a[this.f18349c] & (128 >> this.f18350d)) != 0;
        mo55103a();
        return z;
    }

    /* renamed from: b */
    public boolean mo55107b(int i) {
        int i2 = this.f18349c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f18350d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f18348b) {
                int i6 = this.f18348b;
            } else if (m22474d(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f18348b;
        if (i4 >= i62) {
            return i4 == i62 && i5 == 0;
        }
        return true;
    }

    /* renamed from: c */
    public int mo55108c(int i) {
        int i2;
        int i3;
        this.f18350d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f18350d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f18350d = i5;
            byte[] bArr = this.f18347a;
            int i6 = this.f18349c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m22474d(i6 + 1)) {
                i3 = 1;
            }
            this.f18349c = i6 + i3;
        }
        byte[] bArr2 = this.f18347a;
        int i7 = this.f18349c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f18350d = 0;
            if (!m22474d(i7 + 1)) {
                i3 = 1;
            }
            this.f18349c = i7 + i3;
        }
        m22476g();
        return i8;
    }

    /* renamed from: c */
    public boolean mo55109c() {
        int i = this.f18349c;
        int i2 = this.f18350d;
        int i3 = 0;
        while (this.f18349c < this.f18348b && !mo55106b()) {
            i3++;
        }
        boolean z = this.f18349c == this.f18348b;
        this.f18349c = i;
        this.f18350d = i2;
        return !z && mo55107b((i3 * 2) + 1);
    }

    /* renamed from: d */
    public int mo55110d() {
        return m22475f();
    }

    /* renamed from: e */
    public int mo55111e() {
        int f = m22475f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }
}
