package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p181b.C6847a;
import com.applovin.exoplayer2.p186e.C7232g;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.i.f */
public final class C7298f implements C7302j {

    /* renamed from: a */
    private static final byte[] f16441a = {73, 68, 51};

    /* renamed from: b */
    private final boolean f16442b;

    /* renamed from: c */
    private final C7771x f16443c;

    /* renamed from: d */
    private final C7772y f16444d;

    /* renamed from: e */
    private final String f16445e;

    /* renamed from: f */
    private String f16446f;

    /* renamed from: g */
    private C7357x f16447g;

    /* renamed from: h */
    private C7357x f16448h;

    /* renamed from: i */
    private int f16449i;

    /* renamed from: j */
    private int f16450j;

    /* renamed from: k */
    private int f16451k;

    /* renamed from: l */
    private boolean f16452l;

    /* renamed from: m */
    private boolean f16453m;

    /* renamed from: n */
    private int f16454n;

    /* renamed from: o */
    private int f16455o;

    /* renamed from: p */
    private int f16456p;

    /* renamed from: q */
    private boolean f16457q;

    /* renamed from: r */
    private long f16458r;

    /* renamed from: s */
    private int f16459s;

    /* renamed from: t */
    private long f16460t;

    /* renamed from: u */
    private C7357x f16461u;

    /* renamed from: v */
    private long f16462v;

    public C7298f(boolean z) {
        this(z, (String) null);
    }

    public C7298f(boolean z, String str) {
        this.f16443c = new C7771x(new byte[7]);
        this.f16444d = new C7772y(Arrays.copyOf(f16441a, 10));
        m20003e();
        this.f16454n = -1;
        this.f16455o = -1;
        this.f16458r = -9223372036854775807L;
        this.f16460t = -9223372036854775807L;
        this.f16442b = z;
        this.f16445e = str;
    }

    /* renamed from: a */
    private void m19993a(C7357x xVar, long j, int i, int i2) {
        this.f16449i = 4;
        this.f16450j = i;
        this.f16461u = xVar;
        this.f16462v = j;
        this.f16459s = i2;
    }

    /* renamed from: a */
    private boolean m19994a(byte b, byte b2) {
        return m19995a((int) ((b & 255) << 8) | (b2 & 255));
    }

