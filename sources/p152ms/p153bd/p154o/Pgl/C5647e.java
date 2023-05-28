package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.e */
final class C5647e extends pblb.pgla {
    C5647e() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        int i2;
        Context b = pgla.m14675a().mo42236b();
        try {
            i2 = b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            i2 = -1;
        }
        return Integer.valueOf(i2);
    }
}
