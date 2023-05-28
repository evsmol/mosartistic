package p152ms.p153bd.p154o.Pgl;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: ms.bd.o.Pgl.pblw */
class pblw implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ String f13016a;

    pblw(pblv pblv, String str) {
        this.f13016a = str;
    }

    public boolean accept(File file, String str) {
        return str.startsWith(this.f13016a);
    }
}
