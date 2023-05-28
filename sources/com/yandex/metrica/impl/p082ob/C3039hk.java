package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.hk */
class C3039hk {

    /* renamed from: a */
    private final C2902dk f8001a;

    /* renamed from: b */
    private final C2844bk f8002b;

    C3039hk(Context context) {
        this(new C2902dk(context), new C2844bk());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2694Wk mo17681a(Activity activity, C2972fl flVar) {
        if (flVar == null) {
            return C2694Wk.NULL_UI_ACCESS_CONFIG;
        }
        if (!flVar.f7867a) {
            return C2694Wk.UI_PARING_FEATURE_DISABLED;
        }
        C3634wl wlVar = flVar.f7871e;
        if (wlVar == null) {
            return C2694Wk.NULL_UI_PARSING_CONFIG;
        }
        if (this.f8001a.mo16981a(activity, wlVar)) {
            return C2694Wk.FORBIDDEN_FOR_APP;
        }
        if (this.f8002b.mo16981a(activity, flVar.f7871e)) {
            return C2694Wk.FORBIDDEN_FOR_ACTIVITY;
        }
        return C2694Wk.OK;
    }

    C3039hk(C2902dk dkVar, C2844bk bkVar) {
        this.f8001a = dkVar;
        this.f8002b = bkVar;
    }
}
