package com.applovin.exoplayer2.p206h;

import com.applovin.exoplayer2.C6832av;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.C7867w;
import com.applovin.exoplayer2.p182c.C6922g;
import com.applovin.exoplayer2.p206h.C7506n;
import com.applovin.exoplayer2.p219j.C7637d;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7759u;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.h.d */
public final class C7489d implements C7506n, C7506n.C7507a {

    /* renamed from: a */
    public final C7506n f17181a;

    /* renamed from: b */
    long f17182b;

    /* renamed from: c */
    long f17183c;

    /* renamed from: d */
    private C7506n.C7507a f17184d;

    /* renamed from: e */
    private C7490a[] f17185e = new C7490a[0];

    /* renamed from: f */
    private long f17186f;

    /* renamed from: com.applovin.exoplayer2.h.d$a */
    private final class C7490a implements C7534x {

        /* renamed from: a */
        public final C7534x f17187a;

        /* renamed from: c */
        private boolean f17189c;

        public C7490a(C7534x xVar) {
            this.f17187a = xVar;
        }

        /* renamed from: a */
        public int mo54511a(long j) {
            if (C7489d.this.mo54510g()) {
                return -3;
            }
            return this.f17187a.mo54511a(j);
        }

        /* renamed from: a */
        public int mo54512a(C7867w wVar, C6922g gVar, int i) {
            if (C7489d.this.mo54510g()) {
                return -3;
            }
            if (this.f17189c) {
                gVar.mo53122a_(4);
                return -4;
            }
            int a = this.f17187a.mo54512a(wVar, gVar, i);
            if (a == -5) {
                C7864v vVar = (C7864v) C7717a.m22120b(wVar.f18967b);
                if (!(vVar.f18905B == 0 && vVar.f18906C == 0)) {
                    int i2 = 0;
                    int i3 = C7489d.this.f17182b != 0 ? 0 : vVar.f18905B;
                    if (C7489d.this.f17183c == Long.MIN_VALUE) {
                        i2 = vVar.f18906C;
                    }
                    wVar.f18967b = vVar.mo55408a().mo55443n(i3).mo55444o(i2).mo55424a();
                }
                return -5;
            } else if (C7489d.this.f17183c == Long.MIN_VALUE || ((a != -4 || gVar.f15334d < C7489d.this.f17183c) && (a != -3 || C7489d.this.mo54506d() != Long.MIN_VALUE || gVar.f15333c))) {
                return a;
            } else {
                gVar.mo53121a();
                gVar.mo53122a_(4);
                this.f17189c = true;
                return -4;
            }
        }

        /* renamed from: a */
        public void mo54513a() {
            this.f17189c = false;
        }

        /* renamed from: b */
        public boolean mo54514b() {
            return !C7489d.this.mo54510g() && this.f17187a.mo54514b();
        }

        /* renamed from: c */
        public void mo54515c() throws IOException {
            this.f17187a.mo54515c();
        }
    }

    public C7489d(C7506n nVar, boolean z, long j, long j2) {
        this.f17181a = nVar;
        this.f17186f = z ? j : -9223372036854775807L;
        this.f17182b = j;
        this.f17183c = j2;
    }

