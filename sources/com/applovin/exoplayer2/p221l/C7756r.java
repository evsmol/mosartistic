package com.applovin.exoplayer2.p221l;

import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.l.r */
public final class C7756r {

    /* renamed from: a */
    private int f18303a;

    /* renamed from: b */
    private long[] f18304b;

    public C7756r() {
        this(32);
    }

    public C7756r(int i) {
        this.f18304b = new long[i];
    }

    /* renamed from: a */
    public int mo55032a() {
        return this.f18303a;
    }

    /* renamed from: a */
    public long mo55033a(int i) {
        if (i >= 0 && i < this.f18303a) {
            return this.f18304b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f18303a);
    }

    /* renamed from: a */
    public void mo55034a(long j) {
        int i = this.f18303a;
        long[] jArr = this.f18304b;
        if (i == jArr.length) {
            this.f18304b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f18304b;
        int i2 = this.f18303a;
        this.f18303a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long[] mo55035b() {
        return Arrays.copyOf(this.f18304b, this.f18303a);
    }
}
