package com.appodeal.ads.utils;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.appodeal.ads.utils.u */
public final class C9659u implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(10);
        thread.setUncaughtExceptionHandler($$Lambda$syeNCHWyvCzmYC2DgCYYJqsEJvc.INSTANCE);
        return thread;
    }
}
