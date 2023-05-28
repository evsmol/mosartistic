package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.Ob */
public class C2372Ob implements C2058Gc {

    /* renamed from: a */
    private final TimeProvider f6308a;

    /* renamed from: b */
    private final C2994gc f6309b;

    C2372Ob(C2994gc gcVar, TimeProvider timeProvider) {
        this.f6309b = gcVar;
        this.f6308a = timeProvider;
    }

    /* renamed from: a */
    public void mo15822a() {
        this.f6309b.mo17546a(this.f6308a.currentTimeSeconds());
    }
}
