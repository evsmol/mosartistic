package com.applovin.exoplayer2.p186e.p192f;

import com.applovin.exoplayer2.p181b.C6895r;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7356w;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.f.f */
final class C7230f implements C7228e {

    /* renamed from: a */
    private final long[] f16088a;

    /* renamed from: b */
    private final long[] f16089b;

    /* renamed from: c */
    private final long f16090c;

    /* renamed from: d */
    private final long f16091d;

    private C7230f(long[] jArr, long[] jArr2, long j, long j2) {
        this.f16088a = jArr;
        this.f16089b = jArr2;
        this.f16090c = j;
        this.f16091d = j2;
    }

    /* renamed from: a */
    public static C7230f m19597a(long j, long j2, C6895r.C6896a aVar, C7772y yVar) {
        int i;
        long j3 = j;
        C6895r.C6896a aVar2 = aVar;
        C7772y yVar2 = yVar;
        yVar2.mo55079e(10);
        int q = yVar.mo55093q();
        if (q <= 0) {
            return null;
        }
        int i2 = aVar2.f15193d;
        long d = C7728ai.m22252d((long) q, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), (long) i2);
        int i3 = yVar.mo55085i();
        int i4 = yVar.mo55085i();
        int i5 = yVar.mo55085i();
        yVar2.mo55079e(2);
        long j4 = j2 + ((long) aVar2.f15192c);
        long[] jArr = new long[i3];
        long[] jArr2 = new long[i3];
        int i6 = 0;
        long j5 = j2;
        while (i6 < i3) {
            int i7 = i4;
            jArr[i6] = (((long) i6) * d) / ((long) i3);
            long j6 = j4;
            jArr2[i6] = Math.max(j5, j6);
            if (i5 == 1) {
                i = yVar.mo55084h();
            } else if (i5 == 2) {
                i = yVar.mo55085i();
            } else if (i5 == 3) {
                i = yVar.mo55089m();
            } else if (i5 != 4) {
                return null;
            } else {
                i = yVar.mo55099w();
            }
            j5 += (long) (i * i7);
            i6++;
            j4 = j6;
            i4 = i7;
        }
        if (!(j3 == -1 || j3 == j5)) {
            C7755q.m22361c("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j5);
        }
        return new C7230f(jArr, jArr2, d, j5);
    }

    /* renamed from: a */
    public C7353v.C7354a mo53869a(long j) {
        int a = C7728ai.m22189a(this.f16088a, j, true, true);
        C7356w wVar = new C7356w(this.f16088a[a], this.f16089b[a]);
        if (wVar.f16780b >= j || a == this.f16088a.length - 1) {
            return new C7353v.C7354a(wVar);
        }
        int i = a + 1;
        return new C7353v.C7354a(wVar, new C7356w(this.f16088a[i], this.f16089b[i]));
    }

    /* renamed from: a */
    public boolean mo53870a() {
        return true;
    }

    /* renamed from: b */
    public long mo53871b() {
        return this.f16090c;
    }

    /* renamed from: c */
    public long mo53942c() {
        return this.f16091d;
    }

    /* renamed from: c */
    public long mo53943c(long j) {
        return this.f16088a[C7728ai.m22189a(this.f16089b, j, true, true)];
    }
}
