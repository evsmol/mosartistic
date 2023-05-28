package com.criteo.publisher.model;

import java.util.Map;

/* renamed from: com.criteo.publisher.model.f */
/* compiled from: $AutoValue_User */
abstract class C1252f extends C1285z {

    /* renamed from: a */
    private final String f3901a;

    /* renamed from: b */
    private final String f3902b;

    /* renamed from: c */
    private final String f3903c;

    /* renamed from: d */
    private final String f3904d;

    /* renamed from: e */
    private final String f3905e;

    /* renamed from: f */
    private final String f3906f;

    /* renamed from: g */
    private final Map<String, Object> f3907g;

    C1252f(String str, String str2, String str3, String str4, String str5, String str6, Map<String, Object> map) {
        this.f3901a = str;
        if (str2 != null) {
            this.f3902b = str2;
            if (str3 != null) {
                this.f3903c = str3;
                this.f3904d = str4;
                this.f3905e = str5;
                this.f3906f = str6;
                if (map != null) {
                    this.f3907g = map;
                    return;
                }
                throw new NullPointerException("Null ext");
            }
            throw new NullPointerException("Null deviceOs");
        }
        throw new NullPointerException("Null deviceIdType");
    }

    /* renamed from: a */
    public String mo3522a() {
        return this.f3901a;
    }

    /* renamed from: b */
    public String mo3523b() {
        return this.f3902b;
    }

    /* renamed from: c */
    public String mo3524c() {
        return this.f3903c;
    }

    /* renamed from: e */
    public String mo3526e() {
        return this.f3904d;
    }

    /* renamed from: f */
    public String mo3528f() {
        return this.f3905e;
    }

    /* renamed from: g */
    public String mo3529g() {
        return this.f3906f;
    }

    /* renamed from: d */
    public Map<String, Object> mo3525d() {
        return this.f3907g;
    }

    public String toString() {
        return "User{deviceId=" + this.f3901a + ", deviceIdType=" + this.f3902b + ", deviceOs=" + this.f3903c + ", mopubConsent=" + this.f3904d + ", uspIab=" + this.f3905e + ", uspOptout=" + this.f3906f + ", ext=" + this.f3907g + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1285z)) {
            return false;
        }
        C1285z zVar = (C1285z) obj;
        String str4 = this.f3901a;
        if (str4 != null ? str4.equals(zVar.mo3522a()) : zVar.mo3522a() == null) {
            if (!this.f3902b.equals(zVar.mo3523b()) || !this.f3903c.equals(zVar.mo3524c()) || ((str = this.f3904d) != null ? !str.equals(zVar.mo3526e()) : zVar.mo3526e() != null) || ((str2 = this.f3905e) != null ? !str2.equals(zVar.mo3528f()) : zVar.mo3528f() != null) || ((str3 = this.f3906f) != null ? !str3.equals(zVar.mo3529g()) : zVar.mo3529g() != null) || !this.f3907g.equals(zVar.mo3525d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3901a;
        int i = 0;
        int hashCode = ((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f3902b.hashCode()) * 1000003) ^ this.f3903c.hashCode()) * 1000003;
        String str2 = this.f3904d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3905e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3906f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f3907g.hashCode();
    }
}
