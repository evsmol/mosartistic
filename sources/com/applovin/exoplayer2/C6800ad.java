package com.applovin.exoplayer2;

import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p206h.C7489d;
import com.applovin.exoplayer2.p206h.C7495g;
import com.applovin.exoplayer2.p206h.C7506n;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.C7534x;
import com.applovin.exoplayer2.p219j.C7637d;
import com.applovin.exoplayer2.p219j.C7647j;
import com.applovin.exoplayer2.p219j.C7649k;
import com.applovin.exoplayer2.p220k.C7657b;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7755q;

/* renamed from: com.applovin.exoplayer2.ad */
final class C6800ad {

    /* renamed from: a */
    public final C7506n f14743a;

    /* renamed from: b */
    public final Object f14744b;

    /* renamed from: c */
    public final C7534x[] f14745c;

    /* renamed from: d */
    public boolean f14746d;

    /* renamed from: e */
    public boolean f14747e;

    /* renamed from: f */
    public C6801ae f14748f;

    /* renamed from: g */
    public boolean f14749g;

    /* renamed from: h */
    private final boolean[] f14750h;

    /* renamed from: i */
    private final C6829as[] f14751i;

    /* renamed from: j */
    private final C7647j f14752j;

    /* renamed from: k */
    private final C6804ah f14753k;

    /* renamed from: l */
    private C6800ad f14754l;

    /* renamed from: m */
    private C7483ad f14755m = C7483ad.f17172a;

    /* renamed from: n */
    private C7649k f14756n;

    /* renamed from: o */
    private long f14757o;

    public C6800ad(C6829as[] asVarArr, long j, C7647j jVar, C7657b bVar, C6804ah ahVar, C6801ae aeVar, C7649k kVar) {
        this.f14751i = asVarArr;
        this.f14757o = j;
        this.f14752j = jVar;
        this.f14753k = ahVar;
        this.f14744b = aeVar.f14758a.f17251a;
        this.f14748f = aeVar;
        this.f14756n = kVar;
        this.f14745c = new C7534x[asVarArr.length];
        this.f14750h = new boolean[asVarArr.length];
        this.f14743a = m17428a(aeVar.f14758a, ahVar, bVar, aeVar.f14759b, aeVar.f14761d);
    }

    /* renamed from: a */
    private static C7506n m17428a(C7509p.C7510a aVar, C6804ah ahVar, C7657b bVar, long j, long j2) {
        C7506n a = ahVar.mo52719a(aVar, bVar, j);
        return j2 != -9223372036854775807L ? new C7489d(a, true, 0, j2) : a;
    }

