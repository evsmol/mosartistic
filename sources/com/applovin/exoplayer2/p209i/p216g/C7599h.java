package com.applovin.exoplayer2.p209i.p216g;

import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.i.g.h */
final class C7599h implements C7585f {

    /* renamed from: a */
    private final C7595d f17727a;

    /* renamed from: b */
    private final long[] f17728b;

    /* renamed from: c */
    private final Map<String, C7598g> f17729c;

    /* renamed from: d */
    private final Map<String, C7596e> f17730d;

    /* renamed from: e */
    private final Map<String, String> f17731e;

    public C7599h(C7595d dVar, Map<String, C7598g> map, Map<String, C7596e> map2, Map<String, String> map3) {
        this.f17727a = dVar;
        this.f17730d = map2;
        this.f17731e = map3;
        this.f17729c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f17728b = dVar.mo54718b();
    }

    /* renamed from: a */
    public int mo54694a(long j) {
        int b = C7728ai.m22228b(this.f17728b, j, false, false);
        if (b < this.f17728b.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: a */
    public long mo54695a(int i) {
        return this.f17728b[i];
    }

    /* renamed from: b */
    public List<C7540a> mo54696b(long j) {
        return this.f17727a.mo54715a(j, this.f17729c, this.f17730d, this.f17731e);
    }

    /* renamed from: f_ */
    public int mo54697f_() {
        return this.f17728b.length;
    }
}
