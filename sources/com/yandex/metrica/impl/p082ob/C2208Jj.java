package com.yandex.metrica.impl.p082ob;

import android.telephony.CellInfo;
import com.yandex.metrica.impl.p082ob.C3555uj;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Jj */
public class C2208Jj {

    /* renamed from: a */
    private C3010gm f5920a;

    public C2208Jj() {
        this(new C3010gm());
    }

    /* renamed from: a */
    public void mo16048a(CellInfo cellInfo, C3555uj.C3556a aVar) {
        long timeStamp = cellInfo.getTimeStamp();
        Long l = null;
        if (timeStamp > 0) {
            C3010gm gmVar = this.f5920a;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long c = gmVar.mo17644c(timeStamp, timeUnit);
            if (c > 0 && c < TimeUnit.HOURS.toSeconds(1)) {
                l = Long.valueOf(c);
            }
            if (l == null) {
                long a = this.f5920a.mo17642a(timeStamp, timeUnit);
                if (a > 0 && a < TimeUnit.HOURS.toSeconds(1)) {
                    l = Long.valueOf(a);
                }
            }
        }
        aVar.mo18295a(l).mo18297a(cellInfo.isRegistered());
    }

    C2208Jj(C3010gm gmVar) {
        this.f5920a = gmVar;
    }
}
