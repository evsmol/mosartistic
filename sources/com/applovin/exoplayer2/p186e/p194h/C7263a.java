package com.applovin.exoplayer2.p186e.p194h;

import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7339k;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7356w;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.h.a */
final class C7263a implements C7271f {

    /* renamed from: a */
    private final C7270e f16275a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f16276b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f16277c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7273h f16278d;

    /* renamed from: e */
    private int f16279e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f16280f;

    /* renamed from: g */
    private long f16281g;

    /* renamed from: h */
    private long f16282h;

    /* renamed from: i */
    private long f16283i;

    /* renamed from: j */
    private long f16284j;

    /* renamed from: k */
    private long f16285k;

    /* renamed from: l */
    private long f16286l;

    /* renamed from: com.applovin.exoplayer2.e.h.a$a */
    private final class C7265a implements C7353v {
        private C7265a() {
        }

        /* renamed from: a */
        public C7353v.C7354a mo53869a(long j) {
            return new C7353v.C7354a(new C7356w(j, C7728ai.m22192a((C7263a.this.f16276b + ((C7263a.this.f16278d.mo54010b(j) * (C7263a.this.f16277c - C7263a.this.f16276b)) / C7263a.this.f16280f)) - 30000, C7263a.this.f16276b, C7263a.this.f16277c - 1)));
        }

        /* renamed from: a */
        public boolean mo53870a() {
            return true;
        }

        /* renamed from: b */
        public long mo53871b() {
            return C7263a.this.f16278d.mo54007a(C7263a.this.f16280f);
        }
    }

    public C7263a(C7273h hVar, long j, long j2, long j3, long j4, boolean z) {
        C7717a.m22118a(j >= 0 && j2 > j);
        this.f16278d = hVar;
        this.f16276b = j;
        this.f16277c = j2;
        if (j3 == j2 - j || z) {
            this.f16280f = j4;
            this.f16279e = 4;
        } else {
            this.f16279e = 0;
        }
        this.f16275a = new C7270e();
    }

    /* renamed from: c */
    private long m19805c(C7279i iVar) throws IOException {
        C7279i iVar2 = iVar;
        if (this.f16283i == this.f16284j) {
            return -1;
        }
        long c = iVar.mo53892c();
        if (!this.f16275a.mo54004a(iVar2, this.f16284j)) {
            long j = this.f16283i;
            if (j != c) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f16275a.mo54005a(iVar2, false);
        iVar.mo53899a();
        long j2 = this.f16282h - this.f16275a.f16305c;
        int i = this.f16275a.f16310h + this.f16275a.f16311i;
        if (0 <= j2 && j2 < 72000) {
            return -1;
        }
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            this.f16284j = c;
            this.f16286l = this.f16275a.f16305c;
        } else {
            this.f16283i = iVar.mo53892c() + ((long) i);
            this.f16285k = this.f16275a.f16305c;
        }
        long j3 = this.f16284j;
        long j4 = this.f16283i;
        if (j3 - j4 < 100000) {
            this.f16284j = j4;
            return j4;
        }
        long j5 = ((long) i) * (i2 <= 0 ? 2 : 1);
        long j6 = this.f16284j;
        long j7 = this.f16283i;
        return C7728ai.m22192a((iVar.mo53892c() - j5) + ((j2 * (j6 - j7)) / (this.f16286l - this.f16285k)), j7, j6 - 1);
    }

    /* renamed from: d */
    private void m19807d(C7279i iVar) throws IOException {
        while (true) {
            this.f16275a.mo54003a(iVar);
            this.f16275a.mo54005a(iVar, false);
            if (this.f16275a.f16305c > this.f16282h) {
                iVar.mo53899a();
                return;
            }
            iVar.mo53902b(this.f16275a.f16310h + this.f16275a.f16311i);
            this.f16283i = iVar.mo53892c();
            this.f16285k = this.f16275a.f16305c;
        }
    }

    /* renamed from: a */
    public long mo53988a(C7279i iVar) throws IOException {
        int i = this.f16279e;
        if (i == 0) {
            long c = iVar.mo53892c();
            this.f16281g = c;
            this.f16279e = 1;
            long j = this.f16277c - 65307;
            if (j > c) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long c2 = m19805c(iVar);
                if (c2 != -1) {
                    return c2;
                }
                this.f16279e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            m19807d(iVar);
            this.f16279e = 4;
            return -(this.f16285k + 2);
        }
        this.f16280f = mo53991b(iVar);
        this.f16279e = 4;
        return this.f16281g;
    }

    /* renamed from: a */
    public C7265a mo53992b() {
        if (this.f16280f != 0) {
            return new C7265a();
        }
        return null;
    }

    /* renamed from: a */
    public void mo53990a(long j) {
        this.f16282h = C7728ai.m22192a(j, 0, this.f16280f - 1);
        this.f16279e = 2;
        this.f16283i = this.f16276b;
        this.f16284j = this.f16277c;
        this.f16285k = 0;
        this.f16286l = this.f16280f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo53991b(C7279i iVar) throws IOException {
        long j;
        this.f16275a.mo54002a();
        if (this.f16275a.mo54003a(iVar)) {
            this.f16275a.mo54005a(iVar, false);
            iVar.mo53902b(this.f16275a.f16310h + this.f16275a.f16311i);
            do {
                j = this.f16275a.f16305c;
                if ((this.f16275a.f16304b & 4) == 4 || !this.f16275a.mo54003a(iVar) || iVar.mo53892c() >= this.f16277c || !this.f16275a.mo54005a(iVar, true) || !C7339k.m20221a(iVar, this.f16275a.f16310h + this.f16275a.f16311i)) {
                    return j;
                }
                j = this.f16275a.f16305c;
                break;
            } while (!C7339k.m20221a(iVar, this.f16275a.f16310h + this.f16275a.f16311i));
            return j;
        }
        throw new EOFException();
    }
}
