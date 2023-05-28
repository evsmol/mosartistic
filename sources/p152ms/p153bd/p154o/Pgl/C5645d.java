package p152ms.p153bd.p154o.Pgl;

import java.io.File;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.d */
final class C5645d extends pblb.pgla {
    C5645d() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        File file = new File(pgla.m14675a().mo42236b().getFilesDir(), (String) pblk.m14617a(16777217, 0, 0, "d556c6", new byte[]{59, 58, 85, 70, 93, 53, 102}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }
}
