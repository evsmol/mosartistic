package com.apm.insight.p178l;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: com.apm.insight.l.n */
public class C6681n {

    /* renamed from: a */
    static final C6683a f14366a = (Build.VERSION.SDK_INT >= 16 ? new C6684b() : new C6683a());

    /* renamed from: com.apm.insight.l.n$a */
    private static class C6683a {
        private C6683a() {
        }

        /* renamed from: a */
        public long mo52174a(ActivityManager.MemoryInfo memoryInfo) {
            return 0;
        }
    }

    /* renamed from: com.apm.insight.l.n$b */
    private static class C6684b extends C6683a {
        private C6684b() {
            super();
        }

        /* renamed from: a */
        public long mo52174a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    /* renamed from: a */
    public static long m16581a(ActivityManager.MemoryInfo memoryInfo) {
        return f14366a.mo52174a(memoryInfo);
    }
}
