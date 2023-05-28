package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.X0 */
public class C2698X0 {

    /* renamed from: a */
    private final TimeProvider f7102a;

    /* renamed from: b */
    private final C3641x2 f7103b;

    /* renamed from: c */
    private final C2917e9 f7104c;

    /* renamed from: d */
    private long f7105d;

    /* renamed from: e */
    private C2776Zh f7106e;

    /* renamed from: f */
    private final C2291M0 f7107f;

    C2698X0(C2917e9 e9Var, C2776Zh zh, TimeProvider timeProvider, C3641x2 x2Var, C2291M0 m0) {
        this.f7104c = e9Var;
        this.f7106e = zh;
        this.f7105d = e9Var.mo17518d(0);
        this.f7102a = timeProvider;
        this.f7103b = x2Var;
        this.f7107f = m0;
    }

    /* renamed from: a */
    public void mo17007a() {
        C2776Zh zh = this.f7106e;
        if (zh != null && this.f7103b.mo18390b(this.f7105d, zh.f7283a, "should send EVENT_IDENTITY_LIGHT")) {
            this.f7107f.mo15485b();
            long currentTimeSeconds = this.f7102a.currentTimeSeconds();
            this.f7105d = currentTimeSeconds;
            this.f7104c.mo17528i(currentTimeSeconds);
        }
    }

    /* renamed from: a */
    public void mo17008a(C2776Zh zh) {
        this.f7106e = zh;
    }
}
