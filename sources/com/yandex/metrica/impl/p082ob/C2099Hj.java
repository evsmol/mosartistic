package com.yandex.metrica.impl.p082ob;

import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.impl.p082ob.C3555uj;

/* renamed from: com.yandex.metrica.impl.ob.Hj */
public class C2099Hj extends C3359pj<CellInfo> {

    /* renamed from: c */
    private final C2319Mj<CellIdentityWcdma> f5543c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2099Hj() {
        this(C1848A2.m6808a(28) ? new C2535Sj() : new C2497Rj());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15469b(CellInfo cellInfo, C3555uj.C3556a aVar) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        aVar.mo18293a(3).mo18298b(Integer.valueOf(cellIdentity.getCid())).mo18300c(Integer.valueOf(cellIdentity.getLac())).mo18308k(Integer.valueOf(cellIdentity.getPsc())).mo18309l(Integer.valueOf(cellInfoWcdma.getCellSignalStrength().getDbm())).mo18306i(this.f5543c.mo16324b(cellIdentity)).mo18307j(this.f5543c.mo16323a(cellIdentity));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15470c(CellInfo cellInfo, C3555uj.C3556a aVar) {
        if (C1848A2.m6808a(24)) {
            aVar.mo18294a(Integer.valueOf(C1930Cj.m6978a(((CellInfoWcdma) cellInfo).getCellIdentity())));
        }
    }

    C2099Hj(C2319Mj<CellIdentityWcdma> mj) {
        this.f5543c = mj;
    }
}
