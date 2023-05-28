package com.yandex.metrica.impl.p082ob;

import android.location.LocationManager;

/* renamed from: com.yandex.metrica.impl.ob.Cc */
public class C1921Cc {

    /* renamed from: a */
    public final C2517Sb f5169a;

    /* renamed from: b */
    public final LocationManager f5170b;

    /* renamed from: c */
    public final C3208mc f5171c;

    C1921Cc(C2517Sb sb, C3356pi piVar, C3208mc mcVar, LocationManager locationManager, C2518Sc sc, C2482Rb rb) {
        this.f5169a = sb;
        this.f5171c = mcVar;
        this.f5170b = locationManager;
    }

    /* renamed from: a */
    public static C1921Cc m6968a(C2338Nc nc, C2518Sc sc, C2482Rb rb, LocationManager locationManager) {
        return new C1921Cc(nc.f6261a, nc.f6262b, nc.f6263c, locationManager, sc, rb);
    }
}
