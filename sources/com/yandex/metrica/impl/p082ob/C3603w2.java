package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2416P3;

/* renamed from: com.yandex.metrica.impl.ob.w2 */
public class C3603w2<C extends C2416P3> implements C3140l2 {

    /* renamed from: a */
    private C f9365a;

    /* renamed from: b */
    final Object f9366b = new Object();

    /* renamed from: c */
    boolean f9367c = false;

    /* renamed from: d */
    private final C3707yi f9368d;

    public C3603w2(C c, C3707yi yiVar) {
        this.f9365a = c;
        this.f9368d = yiVar;
    }

    /* renamed from: a */
    public void mo15575a() {
        synchronized (this.f9366b) {
            if (this.f9367c) {
                this.f9367c = false;
            }
        }
    }

    /* renamed from: b */
    public void mo15576b() {
        synchronized (this.f9366b) {
            if (!this.f9367c) {
                mo16585c();
                this.f9367c = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16585c() {
    }

    /* renamed from: d */
    public void mo18354d() {
        synchronized (this.f9366b) {
            if (!this.f9367c) {
                synchronized (this.f9366b) {
                    if (!this.f9367c) {
                        mo16586f();
                    }
                }
                mo16585c();
            }
        }
    }

    /* renamed from: e */
    public C mo18355e() {
        return this.f9365a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo16586f() {
        this.f9368d.mo15467a();
    }
}
