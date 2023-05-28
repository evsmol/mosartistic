package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p181b.C6847a;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.i.p */
public final class C7315p implements C7302j {

    /* renamed from: a */
    private final String f16612a;

    /* renamed from: b */
    private final C7772y f16613b;

    /* renamed from: c */
    private final C7771x f16614c;

    /* renamed from: d */
    private C7357x f16615d;

    /* renamed from: e */
    private String f16616e;

    /* renamed from: f */
    private C7864v f16617f;

    /* renamed from: g */
    private int f16618g;

    /* renamed from: h */
    private int f16619h;

    /* renamed from: i */
    private int f16620i;

    /* renamed from: j */
    private int f16621j;

    /* renamed from: k */
    private long f16622k = -9223372036854775807L;

    /* renamed from: l */
    private boolean f16623l;

    /* renamed from: m */
    private int f16624m;

    /* renamed from: n */
    private int f16625n;

    /* renamed from: o */
    private int f16626o;

    /* renamed from: p */
    private boolean f16627p;

    /* renamed from: q */
    private long f16628q;

    /* renamed from: r */
    private int f16629r;

    /* renamed from: s */
    private long f16630s;

    /* renamed from: t */
    private int f16631t;

    /* renamed from: u */
    private String f16632u;

    public C7315p(String str) {
        this.f16612a = str;
        C7772y yVar = new C7772y(1024);
        this.f16613b = yVar;
        this.f16614c = new C7771x(yVar.mo55077d());
    }

    /* renamed from: a */
    private void m20110a(int i) {
        this.f16613b.mo55067a(i);
        this.f16614c.mo55047a(this.f16613b.mo55077d());
    }

    /* renamed from: a */
    private void m20111a(C7771x xVar) throws C6809ai {
        if (!xVar.mo55058e()) {
            this.f16623l = true;
            m20113b(xVar);
        } else if (!this.f16623l) {
            return;
        }
        if (this.f16624m != 0) {
            throw C6809ai.m17540b((String) null, (Throwable) null);
        } else if (this.f16625n == 0) {
            m20112a(xVar, m20116e(xVar));
            if (this.f16627p) {
                xVar.mo55051b((int) this.f16628q);
            }
        } else {
            throw C6809ai.m17540b((String) null, (Throwable) null);
        }
    }

    /* renamed from: a */
    private void m20112a(C7771x xVar, int i) {
        int b = xVar.mo55050b();
        if ((b & 7) == 0) {
            this.f16613b.mo55076d(b >> 3);
        } else {
            xVar.mo55049a(this.f16613b.mo55077d(), 0, i * 8);
            this.f16613b.mo55076d(0);
        }
        this.f16615d.mo53951a(this.f16613b, i);
        long j = this.f16622k;
        if (j != -9223372036854775807L) {
            this.f16615d.mo53950a(j, 1, i, 0, (C7357x.C7358a) null);
            this.f16622k += this.f16630s;
        }
    }

    /* renamed from: b */
    private void m20113b(C7771x xVar) throws C6809ai {
        boolean e;
        int c = xVar.mo55054c(1);
        int c2 = c == 1 ? xVar.mo55054c(1) : 0;
        this.f16624m = c2;
        if (c2 == 0) {
            if (c == 1) {
                m20117f(xVar);
            }
            if (xVar.mo55058e()) {
                this.f16625n = xVar.mo55054c(6);
                int c3 = xVar.mo55054c(4);
                int c4 = xVar.mo55054c(3);
                if (c3 == 0 && c4 == 0) {
                    if (c == 0) {
                        int b = xVar.mo55050b();
                        int d = m20115d(xVar);
                        xVar.mo55044a(b);
                        byte[] bArr = new byte[((d + 7) / 8)];
                        xVar.mo55049a(bArr, 0, d);
                        C7864v a = new C7864v.C7866a().mo55421a(this.f16616e).mo55435f("audio/mp4a-latm").mo55431d(this.f16632u).mo55440k(this.f16631t).mo55441l(this.f16629r).mo55422a((List<byte[]>) Collections.singletonList(bArr)).mo55429c(this.f16612a).mo55424a();
                        if (!a.equals(this.f16617f)) {
                            this.f16617f = a;
                            this.f16630s = 1024000000 / ((long) a.f18935z);
                            this.f16615d.mo53953a(a);
                        }
                    } else {
                        xVar.mo55051b(((int) m20117f(xVar)) - m20115d(xVar));
                    }
                    m20114c(xVar);
                    boolean e2 = xVar.mo55058e();
                    this.f16627p = e2;
                    this.f16628q = 0;
                    if (e2) {
                        if (c == 1) {
                            this.f16628q = m20117f(xVar);
                        } else {
                            do {
                                e = xVar.mo55058e();
                                this.f16628q = (this.f16628q << 8) + ((long) xVar.mo55054c(8));
                            } while (e);
                        }
                    }
                    if (xVar.mo55058e()) {
                        xVar.mo55051b(8);
                        return;
                    }
                    return;
                }
                throw C6809ai.m17540b((String) null, (Throwable) null);
            }
            throw C6809ai.m17540b((String) null, (Throwable) null);
        }
        throw C6809ai.m17540b((String) null, (Throwable) null);
    }

