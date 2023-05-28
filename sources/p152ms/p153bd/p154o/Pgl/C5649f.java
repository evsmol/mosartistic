package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.f */
final class C5649f extends pblb.pgla {
    C5649f() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m14675a().mo42236b();
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }
}
