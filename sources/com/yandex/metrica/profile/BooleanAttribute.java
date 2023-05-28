package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p082ob.C2187Je;
import com.yandex.metrica.impl.p082ob.C2252Kn;
import com.yandex.metrica.impl.p082ob.C2273Le;
import com.yandex.metrica.impl.p082ob.C2308Me;
import com.yandex.metrica.impl.p082ob.C2430Pe;
import com.yandex.metrica.impl.p082ob.C2662Ve;
import com.yandex.metrica.impl.p082ob.C2688We;
import com.yandex.metrica.impl.p082ob.C2836bf;

public class BooleanAttribute {

    /* renamed from: a */
    private final C2430Pe f9738a;

    BooleanAttribute(String str, C2252Kn<String> kn, C2187Je je) {
        this.f9738a = new C2430Pe(str, kn, je);
    }

    public UserProfileUpdate<? extends C2836bf> withValue(boolean z) {
        return new UserProfileUpdate<>(new C2273Le(this.f9738a.mo16469a(), z, this.f9738a.mo16470b(), new C2308Me(this.f9738a.mo16471c())));
    }

    public UserProfileUpdate<? extends C2836bf> withValueIfUndefined(boolean z) {
        return new UserProfileUpdate<>(new C2273Le(this.f9738a.mo16469a(), z, this.f9738a.mo16470b(), new C2688We(this.f9738a.mo16471c())));
    }

    public UserProfileUpdate<? extends C2836bf> withValueReset() {
        return new UserProfileUpdate<>(new C2662Ve(3, this.f9738a.mo16469a(), this.f9738a.mo16470b(), this.f9738a.mo16471c()));
    }
}
