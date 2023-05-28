package com.applovin.exoplayer2.p220k;

import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.k.m */
public final class C7677m implements C7657b {

    /* renamed from: a */
    private final boolean f18078a;

    /* renamed from: b */
    private final int f18079b;

    /* renamed from: c */
    private final byte[] f18080c;

    /* renamed from: d */
    private final C7653a[] f18081d;

    /* renamed from: e */
    private int f18082e;

    /* renamed from: f */
    private int f18083f;

    /* renamed from: g */
    private int f18084g;

    /* renamed from: h */
    private C7653a[] f18085h;

    public C7677m(boolean z, int i) {
        this(z, i, 0);
    }

    public C7677m(boolean z, int i, int i2) {
        C7717a.m22118a(i > 0);
        C7717a.m22118a(i2 >= 0);
        this.f18078a = z;
        this.f18079b = i;
        this.f18084g = i2;
        this.f18085h = new C7653a[(i2 + 100)];
        if (i2 > 0) {
            this.f18080c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f18085h[i3] = new C7653a(this.f18080c, i3 * i);
            }
        } else {
            this.f18080c = null;
        }
        this.f18081d = new C7653a[1];
    }

    /* renamed from: a */
    public synchronized C7653a mo54885a() {
        C7653a aVar;
        this.f18083f++;
        if (this.f18084g > 0) {
            C7653a[] aVarArr = this.f18085h;
            int i = this.f18084g - 1;
            this.f18084g = i;
            aVar = (C7653a) C7717a.m22120b(aVarArr[i]);
            this.f18085h[this.f18084g] = null;
        } else {
            aVar = new C7653a(new byte[this.f18079b], 0);
        }
        return aVar;
    }

    /* renamed from: a */
    public synchronized void mo54919a(int i) {
        boolean z = i < this.f18082e;
        this.f18082e = i;
        if (z) {
            mo54888b();
        }
    }

    /* renamed from: a */
    public synchronized void mo54886a(C7653a aVar) {
        this.f18081d[0] = aVar;
        mo54887a(this.f18081d);
    }

    /* renamed from: a */
    public synchronized void mo54887a(C7653a[] aVarArr) {
        if (this.f18084g + aVarArr.length >= this.f18085h.length) {
            this.f18085h = (C7653a[]) Arrays.copyOf(this.f18085h, Math.max(this.f18085h.length * 2, this.f18084g + aVarArr.length));
        }
        for (C7653a aVar : aVarArr) {
            C7653a[] aVarArr2 = this.f18085h;
            int i = this.f18084g;
            this.f18084g = i + 1;
            aVarArr2[i] = aVar;
        }
        this.f18083f -= aVarArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void mo54888b() {
        int i = 0;
        int max = Math.max(0, C7728ai.m22179a(this.f18082e, this.f18079b) - this.f18083f);
        if (max < this.f18084g) {
            if (this.f18080c != null) {
                int i2 = this.f18084g - 1;
                while (i <= i2) {
                    C7653a aVar = (C7653a) C7717a.m22120b(this.f18085h[i]);
                    if (aVar.f18015a == this.f18080c) {
                        i++;
                    } else {
                        C7653a aVar2 = (C7653a) C7717a.m22120b(this.f18085h[i2]);
                        if (aVar2.f18015a != this.f18080c) {
                            i2--;
                        } else {
                            this.f18085h[i] = aVar2;
                            this.f18085h[i2] = aVar;
                            i2--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f18084g) {
                    return;
                }
            }
            Arrays.fill(this.f18085h, max, this.f18084g, (Object) null);
            this.f18084g = max;
        }
    }

    /* renamed from: c */
    public int mo54889c() {
        return this.f18079b;
    }

    /* renamed from: d */
    public synchronized void mo54920d() {
        if (this.f18078a) {
            mo54919a(0);
        }
    }

    /* renamed from: e */
    public synchronized int mo54921e() {
        return this.f18083f * this.f18079b;
    }
}
