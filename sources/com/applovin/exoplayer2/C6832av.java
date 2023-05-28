package com.applovin.exoplayer2;

import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.av */
public final class C6832av {

    /* renamed from: a */
    public static final C6832av f14875a = new C6832av(0, 0);

    /* renamed from: b */
    public static final C6832av f14876b = new C6832av(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: c */
    public static final C6832av f14877c = new C6832av(Long.MAX_VALUE, 0);

    /* renamed from: d */
    public static final C6832av f14878d = new C6832av(0, Long.MAX_VALUE);

    /* renamed from: e */
    public static final C6832av f14879e = f14875a;

    /* renamed from: f */
    public final long f14880f;

    /* renamed from: g */
    public final long f14881g;

    public C6832av(long j, long j2) {
        boolean z = true;
        C7717a.m22118a(j >= 0);
        C7717a.m22118a(j2 < 0 ? false : z);
        this.f14880f = j;
        this.f14881g = j2;
    }

    /* renamed from: a */
    public long mo52857a(long j, long j2, long j3) {
        if (this.f14880f == 0 && this.f14881g == 0) {
            return j;
        }
        long j4 = j;
        long c = C7728ai.m22246c(j4, this.f14880f, Long.MIN_VALUE);
        long b = C7728ai.m22233b(j4, this.f14881g, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = c <= j2 && j2 <= b;
        if (c > j3 || j3 > b) {
            z = false;
        }
        return (!z2 || !z) ? z2 ? j2 : z ? j3 : c : Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6832av avVar = (C6832av) obj;
        return this.f14880f == avVar.f14880f && this.f14881g == avVar.f14881g;
    }

    public int hashCode() {
        return (((int) this.f14880f) * 31) + ((int) this.f14881g);
    }
}
