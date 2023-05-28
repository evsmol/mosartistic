package com.applovin.exoplayer2.p186e.p188b;

import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7341m;
import com.applovin.exoplayer2.p186e.C7343n;
import com.applovin.exoplayer2.p186e.C7345o;
import com.applovin.exoplayer2.p186e.C7346p;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.b.b */
public final class C7194b implements C7262h {

    /* renamed from: a */
    public static final C7340l f15822a = $$Lambda$b$ZvNBplAogxcG8cWz6RJVeMN83TU.INSTANCE;

    /* renamed from: b */
    private final byte[] f15823b;

    /* renamed from: c */
    private final C7772y f15824c;

    /* renamed from: d */
    private final boolean f15825d;

    /* renamed from: e */
    private final C7341m.C7342a f15826e;

    /* renamed from: f */
    private C7329j f15827f;

    /* renamed from: g */
    private C7357x f15828g;

    /* renamed from: h */
    private int f15829h;

    /* renamed from: i */
    private C7399a f15830i;

    /* renamed from: j */
    private C7346p f15831j;

    /* renamed from: k */
    private int f15832k;

    /* renamed from: l */
    private int f15833l;

    /* renamed from: m */
    private C7191a f15834m;

    /* renamed from: n */
    private int f15835n;

    /* renamed from: o */
    private long f15836o;

    public C7194b() {
        this(0);
    }

    public C7194b(int i) {
        this.f15823b = new byte[42];
        this.f15824c = new C7772y(new byte[32768], 0);
        this.f15825d = (i & 1) == 0 ? false : true;
        this.f15826e = new C7341m.C7342a();
        this.f15829h = 0;
    }

    /* renamed from: a */
    private long m19348a(C7772y yVar, boolean z) {
        boolean z2;
        C7717a.m22120b(this.f15831j);
        int c = yVar.mo55074c();
        while (true) {
            if (c <= yVar.mo55072b() - 16) {
                yVar.mo55076d(c);
                if (C7341m.m20231a(yVar, this.f15831j, this.f15833l, this.f15826e)) {
                    break;
                }
                c++;
            } else if (z) {
                while (c <= yVar.mo55072b() - this.f15832k) {
                    yVar.mo55076d(c);
                    boolean z3 = false;
                    try {
                        z2 = C7341m.m20231a(yVar, this.f15831j, this.f15833l, this.f15826e);
                    } catch (IndexOutOfBoundsException unused) {
                        z2 = false;
                    }
                    if (yVar.mo55074c() <= yVar.mo55072b()) {
                        z3 = z2;
                    }
                    if (!z3) {
                        c++;
                    }
                }
                yVar.mo55076d(yVar.mo55072b());
                return -1;
            } else {
                yVar.mo55076d(c);
                return -1;
            }
        }
        yVar.mo55076d(c);
        return this.f15826e.f16747a;
    }

    /* renamed from: a */
    private void m19349a() {
        ((C7357x) C7728ai.m22198a(this.f15828g)).mo53950a((this.f15836o * 1000000) / ((long) ((C7346p) C7728ai.m22198a(this.f15831j)).f16755e), 1, this.f15835n, 0, (C7357x.C7358a) null);
    }

    /* renamed from: b */
    private int m19350b(C7279i iVar, C7352u uVar) throws IOException {
        boolean z;
        C7717a.m22120b(this.f15828g);
        C7717a.m22120b(this.f15831j);
        C7191a aVar = this.f15834m;
        if (aVar != null && aVar.mo53868b()) {
            return this.f15834m.mo53861a(iVar, uVar);
        }
        if (this.f15836o == -1) {
            this.f15836o = C7341m.m20227a(iVar, this.f15831j);
            return 0;
        }
        int b = this.f15824c.mo55072b();
        if (b < 32768) {
            int a = iVar.mo53898a(this.f15824c.mo55077d(), b, 32768 - b);
            z = a == -1;
            if (!z) {
                this.f15824c.mo55075c(b + a);
            } else if (this.f15824c.mo55064a() == 0) {
                m19349a();
                return -1;
            }
        } else {
            z = false;
        }
        int c = this.f15824c.mo55074c();
        int i = this.f15835n;
        int i2 = this.f15832k;
        if (i < i2) {
            C7772y yVar = this.f15824c;
            yVar.mo55079e(Math.min(i2 - i, yVar.mo55064a()));
        }
        long a2 = m19348a(this.f15824c, z);
        int c2 = this.f15824c.mo55074c() - c;
        this.f15824c.mo55076d(c);
        this.f15828g.mo53951a(this.f15824c, c2);
        this.f15835n += c2;
        if (a2 != -1) {
            m19349a();
            this.f15835n = 0;
            this.f15836o = a2;
        }
        if (this.f15824c.mo55064a() < 16) {
            int a3 = this.f15824c.mo55064a();
            System.arraycopy(this.f15824c.mo55077d(), this.f15824c.mo55074c(), this.f15824c.mo55077d(), 0, a3);
            this.f15824c.mo55076d(0);
            this.f15824c.mo55075c(a3);
        }
        return 0;
    }