    /* renamed from: a */
    public static boolean m19995a(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: a */
    private boolean m19996a(C7772y yVar, int i) {
        yVar.mo55076d(i + 1);
        if (!m19999b(yVar, this.f16443c.f18340a, 1)) {
            return false;
        }
        this.f16443c.mo55044a(4);
        int c = this.f16443c.mo55054c(1);
        int i2 = this.f16454n;
        if (i2 != -1 && c != i2) {
            return false;
        }
        if (this.f16455o != -1) {
            if (!m19999b(yVar, this.f16443c.f18340a, 1)) {
                return true;
            }
            this.f16443c.mo55044a(2);
            if (this.f16443c.mo55054c(4) != this.f16455o) {
                return false;
            }
            yVar.mo55076d(i + 2);
        }
        if (!m19999b(yVar, this.f16443c.f18340a, 4)) {
            return true;
        }
        this.f16443c.mo55044a(14);
        int c2 = this.f16443c.mo55054c(13);
        if (c2 < 7) {
            return false;
        }
        byte[] d = yVar.mo55077d();
        int b = yVar.mo55072b();
        int i3 = i + c2;
        if (i3 >= b) {
            return true;
        }
        if (d[i3] == -1) {
            int i4 = i3 + 1;
            if (i4 == b) {
                return true;
            }
            return m19994a((byte) -1, d[i4]) && ((d[i4] & 8) >> 3) == c;
        } else if (d[i3] != 73) {
            return false;
        } else {
            int i5 = i3 + 1;
            if (i5 == b) {
                return true;
            }
            if (d[i5] != 68) {
                return false;
            }
            int i6 = i3 + 2;
            return i6 == b || d[i6] == 51;
        }
    }

    /* renamed from: a */
    private boolean m19997a(C7772y yVar, byte[] bArr, int i) {
        int min = Math.min(yVar.mo55064a(), i - this.f16450j);
        yVar.mo55071a(bArr, this.f16450j, min);
        int i2 = this.f16450j + min;
        this.f16450j = i2;
        return i2 == i;
    }

    /* renamed from: b */
    private void m19998b(C7772y yVar) {
        int i;
        byte[] d = yVar.mo55077d();
        int c = yVar.mo55074c();
        int b = yVar.mo55072b();
        while (c < b) {
            int i2 = c + 1;
            byte b2 = d[c] & 255;
            if (this.f16451k != 512 || !m19994a((byte) -1, (byte) b2) || (!this.f16453m && !m19996a(yVar, i2 - 2))) {
                int i3 = this.f16451k;
                byte b3 = b2 | i3;
                if (b3 != 329) {
                    if (b3 == 511) {
                        this.f16451k = 512;
                    } else if (b3 == 836) {
                        i = 1024;
                    } else if (b3 == 1075) {
                        m20004f();
                        yVar.mo55076d(i2);
                        return;
                    } else if (i3 != 256) {
                        this.f16451k = 256;
                        i2--;
                    }
                    c = i2;
                } else {
                    i = 768;
                }
                this.f16451k = i;
                c = i2;
            } else {
                this.f16456p = (b2 & 8) >> 3;
                boolean z = true;
                if ((b2 & 1) != 0) {
                    z = false;
                }
                this.f16452l = z;
                if (!this.f16453m) {
                    m20006h();
                } else {
                    m20005g();
                }
                yVar.mo55076d(i2);
                return;
            }
        }
        yVar.mo55076d(c);
    }

    /* renamed from: b */
    private boolean m19999b(C7772y yVar, byte[] bArr, int i) {
        if (yVar.mo55064a() < i) {
            return false;
        }
        yVar.mo55071a(bArr, 0, i);
        return true;
    }

    /* renamed from: c */
    private void m20000c(C7772y yVar) {
        if (yVar.mo55064a() != 0) {
            this.f16443c.f18340a[0] = yVar.mo55077d()[yVar.mo55074c()];
            this.f16443c.mo55044a(2);
            int c = this.f16443c.mo55054c(4);
            int i = this.f16455o;
            if (i == -1 || c == i) {
                if (!this.f16453m) {
                    this.f16453m = true;
                    this.f16454n = this.f16456p;
                    this.f16455o = c;
                }
                m20005g();
                return;
            }
            m20001d();
        }
    }

    /* renamed from: d */
    private void m20001d() {
        this.f16453m = false;
        m20003e();
    }

    /* renamed from: d */
    private void m20002d(C7772y yVar) {
        int min = Math.min(yVar.mo55064a(), this.f16459s - this.f16450j);
        this.f16461u.mo53951a(yVar, min);
        int i = this.f16450j + min;
        this.f16450j = i;
        int i2 = this.f16459s;
        if (i == i2) {
            long j = this.f16460t;
            if (j != -9223372036854775807L) {
                this.f16461u.mo53950a(j, 1, i2, 0, (C7357x.C7358a) null);
                this.f16460t += this.f16462v;
            }
            m20003e();
        }
    }

    /* renamed from: e */
    private void m20003e() {
        this.f16449i = 0;
        this.f16450j = 0;
        this.f16451k = 256;
    }

    /* renamed from: f */
    private void m20004f() {
        this.f16449i = 2;
        this.f16450j = f16441a.length;
        this.f16459s = 0;
        this.f16444d.mo55076d(0);
    }

    /* renamed from: g */
    private void m20005g() {
        this.f16449i = 3;
        this.f16450j = 0;
    }

    /* renamed from: h */
    private void m20006h() {
        this.f16449i = 1;
        this.f16450j = 0;
    }

    /* renamed from: i */
    private void m20007i() {
        this.f16448h.mo53951a(this.f16444d, 10);
        this.f16444d.mo55076d(6);
        m19993a(this.f16448h, 0, 10, this.f16444d.mo55098v() + 10);
    }

    /* renamed from: j */
    private void m20008j() throws C6809ai {
        this.f16443c.mo55044a(0);
        if (!this.f16457q) {
            int c = this.f16443c.mo55054c(2) + 1;
            if (c != 2) {
                C7755q.m22361c("AdtsReader", "Detected audio object type: " + c + ", but assuming AAC LC.");
                c = 2;
            }
            this.f16443c.mo55051b(5);
            byte[] a = C6847a.m17931a(c, this.f16455o, this.f16443c.mo55054c(3));
            C6847a.C6849a a2 = C6847a.m17929a(a);
            C7864v a3 = new C7864v.C7866a().mo55421a(this.f16446f).mo55435f("audio/mp4a-latm").mo55431d(a2.f14980c).mo55440k(a2.f14979b).mo55441l(a2.f14978a).mo55422a((List<byte[]>) Collections.singletonList(a)).mo55429c(this.f16445e).mo55424a();
            this.f16458r = 1024000000 / ((long) a3.f18935z);
            this.f16447g.mo53953a(a3);
            this.f16457q = true;
        } else {
            this.f16443c.mo55051b(10);
        }
        this.f16443c.mo55051b(4);
        int c2 = (this.f16443c.mo55054c(13) - 2) - 5;
        if (this.f16452l) {
            c2 -= 2;
        }
        m19993a(this.f16447g, this.f16458r, 0, c2);
    }

    /* renamed from: k */
    private void m20009k() {
        C7717a.m22120b(this.f16447g);
        C7728ai.m22198a(this.f16461u);
        C7728ai.m22198a(this.f16448h);
    }

    /* renamed from: a */
    public void mo54029a() {
        this.f16460t = -9223372036854775807L;
        m20001d();
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f16460t = j;
        }
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        dVar.mo54024a();
        this.f16446f = dVar.mo54026c();
        C7357x a = jVar.mo53894a(dVar.mo54025b(), 1);
        this.f16447g = a;
        this.f16461u = a;
        if (this.f16442b) {
            dVar.mo54024a();
            C7357x a2 = jVar.mo53894a(dVar.mo54025b(), 5);
            this.f16448h = a2;
            a2.mo53953a(new C7864v.C7866a().mo55421a(dVar.mo54026c()).mo55435f("application/id3").mo55424a());
            return;
        }
        this.f16448h = new C7232g();
    }

    /* renamed from: a */
    public void mo54032a(C7772y yVar) throws C6809ai {
        m20009k();
        while (yVar.mo55064a() > 0) {
            int i = this.f16449i;
            if (i == 0) {
                m19998b(yVar);
            } else if (i == 1) {
                m20000c(yVar);
            } else if (i != 2) {
                if (i == 3) {
                    if (m19997a(yVar, this.f16443c.f18340a, this.f16452l ? 7 : 5)) {
                        m20008j();
                    }
                } else if (i == 4) {
                    m20002d(yVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (m19997a(yVar, this.f16444d.mo55077d(), 10)) {
                m20007i();
            }
        }
    }

    /* renamed from: b */
    public void mo54033b() {
    }

    /* renamed from: c */
    public long mo54034c() {
        return this.f16458r;
    }
}
