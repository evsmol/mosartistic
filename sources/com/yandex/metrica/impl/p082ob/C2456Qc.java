package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Qc */
public class C2456Qc {

    /* renamed from: a */
    public final boolean f6525a;

    /* renamed from: b */
    public final boolean f6526b;

    public C2456Qc(boolean z, boolean z2) {
        this.f6525a = z;
        this.f6526b = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2456Qc.class != obj.getClass()) {
            return false;
        }
        C2456Qc qc = (C2456Qc) obj;
        if (this.f6525a == qc.f6525a && this.f6526b == qc.f6526b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6525a ? 1 : 0) * true) + (this.f6526b ? 1 : 0);
    }

    public String toString() {
        return "ProviderAccessFlags{lastKnownEnabled=" + this.f6525a + ", scanningEnabled=" + this.f6526b + '}';
    }
}
