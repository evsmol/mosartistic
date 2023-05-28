package com.applovin.exoplayer2.p186e.p190d;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.p193g.C7251g;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.p204f.C7452b;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.d.a */
public final class C7203a implements C7262h {

    /* renamed from: a */
    private final C7772y f15881a = new C7772y(6);

    /* renamed from: b */
    private C7329j f15882b;

    /* renamed from: c */
    private int f15883c;

    /* renamed from: d */
    private int f15884d;

    /* renamed from: e */
    private int f15885e;

    /* renamed from: f */
    private long f15886f = -1;

    /* renamed from: g */
    private C7452b f15887g;

    /* renamed from: h */
    private C7279i f15888h;

    /* renamed from: i */
    private C7206c f15889i;

    /* renamed from: j */
    private C7251g f15890j;

    /* renamed from: a */
    private static C7452b m19408a(String str, long j) throws IOException {
        C7204b a;
        if (j == -1 || (a = C7209e.m19435a(str)) == null) {
            return null;
        }
        return a.mo53890a(j);
    }

    /* renamed from: a */
    private void m19409a() {
        m19410a((C7399a.C7401a) C7717a.m22120b(this.f15887g));
        this.f15883c = 5;
    }

    /* renamed from: a */
    private void m19410a(C7399a.C7401a... aVarArr) {
        ((C7329j) C7717a.m22120b(this.f15882b)).mo53894a(1024, 4).mo53953a(new C7864v.C7866a().mo55433e("image/jpeg").mo55419a(new C7399a(aVarArr)).mo55424a());
    }

    /* renamed from: b */
    private int m19411b(C7279i iVar) throws IOException {
        this.f15881a.mo55067a(2);
        iVar.mo53908d(this.f15881a.mo55077d(), 0, 2);
        return this.f15881a.mo55085i();
    }

    /* renamed from: b */
    private void m19412b() {
        m19410a(new C7399a.C7401a[0]);
        ((C7329j) C7717a.m22120b(this.f15882b)).mo53895a();
        this.f15882b.mo53896a(new C7353v.C7355b(-9223372036854775807L));
        this.f15883c = 6;
    }

    /* renamed from: c */
    private void m19413c(C7279i iVar) throws IOException {
        this.f15881a.mo55067a(2);
        iVar.mo53908d(this.f15881a.mo55077d(), 0, 2);
        iVar.mo53907c(this.f15881a.mo55085i() - 2);
    }

    /* renamed from: d */
    private void m19414d(C7279i iVar) throws IOException {
        int i;
        this.f15881a.mo55067a(2);
        iVar.mo53903b(this.f15881a.mo55077d(), 0, 2);
        int i2 = this.f15881a.mo55085i();
        this.f15884d = i2;
        if (i2 == 65498) {
            if (this.f15886f != -1) {
                i = 4;
            } else {
                m19412b();
                return;
            }
        } else if ((i2 < 65488 || i2 > 65497) && this.f15884d != 65281) {
            i = 1;
        } else {
            return;
        }
        this.f15883c = i;
    }

    /* renamed from: e */
    private void m19415e(C7279i iVar) throws IOException {
        this.f15881a.mo55067a(2);
        iVar.mo53903b(this.f15881a.mo55077d(), 0, 2);
        this.f15885e = this.f15881a.mo55085i() - 2;
        this.f15883c = 2;
    }

    /* renamed from: f */
    private void m19416f(C7279i iVar) throws IOException {
        String B;
        if (this.f15884d == 65505) {
            C7772y yVar = new C7772y(this.f15885e);
            iVar.mo53903b(yVar.mo55077d(), 0, this.f15885e);
            if (this.f15887g == null && "http://ns.adobe.com/xap/1.0/".equals(yVar.mo55061B()) && (B = yVar.mo55061B()) != null) {
                C7452b a = m19408a(B, iVar.mo53893d());
                this.f15887g = a;
                if (a != null) {
                    this.f15886f = a.f17075d;
                }
            }
        } else {
            iVar.mo53902b(this.f15885e);
        }
        this.f15883c = 0;
    }

    /* renamed from: g */
    private void m19417g(C7279i iVar) throws IOException {
        if (iVar.mo53905b(this.f15881a.mo55077d(), 0, 1, true)) {
            iVar.mo53899a();
            if (this.f15890j == null) {
                this.f15890j = new C7251g();
            }
            C7206c cVar = new C7206c(iVar, this.f15886f);
            this.f15889i = cVar;
            if (this.f15890j.mo53879a((C7279i) cVar)) {
                this.f15890j.mo53878a((C7329j) new C7207d(this.f15886f, (C7329j) C7717a.m22120b(this.f15882b)));
                m19409a();
                return;
            }
        }
        m19412b();
    }

    /* renamed from: a */
    public int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        int i = this.f15883c;
        if (i == 0) {
            m19414d(iVar);
            return 0;
        } else if (i == 1) {
            m19415e(iVar);
            return 0;
        } else if (i == 2) {
            m19416f(iVar);
            return 0;
        } else if (i == 4) {
            long c = iVar.mo53892c();
            long j = this.f15886f;
            if (c != j) {
                uVar.f16774a = j;
                return 1;
            }
            m19417g(iVar);
            return 0;
        } else if (i == 5) {
            if (this.f15889i == null || iVar != this.f15888h) {
                this.f15888h = iVar;
                this.f15889i = new C7206c(iVar, this.f15886f);
            }
            int a = ((C7251g) C7717a.m22120b(this.f15890j)).mo53876a((C7279i) this.f15889i, uVar);
            if (a == 1) {
                uVar.f16774a += this.f15886f;
            }
            return a;
        } else if (i == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        if (j == 0) {
            this.f15883c = 0;
            this.f15890j = null;
        } else if (this.f15883c == 5) {
            ((C7251g) C7717a.m22120b(this.f15890j)).mo53877a(j, j2);
        }
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f15882b = jVar;
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        if (m19411b(iVar) != 65496) {
            return false;
        }
        int b = m19411b(iVar);
        this.f15884d = b;
        if (b == 65504) {
            m19413c(iVar);
            this.f15884d = m19411b(iVar);
        }
        if (this.f15884d != 65505) {
            return false;
        }
        iVar.mo53907c(2);
        this.f15881a.mo55067a(6);
        iVar.mo53908d(this.f15881a.mo55077d(), 0, 6);
        return this.f15881a.mo55091o() == 1165519206 && this.f15881a.mo55085i() == 0;
    }

    /* renamed from: c */
    public void mo53880c() {
        C7251g gVar = this.f15890j;
        if (gVar != null) {
            gVar.mo53880c();
        }
    }
}
