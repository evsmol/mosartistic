package p152ms.p153bd.p154o.Pgl;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Locale;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.j0 */
final class C5658j0 extends pblb.pgla {
    C5658j0() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        String str2;
        try {
            Locale locale = pgla.m14675a().mo42236b().getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append((String) pblk.m14617a(16777217, 0, 0, "4a3a24", new byte[]{Ascii.SUB}));
            sb.append(country);
            str2 = sb.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        return C5690z0.m14710a(str2);
    }
}
