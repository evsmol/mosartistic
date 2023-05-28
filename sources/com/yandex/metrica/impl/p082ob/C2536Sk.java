package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import com.yandex.metrica.impl.p082ob.C3006gk;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.Sk */
class C2536Sk {

    /* renamed from: a */
    private final C3133kk f6734a;

    /* renamed from: b */
    private final C2830b9 f6735b;

    /* renamed from: c */
    private volatile C2972fl f6736c;

    /* renamed from: d */
    private final C1902Bl f6737d;

    /* renamed from: e */
    private final C3006gk.C3008b f6738e;

    /* renamed from: f */
    private final C3039hk f6739f;

    C2536Sk(C2972fl flVar, C3133kk kkVar, C2830b9 b9Var, C1902Bl bl, C3039hk hkVar) {
        this(flVar, kkVar, b9Var, bl, hkVar, new C3006gk.C3008b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16650a(C2972fl flVar) {
        this.f6736c = flVar;
    }

    C2536Sk(C2972fl flVar, C3133kk kkVar, C2830b9 b9Var, C1902Bl bl, C3039hk hkVar, C3006gk.C3008b bVar) {
        this.f6736c = flVar;
        this.f6734a = kkVar;
        this.f6735b = b9Var;
        this.f6737d = bl;
        this.f6739f = hkVar;
        this.f6738e = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16649a(Activity activity, C3166ll llVar, boolean z) {
        String str;
        C2972fl flVar = this.f6736c;
        if ((z || this.f6734a.mo17788b().isEmpty()) && activity != null) {
            C2694Wk a = this.f6739f.mo17681a(activity, flVar);
            if (a != C2694Wk.OK) {
                int ordinal = a.ordinal();
                if (ordinal == 1) {
                    str = String.format("no %s_config", new Object[]{"ui_access"});
                } else if (ordinal == 2) {
                    str = String.format("no %s_config", new Object[]{"ui_parsing"});
                } else if (ordinal != 3) {
                    str = ordinal != 4 ? ordinal != 5 ? "parsing ui context is forbidden for some reason" : "parsing ui context is forbidden by app for activity" : "parsing ui context is forbidden by app for application";
                } else {
                    str = String.format("feature %s disabled", new Object[]{"ui_parsing"});
                }
                llVar.onError(str);
            } else if (!flVar.f7869c) {
                llVar.onError(String.format("feature %s disabled", new Object[]{"ui_collecting_for_bridge"}));
            } else if (flVar.f7873g == null) {
                llVar.onError(String.format("no %s_config", new Object[]{"ui_collecting_for_bridge"}));
            } else {
                C1902Bl bl = this.f6737d;
                C3634wl wlVar = flVar.f7871e;
                C3006gk.C3008b bVar = this.f6738e;
                C3133kk kkVar = this.f6734a;
                C2830b9 b9Var = this.f6735b;
                bVar.getClass();
                bl.mo15572a(activity, 0, flVar, wlVar, Collections.singletonList(new C3006gk(kkVar, b9Var, z, llVar, new C3006gk.C3007a())));
            }
        } else {
            llVar.onResult(this.f6734a.mo17786a());
        }
    }
}
