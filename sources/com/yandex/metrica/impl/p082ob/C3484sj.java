package com.yandex.metrica.impl.p082ob;

import android.telephony.CellInfo;
import com.yandex.metrica.impl.p082ob.C3555uj;

/* renamed from: com.yandex.metrica.impl.ob.sj */
public class C3484sj implements C2284Lj {

    /* renamed from: a */
    private final C3708yj f9113a;

    /* renamed from: b */
    private final C3671xj f9114b;

    public C3484sj() {
        this(new C3708yj(), new C3671xj());
    }

    /* renamed from: a */
    public void mo16584a(C2531Sh sh) {
        this.f9113a.mo16584a(sh);
    }

    C3484sj(C3708yj yjVar, C3671xj xjVar) {
        this.f9113a = yjVar;
        this.f9114b = xjVar;
    }

    /* renamed from: a */
    public C3555uj mo16224a(CellInfo cellInfo) {
        C3555uj.C3556a aVar = new C3555uj.C3556a();
        this.f9113a.mo18433a(cellInfo, aVar);
        return this.f9114b.mo18414a(new C3555uj(aVar));
    }
}
