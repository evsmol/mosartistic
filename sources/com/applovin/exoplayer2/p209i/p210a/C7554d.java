package com.applovin.exoplayer2.p209i.p210a;

import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p221l.C7717a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.a.d */
final class C7554d implements C7585f {

    /* renamed from: a */
    private final List<C7540a> f17531a;

    public C7554d(List<C7540a> list) {
        this.f17531a = list;
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
        return j >= 0 ? this.f17531a : Collections.emptyList();
    }

    /* renamed from: f_ */
    public int mo54697f_() {
        return 1;
    }
}
