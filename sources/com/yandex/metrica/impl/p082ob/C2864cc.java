package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.cc */
public class C2864cc {

    /* renamed from: a */
    public final C2456Qc f7581a;

    /* renamed from: b */
    public final C2801ac f7582b;

    public C2864cc(C2456Qc qc, C2801ac acVar) {
        this.f7581a = qc;
        this.f7582b = acVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2864cc.class != obj.getClass()) {
            return false;
        }
        C2864cc ccVar = (C2864cc) obj;
        if (!this.f7581a.equals(ccVar.f7581a)) {
            return false;
        }
        C2801ac acVar = this.f7582b;
        C2801ac acVar2 = ccVar.f7582b;
        if (acVar != null) {
            return acVar.equals(acVar2);
        }
        if (acVar2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f7581a.hashCode() * 31;
        C2801ac acVar = this.f7582b;
        return hashCode + (acVar != null ? acVar.hashCode() : 0);
    }

    public String toString() {
        return "GplCollectingConfig{providerAccessFlags=" + this.f7581a + ", arguments=" + this.f7582b + '}';
    }
}
