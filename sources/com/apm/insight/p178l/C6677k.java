package com.apm.insight.p178l;

import com.apm.insight.p174h.C6618a;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.apm.insight.l.k */
public final class C6677k {
    /* renamed from: a */
    public static void m16550a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m16551a(String str, int i) {
        C6618a.m16325a("android.os.FileUtils", "setPermissions", str, Integer.valueOf(i), -1, -1);
    }

    /* renamed from: a */
    public static void m16552a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }
}
