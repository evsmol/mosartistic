package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.p186e.C7353v;

/* renamed from: com.applovin.exoplayer2.e.d */
public class C7202d implements C7353v {

    /* renamed from: a */
    private final long f15874a;

    /* renamed from: b */
    private final long f15875b;

    /* renamed from: c */
    private final int f15876c;

    /* renamed from: d */
    private final long f15877d;

    /* renamed from: e */
    private final int f15878e;

    /* renamed from: f */
    private final long f15879f;

    /* renamed from: g */
    private final boolean f15880g;

    public C7202d(long j, long j2, int i, int i2, boolean z) {
        long j3;
        this.f15874a = j;
        this.f15875b = j2;
        this.f15876c = i2 == -1 ? 1 : i2;
        this.f15878e = i;
        this.f15880g = z;
        if (j == -1) {
            this.f15877d = -1;
            j3 = -9223372036854775807L;
        } else {
            this.f15877d = j - j2;
            j3 = m19402a(j, j2, i);
        }
        this.f15879f = j3;
    }

    /* renamed from: a */
    private static long m19402a(long j, long j2, int i) {
        return ((Math.max(0, j - j2) * 8) * 1000000) / ((long) i);
    }

    /* renamed from: c */
    private long mo53943c(long j) {
        int i = this.f15876c;
        long j2 = (((j * ((long) this.f15878e)) / 8000000) / ((long) i)) * ((long) i);
        long j3 = this.f15877d;
        if (j3 != -1) {
            j2 = Math.min(j2, j3 - ((long) i));
        }
        return this.f15875b + Math.max(j2, 0);
    }

    /* renamed from: a */
    public C7353v.C7354a mo53869a(long j) {
        if (this.f15877d == -1 && !this.f15880g) {
            return new C7353v.C7354a(new C7356w(0, this.f15875b));
        }
        long c = mo53943c(j);
        long b = mo53889b(c);
        C7356w wVar = new C7356w(b, c);
        if (this.f15877d != -1 && b < j) {
            int i = this.f15876c;
            if (((long) i) + c < this.f15874a) {
                long j2 = c + ((long) i);
                return new C7353v.C7354a(wVar, new C7356w(mo53889b(j2), j2));
            }
        }
        return new C7353v.C7354a(wVar);
    }

    /* renamed from: a */
    public boolean mo53870a() {
        return this.f15877d != -1 || this.f15880g;
    }

    /* renamed from: b */
    public long mo53871b() {
        return this.f15879f;
    }

    /* renamed from: b */
    public long mo53889b(long j) {
        return m19402a(j, this.f15875b, this.f15878e);
    }
}
