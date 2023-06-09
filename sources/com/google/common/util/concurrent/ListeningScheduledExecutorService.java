package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public interface ListeningScheduledExecutorService extends ListeningExecutorService, ScheduledExecutorService {

    /* renamed from: com.google.common.util.concurrent.ListeningScheduledExecutorService$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    ListenableScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit);

    <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit);

    ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
