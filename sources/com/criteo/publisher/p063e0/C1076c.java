package com.criteo.publisher.p063e0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.criteo.publisher.e0.c */
/* compiled from: RunOnUiThreadExecutor */
public class C1076c implements Executor {

    /* renamed from: a */
    private final Handler f3502a = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f3502a.getLooper().getThread()) {
            runnable.run();
        } else {
            this.f3502a.post(runnable);
        }
    }

    /* renamed from: a */
    public void mo3126a(Runnable runnable) {
        this.f3502a.post(runnable);
    }
}
