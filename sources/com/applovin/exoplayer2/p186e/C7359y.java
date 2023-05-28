package com.applovin.exoplayer2.p186e;

import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.e.y */
public final class C7359y {

    /* renamed from: a */
    private final byte[] f16786a;

    /* renamed from: b */
    private final int f16787b;

    /* renamed from: c */
    private int f16788c;

    /* renamed from: d */
    private int f16789d;

    public C7359y(byte[] bArr) {
        this.f16786a = bArr;
        this.f16787b = bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f16787b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20296c() {
        /*
            r2 = this;
            int r0 = r2.f16788c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f16787b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f16789d
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.C7359y.m20296c():void");
    }

    /* renamed from: a */
    public int mo54096a(int i) {
        int i2 = this.f16788c;
        int min = Math.min(i, 8 - this.f16789d);
        int i3 = i2 + 1;
        int i4 = ((this.f16786a[i2] & 255) >> this.f16789d) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - min));
        while (min < i) {
            i4 |= (this.f16786a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo54099b(i);
        return i5;
    }

    /* renamed from: a */
    public boolean mo54097a() {
        boolean z = (((this.f16786a[this.f16788c] & 255) >> this.f16789d) & 1) == 1;
        mo54099b(1);
        return z;
    }

    /* renamed from: b */
    public int mo54098b() {
        return (this.f16788c * 8) + this.f16789d;
    }

    /* renamed from: b */
    public void mo54099b(int i) {
        int i2 = i / 8;
        int i3 = this.f16788c + i2;
        this.f16788c = i3;
        int i4 = this.f16789d + (i - (i2 * 8));
        this.f16789d = i4;
        if (i4 > 7) {
            this.f16788c = i3 + 1;
            this.f16789d = i4 - 8;
        }
        m20296c();
    }
}
