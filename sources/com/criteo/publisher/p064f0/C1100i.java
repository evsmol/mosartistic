package com.criteo.publisher.p064f0;

import com.criteo.publisher.p064f0.C1118r;
import com.criteo.publisher.p074n0.C1300g;
import java.util.Collection;

/* renamed from: com.criteo.publisher.f0.i */
/* compiled from: BoundedMetricRepository */
class C1100i extends C1118r {

    /* renamed from: a */
    private final C1118r f3569a;

    /* renamed from: b */
    private final C1300g f3570b;

    C1100i(C1118r rVar, C1300g gVar) {
        this.f3569a = rVar;
        this.f3570b = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3207a(String str, C1118r.C1119a aVar) {
        if (mo3209b() < this.f3570b.mo3640l() || mo3208a(str)) {
            this.f3569a.mo3207a(str, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3206a(String str, C1116p pVar) {
        this.f3569a.mo3206a(str, pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Collection<C1112n> mo3205a() {
        return this.f3569a.mo3205a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo3209b() {
        return this.f3569a.mo3209b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3208a(String str) {
        return this.f3569a.mo3208a(str);
    }
}
