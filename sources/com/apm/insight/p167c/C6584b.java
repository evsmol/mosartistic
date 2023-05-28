package com.apm.insight.p167c;

import com.apm.insight.C6617h;
import com.apm.insight.runtime.C6718a;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.apm.insight.c.b */
public class C6584b {

    /* renamed from: a */
    private static AtomicBoolean f14129a = new AtomicBoolean(false);

    /* renamed from: a */
    public static boolean m16115a() {
        synchronized (f14129a) {
            if (f14129a.get()) {
                return false;
            }
            f14129a.set(true);
            return m16116b();
        }
    }

    /* renamed from: b */
    public static boolean m16116b() {
        if (!C6718a.m16806h()) {
            return false;
        }
        try {
            File file = new File(C6617h.m16314h().getFilesDir(), "apminsight/crashCommand");
            file.mkdirs();
            new File(file, "0_" + System.currentTimeMillis()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
