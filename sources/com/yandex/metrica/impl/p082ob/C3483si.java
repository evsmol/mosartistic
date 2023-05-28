package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.si */
public final class C3483si {

    /* renamed from: a */
    private final int f9112a;

    public C3483si(int i) {
        this.f9112a = i;
    }

    /* renamed from: a */
    public final int mo18215a() {
        return this.f9112a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C3483si) && this.f9112a == ((C3483si) obj).f9112a;
        }
        return true;
    }

    public int hashCode() {
        return this.f9112a;
    }

    public String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f9112a + ")";
    }
}
