package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ValidationException;

/* renamed from: com.yandex.metrica.impl.ob.Hn */
public class C2103Hn<T> implements C2252Kn<T> {

    /* renamed from: a */
    private final C2252Kn<T> f5544a;

    public C2103Hn(C2252Kn<T> kn) {
        this.f5544a = kn;
    }

    /* renamed from: a */
    public C2167In mo15517a(T t) {
        C2167In a = this.f5544a.mo15517a(t);
        if (a.mo15965b()) {
            return a;
        }
        throw new ValidationException(a.mo15964a());
    }
}
