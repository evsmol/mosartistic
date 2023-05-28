package com.criteo.publisher.p069k0;

import com.criteo.publisher.C1135h;
import com.criteo.publisher.C1146i;
import com.criteo.publisher.C1330x;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.model.C1267n;
import com.criteo.publisher.model.C1268o;
import com.criteo.publisher.model.C1269p;
import com.criteo.publisher.model.C1271r;
import com.criteo.publisher.model.C1272s;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.criteo.publisher.k0.c */
/* compiled from: CdbCall */
class C1161c extends C1330x {

    /* renamed from: c */
    private final C1166g f3688c;

    /* renamed from: d */
    private final C1269p f3689d;

    /* renamed from: e */
    private final C1146i f3690e;

    /* renamed from: f */
    private final List<C1267n> f3691f;

    /* renamed from: g */
    private final ContextData f3692g;

    /* renamed from: h */
    private final C1135h f3693h;

    C1161c(C1166g gVar, C1269p pVar, C1146i iVar, List<C1267n> list, ContextData contextData, C1135h hVar) {
        this.f3688c = gVar;
        this.f3689d = pVar;
        this.f3690e = iVar;
        this.f3691f = list;
        this.f3692g = contextData;
        this.f3693h = hVar;
    }

    /* renamed from: a */
    public void mo3040a() throws ExecutionException, InterruptedException {
        C1268o a = this.f3689d.mo3558a(this.f3691f, this.f3692g);
        String str = this.f3689d.mo3560a().get();
        this.f3693h.mo3230a(a);
        try {
            C1271r a2 = this.f3688c.mo3263a(a, str);
            m5307a(a2);
            this.f3693h.mo3121a(a, a2);
        } catch (Exception e) {
            this.f3693h.mo3231a(a, e);
        }
    }

    /* renamed from: a */
    private void m5307a(C1271r rVar) {
        long a = this.f3690e.mo3242a();
        for (C1272s a2 : rVar.mo3563b()) {
            a2.mo3568a(a);
        }
    }
}
