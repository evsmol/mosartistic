package com.yandex.metrica.impl.p082ob;

import android.content.ComponentName;
import android.content.Context;
import com.yandex.metrica.PreloadInfoContentProvider;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Y */
public final class C2728Y {

    /* renamed from: a */
    private static volatile CountDownLatch f7213a;

    /* renamed from: b */
    private static volatile PreloadInfoContentProvider f7214b;

    /* renamed from: a */
    public static final void m8906a(PreloadInfoContentProvider preloadInfoContentProvider) {
        f7213a = new CountDownLatch(1);
        f7214b = preloadInfoContentProvider;
    }

    /* renamed from: a */
    public static final void m8904a() {
        CountDownLatch countDownLatch = f7213a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* renamed from: a */
    public static final void m8905a(Context context) {
        CountDownLatch countDownLatch = f7213a;
        if (countDownLatch != null) {
            countDownLatch.await(1, TimeUnit.SECONDS);
            try {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, PreloadInfoContentProvider.class), 2, 1);
                PreloadInfoContentProvider preloadInfoContentProvider = f7214b;
                if (preloadInfoContentProvider != null) {
                    preloadInfoContentProvider.disable();
                }
            } catch (Throwable unused) {
            }
            f7213a = null;
        }
    }
}
