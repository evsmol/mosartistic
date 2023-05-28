package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.yandex.metrica.impl.p082ob.C1941D3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.F3 */
public class C2011F3 implements C2416P3, C2472R3, C3131ki {

    /* renamed from: a */
    private final Context f5389a;

    /* renamed from: b */
    private final C2108I3 f5390b;

    /* renamed from: c */
    private final C2927ei f5391c;

    /* renamed from: d */
    private final C3450ri f5392d;

    /* renamed from: e */
    private final C2856c4 f5393e;

    /* renamed from: f */
    private final C3650xb f5394f;

    /* renamed from: g */
    private final C2329N4<C2298M4, C2011F3> f5395g;

    /* renamed from: h */
    private final C3603w2<C2011F3> f5396h;

    /* renamed from: i */
    private List<C2645V0> f5397i = new ArrayList();

    /* renamed from: j */
    private final C2176J3<C3247n4> f5398j;

    /* renamed from: k */
    private C2188Jf f5399k;

    /* renamed from: l */
    private final C2290M f5400l;

    /* renamed from: m */
    private final C3550ug f5401m;

    /* renamed from: n */
    private final Object f5402n = new Object();

    /* renamed from: com.yandex.metrica.impl.ob.F3$a */
    class C2012a implements C2869cg {

        /* renamed from: a */
        final /* synthetic */ ResultReceiver f5403a;

        C2012a(C2011F3 f3, ResultReceiver resultReceiver) {
            this.f5403a = resultReceiver;
        }

        /* renamed from: a */
        public void mo15775a(C2895dg dgVar) {
            byte[] bArr;
            ResultReceiver resultReceiver = this.f5403a;
            int i = C2925eg.f7759b;
            if (resultReceiver != null) {
                Bundle bundle = new Bundle();
                if (dgVar == null) {
                    bArr = null;
                } else {
                    bArr = dgVar.mo17458a();
                }
                bundle.putByteArray("referrer", bArr);
                resultReceiver.send(1, bundle);
            }
        }
    }

    C2011F3(Context context, C2927ei eiVar, C2108I3 i3, C1941D3 d3, C2856c4 c4Var, C3480sg sgVar, C2176J3<C3247n4> j3, C2082H3 h3, C2324N n, C3650xb xbVar, C3550ug ugVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5389a = applicationContext;
        this.f5390b = i3;
        this.f5391c = eiVar;
        this.f5393e = c4Var;
        this.f5398j = j3;
        this.f5395g = h3.mo15849a(this);
        C3450ri a = eiVar.mo17555a(applicationContext, i3, d3.f5199a);
        this.f5392d = a;
        this.f5394f = xbVar;
        xbVar.mo18395a(applicationContext, a.mo18175d());
        this.f5400l = n.mo16327a(a, xbVar, applicationContext);
        this.f5396h = h3.mo15850a(this, a);
        this.f5401m = ugVar;
        eiVar.mo17556a(i3, (C3131ki) this);
    }

    /* renamed from: a */
    public void mo15766a(C1941D3.C1942a aVar) {
        this.f5393e.mo17367a(aVar);
    }

    /* renamed from: b */
    public synchronized void mo15774b(C3247n4 n4Var) {
        this.f5398j.mo15978b(n4Var);
    }

    /* renamed from: a */
    public synchronized void mo15771a(C3247n4 n4Var) {
        this.f5398j.mo15977a(n4Var);
        n4Var.mo16053a(this.f5400l.mo16236a(C2572Tl.m8518a(this.f5392d.mo18175d().mo17991v())));
    }

    /* renamed from: b */
    public Context mo15773b() {
        return this.f5389a;
    }

    /* renamed from: a */
    public void mo15769a(C2851c0 c0Var, C3247n4 n4Var) {
        this.f5395g.mo16331a(c0Var, n4Var);
    }

    /* renamed from: a */
    public C1941D3.C1942a mo15764a() {
        return this.f5393e.mo17366a();
    }

    /* renamed from: a */
    public void mo15772a(C3356pi piVar) {
        this.f5394f.mo18396a(piVar);
        synchronized (this.f5402n) {
            for (C3247n4 a : this.f5398j.mo15976a()) {
                a.mo16053a(this.f5400l.mo16236a(C2572Tl.m8518a(piVar.mo17991v())));
            }
            ArrayList arrayList = new ArrayList();
            for (C2645V0 next : this.f5397i) {
                if (next.mo16936a(piVar)) {
                    m7186a(next.mo16938c(), next.mo16935a());
                } else {
                    arrayList.add(next);
                }
            }
            this.f5397i = new ArrayList(arrayList);
            if (!arrayList.isEmpty()) {
                this.f5396h.mo18354d();
            }
        }
        if (this.f5399k == null) {
            this.f5399k = C2007F0.m7154g().mo15749l();
        }
        this.f5399k.mo16006a(piVar);
    }

    /* renamed from: a */
    public void mo15770a(C3004gi giVar, C3356pi piVar) {
        synchronized (this.f5402n) {
            for (C2645V0 next : this.f5397i) {
                ResultReceiver c = next.mo16938c();
                C2253L a = this.f5400l.mo16236a(next.mo16935a());
                int i = C2936f0.f7782b;
                if (c != null) {
                    Bundle bundle = new Bundle();
                    giVar.mo17640a(bundle);
                    a.mo16093c(bundle);
                    c.send(2, bundle);
                }
            }
            this.f5397i.clear();
        }
    }

    /* renamed from: a */
    public void mo15768a(C2645V0 v0) {
        ResultReceiver resultReceiver;
        Map hashMap = new HashMap();
        List<String> list = null;
        if (v0 != null) {
            list = v0.mo16937b();
            resultReceiver = v0.mo16938c();
            hashMap = v0.mo16935a();
        } else {
            resultReceiver = null;
        }
        boolean a = this.f5392d.mo18172a(list, hashMap);
        if (!a) {
            m7186a(resultReceiver, (Map<String, String>) hashMap);
        }
        if (this.f5392d.mo18176e()) {
            synchronized (this.f5402n) {
                if (a && v0 != null) {
                    this.f5397i.add(v0);
                }
            }
            this.f5396h.mo18354d();
        } else if (a) {
            m7186a(resultReceiver, (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public void mo15765a(ResultReceiver resultReceiver) {
        this.f5401m.mo18270a((C2869cg) new C2012a(this, resultReceiver));
    }

    /* renamed from: a */
    public void mo15767a(C1941D3 d3) {
        this.f5392d.mo18169a(d3.f5199a);
        this.f5393e.mo17367a(d3.f5200b);
    }

    /* renamed from: a */
    private void m7186a(ResultReceiver resultReceiver, Map<String, String> map) {
        C2253L a = this.f5400l.mo16236a(map);
        int i = C2936f0.f7782b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            a.mo16093c(bundle);
            resultReceiver.send(1, bundle);
        }
    }
}
