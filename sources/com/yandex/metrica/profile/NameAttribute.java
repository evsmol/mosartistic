package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p082ob.C1966Dn;
import com.yandex.metrica.impl.p082ob.C2717Xe;
import com.yandex.metrica.impl.p082ob.C2905dn;

public class NameAttribute extends StringAttribute {
    NameAttribute() {
        super("appmetrica_name", new C2905dn(100, "Name attribute"), new C1966Dn(), new C2717Xe());
    }
}
