package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Ph */
public class C2435Ph {

    /* renamed from: a */
    public final long f6483a;

    /* renamed from: b */
    public final long f6484b;

    /* renamed from: c */
    public final long f6485c;

    /* renamed from: d */
    public final long f6486d;

    public C2435Ph(long j, long j2, long j3, long j4) {
        this.f6483a = j;
        this.f6484b = j2;
        this.f6485c = j3;
        this.f6486d = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2435Ph.class != obj.getClass()) {
            return false;
        }
        C2435Ph ph = (C2435Ph) obj;
        if (this.f6483a == ph.f6483a && this.f6484b == ph.f6484b && this.f6485c == ph.f6485c && this.f6486d == ph.f6486d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f6483a;
        long j2 = this.f6484b;
        long j3 = this.f6485c;
        long j4 = this.f6486d;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "CacheControl{cellsAroundTtl=" + this.f6483a + ", wifiNetworksTtl=" + this.f6484b + ", lastKnownLocationTtl=" + this.f6485c + ", netInterfacesTtl=" + this.f6486d + '}';
    }
}
