package com.apm.insight.p178l;

/* renamed from: com.apm.insight.l.x */
public final class C6696x {
    /* renamed from: a */
    public static Thread m16692a(Runnable runnable, String str) {
        if (runnable == null) {
            return null;
        }
        Thread thread = str == null ? new Thread(runnable) : new Thread(runnable, str);
        thread.start();
        return thread;
    }
}
