package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.p221l.C7717a;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.e.i.r */
final class C7317r {

    /* renamed from: a */
    public byte[] f16645a;

    /* renamed from: b */
    public int f16646b;

    /* renamed from: c */
    private final int f16647c;

    /* renamed from: d */
    private boolean f16648d;

    /* renamed from: e */
    private boolean f16649e;

    public C7317r(int i, int i2) {
        this.f16647c = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f16645a = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void mo54060a() {
        this.f16648d = false;
        this.f16649e = false;
    }

    /* renamed from: a */
    public void mo54061a(int i) {
        boolean z = true;
        C7717a.m22121b(!this.f16648d);
        if (i != this.f16647c) {
            z = false;
        }
        this.f16648d = z;
        if (z) {
            this.f16646b = 3;
            this.f16649e = false;
        }
    }

    /* renamed from: a */
    public void mo54062a(byte[] bArr, int i, int i2) {
        if (this.f16648d) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f16645a;
            int length = bArr2.length;
            int i4 = this.f16646b;
            if (length < i4 + i3) {
                this.f16645a = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f16645a, this.f16646b, i3);
            this.f16646b += i3;
        }
    }

    /* renamed from: b */
    public boolean mo54063b() {
        return this.f16649e;
    }

    /* renamed from: b */
    public boolean mo54064b(int i) {
        if (!this.f16648d) {
            return false;
        }
        this.f16646b -= i;
        this.f16648d = false;
        this.f16649e = true;
        return true;
    }
}
