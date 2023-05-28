package com.bytedance.sdk.component.p328f;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.sdk.component.f.h */
/* compiled from: TTThreadFactory */
public class C10619h implements ThreadFactory {

    /* renamed from: a */
    private final ThreadGroup f26504a;

    /* renamed from: b */
    private final String f26505b;

    /* renamed from: c */
    private int f26506c;

    public C10619h(int i, String str) {
        this.f26506c = i;
        this.f26504a = new ThreadGroup("tt_pangle_group_" + str);
        this.f26505b = "tt_pangle_thread_" + str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f26504a, runnable, this.f26505b);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int i = this.f26506c;
        if (i > 10 || i < 1) {
            this.f26506c = 5;
        }
        thread.setPriority(this.f26506c);
        return thread;
    }
}
