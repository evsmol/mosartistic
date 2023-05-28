package com.applovin.exoplayer2.p186e.p194h;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.h.h */
abstract class C7273h {

    /* renamed from: a */
    private final C7269d f16316a = new C7269d();

    /* renamed from: b */
    private C7357x f16317b;

    /* renamed from: c */
    private C7329j f16318c;

    /* renamed from: d */
    private C7271f f16319d;

    /* renamed from: e */
    private long f16320e;

    /* renamed from: f */
    private long f16321f;

    /* renamed from: g */
    private long f16322g;

    /* renamed from: h */
    private int f16323h;

    /* renamed from: i */
    private int f16324i;

    /* renamed from: j */
    private C7275a f16325j = new C7275a();

    /* renamed from: k */
    private long f16326k;

    /* renamed from: l */
    private boolean f16327l;

    /* renamed from: m */
    private boolean f16328m;

    /* renamed from: com.applovin.exoplayer2.e.h.h$a */
    static class C7275a {

        /* renamed from: a */
        C7864v f16329a;

        /* renamed from: b */
        C7271f f16330b;

        C7275a() {
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.h.h$b */
    private static final class C7276b implements C7271f {
        private C7276b() {
        }

        /* renamed from: a */
        public long mo53988a(C7279i iVar) {
            return -1;
        }

        /* renamed from: a */
        public void mo53990a(long j) {
        }

        /* renamed from: b */
        public C7353v mo53992b() {
            return new C7353v.C7355b(-9223372036854775807L);
        }
    }

    /* renamed from: a */
    private void m19852a() {
        C7717a.m22115a(this.f16317b);
        C7728ai.m22198a(this.f16318c);
    }

    /* renamed from: a */
    private boolean m19853a(C7279i iVar) throws IOException {
        while (this.f16316a.mo53998a(iVar)) {
            this.f16326k = iVar.mo53892c() - this.f16321f;
            if (!mo53994a(this.f16316a.mo54000c(), this.f16321f, this.f16325j)) {
                return true;
            }
            this.f16321f = iVar.mo53892c();
        }
        this.f16323h = 3;
        return false;
    }

    /* renamed from: b */
    private int m19854b(C7279i iVar) throws IOException {
        C7271f bVar;
        if (!m19853a(iVar)) {
            return -1;
        }
        this.f16324i = this.f16325j.f16329a.f18935z;
        if (!this.f16328m) {
            this.f16317b.mo53953a(this.f16325j.f16329a);
            this.f16328m = true;
        }
        if (this.f16325j.f16330b != null) {
            bVar = this.f16325j.f16330b;
        } else if (iVar.mo53893d() == -1) {
            bVar = new C7276b();
        } else {
            C7270e b = this.f16316a.mo53999b();
            this.f16319d = new C7263a(this, this.f16321f, iVar.mo53893d(), (long) (b.f16310h + b.f16311i), b.f16305c, (b.f16304b & 4) != 0);
            this.f16323h = 2;
            this.f16316a.mo54001d();
            return 0;
        }
        this.f16319d = bVar;
        this.f16323h = 2;
        this.f16316a.mo54001d();
        return 0;
    }

    /* renamed from: b */
    private int m19855b(C7279i iVar, C7352u uVar) throws IOException {
        C7279i iVar2 = iVar;
        long a = this.f16319d.mo53988a(iVar2);
        if (a >= 0) {
            uVar.f16774a = a;
            return 1;
        }
        if (a < -1) {
            mo54011c(-(a + 2));
        }
        if (!this.f16327l) {
            this.f16318c.mo53896a((C7353v) C7717a.m22115a(this.f16319d.mo53992b()));
            this.f16327l = true;
        }
        if (this.f16326k > 0 || this.f16316a.mo53998a(iVar2)) {
            this.f16326k = 0;
            C7772y c = this.f16316a.mo54000c();
            long b = mo53995b(c);
            if (b >= 0) {
                long j = this.f16322g;
                if (j + b >= this.f16320e) {
                    long a2 = mo54007a(j);
                    this.f16317b.mo53951a(c, c.mo55072b());
                    this.f16317b.mo53950a(a2, 1, c.mo55072b(), 0, (C7357x.C7358a) null);
                    this.f16320e = -1;
                }
            }
            this.f16322g += b;
            return 0;
        }
        this.f16323h = 3;
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo54006a(C7279i iVar, C7352u uVar) throws IOException {
        m19852a();
        int i = this.f16323h;
        if (i == 0) {
            return m19854b(iVar);
        }
        if (i == 1) {
            iVar.mo53902b((int) this.f16321f);
            this.f16323h = 2;
            return 0;
        } else if (i == 2) {
            C7728ai.m22198a(this.f16319d);
            return m19855b(iVar, uVar);
        } else if (i == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo54007a(long j) {
        return (j * 1000000) / ((long) this.f16324i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54008a(long j, long j2) {
        this.f16316a.mo53997a();
        if (j == 0) {
            mo53993a(!this.f16327l);
        } else if (this.f16323h != 0) {
            this.f16320e = mo54010b(j2);
            ((C7271f) C7728ai.m22198a(this.f16319d)).mo53990a(this.f16320e);
            this.f16323h = 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54009a(C7329j jVar, C7357x xVar) {
        this.f16318c = jVar;
        this.f16317b = xVar;
        mo53993a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53993a(boolean z) {
        int i;
        if (z) {
            this.f16325j = new C7275a();
            this.f16321f = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.f16323h = i;
        this.f16320e = -1;
        this.f16322g = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo53994a(C7772y yVar, long j, C7275a aVar) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo54010b(long j) {
        return (((long) this.f16324i) * j) / 1000000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract long mo53995b(C7772y yVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo54011c(long j) {
        this.f16322g = j;
    }
}
