package com.yandex.metrica.impl.p082ob;

import android.os.HandlerThread;
import com.yandex.metrica.core.api.executors.IInterruptionSafeThread;

/* renamed from: com.yandex.metrica.impl.ob.Km */
public class C2251Km extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a */
    private volatile boolean f5984a = true;

    public C2251Km(String str) {
        super(str);
    }

    public synchronized boolean isRunning() {
        return this.f5984a;
    }

    public synchronized void stopRunning() {
        this.f5984a = false;
        interrupt();
    }
}
