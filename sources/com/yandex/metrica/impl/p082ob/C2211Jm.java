package com.yandex.metrica.impl.p082ob;

import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Jm */
public class C2211Jm implements IHandlerExecutor {

    /* renamed from: a */
    private final Looper f5922a;

    /* renamed from: b */
    private final Handler f5923b;

    /* renamed from: c */
    private final C2251Km f5924c;

    public C2211Jm(String str) {
        this(m7588a(str));
    }

    /* renamed from: a */
    private static C2251Km m7588a(String str) {
        C2251Km b = new C2322Mm(str).mo16325b();
        b.start();
        return b;
    }

    public void execute(Runnable runnable) {
        this.f5923b.post(runnable);
    }

    public void executeDelayed(Runnable runnable, long j) {
        this.f5923b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    public Handler getHandler() {
        return this.f5923b;
    }

    public Looper getLooper() {
        return this.f5922a;
    }

    public boolean isRunning() {
        return this.f5924c.isRunning();
    }

    public void remove(Runnable runnable) {
        this.f5923b.removeCallbacks(runnable);
    }

    public void removeAll() {
        this.f5923b.removeCallbacksAndMessages((Object) null);
    }

    public void stopRunning() {
        this.f5924c.stopRunning();
    }

    public <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f5923b.post(futureTask);
        return futureTask;
    }

    C2211Jm(C2251Km km) {
        this(km, km.getLooper(), new Handler(km.getLooper()));
    }

    public C2211Jm(C2251Km km, Looper looper, Handler handler) {
        this.f5924c = km;
        this.f5922a = looper;
        this.f5923b = handler;
    }

    public void executeDelayed(Runnable runnable, long j, TimeUnit timeUnit) {
        this.f5923b.postDelayed(runnable, timeUnit.toMillis(j));
    }
}
