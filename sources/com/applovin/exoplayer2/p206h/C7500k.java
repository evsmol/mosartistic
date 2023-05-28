package com.applovin.exoplayer2.p206h;

import com.applovin.exoplayer2.C6832av;
import com.applovin.exoplayer2.p206h.C7506n;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p219j.C7637d;
import com.applovin.exoplayer2.p220k.C7657b;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.h.k */
public final class C7500k implements C7506n, C7506n.C7507a {

    /* renamed from: a */
    public final C7509p.C7510a f17222a;

    /* renamed from: b */
    private final long f17223b;

    /* renamed from: c */
    private final C7657b f17224c;

    /* renamed from: d */
    private C7509p f17225d;

    /* renamed from: e */
    private C7506n f17226e;

    /* renamed from: f */
    private C7506n.C7507a f17227f;

    /* renamed from: g */
    private C7501a f17228g;

    /* renamed from: h */
    private boolean f17229h;

    /* renamed from: i */
    private long f17230i = -9223372036854775807L;

    /* renamed from: com.applovin.exoplayer2.h.k$a */
    public interface C7501a {
        /* renamed from: a */
        void mo54535a(C7509p.C7510a aVar);

        /* renamed from: a */
        void mo54536a(C7509p.C7510a aVar, IOException iOException);
    }

    public C7500k(C7509p.C7510a aVar, C7657b bVar, long j) {
        this.f17222a = aVar;
        this.f17224c = bVar;
        this.f17223b = j;
    }

    /* renamed from: e */
    private long m20943e(long j) {
        long j2 = this.f17230i;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    /* renamed from: a */
    public long mo54493a(long j, C6832av avVar) {
        return ((C7506n) C7728ai.m22198a(this.f17226e)).mo54493a(j, avVar);
    }

    /* renamed from: a */
    public long mo54494a(C7637d[] dVarArr, boolean[] zArr, C7534x[] xVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f17230i;
        if (j3 == -9223372036854775807L || j != this.f17223b) {
            j2 = j;
        } else {
            this.f17230i = -9223372036854775807L;
            j2 = j3;
        }
        return ((C7506n) C7728ai.m22198a(this.f17226e)).mo54494a(dVarArr, zArr, xVarArr, zArr2, j2);
    }

    /* renamed from: a */
    public void mo54495a(long j) {
        ((C7506n) C7728ai.m22198a(this.f17226e)).mo54495a(j);
    }

    /* renamed from: a */
    public void mo54497a(long j, boolean z) {
        ((C7506n) C7728ai.m22198a(this.f17226e)).mo54497a(j, z);
    }

    /* renamed from: a */
    public void mo54498a(C7506n.C7507a aVar, long j) {
        this.f17227f = aVar;
        C7506n nVar = this.f17226e;
        if (nVar != null) {
            nVar.mo54498a((C7506n.C7507a) this, m20943e(this.f17223b));
        }
    }

    /* renamed from: a */
    public void mo54499a(C7506n nVar) {
        ((C7506n.C7507a) C7728ai.m22198a(this.f17227f)).mo54499a(this);
        C7501a aVar = this.f17228g;
        if (aVar != null) {
            aVar.mo54535a(this.f17222a);
        }
    }

    /* renamed from: a */
    public void mo54528a(C7509p.C7510a aVar) {
        long e = m20943e(this.f17223b);
        C7506n b = ((C7509p) C7717a.m22120b(this.f17225d)).mo54541b(aVar, this.f17224c, e);
        this.f17226e = b;
        if (this.f17227f != null) {
            b.mo54498a((C7506n.C7507a) this, e);
        }
    }

    /* renamed from: a */
    public void mo54529a(C7509p pVar) {
        C7717a.m22121b(this.f17225d == null);
        this.f17225d = pVar;
    }

    /* renamed from: b */
    public long mo54501b(long j) {
        return ((C7506n) C7728ai.m22198a(this.f17226e)).mo54501b(j);
    }

    /* renamed from: b */
    public C7483ad mo54502b() {
        return ((C7506n) C7728ai.m22198a(this.f17226e)).mo54502b();
    }

    /* renamed from: b */
    public void mo54500a(C7506n nVar) {
        ((C7506n.C7507a) C7728ai.m22198a(this.f17227f)).mo54500a(this);
    }

    /* renamed from: c */
    public long mo54504c() {
        return ((C7506n) C7728ai.m22198a(this.f17226e)).mo54504c();
    }

    /* renamed from: c */
    public boolean mo54505c(long j) {
        C7506n nVar = this.f17226e;
        return nVar != null && nVar.mo54505c(j);
    }

    /* renamed from: d */
    public long mo54506d() {
        return ((C7506n) C7728ai.m22198a(this.f17226e)).mo54506d();
    }

    /* renamed from: d */
    public void mo54531d(long j) {
        this.f17230i = j;
    }

    /* renamed from: e */
    public long mo54507e() {
        return ((C7506n) C7728ai.m22198a(this.f17226e)).mo54507e();
    }

    /* renamed from: e_ */
    public void mo54508e_() throws IOException {
        try {
            if (this.f17226e != null) {
                this.f17226e.mo54508e_();
            } else if (this.f17225d != null) {
                this.f17225d.mo54521e();
            }
        } catch (IOException e) {
            C7501a aVar = this.f17228g;
            if (aVar == null) {
                throw e;
            } else if (!this.f17229h) {
                this.f17229h = true;
                aVar.mo54536a(this.f17222a, e);
            }
        }
    }

    /* renamed from: f */
    public boolean mo54509f() {
        C7506n nVar = this.f17226e;
        return nVar != null && nVar.mo54509f();
    }

    /* renamed from: g */
    public long mo54532g() {
        return this.f17223b;
    }

    /* renamed from: h */
    public long mo54533h() {
        return this.f17230i;
    }

    /* renamed from: i */
    public void mo54534i() {
        if (this.f17226e != null) {
            ((C7509p) C7717a.m22120b(this.f17225d)).mo54539a(this.f17226e);
        }
    }
}
