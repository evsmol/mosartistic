package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.z */
public class C3714z {

    /* renamed from: a */
    public final C3715a f9547a;

    /* renamed from: b */
    public final Boolean f9548b;

    /* renamed from: com.yandex.metrica.impl.ob.z$a */
    public enum C3715a {
        ACTIVE,
        WORKING_SET,
        FREQUENT,
        RARE,
        RESTRICTED
    }

    public C3714z(C3715a aVar, Boolean bool) {
        this.f9547a = aVar;
        this.f9548b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3714z.class != obj.getClass()) {
            return false;
        }
        C3714z zVar = (C3714z) obj;
        if (this.f9547a != zVar.f9547a) {
            return false;
        }
        Boolean bool = this.f9548b;
        if (bool != null) {
            return bool.equals(zVar.f9548b);
        }
        if (zVar.f9548b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        C3715a aVar = this.f9547a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Boolean bool = this.f9548b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
