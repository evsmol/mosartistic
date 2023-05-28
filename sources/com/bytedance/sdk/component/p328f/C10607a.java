package com.bytedance.sdk.component.p328f;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10638l;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.f.a */
/* compiled from: ADThreadPoolExecutor */
class C10607a extends ThreadPoolExecutor {

    /* renamed from: a */
    private String f26462a;

    public C10607a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f26462a = str;
    }

    /* renamed from: a */
    private void m31135a(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e) {
            m31136a(runnable, e);
        } catch (Throwable th) {
            m31137a(runnable, th);
        }
    }

    /* renamed from: a */
    private void m31136a(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        m31137a(runnable, (Throwable) outOfMemoryError);
    }

    /* renamed from: a */
    private void m31137a(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                C10638l.m31239c("", "try exc failed", th2);
            }
        }
    }

    /* renamed from: a */
    private void m31138a(BlockingQueue<Runnable> blockingQueue, int i) {
        if (getCorePoolSize() != i && blockingQueue != null && blockingQueue.size() <= 0) {
            try {
                setCorePoolSize(i);
                C10638l.m31231a("ADThreadPoolExecutor", "reduceCoreThreadSize: reduce poolType =  ", this.f26462a, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
            } catch (Exception e) {
                C10638l.m31238c("ADThreadPoolExecutor", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m31139a(BlockingQueue<Runnable> blockingQueue, int i, int i2) {
        if (getCorePoolSize() != i && blockingQueue != null && blockingQueue.size() >= i2) {
            try {
                setCorePoolSize(i);
                C10638l.m31231a("ADThreadPoolExecutor", "increaseCoreThreadSize: increase poolType =  ", this.f26462a, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
            } catch (Exception e) {
                C10638l.m31238c("ADThreadPoolExecutor", e.getMessage());
            }
        }
    }

    public void execute(final Runnable runnable) {
        BlockingQueue queue;
        if (runnable instanceof C10618g) {
            m31135a(new C10611b((C10618g) runnable, this));
        } else {
            m31135a(new C10611b(new C10618g(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN) {
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (C10615e.m31170e() && !TextUtils.isEmpty(this.f26462a) && (queue = getQueue()) != null) {
            String str = this.f26462a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3366) {
                if (hashCode != 107332) {
                    if (hashCode == 2993840 && str.equals("aidl")) {
                        c = 1;
                    }
                } else if (str.equals("log")) {
                    c = 2;
                }
            } else if (str.equals("io")) {
                c = 0;
            }
            if (c == 0) {
                m31139a(queue, C10615e.f26491a + 2, getCorePoolSize() * 2);
            } else if (c == 1) {
                m31139a(queue, 5, 5);
            } else if (c == 2) {
                m31139a(queue, 6, 6);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue queue;
        super.afterExecute(runnable, th);
        if (C10615e.m31170e() && !TextUtils.isEmpty(this.f26462a) && (queue = getQueue()) != null) {
            String str = this.f26462a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3366) {
                if (hashCode != 107332) {
                    if (hashCode == 2993840 && str.equals("aidl")) {
                        c = 1;
                    }
                } else if (str.equals("log")) {
                    c = 2;
                }
            } else if (str.equals("io")) {
                c = 0;
            }
            if (c == 0) {
                m31138a((BlockingQueue<Runnable>) queue, 4);
            } else if (c == 1) {
                m31138a((BlockingQueue<Runnable>) queue, 2);
            } else if (c == 2) {
                m31138a((BlockingQueue<Runnable>) queue, 2);
            }
        }
    }

    public List<Runnable> shutdownNow() {
        if ("io".equals(this.f26462a) || "aidl".equals(this.f26462a)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    public void shutdown() {
        if (!"io".equals(this.f26462a) && !"aidl".equals(this.f26462a)) {
            super.shutdown();
        }
    }

    /* renamed from: a */
    public String mo64226a() {
        return this.f26462a;
    }

    /* renamed from: com.bytedance.sdk.component.f.a$a */
    /* compiled from: ADThreadPoolExecutor */
    public static class C10609a {

        /* renamed from: a */
        private String f26465a = "io";

        /* renamed from: b */
        private int f26466b = 1;

        /* renamed from: c */
        private long f26467c = 30;

        /* renamed from: d */
        private TimeUnit f26468d = TimeUnit.SECONDS;

        /* renamed from: e */
        private int f26469e = Integer.MAX_VALUE;

        /* renamed from: f */
        private BlockingQueue<Runnable> f26470f = null;

        /* renamed from: g */
        private ThreadFactory f26471g = null;

        /* renamed from: h */
        private RejectedExecutionHandler f26472h;

        /* renamed from: i */
        private int f26473i = 5;

        /* renamed from: a */
        public C10609a mo64234a(String str) {
            this.f26465a = str;
            return this;
        }

        /* renamed from: a */
        public C10609a mo64232a(int i) {
            this.f26466b = i;
            return this;
        }

        /* renamed from: a */
        public C10609a mo64233a(long j) {
            this.f26467c = j;
            return this;
        }

        /* renamed from: a */
        public C10609a mo64237a(TimeUnit timeUnit) {
            this.f26468d = timeUnit;
            return this;
        }

        /* renamed from: a */
        public C10609a mo64235a(BlockingQueue<Runnable> blockingQueue) {
            this.f26470f = blockingQueue;
            return this;
        }

        /* renamed from: a */
        public C10609a mo64236a(RejectedExecutionHandler rejectedExecutionHandler) {
            this.f26472h = rejectedExecutionHandler;
            return this;
        }

        /* renamed from: b */
        public C10609a mo64239b(int i) {
            this.f26473i = i;
            return this;
        }

        /* renamed from: a */
        public C10607a mo64238a() {
            if (this.f26471g == null) {
                this.f26471g = new C10619h(this.f26473i, this.f26465a);
            }
            if (this.f26472h == null) {
                this.f26472h = C10615e.m31171f();
            }
            if (this.f26470f == null) {
                this.f26470f = new LinkedBlockingQueue();
            }
            return new C10607a(this.f26465a, this.f26466b, this.f26469e, this.f26467c, this.f26468d, this.f26470f, this.f26471g, this.f26472h);
        }
    }
}
