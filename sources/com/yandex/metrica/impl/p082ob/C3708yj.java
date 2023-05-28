package com.yandex.metrica.impl.p082ob;

import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.impl.p082ob.C3555uj;

/* renamed from: com.yandex.metrica.impl.ob.yj */
public class C3708yj implements C2501S {

    /* renamed from: a */
    private final C2208Jj f9530a;

    /* renamed from: b */
    private final C3359pj<CellInfoGsm> f9531b;

    /* renamed from: c */
    private final C3359pj<CellInfoCdma> f9532c;

    /* renamed from: d */
    private final C3359pj<CellInfoLte> f9533d;

    /* renamed from: e */
    private final C3359pj<CellInfo> f9534e;

    /* renamed from: f */
    private final C2501S[] f9535f;

    public C3708yj() {
        this(new C1869Aj());
    }

    /* renamed from: a */
    public void mo18433a(CellInfo cellInfo, C3555uj.C3556a aVar) {
        this.f9530a.mo16048a(cellInfo, aVar);
        if (cellInfo instanceof CellInfoGsm) {
            this.f9531b.mo15468a((CellInfoGsm) cellInfo, aVar);
        } else if (cellInfo instanceof CellInfoCdma) {
            this.f9532c.mo15468a((CellInfoCdma) cellInfo, aVar);
        } else if (cellInfo instanceof CellInfoLte) {
            this.f9533d.mo15468a((CellInfoLte) cellInfo, aVar);
        } else if (C1848A2.m6808a(18) && (cellInfo instanceof CellInfoWcdma)) {
            this.f9534e.mo15468a((CellInfoWcdma) cellInfo, aVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C3708yj(C3359pj<CellInfo> pjVar) {
        this(new C2208Jj(), new C1899Bj(), new C3738zj(), new C2065Gj(), C1848A2.m6808a(18) ? new C2099Hj() : pjVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.yandex.metrica.impl.ob.S[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C3708yj(com.yandex.metrica.impl.p082ob.C2208Jj r2, com.yandex.metrica.impl.p082ob.C3359pj<android.telephony.CellInfoGsm> r3, com.yandex.metrica.impl.p082ob.C3359pj<android.telephony.CellInfoCdma> r4, com.yandex.metrica.impl.p082ob.C3359pj<android.telephony.CellInfoLte> r5, com.yandex.metrica.impl.p082ob.C3359pj<android.telephony.CellInfo> r6) {
        /*
            r1 = this;
            r1.<init>()
            r1.f9530a = r2
            r1.f9531b = r3
            r1.f9532c = r4
            r1.f9533d = r5
            r1.f9534e = r6
            r2 = 4
            com.yandex.metrica.impl.ob.S[] r2 = new com.yandex.metrica.impl.p082ob.C2501S[r2]
            r0 = 0
            r2[r0] = r3
            r3 = 1
            r2[r3] = r4
            r3 = 2
            r2[r3] = r6
            r3 = 3
            r2[r3] = r5
            r1.f9535f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3708yj.<init>(com.yandex.metrica.impl.ob.Jj, com.yandex.metrica.impl.ob.pj, com.yandex.metrica.impl.ob.pj, com.yandex.metrica.impl.ob.pj, com.yandex.metrica.impl.ob.pj):void");
    }

    /* renamed from: a */
    public void mo16584a(C2531Sh sh) {
        for (C2501S a : this.f9535f) {
            a.mo16584a(sh);
        }
    }
}
