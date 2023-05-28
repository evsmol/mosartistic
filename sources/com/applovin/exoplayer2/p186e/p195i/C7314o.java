package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.i.o */
public final class C7314o implements C7302j {

    /* renamed from: a */
    private final C7772y f16606a = new C7772y(10);

    /* renamed from: b */
    private C7357x f16607b;

    /* renamed from: c */
    private boolean f16608c;

    /* renamed from: d */
    private long f16609d = -9223372036854775807L;

    /* renamed from: e */
    private int f16610e;

    /* renamed from: f */
    private int f16611f;

    /* renamed from: a */
    public void mo54029a() {
        this.f16608c = false;
        this.f16609d = -9223372036854775807L;
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        if ((i & 4) != 0) {
            this.f16608c = true;
            if (j != -9223372036854775807L) {
                this.f16609d = j;
            }
            this.f16610e = 0;
            this.f16611f = 0;
        }
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        dVar.mo54024a();
        C7357x a = jVar.mo53894a(dVar.mo54025b(), 5);
        this.f16607b = a;
        a.mo53953a(new C7864v.C7866a().mo55421a(dVar.mo54026c()).mo55435f("application/id3").mo55424a());
    }

    /* renamed from: a */
    public void mo54032a(C7772y yVar) {
        C7717a.m22115a(this.f16607b);
        if (this.f16608c) {
            int a = yVar.mo55064a();
            int i = this.f16611f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(yVar.mo55077d(), yVar.mo55074c(), this.f16606a.mo55077d(), this.f16611f, min);
                if (this.f16611f + min == 10) {
                    this.f16606a.mo55076d(0);
                    if (73 == this.f16606a.mo55084h() && 68 == this.f16606a.mo55084h() && 51 == this.f16606a.mo55084h()) {
                        this.f16606a.mo55079e(3);
                        this.f16610e = this.f16606a.mo55098v() + 10;
                    } else {
                        C7755q.m22361c("Id3Reader", "Discarding invalid ID3 tag");
                        this.f16608c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f16610e - this.f16611f);
            this.f16607b.mo53951a(yVar, min2);
            this.f16611f += min2;
        }
    }

    /* renamed from: b */
    public void mo54033b() {
        int i;
        C7717a.m22115a(this.f16607b);
        if (this.f16608c && (i = this.f16610e) != 0 && this.f16611f == i) {
            long j = this.f16609d;
            if (j != -9223372036854775807L) {
                this.f16607b.mo53950a(j, 1, i, 0, (C7357x.C7358a) null);
            }
            this.f16608c = false;
        }
    }
}
