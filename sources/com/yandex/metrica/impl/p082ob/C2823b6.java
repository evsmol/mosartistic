package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.b6 */
public class C2823b6 {

    /* renamed from: a */
    private final C2259L3 f7420a;

    /* renamed from: b */
    private final C2794a6 f7421b;

    /* renamed from: c */
    private final C2824a f7422c;

    /* renamed from: d */
    private final C1841A0 f7423d;

    /* renamed from: e */
    private final C2592U5<C2679W5> f7424e;

    /* renamed from: f */
    private final C2592U5<C2679W5> f7425f;

    /* renamed from: g */
    private C2652V5 f7426g;

    /* renamed from: h */
    private C2825b f7427h;

    /* renamed from: com.yandex.metrica.impl.ob.b6$a */
    public interface C2824a {
        /* renamed from: a */
        void mo16147a(C2851c0 c0Var, C2858c6 c6Var);
    }

    /* renamed from: com.yandex.metrica.impl.ob.b6$b */
    public enum C2825b {
        EMPTY,
        BACKGROUND,
        FOREGROUND
    }

    public C2823b6(C2259L3 l3, C2794a6 a6Var, C2824a aVar) {
        this(l3, a6Var, aVar, new C2553T5(l3, a6Var), new C2509S5(l3, a6Var), new C1841A0(l3.mo16129g()));
    }

    /* renamed from: e */
    private void m9091e(C2851c0 c0Var) {
        if (this.f7427h == null) {
            C2652V5 b = ((C2474R5) this.f7424e).mo16550b();
            if (m9089a(b, c0Var)) {
                this.f7426g = b;
                this.f7427h = C2825b.FOREGROUND;
                return;
            }
            C2652V5 b2 = ((C2474R5) this.f7425f).mo16550b();
            if (m9089a(b2, c0Var)) {
                this.f7426g = b2;
                this.f7427h = C2825b.BACKGROUND;
                return;
            }
            this.f7426g = null;
            this.f7427h = C2825b.EMPTY;
        }
    }

    /* renamed from: a */
    public synchronized long mo17211a() {
        C2652V5 v5;
        v5 = this.f7426g;
        return v5 == null ? 10000000000L : v5.mo16956c() - 1;
    }

    /* renamed from: b */
    public C2858c6 mo17212b(C2851c0 c0Var) {
        return m9088a(mo17213c(c0Var), c0Var.mo17336e());
    }

    /* renamed from: c */
    public synchronized C2652V5 mo17213c(C2851c0 c0Var) {
        m9091e(c0Var);
        C2825b bVar = this.f7427h;
        C2825b bVar2 = C2825b.EMPTY;
        if (bVar != bVar2 && !m9089a(this.f7426g, c0Var)) {
            this.f7427h = bVar2;
            this.f7426g = null;
        }
        int ordinal = this.f7427h.ordinal();
        if (ordinal == 1) {
            this.f7426g.mo16957c(c0Var.mo17336e());
            return this.f7426g;
        } else if (ordinal != 2) {
            this.f7427h = C2825b.BACKGROUND;
            long e = c0Var.mo17336e();
            C2652V5 a = ((C2474R5) this.f7425f).mo16548a(new C2679W5(e, c0Var.mo17337f()));
            if (this.f7420a.mo16145x().mo17236k()) {
                this.f7422c.mo16147a(C2851c0.m9218a(c0Var, this.f7423d), m9088a(a, c0Var.mo17336e()));
            } else if (c0Var.mo17346o() == C2788a1.EVENT_TYPE_FIRST_ACTIVATION.mo17139b()) {
                this.f7422c.mo16147a(c0Var, m9088a(a, e));
                this.f7422c.mo16147a(C2851c0.m9218a(c0Var, this.f7423d), m9088a(a, e));
            }
            this.f7426g = a;
            return a;
        } else {
            return this.f7426g;
        }
    }

