package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.I3 */
public class C2108I3 {

    /* renamed from: a */
    private final String f5545a;

    /* renamed from: b */
    private final String f5546b;

    public C2108I3(String str, String str2) {
        this.f5545a = str;
        this.f5546b = str2;
    }

    /* renamed from: a */
    public String mo15878a() {
        return this.f5546b;
    }

    /* renamed from: b */
    public String mo15879b() {
        return this.f5545a;
    }

    /* renamed from: c */
    public String mo15880c() {
        return this.f5545a + "_" + C1848A2.m6797a(this.f5546b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2108I3 i3 = (C2108I3) obj;
        String str = this.f5545a;
        if (str == null ? i3.f5545a != null : !str.equals(i3.f5545a)) {
            return false;
        }
        String str2 = this.f5546b;
        String str3 = i3.f5546b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5545a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5546b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.f5545a + "_" + this.f5546b;
    }
}
