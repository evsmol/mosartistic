package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p082ob.C2187Je;
import com.yandex.metrica.impl.p082ob.C2252Kn;
import com.yandex.metrica.impl.p082ob.C2375Oe;
import com.yandex.metrica.impl.p082ob.C2430Pe;
import com.yandex.metrica.impl.p082ob.C2836bf;

public final class CounterAttribute {

    /* renamed from: a */
    private final C2430Pe f9739a;

    CounterAttribute(String str, C2252Kn<String> kn, C2187Je je) {
        this.f9739a = new C2430Pe(str, kn, je);
    }

    public UserProfileUpdate<? extends C2836bf> withDelta(double d) {
        return new UserProfileUpdate<>(new C2375Oe(this.f9739a.mo16469a(), d));
    }
}
