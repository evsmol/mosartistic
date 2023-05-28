package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.i4 */
public class C3049i4 {

    /* renamed from: a */
    private final String f8035a;

    /* renamed from: b */
    private final String f8036b;

    /* renamed from: c */
    private final Integer f8037c;

    /* renamed from: d */
    private final String f8038d;

    /* renamed from: e */
    private final CounterConfiguration.C10685b f8039e;

    public C3049i4(String str, String str2, Integer num, String str3, CounterConfiguration.C10685b bVar) {
        this.f8035a = str;
        this.f8036b = str2;
        this.f8037c = num;
        this.f8038d = str3;
        this.f8039e = bVar;
    }

    /* renamed from: a */
    public String mo17702a() {
        return this.f8035a;
    }

    /* renamed from: b */
    public String mo17703b() {
        return this.f8036b;
    }

    /* renamed from: c */
    public Integer mo17704c() {
        return this.f8037c;
    }

    /* renamed from: d */
    public String mo17705d() {
        return this.f8038d;
    }

    /* renamed from: e */
    public CounterConfiguration.C10685b mo17706e() {
        return this.f8039e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3049i4.class != obj.getClass()) {
            return false;
        }
        C3049i4 i4Var = (C3049i4) obj;
        String str = this.f8035a;
        if (str == null ? i4Var.f8035a != null : !str.equals(i4Var.f8035a)) {
            return false;
        }
        if (!this.f8036b.equals(i4Var.f8036b)) {
            return false;
        }
        Integer num = this.f8037c;
        if (num == null ? i4Var.f8037c != null : !num.equals(i4Var.f8037c)) {
            return false;
        }
        String str2 = this.f8038d;
        if (str2 == null ? i4Var.f8038d != null : !str2.equals(i4Var.f8038d)) {
            return false;
        }
        if (this.f8039e == i4Var.f8039e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8035a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f8036b.hashCode()) * 31;
        Integer num = this.f8037c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f8038d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f8039e.hashCode();
    }

    public String toString() {
        return "ClientDescription{mApiKey='" + this.f8035a + '\'' + ", mPackageName='" + this.f8036b + '\'' + ", mProcessID=" + this.f8037c + ", mProcessSessionID='" + this.f8038d + '\'' + ", mReporterType=" + this.f8039e + '}';
    }

    /* renamed from: a */
    public static C3049i4 m9730a(C3719z3 z3Var) {
        return new C3049i4(z3Var.mo18444b().mo64607a(), z3Var.mo18443a().mo15430f(), z3Var.mo18443a().mo15431g(), z3Var.mo18443a().mo15432h(), z3Var.mo18444b().mo64625k());
    }
}