    /* renamed from: a */
    private static void m17429a(C6804ah ahVar, C7506n nVar) {
        try {
            if (nVar instanceof C7489d) {
                nVar = ((C7489d) nVar).f17181a;
            }
            ahVar.mo52720a(nVar);
        } catch (RuntimeException e) {
            C7755q.m22362c("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: a */
    private void m17430a(C7534x[] xVarArr) {
        int i = 0;
        while (true) {
            C6829as[] asVarArr = this.f14751i;
            if (i < asVarArr.length) {
                if (asVarArr[i].mo52850a() == -2) {
                    xVarArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m17431b(C7534x[] xVarArr) {
        int i = 0;
        while (true) {
            C6829as[] asVarArr = this.f14751i;
            if (i < asVarArr.length) {
                if (asVarArr[i].mo52850a() == -2 && this.f14756n.mo54868a(i)) {
                    xVarArr[i] = new C7495g();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    private void m17432k() {
        if (m17434m()) {
            for (int i = 0; i < this.f14756n.f17985a; i++) {
                boolean a = this.f14756n.mo54868a(i);
                C7637d dVar = this.f14756n.f17987c[i];
                if (a && dVar != null) {
                    dVar.mo54798a();
                }
            }
        }
    }

    /* renamed from: l */
    private void m17433l() {
        if (m17434m()) {
            for (int i = 0; i < this.f14756n.f17985a; i++) {
                boolean a = this.f14756n.mo54868a(i);
                C7637d dVar = this.f14756n.f17987c[i];
                if (a && dVar != null) {
                    dVar.mo54800b();
                }
            }
        }
    }

    /* renamed from: m */
    private boolean m17434m() {
        return this.f14754l == null;
    }

    /* renamed from: a */
    public long mo52671a() {
        return this.f14757o;
    }

    /* renamed from: a */
    public long mo52672a(long j) {
        return j + mo52671a();
    }

    /* renamed from: a */
    public long mo52673a(C7649k kVar, long j, boolean z) {
        return mo52674a(kVar, j, z, new boolean[this.f14751i.length]);
    }

    /* renamed from: a */
    public long mo52674a(C7649k kVar, long j, boolean z, boolean[] zArr) {
        C7649k kVar2 = kVar;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= kVar2.f17985a) {
                break;
            }
            boolean[] zArr2 = this.f14750h;
            if (z || !kVar.mo54870a(this.f14756n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m17430a(this.f14745c);
        m17433l();
        this.f14756n = kVar2;
        m17432k();
        long a = this.f14743a.mo54494a(kVar2.f17987c, this.f14750h, this.f14745c, zArr, j);
        m17431b(this.f14745c);
        this.f14747e = false;
        int i2 = 0;
        while (true) {
            C7534x[] xVarArr = this.f14745c;
            if (i2 >= xVarArr.length) {
                return a;
            }
            if (xVarArr[i2] != null) {
                C7717a.m22121b(kVar.mo54868a(i2));
                if (this.f14751i[i2].mo52850a() != -2) {
                    this.f14747e = true;
                }
            } else {
                C7717a.m22121b(kVar2.f17987c[i2] == null);
            }
            i2++;
        }
    }

    /* renamed from: a */
    public void mo52675a(float f, C6904ba baVar) throws C7819p {
        this.f14746d = true;
        this.f14755m = this.f14743a.mo54502b();
        C7649k b = mo52679b(f, baVar);
        long j = this.f14748f.f14759b;
        if (this.f14748f.f14762e != -9223372036854775807L && j >= this.f14748f.f14762e) {
            j = Math.max(0, this.f14748f.f14762e - 1);
        }
        long a = mo52673a(b, j, false);
        this.f14757o += this.f14748f.f14759b - a;
        this.f14748f = this.f14748f.mo52691a(a);
    }

    /* renamed from: a */
    public void mo52676a(C6800ad adVar) {
        if (adVar != this.f14754l) {
            m17433l();
            this.f14754l = adVar;
            m17432k();
        }
    }

    /* renamed from: b */
    public long mo52677b() {
        return this.f14748f.f14759b + this.f14757o;
    }

    /* renamed from: b */
    public long mo52678b(long j) {
        return j - mo52671a();
    }

    /* renamed from: b */
    public C7649k mo52679b(float f, C6904ba baVar) throws C7819p {
        C7649k a = this.f14752j.mo54858a(this.f14751i, mo52688h(), this.f14748f.f14758a, baVar);
        for (C7637d dVar : a.f17987c) {
            if (dVar != null) {
                dVar.mo54799a(f);
            }
        }
        return a;
    }

    /* renamed from: c */
    public void mo52680c(long j) {
        this.f14757o = j;
    }

    /* renamed from: c */
    public boolean mo52681c() {
        return this.f14746d && (!this.f14747e || this.f14743a.mo54506d() == Long.MIN_VALUE);
    }

    /* renamed from: d */
    public long mo52682d() {
        if (!this.f14746d) {
            return this.f14748f.f14759b;
        }
        long d = this.f14747e ? this.f14743a.mo54506d() : Long.MIN_VALUE;
        return d == Long.MIN_VALUE ? this.f14748f.f14762e : d;
    }

    /* renamed from: d */
    public void mo52683d(long j) {
        C7717a.m22121b(m17434m());
        if (this.f14746d) {
            this.f14743a.mo54495a(mo52678b(j));
        }
    }

    /* renamed from: e */
    public long mo52684e() {
        if (!this.f14746d) {
            return 0;
        }
        return this.f14743a.mo54507e();
    }

    /* renamed from: e */
    public void mo52685e(long j) {
        C7717a.m22121b(m17434m());
        this.f14743a.mo54505c(mo52678b(j));
    }

    /* renamed from: f */
    public void mo52686f() {
        m17433l();
        m17429a(this.f14753k, this.f14743a);
    }

    /* renamed from: g */
    public C6800ad mo52687g() {
        return this.f14754l;
    }

    /* renamed from: h */
    public C7483ad mo52688h() {
        return this.f14755m;
    }

    /* renamed from: i */
    public C7649k mo52689i() {
        return this.f14756n;
    }

    /* renamed from: j */
    public void mo52690j() {
        if (this.f14743a instanceof C7489d) {
            ((C7489d) this.f14743a).mo54496a(0, this.f14748f.f14761d == -9223372036854775807L ? Long.MIN_VALUE : this.f14748f.f14761d);
        }
    }
}
