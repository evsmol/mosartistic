package com.bytedance.sdk.component.p323e.p327d;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.e.d.f */
/* compiled from: ProcessUtils */
public class C10604f {

    /* renamed from: a */
    private static String f26460a;

    /* renamed from: a */
    public static boolean m31131a(Context context) {
        String c = m31133c(context);
        return c != null && (c.endsWith(":push") || c.endsWith(":pushservice"));
    }

    /* renamed from: b */
    public static boolean m31132b(Context context) {
        String c = m31133c(context);
        if ((c == null || !c.contains(":")) && c != null && c.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static String m31133c(Context context) {
        String str = f26460a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    String str2 = next.processName;
                    f26460a = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a = m31130a();
        f26460a = a;
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC, Splitter:B:17:0x0049] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m31130a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0046 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0046 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r4.<init>()     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch:{ all -> 0x0046 }
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x0046 }
            r4.append(r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0046 }
            r3.<init>(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0046 }
            r1.<init>(r2)     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r2.<init>()     // Catch:{ all -> 0x0044 }
        L_0x0031:
            int r3 = r1.read()     // Catch:{ all -> 0x0044 }
            if (r3 <= 0) goto L_0x003c
            char r3 = (char) r3     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0031
        L_0x003c:
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0044 }
            r1.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return r0
        L_0x0044:
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p323e.p327d.C10604f.m31130a():java.lang.String");
    }
}
