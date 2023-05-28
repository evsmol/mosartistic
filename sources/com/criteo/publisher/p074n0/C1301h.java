package com.criteo.publisher.p074n0;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.criteo.publisher.n0.h */
/* compiled from: CompletableFuture */
public class C1301h<T> implements Future<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final AtomicReference<C1304c<T>> f4019a = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final CountDownLatch f4020b = new CountDownLatch(1);

    /* renamed from: c */
    private final FutureTask<T> f4021c = new FutureTask<>(new C1303b());

    /* renamed from: b */
    public static <T> C1301h<T> m5765b(T t) {
        C1301h<T> hVar = new C1301h<>();
        hVar.mo3647a(t);
        return hVar;
    }

    /* renamed from: a */
    public void mo3647a(T t) {
        this.f4019a.compareAndSet((Object) null, new C1304c(t));
        this.f4020b.countDown();
    }

    public boolean cancel(boolean z) {
        return this.f4021c.cancel(z);
    }

    public boolean isCancelled() {
        return this.f4021c.isCancelled();
    }

    public boolean isDone() {
        return this.f4021c.isDone();
    }

    public T get() throws InterruptedException, ExecutionException {
        this.f4021c.run();
        return this.f4021c.get();
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        this.f4021c.run();
        return this.f4021c.get(j, timeUnit);
    }

    /* renamed from: com.criteo.publisher.n0.h$b */
    /* compiled from: CompletableFuture */
    private class C1303b implements Callable<T> {
        private C1303b() {
        }

        public T call() throws Exception {
            C1301h.this.f4020b.await();
            return ((C1304c) C1301h.this.f4019a.get()).mo3654a();
        }
    }

    /* renamed from: com.criteo.publisher.n0.h$c */
    /* compiled from: CompletableFuture */
    private static final class C1304c<T> {

        /* renamed from: a */
        private final T f4023a;

        /* renamed from: b */
        private final Exception f4024b = null;

        C1304c(T t) {
            this.f4023a = t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public T mo3654a() throws Exception {
            Exception exc = this.f4024b;
            if (exc == null) {
                return this.f4023a;
            }
            throw exc;
        }
    }
}
