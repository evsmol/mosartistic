package com.appodeal.ads;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.appodeal.ads.h5 */
public final class C9212h5 {

    /* renamed from: a */
    public static final Handler f23153a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m27349a(Runnable runnable) {
        f23153a.post(runnable);
    }

    /* renamed from: a */
    public static void m27350a(Runnable runnable, long j) {
        f23153a.postDelayed(runnable, j);
    }
}