    /* renamed from: d */
    public synchronized void mo17214d(C2851c0 c0Var) {
        m9091e(c0Var);
        int ordinal = this.f7427h.ordinal();
        if (ordinal == 0) {
            this.f7426g = m9087a(c0Var);
        } else if (ordinal == 1) {
            m9090b(this.f7426g, c0Var);
            this.f7426g = m9087a(c0Var);
        } else if (ordinal == 2) {
            if (m9089a(this.f7426g, c0Var)) {
                this.f7426g.mo16957c(c0Var.mo17336e());
            } else {
                this.f7426g = m9087a(c0Var);
            }
        }
    }

    /* renamed from: f */
    public C2858c6 mo17215f(C2851c0 c0Var) {
        C2652V5 v5;
        boolean z;
        if (this.f7427h == null) {
            v5 = ((C2474R5) this.f7424e).mo16550b();
            boolean z2 = false;
            if (v5 == null) {
                z = false;
            } else {
                z = v5.mo16955b(c0Var.mo17336e());
            }
            if (z) {
                v5 = ((C2474R5) this.f7425f).mo16550b();
                if (v5 != null) {
                    z2 = v5.mo16955b(c0Var.mo17336e());
                }
                if (z2) {
                    v5 = null;
                }
            }
        } else {
            v5 = this.f7426g;
        }
        if (v5 != null) {
            return new C2858c6().mo17374c(v5.mo16956c()).mo17369a(v5.mo16959e()).mo17372b(v5.mo16958d()).mo17370a(v5.mo16960f());
        }
        long f = c0Var.mo17337f();
        long a = this.f7421b.mo17153a();
        C2265L7 i = this.f7420a.mo16131i();
        C2943f6 f6Var = C2943f6.BACKGROUND;
        i.mo16155a(a, f6Var, f);
        return new C2858c6().mo17374c(a).mo17370a(f6Var).mo17369a(0).mo17372b(0);
    }

    /* renamed from: g */
    public synchronized void mo17216g(C2851c0 c0Var) {
        mo17213c(c0Var).mo16953a(false);
        C2825b bVar = this.f7427h;
        C2825b bVar2 = C2825b.EMPTY;
        if (bVar != bVar2) {
            m9090b(this.f7426g, c0Var);
        }
        this.f7427h = bVar2;
    }

    /* renamed from: a */
    private C2652V5 m9087a(C2851c0 c0Var) {
        long e = c0Var.mo17336e();
        C2652V5 a = ((C2474R5) this.f7424e).mo16548a(new C2679W5(e, c0Var.mo17337f()));
        this.f7427h = C2825b.FOREGROUND;
        this.f7420a.mo16134l().mo17915c();
        this.f7422c.mo16147a(C2851c0.m9218a(c0Var, this.f7423d), m9088a(a, e));
        return a;
    }

    /* renamed from: b */
    private void m9090b(C2652V5 v5, C2851c0 c0Var) {
        if (v5.mo16961h()) {
            this.f7422c.mo16147a(C2851c0.m9216a(c0Var), new C2858c6().mo17374c(v5.mo16956c()).mo17370a(v5.mo16960f()).mo17369a(v5.mo16959e()).mo17372b(v5.mo16954b()));
            v5.mo16953a(false);
        }
        v5.mo16962i();
    }

    public C2823b6(C2259L3 l3, C2794a6 a6Var, C2824a aVar, C2592U5<C2679W5> u5, C2592U5<C2679W5> u52, C1841A0 a0) {
        this.f7427h = null;
        this.f7420a = l3;
        this.f7422c = aVar;
        this.f7424e = u5;
        this.f7425f = u52;
        this.f7421b = a6Var;
        this.f7423d = a0;
    }

    /* renamed from: a */
    private boolean m9089a(C2652V5 v5, C2851c0 c0Var) {
        if (v5 == null) {
            return false;
        }
        if (v5.mo16955b(c0Var.mo17336e())) {
            return true;
        }
        m9090b(v5, c0Var);
        return false;
    }

    /* renamed from: a */
    private C2858c6 m9088a(C2652V5 v5, long j) {
        return new C2858c6().mo17374c(v5.mo16956c()).mo17369a(v5.mo16959e()).mo17372b(v5.mo16952a(j)).mo17370a(v5.mo16960f());
    }
}
