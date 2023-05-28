package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.e.o */
public final class C7345o implements C7353v {

    /* renamed from: a */
    private final C7346p f16749a;

    /* renamed from: b */
    private final long f16750b;

    public C7345o(C7346p pVar, long j) {
        this.f16749a = pVar;
        this.f16750b = j;
    }

    /* renamed from: a */
    private C7356w m20247a(long j, long j2) {
        return new C7356w((j * 1000000) / ((long) this.f16749a.f16755e), this.f16750b + j2);
    }

    /* renamed from: a */
    public C7353v.C7354a mo53869a(long j) {
        C7717a.m22115a(this.f16749a.f16761k);
        long[] jArr = this.f16749a.f16761k.f16763a;
        long[] jArr2 = this.f16749a.f16761k.f16764b;
        int a = C7728ai.m22189a(jArr, this.f16749a.mo54077a(j), true, false);
        long j2 = 0;
        long j3 = a == -1 ? 0 : jArr[a];
        if (a != -1) {
            j2 = jArr2[a];
        }
        C7356w a2 = m20247a(j3, j2);
        if (a2.f16780b == j || a == jArr.length - 1) {
            return new C7353v.C7354a(a2);
        }
        int i = a + 1;
        return new C7353v.C7354a(a2, m20247a(jArr[i], jArr2[i]));
    }

    /* renamed from: a */
    public boolean mo53870a() {
        return true;
    }

    /* renamed from: b */
    public long mo53871b() {
        return this.f16749a.mo54076a();
    }
}
