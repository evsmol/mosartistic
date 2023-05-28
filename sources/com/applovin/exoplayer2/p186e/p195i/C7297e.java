package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.p186e.C7202d;
import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.i.e */
public final class C7297e implements C7262h {

    /* renamed from: a */
    public static final C7340l f16428a = $$Lambda$e$FgKmDX7almKazsJxOUkYa06RKpw.INSTANCE;

    /* renamed from: b */
    private final int f16429b;

    /* renamed from: c */
    private final C7298f f16430c;

    /* renamed from: d */
    private final C7772y f16431d;

    /* renamed from: e */
    private final C7772y f16432e;

    /* renamed from: f */
    private final C7771x f16433f;

    /* renamed from: g */
    private C7329j f16434g;

    /* renamed from: h */
    private long f16435h;

    /* renamed from: i */
    private long f16436i;

    /* renamed from: j */
    private int f16437j;

    /* renamed from: k */
    private boolean f16438k;

    /* renamed from: l */
    private boolean f16439l;

    /* renamed from: m */
    private boolean f16440m;

    public C7297e() {
        this(0);
    }

    public C7297e(int i) {
        this.f16429b = (i & 2) != 0 ? i | 1 : i;
        this.f16430c = new C7298f(true);
        this.f16431d = new C7772y(2048);
        this.f16437j = -1;
        this.f16436i = -1;
        C7772y yVar = new C7772y(10);
        this.f16432e = yVar;
        this.f16433f = new C7771x(yVar.mo55077d());
    }

    /* renamed from: a */
    private static int m19982a(int i, long j) {
        return (int) ((((long) (i * 8)) * 1000000) / j);
    }

