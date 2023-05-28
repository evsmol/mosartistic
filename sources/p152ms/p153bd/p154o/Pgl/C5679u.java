package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import android.content.SharedPreferences;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.u */
final class C5679u extends pblb.pgla {
    C5679u() {
    }

    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m14675a().mo42236b();
        String[] split = str.split((String) pblk.m14617a(16777217, 0, 0, "cea70a", new byte[]{78, 123}));
        String str2 = split[0];
        String str3 = split[1];
        SharedPreferences.Editor edit = b.getSharedPreferences(str2, 0).edit();
        edit.putString(str3, (String) obj);
        edit.commit();
        return null;
    }
}
