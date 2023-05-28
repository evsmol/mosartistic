package com.yandex.metrica.impl.p082ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.ob */
public class C3315ob {

    /* renamed from: a */
    private final List<C3207mb> f8506a;

    /* renamed from: b */
    private final C3347pb f8507b;

    /* renamed from: c */
    private final AtomicBoolean f8508c = new AtomicBoolean(true);

    public C3315ob(List<C3207mb> list, C3347pb pbVar) {
        this.f8506a = list;
        this.f8507b = pbVar;
    }

    /* renamed from: a */
    public void mo17913a() {
        this.f8508c.set(false);
    }

    /* renamed from: b */
    public void mo17914b() {
        this.f8508c.set(true);
    }

    /* renamed from: c */
    public void mo17915c() {
        if (!this.f8508c.get()) {
            return;
        }
        if (this.f8506a.isEmpty()) {
            ((C2259L3) this.f8507b).mo16125c();
            return;
        }
        boolean z = false;
        for (C3207mb a : this.f8506a) {
            z |= a.mo17804a();
        }
        if (z) {
            ((C2259L3) this.f8507b).mo16125c();
        }
    }
}
