package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblc */
final class pblc extends pblb.pgla {
    pblc() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        try {
            Context b = pgla.m14675a().mo42236b();
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            String str2 = (String) pblk.m14617a(16777217, 0, 0, "b2bafb", new byte[]{122, 57});
            return "";
        }
    }
}
