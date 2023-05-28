package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.gpllibrary.C1811a;

/* renamed from: com.yandex.metrica.impl.ob.ac */
public class C2801ac {

    /* renamed from: a */
    public final C1811a.C1813b f7389a;

    /* renamed from: b */
    public final long f7390b;

    /* renamed from: c */
    public final long f7391c;

    public C2801ac(C1811a.C1813b bVar, long j, long j2) {
        this.f7389a = bVar;
        this.f7390b = j;
        this.f7391c = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2801ac.class != obj.getClass()) {
            return false;
        }
        C2801ac acVar = (C2801ac) obj;
        if (this.f7390b == acVar.f7390b && this.f7391c == acVar.f7391c && this.f7389a == acVar.f7389a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f7390b;
        long j2 = this.f7391c;
        return (((this.f7389a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "GplArguments{priority=" + this.f7389a + ", durationSeconds=" + this.f7390b + ", intervalSeconds=" + this.f7391c + '}';
    }
}
