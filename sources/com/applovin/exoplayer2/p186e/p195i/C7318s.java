package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.i.s */
public final class C7318s implements C7326x {

    /* renamed from: a */
    private C7864v f16650a;

    /* renamed from: b */
    private C7726ag f16651b;

    /* renamed from: c */
    private C7357x f16652c;

    public C7318s(String str) {
        this.f16650a = new C7864v.C7866a().mo55435f(str).mo55424a();
    }

    /* renamed from: a */
    private void m20136a() {
        C7717a.m22115a(this.f16651b);
        C7728ai.m22198a(this.f16652c);
    }

    /* renamed from: a */
    public void mo54017a(C7726ag agVar, C7329j jVar, C7287ad.C7291d dVar) {
        this.f16651b = agVar;
        dVar.mo54024a();
        C7357x a = jVar.mo53894a(dVar.mo54025b(), 5);
        this.f16652c = a;
        a.mo53953a(this.f16650a);
    }

    /* renamed from: a */
    public void mo54018a(C7772y yVar) {
        m20136a();
        long b = this.f16651b.mo54988b();
        long c = this.f16651b.mo54990c();
        if (b != -9223372036854775807L && c != -9223372036854775807L) {
            if (c != this.f16650a.f18925p) {
                C7864v a = this.f16650a.mo55408a().mo55417a(c).mo55424a();
                this.f16650a = a;
                this.f16652c.mo53953a(a);
            }
            int a2 = yVar.mo55064a();
            this.f16652c.mo53951a(yVar, a2);
            this.f16652c.mo53950a(b, 1, a2, 0, (C7357x.C7358a) null);
        }
    }
}
