package com.applovin.exoplayer2.p221l;

import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.l.x */
public final class C7771x {

    /* renamed from: a */
    public byte[] f18340a;

    /* renamed from: b */
    private int f18341b;

    /* renamed from: c */
    private int f18342c;

    /* renamed from: d */
    private int f18343d;

    public C7771x() {
        this.f18340a = C7728ai.f18254f;
    }

    public C7771x(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C7771x(byte[] bArr, int i) {
        this.f18340a = bArr;
        this.f18343d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f18343d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22412g() {
        /*
            r2 = this;
            int r0 = r2.f18341b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f18343d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f18342c
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p221l.C7771x.m22412g():void");
    }

    /* renamed from: a */
    public int mo55042a() {
        return ((this.f18343d - this.f18341b) * 8) - this.f18342c;
    }

    /* renamed from: a */
    public String mo55043a(int i, Charset charset) {
        byte[] bArr = new byte[i];
        mo55052b(bArr, 0, i);
        return new String(bArr, charset);
    }

    /* renamed from: a */
    public void mo55044a(int i) {
        int i2 = i / 8;
        this.f18341b = i2;
        this.f18342c = i - (i2 * 8);
        m22412g();
    }

    /* renamed from: a */
    public void mo55045a(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f18342c, i2);
        int i3 = this.f18342c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f18340a;
        int i5 = this.f18341b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f18340a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f18340a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        mo55051b(i2);
        m22412g();
    }

    /* renamed from: a */
    public void mo55046a(C7772y yVar) {
        mo55048a(yVar.mo55077d(), yVar.mo55072b());
        mo55044a(yVar.mo55074c() * 8);
    }

    /* renamed from: a */
    public void mo55047a(byte[] bArr) {
        mo55048a(bArr, bArr.length);
    }

    /* renamed from: a */
    public void mo55048a(byte[] bArr, int i) {
        this.f18340a = bArr;
        this.f18341b = 0;
        this.f18342c = 0;
        this.f18343d = i;
    }

    /* renamed from: a */
    public void mo55049a(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f18340a;
            int i4 = this.f18341b;
            int i5 = i4 + 1;
            this.f18341b = i5;
            byte b = bArr2[i4];
            int i6 = this.f18342c;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (KotlinVersion.MAX_COMPONENT_VALUE >> i7));
            int i8 = this.f18342c;
            if (i8 + i7 > 8) {
                byte b2 = bArr[i3];
                byte[] bArr3 = this.f18340a;
                int i9 = this.f18341b;
                this.f18341b = i9 + 1;
                bArr[i3] = (byte) (b2 | ((bArr3[i9] & 255) << i8));
                this.f18342c = i8 - 8;
            }
            int i10 = this.f18342c + i7;
            this.f18342c = i10;
            byte[] bArr4 = this.f18340a;
            int i11 = this.f18341b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.f18342c = 0;
                this.f18341b = i11 + 1;
            }
            m22412g();
        }
    }

    /* renamed from: b */
    public int mo55050b() {
        return (this.f18341b * 8) + this.f18342c;
    }

    /* renamed from: b */
    public void mo55051b(int i) {
        int i2 = i / 8;
        int i3 = this.f18341b + i2;
        this.f18341b = i3;
        int i4 = this.f18342c + (i - (i2 * 8));
        this.f18342c = i4;
        if (i4 > 7) {
            this.f18341b = i3 + 1;
            this.f18342c = i4 - 8;
        }
        m22412g();
    }

    /* renamed from: b */
    public void mo55052b(byte[] bArr, int i, int i2) {
        C7717a.m22121b(this.f18342c == 0);
        System.arraycopy(this.f18340a, this.f18341b, bArr, i, i2);
        this.f18341b += i2;
        m22412g();
    }

    /* renamed from: c */
    public int mo55053c() {
        C7717a.m22121b(this.f18342c == 0);
        return this.f18341b;
    }

    /* renamed from: c */
    public int mo55054c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f18342c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f18342c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f18342c = i4;
            byte[] bArr = this.f18340a;
            int i5 = this.f18341b;
            this.f18341b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f18340a;
        int i6 = this.f18341b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f18342c = 0;
            this.f18341b = i6 + 1;
        }
        m22412g();
        return i7;
    }

    /* renamed from: d */
    public long mo55055d(int i) {
        return i <= 32 ? C7728ai.m22229b(mo55054c(i)) : C7728ai.m22230b(mo55054c(i - 32), mo55054c(32));
    }

    /* renamed from: d */
    public void mo55056d() {
        int i = this.f18342c + 1;
        this.f18342c = i;
        if (i == 8) {
            this.f18342c = 0;
            this.f18341b++;
        }
        m22412g();
    }

    /* renamed from: e */
    public void mo55057e(int i) {
        C7717a.m22121b(this.f18342c == 0);
        this.f18341b += i;
        m22412g();
    }

    /* renamed from: e */
    public boolean mo55058e() {
        boolean z = (this.f18340a[this.f18341b] & (128 >> this.f18342c)) != 0;
        mo55056d();
        return z;
    }

    /* renamed from: f */
    public void mo55059f() {
        if (this.f18342c != 0) {
            this.f18342c = 0;
            this.f18341b++;
            m22412g();
        }
    }
}
