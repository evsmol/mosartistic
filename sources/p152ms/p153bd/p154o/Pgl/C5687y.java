package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.y */
final class C5687y extends pblb.pgla {
    C5687y() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m14675a().mo42236b();
        ApplicationInfo applicationInfo = b.getPackageManager().getApplicationInfo(b.getPackageName(), 0);
        String str2 = applicationInfo.sourceDir;
        return str2 != null ? str2 : applicationInfo.publicSourceDir;
    }
}
