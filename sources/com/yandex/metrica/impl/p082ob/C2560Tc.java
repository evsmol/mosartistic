package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;

/* renamed from: com.yandex.metrica.impl.ob.Tc */
class C2560Tc extends C1953Dc<C2713Xb> {

    /* renamed from: f */
    private final LocationManager f6781f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final String f6782g;

    C2560Tc(Context context, Looper looper, LocationManager locationManager, C3731zd zdVar, String str, LocationListener locationListener) {
        super(context, locationListener, zdVar, looper);
        this.f6781f = locationManager;
        this.f6782g = str;
    }

    /* renamed from: b */
    public void mo15631b() {
        Location location;
        if (this.f5234b.mo15812a(this.f5233a)) {
            LocationManager locationManager = this.f6781f;
            if (locationManager != null) {
                try {
                    location = locationManager.getLastKnownLocation(this.f6782g);
                } catch (Throwable unused) {
                }
                this.f5235c.onLocationChanged(location);
            }
            location = null;
            this.f5235c.onLocationChanged(location);
        }
    }

    /* renamed from: c */
    public boolean mo16705c() {
        if (!this.f5234b.mo15812a(this.f5233a)) {
            return false;
        }
        String str = this.f6782g;
        long j = C1953Dc.f5232e;
        LocationListener locationListener = this.f5235c;
        Looper looper = this.f5236d;
        LocationManager locationManager = this.f6781f;
        if (locationManager == null) {
            return false;
        }
        try {
            locationManager.requestLocationUpdates(str, j, 0.0f, locationListener, looper);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo15630a(Object obj) {
        C2713Xb xb = (C2713Xb) obj;
        return mo16705c();
    }

    /* renamed from: a */
    public void mo15629a() {
        LocationManager locationManager = this.f6781f;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this.f5235c);
            } catch (Throwable unused) {
            }
        }
    }
}
