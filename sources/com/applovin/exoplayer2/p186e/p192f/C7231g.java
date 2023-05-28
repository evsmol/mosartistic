package com.applovin.exoplayer2.p186e.p192f;

import com.applovin.exoplayer2.p181b.C6895r;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7356w;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.f.g */
final class C7231g implements C7228e {

    /* renamed from: a */
    private final long f16092a;

    /* renamed from: b */
    private final int f16093b;

    /* renamed from: c */
    private final long f16094c;

    /* renamed from: d */
    private final long f16095d;

    /* renamed from: e */
    private final long f16096e;

    /* renamed from: f */
    private final long[] f16097f;

    private C7231g(long j, int i, long j2) {
        this(j, i, j2, -1, (long[]) null);
    }

    private C7231g(long j, int i, long j2, long j3, long[] jArr) {
        this.f16092a = j;
        this.f16093b = i;
        this.f16094c = j2;
        this.f16097f = jArr;
        this.f16095d = j3;
        this.f16096e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: a */
    private long m19603a(int i) {
        return (this.f16094c * ((long) i)) / 100;
    }

    /* renamed from: a */
    public static C7231g m19604a(long j, long j2, C6895r.C6896a aVar, C7772y yVar) {
        int w;
        long j3 = j;
        C6895r.C6896a aVar2 = aVar;
        int i = aVar2.f15196g;
        int i2 = aVar2.f15193d;
        int q = yVar.mo55093q();
        if ((q & 1) != 1 || (w = yVar.mo55099w()) == 0) {
            return null;
        }
        long d = C7728ai.m22252d((long) w, ((long) i) * 1000000, (long) i2);
        if ((q & 6) != 6) {
            return new C7231g(j2, aVar2.f15192c, d);
        }
        long o = yVar.mo55091o();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) yVar.mo55084h();
        }
        if (j3 != -1) {
            long j4 = j2 + o;
            if (j3 != j4) {
                C7755q.m22361c("XingSeeker", "XING data size mismatch: " + j3 + ", " + j4);
            }
        }
        return new C7231g(j2, aVar2.f15192c, d, o, jArr);
    }

    /* renamed from: a */
    public C7353v.C7354a mo53869a(long j) {
        if (!mo53870a()) {
            return new C7353v.C7354a(new C7356w(0, this.f16092a + ((long) this.f16093b)));
        }
        long a = C7728ai.m22192a(j, 0, this.f16094c);
        double d = (((double) a) * 100.0d) / ((double) this.f16094c);
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = (long[]) C7717a.m22115a(this.f16097f);
                double d3 = (double) jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : (double) jArr[i + 1]) - d3));
            }
        }
        return new C7353v.C7354a(new C7356w(a, this.f16092a + C7728ai.m22192a(Math.round((d2 / 256.0d) * ((double) this.f16095d)), (long) this.f16093b, this.f16095d - 1)));
    }

    /* renamed from: a */
    public boolean mo53870a() {
        return this.f16097f != null;
    }

    /* renamed from: b */
    public long mo53871b() {
        return this.f16094c;
    }

    /* renamed from: c */
    public long mo53942c() {
        return this.f16096e;
    }

    /* renamed from: c */
    public long mo53943c(long j) {
        long j2 = j - this.f16092a;
        if (!mo53870a() || j2 <= ((long) this.f16093b)) {
            return 0;
        }
        long[] jArr = (long[]) C7717a.m22115a(this.f16097f);
        double d = (((double) j2) * 256.0d) / ((double) this.f16095d);
        int a = C7728ai.m22189a(jArr, (long) d, true, true);
        long a2 = m19603a(a);
        long j3 = jArr[a];
        int i = a + 1;
        long a3 = m19603a(i);
        long j4 = a == 99 ? 256 : jArr[i];
        return a2 + Math.round((j3 == j4 ? 0.0d : (d - ((double) j3)) / ((double) (j4 - j3))) * ((double) (a3 - a2)));
    }
}
