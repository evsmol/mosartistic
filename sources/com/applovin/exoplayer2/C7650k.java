package com.applovin.exoplayer2;

import android.os.SystemClock;
import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.common.p184b.C7058d;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.k */
public final class C7650k implements C7870z {

    /* renamed from: a */
    private final float f17989a;

    /* renamed from: b */
    private final float f17990b;

    /* renamed from: c */
    private final long f17991c;

    /* renamed from: d */
    private final float f17992d;

    /* renamed from: e */
    private final long f17993e;

    /* renamed from: f */
    private final long f17994f;

    /* renamed from: g */
    private final float f17995g;

    /* renamed from: h */
    private long f17996h;

    /* renamed from: i */
    private long f17997i;

    /* renamed from: j */
    private long f17998j;

    /* renamed from: k */
    private long f17999k;

    /* renamed from: l */
    private long f18000l;

    /* renamed from: m */
    private long f18001m;

    /* renamed from: n */
    private float f18002n;

    /* renamed from: o */
    private float f18003o;

    /* renamed from: p */
    private float f18004p;

    /* renamed from: q */
    private long f18005q;

    /* renamed from: r */
    private long f18006r;

    /* renamed from: s */
    private long f18007s;

    /* renamed from: com.applovin.exoplayer2.k$a */
    public static final class C7652a {

        /* renamed from: a */
        private float f18008a = 0.97f;

        /* renamed from: b */
        private float f18009b = 1.03f;

        /* renamed from: c */
        private long f18010c = 1000;

        /* renamed from: d */
        private float f18011d = 1.0E-7f;

        /* renamed from: e */
        private long f18012e = C7476h.m20800b(20);

        /* renamed from: f */
        private long f18013f = C7476h.m20800b(500);

        /* renamed from: g */
        private float f18014g = 0.999f;

        /* renamed from: a */
        public C7650k mo54876a() {
            return new C7650k(this.f18008a, this.f18009b, this.f18010c, this.f18011d, this.f18012e, this.f18013f, this.f18014g);
        }
    }

    private C7650k(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f17989a = f;
        this.f17990b = f2;
        this.f17991c = j;
        this.f17992d = f3;
        this.f17993e = j2;
        this.f17994f = j3;
        this.f17995g = f4;
        this.f17996h = -9223372036854775807L;
        this.f17997i = -9223372036854775807L;
        this.f17999k = -9223372036854775807L;
        this.f18000l = -9223372036854775807L;
        this.f18003o = f;
        this.f18002n = f2;
        this.f18004p = 1.0f;
        this.f18005q = -9223372036854775807L;
        this.f17998j = -9223372036854775807L;
        this.f18001m = -9223372036854775807L;
        this.f18006r = -9223372036854775807L;
        this.f18007s = -9223372036854775807L;
    }

    /* renamed from: a */
    private static long m21895a(long j, long j2, float f) {
        return (long) ((((float) j) * f) + ((1.0f - f) * ((float) j2)));
    }

    /* renamed from: b */
    private void m21896b(long j) {
        long j2 = this.f18006r + (this.f18007s * 3);
        if (this.f18001m > j2) {
            float b = (float) C7476h.m20800b(this.f17991c);
            this.f18001m = C7058d.m18938a(j2, this.f17998j, this.f18001m - (((long) ((this.f18004p - 1.0f) * b)) + ((long) ((this.f18002n - 1.0f) * b))));
            return;
        }
        long a = C7728ai.m22192a(j - ((long) (Math.max(0.0f, this.f18004p - 1.0f) / this.f17992d)), this.f18001m, j2);
        this.f18001m = a;
        long j3 = this.f18000l;
        if (j3 != -9223372036854775807L && a > j3) {
            this.f18001m = j3;
        }
    }

    /* renamed from: b */
    private void m21897b(long j, long j2) {
        long j3;
        long j4 = j - j2;
        long j5 = this.f18006r;
        if (j5 == -9223372036854775807L) {
            this.f18006r = j4;
            j3 = 0;
        } else {
            long max = Math.max(j4, m21895a(j5, j4, this.f17995g));
            this.f18006r = max;
            j3 = m21895a(this.f18007s, Math.abs(j4 - max), this.f17995g);
        }
        this.f18007s = j3;
    }

    /* renamed from: c */
    private void m21898c() {
        long j = this.f17996h;
        if (j != -9223372036854775807L) {
            long j2 = this.f17997i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f17999k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f18000l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f17998j != j) {
            this.f17998j = j;
            this.f18001m = j;
            this.f18006r = -9223372036854775807L;
            this.f18007s = -9223372036854775807L;
            this.f18005q = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public float mo54871a(long j, long j2) {
        if (this.f17996h == -9223372036854775807L) {
            return 1.0f;
        }
        m21897b(j, j2);
        if (this.f18005q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f18005q < this.f17991c) {
            return this.f18004p;
        }
        this.f18005q = SystemClock.elapsedRealtime();
        m21896b(j);
        long j3 = j - this.f18001m;
        if (Math.abs(j3) < this.f17993e) {
            this.f18004p = 1.0f;
        } else {
            this.f18004p = C7728ai.m22178a((this.f17992d * ((float) j3)) + 1.0f, this.f18003o, this.f18002n);
        }
        return this.f18004p;
    }

    /* renamed from: a */
    public void mo54872a() {
        long j = this.f18001m;
        if (j != -9223372036854775807L) {
            long j2 = j + this.f17994f;
            this.f18001m = j2;
            long j3 = this.f18000l;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.f18001m = j3;
            }
            this.f18005q = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public void mo54873a(long j) {
        this.f17997i = j;
        m21898c();
    }

    /* renamed from: a */
    public void mo54874a(C6787ab.C6794e eVar) {
        this.f17996h = C7476h.m20800b(eVar.f14660b);
        this.f17999k = C7476h.m20800b(eVar.f14661c);
        this.f18000l = C7476h.m20800b(eVar.f14662d);
        this.f18003o = eVar.f14663e != -3.4028235E38f ? eVar.f14663e : this.f17989a;
        this.f18002n = eVar.f14664f != -3.4028235E38f ? eVar.f14664f : this.f17990b;
        m21898c();
    }

    /* renamed from: b */
    public long mo54875b() {
        return this.f18001m;
    }
}
