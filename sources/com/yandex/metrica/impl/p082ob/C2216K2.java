package com.yandex.metrica.impl.p082ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.K2 */
public final class C2216K2 extends Location {

    /* renamed from: a */
    private final String f5925a;

    private C2216K2(Location location, String str) {
        super(location);
        this.f5925a = str;
    }

    /* renamed from: b */
    public static C2216K2 m7601b(Location location) {
        return new C2216K2(new Location(location), "");
    }

    /* renamed from: a */
    public String mo16062a() {
        return this.f5925a;
    }

    /* renamed from: a */
    public static C2216K2 m7600a(Location location) {
        Location location2 = new Location(location);
        String provider = location2.getProvider();
        location2.setProvider("");
        return new C2216K2(location2, provider);
    }
}
