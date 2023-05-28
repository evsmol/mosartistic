package com.applovin.exoplayer2.p209i.p210a;

import com.applovin.exoplayer2.p182c.C6925i;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p209i.C7588g;
import com.applovin.exoplayer2.p209i.C7600h;
import com.applovin.exoplayer2.p209i.C7619j;
import com.applovin.exoplayer2.p209i.C7620k;
import com.applovin.exoplayer2.p209i.p210a.C7550c;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.applovin.exoplayer2.i.a.c */
abstract class C7550c implements C7588g {

    /* renamed from: a */
    private final ArrayDeque<C7552a> f17523a = new ArrayDeque<>();

    /* renamed from: b */
    private final ArrayDeque<C7620k> f17524b;

    /* renamed from: c */
    private final PriorityQueue<C7552a> f17525c;

    /* renamed from: d */
    private C7552a f17526d;

    /* renamed from: e */
    private long f17527e;

    /* renamed from: f */
    private long f17528f;

    /* renamed from: com.applovin.exoplayer2.i.a.c$a */
    private static final class C7552a extends C7619j implements Comparable<C7552a> {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f17529g;

        private C7552a() {
        }

        /* renamed from: a */
        public int compareTo(C7552a aVar) {
            if (mo53126c() != aVar.mo53126c()) {
                return mo53126c() ? 1 : -1;
            }
            long j = this.f15334d - aVar.f15334d;
            if (j == 0) {
                j = this.f17529g - aVar.f17529g;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.a.c$b */
    private static final class C7553b extends C7620k {

        /* renamed from: c */
        private C6925i.C6926a<C7553b> f17530c;

        public C7553b(C6925i.C6926a<C7553b> aVar) {
            this.f17530c = aVar;
        }

        /* renamed from: f */
        public final void mo53146f() {
            this.f17530c.releaseOutputBuffer(this);
        }
    }

    public C7550c() {
        for (int i = 0; i < 10; i++) {
            this.f17523a.add(new C7552a());
        }
        this.f17524b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f17524b.add(new C7553b(new C6925i.C6926a() {
                public final void releaseOutputBuffer(C6925i iVar) {
                    C7550c.this.mo54689a((C7620k) (C7550c.C7553b) iVar);
                }
            }));
        }
        this.f17525c = new PriorityQueue<>();
    }

    /* renamed from: a */
    private void m21366a(C7552a aVar) {
        aVar.mo53121a();
        this.f17523a.add(aVar);
    }

    /* renamed from: a */
    public void mo54658a(long j) {
        this.f17527e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54659a(C7619j jVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54689a(C7620k kVar) {
        kVar.mo53121a();
        this.f17524b.add(kVar);
    }

    /* renamed from: b */
    public void mo53134a(C7619j jVar) throws C7600h {
        C7717a.m22118a(jVar == this.f17526d);
        C7552a aVar = (C7552a) jVar;
        if (aVar.mo53124b()) {
            m21366a(aVar);
        } else {
            long j = this.f17528f;
            this.f17528f = 1 + j;
            long unused = aVar.f17529g = j;
            this.f17525c.add(aVar);
        }
        this.f17526d = null;
    }

    /* renamed from: c */
    public void mo53136c() {
        this.f17528f = 0;
        this.f17527e = 0;
        while (!this.f17525c.isEmpty()) {
            m21366a((C7552a) C7728ai.m22198a(this.f17525c.poll()));
        }
        C7552a aVar = this.f17526d;
        if (aVar != null) {
            m21366a(aVar);
            this.f17526d = null;
        }
    }

    /* renamed from: d */
    public void mo53137d() {
    }

    /* renamed from: e */
    public C7620k mo53135b() throws C7600h {
        C7620k kVar;
        if (this.f17524b.isEmpty()) {
            return null;
        }
        while (!this.f17525c.isEmpty() && ((C7552a) C7728ai.m22198a(this.f17525c.peek())).f15334d <= this.f17527e) {
            C7552a aVar = (C7552a) C7728ai.m22198a(this.f17525c.poll());
            if (aVar.mo53126c()) {
                kVar = (C7620k) C7728ai.m22198a(this.f17524b.pollFirst());
                kVar.mo53123b(4);
            } else {
                mo54659a((C7619j) aVar);
                if (mo54662f()) {
                    C7585f g = mo54663g();
                    kVar = (C7620k) C7728ai.m22198a(this.f17524b.pollFirst());
                    kVar.mo54792a(aVar.f15334d, g, Long.MAX_VALUE);
                } else {
                    m21366a(aVar);
                }
            }
            m21366a(aVar);
            return kVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo54662f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C7585f mo54663g();

    /* renamed from: h */
    public C7619j mo53133a() throws C7600h {
        C7717a.m22121b(this.f17526d == null);
        if (this.f17523a.isEmpty()) {
            return null;
        }
        C7552a pollFirst = this.f17523a.pollFirst();
        this.f17526d = pollFirst;
        return pollFirst;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C7620k mo54690j() {
        return this.f17524b.pollFirst();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final long mo54691k() {
        return this.f17527e;
    }
}
