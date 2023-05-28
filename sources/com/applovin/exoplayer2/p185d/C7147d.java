package com.applovin.exoplayer2.p185d;

import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.common.p183a.C6980ax;
import com.applovin.exoplayer2.common.p184b.C7056c;
import com.applovin.exoplayer2.p185d.C7138c;
import com.applovin.exoplayer2.p220k.C7684q;
import com.applovin.exoplayer2.p220k.C7691t;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.d.d */
public final class C7147d implements C7160i {

    /* renamed from: a */
    private final Object f15717a = new Object();

    /* renamed from: b */
    private C6787ab.C6792d f15718b;

    /* renamed from: c */
    private C7157h f15719c;

    /* renamed from: d */
    private C7691t.C7693b f15720d;

    /* renamed from: e */
    private String f15721e;

    /* renamed from: a */
    private C7157h m19104a(C6787ab.C6792d dVar) {
        C7691t.C7693b bVar = this.f15720d;
        if (bVar == null) {
            bVar = new C7684q.C7686a().mo54926a(this.f15721e);
        }
        C7175p pVar = new C7175p(dVar.f14643b == null ? null : dVar.f14643b.toString(), dVar.f14647f, bVar);
        C6980ax<Map.Entry<String, String>> a = dVar.f14644c.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry next = a.next();
            pVar.mo53845a((String) next.getKey(), (String) next.getValue());
        }
        C7138c a2 = new C7138c.C7140a().mo53785a(dVar.f14642a, C7173o.f15750a).mo53786a(dVar.f14645d).mo53789b(dVar.f14646e).mo53787a(C7056c.m18929a((Collection<? extends Number>) dVar.f14648g)).mo53788a((C7177r) pVar);
        a2.mo53782a(0, dVar.mo52623a());
        return a2;
    }

    /* renamed from: a */
    public C7157h mo53794a(C6787ab abVar) {
        C7157h hVar;
        C7717a.m22120b(abVar.f14614c);
        C6787ab.C6792d dVar = abVar.f14614c.f14672c;
        if (dVar == null || C7728ai.f18249a < 18) {
            return C7157h.f15737b;
        }
        synchronized (this.f15717a) {
            if (!C7728ai.m22218a((Object) dVar, (Object) this.f15718b)) {
                this.f15718b = dVar;
                this.f15719c = m19104a(dVar);
            }
            hVar = (C7157h) C7717a.m22120b(this.f15719c);
        }
        return hVar;
    }
}
