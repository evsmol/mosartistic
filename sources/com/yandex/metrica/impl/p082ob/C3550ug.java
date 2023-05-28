package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3480sg;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ug */
public class C3550ug implements C3480sg.C3481a {

    /* renamed from: a */
    private final Set<C2869cg> f9234a;

    /* renamed from: b */
    private boolean f9235b;

    /* renamed from: c */
    private C2895dg f9236c;

    public C3550ug() {
        this(C2007F0.m7154g().mo15750m());
    }

    /* renamed from: a */
    public synchronized void mo16760a(C2895dg dgVar) {
        this.f9236c = dgVar;
        this.f9235b = true;
        for (C2869cg a : this.f9234a) {
            a.mo15775a(this.f9236c);
        }
        this.f9234a.clear();
    }

    C3550ug(C3480sg sgVar) {
        this.f9234a = new HashSet();
        sgVar.mo18213a((C3510tg) new C3703yg(this));
        sgVar.mo18214b();
    }

    /* renamed from: a */
    public synchronized void mo18270a(C2869cg cgVar) {
        this.f9234a.add(cgVar);
        if (this.f9235b) {
            cgVar.mo15775a(this.f9236c);
            this.f9234a.remove(cgVar);
        }
    }
}
