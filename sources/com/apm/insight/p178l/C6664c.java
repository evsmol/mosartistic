package com.apm.insight.p178l;

import android.os.Build;
import android.os.Debug;

/* renamed from: com.apm.insight.l.c */
public class C6664c {

    /* renamed from: a */
    static final C6666a f14348a = (Build.VERSION.SDK_INT >= 19 ? new C6667b() : new C6666a());

    /* renamed from: com.apm.insight.l.c$a */
    private static class C6666a {
        private C6666a() {
        }

        /* renamed from: a */
        public int mo52158a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: b */
        public int mo52159b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: c */
        public int mo52160c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }
    }

    /* renamed from: com.apm.insight.l.c$b */
    private static class C6667b extends C6666a {
        private C6667b() {
            super();
        }

        /* renamed from: a */
        public int mo52158a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        /* renamed from: b */
        public int mo52159b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        /* renamed from: c */
        public int mo52160c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    /* renamed from: a */
    public static int m16486a(Debug.MemoryInfo memoryInfo) {
        return f14348a.mo52158a(memoryInfo);
    }

    /* renamed from: b */
    public static int m16487b(Debug.MemoryInfo memoryInfo) {
        return f14348a.mo52159b(memoryInfo);
    }

    /* renamed from: c */
    public static int m16488c(Debug.MemoryInfo memoryInfo) {
        return f14348a.mo52160c(memoryInfo);
    }
}
