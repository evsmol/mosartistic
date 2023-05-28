package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.ci */
public class C2871ci {

    /* renamed from: a */
    public final long f7615a;

    /* renamed from: b */
    public final long f7616b;

    /* renamed from: c */
    public final long f7617c;

    /* renamed from: d */
    public final long f7618d;

    public C2871ci(long j, long j2, long j3, long j4) {
        this.f7615a = j;
        this.f7616b = j2;
        this.f7617c = j3;
        this.f7618d = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2871ci.class != obj.getClass()) {
            return false;
        }
        C2871ci ciVar = (C2871ci) obj;
        if (this.f7615a == ciVar.f7615a && this.f7616b == ciVar.f7616b && this.f7617c == ciVar.f7617c && this.f7618d == ciVar.f7618d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f7615a;
        long j2 = this.f7616b;
        long j3 = this.f7617c;
        long j4 = this.f7618d;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "SdkFingerprintingConfig{minCollectingInterval=" + this.f7615a + ", minFirstCollectingDelay=" + this.f7616b + ", minCollectingDelayAfterLaunch=" + this.f7617c + ", minRequestRetryInterval=" + this.f7618d + '}';
    }
}
