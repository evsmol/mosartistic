package com.yandex.metrica.impl.p082ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.yc */
class C3696yc {

    /* renamed from: a */
    private C3208mc f9507a;

    /* renamed from: b */
    private C2644V<Location> f9508b;

    /* renamed from: c */
    private Location f9509c = null;

    /* renamed from: d */
    private long f9510d;

    /* renamed from: e */
    private C3641x2 f9511e;

    /* renamed from: f */
    private C2518Sc f9512f;

    /* renamed from: g */
    private C2482Rb f9513g;

    C3696yc(C3208mc mcVar, C2644V<Location> v, Location location, long j, C3641x2 x2Var, C2518Sc sc, C2482Rb rb) {
        this.f9507a = mcVar;
        this.f9508b = v;
        this.f9510d = j;
        this.f9511e = x2Var;
        this.f9512f = sc;
        this.f9513g = rb;
    }

    /* renamed from: b */
    private boolean m11071b(Location location) {
        C3208mc mcVar;
        if (!(location == null || (mcVar = this.f9507a) == null)) {
            if (this.f9509c == null) {
                return true;
            }
            boolean a = this.f9511e.mo18389a(this.f9510d, mcVar.f8307a, "isSavedLocationOutdated");
            boolean z = location.distanceTo(this.f9509c) > this.f9507a.f8308b;
            boolean z2 = this.f9509c == null || location.getTime() - this.f9509c.getTime() >= 0;
            if ((a || z) && z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo18421a(Location location) {
        if (m11071b(location)) {
            this.f9509c = location;
            this.f9510d = System.currentTimeMillis();
            this.f9508b.mo16934a(location);
            this.f9512f.mo15784a();
            this.f9513g.mo16555a();
        }
    }

    /* renamed from: a */
    public void mo18422a(C3208mc mcVar) {
        this.f9507a = mcVar;
    }
}
