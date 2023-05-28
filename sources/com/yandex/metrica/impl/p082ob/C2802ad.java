package com.yandex.metrica.impl.p082ob;

import android.location.Location;
import com.yandex.metrica.impl.p082ob.C3351pf;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ad */
public class C2802ad {
    /* renamed from: a */
    public C3351pf.C3353b mo17185a(C2091Hc hc) {
        C3351pf.C3353b bVar = new C3351pf.C3353b();
        Location c = hc.mo15858c();
        bVar.f8576a = hc.mo15857b() == null ? bVar.f8576a : hc.mo15857b().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.f8578c = timeUnit.toSeconds(c.getTime());
        bVar.f8586k = C2171J1.m7474a(hc.f5524a);
        bVar.f8577b = timeUnit.toSeconds(hc.mo15860e());
        bVar.f8587l = timeUnit.toSeconds(hc.mo15859d());
        bVar.f8579d = c.getLatitude();
        bVar.f8580e = c.getLongitude();
        bVar.f8581f = Math.round(c.getAccuracy());
        bVar.f8582g = Math.round(c.getBearing());
        bVar.f8583h = Math.round(c.getSpeed());
        bVar.f8584i = (int) Math.round(c.getAltitude());
        String provider = c.getProvider();
        int i = 0;
        if ("gps".equals(provider)) {
            i = 1;
        } else if ("network".equals(provider)) {
            i = 2;
        } else if ("fused".equals(provider)) {
            i = 3;
        }
        bVar.f8585j = i;
        bVar.f8588m = C2171J1.m7472a(hc.mo15856a());
        return bVar;
    }
}
