package com.applovin.exoplayer2.p209i;

import com.applovin.exoplayer2.p182c.C6925i;
import com.applovin.exoplayer2.p221l.C7717a;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.k */
public abstract class C7620k extends C6925i implements C7585f {

    /* renamed from: c */
    private C7585f f17799c;

    /* renamed from: d */
    private long f17800d;

    /* renamed from: a */
    public int mo54694a(long j) {
        return ((C7585f) C7717a.m22120b(this.f17799c)).mo54694a(j - this.f17800d);
    }

    /* renamed from: a */
    public long mo54695a(int i) {
        return ((C7585f) C7717a.m22120b(this.f17799c)).mo54695a(i) + this.f17800d;
    }

    /* renamed from: a */
    public void mo53121a() {
        super.mo53121a();
        this.f17799c = null;
    }

    /* renamed from: a */
    public void mo54792a(long j, C7585f fVar, long j2) {
        this.f15345a = j;
        this.f17799c = fVar;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.f15345a;
        }
        this.f17800d = j2;
    }

    /* renamed from: b */
    public List<C7540a> mo54696b(long j) {
        return ((C7585f) C7717a.m22120b(this.f17799c)).mo54696b(j - this.f17800d);
    }

    /* renamed from: f_ */
    public int mo54697f_() {
        return ((C7585f) C7717a.m22120b(this.f17799c)).mo54697f_();
    }
}
