package com.applovin.exoplayer2.p186e.p189c;

import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.c.b */
public final class C7197b implements C7262h {

    /* renamed from: a */
    public static final C7340l f15847a = $$Lambda$b$o1afdW7vYJZ3hkP278G2VQ0xrrY.INSTANCE;

    /* renamed from: b */
    private final C7772y f15848b = new C7772y(4);

    /* renamed from: c */
    private final C7772y f15849c = new C7772y(9);

    /* renamed from: d */
    private final C7772y f15850d = new C7772y(11);

    /* renamed from: e */
    private final C7772y f15851e = new C7772y();

    /* renamed from: f */
    private final C7198c f15852f = new C7198c();

    /* renamed from: g */
    private C7329j f15853g;

    /* renamed from: h */
    private int f15854h = 1;

    /* renamed from: i */
    private boolean f15855i;

    /* renamed from: j */
    private long f15856j;

    /* renamed from: k */
    private int f15857k;

    /* renamed from: l */
    private int f15858l;

    /* renamed from: m */
    private int f15859m;

    /* renamed from: n */
    private long f15860n;

    /* renamed from: o */
    private boolean f15861o;

    /* renamed from: p */
    private C7196a f15862p;

    /* renamed from: q */
    private C7201e f15863q;

    /* renamed from: a */
    private void m19370a() {
        if (!this.f15861o) {
            this.f15853g.mo53896a(new C7353v.C7355b(-9223372036854775807L));
            this.f15861o = true;
        }
    }

    /* renamed from: b */
    private long m19371b() {
        if (this.f15855i) {
            return this.f15856j + this.f15860n;
        }
        if (this.f15852f.mo53885a() == -9223372036854775807L) {
            return 0;
        }
        return this.f15860n;
    }

    /* renamed from: b */
    private boolean m19372b(C7279i iVar) throws IOException {
        boolean z = false;
        if (!iVar.mo53901a(this.f15849c.mo55077d(), 0, 9, true)) {
            return false;
        }
        this.f15849c.mo55076d(0);
        this.f15849c.mo55079e(4);
        int h = this.f15849c.mo55084h();
        boolean z2 = (h & 4) != 0;
        if ((h & 1) != 0) {
            z = true;
        }
        if (z2 && this.f15862p == null) {
            this.f15862p = new C7196a(this.f15853g.mo53894a(8, 1));
        }
        if (z && this.f15863q == null) {
            this.f15863q = new C7201e(this.f15853g.mo53894a(9, 2));
        }
        this.f15853g.mo53895a();
        this.f15857k = (this.f15849c.mo55093q() - 9) + 4;
        this.f15854h = 2;
        return true;
    }

    /* renamed from: c */
    private void m19373c(C7279i iVar) throws IOException {
        iVar.mo53902b(this.f15857k);
        this.f15857k = 0;
        this.f15854h = 3;
    }

