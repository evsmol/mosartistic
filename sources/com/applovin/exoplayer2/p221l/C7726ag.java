package com.applovin.exoplayer2.p221l;

/* renamed from: com.applovin.exoplayer2.l.ag */
public final class C7726ag {

    /* renamed from: a */
    private long f18245a;

    /* renamed from: b */
    private long f18246b;

    /* renamed from: c */
    private long f18247c;

    /* renamed from: d */
    private final ThreadLocal<Long> f18248d = new ThreadLocal<>();

    public C7726ag(long j) {
        mo54987a(j);
    }

    /* renamed from: d */
    public static long m22166d(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: e */
    public static long m22167e(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: a */
    public synchronized long mo54986a() {
        long j;
        if (this.f18245a != Long.MAX_VALUE) {
            if (this.f18245a != 9223372036854775806L) {
                j = this.f18245a;
            }
        }
        j = -9223372036854775807L;
        return j;
    }

    /* renamed from: a */
    public synchronized void mo54987a(long j) {
        this.f18245a = j;
        this.f18246b = j == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.f18247c = -9223372036854775807L;
    }

    /* renamed from: b */
    public synchronized long mo54988b() {
        return this.f18247c != -9223372036854775807L ? this.f18247c + this.f18246b : mo54986a();
    }

    /* renamed from: b */
    public synchronized long mo54989b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f18247c != -9223372036854775807L) {
            long e = m22167e(this.f18247c);
            long j2 = (4294967296L + e) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - e) < Math.abs(j - e)) {
                j = j3;
            }
        }
        return mo54991c(m22166d(j));
    }

    /* renamed from: c */
    public synchronized long mo54990c() {
        return this.f18246b;
    }

    /* renamed from: c */
    public synchronized long mo54991c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f18246b == -9223372036854775807L) {
            this.f18246b = (this.f18245a == 9223372036854775806L ? ((Long) C7717a.m22120b(this.f18248d.get())).longValue() : this.f18245a) - j;
            notifyAll();
        }
        this.f18247c = j;
        return j + this.f18246b;
    }
}
