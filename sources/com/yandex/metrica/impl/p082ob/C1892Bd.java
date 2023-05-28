package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Bd */
public class C1892Bd {

    /* renamed from: a */
    public final String f5115a;

    /* renamed from: b */
    public final boolean f5116b;

    public C1892Bd(String str, boolean z) {
        this.f5115a = str;
        this.f5116b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1892Bd.class != obj.getClass()) {
            return false;
        }
        C1892Bd bd = (C1892Bd) obj;
        if (this.f5116b != bd.f5116b) {
            return false;
        }
        return this.f5115a.equals(bd.f5115a);
    }

    public int hashCode() {
        return (this.f5115a.hashCode() * 31) + (this.f5116b ? 1 : 0);
    }

    public String toString() {
        return "PermissionState{name='" + this.f5115a + '\'' + ", granted=" + this.f5116b + '}';
    }
}