    /* renamed from: c */
    private void m20114c(C7771x xVar) {
        int i;
        int c = xVar.mo55054c(3);
        this.f16626o = c;
        if (c == 0) {
            i = 8;
        } else if (c == 1) {
            i = 9;
        } else if (c == 3 || c == 4 || c == 5) {
            xVar.mo55051b(6);
            return;
        } else if (c == 6 || c == 7) {
            xVar.mo55051b(1);
            return;
        } else {
            throw new IllegalStateException();
        }
        xVar.mo55051b(i);
    }

    /* renamed from: d */
    private int m20115d(C7771x xVar) throws C6809ai {
        int a = xVar.mo55042a();
        C6847a.C6849a a2 = C6847a.m17928a(xVar, true);
        this.f16632u = a2.f14980c;
        this.f16629r = a2.f14978a;
        this.f16631t = a2.f14979b;
        return a - xVar.mo55042a();
    }

    /* renamed from: e */
    private int m20116e(C7771x xVar) throws C6809ai {
        int c;
        if (this.f16626o == 0) {
            int i = 0;
            do {
                c = xVar.mo55054c(8);
                i += c;
            } while (c == 255);
            return i;
        }
        throw C6809ai.m17540b((String) null, (Throwable) null);
    }

    /* renamed from: f */
    private static long m20117f(C7771x xVar) {
        return (long) xVar.mo55054c((xVar.mo55054c(2) + 1) * 8);
    }

    /* renamed from: a */
    public void mo54029a() {
        this.f16618g = 0;
        this.f16622k = -9223372036854775807L;
        this.f16623l = false;
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f16622k = j;
        }
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        dVar.mo54024a();
        this.f16615d = jVar.mo53894a(dVar.mo54025b(), 1);
        this.f16616e = dVar.mo54026c();
    }

    /* renamed from: a */
    public void mo54032a(C7772y yVar) throws C6809ai {
        C7717a.m22115a(this.f16615d);
        while (yVar.mo55064a() > 0) {
            int i = this.f16618g;
            if (i != 0) {
                if (i == 1) {
                    int h = yVar.mo55084h();
                    if ((h & 224) == 224) {
                        this.f16621j = h;
                        this.f16618g = 2;
                    } else if (h == 86) {
                    }
                } else if (i == 2) {
                    int h2 = ((this.f16621j & -225) << 8) | yVar.mo55084h();
                    this.f16620i = h2;
                    if (h2 > this.f16613b.mo55077d().length) {
                        m20110a(this.f16620i);
                    }
                    this.f16619h = 0;
                    this.f16618g = 3;
                } else if (i == 3) {
                    int min = Math.min(yVar.mo55064a(), this.f16620i - this.f16619h);
                    yVar.mo55071a(this.f16614c.f18340a, this.f16619h, min);
                    int i2 = this.f16619h + min;
                    this.f16619h = i2;
                    if (i2 == this.f16620i) {
                        this.f16614c.mo55044a(0);
                        m20111a(this.f16614c);
                    }
                } else {
                    throw new IllegalStateException();
                }
                this.f16618g = 0;
            } else if (yVar.mo55084h() == 86) {
                this.f16618g = 1;
            }
        }
    }

    /* renamed from: b */
    public void mo54033b() {
    }
}
