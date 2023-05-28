package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import com.yandex.metrica.impl.p082ob.C3006gk;
import java.util.Collections;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Xk */
class C2724Xk {

    /* renamed from: a */
    private final C3166ll f7204a;

    /* renamed from: b */
    private final C3133kk f7205b;

    /* renamed from: c */
    private final C2830b9 f7206c;

    /* renamed from: d */
    private volatile C2972fl f7207d;

    /* renamed from: e */
    private final C1902Bl f7208e;

    /* renamed from: f */
    private final C3006gk.C3008b f7209f;

    /* renamed from: g */
    private final C3039hk f7210g;

    /* renamed from: com.yandex.metrica.impl.ob.Xk$a */
    class C2725a implements C3166ll {
        C2725a(C2724Xk xk) {
        }

        public void onError(String str) {
        }

        public void onResult(JSONObject jSONObject) {
        }
    }

    C2724Xk(C2972fl flVar, C3133kk kkVar, C2830b9 b9Var, C1902Bl bl, C3039hk hkVar) {
        this(flVar, kkVar, b9Var, bl, hkVar, new C3006gk.C3008b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17068a(C2972fl flVar) {
        this.f7207d = flVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17069b(Activity activity) {
        C2972fl flVar = this.f7207d;
        if (this.f7210g.mo17681a(activity, flVar) == C2694Wk.OK) {
            m8897a(activity, 0, flVar, flVar.f7871e);
        }
    }

    C2724Xk(C2972fl flVar, C3133kk kkVar, C2830b9 b9Var, C1902Bl bl, C3039hk hkVar, C3006gk.C3008b bVar) {
        this.f7204a = new C2725a(this);
        this.f7207d = flVar;
        this.f7205b = kkVar;
        this.f7206c = b9Var;
        this.f7208e = bl;
        this.f7209f = bVar;
        this.f7210g = hkVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17067a(Activity activity) {
        C2972fl flVar = this.f7207d;
        if (this.f7210g.mo17681a(activity, flVar) == C2694Wk.OK) {
            C3634wl wlVar = flVar.f7871e;
            m8897a(activity, wlVar.f9417d, flVar, wlVar);
        }
    }

    /* renamed from: a */
    private void m8897a(Activity activity, long j, C2972fl flVar, C3634wl wlVar) {
        C1902Bl bl = this.f7208e;
        C3006gk.C3008b bVar = this.f7209f;
        C3133kk kkVar = this.f7205b;
        C2830b9 b9Var = this.f7206c;
        C3166ll llVar = this.f7204a;
        bVar.getClass();
        bl.mo15572a(activity, j, flVar, wlVar, Collections.singletonList(new C3006gk(kkVar, b9Var, false, llVar, new C3006gk.C3007a())));
    }
}
