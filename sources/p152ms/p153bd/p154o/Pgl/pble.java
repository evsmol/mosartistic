package p152ms.p153bd.p154o.Pgl;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pble */
final class pble extends pblb.pgla {
    pble() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        File file = new File(pgla.m14675a().mo42236b().getFilesDir(), (String) pblk.m14617a(16777217, 0, 0, "304015", new byte[]{108, 63, 84, 64, Ascii.f15551SI, 54, 49}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }
}
