package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p181b.C6850b;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.i.b */
public final class C7294b implements C7302j {

    /* renamed from: a */
    private final C7771x f16399a;

    /* renamed from: b */
    private final C7772y f16400b;

    /* renamed from: c */
    private final String f16401c;

    /* renamed from: d */
    private String f16402d;

    /* renamed from: e */
    private C7357x f16403e;

    /* renamed from: f */
    private int f16404f;

    /* renamed from: g */
    private int f16405g;

    /* renamed from: h */
    private boolean f16406h;

    /* renamed from: i */
    private long f16407i;

    /* renamed from: j */
    private C7864v f16408j;

    /* renamed from: k */
    private int f16409k;

    /* renamed from: l */
    private long f16410l;

    public C7294b() {
        this((String) null);
    }

    public C7294b(String str) {
        C7771x xVar = new C7771x(new byte[128]);
        this.f16399a = xVar;
        this.f16400b = new C7772y(xVar.f18340a);
        this.f16404f = 0;
        this.f16410l = -9223372036854775807L;
        this.f16401c = str;
    }

    /* renamed from: a */
    private boolean m19960a(C7772y yVar, byte[] bArr, int i) {
        int min = Math.min(yVar.mo55064a(), i - this.f16405g);
        yVar.mo55071a(bArr, this.f16405g, min);
        int i2 = this.f16405g + min;
        this.f16405g = i2;
        return i2 == i;
    }

    /* renamed from: b */
    private boolean m19961b(C7772y yVar) {
        while (true) {
            boolean z = false;
            if (yVar.mo55064a() <= 0) {
                return false;
            }
            if (this.f16406h) {
                int h = yVar.mo55084h();
                if (h == 119) {
                    this.f16406h = false;
                    return true;
                } else if (h != 11) {
                    this.f16406h = z;
                }
            } else if (yVar.mo55084h() != 11) {
                this.f16406h = z;
            }
            z = true;
            this.f16406h = z;
        }
    }

    /* renamed from: c */
    private void m19962c() {
        this.f16399a.mo55044a(0);
        C6850b.C6852a a = C6850b.m17937a(this.f16399a);
        if (this.f16408j == null || a.f14990d != this.f16408j.f18934y || a.f14989c != this.f16408j.f18935z || !C7728ai.m22218a((Object) a.f14987a, (Object) this.f16408j.f18921l)) {
            C7864v a2 = new C7864v.C7866a().mo55421a(this.f16402d).mo55435f(a.f14987a).mo55440k(a.f14990d).mo55441l(a.f14989c).mo55429c(this.f16401c).mo55424a();
            this.f16408j = a2;
            this.f16403e.mo53953a(a2);
        }
        this.f16409k = a.f14991e;
        this.f16407i = (((long) a.f14992f) * 1000000) / ((long) this.f16408j.f18935z);
    }

    /* renamed from: a */
    public void mo54029a() {
        this.f16404f = 0;
        this.f16405g = 0;
        this.f16406h = false;
        this.f16410l = -9223372036854775807L;
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f16410l = j;
        }
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        dVar.mo54024a();
        this.f16402d = dVar.mo54026c();
        this.f16403e = jVar.mo53894a(dVar.mo54025b(), 1);
    }

    /* renamed from: a */
    public void mo54032a(C7772y yVar) {
        C7717a.m22115a(this.f16403e);
        while (yVar.mo55064a() > 0) {
            int i = this.f16404f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(yVar.mo55064a(), this.f16409k - this.f16405g);
                        this.f16403e.mo53951a(yVar, min);
                        int i2 = this.f16405g + min;
                        this.f16405g = i2;
                        int i3 = this.f16409k;
                        if (i2 == i3) {
                            long j = this.f16410l;
                            if (j != -9223372036854775807L) {
                                this.f16403e.mo53950a(j, 1, i3, 0, (C7357x.C7358a) null);
                                this.f16410l += this.f16407i;
                            }
                            this.f16404f = 0;
                        }
                    }
                } else if (m19960a(yVar, this.f16400b.mo55077d(), 128)) {
                    m19962c();
                    this.f16400b.mo55076d(0);
                    this.f16403e.mo53951a(this.f16400b, 128);
                    this.f16404f = 2;
                }
            } else if (m19961b(yVar)) {
                this.f16404f = 1;
                this.f16400b.mo55077d()[0] = Ascii.f15555VT;
                this.f16400b.mo55077d()[1] = 119;
                this.f16405g = 2;
            }
        }
    }

    /* renamed from: b */
    public void mo54033b() {
    }
}
