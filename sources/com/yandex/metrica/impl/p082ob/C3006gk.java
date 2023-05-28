package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gk */
class C3006gk implements C3595vl {

    /* renamed from: a */
    private final C3133kk f7932a;

    /* renamed from: b */
    private final C2830b9 f7933b;

    /* renamed from: c */
    private final C3166ll f7934c;

    /* renamed from: d */
    private final C3007a f7935d;

    /* renamed from: e */
    private final boolean f7936e;

    /* renamed from: com.yandex.metrica.impl.ob.gk$a */
    static class C3007a {
        C3007a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.gk$b */
    static class C3008b {
        C3008b() {
        }
    }

    C3006gk(C3133kk kkVar, C2830b9 b9Var, boolean z, C3166ll llVar, C3007a aVar) {
        this.f7932a = kkVar;
        this.f7933b = b9Var;
        this.f7936e = z;
        this.f7934c = llVar;
        this.f7935d = aVar;
    }

    /* renamed from: b */
    private boolean m9645b(C2972fl flVar) {
        if (!flVar.f7869c || flVar.f7873g == null) {
            return false;
        }
        if (this.f7936e || this.f7933b.mo17244a(false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo16225a(long j, Activity activity, C2903dl dlVar, List<C3454rl> list, C2972fl flVar, C1900Bk bk) {
        C2032Fk fk;
        if (m9645b(flVar)) {
            C3007a aVar = this.f7935d;
            C3040hl hlVar = flVar.f7873g;
            aVar.getClass();
            if (hlVar.f8010h) {
                fk = new C2032Fk();
            } else {
                fk = new C1931Ck(list);
            }
            this.f7932a.mo17787a(fk.mo18047a(activity, dlVar, flVar.f7873g, bk.mo15568a(), j));
            this.f7934c.onResult(this.f7932a.mo17786a());
        }
    }

    /* renamed from: a */
    public void mo16229a(Throwable th, C3634wl wlVar) {
        C3166ll llVar = this.f7934c;
        llVar.onError("exception: " + th.getMessage());
    }

    /* renamed from: a */
    public boolean mo16230a(C2972fl flVar) {
        return m9645b(flVar) && !flVar.f7873g.f8010h;
    }
}
