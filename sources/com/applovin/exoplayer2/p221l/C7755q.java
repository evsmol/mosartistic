package com.applovin.exoplayer2.p221l;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: com.applovin.exoplayer2.l.q */
public final class C7755q {

    /* renamed from: a */
    private static int f18301a = 0;

    /* renamed from: b */
    private static boolean f18302b = true;

    /* renamed from: a */
    private static String m22354a(String str, Throwable th) {
        String a = m22355a(th);
        if (TextUtils.isEmpty(a)) {
            return str;
        }
        return str + "\n  " + a.replace("\n", "\n  ") + 10;
    }

    /* renamed from: a */
    public static String m22355a(Throwable th) {
        if (th == null) {
            return null;
        }
        return m22360b(th) ? "UnknownHostException (no network)" : !f18302b ? th.getMessage() : Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    /* renamed from: a */
    public static void m22356a(String str, String str2) {
        if (f18301a == 0) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m22357a(String str, String str2, Throwable th) {
        m22358b(str, m22354a(str2, th));
    }

    /* renamed from: b */
    public static void m22358b(String str, String str2) {
        if (f18301a <= 1) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m22359b(String str, String str2, Throwable th) {
        m22361c(str, m22354a(str2, th));
    }

    /* renamed from: b */
    private static boolean m22360b(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: c */
    public static void m22361c(String str, String str2) {
        if (f18301a <= 2) {
            Log.w(str, str2);
        }
    }

    /* renamed from: c */
    public static void m22362c(String str, String str2, Throwable th) {
        m22363d(str, m22354a(str2, th));
    }

    /* renamed from: d */
    public static void m22363d(String str, String str2) {
        if (f18301a <= 3) {
            Log.e(str, str2);
        }
    }
}
