package com.apm.insight.p167c;

import com.apm.insight.C6617h;
import java.io.File;

/* renamed from: com.apm.insight.c.a */
public class C6583a {
    /* renamed from: a */
    public static void m16113a() {
        File[] listFiles;
        File file = new File(C6617h.m16313g().getFilesDir(), "apminsight/crashCommand");
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    String[] split = file2.getName().split("_");
                    if (split[0].equals(String.valueOf(0))) {
                        m16114a(split);
                    }
                    file2.delete();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static void m16114a(String... strArr) {
    }
}