    /* renamed from: d */
    private boolean m19374d(C7279i iVar) throws IOException {
        if (!iVar.mo53901a(this.f15850d.mo55077d(), 0, 11, true)) {
            return false;
        }
        this.f15850d.mo55076d(0);
        this.f15858l = this.f15850d.mo55084h();
        this.f15859m = this.f15850d.mo55089m();
        this.f15860n = (long) this.f15850d.mo55089m();
        this.f15860n = (((long) (this.f15850d.mo55084h() << 24)) | this.f15860n) * 1000;
        this.f15850d.mo55079e(3);
        this.f15854h = 4;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C7262h[] m19375d() {
        return new C7262h[]{new C7197b()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m19376e(com.applovin.exoplayer2.p186e.C7279i r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.m19371b()
            int r2 = r9.f15858l
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L_0x0024
            com.applovin.exoplayer2.e.c.a r2 = r9.f15862p
            if (r2 == 0) goto L_0x0024
            r9.m19370a()
            com.applovin.exoplayer2.e.c.a r2 = r9.f15862p
            com.applovin.exoplayer2.l.y r10 = r9.m19377f(r10)
            boolean r5 = r2.mo53888b(r10, r0)
        L_0x0022:
            r10 = 1
            goto L_0x0079
        L_0x0024:
            int r2 = r9.f15858l
            r7 = 9
            if (r2 != r7) goto L_0x003c
            com.applovin.exoplayer2.e.c.e r2 = r9.f15863q
            if (r2 == 0) goto L_0x003c
            r9.m19370a()
            com.applovin.exoplayer2.e.c.e r2 = r9.f15863q
            com.applovin.exoplayer2.l.y r10 = r9.m19377f(r10)
            boolean r5 = r2.mo53888b(r10, r0)
            goto L_0x0022
        L_0x003c:
            int r2 = r9.f15858l
            r7 = 18
            if (r2 != r7) goto L_0x0073
            boolean r2 = r9.f15861o
            if (r2 != 0) goto L_0x0073
            com.applovin.exoplayer2.e.c.c r2 = r9.f15852f
            com.applovin.exoplayer2.l.y r10 = r9.m19377f(r10)
            boolean r5 = r2.mo53888b(r10, r0)
            com.applovin.exoplayer2.e.c.c r10 = r9.f15852f
            long r0 = r10.mo53885a()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0022
            com.applovin.exoplayer2.e.j r10 = r9.f15853g
            com.applovin.exoplayer2.e.t r2 = new com.applovin.exoplayer2.e.t
            com.applovin.exoplayer2.e.c.c r7 = r9.f15852f
            long[] r7 = r7.mo53887c()
            com.applovin.exoplayer2.e.c.c r8 = r9.f15852f
            long[] r8 = r8.mo53886b()
            r2.<init>(r7, r8, r0)
            r10.mo53896a(r2)
            r9.f15861o = r6
            goto L_0x0022
        L_0x0073:
            int r0 = r9.f15859m
            r10.mo53902b(r0)
            r10 = 0
        L_0x0079:
            boolean r0 = r9.f15855i
            if (r0 != 0) goto L_0x0093
            if (r5 == 0) goto L_0x0093
            r9.f15855i = r6
            com.applovin.exoplayer2.e.c.c r0 = r9.f15852f
            long r0 = r0.mo53885a()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x008f
            long r0 = r9.f15860n
            long r0 = -r0
            goto L_0x0091
        L_0x008f:
            r0 = 0
        L_0x0091:
            r9.f15856j = r0
        L_0x0093:
            r0 = 4
            r9.f15857k = r0
            r0 = 2
            r9.f15854h = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p189c.C7197b.m19376e(com.applovin.exoplayer2.e.i):boolean");
    }

    /* renamed from: f */
    private C7772y m19377f(C7279i iVar) throws IOException {
        if (this.f15859m > this.f15851e.mo55078e()) {
            C7772y yVar = this.f15851e;
            yVar.mo55070a(new byte[Math.max(yVar.mo55078e() * 2, this.f15859m)], 0);
        } else {
            this.f15851e.mo55076d(0);
        }
        this.f15851e.mo55075c(this.f15859m);
        iVar.mo53903b(this.f15851e.mo55077d(), 0, this.f15859m);
        return this.f15851e;
    }

    /* renamed from: a */
    public int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        C7717a.m22115a(this.f15853g);
        while (true) {
            int i = this.f15854h;
            if (i != 1) {
                if (i == 2) {
                    m19373c(iVar);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    } else if (m19376e(iVar)) {
                        return 0;
                    }
                } else if (!m19374d(iVar)) {
                    return -1;
                }
            } else if (!m19372b(iVar)) {
                return -1;
            }
        }
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        if (j == 0) {
            this.f15854h = 1;
            this.f15855i = false;
        } else {
            this.f15854h = 3;
        }
        this.f15857k = 0;
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f15853g = jVar;
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        iVar.mo53908d(this.f15848b.mo55077d(), 0, 3);
        this.f15848b.mo55076d(0);
        if (this.f15848b.mo55089m() != 4607062) {
            return false;
        }
        iVar.mo53908d(this.f15848b.mo55077d(), 0, 2);
        this.f15848b.mo55076d(0);
        if ((this.f15848b.mo55085i() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        iVar.mo53908d(this.f15848b.mo55077d(), 0, 4);
        this.f15848b.mo55076d(0);
        int q = this.f15848b.mo55093q();
        iVar.mo53899a();
        iVar.mo53907c(q);
        iVar.mo53908d(this.f15848b.mo55077d(), 0, 4);
        this.f15848b.mo55076d(0);
        return this.f15848b.mo55093q() == 0;
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