    /* renamed from: b */
    private C7353v m19351b(long j, long j2) {
        C7717a.m22120b(this.f15831j);
        if (this.f15831j.f16761k != null) {
            return new C7345o(this.f15831j, j);
        }
        if (j2 == -1 || this.f15831j.f16760j <= 0) {
            return new C7353v.C7355b(this.f15831j.mo54076a());
        }
        C7191a aVar = new C7191a(this.f15831j, this.f15833l, j, j2);
        this.f15834m = aVar;
        return aVar.mo53862a();
    }

    /* renamed from: b */
    private void m19352b(C7279i iVar) throws IOException {
        this.f15830i = C7343n.m20241b(iVar, !this.f15825d);
        this.f15829h = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ C7262h[] m19353b() {
        return new C7262h[]{new C7194b()};
    }

    /* renamed from: c */
    private void m19354c(C7279i iVar) throws IOException {
        byte[] bArr = this.f15823b;
        iVar.mo53908d(bArr, 0, bArr.length);
        iVar.mo53899a();
        this.f15829h = 2;
    }

    /* renamed from: d */
    private void m19355d(C7279i iVar) throws IOException {
        C7343n.m20243b(iVar);
        this.f15829h = 3;
    }

    /* renamed from: e */
    private void m19356e(C7279i iVar) throws IOException {
        C7343n.C7344a aVar = new C7343n.C7344a(this.f15831j);
        boolean z = false;
        while (!z) {
            z = C7343n.m20240a(iVar, aVar);
            this.f15831j = (C7346p) C7728ai.m22198a(aVar.f16748a);
        }
        C7717a.m22120b(this.f15831j);
        this.f15832k = Math.max(this.f15831j.f16753c, 6);
        ((C7357x) C7728ai.m22198a(this.f15828g)).mo53953a(this.f15831j.mo54081a(this.f15823b, this.f15830i));
        this.f15829h = 4;
    }

    /* renamed from: f */
    private void m19357f(C7279i iVar) throws IOException {
        this.f15833l = C7343n.m20244c(iVar);
        ((C7329j) C7728ai.m22198a(this.f15827f)).mo53896a(m19351b(iVar.mo53892c(), iVar.mo53893d()));
        this.f15829h = 5;
    }

    /* renamed from: a */
    public int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        int i = this.f15829h;
        if (i == 0) {
            m19352b(iVar);
            return 0;
        } else if (i == 1) {
            m19354c(iVar);
            return 0;
        } else if (i == 2) {
            m19355d(iVar);
            return 0;
        } else if (i == 3) {
            m19356e(iVar);
            return 0;
        } else if (i == 4) {
            m19357f(iVar);
            return 0;
        } else if (i == 5) {
            return m19350b(iVar, uVar);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f15829h = 0;
        } else {
            C7191a aVar = this.f15834m;
            if (aVar != null) {
                aVar.mo53863a(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f15836o = j3;
        this.f15835n = 0;
        this.f15824c.mo55067a(0);
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f15827f = jVar;
        this.f15828g = jVar.mo53894a(0, 1);
        jVar.mo53895a();
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        C7343n.m20238a(iVar, false);
        return C7343n.m20239a(iVar);
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
