package com.applovin.exoplayer2.p206h;

import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.p185d.C7147d;
import com.applovin.exoplayer2.p185d.C7157h;
import com.applovin.exoplayer2.p185d.C7160i;
import com.applovin.exoplayer2.p186e.C7223f;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.C7516s;
import com.applovin.exoplayer2.p206h.C7518t;
import com.applovin.exoplayer2.p206h.C7524u;
import com.applovin.exoplayer2.p220k.C7654aa;
import com.applovin.exoplayer2.p220k.C7657b;
import com.applovin.exoplayer2.p220k.C7670i;
import com.applovin.exoplayer2.p220k.C7687r;
import com.applovin.exoplayer2.p220k.C7699v;
import com.applovin.exoplayer2.p221l.C7717a;

/* renamed from: com.applovin.exoplayer2.h.u */
public final class C7524u extends C7477a implements C7518t.C7520b {

    /* renamed from: a */
    private final C6787ab f17325a;

    /* renamed from: b */
    private final C6787ab.C6796f f17326b;

    /* renamed from: c */
    private final C7670i.C7671a f17327c;

    /* renamed from: d */
    private final C7516s.C7517a f17328d;

    /* renamed from: e */
    private final C7157h f17329e;

    /* renamed from: f */
    private final C7699v f17330f;

    /* renamed from: g */
    private final int f17331g;

    /* renamed from: h */
    private boolean f17332h;

    /* renamed from: i */
    private long f17333i;

    /* renamed from: j */
    private boolean f17334j;

    /* renamed from: k */
    private boolean f17335k;

    /* renamed from: l */
    private C7654aa f17336l;

    /* renamed from: com.applovin.exoplayer2.h.u$a */
    public static final class C7526a implements C7515r {

        /* renamed from: a */
        private final C7670i.C7671a f17338a;

        /* renamed from: b */
        private C7516s.C7517a f17339b;

        /* renamed from: c */
        private C7160i f17340c;

        /* renamed from: d */
        private C7699v f17341d;

        /* renamed from: e */
        private int f17342e;

        /* renamed from: f */
        private String f17343f;

        /* renamed from: g */
        private Object f17344g;

        public C7526a(C7670i.C7671a aVar) {
            this(aVar, (C7340l) new C7223f());
        }

        public C7526a(C7670i.C7671a aVar, C7340l lVar) {
            this(aVar, (C7516s.C7517a) new C7516s.C7517a() {
                public final C7516s createProgressiveMediaExtractor() {
                    return C7524u.C7526a.m21143a(C7340l.this);
                }
            });
        }

        public C7526a(C7670i.C7671a aVar, C7516s.C7517a aVar2) {
            this.f17338a = aVar;
            this.f17339b = aVar2;
            this.f17340c = new C7147d();
            this.f17341d = new C7687r();
            this.f17342e = 1048576;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ C7516s m21143a(C7340l lVar) {
            return new C7488c(lVar);
        }

        /* renamed from: a */
        public C7524u mo54583a(C6787ab abVar) {
            C6787ab.C6790b bVar;
            C6787ab.C6790b a;
            C7717a.m22120b(abVar.f14614c);
            boolean z = true;
            boolean z2 = abVar.f14614c.f14677h == null && this.f17344g != null;
            if (abVar.f14614c.f14675f != null || this.f17343f == null) {
                z = false;
            }
            if (z2 && z) {
                a = abVar.mo52611a().mo52617a(this.f17344g);
            } else if (z2) {
                bVar = abVar.mo52611a().mo52617a(this.f17344g);
                abVar = bVar.mo52619a();
                C6787ab abVar2 = abVar;
                return new C7524u(abVar2, this.f17338a, this.f17339b, this.f17340c.mo53794a(abVar2), this.f17341d, this.f17342e);
            } else {
                if (z) {
                    a = abVar.mo52611a();
                }
                C6787ab abVar22 = abVar;
                return new C7524u(abVar22, this.f17338a, this.f17339b, this.f17340c.mo53794a(abVar22), this.f17341d, this.f17342e);
            }
            bVar = a.mo52620b(this.f17343f);
            abVar = bVar.mo52619a();
            C6787ab abVar222 = abVar;
            return new C7524u(abVar222, this.f17338a, this.f17339b, this.f17340c.mo53794a(abVar222), this.f17341d, this.f17342e);
        }
    }

    private C7524u(C6787ab abVar, C7670i.C7671a aVar, C7516s.C7517a aVar2, C7157h hVar, C7699v vVar, int i) {
        this.f17326b = (C6787ab.C6796f) C7717a.m22120b(abVar.f14614c);
        this.f17325a = abVar;
        this.f17327c = aVar;
        this.f17328d = aVar2;
        this.f17329e = hVar;
        this.f17330f = vVar;
        this.f17331g = i;
        this.f17332h = true;
        this.f17333i = -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.applovin.exoplayer2.h.u$1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21133f() {
        /*
            r9 = this;
            com.applovin.exoplayer2.h.aa r8 = new com.applovin.exoplayer2.h.aa
            long r1 = r9.f17333i
            boolean r3 = r9.f17334j
            boolean r5 = r9.f17335k
            com.applovin.exoplayer2.ab r7 = r9.f17325a
            r4 = 0
            r6 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f17332h
            if (r0 == 0) goto L_0x001a
            com.applovin.exoplayer2.h.u$1 r0 = new com.applovin.exoplayer2.h.u$1
            r0.<init>(r8)
            r8 = r0
        L_0x001a:
            r9.mo54444a((com.applovin.exoplayer2.C6904ba) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7524u.m21133f():void");
    }

    /* renamed from: a */
    public void mo54580a(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f17333i;
        }
        if (this.f17332h || this.f17333i != j || this.f17334j != z || this.f17335k != z2) {
            this.f17333i = j;
            this.f17334j = z;
            this.f17335k = z2;
            this.f17332h = false;
            m21133f();
        }
    }

    /* renamed from: a */
    public void mo54539a(C7506n nVar) {
        ((C7518t) nVar).mo54574g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54449a(C7654aa aaVar) {
        this.f17336l = aaVar;
        this.f17329e.mo53781a();
        m21133f();
    }

    /* renamed from: b */
    public C7506n mo54541b(C7509p.C7510a aVar, C7657b bVar, long j) {
        C7670i a = this.f17327c.mo54901a();
        C7654aa aaVar = this.f17336l;
        if (aaVar != null) {
            a.mo54524a(aaVar);
        }
        return new C7518t(this.f17326b.f14670a, a, this.f17328d.createProgressiveMediaExtractor(), this.f17329e, mo54450b(aVar), this.f17330f, mo54440a(aVar), this, bVar, this.f17326b.f14675f, this.f17331g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo54453c() {
        this.f17329e.mo53784b();
    }

    /* renamed from: e */
    public void mo54521e() {
    }

    /* renamed from: g */
    public C6787ab mo54543g() {
        return this.f17325a;
    }
}
