package com.yandex.metrica.impl.p082ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.di */
public class C2900di {

    /* renamed from: a */
    public final long f7673a;

    /* renamed from: b */
    public final String f7674b;

    /* renamed from: c */
    public final List<Integer> f7675c;

    /* renamed from: d */
    public final List<Integer> f7676d;

    /* renamed from: e */
    public final long f7677e;

    /* renamed from: f */
    public final int f7678f;

    /* renamed from: g */
    public final long f7679g;

    /* renamed from: h */
    public final long f7680h;

    /* renamed from: i */
    public final long f7681i;

    /* renamed from: j */
    public final long f7682j;

    public C2900di(long j, String str, List<Integer> list, List<Integer> list2, long j2, int i, long j3, long j4, long j5, long j6) {
        this.f7673a = j;
        this.f7674b = str;
        this.f7675c = C1848A2.m6816c(list);
        this.f7676d = C1848A2.m6816c(list2);
        this.f7677e = j2;
        this.f7678f = i;
        this.f7679g = j3;
        this.f7680h = j4;
        this.f7681i = j5;
        this.f7682j = j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2900di.class != obj.getClass()) {
            return false;
        }
        C2900di diVar = (C2900di) obj;
        if (this.f7673a == diVar.f7673a && this.f7677e == diVar.f7677e && this.f7678f == diVar.f7678f && this.f7679g == diVar.f7679g && this.f7680h == diVar.f7680h && this.f7681i == diVar.f7681i && this.f7682j == diVar.f7682j && this.f7674b.equals(diVar.f7674b) && this.f7675c.equals(diVar.f7675c)) {
            return this.f7676d.equals(diVar.f7676d);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f7673a;
        long j2 = this.f7677e;
        long j3 = this.f7679g;
        long j4 = this.f7680h;
        long j5 = this.f7681i;
        long j6 = this.f7682j;
        return (((((((((((((((((((int) (j ^ (j >>> 32))) * 31) + this.f7674b.hashCode()) * 31) + this.f7675c.hashCode()) * 31) + this.f7676d.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f7678f) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return "SocketConfig{secondsToLive=" + this.f7673a + ", token='" + this.f7674b + '\'' + ", ports=" + this.f7675c + ", portsHttp=" + this.f7676d + ", firstDelaySeconds=" + this.f7677e + ", launchDelaySeconds=" + this.f7678f + ", openEventIntervalSeconds=" + this.f7679g + ", minFailedRequestIntervalSeconds=" + this.f7680h + ", minSuccessfulRequestIntervalSeconds=" + this.f7681i + ", openRetryIntervalSeconds=" + this.f7682j + '}';
    }
}
