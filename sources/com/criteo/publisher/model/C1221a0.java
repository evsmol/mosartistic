package com.criteo.publisher.model;

import com.criteo.publisher.C1321s;
import com.criteo.publisher.p069k0.C1166g;
import com.criteo.publisher.p072m0.C1217d;
import com.criteo.publisher.p072m0.C1219e;
import com.criteo.publisher.p074n0.C1317u;

/* renamed from: com.criteo.publisher.model.a0 */
/* compiled from: WebViewData */
public class C1221a0 {

    /* renamed from: a */
    private String f3828a = "";

    /* renamed from: b */
    private C1317u f3829b = C1317u.NONE;

    /* renamed from: c */
    private final C1276t f3830c;

    /* renamed from: d */
    private final C1166g f3831d;

    public C1221a0(C1276t tVar, C1166g gVar) {
        this.f3830c = tVar;
        this.f3831d = gVar;
    }

    /* renamed from: e */
    public boolean mo3409e() {
        return this.f3829b == C1317u.LOADED;
    }

    /* renamed from: a */
    public void mo3404a(String str) {
        this.f3828a = this.f3830c.mo3592b().replace(this.f3830c.mo3591a(), str);
    }

    /* renamed from: f */
    public boolean mo3410f() {
        return this.f3829b == C1317u.LOADING;
    }

    /* renamed from: d */
    public String mo3408d() {
        return this.f3828a;
    }

    /* renamed from: g */
    public void mo3411g() {
        this.f3829b = C1317u.NONE;
        this.f3828a = "";
    }

    /* renamed from: a */
    public void mo3403a() {
        this.f3829b = C1317u.FAILED;
    }

    /* renamed from: c */
    public void mo3407c() {
        this.f3829b = C1317u.LOADED;
    }

    /* renamed from: b */
    public void mo3406b() {
        this.f3829b = C1317u.LOADING;
    }

    /* renamed from: a */
    public void mo3405a(String str, C1278u uVar, C1217d dVar) {
        C1321s.m5824c().mo3707h1().execute(new C1219e(str, this, uVar, dVar, this.f3831d));
    }
}
