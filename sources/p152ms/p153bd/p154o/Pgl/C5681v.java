package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import android.content.Intent;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.v */
final class C5681v extends pblb.pgla {
    C5681v() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m14675a().mo42236b();
        String[] strArr = (String[]) obj;
        if (b == null || str == null || strArr == null || strArr.length % 2 != 0) {
            return null;
        }
        Intent intent = new Intent(str);
        intent.setPackage(b.getPackageName());
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            intent.putExtra(strArr[i2], strArr[i2 + 1]);
        }
        b.sendBroadcast(intent);
        return null;
    }
}
