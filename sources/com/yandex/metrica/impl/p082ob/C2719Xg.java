package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.rtm.wrapper.C3775e;

/* renamed from: com.yandex.metrica.impl.ob.Xg */
public class C2719Xg implements C1854A6 {

    /* renamed from: a */
    private final C3775e f7196a;

    public C2719Xg(C3775e eVar) {
        this.f7196a = eVar;
    }

    /* renamed from: a */
    public void mo15440a(Throwable th, C3607w6 w6Var) {
        String str;
        C3775e eVar = this.f7196a;
        if (th == null) {
            str = "";
        } else {
            str = th.getClass().getName();
        }
        eVar.reportException(str, th);
    }
}
