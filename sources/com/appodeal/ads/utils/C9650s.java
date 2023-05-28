package com.appodeal.ads.utils;

import com.appodeal.ads.C9203h0;
import com.appodeal.ads.utils.exception_handler.C9623a;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appodeal.ads.utils.s */
public final class C9650s implements Executor {

    /* renamed from: b */
    public static final TimeUnit f24446b = TimeUnit.SECONDS;

    /* renamed from: c */
    public static final int f24447c;

    /* renamed from: d */
    public static final int f24448d;

    /* renamed from: e */
    public static C9650s f24449e = new C9650s();

    /* renamed from: a */
    public final ThreadPoolExecutor f24450a;

    /* renamed from: com.appodeal.ads.utils.s$a */
    public static final class C9651a implements RejectedExecutionHandler {
        public C9651a() {
        }

        public /* synthetic */ C9651a(int i) {
            this();
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            StringBuilder a = C9203h0.m27334a("Task ");
            a.append(runnable.toString());
            a.append(" rejected from ");
            a.append(threadPoolExecutor.toString());
            Log.log(new C9623a(a.toString()));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f24447c = Math.max(2, Math.min(availableProcessors - 1, 4));
        f24448d = (availableProcessors * 2) + 1;
    }

    public C9650s() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C9651a aVar = new C9651a(0);
        this.f24450a = new ThreadPoolExecutor(f24447c, f24448d, 1, f24446b, linkedBlockingQueue, new C9659u(), aVar);
    }

    public final void execute(Runnable runnable) {
        this.f24450a.execute(runnable);
    }
}