    /* renamed from: a */
    private void m19983a(long j, boolean z) {
        if (!this.f16440m) {
            boolean z2 = false;
            boolean z3 = (this.f16429b & 1) != 0 && this.f16437j > 0;
            if (!z3 || this.f16430c.mo54034c() != -9223372036854775807L || z) {
                if (!z3 || this.f16430c.mo54034c() == -9223372036854775807L) {
                    this.f16434g.mo53896a(new C7353v.C7355b(-9223372036854775807L));
                } else {
                    C7329j jVar = this.f16434g;
                    if ((this.f16429b & 2) != 0) {
                        z2 = true;
                    }
                    jVar.mo53896a(m19986b(j, z2));
                }
                this.f16440m = true;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C7262h[] m19984a() {
        return new C7262h[]{new C7297e()};
    }

    /* renamed from: b */
    private int m19985b(C7279i iVar) throws IOException {
        int i = 0;
        while (true) {
            iVar.mo53908d(this.f16432e.mo55077d(), 0, 10);
            this.f16432e.mo55076d(0);
            if (this.f16432e.mo55089m() != 4801587) {
                break;
            }
            this.f16432e.mo55079e(3);
            int v = this.f16432e.mo55098v();
            i += v + 10;
            iVar.mo53907c(v);
        }
        iVar.mo53899a();
        iVar.mo53907c(i);
        if (this.f16436i == -1) {
            this.f16436i = (long) i;
        }
        return i;
    }

    /* renamed from: b */
    private C7353v m19986b(long j, boolean z) {
        return new C7202d(j, this.f16436i, m19982a(this.f16437j, this.f16430c.mo54034c()), this.f16437j, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19987c(com.applovin.exoplayer2.p186e.C7279i r10) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.f16438k
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = -1
            r9.f16437j = r0
            r10.mo53899a()
            long r1 = r10.mo53892c()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0018
            r9.m19985b(r10)
        L_0x0018:
            r1 = 0
            r2 = 0
        L_0x001a:
            r5 = 1
            com.applovin.exoplayer2.l.y r6 = r9.f16432e     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.mo55077d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 2
            boolean r6 = r10.mo53905b(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 == 0) goto L_0x0076
            com.applovin.exoplayer2.l.y r6 = r9.f16432e     // Catch:{ EOFException -> 0x0076 }
            r6.mo55076d(r1)     // Catch:{ EOFException -> 0x0076 }
            com.applovin.exoplayer2.l.y r6 = r9.f16432e     // Catch:{ EOFException -> 0x0076 }
            int r6 = r6.mo55085i()     // Catch:{ EOFException -> 0x0076 }
            boolean r6 = com.applovin.exoplayer2.p186e.p195i.C7298f.m19995a((int) r6)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x003a
            goto L_0x0077
        L_0x003a:
            com.applovin.exoplayer2.l.y r6 = r9.f16432e     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.mo55077d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 4
            boolean r6 = r10.mo53905b(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            com.applovin.exoplayer2.l.x r6 = r9.f16433f     // Catch:{ EOFException -> 0x0076 }
            r7 = 14
            r6.mo55044a((int) r7)     // Catch:{ EOFException -> 0x0076 }
            com.applovin.exoplayer2.l.x r6 = r9.f16433f     // Catch:{ EOFException -> 0x0076 }
            r7 = 13
            int r6 = r6.mo55054c(r7)     // Catch:{ EOFException -> 0x0076 }
            r7 = 6
            if (r6 <= r7) goto L_0x006c
            long r7 = (long) r6     // Catch:{ EOFException -> 0x0076 }
            long r3 = r3 + r7
            int r2 = r2 + 1
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r7) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            int r6 = r6 + -6
            boolean r6 = r10.mo53904b(r6, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x001a
        L_0x006b:
            goto L_0x0076
        L_0x006c:
            r9.f16438k = r5     // Catch:{ EOFException -> 0x0076 }
            java.lang.String r1 = "Malformed ADTS stream"
            r6 = 0
            com.applovin.exoplayer2.ai r1 = com.applovin.exoplayer2.C6809ai.m17540b(r1, r6)     // Catch:{ EOFException -> 0x0076 }
            throw r1     // Catch:{ EOFException -> 0x0076 }
        L_0x0076:
            r1 = r2
        L_0x0077:
            r10.mo53899a()
            if (r1 <= 0) goto L_0x0082
            long r0 = (long) r1
            long r3 = r3 / r0
            int r10 = (int) r3
            r9.f16437j = r10
            goto L_0x0084
        L_0x0082:
            r9.f16437j = r0
        L_0x0084:
            r9.f16438k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7297e.m19987c(com.applovin.exoplayer2.e.i):void");
    }

    /* renamed from: a */
    public int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        C7717a.m22115a(this.f16434g);
        long d = iVar.mo53893d();
        int i = this.f16429b;
        if (((i & 2) == 0 && ((i & 1) == 0 || d == -1)) ? false : true) {
            m19987c(iVar);
        }
        int a = iVar.mo53898a(this.f16431d.mo55077d(), 0, 2048);
        boolean z = a == -1;
        m19983a(d, z);
        if (z) {
            return -1;
        }
        this.f16431d.mo55076d(0);
        this.f16431d.mo55075c(a);
        if (!this.f16439l) {
            this.f16430c.mo54030a(this.f16435h, 4);
            this.f16439l = true;
        }
        this.f16430c.mo54032a(this.f16431d);
        return 0;
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        this.f16439l = false;
        this.f16430c.mo54029a();
        this.f16435h = j2;
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f16434g = jVar;
        this.f16430c.mo54031a(jVar, new C7287ad.C7291d(0, 1));
        jVar.mo53895a();
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        int b = m19985b(iVar);
        int i = b;
        int i2 = 0;
        int i3 = 0;
        do {
            iVar.mo53908d(this.f16432e.mo55077d(), 0, 2);
            this.f16432e.mo55076d(0);
            if (C7298f.m19995a(this.f16432e.mo55085i())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                iVar.mo53908d(this.f16432e.mo55077d(), 0, 4);
                this.f16433f.mo55044a(14);
                int c = this.f16433f.mo55054c(13);
                if (c > 6) {
                    iVar.mo53907c(c - 6);
                    i3 += c;
                }
            }
            i++;
            iVar.mo53899a();
            iVar.mo53907c(i);
            i2 = 0;
            i3 = 0;
        } while (i - b < 8192);
        return false;
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
