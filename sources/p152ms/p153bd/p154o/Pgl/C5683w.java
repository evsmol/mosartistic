package p152ms.p153bd.p154o.Pgl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.Method;
import p152ms.p153bd.p154o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.w */
final class C5683w extends pblb.pgla {
    C5683w() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo42171a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m14675a().mo42236b();
        if (b != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) b.getSystemService((String) pblk.m14617a(16777217, 0, 0, "6b685f", new byte[]{36, 111, 75, 66, Ascii.f15551SI, 114, 33, 74, 113, 97, 51, 121}));
                Class<?> cls = connectivityManager.getClass();
                Method declaredMethod = cls.getDeclaredMethod((String) pblk.m14617a(16777217, 0, 0, "517402", new byte[]{35, 54, 80, 97, Ascii.f15544FF, 49, 63, 6, 99, 74, 33, 39, 83, 79, Ascii.f15546GS, 46, Ascii.f15554US, Ascii.f15550RS, 96, 107}), new Class[0]);
                declaredMethod.setAccessible(true);
                NetworkInfo networkInfo = (NetworkInfo) declaredMethod.invoke(connectivityManager, new Object[0]);
                if (networkInfo != null) {
                    Method declaredMethod2 = networkInfo.getClass().getDeclaredMethod((String) pblk.m14617a(16777217, 0, 0, "e35ca4", new byte[]{125, 34, 103, 1, 95, 42, 106, 19, 102, 63, 113}), new Class[0]);
                    declaredMethod2.setAccessible(true);
                    return Boolean.valueOf(((Boolean) declaredMethod2.invoke(networkInfo, new Object[0])).booleanValue());
                }
            } catch (Throwable unused) {
            }
        }
        return Boolean.FALSE;
    }
}
