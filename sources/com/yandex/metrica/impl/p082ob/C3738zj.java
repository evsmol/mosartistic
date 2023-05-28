package com.yandex.metrica.impl.p082ob;

import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import com.yandex.metrica.impl.p082ob.C3555uj;

/* renamed from: com.yandex.metrica.impl.ob.zj */
public class C3738zj extends C3359pj<CellInfoCdma> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15469b(CellInfo cellInfo, C3555uj.C3556a aVar) {
        aVar.mo18309l(Integer.valueOf(((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm()));
        aVar.mo18293a(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15470c(CellInfo cellInfo, C3555uj.C3556a aVar) {
        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
    }
}
