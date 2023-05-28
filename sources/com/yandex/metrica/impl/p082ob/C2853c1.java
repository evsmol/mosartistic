package com.yandex.metrica.impl.p082ob;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.c1 */
class C2853c1 implements Runnable {

    /* renamed from: a */
    private final WeakReference<Handler> f7541a;

    /* renamed from: b */
    private final WeakReference<C1874B> f7542b;

    C2853c1(Handler handler, C1874B b) {
        this.f7541a = new WeakReference<>(handler);
        this.f7542b = new WeakReference<>(b);
    }

    public void run() {
        Handler handler = (Handler) this.f7541a.get();
        C1874B b = (C1874B) this.f7542b.get();
        if (handler != null && b != null && b.mo15494e()) {
            C2817b1.m9079a(handler, b, this);
        }
    }
}
