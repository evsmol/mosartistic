package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.wh */
public class C3625wh {

    /* renamed from: a */
    private final String f9401a;

    /* renamed from: b */
    private final String f9402b;

    /* renamed from: c */
    private final C2917e9 f9403c;

    public C3625wh(String str, String str2) {
        this(str, str2, C2007F0.m7154g().mo15756s());
    }

    /* renamed from: a */
    public String mo18372a() {
        C2917e9 e9Var = this.f9403c;
        String str = this.f9401a;
        String str2 = this.f9402b;
        e9Var.getClass();
        return e9Var.mo17438a(new C2484Rd("LAST_SOCKET_REPORT_TIMES_" + str + "_" + str2, (String) null).mo16558a(), (String) null);
    }

    C3625wh(String str, String str2, C2917e9 e9Var) {
        this.f9401a = str;
        this.f9402b = str2;
        this.f9403c = e9Var;
    }

    /* renamed from: a */
    public void mo18373a(String str) {
        this.f9403c.mo17506a(this.f9401a, this.f9402b, str);
    }
}
