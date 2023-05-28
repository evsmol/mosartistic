package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Wb */
public class C2685Wb {

    /* renamed from: a */
    public final long f7085a;

    /* renamed from: b */
    public final long f7086b;

    public C2685Wb(long j, long j2) {
        this.f7085a = j;
        this.f7086b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2685Wb.class != obj.getClass()) {
            return false;
        }
        C2685Wb wb = (C2685Wb) obj;
        if (this.f7085a == wb.f7085a && this.f7086b == wb.f7086b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f7085a;
        long j2 = this.f7086b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "ForcedCollectingArguments{durationSeconds=" + this.f7085a + ", intervalSeconds=" + this.f7086b + '}';
    }
}
