package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p082ob.C2187Je;
import com.yandex.metrica.impl.p082ob.C2252Kn;
import com.yandex.metrica.impl.p082ob.C2308Me;
import com.yandex.metrica.impl.p082ob.C2430Pe;
import com.yandex.metrica.impl.p082ob.C2662Ve;
import com.yandex.metrica.impl.p082ob.C2688We;
import com.yandex.metrica.impl.p082ob.C2743Ye;
import com.yandex.metrica.impl.p082ob.C2836bf;
import com.yandex.metrica.impl.p082ob.C2977fn;

public class StringAttribute {

    /* renamed from: a */
    private final C2977fn<String> f9742a;

    /* renamed from: b */
    private final C2430Pe f9743b;

    StringAttribute(String str, C2977fn<String> fnVar, C2252Kn<String> kn, C2187Je je) {
        this.f9743b = new C2430Pe(str, kn, je);
        this.f9742a = fnVar;
    }

    public UserProfileUpdate<? extends C2836bf> withValue(String str) {
        return new UserProfileUpdate<>(new C2743Ye(this.f9743b.mo16469a(), str, this.f9742a, this.f9743b.mo16470b(), new C2308Me(this.f9743b.mo16471c())));
    }

    public UserProfileUpdate<? extends C2836bf> withValueIfUndefined(String str) {
        return new UserProfileUpdate<>(new C2743Ye(this.f9743b.mo16469a(), str, this.f9742a, this.f9743b.mo16470b(), new C2688We(this.f9743b.mo16471c())));
    }

    public UserProfileUpdate<? extends C2836bf> withValueReset() {
        return new UserProfileUpdate<>(new C2662Ve(0, this.f9743b.mo16469a(), this.f9743b.mo16470b(), this.f9743b.mo16471c()));
    }
}
