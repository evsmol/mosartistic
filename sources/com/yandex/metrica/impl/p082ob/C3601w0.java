package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.w0 */
public final class C3601w0 {

    /* renamed from: a */
    private final long f9363a;

    public C3601w0(long j) {
        this.f9363a = j;
    }

    /* renamed from: a */
    public final long mo18350a() {
        return this.f9363a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C3601w0) && this.f9363a == ((C3601w0) obj).f9363a;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f9363a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "EasyCollectingConfig(firstLaunchDelaySeconds=" + this.f9363a + ")";
    }
}
