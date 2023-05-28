package com.appnext.base.p260a;

import com.appnext.base.p260a.p263c.C8840a;
import com.appnext.base.p260a.p263c.C8841b;
import com.appnext.base.p260a.p263c.C8842c;

/* renamed from: com.appnext.base.a.a */
public class C8831a {

    /* renamed from: dw */
    private static volatile C8831a f22362dw;

    /* renamed from: dt */
    private C8840a f22363dt = new C8840a();

    /* renamed from: du */
    private C8841b f22364du = new C8841b();

    /* renamed from: dv */
    private C8842c f22365dv = new C8842c();

    /* renamed from: X */
    public static C8831a m26576X() {
        if (f22362dw == null) {
            synchronized (C8831a.class) {
                if (f22362dw == null) {
                    f22362dw = new C8831a();
                }
            }
        }
        return f22362dw;
    }

    private C8831a() {
    }

    /* renamed from: Y */
    private void m26577Y() {
        this.f22363dt = new C8840a();
        this.f22364du = new C8841b();
        this.f22365dv = new C8842c();
    }

    /* renamed from: Z */
    public final C8840a mo58684Z() {
        return this.f22363dt;
    }

    /* renamed from: aa */
    public final C8841b mo58685aa() {
        return this.f22364du;
    }

    /* renamed from: ab */
    public final C8842c mo58686ab() {
        return this.f22365dv;
    }
}
