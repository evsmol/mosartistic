package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.i.c */
public final class C7295c implements C7262h {

    /* renamed from: a */
    public static final C7340l f16411a = $$Lambda$c$jeU8HBkNv0m6PJMXlOsb0ZhDRw.INSTANCE;

    /* renamed from: b */
    private final C7296d f16412b = new C7296d();

    /* renamed from: c */
    private final C7772y f16413c = new C7772y(16384);

    /* renamed from: d */
    private boolean f16414d;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C7262h[] m19968a() {
        return new C7262h[]{new C7295c()};
    }

    /* renamed from: a */
    public int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        int a = iVar.mo53898a(this.f16413c.mo55077d(), 0, 16384);
        if (a == -1) {
            return -1;
        }
        this.f16413c.mo55076d(0);
        this.f16413c.mo55075c(a);
        if (!this.f16414d) {
            this.f16412b.mo54030a(0, 4);
            this.f16414d = true;
        }
        this.f16412b.mo54032a(this.f16413c);
        return 0;
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        this.f16414d = false;
        this.f16412b.mo54029a();
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f16412b.mo54031a(jVar, new C7287ad.C7291d(0, 1));
        jVar.mo53895a();
        jVar.mo53896a(new C7353v.C7355b(-9223372036854775807L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if ((r4 - r3) < 8192) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.mo53899a();
        r4 = r4 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo53879a(com.applovin.exoplayer2.p186e.C7279i r9) throws java.io.IOException {
        /*
            r8 = this;
            com.applovin.exoplayer2.l.y r0 = new com.applovin.exoplayer2.l.y
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo55077d()
            r9.mo53908d(r4, r2, r1)
            r0.mo55076d(r2)
            int r4 = r0.mo55089m()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x0065
            r9.mo53899a()
            r9.mo53907c(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.mo55077d()
            r6 = 7
            r9.mo53908d(r5, r2, r6)
            r0.mo55076d(r2)
            int r5 = r0.mo55085i()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L_0x004d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L_0x004d
            r9.mo53899a()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0049
            return r2
        L_0x0049:
            r9.mo53907c(r4)
            goto L_0x0023
        L_0x004d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0053
            return r6
        L_0x0053:
            byte[] r6 = r0.mo55077d()
            int r5 = com.applovin.exoplayer2.p181b.C6853c.m17944a((byte[]) r6, (int) r5)
            r6 = -1
            if (r5 != r6) goto L_0x005f
            return r2
        L_0x005f:
            int r5 = r5 + -7
            r9.mo53907c(r5)
            goto L_0x0024
        L_0x0065:
            r4 = 3
            r0.mo55079e(r4)
            int r4 = r0.mo55098v()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.mo53907c(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7295c.mo53879a(com.applovin.exoplayer2.e.i):boolean");
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