    /* renamed from: a */
    private static boolean m20869a(long j, C7637d[] dVarArr) {
        if (j != 0) {
            for (C7637d dVar : dVarArr) {
                if (dVar != null) {
                    C7864v f = dVar.mo54812f();
                    if (!C7759u.m22378a(f.f18921l, f.f18918i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private C6832av m20870b(long j, C6832av avVar) {
        long a = C7728ai.m22192a(avVar.f14880f, 0, j - this.f17182b);
        long j2 = avVar.f14881g;
        long j3 = this.f17183c;
        long a2 = C7728ai.m22192a(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (a == avVar.f14880f && a2 == avVar.f14881g) ? avVar : new C6832av(a, a2);
    }

    /* renamed from: a */
    public long mo54493a(long j, C6832av avVar) {
        long j2 = this.f17182b;
        if (j == j2) {
            return j2;
        }
        return this.f17181a.mo54493a(j, m20870b(j, avVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r2 > r4) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo54494a(com.applovin.exoplayer2.p219j.C7637d[] r13, boolean[] r14, com.applovin.exoplayer2.p206h.C7534x[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.applovin.exoplayer2.h.d$a[] r2 = new com.applovin.exoplayer2.p206h.C7489d.C7490a[r2]
            r0.f17185e = r2
            int r2 = r1.length
            com.applovin.exoplayer2.h.x[] r9 = new com.applovin.exoplayer2.p206h.C7534x[r2]
            r10 = 0
            r2 = 0
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0025
            com.applovin.exoplayer2.h.d$a[] r3 = r0.f17185e
            r4 = r1[r2]
            com.applovin.exoplayer2.h.d$a r4 = (com.applovin.exoplayer2.p206h.C7489d.C7490a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0020
            r3 = r3[r2]
            com.applovin.exoplayer2.h.x r11 = r3.f17187a
        L_0x0020:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0025:
            com.applovin.exoplayer2.h.n r2 = r0.f17181a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo54494a(r3, r4, r5, r6, r7)
            boolean r4 = r12.mo54510g()
            if (r4 == 0) goto L_0x0047
            long r4 = r0.f17182b
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0047
            r6 = r13
            boolean r4 = m20869a((long) r4, (com.applovin.exoplayer2.p219j.C7637d[]) r13)
            if (r4 == 0) goto L_0x0047
            r4 = r2
            goto L_0x004c
        L_0x0047:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004c:
            r0.f17186f = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0067
            long r4 = r0.f17182b
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0065
            long r4 = r0.f17183c
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0067
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r4 = 0
            goto L_0x0068
        L_0x0067:
            r4 = 1
        L_0x0068:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r4)
        L_0x006b:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x0099
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0077
            com.applovin.exoplayer2.h.d$a[] r4 = r0.f17185e
            r4[r10] = r11
            goto L_0x0090
        L_0x0077:
            com.applovin.exoplayer2.h.d$a[] r4 = r0.f17185e
            r5 = r4[r10]
            if (r5 == 0) goto L_0x0085
            r4 = r4[r10]
            com.applovin.exoplayer2.h.x r4 = r4.f17187a
            r5 = r9[r10]
            if (r4 == r5) goto L_0x0090
        L_0x0085:
            com.applovin.exoplayer2.h.d$a[] r4 = r0.f17185e
            com.applovin.exoplayer2.h.d$a r5 = new com.applovin.exoplayer2.h.d$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L_0x0090:
            com.applovin.exoplayer2.h.d$a[] r4 = r0.f17185e
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x006b
        L_0x0099:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7489d.mo54494a(com.applovin.exoplayer2.j.d[], boolean[], com.applovin.exoplayer2.h.x[], boolean[], long):long");
    }

    /* renamed from: a */
    public void mo54495a(long j) {
        this.f17181a.mo54495a(j);
    }

    /* renamed from: a */
    public void mo54496a(long j, long j2) {
        this.f17182b = j;
        this.f17183c = j2;
    }

    /* renamed from: a */
    public void mo54497a(long j, boolean z) {
        this.f17181a.mo54497a(j, z);
    }

    /* renamed from: a */
    public void mo54498a(C7506n.C7507a aVar, long j) {
        this.f17184d = aVar;
        this.f17181a.mo54498a((C7506n.C7507a) this, j);
    }

    /* renamed from: a */
    public void mo54499a(C7506n nVar) {
        ((C7506n.C7507a) C7717a.m22120b(this.f17184d)).mo54499a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo54501b(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f17186f = r0
            com.applovin.exoplayer2.h.d$a[] r0 = r6.f17185e
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo54513a()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.applovin.exoplayer2.h.n r0 = r6.f17181a
            long r0 = r0.mo54501b(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            long r7 = r6.f17182b
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0035
            long r7 = r6.f17183c
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            com.applovin.exoplayer2.p221l.C7717a.m22121b((boolean) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7489d.mo54501b(long):long");
    }

    /* renamed from: b */
    public C7483ad mo54502b() {
        return this.f17181a.mo54502b();
    }

    /* renamed from: b */
    public void mo54500a(C7506n nVar) {
        ((C7506n.C7507a) C7717a.m22120b(this.f17184d)).mo54500a(this);
    }

    /* renamed from: c */
    public long mo54504c() {
        if (mo54510g()) {
            long j = this.f17186f;
            this.f17186f = -9223372036854775807L;
            long c = mo54504c();
            return c != -9223372036854775807L ? c : j;
        }
        long c2 = this.f17181a.mo54504c();
        if (c2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C7717a.m22121b(c2 >= this.f17182b);
        long j2 = this.f17183c;
        if (j2 != Long.MIN_VALUE && c2 > j2) {
            z = false;
        }
        C7717a.m22121b(z);
        return c2;
    }

    /* renamed from: c */
    public boolean mo54505c(long j) {
        return this.f17181a.mo54505c(j);
    }

    /* renamed from: d */
    public long mo54506d() {
        long d = this.f17181a.mo54506d();
        if (d != Long.MIN_VALUE) {
            long j = this.f17183c;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: e */
    public long mo54507e() {
        long e = this.f17181a.mo54507e();
        if (e != Long.MIN_VALUE) {
            long j = this.f17183c;
            if (j == Long.MIN_VALUE || e < j) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: e_ */
    public void mo54508e_() throws IOException {
        this.f17181a.mo54508e_();
    }

    /* renamed from: f */
    public boolean mo54509f() {
        return this.f17181a.mo54509f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo54510g() {
        return this.f17186f != -9223372036854775807L;
    }
}
