package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblj */
public final class pblj {
    /* renamed from: a */
    public static void m14614a() {
        pblb.m14603a(65537, (pblb.pgla) new pblc());
        pblb.m14603a(65538, (pblb.pgla) new pbld());
        pblb.m14603a(65539, (pblb.pgla) new pble());
        pblb.m14603a(65540, (pblb.pgla) new pblf());
        pblb.m14603a(65541, (pblb.pgla) new pblg());
        pblb.m14603a(65542, (pblb.pgla) new pblh());
        pblb.m14603a(65543, (pblb.pgla) new pbli());
        pblb.pgla pbla = pbly.m14668b() ? new pbla() : new pblp();
        pblb.m14603a(196609, pbla);
        pblb.m14603a(196610, pbla);
        pblb.m14603a(196611, pbla);
        pblm pbln = pbly.m14666a() ? new pbln() : new pbll();
        pblm.m14624a(pbln);
        pblb.m14603a(131073, (pblb.pgla) pbln);
        pblb.m14603a(131074, (pblb.pgla) pbln);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m14616b(Context context, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        try {
            String[] list = context.getAssets().list(str3);
            if (list.length > 0) {
                new File(str4).mkdirs();
                for (String str5 : list) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append((String) pblk.m14617a(16777217, 0, 0, "706181", new byte[]{105}));
                    sb.append(str5);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str4);
                    sb3.append((String) pblk.m14617a(16777217, 0, 0, "f9c19e", new byte[]{56}));
                    sb3.append(str5);
                    m14616b(context, sb2, sb3.toString());
                }
                return true;
            }
            throw null;
        } catch (Exception unused) {
            String str6 = (String) pblk.m14617a(16777217, 0, 0, "ab003d", new byte[]{115, 97, 69});
            return false;
        } catch (Throwable th) {
            Throwable th2 = th;
            pblz.m14673a((Closeable) null);
            pblz.m14673a((Closeable) null);
            throw th2;
        }
    }
}
