package com.yandex.metrica.impl.p082ob;

import android.telephony.CellIdentityGsm;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import com.yandex.metrica.impl.p082ob.C3555uj;

/* renamed from: com.yandex.metrica.impl.ob.Bj */
public class C1899Bj extends C3359pj<CellInfoGsm> {

    /* renamed from: c */
    private final C2319Mj<CellIdentityGsm> f5123c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1899Bj() {
        this(C1848A2.m6808a(28) ? new C2405Oj() : new C2348Nj());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15469b(CellInfo cellInfo, C3555uj.C3556a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        aVar.mo18293a(1).mo18298b(Integer.valueOf(cellIdentity.getCid())).mo18300c(Integer.valueOf(cellIdentity.getLac())).mo18309l(Integer.valueOf(cellInfoGsm.getCellSignalStrength().getDbm())).mo18306i(this.f5123c.mo16324b(cellIdentity)).mo18307j(this.f5123c.mo16323a(cellIdentity));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15470c(CellInfo cellInfo, C3555uj.C3556a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        if (C1848A2.m6808a(24)) {
            aVar.mo18294a(Integer.valueOf(cellInfoGsm.getCellIdentity().getArfcn()));
        }
    }

    C1899Bj(C2319Mj<CellIdentityGsm> mj) {
        this.f5123c = mj;
    }
}
