package com.yandex.metrica.impl.p082ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.Yb */
public class C2740Yb extends C2644V<Location> {

    /* renamed from: b */
    private final C3660xc f7234b;

    public C2740Yb(C2644V<Location> v, C3660xc xcVar) {
        super(v);
        this.f7234b = xcVar;
    }

    /* renamed from: b */
    public void mo16557b(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            this.f7234b.mo15804b(location);
        }
    }
}
