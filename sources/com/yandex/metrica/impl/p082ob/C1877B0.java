package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.coreutils.p080io.FileUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.B0 */
public class C1877B0 {
    /* renamed from: a */
    public File mo15519a(Context context, String str) {
        File storageDirectory = FileUtils.getStorageDirectory(context);
        if (storageDirectory == null) {
            return null;
        }
        return new File(storageDirectory, str);
    }

    /* renamed from: b */
    public String mo15523b(Context context, String str) {
        File storageDirectory = FileUtils.getStorageDirectory(context);
        if (storageDirectory == null) {
            return null;
        }
        return storageDirectory.getAbsolutePath() + "/" + str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r0 != null) goto L_0x0031;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File mo15524c(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "persist.yndx.metrica.db.dir"
            java.lang.String r1 = "android.os.SystemProperties"
            r2 = 0
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ Exception -> 0x002f }
            r4 = 1
            java.lang.Class r1 = java.lang.Class.forName(r1, r4, r3)     // Catch:{ Exception -> 0x002f }
            java.lang.String r3 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x002f }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x002f }
            java.lang.reflect.Method r3 = r1.getMethod(r3, r5)     // Catch:{ Exception -> 0x002f }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x002f }
            r4[r7] = r0     // Catch:{ Exception -> 0x002f }
            java.lang.Object r0 = r3.invoke(r1, r4)     // Catch:{ Exception -> 0x002f }
            boolean r1 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x002f }
            if (r1 != 0) goto L_0x002a
            r0 = r2
        L_0x002a:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x002f }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            java.lang.String r0 = ""
        L_0x0031:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0038
            return r2
        L_0x0038:
            java.io.File r1 = new java.io.File
            java.lang.String r9 = r9.getPackageName()
            r1.<init>(r0, r9)
            r1.mkdirs()     // Catch:{ Exception -> 0x0045 }
            return r1
        L_0x0045:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C1877B0.mo15524c(android.content.Context):java.io.File");
    }

    /* renamed from: a */
    public File mo15520a(File file, String str) {
        if (file == null) {
            return null;
        }
        return mo15522b(file.getAbsoluteFile(), str);
    }

    /* renamed from: b */
    public File mo15521b(Context context) {
        return mo15519a(context, "YandexMetricaNativeCrashes");
    }

    /* renamed from: a */
    public File mo15518a(Context context) {
        File file;
        if (C1848A2.m6808a(24)) {
            file = context.getDataDir();
        } else {
            File filesDir = context.getFilesDir();
            if (filesDir == null) {
                file = null;
            } else {
                file = filesDir.getParentFile();
            }
        }
        if (file == null) {
            return null;
        }
        File file2 = new File(file, "lib");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    /* renamed from: b */
    public File mo15522b(File file, String str) {
        if (file == null) {
            return null;
        }
        return new File(file, str);
    }
}
