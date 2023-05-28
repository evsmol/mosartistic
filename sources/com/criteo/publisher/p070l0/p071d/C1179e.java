package com.criteo.publisher.p070l0.p071d;

import com.criteo.publisher.p074n0.C1313q;

/* renamed from: com.criteo.publisher.l0.d.e */
/* compiled from: Tcf1GdprStrategy */
class C1179e implements C1181g {

    /* renamed from: a */
    private final C1313q f3727a;

    public C1179e(C1313q qVar) {
        this.f3727a = qVar;
    }

    /* renamed from: c */
    public String mo3299c() {
        return this.f3727a.mo3662a("IABConsent_ConsentString", "");
    }

    /* renamed from: b */
    public String mo3298b() {
        return this.f3727a.mo3662a("IABConsent_SubjectToGDPR", "");
    }

    /* renamed from: a */
    public Integer mo3297a() {
        return 1;
    }

    /* renamed from: d */
    public boolean mo3300d() {
        return !mo3298b().isEmpty() || !mo3299c().isEmpty();
    }
}
