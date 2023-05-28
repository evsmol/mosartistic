package com.applovin.exoplayer2.p209i.p217h;

import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p221l.C7717a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.h.b */
final class C7602b implements C7585f {

    /* renamed from: a */
    public static final C7602b f17739a = new C7602b();

    /* renamed from: b */
    private final List<C7540a> f17740b;

    private C7602b() {
        this.f17740b = Collections.emptyList();
    }

    public C7602b(C7540a aVar) {
        this.f17740b = Collections.singletonList(aVar);
    }

    /* renamed from: a */
    public int mo54694a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: a */
    public long mo54695a(int i) {
        C7717a.m22118a(i == 0);
        return 0;
    }

    /* renamed from: b */
    public List<C7540a> mo54696b(long j) {
        return j >= 0 ? this.f17740b : Collections.emptyList();
    }

    /* renamed from: f_ */
    public int mo54697f_() {
        return 1;
    }
}
