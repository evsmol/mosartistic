package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.a */
public abstract class C7182a {

    /* renamed from: a */
    protected final C7183a f15775a;

    /* renamed from: b */
    protected final C7188f f15776b;

    /* renamed from: c */
    protected C7185c f15777c;

    /* renamed from: d */
    private final int f15778d;

    /* renamed from: com.applovin.exoplayer2.e.a$a */
    public static class C7183a implements C7353v {

        /* renamed from: a */
        private final C7186d f15779a;

        /* renamed from: b */
        private final long f15780b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f15781c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f15782d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final long f15783e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final long f15784f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final long f15785g;

        public C7183a(C7186d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f15779a = dVar;
            this.f15780b = j;
            this.f15781c = j2;
            this.f15782d = j3;
            this.f15783e = j4;
            this.f15784f = j5;
            this.f15785g = j6;
        }

        /* renamed from: a */
        public C7353v.C7354a mo53869a(long j) {
            return new C7353v.C7354a(new C7356w(j, C7185c.m19298a(this.f15779a.timeUsToTargetTime(j), this.f15781c, this.f15782d, this.f15783e, this.f15784f, this.f15785g)));
        }

        /* renamed from: a */
        public boolean mo53870a() {
            return true;
        }

        /* renamed from: b */
        public long mo53871b() {
            return this.f15780b;
        }

        /* renamed from: b */
        public long mo53872b(long j) {
            return this.f15779a.timeUsToTargetTime(j);
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.a$b */
    public static final class C7184b implements C7186d {
        public long timeUsToTargetTime(long j) {
            return j;
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.a$c */
    protected static class C7185c {

        /* renamed from: a */
        private final long f15786a;

        /* renamed from: b */
        private final long f15787b;

        /* renamed from: c */
        private final long f15788c;

        /* renamed from: d */
        private long f15789d;

        /* renamed from: e */
        private long f15790e;

        /* renamed from: f */
        private long f15791f;

        /* renamed from: g */
        private long f15792g;

        /* renamed from: h */
        private long f15793h;

        protected C7185c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f15786a = j;
            this.f15787b = j2;
            this.f15789d = j3;
            this.f15790e = j4;
            this.f15791f = j5;
            this.f15792g = j6;
            this.f15788c = j7;
            this.f15793h = m19298a(j2, j3, j4, j5, j6, j7);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public long m19297a() {
            return this.f15791f;
        }

        /* renamed from: a */
        protected static long m19298a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return C7728ai.m22192a(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m19300a(long j, long j2) {
            this.f15789d = j;
            this.f15791f = j2;
            m19312f();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public long m19302b() {
            return this.f15792g;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m19304b(long j, long j2) {
            this.f15790e = j;
            this.f15792g = j2;
            m19312f();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public long m19306c() {
            return this.f15787b;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public long m19308d() {
            return this.f15786a;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public long m19310e() {
            return this.f15793h;
        }

        /* renamed from: f */
        private void m19312f() {
            this.f15793h = m19298a(this.f15787b, this.f15789d, this.f15790e, this.f15791f, this.f15792g, this.f15788c);
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.a$d */
    protected interface C7186d {
        long timeUsToTargetTime(long j);
    }

    /* renamed from: com.applovin.exoplayer2.e.a$e */
    public static final class C7187e {

        /* renamed from: a */
        public static final C7187e f15794a = new C7187e(-3, -9223372036854775807L, -1);
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f15795b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f15796c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f15797d;

        private C7187e(int i, long j, long j2) {
            this.f15795b = i;
            this.f15796c = j;
            this.f15797d = j2;
        }

        /* renamed from: a */
        public static C7187e m19314a(long j) {
            return new C7187e(0, -9223372036854775807L, j);
        }

        /* renamed from: a */
        public static C7187e m19315a(long j, long j2) {
            return new C7187e(-1, j, j2);
        }

        /* renamed from: b */
        public static C7187e m19317b(long j, long j2) {
            return new C7187e(-2, j, j2);
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.a$f */
    protected interface C7188f {

        /* renamed from: com.applovin.exoplayer2.e.a$f$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(C7188f fVar) {
            }
        }

        /* renamed from: a */
        C7187e mo53874a(C7279i iVar, long j) throws IOException;

        /* renamed from: a */
        void mo53875a();
    }

    protected C7182a(C7186d dVar, C7188f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f15776b = fVar;
        this.f15778d = i;
        this.f15775a = new C7183a(dVar, j, j2, j3, j4, j5, j6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo53860a(C7279i iVar, long j, C7352u uVar) {
        if (j == iVar.mo53892c()) {
            return 0;
        }
        uVar.f16774a = j;
        return 1;
    }

    /* renamed from: a */
    public int mo53861a(C7279i iVar, C7352u uVar) throws IOException {
        while (true) {
            C7185c cVar = (C7185c) C7717a.m22115a(this.f15777c);
            long b = cVar.m19297a();
            long c = cVar.m19302b();
            long d = cVar.m19310e();
            if (c - b <= ((long) this.f15778d)) {
                mo53864a(false, b);
                return mo53860a(iVar, b, uVar);
            } else if (!mo53865a(iVar, d)) {
                return mo53860a(iVar, d, uVar);
            } else {
                iVar.mo53899a();
                C7187e a = this.f15776b.mo53874a(iVar, cVar.m19306c());
                int a2 = a.f15795b;
                if (a2 == -3) {
                    mo53864a(false, d);
                    return mo53860a(iVar, d, uVar);
                } else if (a2 == -2) {
                    cVar.m19300a(a.f15796c, a.f15797d);
                } else if (a2 == -1) {
                    cVar.m19304b(a.f15796c, a.f15797d);
                } else if (a2 == 0) {
                    mo53865a(iVar, a.f15797d);
                    mo53864a(true, a.f15797d);
                    return mo53860a(iVar, a.f15797d, uVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    /* renamed from: a */
    public final C7353v mo53862a() {
        return this.f15775a;
    }

    /* renamed from: a */
    public final void mo53863a(long j) {
        C7185c cVar = this.f15777c;
        if (cVar == null || cVar.m19308d() != j) {
            this.f15777c = mo53866b(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53864a(boolean z, long j) {
        this.f15777c = null;
        this.f15776b.mo53875a();
        mo53867b(z, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo53865a(C7279i iVar, long j) throws IOException {
        long c = j - iVar.mo53892c();
        if (c < 0 || c > 262144) {
            return false;
        }
        iVar.mo53902b((int) c);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C7185c mo53866b(long j) {
        long j2 = j;
        return new C7185c(j2, this.f15775a.mo53872b(j2), this.f15775a.f15781c, this.f15775a.f15782d, this.f15775a.f15783e, this.f15775a.f15784f, this.f15775a.f15785g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo53867b(boolean z, long j) {
    }

    /* renamed from: b */
    public final boolean mo53868b() {
        return this.f15777c != null;
    }
}
