package com.applovin.exoplayer2.p186e.p192f;

import android.util.Pair;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7356w;
import com.applovin.exoplayer2.p198g.p203e.C7441j;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.e.f.c */
final class C7226c implements C7228e {

    /* renamed from: a */
    private final long[] f16063a;

    /* renamed from: b */
    private final long[] f16064b;

    /* renamed from: c */
    private final long f16065c;

    private C7226c(long[] jArr, long[] jArr2, long j) {
        this.f16063a = jArr;
        this.f16064b = jArr2;
        this.f16065c = j == -9223372036854775807L ? C7476h.m20800b(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    private static Pair<Long, Long> m19565a(long j, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int a = C7728ai.m22189a(jArr, j, true, true);
        long j2 = jArr[a];
        long j3 = jArr2[a];
        int i = a + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            double d = j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2));
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d * ((double) (j5 - j3)))) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    /* renamed from: a */
    public static C7226c m19566a(long j, C7441j jVar, long j2) {
        int length = jVar.f17050d.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (jVar.f17048b + jVar.f17050d[i3]);
            j3 += (long) (jVar.f17049c + jVar.f17051e[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C7226c(jArr, jArr2, j2);
    }

    /* renamed from: a */
    public C7353v.C7354a mo53869a(long j) {
        Pair<Long, Long> a = m19565a(C7476h.m20797a(C7728ai.m22192a(j, 0, this.f16065c)), this.f16064b, this.f16063a);
        return new C7353v.C7354a(new C7356w(C7476h.m20800b(((Long) a.first).longValue()), ((Long) a.second).longValue()));
    }

    /* renamed from: a */
    public boolean mo53870a() {
        return true;
    }

    /* renamed from: b */
    public long mo53871b() {
        return this.f16065c;
    }

    /* renamed from: c */
    public long mo53942c() {
        return -1;
    }

    /* renamed from: c */
    public long mo53943c(long j) {
        return C7476h.m20800b(((Long) m19565a(j, this.f16063a, this.f16064b).second).longValue());
    }
}
