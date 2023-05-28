package com.applovin.exoplayer2.p186e.p196j;

import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7356w;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.e.j.d */
final class C7338d implements C7353v {

    /* renamed from: a */
    private final C7335b f16741a;

    /* renamed from: b */
    private final int f16742b;

    /* renamed from: c */
    private final long f16743c;

    /* renamed from: d */
    private final long f16744d;

    /* renamed from: e */
    private final long f16745e;

    public C7338d(C7335b bVar, int i, long j, long j2) {
        this.f16741a = bVar;
        this.f16742b = i;
        this.f16743c = j;
        long j3 = (j2 - j) / ((long) bVar.f16736e);
        this.f16744d = j3;
        this.f16745e = m20215b(j3);
    }

    /* renamed from: b */
    private long m20215b(long j) {
        return C7728ai.m22252d(j * ((long) this.f16742b), 1000000, (long) this.f16741a.f16734c);
    }

    /* renamed from: a */
    public C7353v.C7354a mo53869a(long j) {
        long a = C7728ai.m22192a((((long) this.f16741a.f16734c) * j) / (((long) this.f16742b) * 1000000), 0, this.f16744d - 1);
        long j2 = this.f16743c + (((long) this.f16741a.f16736e) * a);
        long b = m20215b(a);
        C7356w wVar = new C7356w(b, j2);
        if (b >= j || a == this.f16744d - 1) {
            return new C7353v.C7354a(wVar);
        }
        long j3 = a + 1;
        return new C7353v.C7354a(wVar, new C7356w(m20215b(j3), this.f16743c + (((long) this.f16741a.f16736e) * j3)));
    }

    /* renamed from: a */
    public boolean mo53870a() {
        return true;
    }

    /* renamed from: b */
    public long mo53871b() {
        return this.f16745e;
    }
}
