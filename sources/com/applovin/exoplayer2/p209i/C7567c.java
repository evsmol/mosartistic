package com.applovin.exoplayer2.p209i;

import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p182c.C6925i;
import com.applovin.exoplayer2.p221l.C7717a;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.i.c */
public final class C7567c implements C7588g {

    /* renamed from: a */
    private final C7555b f17590a = new C7555b();

    /* renamed from: b */
    private final C7619j f17591b = new C7619j();

    /* renamed from: c */
    private final Deque<C7620k> f17592c = new ArrayDeque();

    /* renamed from: d */
    private int f17593d;

    /* renamed from: e */
    private boolean f17594e;

    /* renamed from: com.applovin.exoplayer2.i.c$a */
    private static final class C7568a implements C7585f {

        /* renamed from: a */
        private final long f17595a;

        /* renamed from: b */
        private final C7033s<C7540a> f17596b;

        public C7568a(long j, C7033s<C7540a> sVar) {
            this.f17595a = j;
            this.f17596b = sVar;
        }

        /* renamed from: a */
        public int mo54694a(long j) {
            return this.f17595a > j ? 0 : -1;
        }

        /* renamed from: a */
        public long mo54695a(int i) {
            C7717a.m22118a(i == 0);
            return this.f17595a;
        }

        /* renamed from: b */
        public List<C7540a> mo54696b(long j) {
            return j >= this.f17595a ? this.f17596b : C7033s.m18803g();
        }

        /* renamed from: f_ */
        public int mo54697f_() {
            return 1;
        }
    }

    public C7567c() {
        for (int i = 0; i < 2; i++) {
            this.f17592c.addFirst(new C7578e(new C6925i.C6926a() {
                public final void releaseOutputBuffer(C6925i iVar) {
                    C7567c.this.m21415a((C7620k) iVar);
                }
            }));
        }
        this.f17593d = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m21415a(C7620k kVar) {
        C7717a.m22121b(this.f17592c.size() < 2);
        C7717a.m22118a(!this.f17592c.contains(kVar));
        kVar.mo53121a();
        this.f17592c.addFirst(kVar);
    }

    /* renamed from: a */
    public void mo54658a(long j) {
    }

    /* renamed from: a */
    public void mo53134a(C7619j jVar) throws C7600h {
        boolean z = true;
        C7717a.m22121b(!this.f17594e);
        C7717a.m22121b(this.f17593d == 1);
        if (this.f17591b != jVar) {
            z = false;
        }
        C7717a.m22118a(z);
        this.f17593d = 2;
    }

    /* renamed from: c */
    public void mo53136c() {
        C7717a.m22121b(!this.f17594e);
        this.f17591b.mo53121a();
        this.f17593d = 0;
    }

    /* renamed from: d */
    public void mo53137d() {
        this.f17594e = true;
    }

    /* renamed from: e */
    public C7619j mo53133a() throws C7600h {
        C7717a.m22121b(!this.f17594e);
        if (this.f17593d != 0) {
            return null;
        }
        this.f17593d = 1;
        return this.f17591b;
    }

    /* renamed from: f */
    public C7620k mo53135b() throws C7600h {
        C7717a.m22121b(!this.f17594e);
        if (this.f17593d != 2 || this.f17592c.isEmpty()) {
            return null;
        }
        C7620k removeFirst = this.f17592c.removeFirst();
        if (this.f17591b.mo53126c()) {
            removeFirst.mo53123b(4);
        } else {
            C7568a aVar = new C7568a(this.f17591b.f15334d, this.f17590a.mo54698a(((ByteBuffer) C7717a.m22120b(this.f17591b.f15332b)).array()));
            removeFirst.mo54792a(this.f17591b.f15334d, aVar, 0);
        }
        this.f17591b.mo53121a();
        this.f17593d = 0;
        return removeFirst;
    }
}
