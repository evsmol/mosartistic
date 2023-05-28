package com.apm.insight.runtime;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;

/* renamed from: com.apm.insight.runtime.q */
public class C6762q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static long f14526a = -1;

    /* renamed from: com.apm.insight.runtime.q$a */
    public static class C6763a {

        /* renamed from: a */
        private static long f14527a = -1;

        /* renamed from: a */
        public static long m17022a() {
            if (C6762q.f14526a == -1) {
                long unused = C6762q.f14526a = 1000 / m17025b();
            }
            return C6762q.f14526a;
        }

        /* renamed from: a */
        public static long m17023a(long j) {
            long j2 = f14527a;
            if (j2 > 0) {
                return j2;
            }
            long sysconf = Build.VERSION.SDK_INT >= 21 ? Os.sysconf(OsConstants._SC_CLK_TCK) : Build.VERSION.SDK_INT >= 14 ? m17024a("_SC_CLK_TCK", j) : j;
            if (sysconf > 0) {
                j = sysconf;
            }
            f14527a = j;
            return j;
        }

        /* renamed from: a */
        private static long m17024a(String str, long j) {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField(str).getInt((Object) null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                Object obj = cls.getField("os").get((Object) null);
                return ((Long) cls2.getMethod("sysconf", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)})).longValue();
            } catch (Throwable th) {
                th.printStackTrace();
                return j;
            }
        }

        /* renamed from: b */
        public static long m17025b() {
            return m17023a(100);
        }
    }
}
