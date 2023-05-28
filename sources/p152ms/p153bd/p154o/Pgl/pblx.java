package p152ms.p153bd.p154o.Pgl;

import p152ms.p153bd.p154o.Pgl.pblu;

/* renamed from: ms.bd.o.Pgl.pblx */
final class pblx implements pblu.pblb {
    pblx() {
    }

    /* renamed from: a */
    public String mo42231a(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }
}
