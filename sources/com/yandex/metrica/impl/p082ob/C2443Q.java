package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.Q */
public class C2443Q {

    /* renamed from: a */
    private SystemTimeProvider f6506a;

    public C2443Q() {
        this(new SystemTimeProvider());
    }

    /* renamed from: a */
    public void mo16497a() {
        this.f6506a.elapsedRealtime();
    }

    C2443Q(SystemTimeProvider systemTimeProvider) {
        this.f6506a = systemTimeProvider;
    }
}
