package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;

/* renamed from: com.yandex.metrica.impl.ob.de */
public class C2893de implements Converter<C3522u0, Integer> {
    /* renamed from: a */
    public Integer fromModel(C3522u0 u0Var) {
        int ordinal = u0Var.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal != 3) {
            return 0;
        }
        return 2;
    }

    /* renamed from: a */
    public C3522u0 toModel(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return C3522u0.APP;
        }
        if (intValue == 2) {
            return C3522u0.RETAIL;
        }
        if (intValue != 3) {
            return C3522u0.UNDEFINED;
        }
        return C3522u0.SATELLITE;
    }
}
