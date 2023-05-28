package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.ec */
public class C2920ec {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2917e9 f7740a;

    /* renamed from: b */
    private final C1921Cc f7741b;

    /* renamed from: c */
    private final C2994gc f7742c;

    /* renamed from: d */
    private final C2833bc f7743d = m9470a();

    /* renamed from: e */
    private final C2767Zb f7744e;

    /* renamed from: f */
    private final C2891dc f7745f;

    /* renamed from: com.yandex.metrica.impl.ob.ec$a */
    class C2921a implements C2994gc {
        C2921a() {
        }

        /* renamed from: a */
        public void mo17546a(long j) {
            C2920ec.this.f7740a.mo17523g(j);
        }

        public long getLastAttemptTimeSeconds() {
            return C2920ec.this.f7740a.mo17510b(0);
        }
    }

    public C2920ec(C1921Cc cc, C2917e9 e9Var, C2425Pc pc) {
        this.f7741b = cc;
        this.f7740a = e9Var;
        C2994gc b = m9473b();
        this.f7742c = b;
        this.f7744e = m9469a(b);
        this.f7745f = m9471a(pc);
    }

    /* renamed from: b */
    private C2994gc m9473b() {
        return new C2921a();
    }

    /* renamed from: a */
    private C2833bc m9470a() {
        return new C2833bc(this.f7741b.f5169a.f6632b);
    }

    /* renamed from: a */
    private C2767Zb m9469a(C2994gc gcVar) {
        return new C2767Zb(gcVar, new C3641x2());
    }

    /* renamed from: a */
    private C2891dc m9471a(C2425Pc pc) {
        C2517Sb sb = this.f7741b.f5169a;
        return new C2891dc(sb.f6631a, pc, sb.f6632b, sb.f6633c);
    }

    /* renamed from: a */
    public C1985Ec<C2864cc> mo17545a(C2864cc ccVar) {
        return new C1985Ec(this.f7745f, this.f7744e, new C2372Ob(this.f7742c, new SystemTimeProvider()), this.f7743d, ccVar);
    }
}
