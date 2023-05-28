package com.yandex.metrica.impl.p082ob;

import android.telephony.CellInfo;
import com.yandex.metrica.impl.p082ob.C3555uj;

/* renamed from: com.yandex.metrica.impl.ob.pj */
public abstract class C3359pj<T extends CellInfo> implements Object<T> {

    /* renamed from: a */
    private final String f8643a = ("[" + getClass().getName() + "]");

    /* renamed from: b */
    private volatile C2531Sh f8644b;

    /* renamed from: b */
    private boolean m10412b(T t) {
        C2531Sh sh = this.f8644b;
        if (sh == null || !sh.f6681t) {
            return false;
        }
        boolean isRegistered = t.isRegistered();
        if (!sh.f6682u || isRegistered) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo15468a(T t, C3555uj.C3556a aVar) {
        mo15469b(t, aVar);
        if (m10412b(t)) {
            mo15470c(t, aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo15469b(T t, C3555uj.C3556a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo15470c(T t, C3555uj.C3556a aVar);

    /* renamed from: a */
    public void mo18046a(C2531Sh sh) {
        this.f8644b = sh;
    }
}
