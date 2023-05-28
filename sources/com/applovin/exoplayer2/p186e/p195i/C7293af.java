package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7190b;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.i.af */
final class C7293af {

    /* renamed from: a */
    private final List<C7864v> f16397a;

    /* renamed from: b */
    private final C7357x[] f16398b;

    public C7293af(List<C7864v> list) {
        this.f16397a = list;
        this.f16398b = new C7357x[list.size()];
    }

    /* renamed from: a */
    public void mo54027a(long j, C7772y yVar) {
        if (yVar.mo55064a() >= 9) {
            int q = yVar.mo55093q();
            int q2 = yVar.mo55093q();
            int h = yVar.mo55084h();
            if (q == 434 && q2 == 1195456820 && h == 3) {
                C7190b.m19343b(j, yVar, this.f16398b);
            }
        }
    }

    /* renamed from: a */
    public void mo54028a(C7329j jVar, C7287ad.C7291d dVar) {
        for (int i = 0; i < this.f16398b.length; i++) {
            dVar.mo54024a();
            C7357x a = jVar.mo53894a(dVar.mo54025b(), 3);
            C7864v vVar = this.f16397a.get(i);
            String str = vVar.f18921l;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            C7717a.m22119a(z, (Object) "Invalid closed caption mime type provided: " + str);
            a.mo53953a(new C7864v.C7866a().mo55421a(dVar.mo54026c()).mo55435f(str).mo55426b(vVar.f18913d).mo55429c(vVar.f18912c).mo55445p(vVar.f18907D).mo55422a(vVar.f18923n).mo55424a());
            this.f16398b[i] = a;
        }
    }
}
