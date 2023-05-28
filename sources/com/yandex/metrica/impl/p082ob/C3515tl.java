package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.tl */
public class C3515tl {

    /* renamed from: a */
    private final C3517b f9166a;

    /* renamed from: b */
    private final C3516a f9167b;

    /* renamed from: com.yandex.metrica.impl.ob.tl$a */
    static class C3516a {
        C3516a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.tl$b */
    static class C3517b {
        C3517b() {
        }
    }

    public C3515tl() {
        this(new C3517b(), new C3516a());
    }

    /* renamed from: a */
    public C2903dl mo18239a(Activity activity, C2100Hk hk, C3634wl wlVar, C1870Ak ak, C3710yl ylVar, C3486sl slVar) {
        ViewGroup viewGroup;
        C3634wl wlVar2 = wlVar;
        C3710yl ylVar2 = ylVar;
        C2903dl dlVar = new C2903dl();
        try {
            viewGroup = (ViewGroup) activity.findViewById(16908290);
        } catch (Throwable th) {
            ylVar2.mo18437a("ui_parsing_root", th);
            viewGroup = null;
        }
        if (viewGroup != null) {
            this.f9166a.getClass();
            C3634wl wlVar3 = wlVar;
            C1870Ak ak2 = ak;
            C3710yl ylVar3 = ylVar;
            C3486sl slVar2 = slVar;
            C2498Rk rk = new C2498Rk(wlVar3, new C2033Fl(ylVar2), new C3485sk(wlVar2.f9416c), ak2, Collections.singletonList(new C2320Mk()), Arrays.asList(new C3420qk[]{new C2811al(wlVar2.f9415b)}), ylVar3, slVar2, new C2101Hl());
            dlVar.mo17471a(rk, (View) viewGroup, hk);
            if (wlVar2.f9418e) {
                this.f9167b.getClass();
                C3453rk rkVar = new C3453rk(rk.mo16579a());
                for (C2845bl a : rk.mo16581b()) {
                    rkVar.mo18178a(a);
                }
            }
        }
        return dlVar;
    }

    C3515tl(C3517b bVar, C3516a aVar) {
        this.f9166a = bVar;
        this.f9167b = aVar;
    }
}
