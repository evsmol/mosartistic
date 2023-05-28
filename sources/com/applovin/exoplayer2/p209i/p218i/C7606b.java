package com.applovin.exoplayer2.p209i.p218i;

import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p221l.C7717a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.i.b */
final class C7606b implements C7585f {

    /* renamed from: a */
    private final List<C7540a> f17743a;

    public C7606b(List<C7540a> list) {
        this.f17743a = Collections.unmodifiableList(list);
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
        return j >= 0 ? this.f17743a : Collections.emptyList();
    }

    /* renamed from: f_ */
    public int mo54697f_() {
        return 1;
    }
}
