package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: ms.bd.o.Pgl.u0 */
public class C5680u0 {

    /* renamed from: a */
    private static int f13037a;

    /* renamed from: a */
    public static String m14691a(Context context) {
        if (context != null) {
            try {
                new DisplayMetrics();
                f13037a = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable unused) {
            }
        }
        return "" + f13037a;
    }
}
