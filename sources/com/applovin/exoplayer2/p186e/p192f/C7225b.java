package com.applovin.exoplayer2.p186e.p192f;

import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7356w;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7756r;

/* renamed from: com.applovin.exoplayer2.e.f.b */
final class C7225b implements C7228e {

    /* renamed from: a */
    private final long f16059a;

    /* renamed from: b */
    private final C7756r f16060b = new C7756r();

    /* renamed from: c */
    private final C7756r f16061c = new C7756r();

    /* renamed from: d */
    private long f16062d;

    public C7225b(long j, long j2, long j3) {
        this.f16062d = j;
        this.f16059a = j3;
        this.f16060b.mo55034a(0);
        this.f16061c.mo55034a(j2);
    }

    /* renamed from: a */
    public C7353v.C7354a mo53869a(long j) {
        int a = C7728ai.m22183a(this.f16060b, j, true, true);
        C7356w wVar = new C7356w(this.f16060b.mo55033a(a), this.f16061c.mo55033a(a));
        if (wVar.f16780b == j || a == this.f16060b.mo55032a() - 1) {
            return new C7353v.C7354a(wVar);
        }
        int i = a + 1;
        return new C7353v.C7354a(wVar, new C7356w(this.f16060b.mo55033a(i), this.f16061c.mo55033a(i)));
    }

    /* renamed from: a */
    public void mo53944a(long j, long j2) {
        if (!mo53945b(j)) {
            this.f16060b.mo55034a(j);
            this.f16061c.mo55034a(j2);
        }
    }

    /* renamed from: a */
    public boolean mo53870a() {
        return true;
    }

    /* renamed from: b */
    public long mo53871b() {
        return this.f16062d;
    }

    /* renamed from: b */
    public boolean mo53945b(long j) {
        C7756r rVar = this.f16060b;
        return j - rVar.mo55033a(rVar.mo55032a() - 1) < 100000;
    }

    /* renamed from: c */
    public long mo53942c() {
        return this.f16059a;
    }

    /* renamed from: c */
    public long mo53943c(long j) {
        return this.f16060b.mo55033a(C7728ai.m22183a(this.f16061c, j, true, true));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo53946d(long j) {
        this.f16062d = j;
    }
}
