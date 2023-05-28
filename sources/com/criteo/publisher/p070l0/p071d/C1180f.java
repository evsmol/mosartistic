package com.criteo.publisher.p070l0.p071d;

import com.criteo.publisher.p074n0.C1313q;

/* renamed from: com.criteo.publisher.l0.d.f */
/* compiled from: Tcf2GdprStrategy */
class C1180f implements C1181g {

    /* renamed from: a */
    private final C1313q f3728a;

    public C1180f(C1313q qVar) {
        this.f3728a = qVar;
    }

    /* renamed from: c */
    public String mo3299c() {
        return this.f3728a.mo3662a("IABTCF_TCString", "");
    }

    /* renamed from: b */
    public String mo3298b() {
        int a = this.f3728a.mo3661a("IABTCF_gdprApplies", -1);
        return a != -1 ? String.valueOf(a) : "";
    }

    /* renamed from: a */
    public Integer mo3297a() {
        return 2;
    }

    /* renamed from: d */
    public boolean mo3301d() {
        return !mo3298b().isEmpty() || !mo3299c().isEmpty();
    }
}
