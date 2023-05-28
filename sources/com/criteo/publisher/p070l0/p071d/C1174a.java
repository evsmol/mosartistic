package com.criteo.publisher.p070l0.p071d;

/* renamed from: com.criteo.publisher.l0.d.a */
/* compiled from: $AutoValue_GdprData */
abstract class C1174a extends C1177c {

    /* renamed from: a */
    private final String f3719a;

    /* renamed from: b */
    private final Boolean f3720b;

    /* renamed from: c */
    private final Integer f3721c;

    C1174a(String str, Boolean bool, Integer num) {
        if (str != null) {
            this.f3719a = str;
            this.f3720b = bool;
            if (num != null) {
                this.f3721c = num;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null consentData");
    }

    /* renamed from: a */
    public String mo3287a() {
        return this.f3719a;
    }

    /* renamed from: b */
    public Boolean mo3288b() {
        return this.f3720b;
    }

    /* renamed from: c */
    public Integer mo3289c() {
        return this.f3721c;
    }

    public String toString() {
        return "GdprData{consentData=" + this.f3719a + ", gdprApplies=" + this.f3720b + ", version=" + this.f3721c + "}";
    }

    public boolean equals(Object obj) {
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1177c)) {
            return false;
        }
        C1177c cVar = (C1177c) obj;
        if (!this.f3719a.equals(cVar.mo3287a()) || ((bool = this.f3720b) != null ? !bool.equals(cVar.mo3288b()) : cVar.mo3288b() != null) || !this.f3721c.equals(cVar.mo3289c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.f3719a.hashCode() ^ 1000003) * 1000003;
        Boolean bool = this.f3720b;
        return ((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.f3721c.hashCode();
    }
}
