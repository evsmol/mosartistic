package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p082ob.C2187Je;
import com.yandex.metrica.impl.p082ob.C2252Kn;
import com.yandex.metrica.impl.p082ob.C2308Me;
import com.yandex.metrica.impl.p082ob.C2430Pe;
import com.yandex.metrica.impl.p082ob.C2458Qe;
import com.yandex.metrica.impl.p082ob.C2485Re;
import com.yandex.metrica.impl.p082ob.C2562Te;
import com.yandex.metrica.impl.p082ob.C2662Ve;
import com.yandex.metrica.impl.p082ob.C2688We;
import com.yandex.metrica.impl.p082ob.C2696Wm;
import com.yandex.metrica.impl.p082ob.C2836bf;

public final class NumberAttribute {

    /* renamed from: a */
    private final C2430Pe f9741a;

    NumberAttribute(String str, C2252Kn<String> kn, C2187Je je) {
        this.f9741a = new C2430Pe(str, kn, je);
    }

    public UserProfileUpdate<? extends C2836bf> withValue(double d) {
        return new UserProfileUpdate<>(new C2562Te(this.f9741a.mo16469a(), d, new C2458Qe(), new C2308Me(new C2485Re(new C2696Wm(100)))));
    }

    public UserProfileUpdate<? extends C2836bf> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new C2562Te(this.f9741a.mo16469a(), d, new C2458Qe(), new C2688We(new C2485Re(new C2696Wm(100)))));
    }

    public UserProfileUpdate<? extends C2836bf> withValueReset() {
        return new UserProfileUpdate<>(new C2662Ve(1, this.f9741a.mo16469a(), new C2458Qe(), new C2485Re(new C2696Wm(100))));
    }
}
