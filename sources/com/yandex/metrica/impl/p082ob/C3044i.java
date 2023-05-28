package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.i */
public class C3044i {

    /* renamed from: a */
    public final int f8020a;

    /* renamed from: b */
    public final int f8021b;

    public C3044i(int i, int i2) {
        this.f8020a = i;
        this.f8021b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3044i.class != obj.getClass()) {
            return false;
        }
        C3044i iVar = (C3044i) obj;
        return this.f8020a == iVar.f8020a && this.f8021b == iVar.f8021b;
    }

    public int hashCode() {
        return (this.f8020a * 31) + this.f8021b;
    }

    public String toString() {
        return "BillingConfig{sendFrequencySeconds=" + this.f8020a + ", firstCollectingInappMaxAgeSeconds=" + this.f8021b + "}";
    }
}
