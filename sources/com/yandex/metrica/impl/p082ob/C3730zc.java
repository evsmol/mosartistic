package com.yandex.metrica.impl.p082ob;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.zc */
public class C3730zc implements LocationListener {

    /* renamed from: a */
    private final C2425Pc f9584a;

    public C3730zc(C2425Pc pc) {
        this.f9584a = pc;
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            this.f9584a.mo16454a(location);
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
