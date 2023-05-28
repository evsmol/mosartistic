package com.applovin.impl.sdk;

import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8571h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.u */
public class C8555u {

    /* renamed from: a */
    private final C8490n f21614a;

    /* renamed from: b */
    private final LocationManager f21615b;

    /* renamed from: c */
    private double f21616c;

    /* renamed from: d */
    private double f21617d;

    /* renamed from: e */
    private long f21618e;

    C8555u(C8490n nVar) {
        this.f21614a = nVar;
        this.f21615b = (LocationManager) nVar.mo57332P().getSystemService("location");
    }

    /* renamed from: a */
    private Location m26044a(String str, String str2) {
        C8626v D;
        StringBuilder sb;
        String str3;
        if (!C8571h.m26083a(str2, this.f21614a.mo57332P())) {
            return null;
        }
        try {
            return this.f21615b.getLastKnownLocation(str);
        } catch (SecurityException e) {
            th = e;
            this.f21614a.mo57320D();
            if (C8626v.m26252a()) {
                D = this.f21614a.mo57320D();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": access denied.";
                sb.append(str3);
                D.mo57819b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (IllegalArgumentException e2) {
            th = e2;
            this.f21614a.mo57320D();
            if (C8626v.m26252a()) {
                D = this.f21614a.mo57320D();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": device does not support this location provider.";
                sb.append(str3);
                D.mo57819b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (NullPointerException e3) {
            th = e3;
            this.f21614a.mo57320D();
            if (C8626v.m26252a()) {
                D = this.f21614a.mo57320D();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": location provider is not available.";
                sb.append(str3);
                D.mo57819b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (Throwable th) {
            th = th;
            this.f21614a.mo57320D();
            if (C8626v.m26252a()) {
                D = this.f21614a.mo57320D();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ".";
                sb.append(str3);
                D.mo57819b("LocationManager", sb.toString(), th);
            }
            return null;
        }
    }

    /* renamed from: f */
    private boolean m26045f() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f21614a.mo57342a(C8380b.f20940eg)).longValue());
        if (this.f21618e != 0 && System.currentTimeMillis() - this.f21618e < millis) {
            return false;
        }
        Location a = m26044a("gps", "android.permission.ACCESS_FINE_LOCATION");
        if (a == null) {
            a = m26044a("network", "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (a == null) {
            return false;
        }
        this.f21616c = a.getLatitude();
        this.f21617d = a.getLongitude();
        this.f21618e = System.currentTimeMillis();
        return true;
    }

    /* renamed from: a */
    public boolean mo57679a() {
        return C8571h.m26083a("android.permission.ACCESS_COARSE_LOCATION", this.f21614a.mo57332P());
    }

    /* renamed from: b */
    public boolean mo57680b() {
        return C8571h.m26090h() ? this.f21615b.isLocationEnabled() : !C8571h.m26085c() || Settings.Secure.getInt(this.f21614a.mo57332P().getContentResolver(), "location_mode", 0) != 0;
    }

    /* renamed from: c */
    public boolean mo57681c() {
        if (this.f21614a.mo57400q().isLocationCollectionEnabled() && ((Boolean) this.f21614a.mo57342a(C8380b.f20939ef)).booleanValue() && mo57679a()) {
            return m26045f() || this.f21618e != 0;
        }
        return false;
    }

    /* renamed from: d */
    public double mo57682d() {
        return this.f21616c;
    }

    /* renamed from: e */
    public double mo57683e() {
        return this.f21617d;
    }
}
