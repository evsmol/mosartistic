package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.executors.IInterruptionSafeThread;

/* renamed from: com.yandex.metrica.impl.ob.Lm */
public class C2288Lm extends Thread implements IInterruptionSafeThread {

    /* renamed from: a */
    private volatile boolean f6127a = true;

    public C2288Lm() {
    }

    public synchronized boolean isRunning() {
        return this.f6127a;
    }

    public synchronized void stopRunning() {
        this.f6127a = false;
        interrupt();
    }

    public C2288Lm(Runnable runnable, String str) {
        super(runnable, str);
    }

    public C2288Lm(String str) {
        super(str);
    }
}
