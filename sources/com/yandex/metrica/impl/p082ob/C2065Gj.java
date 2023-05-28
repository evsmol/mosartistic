package com.yandex.metrica.impl.p082ob;

import android.telephony.CellIdentityLte;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import com.yandex.metrica.impl.p082ob.C3555uj;

/* renamed from: com.yandex.metrica.impl.ob.Gj */
public class C2065Gj extends C3359pj<CellInfoLte> {

    /* renamed from: c */
    private final C2319Mj<CellIdentityLte> f5462c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2065Gj() {
        this(C1848A2.m6808a(28) ? new C2464Qj() : new C2438Pj());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15469b(CellInfo cellInfo, C3555uj.C3556a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        aVar.mo18293a(4).mo18298b(Integer.valueOf(cellIdentity.getCi())).mo18300c(Integer.valueOf(cellIdentity.getTac())).mo18308k(Integer.valueOf(cellIdentity.getPci())).mo18309l(Integer.valueOf(cellInfoLte.getCellSignalStrength().getDbm())).mo18306i(this.f5462c.mo16324b(cellIdentity)).mo18307j(this.f5462c.mo16323a(cellIdentity));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15470c(CellInfo cellInfo, C3555uj.C3556a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        if (C1848A2.m6808a(24)) {
            aVar.mo18294a(Integer.valueOf(C1930Cj.m6977a(cellInfoLte.getCellIdentity())));
        }
        if (C1848A2.m6808a(26)) {
            aVar.mo18303f(Integer.valueOf(C1962Dj.m7035b(cellInfoLte.getCellSignalStrength())));
            aVar.mo18305h(Integer.valueOf(C1962Dj.m7036c(cellInfoLte.getCellSignalStrength())));
            aVar.mo18302e(Integer.valueOf(C1962Dj.m7034a(cellInfoLte.getCellSignalStrength())));
        }
        if (C1848A2.m6808a(28)) {
            aVar.mo18301d(Integer.valueOf(C1999Ej.m7145a(cellInfoLte.getCellIdentity())));
        }
        if (C1848A2.m6808a(29)) {
            aVar.mo18304g(Integer.valueOf(C2031Fj.m7216a(cellInfoLte.getCellSignalStrength())));
        }
    }

    C2065Gj(C2319Mj<CellIdentityLte> mj) {
        this.f5462c = mj;
    }
}
