package com.applovin.exoplayer2.p209i.p215f;

import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.f.b */
final class C7587b implements C7585f {

    /* renamed from: a */
    private final C7540a[] f17658a;

    /* renamed from: b */
    private final long[] f17659b;

    public C7587b(C7540a[] aVarArr, long[] jArr) {
        this.f17658a = aVarArr;
        this.f17659b = jArr;
    }

    /* renamed from: a */
    public int mo54694a(long j) {
        int b = C7728ai.m22228b(this.f17659b, j, false, false);
        if (b < this.f17659b.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: a */
    public long mo54695a(int i) {
        boolean z = true;
        C7717a.m22118a(i >= 0);
        if (i >= this.f17659b.length) {
            z = false;
        }
        C7717a.m22118a(z);
        return this.f17659b[i];
    }

    /* renamed from: b */
    public List<C7540a> mo54696b(long j) {
        int a = C7728ai.m22189a(this.f17659b, j, true, false);
        return (a == -1 || this.f17658a[a] == C7540a.f17399a) ? Collections.emptyList() : Collections.singletonList(this.f17658a[a]);
    }

    /* renamed from: f_ */
    public int mo54697f_() {
        return this.f17659b.length;
    }
}
