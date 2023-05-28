package com.bytedance.sdk.component.p307b.p308a.p309a.p310a;

import com.bytedance.sdk.component.p307b.p308a.C10457b;
import com.bytedance.sdk.component.p307b.p308a.C10468d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.d */
/* compiled from: NetDispatcher */
public class C10452d extends C10468d {

    /* renamed from: a */
    private ExecutorService f26056a;

    /* renamed from: b */
    private List<C10457b> f26057b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List<C10457b> f26058c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private AtomicInteger f26059d = new AtomicInteger(64);

    public C10452d() {
        if (this.f26056a == null) {
            this.f26056a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    /* renamed from: b */
    public ExecutorService mo63872b() {
        return this.f26056a;
    }

    /* renamed from: a */
    public void mo63871a(int i) {
        this.f26059d.set(i);
    }

    /* renamed from: c */
    public List<C10457b> mo63873c() {
        return this.f26057b;
    }

    /* renamed from: d */
    public List<C10457b> mo63874d() {
        return this.f26058c;
    }

    /* renamed from: a */
    public int mo63870a() {
        return this.f26059d.get();
    }
}
