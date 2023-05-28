package com.bytedance.sdk.component.p313d.p314a;

import com.appnext.ads.fullscreen.RewardedVideo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.d.a.c */
/* compiled from: ThreadPoolFactory */
public class C10491c {

    /* renamed from: a */
    private static final TimeUnit f26148a = TimeUnit.SECONDS;

    /* renamed from: a */
    public static ExecutorService m30641a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30, f26148a, new LinkedBlockingQueue(), new C10488a(RewardedVideo.VIDEO_MODE_DEFAULT));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
