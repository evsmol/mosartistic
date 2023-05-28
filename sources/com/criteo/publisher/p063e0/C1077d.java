package com.criteo.publisher.p063e0;

import com.criteo.publisher.C1321s;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.criteo.publisher.e0.d */
/* compiled from: ThreadPoolExecutorFactory */
public class C1077d implements C1321s.C1322a<ThreadPoolExecutor> {
    /* renamed from: b */
    public ThreadPoolExecutor mo2934a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 20, 3, TimeUnit.SECONDS, new SynchronousQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.setRejectedExecutionHandler(new C1079b());
        return threadPoolExecutor;
    }

    /* renamed from: com.criteo.publisher.e0.d$b */
    /* compiled from: ThreadPoolExecutorFactory */
    private static class C1079b implements RejectedExecutionHandler {

        /* renamed from: a */
        private ThreadPoolExecutor f3503a;

        private C1079b() {
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.f3503a == null) {
                    this.f3503a = new ThreadPoolExecutor(5, 5, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                }
            }
            this.f3503a.execute(runnable);
        }
    }
}
