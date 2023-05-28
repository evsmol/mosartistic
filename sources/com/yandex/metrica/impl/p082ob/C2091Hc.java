package com.yandex.metrica.impl.p082ob;

import android.location.Location;
import com.yandex.metrica.impl.p082ob.C1967E;
import com.yandex.metrica.impl.p082ob.C3316oc;

/* renamed from: com.yandex.metrica.impl.ob.Hc */
public class C2091Hc {

    /* renamed from: a */
    public final C3316oc.C3317a f5524a;

    /* renamed from: b */
    private Long f5525b;

    /* renamed from: c */
    private long f5526c;

    /* renamed from: d */
    private long f5527d;

    /* renamed from: e */
    private Location f5528e;

    /* renamed from: f */
    private C1967E.C1969b.C1970a f5529f;

    public C2091Hc(C3316oc.C3317a aVar, long j, long j2, Location location, C1967E.C1969b.C1970a aVar2, Long l) {
        this.f5524a = aVar;
        this.f5525b = l;
        this.f5526c = j;
        this.f5527d = j2;
        this.f5528e = location;
        this.f5529f = aVar2;
    }

    /* renamed from: a */
    public C1967E.C1969b.C1970a mo15856a() {
        return this.f5529f;
    }

    /* renamed from: b */
    public Long mo15857b() {
        return this.f5525b;
    }

    /* renamed from: c */
    public Location mo15858c() {
        return this.f5528e;
    }

    /* renamed from: d */
    public long mo15859d() {
        return this.f5527d;
    }

    /* renamed from: e */
    public long mo15860e() {
        return this.f5526c;
    }

    public String toString() {
        return "LocationWrapper{collectionMode=" + this.f5524a + ", mIncrementalId=" + this.f5525b + ", mReceiveTimestamp=" + this.f5526c + ", mReceiveElapsedRealtime=" + this.f5527d + ", mLocation=" + this.f5528e + ", mChargeType=" + this.f5529f + '}';
    }
}
