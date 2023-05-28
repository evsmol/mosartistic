package com.yandex.metrica.impl.p082ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.X1 */
public final class C2699X1 {

    /* renamed from: a */
    private static final C1877B0 f7108a = new C1877B0();

    /* renamed from: b */
    private static final String[] f7109b = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    /* renamed from: a */
    public static int m8824a() {
        return (m8825b() || m8826c()) ? 1 : 0;
    }

    /* renamed from: b */
    public static boolean m8825b() {
        File file;
        try {
            if (C1848A2.m6808a(21)) {
                file = new File("/system/app/Superuser/Superuser.apk");
            } else {
                file = new File("/system/app/Superuser.apk");
            }
            return file.exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m8826c() {
        boolean z;
        String[] strArr = f7109b;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                if (!C1848A2.m6808a(31)) {
                    z = new File(str + "su").exists();
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
                i++;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
