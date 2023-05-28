package com.yandex.metrica.impl.p082ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.qb */
public class C3394qb implements C3207mb, C3257nb {

    /* renamed from: a */
    private final C2757Z3 f8724a;

    /* renamed from: b */
    private AtomicLong f8725b;

    public C3394qb(C2265L7 l7, C2757Z3 z3) {
        this.f8724a = z3;
        this.f8725b = new AtomicLong(l7.mo16162c());
        l7.mo16157a((C3257nb) this);
    }

    /* renamed from: a */
    public boolean mo17804a() {
        return this.f8725b.get() >= ((long) ((C2275Lg) this.f8724a.mo15828b()).mo16192I());
    }

    /* renamed from: b */
    public void mo17805b(List<Integer> list) {
        this.f8725b.addAndGet((long) (-list.size()));
    }

    /* renamed from: a */
    public void mo17803a(List<Integer> list) {
        this.f8725b.addAndGet((long) list.size());
    }
}
