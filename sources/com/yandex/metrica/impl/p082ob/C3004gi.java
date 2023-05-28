package com.yandex.metrica.impl.p082ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.gi */
public enum C3004gi {
    UNKNOWN(0),
    NETWORK(1),
    PARSE(2);
    

    /* renamed from: a */
    private int f7929a;

    private C3004gi(int i) {
        this.f7929a = i;
    }

    /* renamed from: a */
    public Bundle mo17640a(Bundle bundle) {
        bundle.putInt("startup_error_key_code", this.f7929a);
        return bundle;
    }
}
