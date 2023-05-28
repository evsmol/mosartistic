package com.applovin.exoplayer2.p221l;

import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.l.af */
public final class C7725af<V> {

    /* renamed from: a */
    private long[] f18241a;

    /* renamed from: b */
    private V[] f18242b;

    /* renamed from: c */
    private int f18243c;

    /* renamed from: d */
    private int f18244d;

    public C7725af() {
        this(10);
    }

    public C7725af(int i) {
        this.f18241a = new long[i];
        this.f18242b = m22156a(i);
    }

    /* renamed from: a */
    private V m22155a(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.f18244d > 0) {
            long j3 = j - this.f18241a[this.f18243c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = m22159d();
            j2 = j3;
        }
        return v;
    }

    /* renamed from: a */
    private static <V> V[] m22156a(int i) {
        return new Object[i];
    }

    /* renamed from: b */
    private void m22157b(long j) {
        int i = this.f18244d;
        if (i > 0) {
            if (j <= this.f18241a[((this.f18243c + i) - 1) % this.f18242b.length]) {
                mo54982a();
            }
        }
    }

    /* renamed from: b */
    private void m22158b(long j, V v) {
        int i = this.f18243c;
        int i2 = this.f18244d;
        V[] vArr = this.f18242b;
        int length = (i + i2) % vArr.length;
        this.f18241a[length] = j;
        vArr[length] = v;
        this.f18244d = i2 + 1;
    }

    /* renamed from: d */
    private V m22159d() {
        C7717a.m22121b(this.f18244d > 0);
        V[] vArr = this.f18242b;
        int i = this.f18243c;
        V v = vArr[i];
        vArr[i] = null;
        this.f18243c = (i + 1) % vArr.length;
        this.f18244d--;
        return v;
    }

    /* renamed from: e */
    private void m22160e() {
        int length = this.f18242b.length;
        if (this.f18244d >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] a = m22156a(i);
            int i2 = this.f18243c;
            int i3 = length - i2;
            System.arraycopy(this.f18241a, i2, jArr, 0, i3);
            System.arraycopy(this.f18242b, this.f18243c, a, 0, i3);
            int i4 = this.f18243c;
            if (i4 > 0) {
                System.arraycopy(this.f18241a, 0, jArr, i3, i4);
                System.arraycopy(this.f18242b, 0, a, i3, this.f18243c);
            }
            this.f18241a = jArr;
            this.f18242b = a;
            this.f18243c = 0;
        }
    }

    /* renamed from: a */
    public synchronized V mo54981a(long j) {
        return m22155a(j, true);
    }

    /* renamed from: a */
    public synchronized void mo54982a() {
        this.f18243c = 0;
        this.f18244d = 0;
        Arrays.fill(this.f18242b, (Object) null);
    }

    /* renamed from: a */
    public synchronized void mo54983a(long j, V v) {
        m22157b(j);
        m22160e();
        m22158b(j, v);
    }

    /* renamed from: b */
    public synchronized int mo54984b() {
        return this.f18244d;
    }

    /* renamed from: c */
    public synchronized V mo54985c() {
        return this.f18244d == 0 ? null : m22159d();
    }
}
