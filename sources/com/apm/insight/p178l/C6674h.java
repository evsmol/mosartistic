package com.apm.insight.p178l;

import android.os.Process;
import java.io.File;

/* renamed from: com.apm.insight.l.h */
public final class C6674h {
    /* renamed from: a */
    public static int m16514a() {
        int myPid = Process.myPid();
        try {
            return new File("/proc/" + myPid + "/fd").listFiles().length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
