package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import android.content.pm.Signature;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.n */
final class C5665n extends pblb.pgla {
    C5665n() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m14675a().mo42236b();
        Signature[] signatureArr = b.getPackageManager().getPackageInfo(b.getPackageName(), 64).signatures;
        if (signatureArr == null || signatureArr.length <= 0) {
            return null;
        }
        return signatureArr[0].toByteArray();
    }
}
