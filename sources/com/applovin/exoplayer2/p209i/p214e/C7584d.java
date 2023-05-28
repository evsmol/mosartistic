package com.applovin.exoplayer2.p209i.p214e;

import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.e.d */
final class C7584d implements C7585f {

    /* renamed from: a */
    private final List<List<C7540a>> f17652a;

    /* renamed from: b */
    private final List<Long> f17653b;

    public C7584d(List<List<C7540a>> list, List<Long> list2) {
        this.f17652a = list;
        this.f17653b = list2;
    }

    /* renamed from: a */
    public int mo54694a(long j) {
        int b = C7728ai.m22226b(this.f17653b, Long.valueOf(j), false, false);
        if (b < this.f17653b.size()) {
            return b;
        }
        return -1;
    }

    /* renamed from: a */
    public long mo54695a(int i) {
        boolean z = true;
        C7717a.m22118a(i >= 0);
        if (i >= this.f17653b.size()) {
            z = false;
        }
        C7717a.m22118a(z);
        return this.f17653b.get(i).longValue();
    }

    /* renamed from: b */
    public List<C7540a> mo54696b(long j) {
        int a = C7728ai.m22185a(this.f17653b, Long.valueOf(j), true, false);
        return a == -1 ? Collections.emptyList() : this.f17652a.get(a);
    }

    /* renamed from: f_ */
    public int mo54697f_() {
        return this.f17653b.size();
    }
}
