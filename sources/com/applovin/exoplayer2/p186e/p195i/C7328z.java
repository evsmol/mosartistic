package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7190b;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.i.z */
public final class C7328z {

    /* renamed from: a */
    private final List<C7864v> f16701a;

    /* renamed from: b */
    private final C7357x[] f16702b;

    public C7328z(List<C7864v> list) {
        this.f16701a = list;
        this.f16702b = new C7357x[list.size()];
    }

    /* renamed from: a */
    public void mo54071a(long j, C7772y yVar) {
        C7190b.m19342a(j, yVar, this.f16702b);
    }

    /* renamed from: a */
    public void mo54072a(C7329j jVar, C7287ad.C7291d dVar) {
        for (int i = 0; i < this.f16702b.length; i++) {
            dVar.mo54024a();
            C7357x a = jVar.mo53894a(dVar.mo54025b(), 3);
            C7864v vVar = this.f16701a.get(i);
            String str = vVar.f18921l;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            C7717a.m22119a(z, (Object) "Invalid closed caption mime type provided: " + str);
            a.mo53953a(new C7864v.C7866a().mo55421a(vVar.f18910a != null ? vVar.f18910a : dVar.mo54026c()).mo55435f(str).mo55426b(vVar.f18913d).mo55429c(vVar.f18912c).mo55445p(vVar.f18907D).mo55422a(vVar.f18923n).mo55424a());
            this.f16702b[i] = a;
        }
    }
}
