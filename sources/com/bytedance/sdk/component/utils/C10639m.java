package com.bytedance.sdk.component.utils;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: com.bytedance.sdk.component.utils.m */
/* compiled from: MemorySize */
public class C10639m {
    /* renamed from: a */
    public static long m31243a() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }
}
