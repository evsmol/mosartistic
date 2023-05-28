package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.ti */
public class C3512ti {

    /* renamed from: a */
    public final long f9164a;

    public C3512ti(long j) {
        this.f9164a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3512ti.class == obj.getClass() && this.f9164a == ((C3512ti) obj).f9164a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f9164a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "StatSending{disabledReportingInterval=" + this.f9164a + '}';
    }
}
