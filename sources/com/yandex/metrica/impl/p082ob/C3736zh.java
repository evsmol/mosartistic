package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.zh */
class C3736zh {

    /* renamed from: a */
    private final String f9589a;

    /* renamed from: b */
    private final C3641x2 f9590b;

    /* renamed from: c */
    private final TimeProvider f9591c;

    /* renamed from: d */
    private final C3669xh f9592d;

    C3736zh(String str, C3625wh whVar) {
        this(str, new C3641x2(), new SystemTimeProvider(), new C3669xh(whVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18464a(C2063Gh gh, int i, C2900di diVar) {
        this.f9592d.mo18413a(diVar.f7679g);
        C3641x2 x2Var = this.f9590b;
        long a = this.f9592d.mo18411a(i);
        long j = diVar.f7679g;
        if (x2Var.mo18390b(a, j, "report " + this.f9589a)) {
            ((C2198Jh) gh).mo16033a(this.f9589a, Integer.valueOf(i));
            this.f9592d.mo18412a(i, this.f9591c.currentTimeSeconds());
        }
    }

    C3736zh(String str, C3641x2 x2Var, TimeProvider timeProvider, C3669xh xhVar) {
        this.f9589a = str;
        this.f9590b = x2Var;
        this.f9591c = timeProvider;
        this.f9592d = xhVar;
    }
}
