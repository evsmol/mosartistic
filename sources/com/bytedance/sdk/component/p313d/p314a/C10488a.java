package com.bytedance.sdk.component.p313d.p314a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.d.a.a */
/* compiled from: DefaultThreadFactory */
public class C10488a implements ThreadFactory {

    /* renamed from: a */
    private final ThreadGroup f26145a;

    /* renamed from: b */
    private final AtomicInteger f26146b = new AtomicInteger(1);

    public C10488a(String str) {
        this.f26145a = new ThreadGroup("tt_img_" + str);
    }

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f26145a;
        Thread thread = new Thread(threadGroup, runnable, "tt_img_" + this.f26146b.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
