package p152ms.p153bd.p154o.Pgl;

import android.telephony.TelephonyManager;
import com.applovin.exoplayer2.common.base.Ascii;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.o */
final class C5667o extends pblb.pgla {
    C5667o() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        Boolean bool = Boolean.FALSE;
        TelephonyManager telephonyManager = (TelephonyManager) pgla.m14675a().mo42236b().getApplicationContext().getSystemService((String) pblk.m14617a(16777217, 0, 0, "9f4f2e", new byte[]{56, 108, 72, Ascii.f15545FS, 8}));
        return (telephonyManager == null || telephonyManager.getSimState() != 5) ? bool : Boolean.TRUE;
    }
}
