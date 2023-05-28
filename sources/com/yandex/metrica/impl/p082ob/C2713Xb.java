package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Xb */
public class C2713Xb {

    /* renamed from: a */
    public final C2456Qc f7171a;

    /* renamed from: b */
    public final C2685Wb f7172b;

    public C2713Xb(C2456Qc qc, C2685Wb wb) {
        this.f7171a = qc;
        this.f7172b = wb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2713Xb.class != obj.getClass()) {
            return false;
        }
        C2713Xb xb = (C2713Xb) obj;
        if (!this.f7171a.equals(xb.f7171a)) {
            return false;
        }
        C2685Wb wb = this.f7172b;
        C2685Wb wb2 = xb.f7172b;
        if (wb != null) {
            return wb.equals(wb2);
        }
        if (wb2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f7171a.hashCode() * 31;
        C2685Wb wb = this.f7172b;
        return hashCode + (wb != null ? wb.hashCode() : 0);
    }

    public String toString() {
        return "ForcedCollectingConfig{providerAccessFlags=" + this.f7171a + ", arguments=" + this.f7172b + '}';
    }
}
