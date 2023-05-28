package com.yandex.metrica.impl.p082ob;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.a9 */
public class C2798a9 extends C2888d9 {

    /* renamed from: c */
    private final C2484Rd f7382c = new C2484Rd("init_event_pref_key");

    /* renamed from: d */
    private final C2484Rd f7383d = new C2484Rd("first_event_pref_key");

    public C2798a9(C2511S7 s7) {
        super(s7);
    }

    @Deprecated
    /* renamed from: f */
    public boolean mo17172f() {
        return mo17438a(this.f7383d.mo16558a(), (String) null) != null;
    }

    @Deprecated
    /* renamed from: g */
    public String mo17173g(String str) {
        return mo17438a(this.f7382c.mo16558a(), (String) null);
    }

    @Deprecated
    /* renamed from: h */
    public C2798a9 mo17175h() {
        return (C2798a9) mo17451f(this.f7383d.mo16558a());
    }

    @Deprecated
    /* renamed from: i */
    public C2798a9 mo17176i() {
        return (C2798a9) mo17451f(this.f7382c.mo16558a());
    }

    @Deprecated
    /* renamed from: j */
    public void mo17177j() {
        mo17443b(this.f7383d.mo16558a(), "DONE").mo17448d();
    }

    @Deprecated
    /* renamed from: k */
    public void mo17178k() {
        mo17443b(this.f7382c.mo16558a(), "DONE").mo17448d();
    }

    @Deprecated
    /* renamed from: g */
    public boolean mo17174g() {
        return mo17438a(this.f7382c.mo16558a(), (String) null) != null;
    }
}
